package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wdh0 implements xdh0 {
    public final pfj1 a;

    public wdh0(pfj1 pfj1Var) {
        this.a = pfj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdh0) && this.a.equals(((wdh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
