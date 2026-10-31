package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ gr6 a;
    public final /* synthetic */ qfl1 b;

    public qhk(gr6 gr6Var, qfl1 qfl1Var) {
        this.a = gr6Var;
        this.b = qfl1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        List list = ((yfk) obj).e;
        String string = this.b.a.getString(2131957338);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str : list2) {
            Set set = s4b1.f;
            String strZ = uic.c(str).z();
            if (strZ == null) {
                strZ = "";
            }
            arrayList.add(strZ);
        }
        this.a.a(string, arrayList);
        return rih1.a;
    }
}
