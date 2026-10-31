package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eq6 extends x2s {
    public final r6h1 b;

    public eq6(r6h1 r6h1Var) {
        super(vap1.g);
        this.b = r6h1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq6) && this.b.equals(((eq6) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
