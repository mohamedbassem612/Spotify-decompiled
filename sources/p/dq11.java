package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class dq11 implements hq11 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final bwn f;

    public dq11(String str, String str2, String str3, List list, String str4, bwn bwnVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = bwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq11)) {
            return false;
        }
        dq11 dq11Var = (dq11) obj;
        return u890.j(this.a, dq11Var.a) && u890.j(this.b, dq11Var.b) && u890.j(this.c, dq11Var.c) && u890.j(this.d, dq11Var.d) && u890.j(this.e, dq11Var.e) && u890.j(this.f, dq11Var.f);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 961);
    }
}
