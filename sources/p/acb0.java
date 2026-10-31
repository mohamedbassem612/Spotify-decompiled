package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class acb0 {
    public final String a;
    public final List b;
    public final String c;
    public final boolean d;

    public acb0(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acb0)) {
            return false;
        }
        acb0 acb0Var = (acb0) obj;
        return u890.j(this.a, acb0Var.a) && u890.j(this.b, acb0Var.b) && u890.j(this.c, acb0Var.c) && this.d == acb0Var.d;
    }

    public final int hashCode() {
        int iB = f4i1.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}
