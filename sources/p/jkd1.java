package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jkd1 implements pua0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final llm b;
    public final AtomicBoolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ kkd1 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ vu30 i;

    public jkd1(q8n q8nVar, iu30 iu30Var, vu30 vu30Var, boolean z, kkd1 kkd1Var, iu30 iu30Var2, vu30 vu30Var2) {
        this.d = iu30Var;
        this.e = vu30Var;
        this.f = z;
        this.g = kkd1Var;
        this.h = iu30Var2;
        this.i = vu30Var2;
        j0d1 j0d1VarB = guo1.B();
        q8nVar.getClass();
        this.b = smo1.e(ilo1.B(q8nVar, j0d1VarB));
        this.c = new AtomicBoolean(false);
    }

    @Override // p.pua0
    public final Map a(Set set) {
        if (this.c.get()) {
            eg.m("Subscription is disposed");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        Iterator it = dm61.v0(concurrentHashMap.keySet(), set).iterator();
        while (it.hasNext()) {
            faa0 faa0Var = (faa0) concurrentHashMap.remove(it.next());
            if (faa0Var != null) {
                faa0Var.d(null);
            }
        }
        Set setV0 = dm61.v0(set, concurrentHashMap.keySet());
        ArrayList arrayList = new ArrayList(q7h.U(setV0, 10));
        Iterator it2 = setV0.iterator();
        while (it2.hasNext()) {
            arrayList.add(oqn1.n(it2.next(), i3r.a));
        }
        if (!arrayList.isEmpty()) {
            this.h.invoke(arrayList);
        }
        for (Object obj : setV0) {
            jkd1 jkd1Var = this;
            concurrentHashMap.put(obj, c921.y(jkd1Var.b, (o8n) null, 0, new fhl(this.d, obj, this.e, jkd1Var, this.f, this.g, this.h, (lnm) null, (byte) 4), 3));
            this = jkd1Var;
        }
        return b7x.a;
    }

    @Override // p.pua0
    public final void b(Set set) {
        if (this.c.get()) {
            eg.m("Subscription is disposed");
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.g.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove(it.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.pua0
    public final Object c(List list, onm onmVar) {
        gkd1 gkd1Var;
        Iterator it;
        if (onmVar instanceof gkd1) {
            gkd1Var = (gkd1) onmVar;
            int i = gkd1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkd1Var.d = i - Integer.MIN_VALUE;
            } else {
                gkd1Var = new gkd1(this, onmVar);
            }
        } else {
            gkd1Var = new gkd1(this, onmVar);
        }
        Object obj = gkd1Var.b;
        int i2 = gkd1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = gkd1Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            mmr0 mmr0Var = (mmr0) it.next();
            if (this.c.get()) {
                eg.m("Subscription is disposed");
                return null;
            }
            gkd1Var.a = it;
            gkd1Var.d = 1;
            Object objInvoke = this.i.invoke(mmr0Var, gkd1Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }

    @Override // p.pua0
    public final void dispose() {
        if (this.c.compareAndSet(false, true)) {
            smo1.q(this.b);
            this.a.clear();
        }
    }
}
