package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mkh0 {
    public final boolean a;

    public mkh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkh0) && this.a == ((mkh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
