package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i2h {
    public final s2r0 a;
    public final Integer b;
    public final qnb1 c;

    public i2h(s2r0 s2r0Var, Integer num, qnb1 qnb1Var) {
        this.a = s2r0Var;
        this.b = num;
        this.c = qnb1Var;
    }

    public static i2h a(i2h i2hVar, s2r0 s2r0Var, Integer num, qnb1 qnb1Var, int i) {
        if ((i & 1) != 0) {
            s2r0Var = i2hVar.a;
        }
        if ((i & 2) != 0) {
            num = i2hVar.b;
        }
        if ((i & 4) != 0) {
            qnb1Var = i2hVar.c;
        }
        return new i2h(s2r0Var, num, qnb1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2h)) {
            return false;
        }
        i2h i2hVar = (i2h) obj;
        return u890.j(this.a, i2hVar.a) && u890.j(this.b, i2hVar.b) && u890.j(this.c, i2hVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
