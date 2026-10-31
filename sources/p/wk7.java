package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wk7 extends xk7 {
    public final String b;
    public final String c;

    public wk7(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk7)) {
            return false;
        }
        wk7 wk7Var = (wk7) obj;
        return this.b.equals(wk7Var.b) && this.c.equals(wk7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String m() {
        return this.b;
    }
}
