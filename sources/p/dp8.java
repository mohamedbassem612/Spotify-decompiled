package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dp8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final q8b e;
    public final String f;
    public final d8r0 g;
    public final List h;

    public dp8(String str, String str2, String str3, String str4, q8b q8bVar, String str5, d8r0 d8r0Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = q8bVar;
        this.f = str5;
        this.g = d8r0Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp8)) {
            return false;
        }
        dp8 dp8Var = (dp8) obj;
        return u890.j(this.a, dp8Var.a) && u890.j(this.b, dp8Var.b) && u890.j(this.c, dp8Var.c) && u890.j(this.d, dp8Var.d) && this.e.equals(dp8Var.e) && u890.j(this.f, dp8Var.f) && this.g.equals(dp8Var.g) && this.h.equals(dp8Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.h.hashCode() + hrt.i(this.g, cy30.d((this.e.hashCode() + cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31);
    }
}
