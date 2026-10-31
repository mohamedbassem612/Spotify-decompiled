package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lxo0 implements eyo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final h290 e;
    public final h290 f;

    public lxo0(String str, String str2, String str3, String str4, h290 h290Var, h290 h290Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = h290Var;
        this.f = h290Var2;
    }

    public final List a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxo0)) {
            return false;
        }
        lxo0 lxo0Var = (lxo0) obj;
        return this.a.equals(lxo0Var.a) && this.b.equals(lxo0Var.b) && u890.j(this.c, lxo0Var.c) && this.d.equals(lxo0Var.d) && this.e.equals(lxo0Var.e) && this.f.equals(lxo0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + kk0.g(this.e, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
    }
}
