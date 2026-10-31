package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yse {
    public final xse a;
    public final int b;

    public yse(xse xseVar, int i) {
        this.a = xseVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yse)) {
            return false;
        }
        yse yseVar = (yse) obj;
        return this.a.equals(yseVar.a) && this.b == yseVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
