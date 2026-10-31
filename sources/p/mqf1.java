package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mqf1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ pqf1 b;
    public final /* synthetic */ qqf1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqf1(pqf1 pqf1Var, qqf1 qqf1Var) {
        super(2);
        this.b = pqf1Var;
        this.c = qqf1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qqf1 qqf1Var = this.c;
        pqf1 pqf1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
                    e511 e511Var = qqf1Var.g;
                    int i = pqf1.c1;
                    String str = (String) pqf1Var.a1.getValue();
                    boolean zI = x340Var2.i(context);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new ork(context, (byte) 12);
                        x340Var2.s0(objT);
                    }
                    e511Var.a(384, str, x340Var2, (iu30) objT);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (!ihc1.y0((String) pqf1Var.a1.getValue())) {
                    x340Var4.i0(-158159160);
                    nyx.a(0, (wux) null, apo.r(394173264, new mqf1(qqf1Var, pqf1Var), x340Var4), x340Var4, 3072, 7);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-157824732);
                    x340Var4.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqf1(qqf1 qqf1Var, pqf1 pqf1Var) {
        super(2);
        this.c = qqf1Var;
        this.b = pqf1Var;
    }
}
