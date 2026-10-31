package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o4w0 implements qzw {
    public final ji0 a;

    public o4w0(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4w0) && u890.j(this.a, ((o4w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
