package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hh30 extends m1q0 {
    public final /* synthetic */ th30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh30(th30 th30Var) {
        super(false);
        this.d = th30Var;
    }

    @Override // p.m1q0
    public final void a() {
        boolean zP = th30.P(3);
        th30 th30Var = this.d;
        if (zP) {
            Objects.toString(th30Var);
        }
        th30Var.d();
    }

    @Override // p.m1q0
    public final void b() {
        boolean zP = th30.P(3);
        th30 th30Var = this.d;
        if (zP) {
            Objects.toString(th30Var);
        }
        hh30 hh30Var = th30Var.j;
        ArrayList<oh30> arrayList = th30Var.o;
        th30Var.i = true;
        th30Var.A(true);
        th30Var.i = false;
        if (th30Var.h == null) {
            if (hh30Var.a) {
                th30.P(3);
                th30Var.Y();
                return;
            } else {
                th30.P(3);
                th30Var.g.d();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(th30.K(th30Var.h));
            for (oh30 oh30Var : arrayList) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    oh30Var.a((zf30) it.next(), true);
                }
            }
        }
        Iterator it2 = th30Var.h.c.iterator();
        while (it2.hasNext()) {
            zf30 zf30Var = ((wi30) it2.next()).b;
            if (zf30Var != null) {
                zf30Var.Z = false;
            }
        }
        for (kss kssVar : th30Var.g(new ArrayList(Collections.singletonList(th30Var.h)), 0, 1)) {
            kssVar.getClass();
            th30.P(3);
            ArrayList arrayList2 = kssVar.c;
            kssVar.k(arrayList2);
            kssVar.c(arrayList2);
        }
        Iterator it3 = th30Var.h.c.iterator();
        while (it3.hasNext()) {
            zf30 zf30Var2 = ((wi30) it3.next()).b;
            if (zf30Var2 != null && zf30Var2.i1 == null) {
                th30Var.h(zf30Var2).k();
            }
        }
        th30Var.h = null;
        th30Var.p0();
        if (th30.P(3)) {
            boolean z = hh30Var.a;
            th30Var.toString();
        }
    }

    @Override // p.m1q0
    public final void c(vt9 vt9Var) {
        boolean zP = th30.P(2);
        th30 th30Var = this.d;
        if (zP) {
            Objects.toString(th30Var);
        }
        if (th30Var.h != null) {
            for (kss kssVar : th30Var.g(new ArrayList(Collections.singletonList(th30Var.h)), 0, 1)) {
                kssVar.getClass();
                th30.P(2);
                ArrayList arrayList = kssVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((foa1) it.next()).k, arrayList2);
                }
                List listL1 = o7h.l1(o7h.p1(arrayList2));
                int size = listL1.size();
                for (int i = 0; i < size; i++) {
                    ((eoa1) listL1.get(i)).e(vt9Var);
                }
            }
            Iterator it2 = th30Var.o.iterator();
            while (it2.hasNext()) {
                ((oh30) it2.next()).getClass();
            }
        }
    }

    @Override // p.m1q0
    public final void d(vt9 vt9Var) {
        boolean zP = th30.P(3);
        th30 th30Var = this.d;
        if (zP) {
            Objects.toString(th30Var);
        }
        th30Var.x();
        th30Var.y(new rh30(th30Var), false);
    }
}
