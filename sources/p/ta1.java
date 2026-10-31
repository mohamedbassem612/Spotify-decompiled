package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ta1 extends wa1 {
    public final List a;
    public final boolean b;
    public final String c;

    public ta1(String str, List list, boolean z) {
        this.a = list;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta1)) {
            return false;
        }
        ta1 ta1Var = (ta1) obj;
        return u890.j(this.a, ta1Var.a) && this.b == ta1Var.b && u890.j(this.c, ta1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
