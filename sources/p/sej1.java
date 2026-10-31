package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sej1 extends vej1 {
    public final String a;
    public final String b;
    public final m4m c;

    public sej1(String str, String str2, m4m m4mVar) {
        this.a = str;
        this.b = str2;
        this.c = m4mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sej1)) {
            return false;
        }
        sej1 sej1Var = (sej1) obj;
        return u890.j(this.a, sej1Var.a) && u890.j(this.b, sej1Var.b) && this.c == sej1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
