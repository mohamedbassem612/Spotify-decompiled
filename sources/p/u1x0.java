package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u1x0 extends fn31 {
    public final String g;

    public u1x0(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1x0) && this.g.equals(((u1x0) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
