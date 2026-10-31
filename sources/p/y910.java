package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y910 {
    public final List a;
    public final List b;
    public final List c;
    public final u7h d;
    public final String e;
    public final String f;
    public final boolean g;

    public y910(List list, List list2, List list3, u7h u7hVar, String str, String str2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = u7hVar;
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y910)) {
            return false;
        }
        y910 y910Var = (y910) obj;
        return this.a.equals(y910Var.a) && this.b.equals(y910Var.b) && this.c.equals(y910Var.c) && u890.j(this.d, y910Var.d) && u890.j(this.e, y910Var.e) && u890.j(this.f, y910Var.f) && this.g == y910Var.g;
    }

    public final int hashCode() {
        int iB = f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        u7h u7hVar = this.d;
        int iHashCode = (iB + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return Boolean.hashCode(this.g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
