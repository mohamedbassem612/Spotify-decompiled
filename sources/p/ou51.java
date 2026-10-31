package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ou51 implements bgd, o4l1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(ou51.class, Object.class, "state$volatile");
    public static final /* synthetic */ long g = avg.a.objectFieldOffset(ou51.class.getDeclaredField("state$volatile"));
    public final o8n a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = qu51.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object e = qu51.d;

    public ou51(o8n o8nVar) {
        this.a = o8nVar;
    }

    public static Object d(ou51 ou51Var, a8d1 a8d1Var) {
        return avg.a.getObjectVolatile(ou51Var, g) instanceof mu51 ? ou51Var.c(a8d1Var) : ou51Var.e(a8d1Var);
    }

    @Override // p.bgd
    public final void a(Throwable th) {
        ou51 ou51Var;
        while (true) {
            Unsafe unsafe = avg.a;
            long j = g;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == qu51.b) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = avg.a;
                ou51Var = this;
                if (unsafe2.compareAndSwapObject(ou51Var, g, objectVolatile, qu51.c)) {
                    ArrayList arrayList = ou51Var.b;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((mu51) it.next()).a();
                    }
                    ou51Var.e = qu51.d;
                    ou51Var.b = null;
                    return;
                }
                if (unsafe2.getObjectVolatile(ou51Var, j) != objectVolatile) {
                    break;
                } else {
                    this = ou51Var;
                }
            }
            this = ou51Var;
        }
    }

    @Override // p.o4l1
    public final void b(hp51 hp51Var, int i) {
        this.c = hp51Var;
        this.d = i;
    }

    public final Object c(onm onmVar) {
        Unsafe unsafe = avg.a;
        long j = g;
        mu51 mu51Var = (mu51) unsafe.getObjectVolatile(this, j);
        Object obj = mu51Var.d;
        Object obj2 = this.e;
        ArrayList<mu51> arrayList = this.b;
        if (arrayList != null) {
            for (mu51 mu51Var2 : arrayList) {
                if (mu51Var2 != mu51Var) {
                    mu51Var2.a();
                }
            }
            avg.a.putObjectVolatile(this, j, qu51.b);
            this.e = qu51.d;
            this.b = null;
        }
        Object objInvoke = mu51Var.c.invoke(mu51Var.a, obj, obj2);
        Object obj3 = mu51Var.e;
        return obj == qu51.e ? ((iu30) obj3).invoke(onmVar) : ((vu30) obj3).invoke(objInvoke, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        nu51 nu51Var;
        Object obj;
        if (onmVar instanceof nu51) {
            nu51Var = (nu51) onmVar;
            int i = nu51Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nu51Var.c = i - Integer.MIN_VALUE;
            } else {
                nu51Var = new nu51(this, onmVar);
            }
        } else {
            nu51Var = new nu51(this, onmVar);
        }
        Object obj2 = nu51Var.a;
        int i2 = nu51Var.c;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            nu51Var.c = 1;
            ohd ohdVar = new ohd(1, aym.t(nu51Var));
            ohdVar.t();
            while (true) {
                Object objectVolatile = avg.a.getObjectVolatile(this, g);
                jm jmVar = qu51.a;
                obj = rih1.a;
                if (objectVolatile == jmVar) {
                    if (lf51.j(this, objectVolatile, ohdVar)) {
                        jzn1.v(ohdVar, this);
                        break;
                    }
                } else {
                    if (!(objectVolatile instanceof List)) {
                        if (!(objectVolatile instanceof mu51)) {
                            eg.m(f4i1.d(objectVolatile, "unexpected state: "));
                            return null;
                        }
                        mu51 mu51Var = (mu51) objectVolatile;
                        Object obj4 = this.e;
                        xu30 xu30Var = mu51Var.f;
                        ohdVar.f(obj, xu30Var != null ? (xu30) xu30Var.invoke(this, mu51Var.d, obj4) : null);
                        break;
                    }
                    if (lf51.k(this, (List) objectVolatile)) {
                        Iterator it = ((Iterable) objectVolatile).iterator();
                        while (it.hasNext()) {
                            mu51 mu51VarF = f(it.next());
                            mu51VarF.getClass();
                            mu51VarF.g = null;
                            mu51VarF.h = -1;
                            h(mu51VarF, true);
                        }
                    }
                }
            }
            Object objR = ohdVar.r();
            if (objR == obj3) {
                obj = objR;
            }
            if (obj != obj3) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return obj2;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        nu51Var.c = 2;
        Object objC = c(nu51Var);
        return objC == obj3 ? obj3 : objC;
    }

    public final mu51 f(Object obj) {
        Object next;
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mu51) next).a != obj);
        mu51 mu51Var = (mu51) next;
        if (mu51Var != null) {
            return mu51Var;
        }
        n9v.h("Clause with object ", obj, " is not found");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(zsc zscVar, vu30 vu30Var) {
        h(new mu51(this, zscVar.b, (xu30) zscVar.c, (xu30) zscVar.d, null, (a8d1) vu30Var, (xu30) zscVar.e), false);
    }

    public final void h(mu51 mu51Var, boolean z) {
        Object obj = mu51Var.a;
        Unsafe unsafe = avg.a;
        long j = g;
        if (unsafe.getObjectVolatile(this, j) instanceof mu51) {
            return;
        }
        if (!z) {
            ArrayList arrayList = this.b;
            arrayList.getClass();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((mu51) it.next()).a == obj) {
                        bhn0.f(gvg.g(obj, "Cannot use select clauses on the same object: "));
                        return;
                    }
                }
            }
        }
        mu51Var.b.invoke(obj, this, mu51Var.d);
        if (this.e != qu51.d) {
            avg.a.putObjectVolatile(this, j, mu51Var);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.b;
            arrayList2.getClass();
            arrayList2.add(mu51Var);
        }
        mu51Var.g = this.c;
        mu51Var.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final int i(Object obj, Object obj2) {
        while (true) {
            Object objectVolatile = avg.a.getObjectVolatile(this, g);
            if (objectVolatile instanceof mhd) {
                mu51 mu51VarF = f(obj);
                if (mu51VarF != null) {
                    xu30 xu30Var = mu51VarF.f;
                    xu30 xu30Var2 = xu30Var != null ? (xu30) xu30Var.invoke(this, mu51VarF.d, obj2) : null;
                    mhd mhdVar = (mhd) objectVolatile;
                    if (lf51.m(this, mhdVar, mu51VarF)) {
                        this.e = obj2;
                        jm jmVarM = mhdVar.M(rih1.a, xu30Var2);
                        if (jmVarM == null) {
                            this.e = qu51.d;
                            return 2;
                        }
                        mhdVar.O(jmVarM);
                        return 0;
                    }
                } else {
                    continue;
                }
            } else {
                if (u890.j(objectVolatile, qu51.b) || (objectVolatile instanceof mu51)) {
                    return 3;
                }
                if (u890.j(objectVolatile, qu51.c)) {
                    return 2;
                }
                if (u890.j(objectVolatile, qu51.a)) {
                    if (lf51.i(this, objectVolatile, k4p1.x(obj))) {
                        return 1;
                    }
                } else {
                    if (!(objectVolatile instanceof List)) {
                        eg.m(f4i1.d(objectVolatile, "Unexpected state: "));
                        return 0;
                    }
                    if (lf51.l(this, (List) objectVolatile, o7h.O0(obj, (Collection) objectVolatile))) {
                        return 1;
                    }
                }
            }
        }
    }
}
