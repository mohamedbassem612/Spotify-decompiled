package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h2p0 {
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Function0 f;
    public final y3o0 g;
    public final ym h;

    public h2p0(boolean z, Integer num, boolean z2, boolean z3, boolean z4, Function0 function0, y3o0 y3o0Var, ym ymVar) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = function0;
        this.g = y3o0Var;
        this.h = ymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h2p0) {
            h2p0 h2p0Var = (h2p0) obj;
            return this.a == h2p0Var.a && u890.j(this.b, h2p0Var.b) && this.c == h2p0Var.c && this.d == h2p0Var.d && this.e == h2p0Var.e && u890.j(this.f, h2p0Var.f) && this.g == h2p0Var.g && this.h == h2p0Var.h;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iG = xcg1.g(xcg1.g(xcg1.g((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        Function0 function0 = this.f;
        return this.h.hashCode() + ((this.g.hashCode() + ((iG + (function0 != null ? function0.hashCode() : 0)) * 31)) * 31);
    }
}
