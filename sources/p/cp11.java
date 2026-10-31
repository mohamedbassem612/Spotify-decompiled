package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cp11 {
    public final String a;
    public final String b;
    public final List c;
    public final Long d;
    public final List e;
    public final int f;
    public final String g;

    public cp11(String str, String str2, List list, Long l, List list2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = l;
        this.e = list2;
        this.f = i;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp11)) {
            return false;
        }
        cp11 cp11Var = (cp11) obj;
        return u890.j(this.a, cp11Var.a) && u890.j(this.b, cp11Var.b) && u890.j(this.c, cp11Var.c) && u890.j(this.d, cp11Var.d) && u890.j(this.e, cp11Var.e) && this.f == cp11Var.f && u890.j(this.g, cp11Var.g);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Long l = this.d;
        int iK = ab80.k(this.f, f4i1.b((iB + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31);
        String str = this.g;
        return iK + (str != null ? str.hashCode() : 0);
    }
}
