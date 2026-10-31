package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nnd1 extends czo1 {
    public final int c;
    public final String d;

    public nnd1(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnd1)) {
            return false;
        }
        nnd1 nnd1Var = (nnd1) obj;
        return this.c == nnd1Var.c && u890.j(this.d, nnd1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }
}
