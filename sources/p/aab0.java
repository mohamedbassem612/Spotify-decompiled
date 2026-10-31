package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class aab0 implements z0i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final lfc e;
    public final String f;
    public final aec g;

    public aab0(String str, String str2, String str3, String str4, String str5, aec aecVar, lfc lfcVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = lfcVar;
        this.f = str5;
        this.g = aecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aab0)) {
            return false;
        }
        aab0 aab0Var = (aab0) obj;
        return this.a.equals(aab0Var.a) && this.b.equals(aab0Var.b) && this.c.equals(aab0Var.c) && this.d.equals(aab0Var.d) && this.e == aab0Var.e && this.f.equals(aab0Var.f) && this.g == aab0Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }
}
