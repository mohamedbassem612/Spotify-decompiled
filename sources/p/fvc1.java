package p;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fvc1 implements a4l {
    public final muc1 a;
    public final yc4 b;
    public final llm c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public fvc1(muc1 muc1Var, yc4 yc4Var, q8n q8nVar) {
        this.a = muc1Var;
        this.b = yc4Var;
        this.c = l1d.x(q8nVar);
    }

    @Override // p.a4l
    public final void a() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            jwc1 surface = ((ewc1) it.next()).getSurface();
            md21 md21Var = new md21();
            muc1 muc1Var = this.a;
            c921.y(muc1Var.c, (o8n) null, 0, new ku91(muc1Var, surface, md21Var, (lnm) null, (byte) 8), 3);
        }
        op71.r(this.c.a);
        this.e.clear();
        this.d.clear();
        this.g.clear();
        Iterator it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            ((ewc1) it2.next()).b();
        }
        copyOnWriteArraySet.clear();
    }

    @Override // p.a4l
    public final void b() {
        throw null;
    }

    public final hp91 c(kwc1 kwc1Var) {
        if (!this.b.a()) {
            return null;
        }
        this.d.add(kwc1Var);
        faa0 faa0VarY = c921.y(this.c, (o8n) null, 0, new pec1(this, kwc1Var, (lnm) null, (byte) 2), 3);
        faa0 faa0Var = (faa0) this.e.put(lwc1.a(kwc1Var.e()), faa0VarY);
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        return new hp91(this, kwc1Var, (byte) 24);
    }

    public final r2a1 d(ewc1 ewc1Var) {
        if (!this.b.a()) {
            ewc1Var.getSurface().getClass();
            return null;
        }
        this.f.add(ewc1Var);
        faa0 faa0VarY = c921.y(this.c, (o8n) null, 0, new pec1(this, ewc1Var, (lnm) null, (byte) 3), 3);
        faa0 faa0Var = (faa0) this.g.put(ewc1Var.getSurface().a(), faa0VarY);
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        return new r2a1(this, ewc1Var, (byte) 25);
    }
}
