package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lgn0 {
    public final String a;
    public final iu30 b;
    public final Function0 c;

    public lgn0(String str, iu30 iu30Var, Function0 function0) {
        this.a = str;
        this.b = iu30Var;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lgn0)) {
            return false;
        }
        lgn0 lgn0Var = (lgn0) obj;
        return u890.j(this.a, lgn0Var.a) && u890.j(this.b, lgn0Var.b) && u890.j(this.c, lgn0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
