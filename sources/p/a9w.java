package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a9w extends z0o1 {
    public final String c;

    public a9w(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9w) && u890.j(this.c, ((a9w) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
