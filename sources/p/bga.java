package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bga implements cga {
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final Integer e;
    public final Integer f;
    public final fie1 g;

    public bga(int i, String str, String str2, long j, Integer num, Integer num2, fie1 fie1Var) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = num;
        this.f = num2;
        this.g = fie1Var;
    }

    @Override // p.cga
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bga)) {
            return false;
        }
        bga bgaVar = (bga) obj;
        return this.a == bgaVar.a && u890.j(this.b, bgaVar.b) && u890.j(this.c, bgaVar.c) && this.d == bgaVar.d && u890.j(this.e, bgaVar.e) && u890.j(this.f, bgaVar.f) && u890.j(this.g, bgaVar.g);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31);
        Integer num = this.e;
        int iHashCode = (iF + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        fie1 fie1Var = this.g;
        return iHashCode2 + (fie1Var != null ? fie1Var.hashCode() : 0);
    }
}
