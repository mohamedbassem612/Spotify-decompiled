package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rwy extends swy {
    public final int a;

    public rwy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwy) && this.a == ((rwy) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
