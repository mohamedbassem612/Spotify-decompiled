package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cio0 implements eio0 {
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public cio0(String str, List list, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cio0)) {
            return false;
        }
        cio0 cio0Var = (cio0) obj;
        return this.a.equals(cio0Var.a) && u890.j(this.b, cio0Var.b) && u890.j(this.c, cio0Var.c) && u890.j(this.d, cio0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
