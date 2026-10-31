package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xtl extends pim0 implements j4k, ofh0 {
    public qqq0 O0;
    public final du41 P0;
    public boolean Q0;
    public p5c R0;
    public final zs41 S0;
    public boolean U0;
    public boolean W0;
    public final ps7 T0 = new ps7((byte) 11);
    public long V0 = -1;

    public xtl(qqq0 qqq0Var, du41 du41Var, boolean z, p5c p5cVar, zs41 zs41Var) {
        this.O0 = qqq0Var;
        this.P0 = du41Var;
        this.Q0 = z;
        this.R0 = p5cVar;
        this.S0 = zs41Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static boolean J1(xtl xtlVar, n511 n511Var, long j, long j2, int i) throws NoWhenBranchMatchedException {
        if ((i & 1) != 0) {
            j = xtlVar.I1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jL1 = xtlVar.L1(n511Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jL1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jL1 & 4294967295L))) <= 0.5f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float H1(p5c p5cVar, long j) throws NoWhenBranchMatchedException {
        float f;
        n511 n511Var;
        int iCompare;
        long j2 = this.V0;
        bfn0 bfn0VarA = ps7.a(this.T0);
        int i = bfn0VarA.c - 1;
        Object[] objArr = bfn0VarA.a;
        if (i < objArr.length) {
            n511Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                n511 n511Var2 = (n511) ((wtl) objArr[i]).a.invoke();
                if (n511Var2 != null) {
                    long jG = n511Var2.g();
                    long jR = o0c.R(I1());
                    f = 0.0f;
                    int iOrdinal = this.O0.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jG & 4294967295L)), Float.intBitsToFloat((int) (jR & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            eg.o();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jG >> 32)), Float.intBitsToFloat((int) (jR >> 32)));
                    }
                    if (iCompare > 0) {
                        if (n511Var != null) {
                            break;
                        }
                        n511Var = n511Var2;
                        break;
                    }
                    n511Var = n511Var2;
                }
                i--;
            }
        } else {
            f = 0.0f;
            n511Var = null;
        }
        if (n511Var == null) {
            n511 n511Var3 = this.U0 ? (n511) this.S0.invoke() : null;
            if (n511Var3 == null) {
                return f;
            }
            n511Var = n511Var3;
        }
        long jR2 = o0c.R(j2);
        int iOrdinal2 = this.O0.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = n511Var.b;
            return p5cVar.a(f2 - ((int) (j & 4294967295L)), n511Var.d - f2, Float.intBitsToFloat((int) (jR2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = n511Var.a;
            return p5cVar.a(f3 - ((int) (j >> 32)), n511Var.c - f3, Float.intBitsToFloat((int) (jR2 >> 32)));
        }
        eg.o();
        return f;
    }

    public final long I1() {
        long j = this.V0;
        if (yr80.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void K1(long j) {
        p5c p5cVar = this.R0;
        if (p5cVar == null) {
            p5cVar = (p5c) lcc.z(this, r5c.a);
        }
        p5c p5cVar2 = p5cVar;
        if (this.W0) {
            tf80.c("launchAnimation called when previous animation was running");
        }
        p5c p5cVar3 = this.R0;
        if (p5cVar3 == null) {
            p5cVar3 = (p5c) lcc.z(this, r5c.a);
        }
        p5cVar3.getClass();
        p5c.a.getClass();
        c921.y(v1(), (o8n) null, 4, new p18(this, new vnh1(o5c.b), p5cVar2, j, (lnm) null, (byte) 1), 1);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final long L1(n511 n511Var, long j, long j2) throws NoWhenBranchMatchedException {
        long jR = o0c.R(j);
        int iOrdinal = this.O0.ordinal();
        if (iOrdinal == 0) {
            p5c p5cVar = this.R0;
            if (p5cVar == null) {
                p5cVar = (p5c) lcc.z(this, r5c.a);
            }
            float f = n511Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(p5cVar.a(f - ((int) (j2 & 4294967295L)), n511Var.d - f, Float.intBitsToFloat((int) (jR & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            eg.o();
            return 0L;
        }
        p5c p5cVar2 = this.R0;
        if (p5cVar2 == null) {
            p5cVar2 = (p5c) lcc.z(this, r5c.a);
        }
        float f2 = n511Var.a;
        return (((long) Float.floatToRawIntBits(p5cVar2.a(f2 - ((int) (j2 >> 32)), n511Var.c - f2, Float.intBitsToFloat((int) (jR >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.ofh0
    public final void f(long j) throws NoWhenBranchMatchedException {
        int iQ;
        long j2;
        long jI1 = I1();
        this.V0 = j;
        int iOrdinal = this.O0.ordinal();
        if (iOrdinal == 0) {
            iQ = u890.q((int) (j & 4294967295L), (int) (jI1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return;
            }
            iQ = u890.q((int) (j >> 32), (int) (jI1 >> 32));
        }
        if (iQ >= 0) {
            return;
        }
        if (this.Q0) {
            j2 = 0;
        } else {
            j2 = this.O0 == qqq0.a ? ((long) (((int) (jI1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jI1 >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j3 = j2;
        n511 n511Var = (n511) this.S0.invoke();
        if (n511Var == null || this.W0 || this.U0 || !J1(this, n511Var, jI1, 0L, 2) || J1(this, n511Var, 0L, j3, 1)) {
            return;
        }
        this.U0 = true;
        K1(j3);
    }

    @Override // p.pim0
    public final boolean w1() {
        return false;
    }
}
