package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wtj1 implements cuj1 {
    public final bm31 a;

    public wtj1(bm31 bm31Var) {
        this.a = bm31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtj1) && this.a.equals(((wtj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
