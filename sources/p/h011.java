package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h011 implements j011 {
    public final String a;
    public final String b;
    public final String c;
    public final ulw0 d;

    public h011(String str, String str2, String str3, ulw0 ulw0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = ulw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h011)) {
            return false;
        }
        h011 h011Var = (h011) obj;
        return u890.j(this.a, h011Var.a) && u890.j(this.b, h011Var.b) && u890.j(this.c, h011Var.c) && this.d.equals(h011Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
