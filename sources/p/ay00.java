package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ay00 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay00(String str, String str2, boolean z) {
        super(3);
        this.a = (byte) 2;
        this.c = str;
        this.b = z;
        this.d = str2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var;
        boolean z;
        b0k b0kVar;
        byte b = this.a;
        String str = this.d;
        String str2 = this.c;
        rih1 rih1Var = rih1.a;
        boolean z2 = this.b;
        switch (b) {
            case 0:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                ey00.f(str, z2 ? null : str2, b0kVar2, 0);
                return rih1Var;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 wnb0Var = nim0.a;
                qim0 qim0VarF = z2 ? u291.f(wnb0Var, 1.0f) : wnb0Var;
                jw31 jw31VarA = ew31.a(h36.g, een.N0, b0kVar3, 0);
                x340 x340Var2 = (x340) b0kVar3;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
                hzj.A.getClass();
                x340 x340Var3 = (x340) b0kVar3;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                boolean z3 = x340Var3.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(jw31VarA, b0kVar3, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar3, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar3, lljVar3);
                nko1.F(b0kVar3);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar3, lljVar4);
                if (z2) {
                    wnb0Var = new wnb0(1.0f, true);
                }
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, wnb0Var);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(mbhVarA, b0kVar3, lljVar);
                nko1.H(xos0VarM2, b0kVar3, lljVar2);
                i3a.l(iHashCode2, b0kVar3, lljVar3, b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, lljVar4);
                rrn1.t(str2, b0kVar3, 0);
                String str3 = this.d;
                if (str3 == null) {
                    x340Var3.i0(1198587536);
                    x340Var3.r(false);
                    b0kVar = b0kVar3;
                    x340Var = x340Var3;
                    z = true;
                } else {
                    x340Var3.i0(1198587537);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(b0kVar3).j;
                    long j = cbx.a(b0kVar3).b.a;
                    x340Var = x340Var3;
                    z = true;
                    uwo1.e(str3, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2034);
                    b0kVar = b0kVar3;
                    x340Var.r(false);
                }
                x340Var.r(z);
                if (z2) {
                    x340Var.i0(-2131902396);
                    rrn1.e(b0kVar, 0);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-2131872605);
                    x340Var.r(false);
                }
                x340Var.r(z);
                return rih1Var;
            case 2:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                eth.a(this.c, (qim0) null, (ni20) null, "locationTitle", apo.r(518832408, new c2(z2, str, (byte) 8), b0kVar4), b0kVar4, 27648, 6);
                return rih1Var;
            default:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                o6i1.a(str, z2 ? null : str2, b0kVar5, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ay00(boolean z, String str, String str2, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = str;
        this.d = str2;
    }
}
