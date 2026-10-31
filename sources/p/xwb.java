package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xwb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tbr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xwb(tbr0 tbr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = tbr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tbr0 tbr0Var = this.b;
        switch (b) {
            case 0:
                if (((hxb) obj) instanceof gxb) {
                    tbr0Var.a(l231.a);
                }
                break;
            case 1:
                tbr0Var.a(new y231(new pxb((lwb) obj)));
                break;
            case 2:
                tbr0Var.a(new y231(new tse(new pxs0((String) obj))));
                break;
            case 3:
                tbr0Var.a(new y231(new tse(new qxs0((wol) obj))));
                break;
            case 4:
                tbr0Var.a(new y231(new eth0((List) obj)));
                break;
            default:
                tbr0Var.a(new y231(new tjz0((String) obj)));
                break;
        }
        return rih1Var;
    }
}
