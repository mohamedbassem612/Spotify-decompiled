package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class va1 extends wa1 {
    public final ArrayList a;
    public final boolean b;
    public final String c;

    public va1(String str, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va1)) {
            return false;
        }
        va1 va1Var = (va1) obj;
        return this.a.equals(va1Var.a) && this.b == va1Var.b && u890.j(this.c, va1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
