package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rpj1 {
    public final boolean a;

    public rpj1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rpj1) && this.a == ((rpj1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
