package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t4y0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public t4y0(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4y0)) {
            return false;
        }
        t4y0 t4y0Var = (t4y0) obj;
        return this.a.equals(t4y0Var.a) && this.b.equals(t4y0Var.b) && this.c.equals(t4y0Var.c) && this.d.equals(t4y0Var.d) && this.e.equals(t4y0Var.e) && u890.j(this.f, t4y0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }
}
