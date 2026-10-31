package p;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y9e1 {
    public final x9e1 a;
    public final zrm0 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public y9e1(x9e1 x9e1Var, zrm0 zrm0Var, long j) {
        this.a = x9e1Var;
        this.b = zrm0Var;
        this.c = j;
        ArrayList arrayList = zrm0Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((sor0) arrayList.get(0)).a.d.d(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            sor0 sor0Var = (sor0) o7h.A0(arrayList);
            w9e1 w9e1Var = sor0Var.a.d;
            fD = w9e1Var.d(w9e1Var.g - 1) + 0.0f + sor0Var.f;
        }
        this.e = fD;
        this.f = zrm0Var.g;
    }

    public final int a(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.l(i);
        int length = zrm0Var.a.x().b.length();
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(i == length ? p7h.L(arrayList) : sjo0.q(i, arrayList));
        return sor0Var.a.d.f.isRtlCharAt(sor0Var.d(i)) ? 2 : 1;
    }

    public final n511 b(int i) {
        float fK;
        float fK2;
        float fJ;
        float fJ2;
        zrm0 zrm0Var = this.b;
        zrm0Var.k(i);
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.q(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int iD = sor0Var.d(i);
        CharSequence charSequence = nw4Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            rf80.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        w9e1 w9e1Var = nw4Var.d;
        int iG = w9e1Var.g(iD);
        float fI = w9e1Var.i(iG);
        float fE = w9e1Var.e(iG);
        Layout layout = w9e1Var.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fJ = w9e1Var.k(iD, false);
                fJ2 = w9e1Var.k(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = w9e1Var.j(iD, false);
                fJ2 = w9e1Var.j(iD + 1, true);
            } else {
                fK = w9e1Var.k(iD, false);
                fK2 = w9e1Var.k(iD + 1, true);
            }
            float f = fJ;
            fK = fJ2;
            fK2 = f;
        } else {
            fK = w9e1Var.j(iD, false);
            fK2 = w9e1Var.j(iD + 1, true);
        }
        RectF rectF = new RectF(fK, fI, fK2, fE);
        return sor0Var.a(new n511(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final n511 c(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.l(i);
        int length = zrm0Var.a.x().b.length();
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(i == length ? p7h.L(arrayList) : sjo0.q(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int iD = sor0Var.d(i);
        CharSequence charSequence = nw4Var.e;
        w9e1 w9e1Var = nw4Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            rf80.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fJ = w9e1Var.j(iD, false);
        int iG = w9e1Var.g(iD);
        return sor0Var.a(new n511(fJ, w9e1Var.i(iG) + 0.0f, fJ, w9e1Var.e(iG) + 0.0f));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        zrm0 zrm0Var = this.b;
        return f < zrm0Var.d || zrm0Var.c || ((float) ((int) (j & 4294967295L))) < zrm0Var.e;
    }

    public final float e(int i, boolean z) {
        zrm0 zrm0Var = this.b;
        zrm0Var.l(i);
        int length = zrm0Var.a.x().b.length();
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(i == length ? p7h.L(arrayList) : sjo0.q(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int iD = sor0Var.d(i);
        w9e1 w9e1Var = nw4Var.d;
        return z ? w9e1Var.j(iD, false) : w9e1Var.k(iD, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y9e1) {
            y9e1 y9e1Var = (y9e1) obj;
            if (this.a.equals(y9e1Var.a) && this.b == y9e1Var.b && yr80.b(this.c, y9e1Var.c) && this.d == y9e1Var.d && this.e == y9e1Var.e && this.f.equals(y9e1Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.m(i);
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        return nw4Var.d.d(i - sor0Var.d) + 0.0f + sor0Var.f;
    }

    public final float g(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.m(i);
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int i2 = i - sor0Var.d;
        w9e1 w9e1Var = nw4Var.d;
        return w9e1Var.f.getLineLeft(i2) + (i2 == w9e1Var.g + (-1) ? w9e1Var.j : 0.0f);
    }

    public final float h(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.m(i);
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int i2 = i - sor0Var.d;
        w9e1 w9e1Var = nw4Var.d;
        return w9e1Var.f.getLineRight(i2) + (i2 == w9e1Var.g + (-1) ? w9e1Var.k : 0.0f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x0d.f(x0d.f(cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e);
    }

    public final int i(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.m(i);
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        return nw4Var.d.f.getLineStart(i - sor0Var.d) + sor0Var.b;
    }

    public final int j(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.l(i);
        int length = zrm0Var.a.x().b.length();
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(i == length ? p7h.L(arrayList) : sjo0.q(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int iD = sor0Var.d(i);
        w9e1 w9e1Var = nw4Var.d;
        return w9e1Var.f.getParagraphDirection(w9e1Var.g(iD)) == 1 ? 1 : 2;
    }

    public final tw4 k(int i, int i2) {
        zrm0 zrm0Var = this.b;
        wp20 wp20Var = zrm0Var.a;
        if (i < 0 || i > i2 || i2 > wp20Var.x().b.length()) {
            int length = wp20Var.x().b.length();
            StringBuilder sbQ = cy30.q(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbQ.append(length);
            sbQ.append("), or start > end!");
            rf80.a(sbQ.toString());
        }
        if (i == i2) {
            return ww4.a();
        }
        tw4 tw4VarA = ww4.a();
        sjo0.t(zrm0Var.h, e6p1.e(i, i2), new u180(tw4VarA, i, i2, (byte) 3));
        return tw4VarA;
    }

    public final long l(int i) {
        zrm0 zrm0Var = this.b;
        zrm0Var.l(i);
        int length = zrm0Var.a.x().b.length();
        ArrayList arrayList = zrm0Var.h;
        sor0 sor0Var = (sor0) arrayList.get(i == length ? p7h.L(arrayList) : sjo0.q(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int iD = sor0Var.d(i);
        w4c0 w4c0VarL = nw4Var.d.l();
        return sor0Var.b(e6p1.e(jo31.n(iD, w4c0VarL), jo31.m(iD, w4c0VarL)), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + yr80.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
