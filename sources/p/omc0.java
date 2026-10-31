package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class omc0 implements bik1 {
    public final /* synthetic */ byte a;

    @Override // p.bik1
    public final w611 a(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                View viewL = eqq.l(viewGroup, 2131624096, viewGroup, false);
                if (viewL != null) {
                    return new l4x((LinearLayout) viewL);
                }
                bhn0.i("rootView");
                return null;
            case 1:
                View viewL2 = eqq.l(viewGroup, 2131626269, viewGroup, false);
                if (viewL2 != null) {
                    return new l4x((LinearLayout) viewL2);
                }
                bhn0.i("rootView");
                return null;
            default:
                View viewL3 = eqq.l(viewGroup, 2131625143, viewGroup, false);
                EncoreTextView encoreTextViewT = m5n1.t(viewL3, 2131431310);
                if (encoreTextViewT != null) {
                    return new nid0(new v6a0((LinearLayout) viewL3, encoreTextViewT, (byte) 21));
                }
                bhn0.i("Missing required view with ID: ".concat(viewL3.getResources().getResourceName(2131431310)));
                return null;
        }
    }

    @Override // p.bik1
    public final void b(w611 w611Var, aik1 aik1Var) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                ((EncoreTextView) ((nid0) w611Var).U0.c).setText(((oid0) aik1Var).a);
                break;
        }
    }

    private final void c(w611 w611Var, aik1 aik1Var) {
    }

    private final void d(w611 w611Var, aik1 aik1Var) {
    }
}
