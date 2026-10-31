package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mc20 implements oc20 {
    public final xo20 a;

    public mc20(xo20 xo20Var) {
        this.a = xo20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc20) && u890.j(this.a, ((mc20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
