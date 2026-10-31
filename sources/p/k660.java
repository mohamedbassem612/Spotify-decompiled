package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k660 extends xpl1 {
    public final void a(xct xctVar) {
        c9a c9aVar = ((xpl1) this).b;
        int i = c9aVar.w0;
        zct zctVar = ((xpl1) this).h;
        Iterator it = zctVar.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((zct) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            zctVar.d(i3 + c9aVar.y0);
        } else {
            zctVar.d(i2 + c9aVar.y0);
        }
    }

    public final void d() {
        c9a c9aVar = ((xpl1) this).b;
        if (c9aVar instanceof c9a) {
            zct zctVar = ((xpl1) this).h;
            zctVar.b = true;
            ArrayList arrayList = zctVar.l;
            c9a c9aVar2 = c9aVar;
            int i = c9aVar2.w0;
            boolean z = c9aVar2.x0;
            int i2 = 0;
            if (i == 0) {
                zctVar.e = 4;
                while (i2 < ((l660) c9aVar2).v0) {
                    cjl cjlVar = ((l660) c9aVar2).u0[i2];
                    if (z || cjlVar.i0 != 8) {
                        zct zctVar2 = ((xpl1) cjlVar.d).h;
                        zctVar2.k.add(zctVar);
                        arrayList.add(zctVar2);
                    }
                    i2++;
                }
                m(((xpl1) ((xpl1) this).b.d).h);
                m(((xpl1) ((xpl1) this).b.d).i);
                return;
            }
            if (i == 1) {
                zctVar.e = 5;
                while (i2 < ((l660) c9aVar2).v0) {
                    cjl cjlVar2 = ((l660) c9aVar2).u0[i2];
                    if (z || cjlVar2.i0 != 8) {
                        zct zctVar3 = ((xpl1) cjlVar2.d).i;
                        zctVar3.k.add(zctVar);
                        arrayList.add(zctVar3);
                    }
                    i2++;
                }
                m(((xpl1) ((xpl1) this).b.d).h);
                m(((xpl1) ((xpl1) this).b.d).i);
                return;
            }
            if (i == 2) {
                zctVar.e = 6;
                while (i2 < ((l660) c9aVar2).v0) {
                    cjl cjlVar3 = ((l660) c9aVar2).u0[i2];
                    if (z || cjlVar3.i0 != 8) {
                        zct zctVar4 = ((xpl1) cjlVar3.e).h;
                        zctVar4.k.add(zctVar);
                        arrayList.add(zctVar4);
                    }
                    i2++;
                }
                m(((xpl1) ((xpl1) this).b.e).h);
                m(((xpl1) ((xpl1) this).b.e).i);
                return;
            }
            if (i != 3) {
                return;
            }
            zctVar.e = 7;
            while (i2 < ((l660) c9aVar2).v0) {
                cjl cjlVar4 = ((l660) c9aVar2).u0[i2];
                if (z || cjlVar4.i0 != 8) {
                    zct zctVar5 = ((xpl1) cjlVar4.e).i;
                    zctVar5.k.add(zctVar);
                    arrayList.add(zctVar5);
                }
                i2++;
            }
            m(((xpl1) ((xpl1) this).b.e).h);
            m(((xpl1) ((xpl1) this).b.e).i);
        }
    }

    public final void e() {
        c9a c9aVar = ((xpl1) this).b;
        if (c9aVar instanceof c9a) {
            int i = c9aVar.w0;
            zct zctVar = ((xpl1) this).h;
            if (i == 0 || i == 1) {
                ((cjl) c9aVar).a0 = zctVar.g;
            } else {
                ((cjl) c9aVar).b0 = zctVar.g;
            }
        }
    }

    public final void f() {
        ((xpl1) this).c = null;
        ((xpl1) this).h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(zct zctVar) {
        zct zctVar2 = ((xpl1) this).h;
        zctVar2.k.add(zctVar);
        zctVar.l.add(zctVar2);
    }
}
