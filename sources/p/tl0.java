package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tl0 {
    public final int a;
    public final String b;
    public final String c;
    public final lax d;

    public tl0(int i, String str, String str2, lax laxVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = laxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl0)) {
            return false;
        }
        tl0 tl0Var = (tl0) obj;
        return this.a == tl0Var.a && u890.j(this.b, tl0Var.b) && u890.j(this.c, tl0Var.c) && this.d.equals(tl0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }
}
