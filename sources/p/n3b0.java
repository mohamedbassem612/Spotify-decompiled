package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n3b0 extends z0o1 {
    public final String c;

    public n3b0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3b0) && u890.j(this.c, ((n3b0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("TypeAlias(name="), this.c, ')');
    }
}
