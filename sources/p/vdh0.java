package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdh0 implements xdh0 {
    public final pfj1 a;

    public vdh0(pfj1 pfj1Var) {
        this.a = pfj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdh0) && this.a.equals(((vdh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
