package p;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hwg {
    public final k89 a;
    public final boolean b;
    public final int c;
    public final kr50 d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final List n;

    public hwg(k89 k89Var, boolean z, int i, kr50 kr50Var, boolean z2, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, int i5, int i6, List list) {
        this.a = k89Var;
        this.b = z;
        this.c = i;
        this.d = kr50Var;
        this.e = z2;
        this.f = i2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = list;
    }

    public final int a(String str) {
        if (nhc1.Y(str, "av01", true)) {
            return this.j;
        }
        if (nhc1.Y(str, "avc1", true)) {
            return this.k;
        }
        if (nhc1.Y(str, "vp09", true) || nhc1.Y(str, "vp9", true)) {
            return this.l;
        }
        if (nhc1.Y(str, "hev1", true) || nhc1.Y(str, "hvc1", true)) {
            return this.m;
        }
        return -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean b() throws NoWhenBranchMatchedException {
        int iC = l1d.C(this.c);
        if (iC == 0) {
            return true;
        }
        if (iC == 1) {
            return this.b;
        }
        if (iC == 2) {
            return false;
        }
        eg.o();
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean c(String str, String str2) throws NoWhenBranchMatchedException {
        Integer numB;
        if (!(str2.equals("av1") ? b() : str2.equals("h265") ? d() : true)) {
            return false;
        }
        if (str2.equals("av1")) {
            List list = this.n;
            if (!list.isEmpty()) {
                Map map = i89.e;
                i89 i89VarR = l0p1.r(str);
                if (i89VarR == null || (numB = i89VarR.b()) == null) {
                    return false;
                }
                int iIntValue = numB.intValue();
                Integer numA = i89VarR.a();
                List<mmr0> list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                for (mmr0 mmr0Var : list2) {
                    int iIntValue2 = ((Number) mmr0Var.a).intValue();
                    int iIntValue3 = ((Number) mmr0Var.b).intValue();
                    if (iIntValue2 != iIntValue || (numA != null && iIntValue3 < numA.intValue())) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean d() throws NoWhenBranchMatchedException {
        int iC = l1d.C(this.f);
        if (iC == 0) {
            return true;
        }
        if (iC == 1) {
            return this.e;
        }
        if (iC == 2) {
            return false;
        }
        eg.o();
        return false;
    }

    public final boolean e(boolean z) {
        if (this.d != kr50.a && d()) {
            return b() && this.a == k89.c && z;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwg)) {
            return false;
        }
        hwg hwgVar = (hwg) obj;
        return this.a == hwgVar.a && this.b == hwgVar.b && this.c == hwgVar.c && this.d == hwgVar.d && this.e == hwgVar.e && this.f == hwgVar.f && this.g == hwgVar.g && this.h == hwgVar.h && this.i == hwgVar.i && this.j == hwgVar.j && this.k == hwgVar.k && this.l == hwgVar.l && this.m == hwgVar.m && this.n.equals(hwgVar.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + kaa0.f(this.m, kaa0.f(this.l, kaa0.f(this.k, kaa0.f(this.j, xcg1.g(xcg1.g(xcg1.g(ab80.k(this.f, xcg1.g((this.d.hashCode() + ab80.k(this.c, xcg1.g(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31), 31), 31), 31);
    }
}
