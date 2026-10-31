package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qn11 {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final String i;
    public final in11 j;

    public qn11(boolean z, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, in11 in11Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        this.i = str6;
        this.j = in11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn11)) {
            return false;
        }
        qn11 qn11Var = (qn11) obj;
        return this.a == qn11Var.a && u890.j(this.b, qn11Var.b) && u890.j(this.c, qn11Var.c) && u890.j(this.d, qn11Var.d) && u890.j(this.e, qn11Var.e) && this.f == qn11Var.f && this.g == qn11Var.g && u890.j(this.h, qn11Var.h) && this.i.equals(qn11Var.i) && this.j == qn11Var.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + cy30.d(cy30.f(cy30.d(cy30.f(cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31), 31, this.h), 0L, 31), 31, this.i);
    }
}
