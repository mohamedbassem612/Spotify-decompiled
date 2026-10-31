package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u1z0 {
    public final k1z0 a;
    public final t1z0 b;
    public final Long c;
    public final Long d;
    public final boolean e;
    public final Function0 f;

    public u1z0(k1z0 k1z0Var, t1z0 t1z0Var, Long l, Long l2, boolean z, Function0 function0) {
        this.a = k1z0Var;
        this.b = t1z0Var;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1z0)) {
            return false;
        }
        u1z0 u1z0Var = (u1z0) obj;
        return u890.j(this.a, u1z0Var.a) && this.b.equals(u1z0Var.b) && u890.j(this.c, u1z0Var.c) && u890.j(this.d, u1z0Var.d) && this.e == u1z0Var.e && u890.j(this.f, u1z0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        return this.f.hashCode() + xcg1.g((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.e);
    }
}
