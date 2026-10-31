package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ydz0 implements lh9 {
    public final kh9 a;
    public final ni9 b;
    public final pg5 c;
    public final c9n d;
    public final llm e;
    public final dt71 f;
    public final ConcurrentLinkedQueue g;
    public final LinkedHashMap h;
    public final LinkedHashSet i;

    public ydz0(kh9 kh9Var, ni9 ni9Var, q8n q8nVar, pg5 pg5Var) {
        llm llmVarH = us71.h(q8nVar);
        this.a = kh9Var;
        this.b = ni9Var;
        this.c = pg5Var;
        this.d = llmVarH;
        llm llmVarH2 = us71.h(q8nVar);
        this.e = llmVarH2;
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        this.f = dt71VarE;
        this.g = new ConcurrentLinkedQueue();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashSet();
        l4p1.u(llmVarH2, new fu20(dt71VarE, new u98(2, this, ydz0.class, "handleAction", "handleAction(Lcom/spotify/bluetooth/connectionimpl/QueuedBLEConnectionOperationQueue$OperationQueueAction;)V", 4, (byte) 15), (byte) 1));
    }

    @Override // p.lh9
    public final void a(String str) {
        e(new sdz0(str));
    }

    @Override // p.lh9
    public final void b(jh9 jh9Var) {
        e(new rdz0(jh9Var));
    }

    @Override // p.lh9
    public final void c(pf9 pf9Var) {
        e(new udz0(pf9Var));
    }

    @Override // p.lh9
    public final void clear() {
        e(pdz0.a);
    }

    @Override // p.lh9
    public final void d(jh9 jh9Var) {
        e(new vdz0(jh9Var));
    }

    public final void e(wdz0 wdz0Var) {
        fn31.T(this.e, (o8n) null, 0, new pew0(this, wdz0Var, false, (lnm) null, (byte) 25), 3);
    }

    public final void f() {
        LinkedHashSet linkedHashSet;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = this.h;
        Iterator it = sqg0.U(linkedHashMap).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashSet = this.i;
            concurrentLinkedQueue = this.g;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            odz0 odz0Var = (odz0) entry.getValue();
            if (odz0Var.a == null) {
                Iterator it2 = concurrentLinkedQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    jh9 jh9Var = (jh9) next2;
                    if (u890.j(jh9Var.a(), str) && (!linkedHashSet.contains(str) || (!(jh9Var instanceof ih9) && !(jh9Var instanceof eh9)))) {
                        break;
                    }
                }
                jh9 jh9Var2 = (jh9) next2;
                if (jh9Var2 != null) {
                    concurrentLinkedQueue.remove(jh9Var2);
                    g(odz0Var, jh9Var2);
                } else if (odz0Var.b && odz0Var.d == null) {
                    odz0Var.d = fn31.T(this.e, (o8n) null, 0, new ian0(this, str, (lnm) null, (byte) 22), 3);
                }
            }
        }
        while (linkedHashMap.size() < yoi1.p(((Number) this.c.b()).intValue(), 1, 8)) {
            Iterator it3 = concurrentLinkedQueue.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!(((jh9) next) instanceof dh9));
            jh9 jh9Var3 = (jh9) next;
            if (jh9Var3 == null) {
                return;
            }
            concurrentLinkedQueue.remove(jh9Var3);
            odz0 odz0Var2 = new odz0();
            odz0Var2.a = null;
            odz0Var2.b = false;
            odz0Var2.c = false;
            odz0Var2.d = null;
            odz0Var2.e = null;
            linkedHashMap.put(jh9Var3.a(), odz0Var2);
            linkedHashSet.add(jh9Var3.a());
            g(odz0Var2, jh9Var3);
        }
    }

    public final void g(odz0 odz0Var, jh9 jh9Var) {
        odz0Var.a = jh9Var;
        odz0Var.e = l4p1.u(this.d, new fu20(new ht20(new uh9(new m441(new vh9(((Number) this.b.g.b()).intValue(), null, (byte) 1)), jh9Var, (byte) 1), new p2z0(this, jh9Var, (lnm) null, (byte) 2)), new p2z0(this, (lnm) null, (byte) 3), (byte) 1));
    }
}
