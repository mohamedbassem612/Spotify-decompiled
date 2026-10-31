package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aa7 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ilh1 a;

    public aa7(ilh1 ilh1Var) {
        this.a = ilh1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        o97 o97Var = (o97) obj;
        int i = o97Var.c;
        List list = o97Var.b;
        ilh1 ilh1Var = this.a;
        aek1 aek1Var = (aek1) ilh1Var.c;
        boolean z = aek1Var.c == null || o97Var.d;
        boolean zB = aek1Var.b(i);
        aek1Var.c = Integer.valueOf(list.size());
        if (zB) {
            aek1Var.a(i);
        }
        if (zB || z) {
            int i2 = aek1Var.d;
            int i3 = i2 >= 0 ? i2 : 0;
            int i4 = i3 + 50;
            int size = list.size();
            if (i4 > size) {
                i4 = size;
            }
            if (i3 > i4) {
                i3 = i4;
            }
            List<i> listSubList = list.subList(i3, i4);
            ArrayList arrayList = new ArrayList();
            for (i iVar : listSubList) {
                g gVar = iVar instanceof g ? (g) iVar : null;
                String str = gVar != null ? gVar.a : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            ((x5b0) ilh1Var.b).a(o97Var.a, arrayList);
        }
        return rih1.a;
    }
}
