package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ukf1 implements ez00 {
    public final eg51 a;

    public ukf1(eg51 eg51Var) {
        this.a = eg51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ukf1) && this.a.equals(((ukf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
