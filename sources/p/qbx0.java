package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qbx0 {
    public final String a;
    public final int b;
    public final String c;
    public final boolean d;
    public final j8x0 e;
    public final boolean f;
    public final String g;
    public final String h;
    public final int i;
    public final r830 j;
    public final boolean k;
    public final boolean l;

    public qbx0(String str, int i, String str2, boolean z, j8x0 j8x0Var, boolean z2, String str3, String str4, int i2, r830 r830Var, boolean z3, boolean z4) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = j8x0Var;
        this.f = z2;
        this.g = str3;
        this.h = str4;
        this.i = i2;
        this.j = r830Var;
        this.k = z3;
        this.l = z4;
    }

    public static qbx0 a(qbx0 qbx0Var, j8x0 j8x0Var, boolean z, int i, r830 r830Var, boolean z2, boolean z3, int i2) {
        String str = qbx0Var.a;
        int i3 = qbx0Var.b;
        String str2 = qbx0Var.c;
        boolean z4 = qbx0Var.d;
        if ((i2 & 16) != 0) {
            j8x0Var = qbx0Var.e;
        }
        j8x0 j8x0Var2 = j8x0Var;
        boolean z5 = (i2 & 32) != 0 ? qbx0Var.f : z;
        String str3 = qbx0Var.g;
        String str4 = qbx0Var.h;
        int i4 = (i2 & 256) != 0 ? qbx0Var.i : i;
        r830 r830Var2 = (i2 & 512) != 0 ? qbx0Var.j : r830Var;
        boolean z6 = (i2 & 1024) != 0 ? qbx0Var.k : z2;
        boolean z7 = (i2 & 2048) != 0 ? qbx0Var.l : z3;
        qbx0Var.getClass();
        return new qbx0(str, i3, str2, z4, j8x0Var2, z5, str3, str4, i4, r830Var2, z6, z7);
    }

    public final boolean b() {
        if (!this.k || this.b != 2) {
            return false;
        }
        j8x0 j8x0Var = this.e;
        List<v9x0> list = j8x0Var.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (v9x0 v9x0Var : list) {
            if ((v9x0Var instanceof obx0) && u890.j(((obx0) v9x0Var).a, jbx0.a)) {
                List<v9x0> list2 = j8x0Var.b;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return false;
                }
                for (v9x0 v9x0Var2 : list2) {
                    if ((v9x0Var2 instanceof obx0) && u890.j(((obx0) v9x0Var2).a, dbx0.a)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbx0)) {
            return false;
        }
        qbx0 qbx0Var = (qbx0) obj;
        return u890.j(this.a, qbx0Var.a) && this.b == qbx0Var.b && u890.j(this.c, qbx0Var.c) && this.d == qbx0Var.d && u890.j(this.e, qbx0Var.e) && this.f == qbx0Var.f && u890.j(this.g, qbx0Var.g) && u890.j(this.h, qbx0Var.h) && this.i == qbx0Var.i && this.j == qbx0Var.j && this.k == qbx0Var.k && this.l == qbx0Var.l;
    }

    public final int hashCode() {
        int iG = xcg1.g((this.e.hashCode() + xcg1.g(cy30.d(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return Boolean.hashCode(this.l) + xcg1.g((this.j.hashCode() + kaa0.f(this.i, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31, 31, this.k);
    }
}
