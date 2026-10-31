package p;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.TextAttribute;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lrb1 implements InputConnection {
    public final em0 a;
    public final bfn0 b = new bfn0(0, new iu30[16]);
    public final InputConnection c;

    public lrb1(em0 em0Var, EditorInfo editorInfo) {
        this.a = em0Var;
        this.c = f7p1.h(new krb1(this, false), editorInfo, new twa(this));
    }

    public final i4e1 a() {
        return ((ggg1) this.a.d).h();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((b8p1) this.a.b).b++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return w5w.a(this.c, inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.M(new w180(charSequence.toString(), i, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : ka4.a(textAttribute)));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        em0 em0Var = this.a;
        em0Var.M(new u180(i, i2, (s180) em0Var, (byte) 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        this.a.M(new iu30() { // from class: p.t180
            public final Object invoke(Object obj) {
                h4e1 h4e1Var = (h4e1) obj;
                int i3 = i;
                int i4 = i2;
                if (i3 < 0 || i4 < 0) {
                    tf80.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i4 + " respectively.");
                }
                int iG = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iG + 1;
                    long j = h4e1Var.g;
                    yzr0 yzr0Var = h4e1Var.c;
                    int iG2 = nbe1.g(j);
                    long j2 = h4e1Var.g;
                    if (iG2 <= i6) {
                        iG = nbe1.g(j2);
                        break;
                    }
                    iG = (Character.isHighSurrogate(yzr0Var.charAt((nbe1.g(j2) - i6) + (-1))) && Character.isLowSurrogate(yzr0Var.charAt(nbe1.g(h4e1Var.g) - i6))) ? iG + 2 : i6;
                }
                int length = 0;
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = length + 1;
                    long j3 = h4e1Var.g;
                    yzr0 yzr0Var2 = h4e1Var.c;
                    if (nbe1.f(j3) + i8 >= yzr0Var2.length()) {
                        length = yzr0Var2.length() - nbe1.f(h4e1Var.g);
                        break;
                    }
                    length = (Character.isHighSurrogate(yzr0Var2.charAt((nbe1.f(h4e1Var.g) + i8) + (-1))) && Character.isLowSurrogate(yzr0Var2.charAt(nbe1.f(h4e1Var.g) + i8))) ? length + 2 : i8;
                }
                l3p1.t(h4e1Var, nbe1.f(h4e1Var.g), nbe1.f(h4e1Var.g) + length);
                l3p1.t(h4e1Var, nbe1.g(h4e1Var.g) - iG, nbe1.g(h4e1Var.g));
                return rih1.a;
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((b8p1) this.a.b).k();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.M(new pv40((byte) 4));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), nbe1.g(a().e), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        i4e1 i4e1VarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = i4e1VarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = i4e1VarA.d.length();
        extractedText.partialStartOffset = -1;
        long j = i4e1VarA.e;
        extractedText.selectionStart = nbe1.g(j);
        extractedText.selectionEnd = nbe1.f(j);
        extractedText.flags = !ihc1.i0(i4e1VarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (nbe1.d(a().e)) {
            return null;
        }
        return x2p1.l(a()).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        i4e1 i4e1VarA = a();
        long j = i4e1VarA.e;
        CharSequence charSequence = i4e1VarA.d;
        int iF = nbe1.f(j);
        int iF2 = nbe1.f(i4e1VarA.e);
        int length = iF2 + i;
        if (((iF2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        i4e1 i4e1VarA = a();
        int iG = nbe1.g(i4e1VarA.e);
        int i3 = iG - i;
        if (((i ^ iG) & (iG ^ i3)) < 0) {
            i3 = 0;
        }
        return i4e1VarA.d.subSequence(Math.max(0, i3), nbe1.g(i4e1VarA.e)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                int length = a().d.length();
                em0 em0Var = this.a;
                em0Var.M(new u180(em0Var, 0, length, (byte) 0));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        iu30 iu30Var = (iu30) this.a.f;
        if (iu30Var != null) {
            iu30Var.invoke(new r180(i2));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int iE;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        if (i >= 34) {
            em0 em0Var = this.a;
            iE = sf.E((ggg1) em0Var.d, handwritingGesture, (aae1) em0Var.h, (Function0) em0Var.i, (e8k1) em0Var.t);
        } else {
            iE = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new ai5(intConsumer, iE, (byte) 1));
        } else {
            intConsumer.accept(iE);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i < 34 || i < 34) {
            return false;
        }
        em0 em0Var = this.a;
        return sf.G((ggg1) em0Var.d, previewableHandwritingGesture, (aae1) em0Var.h, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0074  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        xab1 xab1Var;
        CursorAnchorInfo cursorAnchorInfoA;
        ooo oooVar = (ooo) this.a.g;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z4 = true;
                } else {
                    z = z4;
                    z4 = true;
                }
                z2 = z4;
            }
            oooVar.f = z2;
            oooVar.g = z3;
            oooVar.h = z4;
            oooVar.i = z;
            if (z5 && (cursorAnchorInfoA = oooVar.a()) != null) {
                xid xidVar = oooVar.c;
                xidVar.s().updateCursorAnchorInfo((View) xidVar.b, cursorAnchorInfoA);
            }
            xab1Var = oooVar.e;
            if (!z6) {
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                oooVar.e = null;
                return true;
            }
            if (xab1Var == null && xab1Var.isActive()) {
                return true;
            }
            oooVar.e = fn31.T(oooVar.d, null, 4, new n1o(oooVar, (lnm) null, (byte) 2), 1);
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        oooVar.f = z2;
        oooVar.g = z3;
        oooVar.h = z4;
        oooVar.i = z;
        if (z5) {
            xid xidVar2 = oooVar.c;
            xidVar2.s().updateCursorAnchorInfo((View) xidVar2.b, cursorAnchorInfoA);
        }
        xab1Var = oooVar.e;
        if (!z6) {
            if (xab1Var == null) {
            }
            oooVar.e = fn31.T(oooVar.d, null, 4, new n1o(oooVar, (lnm) null, (byte) 2), 1);
            return true;
        }
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        oooVar.e = null;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        xid xidVar = (xid) this.a.e;
        xidVar.s().dispatchKeyEventFromInputMethod((View) xidVar.b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        em0 em0Var = this.a;
        em0Var.M(new u180(i, i2, (s180) em0Var, (byte) 2));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c0  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        zma1 zma1Var;
        zh40 zh40VarC;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, z4p1.e(((BackgroundColorSpan) obj).getBackgroundColor()), (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 63487);
                } else if (obj instanceof ForegroundColorSpan) {
                    zma1Var = new zma1(z4p1.e(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
                } else if (obj instanceof StrikethroughSpan) {
                    zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.d, (Shadow) null, (PlatformSpanStyle) null, 61439);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        zma1Var = new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65531);
                    } else if (style == 2) {
                        zma1Var = new zma1(0L, 0L, (FontWeight) null, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65527);
                    } else if (style != 3) {
                        zma1Var = null;
                    } else {
                        zma1Var = new zma1(0L, 0L, FontWeight.Z, new FontStyle(1), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65523);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    if (u890.j(family, "cursive")) {
                        zh40VarC = FontFamily.e;
                    } else if (u890.j(family, "monospace")) {
                        zh40VarC = FontFamily.d;
                    } else if (u890.j(family, "sans-serif")) {
                        zh40VarC = FontFamily.b;
                    } else if (u890.j(family, "serif")) {
                        zh40VarC = FontFamily.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 == null || family2.length() == 0) {
                            zh40VarC = null;
                        } else {
                            Typeface typefaceCreate = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (u890.j(typefaceCreate, typeface) || u890.j(typefaceCreate, Typeface.create(typeface, 0))) {
                                typefaceCreate = null;
                            }
                            if (typefaceCreate != null) {
                                zh40VarC = qon1.c(typefaceCreate);
                            } else {
                                zh40VarC = null;
                            }
                        }
                    }
                    zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, zh40VarC, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65503);
                } else if (obj instanceof UnderlineSpan) {
                    zma1Var = new zma1(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61439);
                } else {
                    zma1Var = null;
                }
                if (zma1Var != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new ze5(spanned.getSpanStart(obj), spanned.getSpanEnd(obj), zma1Var));
                }
            }
            arrayList = arrayList2;
        }
        this.a.M(new v180(i, string, arrayList, false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        em0 em0Var = this.a;
        em0Var.M(new u180(em0Var, i, i2, (byte) 0));
        ((iu30) em0Var.X).invoke(Boolean.FALSE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.M(new w180(charSequence.toString(), i, false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.M(new v180(i, charSequence.toString(), null, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : ka4.a(textAttribute)));
        return true;
    }
}
