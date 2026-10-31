package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rw71 implements uw71 {
    public final int a;

    public rw71(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw71) && this.a == ((rw71) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
