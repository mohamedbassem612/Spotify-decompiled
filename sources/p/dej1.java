package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dej1 extends iej1 {
    public final int a;
    public final String b;
    public final String c;
    public final m4m d;

    public dej1(int i, String str, String str2, m4m m4mVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = m4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dej1)) {
            return false;
        }
        dej1 dej1Var = (dej1) obj;
        return this.a == dej1Var.a && u890.j(this.b, dej1Var.b) && u890.j(this.c, dej1Var.c) && this.d == dej1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
