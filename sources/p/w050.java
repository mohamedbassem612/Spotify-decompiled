package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w050 implements z050 {
    public final j331 a;

    public w050(j331 j331Var) {
        this.a = j331Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w050) && this.a.equals(((w050) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
