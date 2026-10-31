package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iv31 implements bw31 {
    public final oh90 a;
    public final String b;

    public iv31(oh90 oh90Var) {
        String str = oh90Var.a;
        this.a = oh90Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv31)) {
            return false;
        }
        iv31 iv31Var = (iv31) obj;
        return this.a.equals(iv31Var.a) && this.b.equals(iv31Var.b);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
