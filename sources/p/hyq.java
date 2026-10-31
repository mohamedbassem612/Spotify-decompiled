package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hyq extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xxq b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hyq(xxq xxqVar, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = xxqVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        xxq xxqVar = this.b;
        byte b2 = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                String strO0 = cwl1.o0(x340Var2, 2131954802);
                boolean zI = x340Var2.i(xxqVar) | x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new gyq(xxqVar, iu30Var, (byte) 0);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.f(new gbx(new y50(strO0), function0), null, jax.a, null, null, null, null, phi.k, x340Var2, 12582912, 122);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    gfx.g(4, apo.r(71025457, new hyq(xxqVar, iu30Var, b2), x340Var4), x340Var4, 54);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
