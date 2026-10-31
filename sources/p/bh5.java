package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bh5 implements dh5 {
    public final boolean a;

    public bh5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh5) && this.a == ((bh5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
