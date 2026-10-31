package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hlo implements av30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ chm0 b;

    public /* synthetic */ hlo(chm0 chm0Var, byte b) {
        this.a = b;
        this.b = chm0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        chm0 chm0Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayListB = chm0Var.b();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListB) {
                    if (obj2 instanceof szg) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((szg) it.next()).a(), arrayList2);
                }
                return o7h.p1(arrayList2);
            default:
                ArrayList arrayListB2 = chm0Var.b();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayListB2) {
                    if (obj3 instanceof miv0) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    r7h.W(((miv0) it2.next()).b(), arrayList4);
                }
                return o7h.p1(arrayList4);
        }
    }
}
