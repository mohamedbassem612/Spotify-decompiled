package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class da61 {
    public final String a;
    public final h290 b;
    public final List c;
    public final String d;

    public da61(String str, h290 h290Var, List list, String str2) {
        this.a = str;
        this.b = h290Var;
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da61)) {
            return false;
        }
        da61 da61Var = (da61) obj;
        return this.a.equals(da61Var.a) && this.b.equals(da61Var.b) && u890.j(this.c, da61Var.c) && u890.j(this.d, da61Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(kk0.g(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
