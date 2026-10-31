package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eje0 {
    public final aoe0 a;
    public final Function0 b;
    public final Function0 c;

    public eje0(aoe0 aoe0Var, Function0 function0, Function0 function1) {
        this.a = aoe0Var;
        this.b = function0;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eje0)) {
            return false;
        }
        eje0 eje0Var = (eje0) obj;
        return this.a.equals(eje0Var.a) && u890.j(this.b, eje0Var.b) && u890.j(this.c, eje0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rjx.n(this.a.hashCode() * 31, 31, this.b);
    }
}
