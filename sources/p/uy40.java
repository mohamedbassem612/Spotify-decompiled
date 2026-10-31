package p;

import androidx.xr.projected.permissions.GoToHostProjectedActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uy40 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ GoToHostProjectedActivity b;

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        GoToHostProjectedActivity goToHostProjectedActivity = this.b;
        x340 x340Var = (b0k) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                int i = GoToHostProjectedActivity.W0;
                if ((iIntValue & 3) != 2) {
                    goToHostProjectedActivity.e0(x340Var, 0);
                } else {
                    x340 x340Var2 = x340Var;
                    if (!x340Var2.H()) {
                        goToHostProjectedActivity.e0(x340Var, 0);
                    } else {
                        x340Var2.b0();
                    }
                }
                break;
            default:
                num.getClass();
                int i2 = GoToHostProjectedActivity.W0;
                goToHostProjectedActivity.e0(x340Var, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
