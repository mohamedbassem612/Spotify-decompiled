package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i4f extends m4f {
    public final String c;

    public i4f(String str) {
        super(gpx.c, null);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4f) && u890.j(this.c, ((i4f) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
