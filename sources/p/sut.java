package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sut implements a4l {
    public final fut a;
    public final g0l b;
    public final y2l c;
    public final bvt d;
    public final evt e;
    public final gz4 f;
    public final llm g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final LinkedHashMap i = new LinkedHashMap();
    public final xgn0 t = ygn0.a();

    public sut(fut futVar, g0l g0lVar, y2l y2lVar, bvt bvtVar, evt evtVar, gz4 gz4Var, q8n q8nVar) {
        this.a = futVar;
        this.b = g0lVar;
        this.c = y2lVar;
        this.d = bvtVar;
        this.e = evtVar;
        this.f = gz4Var;
        this.g = l1d.x(q8nVar);
    }

    public static Set g(Set set) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((cut) it.next()).a());
        }
        return o7h.p1(arrayList);
    }

    @Override // p.a4l
    public final void a() {
        if (this.f.c()) {
            op71.r(this.g.a);
            c921.D(new n5s(this, new ots(this, (byte) 23), (lnm) null, (byte) 23));
        }
    }

    @Override // p.a4l
    public final void b() {
        if (this.f.c()) {
            l4p1.u(this.g, f5p1.q(c(), new z6n(this)));
        }
    }

    public final ht20 c() {
        fut futVar = this.a;
        return u4p1.b0(lyg.u(h5p1.t(rqt0.u(hu20.e(futVar.g, new dut((lnm) null, futVar, (byte) 0))), lyg.B(this.c, this.f.d()), new k6s())), new qjr());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Set set, lnm lnmVar) {
        qut qutVar;
        Set setP1;
        Set setP2;
        if (lnmVar instanceof qut) {
            qutVar = (qut) lnmVar;
            int i = qutVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qutVar.e = i - Integer.MIN_VALUE;
            } else {
                qutVar = new qut(this, lnmVar);
            }
        } else {
            qutVar = new qut(this, lnmVar);
        }
        Object obj = qutVar.c;
        int i2 = qutVar.e;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(q7h.U(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((aza) it.next()).a());
            }
            setP1 = o7h.p1(arrayList);
            setP2 = o7h.p1(this.h.keySet());
            qutVar.a = setP1;
            qutVar.b = setP2;
            qutVar.e = 1;
            Object objI = i(new put(this, setP1, setP2, (byte) 0), qutVar);
            if (objI != d9nVar) {
                objI = rih1Var;
            }
            if (objI != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set3 = qutVar.b;
            Set set4 = qutVar.a;
            hm5.M(obj);
            return rih1Var;
        }
        setP2 = qutVar.b;
        setP1 = qutVar.a;
        hm5.M(obj);
        qutVar.a = null;
        qutVar.b = null;
        qutVar.e = 2;
        Object objI2 = i(new put(this, setP1, setP2, (byte) 1), qutVar);
        if (objI2 != d9nVar) {
            objI2 = rih1Var;
        }
        return objI2 == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Function0 function0, onm onmVar) {
        rut rutVar;
        xgn0 xgn0Var;
        if (onmVar instanceof rut) {
            rutVar = (rut) onmVar;
            int i = rutVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rutVar.e = i - Integer.MIN_VALUE;
            } else {
                rutVar = new rut(this, onmVar);
            }
        } else {
            rutVar = new rut(this, onmVar);
        }
        Object obj = rutVar.c;
        int i2 = rutVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            rutVar.a = (hab0) function0;
            xgn0Var = this.t;
            rutVar.b = xgn0Var;
            rutVar.e = 1;
            Object objA = xgn0Var.a(rutVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xgn0Var = rutVar.b;
            function0 = (Function0) rutVar.a;
            hm5.M(obj);
        }
        try {
            return function0.invoke();
        } finally {
            xgn0Var.c((Object) null);
        }
    }
}
