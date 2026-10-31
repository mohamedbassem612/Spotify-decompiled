package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r1t0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ yxa0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t0(Function0 function0, boolean z, yxa0 yxa0Var) {
        super(2);
        this.d = function0;
        this.c = z;
        this.b = yxa0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        jax haxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        boolean z = this.c;
        yxa0 yxa0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new isr0(function0, (byte) 15);
                        x340Var2.s0(objT);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT);
                    idx idxVar = new idx(19);
                    gdx gdxVarR = yla.r(x340Var2);
                    if (z) {
                        x340Var2.i0(579145414);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    } else {
                        x340Var2.i0(579201214);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131957055));
                        x340Var2.r(false);
                    }
                    foo1.c(gbxVar, idxVar, anm1.N("pin_continue_button", nim0.a), haxVar, gdxVarR, null, null, null, null, null, apo.r(837147247, new o8w(yxa0Var, (byte) 1), x340Var2), x340Var2, 0, 48, 1992);
                }
                break;
            default:
                ((Number) obj2).intValue();
                suo1.n(yxa0Var, z, function0, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1t0(yxa0 yxa0Var, boolean z, Function0 function0, int i) {
        super(2);
        this.b = yxa0Var;
        this.c = z;
        this.d = function0;
    }
}
