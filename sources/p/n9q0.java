package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n9q0 implements p9q0 {
    public final boolean a;

    public n9q0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9q0) && this.a == ((n9q0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
