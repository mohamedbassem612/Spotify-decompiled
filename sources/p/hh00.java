package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hh00 extends mh00 {
    public final boolean a;

    public hh00(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh00) && this.a == ((hh00) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }
}
