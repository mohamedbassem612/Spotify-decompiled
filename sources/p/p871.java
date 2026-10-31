package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p871 {
    public final String a;
    public final Function0 b;

    public p871(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p871)) {
            return false;
        }
        p871 p871Var = (p871) obj;
        return u890.j(this.a, p871Var.a) && u890.j(this.b, p871Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
