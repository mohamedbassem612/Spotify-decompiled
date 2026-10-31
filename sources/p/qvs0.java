package p;

import com.spotify.concertcampaignview.v1.CtaType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qvs0 extends hab0 implements xu30 {
    public final /* synthetic */ mic0 a;
    public final /* synthetic */ cvx b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ovs0 d;
    public final /* synthetic */ lz20 e;
    public final /* synthetic */ smp0 f;
    public final /* synthetic */ kls0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvs0(mic0 mic0Var, cvx cvxVar, float f, ovs0 ovs0Var, lz20 lz20Var, smp0 smp0Var, kls0 kls0Var) {
        super(3);
        this.a = mic0Var;
        this.b = cvxVar;
        this.c = f;
        this.d = ovs0Var;
        this.e = lz20Var;
        this.f = smp0Var;
        this.g = kls0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarB = uyn1.B(dug.e(u291.f(nim0.a, 1.0f), this.a, null, 0.0f, 6), 0.0f, 16.0f, 0.0f, 16.0f + this.c, 5);
        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        ovs0 ovs0Var = this.d;
        boolean z = ovs0Var.c;
        boolean z2 = ovs0Var.e;
        int i = ovs0Var.a;
        boolean z3 = z && i > 0;
        bby bbyVarE = xay.e(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6));
        ln00 ln00VarF = xay.f(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6));
        cvx cvxVar = this.b;
        j2i j2iVarR = apo.r(1121996911, new pvs0(ovs0Var, cvxVar, (byte) 0), x340Var);
        pbh pbhVar = pbh.a;
        fq7.b(pbhVar, z3, (qim0) null, bbyVarE, ln00VarF, (String) null, j2iVarR, x340Var, 1572870, 18);
        fq7.b(pbhVar, ovs0Var.d && i > 0 && ovs0Var.b > 0, (qim0) null, xay.e(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)), xay.f(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)), (String) null, apo.r(896624216, new pvs0(ovs0Var, cvxVar, (byte) 1), x340Var), x340Var, 1572870, 18);
        fq7.b(pbhVar, z2 && ovs0Var.f != null, (qim0) null, xay.d(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), (fra) null, 14).a(xay.e(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6))), xay.l(14, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)).a(xay.f(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6))), (String) null, apo.r(2130688503, new hho0(this.e, this.f, ovs0Var, (byte) 3), x340Var), x340Var, 1572870, 18);
        fq7.b(pbhVar, z2 && ovs0Var.g != null, (qim0) null, xay.d(irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), (fra) null, 14).a(xay.e(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6))), xay.l(14, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6)).a(xay.f(2, irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6))), (String) null, apo.r(-930214506, new ukm0(this.g, ovs0Var, (byte) 19), x340Var), x340Var, 1572870, 18);
        x340Var3.r(true);
        return rih1.a;
    }
}
