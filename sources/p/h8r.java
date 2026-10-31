package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h8r extends d5p1 {
    public final String c;

    public h8r(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8r) && this.c.equals(((h8r) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String v() {
        return this.c;
    }
}
