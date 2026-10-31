package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rif0 implements yif0 {
    public final int a;

    public rif0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rif0) && this.a == ((rif0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
