package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lrv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dlg1 a;

    public lrv(dlg1 dlg1Var) {
        this.a = dlg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        hrv hrvVar = (hrv) obj;
        List list = hrvVar.a;
        dlg1 dlg1Var = this.a;
        aek1 aek1Var = (aek1) dlg1Var.a;
        boolean z = aek1Var.c == null || hrvVar.b;
        aek1Var.c = Integer.valueOf(list.size());
        Integer num = hrvVar.c;
        if (num == null || !aek1Var.b(num.intValue())) {
            num = null;
        }
        if (num != null) {
            aek1Var.a(num.intValue());
        }
        if (num != null || z) {
            int i = aek1Var.d;
            int i2 = i >= 0 ? i : 0;
            int i3 = i2 + 50;
            int size = list.size();
            if (i3 > size) {
                i3 = size;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            List listSubList = list.subList(i2, i3);
            ArrayList arrayList = new ArrayList(q7h.U(listSubList, 10));
            Iterator it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(((ru31) dlg1Var.b).Y.a(new fu31(0, (ftv) it.next(), (ftv) null, false, false, false, false, (Map) null, 1021)));
            }
            ((rhg0) dlg1Var.c).a(o7h.p1(arrayList), (ArrayList) null, (ArrayList) null);
        }
        return rih1.a;
    }
}
