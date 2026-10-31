package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cj6 {
    public final ArrayList a;
    public final yj41 b;
    public final String c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final long g;

    public cj6(ArrayList arrayList, yj41 yj41Var, String str, String str2, boolean z, ArrayList arrayList2, long j) {
        this.a = arrayList;
        this.b = yj41Var;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = arrayList2;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj6)) {
            return false;
        }
        cj6 cj6Var = (cj6) obj;
        if (!this.a.equals(cj6Var.a) || !u890.j(this.b, cj6Var.b) || !this.c.equals(cj6Var.c) || !this.d.equals(cj6Var.d) || this.e != cj6Var.e || !this.f.equals(cj6Var.f)) {
            return false;
        }
        long j = cj6Var.g;
        int i = u7h.l;
        return z4h1.b(this.g, j);
    }

    public final int hashCode() {
        int iF = p3d1.f(this.f, xcg1.g(cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31);
        int i = u7h.l;
        return Long.hashCode(this.g) + iF;
    }
}
