package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vb61 {
    public final String a;
    public final String b;
    public final rb61 c;
    public final String d;
    public final String e;
    public final Set f;
    public final String g;
    public final hux h;

    public vb61(String str, String str2, rb61 rb61Var, String str3, String str4, Set set, String str5, hux huxVar) {
        this.a = str;
        this.b = str2;
        this.c = rb61Var;
        this.d = str3;
        this.e = str4;
        this.f = set;
        this.g = str5;
        this.h = huxVar;
    }

    public static vb61 a(vb61 vb61Var, Set set, String str, int i) {
        String str2 = vb61Var.a;
        String str3 = vb61Var.b;
        rb61 rb61Var = (i & 4) != 0 ? vb61Var.c : rb61.a;
        String str4 = vb61Var.d;
        String str5 = vb61Var.e;
        if ((i & 32) != 0) {
            set = vb61Var.f;
        }
        Set set2 = set;
        if ((i & 64) != 0) {
            str = vb61Var.g;
        }
        hux huxVar = vb61Var.h;
        vb61Var.getClass();
        return new vb61(str2, str3, rb61Var, str4, str5, set2, str, huxVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb61)) {
            return false;
        }
        vb61 vb61Var = (vb61) obj;
        return u890.j(this.a, vb61Var.a) && this.b.equals(vb61Var.b) && this.c == vb61Var.c && this.d.equals(vb61Var.d) && this.e.equals(vb61Var.e) && u890.j(this.f, vb61Var.f) && this.g.equals(vb61Var.g) && u890.j(this.h, vb61Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(gvg.c(cy30.d(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        hux huxVar = this.h;
        return iD + (huxVar == null ? 0 : huxVar.hashCode());
    }
}
