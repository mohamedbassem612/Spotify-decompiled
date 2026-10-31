package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class o7j0 implements vbd0 {
    public final boolean a;

    public o7j0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o7j0) && this.a == ((o7j0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
