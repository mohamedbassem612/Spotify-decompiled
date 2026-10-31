package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ekk0 implements ikk0 {
    public final rx30 a;
    public final int b;

    public ekk0(rx30 rx30Var, int i) {
        this.a = rx30Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekk0)) {
            return false;
        }
        ekk0 ekk0Var = (ekk0) obj;
        return this.a == ekk0Var.a && this.b == ekk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
