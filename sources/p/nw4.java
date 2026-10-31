package p;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nw4 {
    public final rw4 a;
    public final int b;
    public final long c;
    public final w9e1 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:120:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:137:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x0184  */
    /* JADX WARN: Code duplicated, block: B:70:0x019b  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b6 A[LOOP:0: B:73:0x01b4->B:74:0x01b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01db  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x020b  */
    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0234  */
    /* JADX WARN: Code duplicated, block: B:93:0x0236  */
    /* JADX WARN: Code duplicated, block: B:97:0x023d  */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x01b2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x01db, please report this as an issue */
    public nw4(rw4 rw4Var, int i, int i2, long j) throws NoWhenBranchMatchedException {
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        w9e1 w9e1VarA;
        int i3;
        int i4;
        int i5;
        nw4 nw4Var;
        Layout layout;
        Spanned spanned;
        aw61[] aw61VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        z6x arrayList;
        int i6;
        z6x z6xVar;
        int spanEnd;
        int iG;
        boolean z;
        boolean z2;
        boolean z3;
        n511 n511Var;
        float fK;
        int iD;
        float fJ;
        int iD2;
        w9e1 w9e1Var;
        float fD;
        int iB;
        float fI;
        float fB;
        float fD2;
        int i7;
        this.a = rw4Var;
        this.b = i;
        this.c = j;
        if (hjl.j(j) != 0 || hjl.k(j) != 0) {
            rf80.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            rf80.a("maxLines should be greater than 0");
        }
        lee1 lee1VarF = rw4Var.f();
        int i8 = 0;
        CharSequence charSequenceL = mth1.n(lee1VarF, i2 == 2) ? mth1.l(rw4Var.b()) : rw4Var.b();
        this.e = charSequenceL;
        cpr0 cpr0Var = lee1VarF.b;
        int iO = mth1.o(cpr0Var.a);
        int i9 = cpr0Var.a;
        int i10 = cpr0Var.g;
        if (i9 == 4) {
            i8 = 1;
        }
        int iQ = mth1.q(cpr0Var.h);
        int i11 = mhc0.b;
        int iP = mth1.p(i10 & 255);
        int iR = mth1.r((i10 >> 8) & 255);
        int iS = mth1.s((i10 >> 16) & 255);
        if (i2 == 2) {
            truncateAt2 = TextUtils.TruncateAt.END;
        } else {
            if (i2 != 5) {
                if (i2 == 4) {
                    truncateAt2 = TextUtils.TruncateAt.START;
                } else {
                    truncateAt = null;
                }
                w9e1VarA = a(iO, i8, truncateAt, i, iQ, iP, iR, iS, charSequenceL);
                Layout layout2 = w9e1VarA.f;
                if (Build.VERSION.SDK_INT < 35 || rw4Var.h().getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                    i3 = i;
                    i4 = iO;
                    i5 = 2;
                } else {
                    int ellipsisStart = layout2.getEllipsisStart(0);
                    CharSequence[] charSequenceArr = {charSequenceL.subSequence(0, ellipsisStart), "…", charSequenceL.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequenceL.length())};
                    i3 = i;
                    i4 = iO;
                    w9e1VarA = a(i4, i8, truncateAt, i3, iQ, iP, iR, iS, TextUtils.concat(charSequenceArr));
                    i5 = 2;
                }
                if (i2 == i5 || w9e1VarA.a() <= hjl.h(j) || i3 <= 1) {
                    nw4Var = this;
                    nw4Var.d = w9e1VarA;
                } else {
                    int iM = mth1.m(w9e1VarA, hjl.h(j));
                    if (iM < 0 || iM == i3) {
                        nw4Var = this;
                    } else {
                        nw4Var = this;
                        w9e1VarA = nw4Var.a(i4, i8, truncateAt, iM < 1 ? 1 : iM, iQ, iP, iR, iS, charSequenceL);
                    }
                    nw4Var.d = w9e1VarA;
                }
                nw4Var.f = w9e1VarA.a();
                rw4Var.h().c(lee1VarF.b(), (((long) Float.floatToRawIntBits(nw4Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(nw4Var.d())) << 32), lee1VarF.a.a.b());
                layout = w9e1VarA.f;
                if (layout.getText() instanceof Spanned) {
                    spanned = (Spanned) layout.getText();
                    if (spanned.nextSpanTransition(-1, spanned.length(), aw61.class) != spanned.length()) {
                        aw61VarArr = (aw61[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), aw61.class);
                    } else {
                        aw61VarArr = null;
                    }
                } else {
                    aw61VarArr = null;
                }
                if (aw61VarArr != null) {
                    for (aw61 aw61Var : aw61VarArr) {
                        aw61Var.a((((long) Float.floatToRawIntBits(nw4Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(nw4Var.d())) << 32));
                    }
                }
                charSequence = nw4Var.e;
                if (charSequence instanceof Spanned) {
                    spanned2 = (Spanned) charSequence;
                    Object[] spans = spanned2.getSpans(0, charSequence.length(), n6t0.class);
                    arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        n6t0 n6t0Var = (n6t0) obj;
                        int spanStart = spanned2.getSpanStart(n6t0Var);
                        spanEnd = spanned2.getSpanEnd(n6t0Var);
                        iG = nw4Var.d.g(spanStart);
                        if (iG >= nw4Var.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (nw4Var.d.f.getEllipsisCount(iG) > 0 || spanEnd <= nw4Var.d.f.getEllipsisStart(iG) + nw4Var.d.f.getLineStart(iG)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (spanEnd > nw4Var.d.f(iG)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 && !z3 && !z) {
                            boolean z4 = nw4Var.d.f.getParagraphDirection(iG) == 1;
                            boolean zIsRtlCharAt = nw4Var.d.f.isRtlCharAt(spanStart);
                            if (!z4 || zIsRtlCharAt) {
                                if (z4 && zIsRtlCharAt) {
                                    fJ = nw4Var.d.k(spanStart, false);
                                    iD2 = n6t0Var.d();
                                } else {
                                    w9e1 w9e1Var2 = nw4Var.d;
                                    if (zIsRtlCharAt) {
                                        fJ = w9e1Var2.j(spanStart, false);
                                        iD2 = n6t0Var.d();
                                    } else {
                                        fK = w9e1Var2.k(spanStart, false);
                                        iD = n6t0Var.d();
                                    }
                                }
                                fK = fJ - iD2;
                                w9e1Var = nw4Var.d;
                                switch (n6t0Var.c()) {
                                    case 0:
                                        fD = w9e1Var.d(iG);
                                        iB = n6t0Var.b();
                                        fI = fD - iB;
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    case 1:
                                        fI = w9e1Var.i(iG);
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    case 2:
                                        fD = w9e1Var.e(iG);
                                        iB = n6t0Var.b();
                                        fI = fD - iB;
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    case 3:
                                        fI = ((w9e1Var.e(iG) + w9e1Var.i(iG)) - n6t0Var.b()) / 2.0f;
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    case 4:
                                        fB = n6t0Var.a().ascent;
                                        fD2 = w9e1Var.d(iG);
                                        fI = fD2 + fB;
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    case 5:
                                        fD = w9e1Var.d(iG) + n6t0Var.a().descent;
                                        iB = n6t0Var.b();
                                        fI = fD - iB;
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    case 6:
                                        Paint.FontMetricsInt fontMetricsIntA = n6t0Var.a();
                                        fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - n6t0Var.b()) / 2;
                                        fD2 = w9e1Var.d(iG);
                                        fI = fD2 + fB;
                                        n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                        break;
                                    default:
                                        eg.m("unexpected verticalAlignment");
                                        throw null;
                                }
                            } else {
                                fK = nw4Var.d.j(spanStart, false);
                                iD = n6t0Var.d();
                            }
                            fJ = iD + fK;
                            w9e1Var = nw4Var.d;
                            switch (n6t0Var.c()) {
                                case 0:
                                    fD = w9e1Var.d(iG);
                                    iB = n6t0Var.b();
                                    fI = fD - iB;
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                case 1:
                                    fI = w9e1Var.i(iG);
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                case 2:
                                    fD = w9e1Var.e(iG);
                                    iB = n6t0Var.b();
                                    fI = fD - iB;
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                case 3:
                                    fI = ((w9e1Var.e(iG) + w9e1Var.i(iG)) - n6t0Var.b()) / 2.0f;
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                case 4:
                                    fB = n6t0Var.a().ascent;
                                    fD2 = w9e1Var.d(iG);
                                    fI = fD2 + fB;
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                case 5:
                                    fD = w9e1Var.d(iG) + n6t0Var.a().descent;
                                    iB = n6t0Var.b();
                                    fI = fD - iB;
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                case 6:
                                    Paint.FontMetricsInt fontMetricsIntA2 = n6t0Var.a();
                                    fB = ((fontMetricsIntA2.ascent + fontMetricsIntA2.descent) - n6t0Var.b()) / 2;
                                    fD2 = w9e1Var.d(iG);
                                    fI = fD2 + fB;
                                    n511Var = new n511(fK, fI, fJ, n6t0Var.b() + fI);
                                    break;
                                default:
                                    eg.m("unexpected verticalAlignment");
                                    throw null;
                            }
                        }
                        arrayList.add(n511Var);
                    }
                    z6xVar = arrayList;
                } else {
                    z6xVar = z6x.a;
                }
                nw4Var.g = z6xVar;
            }
            truncateAt2 = TextUtils.TruncateAt.MIDDLE;
        }
        truncateAt = truncateAt2;
        w9e1VarA = a(iO, i8, truncateAt, i, iQ, iP, iR, iS, charSequenceL);
        Layout layout3 = w9e1VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i3 = i;
            i4 = iO;
            i5 = 2;
        } else {
            i3 = i;
            i4 = iO;
            i5 = 2;
        }
        if (i2 == i5) {
            nw4Var = this;
            nw4Var.d = w9e1VarA;
        } else {
            nw4Var = this;
            nw4Var.d = w9e1VarA;
        }
        nw4Var.f = w9e1VarA.a();
        rw4Var.h().c(lee1VarF.b(), (((long) Float.floatToRawIntBits(nw4Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(nw4Var.d())) << 32), lee1VarF.a.a.b());
        layout = w9e1VarA.f;
        if (layout.getText() instanceof Spanned) {
            aw61VarArr = null;
        } else {
            spanned = (Spanned) layout.getText();
            if (spanned.nextSpanTransition(-1, spanned.length(), aw61.class) != spanned.length()) {
                aw61VarArr = (aw61[]) ((Spanned) layout.getText()).getSpans(0, layout.getText().length(), aw61.class);
            } else {
                aw61VarArr = null;
            }
        }
        if (aw61VarArr != null) {
            while (i7 < r2) {
                aw61Var.a((((long) Float.floatToRawIntBits(nw4Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(nw4Var.d())) << 32));
            }
        }
        charSequence = nw4Var.e;
        if (charSequence instanceof Spanned) {
            z6xVar = z6x.a;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans2 = spanned2.getSpans(0, charSequence.length(), n6t0.class);
            arrayList = new ArrayList(spans2.length);
            while (i6 < r4) {
                n6t0 n6t0Var2 = (n6t0) obj;
                int spanStart2 = spanned2.getSpanStart(n6t0Var2);
                spanEnd = spanned2.getSpanEnd(n6t0Var2);
                iG = nw4Var.d.g(spanStart2);
                if (iG >= nw4Var.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (nw4Var.d.f.getEllipsisCount(iG) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > nw4Var.d.f(iG)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                n511Var = z2 ? null : null;
                arrayList.add(n511Var);
            }
            z6xVar = arrayList;
        }
        nw4Var.g = z6xVar;
    }

    public final w9e1 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        edt0 edt0Var;
        float fD = d();
        rw4 rw4Var = this.a;
        o45 o45VarH = rw4Var.h();
        int iG = rw4Var.g();
        olb0 olb0VarC = rw4Var.c();
        lee1 lee1VarF = rw4Var.f();
        ow4 ow4Var = pw4.a;
        wdt0 wdt0Var = lee1VarF.c;
        return new w9e1(charSequence, fD, o45VarH, i, truncateAt, iG, (wdt0Var == null || (edt0Var = wdt0Var.b) == null) ? false : edt0Var.a, i3, i5, i6, i7, i4, i2, olb0VarC);
    }

    public final int b(int i, boolean z) {
        w9e1 w9e1Var = this.d;
        if (!z) {
            return w9e1Var.f(i);
        }
        Layout layout = w9e1Var.f;
        ThreadLocal threadLocal = bae1.a;
        if (layout.getEllipsisCount(i) <= 0 || w9e1Var.b != TextUtils.TruncateAt.END) {
            return w9e1Var.c().m(i);
        }
        return layout.getEllipsisStart(i) + layout.getLineStart(i);
    }

    public final long c(n511 n511Var, int i, t8e1 t8e1Var) {
        int[] iArrU;
        RectF rectFV = l0p1.v(n511Var);
        int iT = mth1.t(i);
        w9 w9Var = new w9(t8e1Var, (byte) 1);
        int i2 = Build.VERSION.SDK_INT;
        w9e1 w9e1Var = this.d;
        if (i2 >= 34) {
            w9e1Var.getClass();
            iArrU = sf.s(w9e1Var, rectFV, iT, w9Var);
        } else {
            iArrU = u4p1.U(w9e1Var, w9e1Var.f, w9e1Var.c(), rectFV, iT, w9Var);
        }
        if (iArrU != null) {
            return e6p1.e(iArrU[0], iArrU[1]);
        }
        int i3 = nbe1.c;
        return b6p1.k();
    }

    public final float d() {
        return hjl.i(this.c);
    }

    public final void e(fid fidVar) {
        Canvas canvas = v84.a;
        Canvas canvas2 = ((u84) fidVar).a;
        w9e1 w9e1Var = this.d;
        if (w9e1Var.d) {
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, d(), this.f);
        }
        int i = w9e1Var.h;
        if (canvas2.getClipBounds(w9e1Var.o)) {
            if (i != 0) {
                canvas2.translate(0.0f, i);
            }
            ThreadLocal threadLocal = bae1.a;
            Object c0e1Var = threadLocal.get();
            if (c0e1Var == null) {
                c0e1Var = new c0e1();
                threadLocal.set(c0e1Var);
            }
            c0e1 c0e1Var2 = (c0e1) c0e1Var;
            c0e1Var2.a = canvas2;
            try {
                w9e1Var.f.draw(c0e1Var2);
                c0e1Var2.a = null;
                if (i != 0) {
                    canvas2.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                c0e1Var2.a = null;
                throw th;
            }
        }
        if (w9e1Var.d) {
            canvas2.restore();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f(fid fidVar, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) throws NoWhenBranchMatchedException {
        rw4 rw4Var = this.a;
        byte b = rw4Var.h().c;
        o45 o45VarH = rw4Var.h();
        o45VarH.d(j);
        o45VarH.f(shadow);
        o45VarH.g(textDecoration);
        o45VarH.e(drawStyle);
        o45VarH.b(3);
        new n5(this, (byte) 11).invoke(fidVar);
        rw4Var.h().b(b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void g(fid fidVar, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) throws NoWhenBranchMatchedException {
        rw4 rw4Var = this.a;
        byte b = rw4Var.h().c;
        o45 o45VarH = rw4Var.h();
        o45VarH.c(brush, (((long) Float.floatToRawIntBits(d())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        o45VarH.f(shadow);
        o45VarH.g(textDecoration);
        o45VarH.e(drawStyle);
        o45VarH.b(3);
        new n5(this, (byte) 12).invoke(fidVar);
        rw4Var.h().b(b);
    }
}
