package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kqg1 {
    public final dn90 a;
    public final Function0 b;

    public kqg1(dn90 dn90Var, Function0 function0) {
        this.a = dn90Var;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqg1)) {
            return false;
        }
        kqg1 kqg1Var = (kqg1) obj;
        return this.a.equals(kqg1Var.a) && u890.j(this.b, kqg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
