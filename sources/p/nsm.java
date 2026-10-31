package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nsm {
    public final boolean a;

    public nsm(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nsm) && this.a == ((nsm) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
