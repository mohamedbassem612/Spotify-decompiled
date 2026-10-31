package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n8a1 {
    public final String a;
    public final ArrayList b;
    public final String c;

    public n8a1(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8a1)) {
            return false;
        }
        n8a1 n8a1Var = (n8a1) obj;
        return u890.j(this.a, n8a1Var.a) && this.b.equals(n8a1Var.b) && u890.j(this.c, n8a1Var.c);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
