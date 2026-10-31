package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rge extends hp51 {
    public final bbc h;
    public final /* synthetic */ AtomicReferenceArray i;

    public rge(long j, rge rgeVar, bbc bbcVar, int i) {
        super(j, rgeVar, i);
        this.h = bbcVar;
        this.i = new AtomicReferenceArray(dbc.b * 2);
    }

    @Override // p.hp51
    public final int g() {
        return dbc.b;
    }

    @Override // p.hp51
    public final void h(int i, o8n o8nVar) {
        bbc bbcVar;
        int i2 = dbc.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.i.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof o4l1;
            bbcVar = this.h;
            if (z2 || (objL instanceof p4l1)) {
                if (k(i, objL, z ? dbc.j : dbc.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        bbcVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objL == dbc.j || objL == dbc.k) {
                    break;
                }
                if (objL != dbc.g && objL != dbc.f) {
                    if (objL == dbc.i || objL == dbc.d || objL == dbc.l) {
                        return;
                    }
                    eg.m(f4i1.d(objL, "unexpected state: "));
                    return;
                }
            }
        }
        n(i, null);
        if (z) {
            bbcVar.getClass();
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.i;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.i.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            bbc bbcVar = this.h;
            bbcVar.getClass();
            bbcVar.X((this.e * ((long) dbc.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.i.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.i.set((i * 2) + 1, obj);
    }
}
