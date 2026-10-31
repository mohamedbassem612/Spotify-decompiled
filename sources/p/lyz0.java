package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lyz0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final ArrayList f;

    public lyz0(String str, String str2, boolean z, boolean z2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyz0)) {
            return false;
        }
        lyz0 lyz0Var = (lyz0) obj;
        return u890.j(this.a, lyz0Var.a) && u890.j(this.b, lyz0Var.b) && this.c == lyz0Var.c && this.d == lyz0Var.d && u890.j(this.e, lyz0Var.e) && this.f.equals(lyz0Var.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.f.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }
}
