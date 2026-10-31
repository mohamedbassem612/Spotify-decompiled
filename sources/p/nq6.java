package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nq6 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final List f;

    public nq6(int i, int i2, String str, String str2, String str3, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq6)) {
            return false;
        }
        nq6 nq6Var = (nq6) obj;
        return this.a.equals(nq6Var.a) && this.b == nq6Var.b && this.c == nq6Var.c && this.d.equals(nq6Var.d) && this.e.equals(nq6Var.e) && this.f.equals(nq6Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }
}
