package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8z0 extends z8z0 {
    public final boolean a;

    public h8z0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8z0) && this.a == ((h8z0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
