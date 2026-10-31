package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mnn0 {
    public final ReentrantLock a = new ReentrantLock(true);
    public final bpb1 b;
    public final bpb1 c;
    public boolean d;
    public final xe01 e;
    public final xe01 f;
    public final mzn0 g;
    public final /* synthetic */ gon0 h;

    public mnn0(gon0 gon0Var, mzn0 mzn0Var) {
        this.h = gon0Var;
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.b = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(w7x.a);
        this.c = bpb1VarB2;
        this.e = d5p1.h(bpb1VarB);
        this.f = d5p1.h(bpb1VarB2);
        this.g = mzn0Var;
    }

    public final void a(hnn0 hnn0Var) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            bpb1 bpb1Var = this.b;
            bpb1Var.m((Object) null, o7h.O0(hnn0Var, (Collection) bpb1Var.getValue()));
        } finally {
            reentrantLock.unlock();
        }
    }

    public final hnn0 b(vnn0 vnn0Var, Bundle bundle) {
        gon0 gon0Var = this.h;
        return new hnn0(gon0Var.a, vnn0Var, bundle, gon0Var.j(), gon0Var.f54p, UUID.randomUUID().toString(), (Bundle) null);
    }

    public final void c(hnn0 hnn0Var) {
        pnn0 pnn0Var;
        rck1 rck1Var;
        String str = hnn0Var.f;
        gon0 gon0Var = this.h;
        bpb1 bpb1Var = gon0Var.i;
        LinkedHashMap linkedHashMap = gon0Var.z;
        boolean zJ = u890.j(linkedHashMap.get(hnn0Var), Boolean.TRUE);
        bpb1 bpb1Var2 = this.c;
        bpb1Var2.m((Object) null, dm61.u0(hnn0Var, (Set) bpb1Var2.getValue()));
        linkedHashMap.remove(hnn0Var);
        n36 n36Var = gon0Var.g;
        if (n36Var.contains(hnn0Var)) {
            if (this.d) {
                return;
            }
            gon0Var.G();
            bpb1 bpb1Var3 = gon0Var.h;
            ArrayList arrayList = new ArrayList((Collection) n36Var);
            bpb1Var3.getClass();
            bpb1Var3.m((Object) null, arrayList);
            ArrayList arrayListX = gon0Var.x();
            bpb1Var.getClass();
            bpb1Var.m((Object) null, arrayListX);
            return;
        }
        gon0Var.F(hnn0Var);
        if (hnn0Var.h.i.a(w8c0.c)) {
            hnn0Var.b(w8c0.a);
        }
        if (n36Var == null || !n36Var.isEmpty()) {
            Iterator it = n36Var.iterator();
            while (it.hasNext()) {
                if (((hnn0) it.next()).f.equals(str)) {
                }
            }
            if (!zJ && (pnn0Var = gon0Var.f54p) != null && (rck1Var = (rck1) pnn0Var.b.remove(str)) != null) {
                rck1Var.a();
            }
        } else if (!zJ) {
            rck1Var.a();
        }
        gon0Var.G();
        ArrayList arrayListX2 = gon0Var.x();
        bpb1Var.getClass();
        bpb1Var.m((Object) null, arrayListX2);
    }

    public final void d(hnn0 hnn0Var) {
        int iNextIndex;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList((Collection) this.e.a.getValue());
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (((hnn0) listIterator.previous()).f.equals(hnn0Var.f)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            arrayList.set(iNextIndex, hnn0Var);
            this.b.m((Object) null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(hnn0 hnn0Var, boolean z) {
        gon0 gon0Var = this.h;
        mzn0 mzn0VarB = gon0Var.v.b(hnn0Var.b.a);
        gon0Var.z.put(hnn0Var, Boolean.valueOf(z));
        if (!mzn0VarB.equals(this.g)) {
            Object obj = gon0Var.w.get(mzn0VarB);
            obj.getClass();
            ((mnn0) obj).e(hnn0Var, z);
            return;
        }
        nnn0 nnn0Var = gon0Var.y;
        if (nnn0Var != null) {
            nnn0Var.invoke(hnn0Var);
            f(hnn0Var);
            return;
        }
        s2n0 s2n0Var = new s2n0(this, hnn0Var, z);
        n36 n36Var = gon0Var.g;
        int iIndexOf = n36Var.indexOf(hnn0Var);
        if (iIndexOf < 0) {
            hnn0Var.toString();
            return;
        }
        int i = iIndexOf + 1;
        if (i != n36Var.c) {
            gon0Var.u(((hnn0) n36Var.get(i)).b.h, true, false);
        }
        gon0.w(gon0Var, hnn0Var);
        s2n0Var.invoke();
        gon0Var.H();
        gon0Var.e();
    }

    public final void f(hnn0 hnn0Var) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            bpb1 bpb1Var = this.b;
            Iterable iterable = (Iterable) bpb1Var.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (u890.j((hnn0) obj, hnn0Var)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            bpb1Var.m((Object) null, arrayList);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void g(hnn0 hnn0Var, boolean z) {
        Object objPrevious;
        zob1 zob1Var = this.e.a;
        bpb1 bpb1Var = this.c;
        Iterable iterable = (Iterable) bpb1Var.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((hnn0) it.next()) == hnn0Var) {
                    Iterable iterable2 = (Iterable) zob1Var.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((hnn0) it2.next()) == hnn0Var) {
                            break;
                        }
                    }
                    return;
                }
            }
        }
        bpb1Var.m((Object) null, dm61.x0(hnn0Var, (Set) bpb1Var.getValue()));
        List list = (List) zob1Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            hnn0 hnn0Var2 = (hnn0) objPrevious;
            if (!u890.j(hnn0Var2, hnn0Var) && ((List) zob1Var.getValue()).lastIndexOf(hnn0Var2) < ((List) zob1Var.getValue()).lastIndexOf(hnn0Var)) {
                break;
            }
        }
        hnn0 hnn0Var3 = (hnn0) objPrevious;
        if (hnn0Var3 != null) {
            bpb1Var.m((Object) null, dm61.x0(hnn0Var3, (Set) bpb1Var.getValue()));
        }
        e(hnn0Var, z);
    }

    public final void h(hnn0 hnn0Var) {
        bpb1 bpb1Var = this.c;
        bpb1Var.m((Object) null, dm61.x0(hnn0Var, (Set) bpb1Var.getValue()));
        if (this.h.g.contains(hnn0Var)) {
            hnn0Var.b(w8c0.d);
        } else {
            eg.m("Cannot transition entry that is not in the back stack");
        }
    }

    public final void i(hnn0 hnn0Var) {
        gon0 gon0Var = this.h;
        mzn0 mzn0VarB = gon0Var.v.b(hnn0Var.b.a);
        if (mzn0VarB.equals(this.g)) {
            iu30 iu30Var = gon0Var.x;
            if (iu30Var == null) {
                Objects.toString(hnn0Var.b);
                return;
            } else {
                iu30Var.invoke(hnn0Var);
                a(hnn0Var);
                return;
            }
        }
        Object obj = gon0Var.w.get(mzn0VarB);
        if (obj != null) {
            ((mnn0) obj).i(hnn0Var);
        } else {
            bhn0.f(l1d.n(hnn0Var.b.a, " should already be created", new StringBuilder("NavigatorBackStack for ")));
        }
    }

    public final void j(hnn0 hnn0Var) {
        zob1 zob1Var = this.e.a;
        bpb1 bpb1Var = this.c;
        Iterable iterable = (Iterable) bpb1Var.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((hnn0) it.next()) == hnn0Var) {
                    Iterable iterable2 = (Iterable) zob1Var.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((hnn0) it2.next()) == hnn0Var) {
                                return;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        hnn0 hnn0Var2 = (hnn0) o7h.C0((List) zob1Var.getValue());
        if (hnn0Var2 != null) {
            bpb1Var.m((Object) null, dm61.x0(hnn0Var2, (Set) bpb1Var.getValue()));
        }
        bpb1Var.m((Object) null, dm61.x0(hnn0Var, (Set) bpb1Var.getValue()));
        i(hnn0Var);
    }
}
