package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hs {
    public final boolean a;

    public hs(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hs) && this.a == ((hs) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
