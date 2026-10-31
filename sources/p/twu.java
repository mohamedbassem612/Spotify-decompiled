package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class twu implements f961 {
    public final gw70 a;
    public final kly0 b;
    public final llm c;
    public final bpb1 d = gio1.b(b7x.a);
    public final xgn0 e = ygn0.a();
    public final dt71 f = mgo1.e(0, 1, 0, 5);

    public twu(gw70 gw70Var, kly0 kly0Var, q8n q8nVar) {
        this.a = gw70Var;
        this.b = kly0Var;
        this.c = i3a.k(q8nVar);
    }

    public static xwu a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (u890.j(((mmr0) obj).b, bxu.a)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return wwu.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((mmr0) obj2).b instanceof axu) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((mmr0) it.next()).a);
            }
            return new uwu(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add((String) ((mmr0) it2.next()).a);
        }
        return new vwu(arrayList4, ((axu) ((mmr0) o7h.q0(arrayList2)).b).a);
    }

    public final void b(List list) {
        fn31.T(this.c, (o8n) null, 0, new tfo(list, this, (lnm) null, (byte) 1), 3);
    }

    public final void shutdown() {
        smo1.p(this.c, (CancellationException) null);
        this.d.m((Object) null, b7x.a);
    }

    public final Object getApi() {
        return this;
    }
}
