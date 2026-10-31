package p;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lsm0 {
    public final String a;
    public final ksm0 b;
    public final boolean c;
    public final boolean d;
    public final jsm0 e;
    public final long f;
    public final ism0 g;
    public final String h;
    public final boolean i;
    public final int j;
    public final List k;

    public /* synthetic */ lsm0(String str, ksm0 ksm0Var, boolean z, boolean z2, jsm0 jsm0Var, long j, ism0 ism0Var, String str2, boolean z3, int i, int i2) {
        this(str, ksm0Var, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? null : jsm0Var, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? null : ism0Var, (i2 & 128) != 0 ? UUID.randomUUID().toString() : str2, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? 3 : i, (List) z6x.a);
    }

    public static lsm0 a(lsm0 lsm0Var, ksm0 ksm0Var, jsm0 jsm0Var, int i) {
        String str = lsm0Var.a;
        if ((i & 2) != 0) {
            ksm0Var = lsm0Var.b;
        }
        ksm0 ksm0Var2 = ksm0Var;
        boolean z = lsm0Var.c;
        boolean z2 = lsm0Var.d;
        if ((i & 16) != 0) {
            jsm0Var = lsm0Var.e;
        }
        long j = lsm0Var.f;
        ism0 ism0Var = lsm0Var.g;
        String str2 = lsm0Var.h;
        boolean z3 = lsm0Var.i;
        int i2 = lsm0Var.j;
        List list = lsm0Var.k;
        lsm0Var.getClass();
        return new lsm0(str, ksm0Var2, z, z2, jsm0Var, j, ism0Var, str2, z3, i2, list);
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsm0)) {
            return false;
        }
        lsm0 lsm0Var = (lsm0) obj;
        return u890.j(this.a, lsm0Var.a) && u890.j(this.b, lsm0Var.b) && this.c == lsm0Var.c && this.d == lsm0Var.d && u890.j(this.e, lsm0Var.e) && this.f == lsm0Var.f && u890.j(this.g, lsm0Var.g) && u890.j(this.h, lsm0Var.h) && this.i == lsm0Var.i && this.j == lsm0Var.j && u890.j(this.k, lsm0Var.k);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        jsm0 jsm0Var = this.e;
        int iF = cy30.f((iG + (jsm0Var == null ? 0 : jsm0Var.hashCode())) * 31, this.f, 31);
        ism0 ism0Var = this.g;
        return this.k.hashCode() + ab80.k(this.j, xcg1.g(cy30.d((iF + (ism0Var != null ? ism0Var.hashCode() : 0)) * 31, 31, this.h), 31, this.i), 31);
    }

    public lsm0(String str, ksm0 ksm0Var, boolean z, boolean z2, jsm0 jsm0Var, long j, ism0 ism0Var, String str2, boolean z3, int i, List list) {
        this.a = str;
        this.b = ksm0Var;
        this.c = z;
        this.d = z2;
        this.e = jsm0Var;
        this.f = j;
        this.g = ism0Var;
        this.h = str2;
        this.i = z3;
        this.j = i;
        this.k = list;
        if (j < 0 || jsm0Var != null) {
            if (j != 0 || jsm0Var == null) {
                eg.m("Either initialOffsetMs or clip must be set, but not both.");
                throw null;
            }
        }
    }
}
