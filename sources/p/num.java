package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class num extends zgo1 {
    public final String c;

    public num(String str) {
        this.c = str;
    }

    public final String J() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof num) && u890.j(this.c, ((num) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
