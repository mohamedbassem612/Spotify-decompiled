package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class an00 {
    public final Function0 a;
    public final Function0 b;

    public an00(Function0 function0, Function0 function1) {
        this.a = function0;
        this.b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an00)) {
            return false;
        }
        an00 an00Var = (an00) obj;
        return u890.j(this.a, an00Var.a) && u890.j(this.b, an00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
