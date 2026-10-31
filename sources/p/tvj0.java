package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tvj0 implements uvj0 {
    public final duk1 a;
    public final int b;

    public tvj0(duk1 duk1Var, int i) {
        this.a = duk1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvj0)) {
            return false;
        }
        tvj0 tvj0Var = (tvj0) obj;
        return this.a == tvj0Var.a && this.b == tvj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
