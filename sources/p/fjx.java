package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fjx {
    public final boolean a;

    public fjx(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjx) && this.a == ((fjx) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
