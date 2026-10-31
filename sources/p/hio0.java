package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hio0 {
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public hio0(String str, List list, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hio0)) {
            return false;
        }
        hio0 hio0Var = (hio0) obj;
        return this.a.equals(hio0Var.a) && this.b.equals(hio0Var.b) && this.c.equals(hio0Var.c) && u890.j(this.d, hio0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
