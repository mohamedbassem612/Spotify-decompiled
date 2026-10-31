package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fm0 {
    public final boolean a;

    public fm0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm0) && this.a == ((fm0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
