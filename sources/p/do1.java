package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class do1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ow1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do1(ow1 ow1Var, iu30 iu30Var, byte b) {
        super(4);
        this.a = b;
        this.b = ow1Var;
        this.c = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        ow1 ow1Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                aqb0 aqb0Var = (aqb0) obj;
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(aqb0Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new cr0(iu30Var, (byte) 19);
                        x340Var2.s0(objT);
                    }
                    t9p1.e(ow1Var, (Function0) objT, aqb0.b(aqb0Var, nim0Var, (pxg1) null, (ni20) null, 7), x340Var2, 0);
                }
                break;
            default:
                aqb0 aqb0Var2 = (aqb0) obj;
                ((Number) obj2).intValue();
                x340 x340Var3 = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var3.g(aqb0Var2) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 131) != 130)) {
                    x340Var4.b0();
                } else {
                    boolean zG2 = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new cr0(iu30Var, (byte) 20);
                        x340Var4.s0(objT2);
                    }
                    t9p1.e(ow1Var, (Function0) objT2, aqb0.b(aqb0Var2, nim0Var, (pxg1) null, (ni20) null, 7), x340Var4, 0);
                }
                break;
        }
        return rih1Var;
    }
}
