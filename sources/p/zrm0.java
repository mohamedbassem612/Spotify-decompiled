package p;

import android.text.Layout;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zrm0 {
    public final wp20 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public zrm0(wp20 wp20Var, long j, int i, int i2) {
        boolean z;
        int iH;
        this.a = wp20Var;
        this.b = i;
        if (hjl.k(j) != 0 || hjl.j(j) != 0) {
            rf80.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List listA = wp20Var.A();
        int size = listA.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                z = false;
                break;
            }
            tor0 tor0Var = (tor0) ((ArrayList) listA).get(i4);
            rw4 rw4Var = tor0Var.a;
            int i5 = hjl.i(j);
            if (hjl.d(j)) {
                iH = hjl.h(j) - sjo0.k(f);
                if (iH < 0) {
                    iH = 0;
                }
            } else {
                iH = hjl.h(j);
            }
            nw4 nw4VarJ = vgo1.j(rw4Var, jjl.b(0, i5, 0, iH, 5), this.b - i3, i2);
            w9e1 w9e1Var = nw4VarJ.d;
            float f2 = f + nw4VarJ.f;
            int i6 = i3 + w9e1Var.g;
            arrayList.add(new sor0(nw4VarJ, tor0Var.b, tor0Var.c, i3, i6, f, f2));
            if (w9e1Var.d || (i6 == this.b && i4 != p7h.L(this.a.A()))) {
                z = true;
                i3 = i6;
                f = f2;
                break;
            } else {
                i4++;
                i3 = i6;
                f = f2;
            }
        }
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = hjl.i(j);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            sor0 sor0Var = (sor0) arrayList.get(i7);
            List list = sor0Var.a.g;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i8 = 0; i8 < size3; i8++) {
                n511 n511Var = (n511) list.get(i8);
                arrayList3.add(n511Var != null ? sor0Var.a(n511Var) : null);
            }
            r7h.W(arrayList3, arrayList2);
        }
        if (arrayList2.size() < this.a.C().size()) {
            int size4 = this.a.C().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i9 = 0; i9 < size4; i9++) {
                arrayList4.add(null);
            }
            arrayList2 = o7h.N0(arrayList4, arrayList2);
        }
        this.g = arrayList2;
    }

    public final void a(long j, float[] fArr) {
        k(nbe1.g(j));
        l(nbe1.f(j));
        n811 n811Var = new n811();
        n811Var.a = 0;
        sjo0.t(this.h, j, new nqb(j, fArr, n811Var, new m811()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        return nw4Var.d.e(i - sor0Var.d) + sor0Var.f;
    }

    public final int c(int i, boolean z) {
        m(i);
        ArrayList arrayList = this.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        return sor0Var.a.b(i - sor0Var.d, z) + sor0Var.b;
    }

    public final int d(int i) {
        int iQ;
        int length = this.a.x().b.length();
        ArrayList arrayList = this.h;
        if (i >= length) {
            iQ = p7h.L(arrayList);
        } else {
            iQ = i < 0 ? 0 : sjo0.q(i, arrayList);
        }
        sor0 sor0Var = (sor0) arrayList.get(iQ);
        return sor0Var.a.d.g(sor0Var.d(i)) + sor0Var.d;
    }

    public final int e(float f) {
        int lineForVertical;
        ArrayList arrayList = this.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.s(f, arrayList));
        int i = sor0Var.c - sor0Var.b;
        int i2 = sor0Var.d;
        if (i == 0) {
            return i2;
        }
        nw4 nw4Var = sor0Var.a;
        float f2 = f - sor0Var.f;
        w9e1 w9e1Var = nw4Var.d;
        int i3 = (int) (f2 - 0.0f);
        int i4 = w9e1Var.g;
        if (i4 <= 0) {
            lineForVertical = 0;
        } else {
            lineForVertical = w9e1Var.f.getLineForVertical(i3 - w9e1Var.h);
            int i5 = i4 - 1;
            if (lineForVertical > i5) {
                lineForVertical = i5;
            }
        }
        return lineForVertical + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        return nw4Var.d.i(i - sor0Var.d) + sor0Var.f;
    }

    public final int g(long j) {
        int offsetForHorizontal;
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.s(fIntBitsToFloat, arrayList));
        int i2 = sor0Var.c;
        int i3 = sor0Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        nw4 nw4Var = sor0Var.a;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat(i) - sor0Var.f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        w9e1 w9e1Var = nw4Var.d;
        int iIntBitsToFloat = (int) (Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) - 0.0f);
        Layout layout = w9e1Var.f;
        int lineForVertical = layout.getLineForVertical(iIntBitsToFloat - w9e1Var.h);
        if (lineForVertical >= w9e1Var.g) {
            offsetForHorizontal = layout.getText().length();
        } else {
            offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (w9e1Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        }
        return offsetForHorizontal + i3;
    }

    public final long h(n511 n511Var, int i, t8e1 t8e1Var) {
        float f = n511Var.b;
        ArrayList arrayList = this.h;
        int iS = sjo0.s(f, arrayList);
        float f2 = ((sor0) arrayList.get(iS)).g;
        float f3 = n511Var.d;
        if (f2 >= f3 || iS == p7h.L(arrayList)) {
            sor0 sor0Var = (sor0) arrayList.get(iS);
            return sor0Var.b(sor0Var.a.c(sor0Var.c(n511Var), i, t8e1Var), true);
        }
        int iS2 = sjo0.s(f3, arrayList);
        int i2 = nbe1.c;
        long jK = b6p1.k();
        while (true) {
            int i3 = nbe1.c;
            if (!nbe1.c(jK, b6p1.k()) || iS > iS2) {
                break;
            }
            sor0 sor0Var2 = (sor0) arrayList.get(iS);
            jK = sor0Var2.b(sor0Var2.a.c(sor0Var2.c(n511Var), i, t8e1Var), true);
            iS++;
        }
        if (nbe1.c(jK, b6p1.k())) {
            return b6p1.k();
        }
        long jK2 = b6p1.k();
        while (true) {
            int i4 = nbe1.c;
            if (!nbe1.c(jK2, b6p1.k()) || iS > iS2) {
                break;
            }
            sor0 sor0Var3 = (sor0) arrayList.get(iS2);
            jK2 = sor0Var3.b(sor0Var3.a.c(sor0Var3.c(n511Var), i, t8e1Var), true);
            iS2--;
        }
        return nbe1.c(jK2, b6p1.k()) ? jK : e6p1.e((int) (jK >> 32), (int) (4294967295L & jK2));
    }

    public final boolean i(int i) {
        m(i);
        ArrayList arrayList = this.h;
        sor0 sor0Var = (sor0) arrayList.get(sjo0.r(i, arrayList));
        nw4 nw4Var = sor0Var.a;
        int i2 = i - sor0Var.d;
        Layout layout = nw4Var.d.f;
        ThreadLocal threadLocal = bae1.a;
        return layout.getEllipsisCount(i2) > 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void j(fid fidVar, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle) throws NoWhenBranchMatchedException {
        fidVar.q();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sor0 sor0Var = (sor0) arrayList.get(i);
            sor0Var.a.f(fidVar, j, shadow, textDecoration, drawStyle);
            fidVar.h(0.0f, sor0Var.a.f);
        }
        fidVar.i();
    }

    public final void k(int i) {
        wp20 wp20Var = this.a;
        if (i < 0 || i >= wp20Var.x().b.length()) {
            rf80.a("offset(" + i + ") is out of bounds [0, " + wp20Var.x().b.length() + ")");
        }
    }

    public final void l(int i) {
        wp20 wp20Var = this.a;
        if (i < 0 || i > wp20Var.x().b.length()) {
            rf80.a("offset(" + i + ") is out of bounds [0, " + wp20Var.x().b.length() + "]");
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        rf80.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ")");
    }
}
