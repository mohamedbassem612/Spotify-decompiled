package p;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lej1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x191 b;
    public final /* synthetic */ oej1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lej1(x191 x191Var, oej1 oej1Var, byte b) {
        super(0);
        this.a = b;
        this.b = x191Var;
        this.c = oej1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        oej1 oej1Var = this.c;
        x191 x191Var = this.b;
        switch (b) {
            case 0:
                x191Var.g(vbh1.Y0);
                plb0 plb0Var = oej1Var.b;
                RecyclerView recyclerView = plb0Var.c;
                zl7 zl7Var = oej1Var.e;
                recyclerView.p0(zl7Var);
                plb0Var.c.m(zl7Var);
                break;
            default:
                x191Var.e();
                oej1Var.b.c.p0(oej1Var.e);
                break;
        }
        return rih1Var;
    }
}
