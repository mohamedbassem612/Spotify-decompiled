package p;

import android.app.Activity;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k1i implements m0i {
    public static final i1i h = new i1i((byte) 0);
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public k1i(Executor executor, ArrayList arrayList, ArrayList arrayList2, d1i d1iVar) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference();
        v800 v800Var = new v800(executor);
        this.e = v800Var;
        this.g = d1iVar;
        ArrayList<vzh> arrayList3 = new ArrayList();
        arrayList3.add(vzh.c(v800Var, v800.class, hnc1.class, noy0.class));
        arrayList3.add(vzh.c(this, k1i.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            vzh vzhVar = (vzh) it.next();
            if (vzhVar != null) {
                arrayList3.add(vzhVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((lly0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((d1i) this.g).a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((vzh) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.d).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.d).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.a).isEmpty()) {
                hm5.r(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.a).keySet());
                arrayList6.addAll(arrayList3);
                hm5.r(arrayList6);
            }
            for (vzh vzhVar2 : arrayList3) {
                ((HashMap) this.a).put(vzhVar2, new aob0(new j1i(this, vzhVar2)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f).get();
        if (bool != null) {
            h((HashMap) this.a, bool.booleanValue());
        }
    }

    @Override // p.m0i
    public synchronized lly0 b(lzy0 lzy0Var) {
        kub0 kub0Var = (kub0) ((HashMap) this.c).get(lzy0Var);
        if (kub0Var != null) {
            return kub0Var;
        }
        return h;
    }

    @Override // p.m0i
    public synchronized lly0 e(lzy0 lzy0Var) {
        hm5.m(lzy0Var, "Null interface requested.");
        return (lly0) ((HashMap) this.b).get(lzy0Var);
    }

    @Override // p.m0i
    public aqq0 f(lzy0 lzy0Var) {
        lly0 lly0VarE = e(lzy0Var);
        if (lly0VarE == null) {
            return new aqq0(aqq0.c, aqq0.d);
        }
        return lly0VarE instanceof aqq0 ? (aqq0) lly0VarE : new aqq0(null, lly0VarE);
    }

    public void h(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            vzh vzhVar = (vzh) entry.getKey();
            lly0 lly0Var = (lly0) entry.getValue();
            byte b = vzhVar.d;
            if (b == 1 || (b == 2 && z)) {
                lly0Var.get();
            }
        }
        v800 v800Var = (v800) this.e;
        synchronized (v800Var) {
            try {
                arrayDeque = v800Var.b;
                if (arrayDeque != null) {
                    v800Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                pze0.m(it.next());
                throw null;
            }
        }
    }

    public void i(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.a);
        }
        h(map, z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.components.MissingDependencyException */
    public void j() throws MissingDependencyException {
        HashMap map = (HashMap) this.b;
        HashMap map2 = (HashMap) this.c;
        for (vzh vzhVar : ((HashMap) this.a).keySet()) {
            for (wct wctVar : vzhVar.c) {
                boolean z = wctVar.b == 2;
                lzy0 lzy0Var = wctVar.a;
                if (z && !map2.containsKey(lzy0Var)) {
                    Set set = Collections.EMPTY_SET;
                    kub0 kub0Var = new kub0();
                    kub0Var.b = null;
                    kub0Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    kub0Var.a.addAll(set);
                    map2.put(lzy0Var, kub0Var);
                } else if (map.containsKey(lzy0Var)) {
                    continue;
                } else {
                    byte b = wctVar.b;
                    if (b == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + vzhVar + ": " + lzy0Var);
                    }
                    if (b != 2) {
                        map.put(lzy0Var, new aqq0(aqq0.c, aqq0.d));
                    }
                }
            }
        }
    }

    public ArrayList k(ArrayList arrayList) {
        HashMap map = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vzh vzhVar = (vzh) it.next();
            if (!vzhVar.e) {
                lly0 lly0Var = (lly0) ((HashMap) this.a).get(vzhVar);
                for (lzy0 lzy0Var : vzhVar.b) {
                    if (map.containsKey(lzy0Var)) {
                        arrayList2.add(new e0i((aqq0) ((lly0) map.get(lzy0Var)), lly0Var, (byte) 1));
                    } else {
                        map.put(lzy0Var, lly0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList l() {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            vzh vzhVar = (vzh) entry.getKey();
            if (vzhVar.e) {
                lly0 lly0Var = (lly0) entry.getValue();
                for (lzy0 lzy0Var : vzhVar.b) {
                    if (!map2.containsKey(lzy0Var)) {
                        map2.put(lzy0Var, new HashSet());
                    }
                    ((Set) map2.get(lzy0Var)).add(lly0Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                kub0 kub0Var = (kub0) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new e0i(kub0Var, (lly0) it.next(), (byte) 2));
                }
            } else {
                lzy0 lzy0Var2 = (lzy0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                kub0 kub0Var2 = new kub0();
                kub0Var2.b = null;
                kub0Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                kub0Var2.a.addAll(set);
                map.put(lzy0Var2, kub0Var2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0027  */
    public tv80 m(int i, jj8 jj8Var) {
        w7h1 w7h1VarA;
        tv80 tv80VarJ;
        w7h1 w7h1VarA2;
        i8h1 i8h1Var = (i8h1) this.b;
        ohv0 ohv0Var = (ohv0) this.a;
        gp41 gp41Var = (gp41) this.e;
        ohv0Var.a(new mhv0(gp41Var.a, ktd.a(i), ew80.c, hrt.b(20)));
        if (gp41Var == gp41.b) {
            int iC = l1d.C(i);
            if (iC != 10) {
                w7h1VarA = iC != 11 ? null : t0c.n().e().a(r5x0.g());
            } else {
                w7h1VarA = t0c.n().h().a(r5x0.k());
            }
            if (w7h1VarA != null) {
                tv80VarJ = i8h1Var.j(w7h1VarA);
            } else {
                tv80VarJ = null;
            }
        } else {
            tv80VarJ = null;
        }
        if (tv80VarJ != null) {
            return tv80VarJ;
        }
        gp41 gp41Var2 = gp41.i;
        gp41 gp41Var3 = gp41.t;
        if (gp41Var == gp41Var2 || gp41Var == gp41Var3) {
            switch (jj8Var.ordinal()) {
                case 0:
                    w7h1VarA2 = fap1.l().t().a(r5x0.j());
                    break;
                case 1:
                    w7h1VarA2 = fap1.l().i().a(r5x0.e());
                    break;
                case 2:
                    w7h1VarA2 = fap1.l().j().a(r5x0.f());
                    break;
                case 3:
                    w7h1VarA2 = fap1.l().p().a(r5x0.h());
                    break;
                case 4:
                    w7h1VarA2 = fap1.l().s().a(r5x0.i());
                    break;
                case 5:
                    w7h1VarA2 = fap1.l().h().a(r5x0.c());
                    break;
                case 6:
                    w7h1VarA2 = fap1.l().e().a(gp41Var == gp41Var3 ? r5x0.g() : r5x0.k());
                    break;
                default:
                    w7h1VarA2 = null;
                    break;
            }
            if (w7h1VarA2 != null) {
                return i8h1Var.j(w7h1VarA2);
            }
        }
        return null;
    }

    public ArrayList n(ArrayList arrayList, iu30 iu30Var) {
        k1i k1iVar;
        vjt vjtVar;
        mjt yitVar;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jj8 jj8Var = (jj8) it.next();
            fu fuVar = (iu30) iu30Var.invoke(jj8Var);
            if (fuVar == null) {
                g1f0 g1f0Var = (g1f0) this.f;
                int iOrdinal = jj8Var.ordinal();
                if (iOrdinal != 0) {
                    Object obj = null;
                    if (iOrdinal == 1) {
                        k1iVar = this;
                        fuVar = new qf8(k1iVar, 13, jj8Var, new pf8(k1iVar, (byte) 0), new ifl1(obj, (byte) 25), (byte) 0);
                    } else if (iOrdinal == 2) {
                        k1iVar = this;
                        fuVar = new qf8(k1iVar, 14, jj8Var, new pf8(k1iVar, (byte) 1), (Object) null, (byte) 0);
                    } else if (iOrdinal == 3) {
                        k1iVar = this;
                        int iOrdinal2 = ((gp41) k1iVar.e).ordinal();
                        if (iOrdinal2 == 21) {
                            vjtVar = vjt.a;
                        } else {
                            if (iOrdinal2 != 22) {
                                eg.m("Naver flow started from unexpected screen");
                                return null;
                            }
                            vjtVar = vjt.b;
                        }
                        fuVar = new fu(k1iVar, 15, jj8Var, new wjt(vjtVar), (byte) 3);
                    } else if (iOrdinal == 4) {
                        k1iVar = this;
                        fuVar = new fu(k1iVar, 44, jj8Var, new gjt(fjt.b, (String) null), (byte) 3);
                    } else if (iOrdinal == 5) {
                        k1iVar = this;
                        if (g1f0Var.A()) {
                            yitVar = mjt.a;
                        } else {
                            yitVar = (g1f0Var.b() && ((Activity) k1iVar.g).getIntent().getBooleanExtra("is_web_login_flow_supported", true)) ? new yit(new d3f0(), bk8.h, (n5o) null, 12) : new tjt((String) null);
                        }
                        fuVar = new fu(k1iVar, 12, jj8Var, yitVar, (byte) 3);
                    } else {
                        if (iOrdinal != 8 && iOrdinal != 9) {
                            eg.m("Unexpected default button");
                            return null;
                        }
                        k1iVar = this;
                        fuVar = new fu(k1iVar, 11, jj8Var, new yit(y2f0.a, bk8.a, (n5o) null, 12), (byte) 3);
                    }
                } else {
                    k1iVar = this;
                    fuVar = new fu(k1iVar, 22, jj8Var, xjt.a, (byte) 3);
                }
            } else {
                k1iVar = this;
            }
            arrayList2.add(new pbc(jj8Var, fuVar));
            this = k1iVar;
        }
        return arrayList2;
    }

    public k1i(ohv0 ohv0Var, i8h1 i8h1Var, kg0 kg0Var, mwn0 mwn0Var, gp41 gp41Var, g1f0 g1f0Var, Activity activity) {
        this.a = ohv0Var;
        this.b = i8h1Var;
        this.c = kg0Var;
        this.d = mwn0Var;
        this.e = gp41Var;
        this.f = g1f0Var;
        this.g = activity;
    }

    public k1i(Context context, btk btkVar, dwl1 dwl1Var, lsw0 lsw0Var, WorkDatabase workDatabase, vwl1 vwl1Var, ArrayList arrayList) {
        this.a = btkVar;
        this.b = dwl1Var;
        this.c = lsw0Var;
        this.d = workDatabase;
        this.e = vwl1Var;
        this.f = arrayList;
        this.g = context.getApplicationContext();
        new f1z0();
    }
}
