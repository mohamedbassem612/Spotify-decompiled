package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9p0 implements v9p0 {
    public final String a;
    public final List b;
    public final String c;

    public t9p0(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9p0)) {
            return false;
        }
        t9p0 t9p0Var = (t9p0) obj;
        return u890.j(this.a, t9p0Var.a) && this.b.equals(t9p0Var.b) && u890.j(this.c, t9p0Var.c);
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
