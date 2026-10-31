package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u751 {
    public final int a;
    public final long b;
    public final int c;
    public final Function0 d;
    public boolean e;
    public boolean f = false;

    public u751(int i, long j, int i2, Function0 function0, boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = function0;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u751)) {
            return false;
        }
        u751 u751Var = (u751) obj;
        return this.a == u751Var.a && this.b == u751Var.b && this.c == u751Var.c && this.d.equals(u751Var.d) && this.e == u751Var.e && this.f == u751Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + xcg1.g(rjx.n(kaa0.f(this.c, cy30.f(Integer.hashCode(this.a) * 31, this.b, 31), 31), 31, this.d), 31, this.e);
    }
}
