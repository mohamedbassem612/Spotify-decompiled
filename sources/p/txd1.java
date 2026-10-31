package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class txd1 {
    public final String a;
    public final Function0 b;

    public txd1(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txd1)) {
            return false;
        }
        txd1 txd1Var = (txd1) obj;
        return u890.j(this.a, txd1Var.a) && u890.j(this.b, txd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
