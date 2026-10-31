package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yb81 extends zb81 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final eb81 e;

    public yb81(String str, String str2, String str3, ArrayList arrayList, eb81 eb81Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = eb81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb81)) {
            return false;
        }
        yb81 yb81Var = (yb81) obj;
        return this.a.equals(yb81Var.a) && this.b.equals(yb81Var.b) && u890.j(this.c, yb81Var.c) && this.d.equals(yb81Var.d) && u890.j(this.e, yb81Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
        eb81 eb81Var = this.e;
        return iF + (eb81Var != null ? eb81Var.hashCode() : 0);
    }
}
