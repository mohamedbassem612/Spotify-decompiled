package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t9y {
    public final u7h a;
    public final u7h b;
    public final u7h c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final eid h;

    public t9y(u7h u7hVar, u7h u7hVar2, u7h u7hVar3, String str, String str2, String str3, String str4, eid eidVar) {
        this.a = u7hVar;
        this.b = u7hVar2;
        this.c = u7hVar3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = eidVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9y)) {
            return false;
        }
        t9y t9yVar = (t9y) obj;
        return u890.j(this.a, t9yVar.a) && u890.j(this.b, t9yVar.b) && u890.j(this.c, t9yVar.c) && u890.j(this.d, t9yVar.d) && this.e.equals(t9yVar.e) && this.f.equals(t9yVar.f) && u890.j(this.g, t9yVar.g) && u890.j(this.h, t9yVar.h);
    }

    public final int hashCode() {
        u7h u7hVar = this.a;
        int iHashCode = (u7hVar == null ? 0 : Long.hashCode(u7hVar.a)) * 31;
        u7h u7hVar2 = this.b;
        int iHashCode2 = (iHashCode + (u7hVar2 == null ? 0 : Long.hashCode(u7hVar2.a))) * 31;
        u7h u7hVar3 = this.c;
        int iD = cy30.d(cy30.d(cy30.d((iHashCode2 + (u7hVar3 == null ? 0 : Long.hashCode(u7hVar3.a))) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int iHashCode3 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        eid eidVar = this.h;
        return iHashCode3 + (eidVar != null ? eidVar.hashCode() : 0);
    }
}
