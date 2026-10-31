package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b9w extends q0o1 {
    public final String c;

    public b9w(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9w) && u890.j(this.c, ((b9w) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
