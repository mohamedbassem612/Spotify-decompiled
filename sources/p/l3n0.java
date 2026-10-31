package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l3n0 {
    public final u3z0 a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Function0 e;

    public l3n0(u3z0 u3z0Var, boolean z, boolean z2, String str, Function0 function0) {
        this.a = u3z0Var;
        this.b = z;
        this.c = z2;
        this.d = str;
        this.e = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3n0)) {
            return false;
        }
        l3n0 l3n0Var = (l3n0) obj;
        return u890.j(this.a, l3n0Var.a) && this.b == l3n0Var.b && this.c == l3n0Var.c && u890.j(this.d, l3n0Var.d) && u890.j(this.e, l3n0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ l3n0(u3z0 u3z0Var, boolean z, boolean z2) {
        this(u3z0Var, z, z2, null, fsm0.i);
    }
}
