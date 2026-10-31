package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tdx0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z511 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdx0(z511 z511Var, int i, byte b) {
        super(1);
        this.a = b;
        this.b = z511Var;
        this.c = i;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = this.c;
        z511 z511Var = this.b;
        switch (b) {
            case 0:
                jbk1 jbk1Var = new jbk1((Context) obj);
                jbk1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                w611 w611VarP = z511Var.p(z511Var.g(i), jbk1Var);
                jbk1Var.a = w611VarP;
                vgu vguVar = new vgu(z511Var, w611VarP, jbk1Var, (byte) 3);
                jbk1Var.b = vguVar;
                jbk1Var.addOnAttachStateChangeListener(vguVar);
                jbk1Var.addView(w611VarP.a);
                return jbk1Var;
            default:
                w611 w611Var = ((jbk1) obj).a;
                if (w611Var != null) {
                    z511Var.n(i, w611Var);
                    return rih1.a;
                }
                u890.C("viewHolder");
                throw null;
        }
    }
}
