package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class urx0 extends ktx0 {
    public final cwi0 a;

    public urx0(cwi0 cwi0Var) {
        this.a = cwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urx0) && this.a.equals(((urx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
