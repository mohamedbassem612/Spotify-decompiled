package p;

import android.content.res.Resources;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dze implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public dze(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        er91 er91Var;
        String string;
        nn61 nn61Var = this.a.B;
        s2v s2vVar = ((fye) obj).a;
        Resources resources = (Resources) nn61Var.b;
        if (s2vVar instanceof s2v) {
            int size = s2vVar.a.size();
            if (size != 0) {
                string = size != 1 ? resources.getQuantityString(2131820617, size, Integer.valueOf(size)) : resources.getString(2131953789);
            } else {
                string = resources.getString(2131953788);
            }
            String str = string;
            str.getClass();
            er91Var = new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else if (s2vVar instanceof t2v) {
            ArrayList arrayList = ((t2v) s2vVar).a;
            er91Var = new er91((fs91) null, resources.getQuantityString(2131820618, arrayList.size(), Integer.valueOf(arrayList.size())), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        } else {
            if (!(s2vVar instanceof u2v)) {
                eg.o();
                return null;
            }
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131953790});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            er91Var = new er91((fs91) null, "", 2131953790, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        }
        ((kt91) nn61Var.c).k(er91Var);
        return rih1.a;
    }
}
