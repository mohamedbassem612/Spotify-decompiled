package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jhm {
    public final String a;
    public final hux b;
    public final fhm c;
    public final Integer d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final tm81 h;
    public final ihm i;

    public jhm(String str, hux huxVar, fhm fhmVar, Integer num, String str2, Integer num2, boolean z, tm81 tm81Var, ihm ihmVar) {
        this.a = str;
        this.b = huxVar;
        this.c = fhmVar;
        this.d = num;
        this.e = str2;
        this.f = num2;
        this.g = z;
        this.h = tm81Var;
        this.i = ihmVar;
        if (!((num != null) ^ (str2 != null))) {
            hhg1.n("Exactly one title property must be populated.");
            throw null;
        }
        if ((fhmVar != null) ^ (huxVar != null)) {
            return;
        }
        hhg1.n("Exactly one icon property must be populated.");
        throw null;
    }

    public static jhm a(jhm jhmVar, String str, ihm ihmVar, int i) {
        if ((i & 1) != 0) {
            str = jhmVar.a;
        }
        String str2 = str;
        hux huxVar = jhmVar.b;
        fhm fhmVar = jhmVar.c;
        Integer num = (i & 8) != 0 ? jhmVar.d : 2131954060;
        String str3 = (i & 16) != 0 ? jhmVar.e : null;
        Integer num2 = jhmVar.f;
        boolean z = jhmVar.g;
        tm81 tm81Var = jhmVar.h;
        if ((i & 256) != 0) {
            ihmVar = jhmVar.i;
        }
        return new jhm(str2, huxVar, fhmVar, num, str3, num2, z, tm81Var, ihmVar);
    }

    public final tm81 b() {
        return this.h;
    }

    public final ihm c() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhm)) {
            return false;
        }
        jhm jhmVar = (jhm) obj;
        return u890.j(this.a, jhmVar.a) && u890.j(this.b, jhmVar.b) && u890.j(this.c, jhmVar.c) && u890.j(this.d, jhmVar.d) && u890.j(this.e, jhmVar.e) && u890.j(this.f, jhmVar.f) && this.g == jhmVar.g && u890.j(this.h, jhmVar.h) && u890.j(this.i, jhmVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hux huxVar = this.b;
        int iHashCode2 = (iHashCode + (huxVar == null ? 0 : huxVar.hashCode())) * 31;
        fhm fhmVar = this.c;
        int iHashCode3 = (iHashCode2 + (fhmVar == null ? 0 : fhmVar.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f;
        int iG = xcg1.g((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.g);
        tm81 tm81Var = this.h;
        return this.i.hashCode() + ((iG + (tm81Var != null ? tm81Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ jhm(String str, hux huxVar, fhm fhmVar, Integer num, String str2, boolean z, tm81 tm81Var, ihm ihmVar, int i) {
        this(str, huxVar, (i & 4) != 0 ? null : fhmVar, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : 2131962696, (i & 64) != 0 ? true : z, (i & 128) != 0 ? null : tm81Var, ihmVar);
    }
}
