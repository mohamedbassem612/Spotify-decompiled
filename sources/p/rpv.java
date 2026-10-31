package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rpv {
    public final boolean a;

    public rpv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpv) && this.a == ((rpv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
