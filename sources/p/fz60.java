package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fz60 implements oz60 {
    public final az60 a;

    public fz60(az60 az60Var) {
        this.a = az60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz60) && this.a.equals(((fz60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
