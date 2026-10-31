package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lo30 {
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final int e;

    public lo30(int i, String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo30)) {
            return false;
        }
        lo30 lo30Var = (lo30) obj;
        return this.a.equals(lo30Var.a) && this.b.equals(lo30Var.b) && u890.j(this.c, lo30Var.c) && this.d.equals(lo30Var.d) && this.e == lo30Var.e;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return l1d.C(this.e) + p3d1.f(this.d, (iD + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
