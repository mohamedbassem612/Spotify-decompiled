package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nn6 extends ujo1 {
    public final String c;

    public nn6(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn6) && this.c.equals(((nn6) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
