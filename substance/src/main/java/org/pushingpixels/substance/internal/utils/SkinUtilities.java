/*
 * Copyright (c) 2005-2018 Substance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 *  o Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer. 
 *     
 *  o Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution. 
 *     
 *  o Neither the name of Substance Kirill Grouchnikov nor the names of 
 *    its contributors may be used to endorse or promote products derived 
 *    from this software without specific prior written permission. 
 *     
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR 
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR 
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, 
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, 
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package org.pushingpixels.substance.internal.utils;

import org.pushingpixels.neon.icon.NeonIconUIResource;
import org.pushingpixels.substance.api.*;
import org.pushingpixels.substance.api.SubstanceSlices.*;
import org.pushingpixels.substance.api.colorscheme.SubstanceColorScheme;
import org.pushingpixels.substance.api.inputmap.*;
import org.pushingpixels.substance.api.renderer.SubstanceDefaultListCellRenderer;
import org.pushingpixels.substance.internal.utils.border.*;
import org.pushingpixels.substance.internal.utils.icon.*;
import org.pushingpixels.substance.internal.utils.scroll.SubstanceScrollPaneBorder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;
import java.awt.*;
import java.util.Locale;

public class SkinUtilities {
	/**
	 * Adds skin-specific entries to the UI defaults table.
	 * 
	 * @param uiDefaults
	 *            UI defaults table.
	 */
	public static void addCustomEntriesToTable(UIDefaults uiDefaults,
			SubstanceSkin skin) {
		UIDefaults.LazyValue menuArrowIcon = (UIDefaults table) -> new MenuArrowIcon(null);

		UIDefaults.ActiveValue listCellRendererActiveValue =
				(UIDefaults table) -> new SubstanceDefaultListCellRenderer.SubstanceUIResource();

		SubstanceColorScheme mainActiveScheme = skin
				.getActiveColorScheme(DecorationAreaType.NONE);
		SubstanceColorScheme mainEnabledScheme = skin
				.getEnabledColorScheme(DecorationAreaType.NONE);
		SubstanceColorScheme mainDisabledScheme = skin
				.getDisabledColorScheme(DecorationAreaType.NONE);
		Color controlText = new ColorUIResource(
				mainActiveScheme.getLightColor());
		Color foregroundColor = SubstanceColorUtilities
				.getForegroundColor(mainEnabledScheme);
		Color backgroundActiveColor = new ColorUIResource(
				mainActiveScheme.getBackgroundFillColor());
		Color backgroundDefaultColor = new ColorUIResource(
				mainEnabledScheme.getBackgroundFillColor());
		Color textBackgroundColor = new ColorUIResource(
				mainActiveScheme.getTextBackgroundFillColor());

		Color disabledForegroundColor = SubstanceColorUtilities
				.getForegroundColor(mainDisabledScheme);
		Color disabledTextComponentForegroundColor = disabledForegroundColor;
		float alpha = skin.getAlpha(null, ComponentState.DISABLED_UNSELECTED);
		if (alpha < 1.0f) {
			ColorUIResource defaultTextBackgroundColor = SubstanceColorUtilities
					.getDefaultBackgroundColor(true, skin, false);
			disabledTextComponentForegroundColor = new ColorUIResource(
					SubstanceColorUtilities.getInterpolatedColor(
							disabledTextComponentForegroundColor,
							defaultTextBackgroundColor, alpha));
		}

		Color lineColor = new ColorUIResource(mainActiveScheme.getLineColor());

		Color lineColorDefault = new ColorUIResource(mainEnabledScheme.getLineColor());

		int lcb = SubstanceColorUtilities.getColorBrightness(lineColor.getRGB());
		Color lineBwColor = new ColorUIResource(new Color(lcb, lcb, lcb));

		SubstanceColorScheme textHighlightColorScheme = skin.getColorScheme(
				(Component) null, ColorSchemeAssociationKind.HIGHLIGHT_TEXT,
				ComponentState.SELECTED);
		if (textHighlightColorScheme == null) {
			textHighlightColorScheme = skin.getColorScheme(null,
					ComponentState.ROLLOVER_SELECTED);
		}
		Color selectionTextBackgroundColor = new ColorUIResource(
				textHighlightColorScheme.getSelectionBackgroundColor());
		Color selectionTextForegroundColor = new ColorUIResource(
				textHighlightColorScheme.getSelectionForegroundColor());

		Color selectionCellForegroundColor = new ColorUIResource(
				textHighlightColorScheme.getForegroundColor());
		Color selectionCellBackgroundColor = new ColorUIResource(
				textHighlightColorScheme.getBackgroundFillColor());

        UIDefaults.LazyValue popupMenuBorder = (UIDefaults table) -> new SubstancePopupMenuBorder();

        UIDefaults.LazyValue desktopIconMarginBorder = (UIDefaults table) ->
				new BorderUIResource(new SubstanceBorder(new Insets(0, 0, 0, 0)));

        UIDefaults.LazyValue textBorder = (UIDefaults table) ->
                new BorderUIResource.CompoundBorderUIResource(
                        new SubstanceTextComponentBorder(
                                SubstanceSizeUtils.getTextBorderInsets(SubstanceSizeUtils
                                        .getControlFontSize())),
                        new BasicBorders.MarginBorder());

        UIDefaults.LazyValue textMarginBorder =
                (UIDefaults table) -> new BasicBorders.MarginBorder();

        UIDefaults.LazyValue tooltipBorder = (UIDefaults table) ->
                new SubstanceBorder(SubstanceSizeUtils.getToolTipBorderInsets(
                        SubstanceSizeUtils.getControlFontSize()));

        UIDefaults.LazyValue comboBorder = (UIDefaults table) ->
				new SubstanceBorder(SubstanceSizeUtils.getComboBorderInsets(
				        SubstanceSizeUtils.getControlFontSize()));

        UIDefaults.LazyValue spinnerBorder = (UIDefaults table) ->
				new BorderUIResource.CompoundBorderUIResource(
						new SubstanceTextComponentBorder(
								SubstanceSizeUtils
										.getSpinnerBorderInsets(SubstanceSizeUtils
												.getControlFontSize())),
						new BasicBorders.MarginBorder());

        final SubstanceColorScheme titlePaneScheme = skin
                .getBackgroundColorScheme(DecorationAreaType.PRIMARY_TITLE_PANE);
        final SubstanceColorScheme defaultScheme = skin.getColorScheme(DecorationAreaType.NONE,
                ColorSchemeAssociationKind.BORDER, ComponentState.ENABLED);

        UIDefaults.LazyValue menuItemInsets = (UIDefaults table) -> {
				int menuItemMargin = SubstanceSizeUtils
						.getMenuItemMargin(SubstanceSizeUtils
								.getComponentFontSize(null));
				return new InsetsUIResource(menuItemMargin, menuItemMargin,
						menuItemMargin, menuItemMargin);
		};

        UIDefaults.LazyValue emptyIcon = (UIDefaults table) ->
				new IconUIResource(new Icon() {
					public int getIconHeight() {
						// return the value that matches the core height, so
						// that the DefaultTreeCellEditor.EditorContainer
						// returns the correct value in its getPreferredSize
						// when it consults the "editingIcon" height.
						return 16;
					}

					public int getIconWidth() {
						return 2;
					}

					public void paintIcon(Component c, Graphics g, int x, int y) {
					}
				});

		Object[] defaults = new Object[] {
				"control",
				controlText,

				"Button.defaultButtonFollowsFocus",
				Boolean.FALSE,

				"Button.disabledText",
				disabledForegroundColor,

				"Button.foreground",
				foregroundColor,

				"Button.margin",
				new InsetsUIResource(0, 0, 0, 0),

				"CheckBox.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"CheckBox.border",
				new BorderUIResource.CompoundBorderUIResource(
						SubstanceSizeUtils.getCheckBoxBorder(
								SubstanceSizeUtils.getControlFontSize(),
								ComponentOrientation.getOrientation(
										Locale.getDefault()).isLeftToRight()),
						new MarginBorder()),

				"CheckBox.disabledText",
				disabledForegroundColor,

				"CheckBox.foreground",
				foregroundColor,

				"CheckBoxMenuItem.acceleratorForeground",
				foregroundColor,

				"CheckBoxMenuItem.acceleratorSelectionForeground",
				foregroundColor,

				"CheckBoxMenuItem.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"CheckBoxMenuItem.borderPainted",
				Boolean.FALSE,

				"CheckBoxMenuItem.checkIcon",
				new CheckBoxMenuItemIcon(null,
						1 + SubstanceSizeUtils
								.getMenuCheckMarkSize(SubstanceSizeUtils
										.getControlFontSize())),

				"CheckBoxMenuItem.disabledForeground",
				disabledForegroundColor,

				"CheckBoxMenuItem.foreground",
				foregroundColor,

				"CheckBoxMenuItem.margin",
				menuItemInsets,

				"CheckBoxMenuItem.selectionForeground",
				selectionCellForegroundColor,

				"ColorChooser.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ColorChooser.foreground",
				foregroundColor,

				"ComboBox.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ComboBox.border",
				comboBorder,

				"ComboBox.disabledBackground",
				textBackgroundColor,

				"ComboBox.disabledForeground",
				disabledForegroundColor,

				"ComboBox.foreground",
				foregroundColor,

				"ComboBox.selectionBackground",
				selectionCellBackgroundColor,

				"ComboBox.selectionForeground",
				selectionCellForegroundColor,

				"DesktopIcon.border",
				desktopIconMarginBorder,

				"DesktopIcon.width",
				new Integer(140),

				"Desktop.background",
				new ColorUIResource(new Color(0x0, true)),

				"Desktop.foreground",
				foregroundColor,

				"Dialog.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"EditorPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"EditorPane.border",
				textMarginBorder,

				"EditorPane.foreground",
				foregroundColor,

				"EditorPane.caretForeground",
				foregroundColor,

				"EditorPane.disabledBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"EditorPane.inactiveBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"EditorPane.inactiveForeground",
				disabledTextComponentForegroundColor,

				"EditorPane.selectionBackground",
				selectionTextBackgroundColor,

				"EditorPane.selectionForeground",
				selectionTextForegroundColor,

                "FileChooser.upFolderIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserUpFolderIcon(16, defaultScheme)),

				"FileChooser.newFolderIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserNewFolderIcon(16, defaultScheme)),

				"FileChooser.homeFolderIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserHomeFolderIcon(16, defaultScheme)),

				"FileChooser.listViewIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserListViewIcon(16, defaultScheme)),

                "FileChooser.detailsViewIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserDetailsViewIcon(16, defaultScheme)),

                "FileChooser.viewMenuIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserViewMenuIcon(16, defaultScheme)),

				"FileChooser.usesSingleFilePane",
				Boolean.TRUE,

				"FileView.computerIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserComputerIcon(16, defaultScheme)),

				"FileView.directoryIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserDirectoryIcon(16, defaultScheme)),

				"FileView.fileIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserFileIcon(16, defaultScheme)),

				"FileView.floppyDriveIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserFloppyDriveIcon(16, defaultScheme)),

				"FileView.hardDriveIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().
                                getFileChooserHardDriveIcon(16, defaultScheme)),

				"FormattedTextField.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"FormattedTextField.border",
				textBorder,

				"FormattedTextField.caretForeground",
				foregroundColor,

				"FormattedTextField.disabledBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"FormattedTextField.foreground",
				foregroundColor,

				"FormattedTextField.inactiveBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"FormattedTextField.inactiveForeground",
				disabledTextComponentForegroundColor,

				"FormattedTextField.selectionBackground",
				selectionTextBackgroundColor,

				"FormattedTextField.selectionForeground",
				selectionTextForegroundColor,

				"InternalFrame.activeTitleBackground",
				selectionTextForegroundColor,

				"InternalFrame.inactiveTitleBackground",
				foregroundColor,

				"InternalFrame.border",
				new BorderUIResource(new SubstancePaneBorder()),

				"InternalFrame.closeIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceImageCreator.getCloseIcon(titlePaneScheme, titlePaneScheme)),

				"InternalFrame.iconifyIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceImageCreator.getMinimizeIcon(titlePaneScheme, titlePaneScheme)),

				"InternalFrame.maximizeIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceImageCreator.getMaximizeIcon(titlePaneScheme, titlePaneScheme)),

				"InternalFrame.minimizeIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceImageCreator.getRestoreIcon(titlePaneScheme, titlePaneScheme)),

				"InternalFrame.paletteCloseIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceImageCreator.getCloseIcon(titlePaneScheme, titlePaneScheme)),

				"Label.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"Label.foreground",
				foregroundColor,

				"Label.disabledText",
				disabledForegroundColor,

				"Label.disabledForeground",
				disabledForegroundColor,

				"List.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"List.cellRenderer",
				listCellRendererActiveValue,

				"List.focusCellHighlightBorder",
				new SubstanceBorder(new Insets(1, 1, 1, 1)),

				"List.focusSelectedCellHighlightBorder",
				new BorderUIResource.EmptyBorderUIResource(1, 1, 1, 1),

				"List.foreground",
				foregroundColor,

				"List.selectionBackground",
				selectionCellBackgroundColor,

				"List.selectionForeground",
				selectionCellForegroundColor,

				"Menu.arrowIcon",
				menuArrowIcon,

				"Menu.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"Menu.borderPainted",
				Boolean.FALSE,

				"Menu.checkIcon",
				null,

				"Menu.disabledForeground",
				disabledForegroundColor,

				"Menu.foreground",
				foregroundColor,

				"Menu.margin",
				menuItemInsets,

				"Menu.selectionForeground",
				selectionCellForegroundColor,

				"MenuBar.background",
				skin.isRegisteredAsDecorationArea(DecorationAreaType.HEADER) ? new ColorUIResource(
						skin.getActiveColorScheme(DecorationAreaType.HEADER)
								.getMidColor()) : SubstanceColorUtilities
						.getDefaultBackgroundColor(false, skin, false),

				"MenuBar.foreground",
				new ColorUIResource(skin.getActiveColorScheme(
						DecorationAreaType.HEADER).getForegroundColor()),

				"MenuBar.border",
				null,

				"MenuItem.acceleratorForeground",
				foregroundColor,

				"MenuItem.acceleratorSelectionForeground",
				foregroundColor,

				"MenuItem.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"MenuItem.borderPainted",
				Boolean.FALSE,

				"MenuItem.checkIcon",
				null,

				"MenuItem.disabledForeground",
				disabledForegroundColor,

				"MenuItem.foreground",
				foregroundColor,

				"MenuItem.margin",
				menuItemInsets,

				"MenuItem.selectionForeground",
				selectionCellForegroundColor,

				"OptionPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"OptionPane.errorIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().getOptionPaneErrorIcon(
                                20, defaultScheme)),

				"OptionPane.foreground",
				foregroundColor,

				"OptionPane.informationIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().getOptionPaneInformationIcon(
                                20, defaultScheme)),

				"OptionPane.messageForeground",
				foregroundColor,

				"OptionPane.questionIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().getOptionPaneQuestionIcon(
                                20, defaultScheme)),

				"OptionPane.warningIcon",
                (UIDefaults.LazyValue) ((UIDefaults table) ->
                        SubstanceCortex.GlobalScope.getIconPack().getOptionPaneWarningIcon(
                                20, defaultScheme)),

				"OptionPane.buttonPadding",
				8,
				
				"OptionPane.sameSizeButtons",
				true,
				
				"OptionPane.buttonOrientation",
				ComponentOrientation.getOrientation(Locale.getDefault()).isLeftToRight()
						? SwingConstants.RIGHT : SwingConstants.LEFT,
				
				"OptionPane.isYesLast",
				true,

				"Panel.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"Panel.foreground",
				foregroundColor,

				"PasswordField.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"PasswordField.border",
				textBorder,

				"PasswordField.caretForeground",
				foregroundColor,

				"PasswordField.disabledBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"PasswordField.foreground",
				foregroundColor,

				"PasswordField.inactiveBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"PasswordField.inactiveForeground",
				disabledTextComponentForegroundColor,

				"PasswordField.selectionBackground",
				selectionTextBackgroundColor,

				"PasswordField.selectionForeground",
				selectionTextForegroundColor,

				"PopupMenu.background",
				new ColorUIResource(skin.getBackgroundColorScheme(DecorationAreaType.NONE).getBackgroundFillColor()),

				"PopupMenu.border",
				popupMenuBorder,

				"ProgressBar.border",
				new BorderUIResource(new SubstanceBorder()),

				"ProgressBar.cycleTime",
				new Integer(1000),

				"ProgressBar.repaintInterval",
				new Integer(50),

				"ProgressBar.horizontalSize",
				new DimensionUIResource(146,
						SubstanceSizeUtils.getControlFontSize()),

				"ProgressBar.verticalSize",
				new DimensionUIResource(
						SubstanceSizeUtils.getControlFontSize(), 146),

				"ProgressBar.selectionBackground",
				foregroundColor,

				"ProgressBar.selectionForeground",
				foregroundColor,

				"RadioButton.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"RadioButton.border",
				new BorderUIResource.CompoundBorderUIResource(
						SubstanceSizeUtils.getRadioButtonBorder(
								SubstanceSizeUtils.getControlFontSize(),
								ComponentOrientation.getOrientation(
										Locale.getDefault()).isLeftToRight()),
						new MarginBorder()),

				"RadioButton.foreground",
				foregroundColor,

				"RadioButton.disabledText",
				disabledForegroundColor,

				"RadioButtonMenuItem.acceleratorForeground",
				foregroundColor,

				"RadioButtonMenuItem.acceleratorSelectionForeground",
				foregroundColor,

				"RadioButtonMenuItem.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"RadioButtonMenuItem.borderPainted",
				Boolean.FALSE,

				"RadioButtonMenuItem.checkIcon",
				new RadioButtonMenuItemIcon(null,
						SubstanceSizeUtils
								.getMenuCheckMarkSize(SubstanceSizeUtils
										.getControlFontSize())),

				"RadioButtonMenuItem.disabledForeground",
				disabledForegroundColor,

				"RadioButtonMenuItem.foreground",
				foregroundColor,

				"RadioButtonMenuItem.margin",
				menuItemInsets,

				"RadioButtonMenuItem.selectionForeground",
				selectionCellForegroundColor,

				"RootPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"RootPane.border",
				new SubstancePaneBorder(),

				"ScrollBar.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ScrollBar.width",
				new Integer(
						SubstanceSizeUtils.getScrollBarWidth(SubstanceSizeUtils
								.getControlFontSize())),

				"ScrollBar.minimumThumbSize",
				new DimensionUIResource(
						SubstanceSizeUtils.getScrollBarWidth(SubstanceSizeUtils
								.getControlFontSize()) - 2,
						SubstanceSizeUtils.getScrollBarWidth(SubstanceSizeUtils
								.getControlFontSize()) - 2),

				"ScrollPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ScrollPane.foreground",
				foregroundColor,

				"ScrollPane.border",
				new SubstanceScrollPaneBorder(),

				"Separator.background",
				backgroundDefaultColor,

				"Separator.foreground",
				lineBwColor,

				"Slider.altTrackColor",
				lineColor,

				"Slider.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"Slider.darkShadow",
				lineColor,

				"Slider.focus",
				lineColor,

				"Slider.focusInsets",
				new InsetsUIResource(2, 2, 0, 2),

				"Slider.foreground",
				lineColor,

				"Slider.highlight",
				textBackgroundColor,

				"Slider.shadow",
				lineColor,

				"Slider.tickColor",
				foregroundColor,

				"Spinner.arrowButtonInsets",
				SubstanceSizeUtils
						.getSpinnerArrowButtonInsets(SubstanceSizeUtils
								.getControlFontSize()),

				"Spinner.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"Spinner.border",
				spinnerBorder,

				"Spinner.disableOnBoundaryValues",
				Boolean.TRUE,

				"Spinner.foreground",
				foregroundColor,

				"Spinner.editorBorderPainted",
				Boolean.TRUE,

				"SplitPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"SplitPane.foreground",
				foregroundColor,

				"SplitPane.dividerFocusColor",
				backgroundDefaultColor,

				"SplitPaneDivider.draggingColor",
				backgroundActiveColor,

				"SplitPane.border",
				new BorderUIResource(new EmptyBorder(0, 0, 0, 0)),

				"SplitPane.dividerSize",
				(int) (SubstanceSizeUtils.getArrowIconWidth(SubstanceSizeUtils
						.getControlFontSize()) + SubstanceSizeUtils
						.getAdjustedSize(
								SubstanceSizeUtils.getControlFontSize(), -1, 6,
								-1, true)),

				"SplitPaneDivider.border",
				new BorderUIResource(new EmptyBorder(1, 1, 1, 1)),

				"TabbedPane.tabAreaBackground",
				backgroundDefaultColor,

				"TabbedPane.unselectedBackground",
				backgroundDefaultColor,

				"TabbedPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"TabbedPane.borderHightlightColor",
				new ColorUIResource(mainActiveScheme.getMidColor()),

				"TabbedPane.contentAreaColor",
				null,

				"TabbedPane.contentBorderInsets",
				new InsetsUIResource(4, 4, 4, 4),

				"TabbedPane.contentOpaque",
				Boolean.FALSE,

				"TabbedPane.darkShadow",
				new ColorUIResource(skin.getColorScheme((Component) null,
						ColorSchemeAssociationKind.BORDER,
						ComponentState.SELECTED).getLineColor()),

				"TabbedPane.focus",
				foregroundColor,

				"TabbedPane.foreground",
				foregroundColor,

				"TabbedPane.highlight",
				new ColorUIResource(mainActiveScheme.getLightColor()),

				"TabbedPane.light",
				mainEnabledScheme.isDark() ? new ColorUIResource(
						SubstanceColorUtilities.getAlphaColor(
								mainEnabledScheme.getUltraDarkColor(), 100))
						: new ColorUIResource(mainEnabledScheme.getLightColor()),

				"TabbedPane.selected",
				new ColorUIResource(mainActiveScheme.getExtraLightColor()),

				"TabbedPane.selectedForeground",
				foregroundColor,

				"TabbedPane.selectHighlight",
				new ColorUIResource(mainActiveScheme.getMidColor()),

				"TabbedPane.shadow",
				new ColorUIResource(
						SubstanceColorUtilities.getInterpolatedColor(
								mainEnabledScheme.getExtraLightColor(),
								mainEnabledScheme.getLightColor(), 0.5)),

				"TabbedPane.tabRunOverlay",
				new Integer(0),

				"Table.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"Table.cellNoFocusBorder",
				new BorderUIResource.EmptyBorderUIResource(
						SubstanceSizeUtils
								.getDefaultBorderInsets(SubstanceSizeUtils
										.getComponentFontSize(null))),

				"Table.focusCellBackground",
				backgroundActiveColor,

				"Table.focusCellForeground",
				foregroundColor,

				"Table.focusCellHighlightBorder",
				new SubstanceBorder(),

				"Table.foreground",
				foregroundColor,

				"Table.gridColor",
				lineColorDefault,

				"Table.scrollPaneBorder",
				new SubstanceScrollPaneBorder(),

				"Table.selectionBackground",
				selectionCellBackgroundColor,

				"Table.selectionForeground",
				selectionCellForegroundColor,

				"TableHeader.cellBorder",
				null,

				"TableHeader.foreground",
				foregroundColor,

				"TableHeader.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"TextArea.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"TextArea.border",
				textMarginBorder,

				"TextArea.caretForeground",
				foregroundColor,

				"TextArea.disabledBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"TextArea.foreground",
				foregroundColor,

				"TextArea.inactiveBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"TextArea.inactiveForeground",
				disabledTextComponentForegroundColor,

				"TextArea.selectionBackground",
				selectionTextBackgroundColor,

				"TextArea.selectionForeground",
				selectionTextForegroundColor,

				"TextField.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"TextField.border",
				textBorder,

				"TextField.caretForeground",
				foregroundColor,

				"TextField.disabledBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"TextField.foreground",
				foregroundColor,

				"TextField.inactiveBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"TextField.inactiveForeground",
				disabledTextComponentForegroundColor,

				"TextField.selectionBackground",
				selectionTextBackgroundColor,

				"TextField.selectionForeground",
				selectionTextForegroundColor,

				"TextPane.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						false),

				"TextPane.border",
				textMarginBorder,

				"TextPane.disabledBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"TextPane.foreground",
				foregroundColor,

				"TextPane.caretForeground",
				foregroundColor,

				"TextPane.inactiveBackground",
				SubstanceColorUtilities.getDefaultBackgroundColor(true, skin,
						true),

				"TextPane.inactiveForeground",
				disabledTextComponentForegroundColor,

				"TextPane.selectionBackground",
				selectionTextBackgroundColor,

				"TextPane.selectionForeground",
				selectionTextForegroundColor,

				"TitledBorder.titleColor",
				foregroundColor,

				"TitledBorder.border",
				new SubstanceEtchedBorder(),

				"ToggleButton.foreground",
				foregroundColor,

				"ToggleButton.disabledText",
				disabledForegroundColor,

				"ToggleButton.margin",
				new InsetsUIResource(0, 0, 0, 0),

				"ToolBar.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ToolBar.border",
				new BorderUIResource(new SubstanceToolBarBorder()),

				"ToolBar.isRollover",
				Boolean.TRUE,

				"ToolBar.foreground",
				foregroundColor,

				"ToolBarSeparator.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ToolBarSeparator.foreground",
				lineBwColor,

				"ToolBar.separatorSize",
				null,

				"ToolTip.border",
				tooltipBorder,

				"ToolTip.borderInactive",
				tooltipBorder,

				"ToolTip.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"ToolTip.backgroundInactive",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						true),

				"ToolTip.foreground",
				foregroundColor,

				"ToolTip.foregroundInactive",
				disabledForegroundColor,

				"Tree.closedIcon",
				emptyIcon,

				"Tree.collapsedIcon",
				new UIDefaults.LazyValue() {
					public Object createValue(UIDefaults table) {
						return new NeonIconUIResource(
								SubstanceIconFactory.getTreeIcon(null, true));
					}
				},

				"Tree.expandedIcon",
				new UIDefaults.LazyValue() {
					public Object createValue(UIDefaults table) {
						return new NeonIconUIResource(
								SubstanceIconFactory.getTreeIcon(null, false));
					}
				},

				"Tree.leafIcon",
				emptyIcon,

				"Tree.openIcon",
				emptyIcon,

				"Tree.background",
				SubstanceColorUtilities.getDefaultBackgroundColor(false, skin,
						false),

				"Tree.selectionBackground", selectionCellBackgroundColor,

				"Tree.foreground", foregroundColor,

				"Tree.hash", lineColorDefault,

				"Tree.rowHeight", new Integer(0),

				"Tree.selectionBorderColor", lineColor,

				"Tree.selectionForeground", selectionCellForegroundColor,

				"Tree.textBackground", backgroundDefaultColor,

				"Tree.textForeground", foregroundColor,
				
				"Viewport.background", backgroundDefaultColor,

				"Viewport.foreground", foregroundColor,

		};
		uiDefaults.putDefaults(defaults);

		// input maps
		InputMapSet inputMapSet = SubstanceInputMapUtilities.getSystemInputMapSet();
		if (inputMapSet == null) {
			throw new IllegalStateException("Input map set is null!");
		}

		uiDefaults.put("Button.focusInputMap", inputMapSet.getButtonFocusInputMap()
				.getUiMap());
		uiDefaults.put("CheckBox.focusInputMap", inputMapSet
				.getCheckBoxFocusInputMap().getUiMap());
		uiDefaults.put("ComboBox.ancestorInputMap", inputMapSet
				.getComboBoxAncestorInputMap().getUiMap());
		uiDefaults.put("Desktop.ancestorInputMap", inputMapSet
				.getDesktopAncestorInputMap().getUiMap());
		uiDefaults.put("EditorPane.focusInputMap", inputMapSet
				.getEditorPaneFocusInputMap().getUiMap());
		uiDefaults.put("FileChooser.ancestorInputMap", inputMapSet
				.getFileChooserAncestorInputMap().getUiMap());
		uiDefaults.put("FormattedTextField.focusInputMap", inputMapSet
				.getFormattedTextFieldFocusInputMap().getUiMap());
		uiDefaults.put("List.focusInputMap", inputMapSet.getListFocusInputMap()
				.getUiMap());
		uiDefaults.put("PasswordField.focusInputMap", inputMapSet
				.getPasswordFieldFocusInputMap().getUiMap());
		uiDefaults.put("RadioButton.focusInputMap", inputMapSet
				.getRadioButtonFocusInputMap().getUiMap());
		uiDefaults.put("RootPane.ancestorInputMap", inputMapSet
				.getRootPaneAncestorInputMap().getUiMap());
		uiDefaults.put("ScrollBar.ancestorInputMap", inputMapSet
				.getScrollBarAncestorInputMap().getUiMap());
		uiDefaults.put("ScrollPane.ancestorInputMap", inputMapSet
				.getScrollPaneAncestorInputMap().getUiMap());
		uiDefaults.put("Slider.focusInputMap", inputMapSet.getSliderFocusInputMap()
				.getUiMap());
		uiDefaults.put("Spinner.ancestorInputMap", inputMapSet
				.getSpinnerAncestorInputMap().getUiMap());
		uiDefaults.put("SplitPane.ancestorInputMap", inputMapSet
				.getSplitPaneAncestorInputMap().getUiMap());
		uiDefaults.put("TabbedPane.ancestorInputMap", inputMapSet
				.getTabbedPaneAncestorInputMap().getUiMap());
		uiDefaults.put("TabbedPane.focusInputMap", inputMapSet
				.getTabbedPaneFocusInputMap().getUiMap());
		uiDefaults.put("Table.ancestorInputMap", inputMapSet
				.getTableAncestorInputMap().getUiMap());
		uiDefaults.put("TableHeader.ancestorInputMap", inputMapSet
				.getTableHeaderAncestorInputMap().getUiMap());
		uiDefaults.put("TextArea.focusInputMap", inputMapSet
				.getTextAreaFocusInputMap().getUiMap());
		uiDefaults.put("TextField.focusInputMap", inputMapSet
				.getTextFieldFocusInputMap().getUiMap());
		uiDefaults.put("TextPane.focusInputMap", inputMapSet
				.getTextPaneFocusInputMap().getUiMap());
		uiDefaults.put("ToggleButton.focusInputMap", inputMapSet
				.getToggleButtonFocusInputMap().getUiMap());
		uiDefaults.put("ToolBar.ancestorInputMap", inputMapSet
				.getToolBarAncestorInputMap().getUiMap());
		uiDefaults.put("Tree.ancestorInputMap", inputMapSet
				.getTreeAncestorInputMap().getUiMap());
		uiDefaults.put("Tree.focusInputMap", inputMapSet.getTreeFocusInputMap()
				.getUiMap());
	}
}
