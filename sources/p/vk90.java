package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vk90 implements f4r {
    public final /* synthetic */ List a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ hwq c;

    public vk90(xk90 xk90Var, List list, ArrayList arrayList, hwq hwqVar) {
        this.a = list;
        this.b = arrayList;
        this.c = hwqVar;
    }

    public final f1r a(Object obj) {
        List list = this.a;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(qxy0.r(((wul1) it.next()).getData().a(this.c)));
        }
        return new lch(o7h.N0(arrayList2, list));
    }
}
