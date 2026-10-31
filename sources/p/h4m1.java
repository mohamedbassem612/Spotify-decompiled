package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h4m1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i4m1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4m1(i4m1 i4m1Var, byte b) {
        super(0);
        this.a = b;
        this.b = i4m1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i4m1 i4m1Var = this.b;
        switch (b) {
            case 0:
                i4m1Var.m.a(nxb.a(i4m1Var.l, (Integer) null, (ixb) null, 0, true, false, 3967));
                i4m1Var.b.g();
                break;
            case 1:
                kt91 kt91Var = i4m1Var.d;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963909});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131963909, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            default:
                z740 z740VarA = i4m1Var.e.a();
                if (z740VarA != null) {
                    x1i1.a(i4m1Var.f, z740VarA, 4);
                }
                break;
        }
        return rih1Var;
    }
}
