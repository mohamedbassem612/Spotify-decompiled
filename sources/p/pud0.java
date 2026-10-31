package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.player.model.ContextTrack;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pud0 implements bkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ContextTrack b;
    public final /* synthetic */ e711 c;

    public /* synthetic */ pud0(e711 e711Var, ContextTrack contextTrack, byte b) {
        this.a = b;
        this.c = e711Var;
        this.b = contextTrack;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ContextTrack contextTrack = this.b;
        e711 e711Var = this.c;
        switch (b) {
            case 0:
                qud0 qud0Var = (qud0) e711Var;
                int i = qud0Var.a1;
                ImageView imageView = qud0Var.X0;
                int i2 = qud0Var.Y0;
                int i3 = qud0Var.b1;
                ViewGroup viewGroup = qud0Var.W0;
                View viewFindViewById = viewGroup.findViewById(2131427919);
                View viewFindViewById2 = viewGroup.findViewById(2131427918);
                if (viewFindViewById == null || viewFindViewById2 == null) {
                    bhn0.i("The Mode Page layout is missing carousel_item_safe_barrier_top and/or carousel_item_safe_barrier_bottom views, needed to position the circular speaker image in between.");
                } else {
                    int top = (viewFindViewById2.getTop() - viewFindViewById.getBottom()) - (qud0Var.c1 + i3);
                    int i4 = i2 - (i * 2);
                    int iMin = Math.min(top, i4);
                    int bottom = ((top - iMin) / 2) + viewFindViewById.getBottom() + i3;
                    boolean z = i2 > qud0Var.Z0;
                    boolean z2 = ((double) iMin) > ((double) i2) * 0.4d;
                    if (z || z2) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                        layoutParams.height = iMin;
                        layoutParams.width = iMin;
                        layoutParams.setMargins(0, bottom, 0, 0);
                        imageView.setLayoutParams(layoutParams);
                    }
                    String strT = l4o1.t(contextTrack);
                    if (strT != null) {
                        ixg ixgVarF = qud0Var.V0.f(strT);
                        ixgVarF.l(2131233988);
                        ixgVarF.p(i4, i4, 1);
                        ixgVarF.d();
                        ixgVarF.s(new kcg());
                        ixgVarF.k(imageView, (ird1) null);
                    } else {
                        imageView.setImageResource(2131233988);
                    }
                }
                break;
            default:
                n9b1 n9b1Var = (n9b1) e711Var;
                ImageView imageView2 = n9b1Var.a1;
                n9b1Var.L();
                if (n9b1Var.Y0.g() && !l4o1.C(contextTrack)) {
                    imageView2.setImageResource(2131233988);
                    xab1 xab1Var = n9b1Var.o1;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    n9b1Var.o1 = null;
                    n9b1Var.o1 = fn31.T(n9b1Var.n1, (o8n) null, 0, new sb91(n9b1Var, contextTrack, (lnm) null, (byte) 19), 3);
                } else {
                    String strT2 = l4o1.t(contextTrack);
                    if (strT2 != null) {
                        n9b1Var.K(strT2);
                    } else {
                        imageView2.setImageResource(2131233988);
                    }
                }
                break;
        }
    }
}
