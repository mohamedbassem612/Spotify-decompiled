package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dgz0 {
    public final kl1 a;

    public dgz0(kl1 kl1Var, khc khcVar) {
        this.a = kl1Var;
    }

    public final qfz0 a(RecyclerView recyclerView, ViewGroup viewGroup, h5a1 h5a1Var, bgz0 bgz0Var, int i) {
        View view;
        dq91 utw0Var;
        View agz0Var = new agz0(viewGroup.getContext());
        boolean z = i == 1;
        h5a1 h5a1Var2 = wbx0.d;
        kl1 kl1Var = this.a;
        if (z) {
            utw0Var = new dq91(viewGroup, recyclerView, kl1Var, agz0Var, h5a1Var == null ? h5a1Var2 : h5a1Var, bgz0Var);
            view = agz0Var;
        } else {
            view = agz0Var;
            if (h5a1Var == null) {
                h5a1Var = h5a1Var2;
            }
            utw0Var = new utw0();
            qvb1 qvb1Var = new qvb1(recyclerView.getContext());
            k8p1.o(viewGroup, qvb1Var);
            qvb1Var.addView(view, -1, -2);
            qvb1Var.a(recyclerView, view, h5a1Var, bgz0Var, kl1Var);
            ((utw0) utw0Var).a = qvb1Var;
        }
        kl1Var.b = view;
        return utw0Var;
    }
}
