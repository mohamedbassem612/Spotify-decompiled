package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m4j1 implements Comparable {
    public final int a;
    public final int b;
    public final int c;
    public final Integer d;

    public m4j1(int i, int i2, int i3, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = num;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m4j1 m4j1Var) {
        Integer numValueOf = Integer.valueOf(u890.q(this.a, m4j1Var.a));
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        Integer numValueOf2 = Integer.valueOf(u890.q(this.b, m4j1Var.b));
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            return numValueOf2.intValue();
        }
        Integer numValueOf3 = Integer.valueOf(u890.q(this.c, m4j1Var.c));
        Integer num = numValueOf3.intValue() != 0 ? numValueOf3 : null;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = this.d;
        int iIntValue = num2 != null ? num2.intValue() : -1;
        Integer num3 = m4j1Var.d;
        return u890.q(iIntValue, num3 != null ? num3.intValue() : -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4j1)) {
            return false;
        }
        m4j1 m4j1Var = (m4j1) obj;
        return this.a == m4j1Var.a && this.b == m4j1Var.b && this.c == m4j1Var.c && u890.j(this.d, m4j1Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Integer num = this.d;
        return iF + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(Integer.valueOf(this.a));
        smc0VarN.add(Integer.valueOf(this.b));
        smc0VarN.add(Integer.valueOf(this.c));
        Integer num = this.d;
        if (num != null) {
            smc0VarN.add(Integer.valueOf(num.intValue()));
        }
        return o7h.y0(k4p1.k(smc0VarN), ".", (String) null, (String) null, (iu30) null, 62);
    }

    public /* synthetic */ m4j1() {
        this(9999, 0, 0, null);
    }
}
