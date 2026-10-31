package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dbh0 extends hab0 implements xu30 {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbh0(iu30 iu30Var, boolean z, boolean z2, Function0 function0, boolean z3, Function0 function1, boolean z4, Function0 function2) {
        super(3);
        this.a = iu30Var;
        this.b = z;
        this.c = z2;
        this.d = function0;
        this.e = z3;
        this.f = function1;
        this.g = z4;
        this.h = function2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var2, 2131957287);
            iu30 iu30Var = this.a;
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ebg0(iu30Var, (byte) 23);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return null;
            }
            wro1.h(new gbx(new y50(strO0), function0), ldxVar, anm1.N("match_review_more", nim0Var), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, tzi.b, x340Var2, 432, 6, 1016);
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new ebg0(iu30Var, (byte) 24);
                x340Var2.s0(objT2);
            }
            gt4.a(this.b, (Function0) objT2, (qim0) null, 0L, (es41) null, (nfv0) null, (hw61) null, 0L, 0.0f, apo.r(-1836906440, new ib7(this.c, iu30Var, this.d, this.e, this.f, this.g, this.h), x340Var2), x340Var2, 0, 2044);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
