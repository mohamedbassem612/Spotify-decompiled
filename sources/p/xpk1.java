package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xpk1 {
    public final String a;
    public final Function0 b;

    public xpk1(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpk1)) {
            return false;
        }
        xpk1 xpk1Var = (xpk1) obj;
        return u890.j(this.a, xpk1Var.a) && u890.j(this.b, xpk1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
