package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ulf implements cmf {
    public final boolean a;

    public ulf(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ulf) && this.a == ((ulf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
