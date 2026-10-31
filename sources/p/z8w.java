package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z8w extends w0o1 {
    public final String c;

    public z8w(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z8w) && u890.j(this.c, ((z8w) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
