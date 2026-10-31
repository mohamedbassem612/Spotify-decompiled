package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a0v0 {
    public final boolean a;

    public a0v0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0v0) && this.a == ((a0v0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
