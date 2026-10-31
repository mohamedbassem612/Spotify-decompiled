package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pth extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pth(Function0 function0, long j, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        nim0 nim0Var = nim0.a;
        Function0 function0 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                String strO0 = cwl1.o0(x340Var2, 2131956276);
                boolean zG = x340Var2.g(function0);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new ukf(function0, (byte) 27);
                    x340Var2.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.l(new gbx(new y50(strO0), function1), u291.a(nim0Var, 48.0f, 48.0f), null, null, null, apo.r(-1957982646, new sre((byte) 1, j), x340Var2), x340Var2, 196608, 28);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                String strO1 = cwl1.o0(x340Var4, 2131956217);
                boolean zG2 = x340Var4.g(function0);
                Object objT2 = x340Var4.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new uuc1(function0, (byte) 8);
                    x340Var4.s0(objT2);
                }
                Function0 function2 = (Function0) objT2;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                wro1.l(new gbx(new y50(strO1), function2), anm1.N("banner_dismiss_button", nim0Var), null, null, null, apo.r(-1269075180, new q9j0((byte) 26, j), x340Var4), x340Var4, 196608, 28);
                return rih1Var;
        }
    }
}
