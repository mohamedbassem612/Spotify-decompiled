package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rio extends two1 {
    public final String c;

    public rio(String str) {
        this.c = str;
    }

    public final String E() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rio) && this.c.equals(((rio) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
