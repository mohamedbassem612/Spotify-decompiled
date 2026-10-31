package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mmn {
    public final hux a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final tm81 f;
    public final pmn g;
    public final int h;
    public final lmn i;

    public mmn(hux huxVar, Integer num, Integer num2, Integer num3, String str, tm81 tm81Var, nmn nmnVar, int i, lmn lmnVar, int i2) {
        num2 = (i2 & 8) != 0 ? null : num2;
        num3 = (i2 & 32) != 0 ? null : num3;
        str = (i2 & 64) != 0 ? null : str;
        tm81Var = (i2 & 128) != 0 ? null : tm81Var;
        nmnVar = (i2 & 256) != 0 ? omn.a : nmnVar;
        this.a = huxVar;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = str;
        this.f = tm81Var;
        this.g = nmnVar;
        this.h = i;
        this.i = lmnVar;
    }

    public final tm81 a() {
        return this.f;
    }

    public final lmn b() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmn)) {
            return false;
        }
        mmn mmnVar = (mmn) obj;
        return u890.j(this.a, mmnVar.a) && u890.j(this.b, mmnVar.b) && u890.j(this.c, mmnVar.c) && u890.j(this.d, mmnVar.d) && u890.j(this.e, mmnVar.e) && u890.j(this.f, mmnVar.f) && this.g.equals(mmnVar.g) && this.h == mmnVar.h && this.i.equals(mmnVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 961;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        tm81 tm81Var = this.f;
        return this.i.hashCode() + ab80.k(this.h, (this.g.hashCode() + ((iHashCode5 + (tm81Var != null ? tm81Var.hashCode() : 0)) * 31)) * 31, 31);
    }
}
