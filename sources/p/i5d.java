package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5d {
    public final af5 a;
    public final u7h b;
    public final af5 c;
    public final u7h d;
    public final af5 e;
    public final u7h f;
    public final ArrayList g;
    public final Long h;
    public final Long i;
    public final f7d j;
    public final boolean k;
    public final String l;

    public i5d(af5 af5Var, u7h u7hVar, af5 af5Var2, u7h u7hVar2, af5 af5Var3, u7h u7hVar3, ArrayList arrayList, Long l, Long l2, f7d f7dVar, boolean z, String str) {
        this.a = af5Var;
        this.b = u7hVar;
        this.c = af5Var2;
        this.d = u7hVar2;
        this.e = af5Var3;
        this.f = u7hVar3;
        this.g = arrayList;
        this.h = l;
        this.i = l2;
        this.j = f7dVar;
        this.k = z;
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5d)) {
            return false;
        }
        i5d i5dVar = (i5d) obj;
        return u890.j(this.a, i5dVar.a) && u890.j(this.b, i5dVar.b) && u890.j(this.c, i5dVar.c) && u890.j(this.d, i5dVar.d) && u890.j(this.e, i5dVar.e) && u890.j(this.f, i5dVar.f) && this.g.equals(i5dVar.g) && u890.j(this.h, i5dVar.h) && u890.j(this.i, i5dVar.i) && u890.j(this.j, i5dVar.j) && this.k == i5dVar.k && this.l.equals(i5dVar.l);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        u7h u7hVar = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (u7hVar == null ? 0 : Long.hashCode(u7hVar.a))) * 31)) * 31;
        u7h u7hVar2 = this.d;
        int iHashCode3 = (this.e.hashCode() + ((iHashCode2 + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31)) * 31;
        u7h u7hVar3 = this.f;
        int iF = p3d1.f(this.g, (iHashCode3 + (u7hVar3 == null ? 0 : Long.hashCode(u7hVar3.a))) * 31, 31);
        Long l = this.h;
        int iHashCode4 = (iF + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        f7d f7dVar = this.j;
        return this.l.hashCode() + xcg1.g((iHashCode5 + (f7dVar != null ? f7dVar.hashCode() : 0)) * 31, 31, this.k);
    }
}
