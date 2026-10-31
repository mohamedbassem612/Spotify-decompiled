package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l9w extends q0o1 {
    public final String c;

    public l9w(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l9w) && u890.j(this.c, ((l9w) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
