package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bcu implements dcu {
    public final boolean a;

    public bcu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcu) && this.a == ((bcu) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
