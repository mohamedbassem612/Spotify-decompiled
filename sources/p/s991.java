package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s991 {
    public final boolean a;
    public final d991 b;

    public s991(boolean z, d991 d991Var) {
        this.a = z;
        this.b = d991Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s991)) {
            return false;
        }
        s991 s991Var = (s991) obj;
        return this.a == s991Var.a && this.b == s991Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
