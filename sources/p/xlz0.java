package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xlz0 {
    public final v3z0 a;
    public final boolean b;
    public final Function0 c;

    public xlz0(v3z0 v3z0Var, boolean z, Function0 function0) {
        this.a = v3z0Var;
        this.b = z;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlz0)) {
            return false;
        }
        xlz0 xlz0Var = (xlz0) obj;
        return u890.j(this.a, xlz0Var.a) && this.b == xlz0Var.b && u890.j(this.c, xlz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.a.hashCode() * 31, 31, this.b);
    }
}
