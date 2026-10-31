package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o1x0 extends fn31 {
    public final String g;

    public o1x0(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1x0) && u890.j(this.g, ((o1x0) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
