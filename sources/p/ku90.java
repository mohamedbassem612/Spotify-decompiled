package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ku90 implements lu90 {
    public final long a;

    public ku90(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku90) && this.a == ((ku90) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
