package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jr51 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lr51 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr51(lr51 lr51Var, byte b) {
        super(1);
        this.a = b;
        this.b = lr51Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lr51 lr51Var = this.b;
        switch (b) {
            case 0:
                e220 e220Var = lr51Var.e;
                e220Var.a.l(new d220(lr51Var.l, "", null, 8));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                lr51Var.j.k(new er91((fs91) null, lr51Var.a.getQuantityString(2131820688, iIntValue, Integer.valueOf(iIntValue)), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    lr51Var.d.a(ixb.b);
                }
                break;
            default:
                String str = (String) obj;
                lr51Var.l = str;
                lr51Var.e.b.l(str);
                break;
        }
        return rih1Var;
    }
}
