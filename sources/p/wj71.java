package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wj71 extends z1p1 {
    public final int c;
    public final String d;

    public wj71(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj71)) {
            return false;
        }
        wj71 wj71Var = (wj71) obj;
        return this.c == wj71Var.c && this.d.equals(wj71Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }
}
