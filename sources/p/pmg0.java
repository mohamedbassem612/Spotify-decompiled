package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pmg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmg0(j2i j2iVar, j2i j2iVar2, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = j2iVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        j2i j2iVar = this.c;
        j2i j2iVar2 = this.b;
        switch (b) {
            case 0:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P(blg0.a, new j2i(897247620, new ak10(j2iVar2, (byte) 22), true)))).H(hjl.b(j, 0, 0, 0, 0, 10));
                float fM0 = tlc1Var.M0(q5t0VarH.b);
                int iH = hjl.h(j) - q5t0VarH.b;
                float f = zjy.p(0.0f, new p3v((tlc1Var.M0(hjl.h(j)) - fM0) - 6.0f)).a;
                afh0 afh0Var = (afh0) o7h.q0(tlc1Var.P(blg0.b, new j2i(-432889451, new ak10(j2iVar, (byte) 23), true)));
                int iI0 = tlc1Var.i0(f);
                return tlc1Var.S(hjl.i(j), hjl.h(j), b7xVar, new lff(q5t0VarH, afh0Var.H(hjl.b(j, 0, 0, iH > iI0 ? iI0 : iH, tlc1Var.i0(f), 3)), j, (byte) 3));
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarU = u291.u(nim0Var, 40.0f, 40.0f, 188.0f, 0.0f, 8);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarU);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    qim0 qim0VarB = u291.B(nim0Var, (gra) null, 3);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarB2 = uyn1.B(qim0VarB, 8.0f, 0.0f, 12.0f, 0.0f, 10);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    j2iVar2.invoke(x340Var2, 0);
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.r(nim0Var, 6.0f));
                    ktd.s(j2iVar, x340Var2, 0, true, true);
                } else {
                    x340Var2.b0();
                }
                return rih1.a;
            default:
                tlc1 tlc1Var2 = (tlc1) obj;
                long j2 = ((hjl) obj2).a;
                q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var2.P("closeButton", new j2i(2127527288, new j2r0(j2iVar2, (byte) 26), true)))).H(hjl.b(j2, 0, 0, 0, 0, 10));
                afh0 afh0Var2 = (afh0) o7h.q0(tlc1Var2.P("title", new j2i(-334033530, new j2r0(j2iVar, (byte) 27), true)));
                int iK = hjl.k(j2) - (q5t0VarH2.a * 2);
                int i = iK < 0 ? 0 : iK;
                int i2 = hjl.i(j2) - (q5t0VarH2.a * 2);
                q5t0 q5t0VarH3 = afh0Var2.H(hjl.b(j2, i, i2 < 0 ? 0 : i2, 0, 0, 12));
                int iMax = Math.max(q5t0VarH2.b, q5t0VarH3.b);
                return tlc1Var2.S(hjl.i(j2), iMax, b7xVar, new udx(q5t0VarH2, q5t0VarH3, iMax, (byte) 1));
        }
    }
}
