package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qz2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(float f, float f2, tob1 tob1Var) {
        super(2);
        this.b = f;
        this.c = f2;
        this.d = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        float f = this.c;
        float f2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                qim0 qim0VarY = uyn1.y(u291.f(anm1.N("agnostic_playback_controls", nim0Var), 1.0f), dsa0.m(x340Var2, 2131166830), dsa0.m(x340Var2, 2131165905));
                fra fraVar = een.N0;
                h72 h72Var = (h72) obj3;
                gex0 gex0Var = h36.a;
                jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
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
                nko1.H(jw31VarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                pw31 pw31Var = pw31.a;
                qim0 qim0VarA = pw31Var.a(1.0f, nim0Var, true);
                jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                zwt0 zwt0Var = zwt0.LeftTertiary;
                nxt0 nxt0Var = nxt0.a;
                float f3 = this.b;
                tz2.d(zwt0Var, nxt0Var, h72Var, f3, x340Var2, 6);
                op71.g(x340Var2, pw31Var.a(0.55f, nim0Var, true));
                zwt0 zwt0Var2 = zwt0.LeftSecondary;
                mxt0 mxt0Var = mxt0.a;
                float f4 = this.c;
                tz2.c(zwt0Var2, mxt0Var, h72Var, f4, x340Var2, 6);
                op71.g(x340Var2, pw31Var.a(0.45f, nim0Var, true));
                x340Var2.r(true);
                tz2.b(h72Var, dsa0.m(x340Var2, 2131166871), x340Var2, 0);
                qim0 qim0VarA2 = pw31Var.a(1.0f, nim0Var, true);
                jw31 jw31VarA3 = ew31.a(gex0Var, fraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarA2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA3, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                op71.g(x340Var2, pw31Var.a(0.45f, nim0Var, true));
                tz2.c(zwt0.RightSecondary, mxt0.b, h72Var, f4, x340Var2, 6);
                op71.g(x340Var2, pw31Var.a(0.55f, nim0Var, true));
                tz2.d(zwt0.RightTertiary, nxt0.b, h72Var, f3, x340Var2, 6);
                x340Var2.r(true);
                x340Var2.r(true);
                return rih1Var;
            case 1:
                h8k1 h8k1Var = (h8k1) o7h.t0(((Number) obj2).intValue(), ((rnc0) ((tob1) obj3).getValue()).b);
                Object obj4 = h8k1Var != null ? h8k1Var.a : null;
                return ((obj4 instanceof emt0) || (obj4 instanceof ukw0) || (obj4 instanceof dbi0)) ? uyn1.z(0.0f, f2, 1, nim0Var) : uyn1.y(nim0Var, f, f2);
            case 2:
                ((Number) obj2).intValue();
                lrn1.g(f2, (phx) obj3, f, (b0k) obj, czo1.p(65));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                ((rsu0) obj3).o(f2, f, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(float f, phx phxVar, float f2, int i) {
        super(2);
        this.b = f;
        this.d = phxVar;
        this.c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(h72 h72Var, pxt0 pxt0Var, float f, float f2) {
        super(2);
        this.d = h72Var;
        this.b = f;
        this.c = f2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(rsu0 rsu0Var, float f, float f2, int i) {
        super(2);
        this.d = rsu0Var;
        this.b = f;
        this.c = f2;
    }
}
