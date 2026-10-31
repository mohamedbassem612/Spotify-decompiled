package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hkk0 implements ikk0 {
    public final duk1 a;
    public final int b;

    public hkk0(duk1 duk1Var, int i) {
        this.a = duk1Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkk0)) {
            return false;
        }
        hkk0 hkk0Var = (hkk0) obj;
        return this.a == hkk0Var.a && this.b == hkk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
