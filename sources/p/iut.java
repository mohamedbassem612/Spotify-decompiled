package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iut extends dug {
    public final String c;

    public iut(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iut) && u890.j(this.c, ((iut) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
