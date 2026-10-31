package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r2v implements f961 {
    public final kly0 a;
    public final kly0 b;
    public final llm c;
    public final bpb1 d = gio1.b(b7x.a);
    public final xgn0 e = ygn0.a();
    public final dt71 f = mgo1.e(0, 1, 0, 5);

    public r2v(kly0 kly0Var, kly0 kly0Var2, q8n q8nVar) {
        this.a = kly0Var;
        this.b = kly0Var2;
        this.c = i3a.k(q8nVar);
    }

    public static v2v a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (u890.j(((mmr0) obj).b, z2v.a)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return u2v.a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((mmr0) obj2).b instanceof y2v) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add((String) ((mmr0) it.next()).a);
            }
            return new s2v(arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add((String) ((mmr0) it2.next()).a);
        }
        return new t2v(arrayList4, ((y2v) ((mmr0) o7h.q0(arrayList2)).b).a);
    }

    public final void b(List list) {
        fn31.T(this.c, (o8n) null, 0, new tfo(list, this, (lnm) null, (byte) 2), 3);
    }

    public final void shutdown() {
        smo1.p(this.c, (CancellationException) null);
        this.d.m((Object) null, b7x.a);
    }

    public final Object getApi() {
        return this;
    }
}
