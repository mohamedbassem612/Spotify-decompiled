package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uye implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ o0f a;

    public uye(o0f o0fVar) {
        this.a = o0fVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gye gyeVar = (gye) obj;
        dr41 dr41Var = this.a.z;
        String str = gyeVar.a;
        List list = gyeVar.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((w4i1) it.next()).a);
        }
        Object objD = ((uoe) dr41Var.b).d(str, arrayList, onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
