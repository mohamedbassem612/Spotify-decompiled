package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xvv implements awv {
    public final boolean a;

    public xvv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvv) && this.a == ((xvv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
