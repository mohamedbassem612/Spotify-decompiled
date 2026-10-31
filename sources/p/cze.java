package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public cze(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        er91 er91Var;
        String string;
        ehg0 ehg0Var = this.a.A;
        uwu uwuVar = ((dye) obj).a;
        Resources resources = ehg0Var.a;
        if (uwuVar instanceof uwu) {
            int size = uwuVar.a.size();
            if (size != 0) {
                string = size != 1 ? resources.getQuantityString(2131820611, size, Integer.valueOf(size)) : resources.getString(2131953624);
            } else {
                string = resources.getString(2131953623);
            }
            String str = string;
            str.getClass();
            er91Var = new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else if (uwuVar instanceof vwu) {
            ArrayList arrayList = ((vwu) uwuVar).a;
            er91Var = new er91((fs91) null, resources.getQuantityString(2131820612, arrayList.size(), Integer.valueOf(arrayList.size())), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else {
            if (!(uwuVar instanceof wwu)) {
                eg.o();
                return null;
            }
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953625});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91Var = new er91((fs91) null, "", 2131953625, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        }
        ehg0Var.b.k(er91Var);
        return rih1.a;
    }
}
