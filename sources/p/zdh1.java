package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zdh1 extends f6o1 {
    public final String g;

    public zdh1(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zdh1) && this.g.equals(((zdh1) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
