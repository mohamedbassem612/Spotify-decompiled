package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xq9 {
    public final List a;
    public final String b;
    public final boolean c;

    public xq9(String str, List list, boolean z) {
        this.a = list;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq9)) {
            return false;
        }
        xq9 xq9Var = (xq9) obj;
        return u890.j(this.a, xq9Var.a) && u890.j(this.b, xq9Var.b) && this.c == xq9Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
