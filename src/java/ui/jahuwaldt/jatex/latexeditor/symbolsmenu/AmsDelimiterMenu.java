/*
 * AmsDelimiterMenu.java
 *
 * Copyright (C) 2006 Jess Thrysoee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package java.ui.jahuwaldt.jatex.latexeditor.symbolsmenu;

import java.ui.jahuwaldt.jatex.latexeditor.LatexEditorPane;

/**
 * Menu containing LaTeX AMS Delimiter items.
 * 
 * <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Jess Thrysoee, 2006
 * @version May 14, 2013
 */
public class AmsDelimiterMenu extends AbstractMathSymbolMenu {

    /**
     * Constructs a new
     * <code>JMenu</code>.
     *
     * @param editorPane
     */
    public AmsDelimiterMenu(LatexEditorPane editorPane) {
        super(RESOURCES.getString("AmsDelimiterLabel"));

        add(new MathSymbolMenuItem(editorPane, "\\bigl", null));
        add(new MathSymbolMenuItem(editorPane, "\\bigr", null));
        add(new MathSymbolMenuItem(editorPane, "\\Bigl", null));
        add(new MathSymbolMenuItem(editorPane, "\\Bigr", null));
        add(new MathSymbolMenuItem(editorPane, "\\biggl", null));
        add(new MathSymbolMenuItem(editorPane, "\\biggr", null));
        add(new MathSymbolMenuItem(editorPane, "\\Biggl", null));
        add(new MathSymbolMenuItem(editorPane, "\\Biggr", null));
        add(new MathSymbolMenuItem(editorPane, "\\lvert", null));
        add(new MathSymbolMenuItem(editorPane, "\\rvert", null));
        add(new MathSymbolMenuItem(editorPane, "\\lVert", null));
        add(new MathSymbolMenuItem(editorPane, "\\rVert", null));
        add(new MathSymbolMenuItem(editorPane, "\\ulcorner", null));
        add(new MathSymbolMenuItem(editorPane, "\\urcorner", null));
        add(new MathSymbolMenuItem(editorPane, "\\llcorner", null));
        add(new MathSymbolMenuItem(editorPane, "\\lrcorner", null));

        fireMaxIconWidth();
    }
}
