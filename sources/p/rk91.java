package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rk91 extends yk91 {
    public final long a;

    public rk91(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk91) && this.a == ((rk91) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }
}
