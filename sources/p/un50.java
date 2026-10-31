package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class un50 {
    public final List a;
    public final String b;
    public final String c;
    public final int d;

    public un50(int i, String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un50)) {
            return false;
        }
        un50 un50Var = (un50) obj;
        return this.a.equals(un50Var.a) && this.b.equals(un50Var.b) && u890.j(this.c, un50Var.c) && this.d == un50Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
