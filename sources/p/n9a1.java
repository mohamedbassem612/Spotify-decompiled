package p;

import android.view.View;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n9a1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n9a1(cm0 cm0Var, byte b) {
        super(1);
        this.a = b;
        this.b = cm0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cm0 cm0Var = this.b;
        switch (b) {
            case 0:
                kt91 kt91Var = (kt91) cm0Var.f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962730});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131962730, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            default:
                String str = (String) obj;
                r6h1 r6h1Var = (r6h1) cm0Var.t;
                if (r6h1Var == null) {
                    u890.C("parentAbsoluteLocation");
                    throw null;
                }
                ezl0 ezl0Var = new ezl0(r6h1Var, (byte) 1);
                kt91 kt91Var2 = (kt91) cm0Var.f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962732});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131962732});
                kt91Var2.k(new er91((fs91) null, "", 2131962732, (String) null, 2131962731, new kw6(cm0Var, ezl0Var, str, (byte) 24), (cvr) null, (xq91) null, false));
                ((i8h1) cm0Var.h).f(ezl0Var.e(), (Set) null);
                return rih1Var;
        }
    }
}
