package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l7t extends cbp1 {
    public final String c;

    public l7t(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7t) && u890.j(this.c, ((l7t) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
