package p;

import android.view.View;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l5x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final kt91 b;

    public /* synthetic */ l5x0(kt91 kt91Var, byte b) {
        this.a = b;
        this.b = kt91Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        int i = 2131961137;
        kt91 kt91Var = this.b;
        switch (b) {
            case 0:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956077});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956077});
                kt91Var.k(new er91((fs91) null, "", 2131956077, (String) null, 2131956076, d37.e, (cvr) null, (xq91) null, false));
                break;
            case 1:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960428});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960428});
                kt91Var.k(new er91((fs91) null, "", 2131960428, (String) null, 2131959373, d37.f, (cvr) null, (xq91) null, false));
                break;
            case 2:
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961137});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131961137});
                kt91Var.k(new er91((fs91) null, "", 2131961137, (String) null, 2131959373, d37.g, (cvr) null, (xq91) null, false));
                break;
            case 3:
                h9x0 h9x0Var = (h9x0) obj;
                boolean z = h9x0Var.d;
                int iC = l1d.C(h9x0Var.c);
                if (iC == 4) {
                    i = z ? 2131960448 : 2131960449;
                } else if (iC == 5) {
                    i = z ? 2131960519 : 2131960520;
                }
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                Integer numValueOf = Integer.valueOf(i);
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{numValueOf});
                kt91Var.k(new er91((fs91) null, "", numValueOf, (String) null, 2131959373, d37.i, (cvr) null, (xq91) null, false));
                break;
            default:
                kt91Var.k(new er91((fs91) null, ((lfw) obj).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
        }
    }
}
