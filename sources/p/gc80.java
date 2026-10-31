package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gc80 {
    public final ji0 a;

    public gc80(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc80) && this.a.equals(((gc80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
