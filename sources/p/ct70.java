package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ct70 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zs70 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ct70(zs70 zs70Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = zs70Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zs70 zs70Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    m1p1.l(zs70Var, iu30Var, null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zE = x340Var4.e(zs70Var.c);
                    Object objT = x340Var4.T();
                    if (zE || objT == m4cVar) {
                        objT = yv91.a(new jt70(zs70Var, (byte) 0));
                        x340Var4.s0(objT);
                    }
                    qim0 qim0VarN = anm1.N("header", u291.f(nim0.a, 1.0f));
                    String str = zs70Var.a;
                    int i = ((xfh0) ((tob1) objT).getValue()).a;
                    String str2 = zs70Var.e;
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new u460(iu30Var, (byte) 15);
                        x340Var4.s0(objT2);
                    }
                    y4o1.c(i, 3072, str, str2, (Function0) objT2, x340Var4, qim0VarN);
                }
                break;
        }
        return rih1Var;
    }
}
