package p;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rx20 implements tl7, hs80 {
    public final vz20 a;
    public final llm b;
    public final dt71 c = mgo1.e(2, 0, 2, 2);
    public final LinkedHashSet d = new LinkedHashSet();

    public rx20(vz20 vz20Var, q8n q8nVar) {
        this.a = vz20Var;
        this.b = smo1.e(q8nVar);
    }

    public final void a(sl7 sl7Var) {
        Object next;
        LinkedHashSet linkedHashSet = this.d;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((qx20) next).b.equals(sl7Var));
        qx20 qx20Var = (qx20) next;
        if (qx20Var != null) {
            faa0 faa0Var = qx20Var.c;
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            qx20Var.c = null;
            linkedHashSet.remove(qx20Var);
        }
    }

    public final void c(sl7 sl7Var) {
        Object next;
        LinkedHashSet linkedHashSet = this.d;
        Iterator it = linkedHashSet.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((qx20) next).b.equals(sl7Var));
        if (next != null) {
            return;
        }
        dt71 dt71Var = this.c;
        llm llmVar = this.b;
        qx20 qx20Var = new qx20(llmVar, dt71Var, sl7Var);
        qx20Var.c = c921.y(llmVar, (o8n) null, 0, new j020(qx20Var, (lnm) null, (byte) 4), 3);
        linkedHashSet.add(qx20Var);
    }

    @Override // p.hs80
    public final void dispose() {
        this.d.clear();
        smo1.q(this.b);
    }

    @Override // p.hs80
    public final void start() {
        c921.y(this.b, (o8n) null, 0, new j020(this, (lnm) null, (byte) 5), 3);
    }

    public final void b(rl7 rl7Var) {
    }

    public final void e(rl7 rl7Var) {
    }

    public final void j(rl7 rl7Var, jen0 jen0Var) {
    }

    public final void g(int i, Float f, Float f2, float f3) {
    }
}
