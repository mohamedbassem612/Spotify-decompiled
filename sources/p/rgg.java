package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rgg {
    public final int a;

    public rgg(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgg) && this.a == ((rgg) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
