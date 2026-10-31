package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xef1 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final String d;
    public final long e;
    public final fef1 f;
    public final String g;

    public xef1(String str, String str2, ArrayList arrayList, String str3, long j, fef1 fef1Var, String str4) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = j;
        this.f = fef1Var;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xef1)) {
            return false;
        }
        xef1 xef1Var = (xef1) obj;
        return this.a.equals(xef1Var.a) && this.b.equals(xef1Var.b) && this.c.equals(xef1Var.c) && this.d.equals(xef1Var.d) && this.e == xef1Var.e && this.f.equals(xef1Var.f) && u890.j(this.g, xef1Var.g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + cy30.f(cy30.d(p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), this.e, 31)) * 31;
        String str = this.g;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
