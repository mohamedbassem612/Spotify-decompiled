package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vj81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vj81(kg0 kg0Var, byte b) {
        super(2);
        this.a = b;
        this.b = kg0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kg0 kg0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    d9p1.m(kg0Var, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                String strO0 = cwl1.o0(x340Var4, 2131963295);
                boolean zI = x340Var4.i(kg0Var);
                Object objT = x340Var4.T();
                if (zI || objT == fkj0.X) {
                    objT = new fe81(kg0Var, (byte) 3);
                    x340Var4.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.h(new gbx(new y50(strO0), function0), ldx.c, null, null, null, null, false, null, null, whj.b, x340Var4, 0, 6, 1020);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                d9p1.m(kg0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj81(kg0 kg0Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.b = kg0Var;
    }
}
