package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bkt implements dkt {
    public final boolean a;

    public bkt(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkt) && this.a == ((bkt) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
