package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cat0 {
    public final boolean a;

    public cat0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cat0) && this.a == ((cat0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
