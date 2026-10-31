package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bj11 implements dj11 {
    public final boolean a;

    public bj11(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bj11) && this.a == ((bj11) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
