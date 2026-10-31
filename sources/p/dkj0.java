package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dkj0 extends d2d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dkj0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.d2d
    public final void b(int i, j2d j2dVar) {
        switch (this.a) {
            case 0:
                ekj0 ekj0Var = (ekj0) this.b;
                synchronized (ekj0Var.a) {
                    try {
                        if (ekj0Var.e) {
                            return;
                        }
                        ekj0Var.i.put(j2dVar.getTimestamp(), new k2d(j2dVar));
                        ekj0Var.j();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                Iterator it = ((hjk1) this.b).a.iterator();
                while (it.hasNext()) {
                    bb61 bb61Var = ((e4i1) it.next()).m;
                    Iterator it2 = bb61Var.g.d.iterator();
                    while (it2.hasNext()) {
                        ((d2d) it2.next()).b(i, new d18(j2dVar, -1L, bb61Var.g.f));
                    }
                }
                return;
        }
    }
}
