package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rdg0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdg0(String str, String str2, boolean z, boolean z2, Function0 function0, int i) {
        super(2);
        this.b = str;
        this.e = str2;
        this.d = z;
        this.f = z2;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        hax haxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                bqn1.o(this.b, this.e, this.d, this.f, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                gfh0 gfh0VarC = t1c.c(een.h, false);
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
                String str = this.b;
                if (ihc1.y0(str)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(str), this.c);
                idx idxVar = new idx();
                gdx gdxVarS = yla.s(x340Var2);
                boolean z = this.d;
                String str2 = this.e;
                if (z) {
                    x340Var2.i0(-1143874455);
                    x340Var2.r(false);
                    haxVar = new hax(str2);
                } else if (this.f) {
                    x340Var2.i0(-1143872636);
                    x340Var2.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var2.i0(-1143870242);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131960747));
                    x340Var2.r(false);
                }
                wro1.h(gbxVar, idxVar, anm1.N("questionnaire-send-button", nim0Var), haxVar, gdxVarS, null, false, null, null, apo.r(658729703, new k750((byte) 23, z), x340Var2), x340Var2, 0, 6, 968);
                if (z) {
                    x340Var2.i0(-1099783432);
                    qim0 qim0VarN = anm1.N("questionnaire-validation-progress", nim0Var);
                    boolean zG = x340Var2.g(str2);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new q4z0(str2, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    xto1.e(s161.b(qim0VarN, false, (iu30) objT), 2, 0L, 0L, x340Var2, 48, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1099471758);
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdg0(String str, Function0 function0, boolean z, String str2, boolean z2) {
        super(2);
        this.b = str;
        this.c = function0;
        this.d = z;
        this.e = str2;
        this.f = z2;
    }
}
