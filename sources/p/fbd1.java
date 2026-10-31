package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fbd1 implements hbd1 {
    public final Function0 a;
    public final xu30 b;

    public fbd1(Function0 function0, xu30 xu30Var) {
        this.a = function0;
        this.b = xu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbd1)) {
            return false;
        }
        fbd1 fbd1Var = (fbd1) obj;
        return this.a.equals(fbd1Var.a) && this.b.equals(fbd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
