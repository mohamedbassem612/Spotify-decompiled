package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e7t0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final List e;
    public final p60 f;
    public final List g;

    public e7t0(String str, boolean z, String str2, String str3, List list, p60 p60Var, List list2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = p60Var;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7t0)) {
            return false;
        }
        e7t0 e7t0Var = (e7t0) obj;
        return this.a.equals(e7t0Var.a) && this.b == e7t0Var.b && this.c.equals(e7t0Var.c) && this.d.equals(e7t0Var.d) && u890.j(this.e, e7t0Var.e) && this.f.equals(e7t0Var.f) && u890.j(this.g, e7t0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + f4i1.b(cy30.d(cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31);
    }
}
