package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iih1 {
    public final Integer a;
    public final String b;
    public final s3h c;
    public final nqz0 d;
    public final gih1 e;
    public final nia1 f;
    public final Boolean g;
    public final Boolean h;
    public final hih1 i;
    public final Boolean j;

    /* JADX WARN: Illegal instructions before constructor call */
    public iih1(s3h s3hVar, gih1 gih1Var, hih1 hih1Var, int i) {
        nia1 nia1Var = v3h.a;
        Boolean bool = Boolean.TRUE;
        this(100, "protobuf", s3hVar, null, gih1Var, nia1Var, bool, (i & 128) != 0 ? null : bool, hih1Var, Boolean.FALSE);
    }

    public final Boolean a() {
        return this.g;
    }

    public final gih1 b() {
        return this.e;
    }

    public final Boolean c() {
        return this.j;
    }

    public final hih1 d() {
        return this.i;
    }

    public final s3h e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iih1)) {
            return false;
        }
        iih1 iih1Var = (iih1) obj;
        return u890.j(this.a, iih1Var.a) && u890.j(this.b, iih1Var.b) && u890.j(this.c, iih1Var.c) && u890.j(this.d, iih1Var.d) && u890.j(this.e, iih1Var.e) && u890.j(this.f, iih1Var.f) && u890.j(this.g, iih1Var.g) && u890.j(this.h, iih1Var.h) && u890.j(this.i, iih1Var.i) && u890.j(this.j, iih1Var.j);
    }

    public final nqz0 f() {
        return this.d;
    }

    public final nia1 g() {
        return this.f;
    }

    public final Integer h() {
        return this.a;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        s3h s3hVar = this.c;
        int iHashCode3 = (iHashCode2 + (s3hVar == null ? 0 : s3hVar.hashCode())) * 31;
        nqz0 nqz0Var = this.d;
        int iHashCode4 = (iHashCode3 + (nqz0Var == null ? 0 : nqz0Var.hashCode())) * 31;
        gih1 gih1Var = this.e;
        int iHashCode5 = (iHashCode4 + (gih1Var == null ? 0 : gih1Var.hashCode())) * 31;
        nia1 nia1Var = this.f;
        int iHashCode6 = (iHashCode5 + (nia1Var == null ? 0 : nia1Var.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        hih1 hih1Var = this.i;
        int iHashCode9 = (iHashCode8 + (hih1Var == null ? 0 : hih1Var.hashCode())) * 31;
        Boolean bool3 = this.j;
        return iHashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final Boolean i() {
        return this.h;
    }

    public iih1(Integer num, String str, s3h s3hVar, nqz0 nqz0Var, gih1 gih1Var, nia1 nia1Var, Boolean bool, Boolean bool2, hih1 hih1Var, Boolean bool3) {
        this.a = num;
        this.b = str;
        this.c = s3hVar;
        this.d = nqz0Var;
        this.e = gih1Var;
        this.f = nia1Var;
        this.g = bool;
        this.h = bool2;
        this.i = hih1Var;
        this.j = bool3;
    }
}
