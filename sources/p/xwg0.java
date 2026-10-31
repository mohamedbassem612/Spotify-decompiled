package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xwg0 extends z0o1 {
    public final String c;

    public xwg0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xwg0) && this.c.equals(((xwg0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
