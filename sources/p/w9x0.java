package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w9x0 extends yax0 {
    public final String a;
    public final String b;

    public w9x0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9x0)) {
            return false;
        }
        w9x0 w9x0Var = (w9x0) obj;
        return this.a.equals(w9x0Var.a) && u890.j(this.b, w9x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
