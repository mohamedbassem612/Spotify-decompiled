package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class he61 implements ie61 {
    public final lg61 a;
    public final lg61 b;

    public he61(lg61 lg61Var, lg61 lg61Var2) {
        this.a = lg61Var;
        this.b = lg61Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he61)) {
            return false;
        }
        he61 he61Var = (he61) obj;
        return this.a.equals(he61Var.a) && this.b.equals(he61Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
