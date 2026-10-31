package p;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.home.evopage.mobius.State;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dl00 implements rjp0 {
    public final /* synthetic */ el00 a;

    public dl00(el00 el00Var) {
        this.a = el00Var;
    }

    public final void b(Object obj) {
        State state = (State) obj;
        el00 el00Var = this.a;
        el00Var.U0.setRefreshing(false);
        if (state instanceof State.Content) {
            if (!el00Var.S0.d0()) {
                ho60 ho60Var = el00Var.e;
                RecyclerView recyclerView = el00Var.T0;
                State.Content content = (State.Content) state;
                ArrayList arrayListL = apo.l(content.getModel());
                Set setY = apo.y(content.getModel());
                LinkedHashSet linkedHashSet = ho60Var.i;
                linkedHashSet.clear();
                linkedHashSet.addAll(setY);
                if (ho60Var.e || !ho60Var.d.L()) {
                    ho60Var.a(recyclerView, arrayListL, setY, true);
                }
            }
            State.Content content2 = (State.Content) state;
            el00Var.a.setTag(o7h.y0(content2.getLoadingHistory(), null, null, null, null, 63));
            el00Var.a1 = content2.isOnline();
        }
    }
}
