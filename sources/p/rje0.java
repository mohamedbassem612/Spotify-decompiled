package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rje0 extends e9p1 {
    public final String c;

    public rje0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rje0) && this.c.equals(((rje0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
