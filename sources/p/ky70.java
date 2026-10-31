package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ky70 {
    public final t3z0 a;
    public final Long b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final Function0 f;

    public ky70(t3z0 t3z0Var, Long l, Long l2, boolean z, boolean z2, Function0 function0) {
        this.a = t3z0Var;
        this.b = l;
        this.c = l2;
        this.d = z;
        this.e = z2;
        this.f = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky70)) {
            return false;
        }
        ky70 ky70Var = (ky70) obj;
        return u890.j(this.a, ky70Var.a) && u890.j(this.b, ky70Var.b) && u890.j(this.c, ky70Var.c) && this.d == ky70Var.d && this.e == ky70Var.e && u890.j(this.f, ky70Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return this.f.hashCode() + xcg1.g(xcg1.g((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
    }
}
