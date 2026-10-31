package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class otb1 implements ptb1 {
    public final String a;
    public final d761 b;
    public final String c;
    public final xxh d;
    public final String e;
    public final boolean f;

    public otb1(String str, d761 d761Var, String str2, xxh xxhVar, String str3, boolean z) {
        this.a = str;
        this.b = d761Var;
        this.c = str2;
        this.d = xxhVar;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otb1)) {
            return false;
        }
        otb1 otb1Var = (otb1) obj;
        return this.a.equals(otb1Var.a) && this.b.equals(otb1Var.b) && u890.j(this.c, otb1Var.c) && this.d.equals(otb1Var.d) && this.e.equals(otb1Var.e) && this.f == otb1Var.f;
    }

    public final int hashCode() {
        int iF = ktd.f(this.a.hashCode() * 31, this.b.a, 31);
        String str = this.c;
        return Boolean.hashCode(this.f) + cy30.d((this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
    }
}
