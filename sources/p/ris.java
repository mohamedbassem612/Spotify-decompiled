package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ris extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vis b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ris(vis visVar, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = visVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        vis visVar = this.b;
        switch (b) {
            case 0:
                z7x0 z7x0Var = visVar.c;
                int iOrdinal = ((vk51) obj).ordinal();
                if (iOrdinal == 0) {
                    ConstraintLayout constraintLayout = z7x0Var.A;
                    View view = z7x0Var.v;
                    if (constraintLayout.getBackground() != null) {
                        constraintLayout.setBackground(null);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = constraintLayout.getHeight();
                            view.setLayoutParams(layoutParams);
                            view.setVisibility(0);
                            z7x0Var.w.setVisibility(0);
                        } else {
                            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    visVar.a(wk51.a(z7x0Var.o.getModel(), null, xk51.b, null, 5));
                    iu30Var.invoke(q7x0.O0);
                    return rih1Var;
                }
                if (iOrdinal == 1) {
                    visVar.a(wk51.a(z7x0Var.o.getModel(), null, xk51.a, null, 5));
                    iu30Var.invoke(q7x0.P0);
                    return rih1Var;
                }
                if (iOrdinal == 2) {
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                ((Boolean) obj).getClass();
                if (visVar.e) {
                    iu30Var.invoke(q7x0.X);
                } else {
                    iu30Var.invoke(q7x0.h);
                }
                return rih1Var;
        }
    }
}
