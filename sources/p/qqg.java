package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qqg {
    public final String a;
    public final tr80 b;
    public final String c;

    public qqg(String str, tr80 tr80Var, String str2) {
        this.a = str;
        this.b = tr80Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqg)) {
            return false;
        }
        qqg qqgVar = (qqg) obj;
        return u890.j(this.a, qqgVar.a) && u890.j(this.b, qqgVar.b) && this.c.equals(qqgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + lf51.e(this.a.hashCode() * 31, 31, this.b);
    }
}
