package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.concertcampaignview.v1.CtaType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fb7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb7(boolean z, boolean z2, vu30 vu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.d;
        boolean z = this.b;
        boolean z2 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarE = aqo1.e(z, z2);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, y580.Y);
                vu30Var.invoke(x340Var, 0);
                x340Var3.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                x340 x340Var4 = (b0k) obj2;
                Object objT = x340Var4.T();
                if (objT == fkj0.X) {
                    objT = new zen0(Boolean.valueOf(z2));
                    x340Var4.s0(objT);
                }
                zen0 zen0Var = (zen0) objT;
                zen0Var.w1(Boolean.TRUE);
                fq7.d(zen0Var, (qim0) null, xay.d(irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, null, 6), z ? een.O0 : een.Z, 12).a(xay.e(2, irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, null, 4))), (ln00) null, (String) null, apo.r(1559075462, new a2(vu30Var, (byte) 5), x340Var4), x340Var4, 196608, 26);
                return rih1Var;
        }
    }
}
