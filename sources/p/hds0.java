package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class hds0 {
    public static final gds0 Companion = new gds0();
    public static final znb0[] h = {dm5.S(2, v0r0.U0), null, null, null, null, null, null};
    public final List a;
    public final rds0 b;
    public final kds0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public /* synthetic */ hds0(int i, List list, rds0 rds0Var, kds0 kds0Var, boolean z, boolean z2, boolean z3, int i2) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, fds0.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = rds0Var;
        this.c = kds0Var;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z3;
        }
        if ((i & 64) == 0) {
            this.g = 3;
        } else {
            this.g = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hds0)) {
            return false;
        }
        hds0 hds0Var = (hds0) obj;
        return u890.j(this.a, hds0Var.a) && u890.j(this.b, hds0Var.b) && u890.j(this.c, hds0Var.c) && this.d == hds0Var.d && this.e == hds0Var.e && this.f == hds0Var.f && this.g == hds0Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xcg1.g(xcg1.g(xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public hds0(List list, rds0 rds0Var, kds0 kds0Var, boolean z, boolean z2, boolean z3, int i) {
        this.a = list;
        this.b = rds0Var;
        this.c = kds0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = i;
    }
}
