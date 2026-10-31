package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lhw implements fiw {
    public final c8e0 a;

    public lhw(c8e0 c8e0Var) {
        this.a = c8e0Var;
    }

    public final c8e0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lhw) && this.a.equals(((lhw) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
