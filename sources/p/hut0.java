package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hut0 {
    public final r5h a;
    public final f8b b;
    public final ls00 c;
    public final qns0 d;
    public final uu00 e;
    public final o241 f;

    public hut0(r5h r5hVar, f8b f8bVar, ls00 ls00Var, qns0 qns0Var, uu00 uu00Var, o241 o241Var) {
        this.a = r5hVar;
        this.b = f8bVar;
        this.c = ls00Var;
        this.d = qns0Var;
        this.e = uu00Var;
        this.f = o241Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ArrayList arrayList, onm onmVar) {
        aut0 aut0Var;
        if (onmVar instanceof aut0) {
            aut0Var = (aut0) onmVar;
            int i = aut0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aut0Var.c = i - Integer.MIN_VALUE;
            } else {
                aut0Var = new aut0(this, onmVar);
            }
        } else {
            aut0Var = new aut0(this, onmVar);
        }
        Object objA = aut0Var.a;
        int i2 = aut0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qns0 qns0Var = this.d;
                aut0Var.c = 1;
                objA = qns0Var.a("PlayabilityStateProvider", arrayList, aut0Var, false);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (List) objA) {
                if (((qfd) obj).b) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((qfd) it.next()).a);
            }
            return o7h.p1(arrayList3);
        } catch (Exception unused) {
            return w7x.a;
        }
    }

    public final jge b(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            y6b1 y6b1Var = new y6b1((String) obj, false);
            v6b1 v6b1Var = v6b1.SHOW;
            v6b1 v6b1Var2 = y6b1Var.c;
            if (v6b1Var2 == v6b1Var || v6b1Var2 == v6b1.TRACK) {
                arrayList.add(obj);
            }
        }
        Set setP1 = o7h.p1(arrayList);
        return hu20.e(rqt0.u(new uop0(yoi1.g(((p241) this.f).a), (byte) 14)), new kdk(this, setP1, set, dm61.v0(set, setP1), (lnm) null, (byte) 2));
    }
}
