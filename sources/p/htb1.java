package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class htb1 implements ptb1 {
    public final String a;
    public final d761 b;
    public final String c;
    public final String d;

    public htb1(String str, d761 d761Var, String str2, String str3) {
        this.a = str;
        this.b = d761Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htb1)) {
            return false;
        }
        htb1 htb1Var = (htb1) obj;
        return this.a.equals(htb1Var.a) && this.b.equals(htb1Var.b) && u890.j(this.c, htb1Var.c) && this.d.equals(htb1Var.d);
    }

    public final int hashCode() {
        int iF = ktd.f(this.a.hashCode() * 31, this.b.a, 31);
        String str = this.c;
        return this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }
}
