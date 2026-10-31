package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dhf1 implements aik1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final bhf1 d;

    public dhf1(String str, String str2, boolean z, bhf1 bhf1Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bhf1Var;
    }

    @Override // p.aik1
    public final int a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhf1)) {
            return false;
        }
        dhf1 dhf1Var = (dhf1) obj;
        return u890.j(this.a, dhf1Var.a) && u890.j(this.b, dhf1Var.b) && this.c == dhf1Var.c && u890.j(this.d, dhf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
