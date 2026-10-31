package p;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w9e1 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public w4c0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final thc0[] n;
    public final Rect o = new Rect();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ur00 f132p;

    /* JADX WARN: Code duplicated, block: B:82:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    public w9e1(CharSequence charSequence, float f, o45 o45Var, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, olb0 olb0Var) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutD;
        boolean z2;
        int i10;
        thc0[] thc0VarArr;
        int i11;
        int i12;
        long jA;
        int i13;
        long jA2;
        long jA3;
        int i14;
        Paint.FontMetricsInt fontMetricsInt;
        thc0 thc0Var;
        thc0 thc0Var2;
        int i15;
        this.a = o45Var;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = bae1.b(i2);
        Layout.Alignment alignment = b0e1.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : b0e1.b : b0e1.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, oda.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            if (!olb0Var.g) {
                olb0Var.f = b2u.v(olb0Var.a, olb0Var.b, bae1.b(olb0Var.c));
                olb0Var.g = true;
            }
            Layout.Alignment alignment3 = alignment2;
            BoringLayout.Metrics metrics = olb0Var.f;
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metrics == null || olb0Var.a() > f || z3) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutD = q1o1.d(new vrb1(charSequence, charSequence.length(), o45Var, iCeil, textDirectionHeuristic, alignment3, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7));
                z2 = false;
            } else {
                layoutD = b2u.n(iCeil, iCeil, metrics, alignment3, o45Var, truncateAt, charSequence, z);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                z2 = true;
            }
            this.f = layoutD;
            Trace.endSection();
            int iMin = Math.min(layoutD.getLineCount(), i9);
            this.g = iMin;
            int i16 = iMin - 1;
            this.d = iMin >= i9 && (layoutD.getEllipsisCount(i16) > 0 || layoutD.getLineEnd(i16) != charSequence.length());
            if ((layoutD.getText() instanceof Spanned) && (z1a1.m((Spanned) layoutD.getText(), thc0.class) || layoutD.getText().length() <= 0)) {
                i10 = 0;
                thc0VarArr = (thc0[]) ((Spanned) layoutD.getText()).getSpans(0, layoutD.getText().length(), thc0.class);
            } else {
                thc0VarArr = null;
                i10 = 0;
            }
            this.n = thc0VarArr;
            if (thc0VarArr == null || (thc0Var2 = (thc0) f46.k0(thc0VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (thc0Var2.e()) {
                    i11 = 2;
                    i15 = qhc0.b(thc0Var2.d(), 2) ? 1 : i15;
                    i12 = i15;
                } else {
                    i11 = 2;
                }
                i15 = i10;
                i12 = i15;
            }
            int i17 = (thc0VarArr == null || (thc0Var = (thc0) f46.k0(thc0VarArr)) == null || !thc0Var.f() || !qhc0.b(thc0Var.d(), i11)) ? i10 : 1;
            if (i12 == 0 || i17 == 0) {
                jA = bae1.b;
                if (z) {
                    i13 = 1;
                    jA2 = jA;
                } else {
                    if (z2 ? b2u.s((BoringLayout) layoutD) : q1o1.s((StaticLayout) layoutD)) {
                        i13 = 1;
                    } else {
                        TextPaint paint = layoutD.getPaint();
                        CharSequence text = layoutD.getText();
                        Rect rectL = f3o1.l(paint, text, layoutD.getLineStart(i10), layoutD.getLineEnd(i10));
                        int lineAscent = layoutD.getLineAscent(i10);
                        int i18 = rectL.top;
                        int topPadding = i18 < lineAscent ? lineAscent - i18 : layoutD.getTopPadding();
                        i13 = 1;
                        rectL = iMin != 1 ? f3o1.l(paint, text, layoutD.getLineStart(i16), layoutD.getLineEnd(i16)) : rectL;
                        int lineDescent = layoutD.getLineDescent(i16);
                        int i19 = rectL.bottom;
                        int bottomPadding = i19 > lineDescent ? i19 - lineDescent : layoutD.getBottomPadding();
                        jA2 = (topPadding == 0 && bottomPadding == 0) ? jA2 : bae1.a(topPadding, bottomPadding);
                    }
                    jA2 = jA;
                }
                jA3 = bae1.a(i12 != 0 ? i10 : j1p1.r(jA2), i17 != 0 ? i10 : j1p1.p(jA2));
            } else {
                jA3 = bae1.b;
                jA = jA3;
                i13 = 1;
            }
            if (thc0VarArr != null) {
                int length2 = thc0VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i20 = iMax2; i20 < length2; i20++) {
                    thc0 thc0Var3 = thc0VarArr[i20];
                    iMax = thc0Var3.b() < 0 ? Math.max(iMax, Math.abs(thc0Var3.b())) : iMax;
                    if (thc0Var3.c() < 0) {
                        iMax2 = Math.max(iMax, Math.abs(thc0Var3.c()));
                    }
                }
                jA = (iMax == 0 && iMax2 == 0) ? bae1.b : bae1.a(iMax, iMax2);
            }
            this.h = Math.max(j1p1.r(jA3), j1p1.r(jA));
            this.i = Math.max(j1p1.p(jA3), j1p1.p(jA));
            TextPaint textPaint = this.a;
            thc0[] thc0VarArr2 = this.n;
            int i21 = this.g - i13;
            Layout layout = this.f;
            if (layout.getLineStart(i21) != layout.getLineEnd(i21) || thc0VarArr2 == null || thc0VarArr2.length == 0) {
                i14 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                thc0 thc0Var4 = (thc0) f46.j0(thc0VarArr2);
                spannableString.setSpan(thc0Var4.a(spannableString.length(), (i21 == 0 || !thc0Var4.f()) ? thc0Var4.f() : i10), i10, spannableString.length(), 33);
                i14 = i10;
                StaticLayout staticLayoutD = q1o1.d(new vrb1(spannableString, spannableString.length(), textPaint, Integer.MAX_VALUE, textDirectionHeuristic, alb0.a(), Integer.MAX_VALUE, (TextUtils.TruncateAt) null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0));
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutD.getLineAscent(i14);
                fontMetricsInt.descent = staticLayoutD.getLineDescent(i14);
                fontMetricsInt.top = staticLayoutD.getLineTop(i14);
                fontMetricsInt.bottom = staticLayoutD.getLineBottom(i14);
            }
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) h(i16)) : i14;
            this.l = fontMetricsInt;
            this.j = r4p1.o(this.f, i16);
            this.k = r4p1.q(this.f, i16);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final ur00 c() {
        ur00 ur00Var = this.f132p;
        if (ur00Var != null) {
            return ur00Var;
        }
        ur00 ur00Var2 = new ur00(this.f);
        this.f132p = ur00Var2;
        return ur00Var2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.l) == null) ? this.f.getLineBaseline(i) : i(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = bae1.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return e(i) - i(i);
    }

    public final float i(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().l(i, true, z);
    }

    public final float k(int i, boolean z) {
        return b(g(i)) + c().l(i, false, z);
    }

    public final w4c0 l() {
        w4c0 w4c0Var = this.e;
        if (w4c0Var != null) {
            return w4c0Var;
        }
        Layout layout = this.f;
        w4c0 w4c0Var2 = new w4c0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = w4c0Var2;
        return w4c0Var2;
    }
}
