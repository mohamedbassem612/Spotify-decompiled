package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x1z0 extends oho1 {
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public x1z0(String str, List list, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1z0)) {
            return false;
        }
        x1z0 x1z0Var = (x1z0) obj;
        return u890.j(this.c, x1z0Var.c) && u890.j(this.d, x1z0Var.d) && u890.j(this.e, x1z0Var.e) && u890.j(this.f, x1z0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String v() {
        return this.c;
    }

    public final String w() {
        return this.d;
    }
}
