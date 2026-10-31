package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t45 {
    public final String a;
    public final pjm0 b;
    public final hwb c;
    public final boolean d;
    public final UUID e;
    public final ConcurrentHashMap f;
    public final ConcurrentHashMap g;
    public volatile String h;
    public Long i;
    public final AtomicBoolean j;
    public final ConcurrentLinkedQueue k;
    public final ConcurrentLinkedQueue l;
    public final ConcurrentLinkedQueue m;
    public final kj41 n;
    public final nif1 o;

    public t45(String str, pjm0 pjm0Var) {
        hwb hwbVar = new hwb((byte) 27);
        hhp0 hhp0Var = hhp0.a;
        this.a = str;
        this.b = pjm0Var;
        this.c = hwbVar;
        this.d = true;
        this.e = UUID.randomUUID();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.j = new AtomicBoolean(true);
        this.k = new ConcurrentLinkedQueue();
        this.l = new ConcurrentLinkedQueue();
        this.m = new ConcurrentLinkedQueue();
        if (ihc1.y0(str)) {
            hhg1.n("Category must not be empty");
            throw null;
        }
        String str2 = (String) u45.a.get(str);
        str = str2 != null ? str2 : str;
        if (hhp0Var.o(str)) {
            this.n = hhp0Var.u(str);
            this.o = ihp0.l(hhp0Var, str, Integer.valueOf(hashCode()), 4);
        }
    }

    public static void c(t45 t45Var, String str, long j, long j2, int i) {
        String str2 = (i & 8) != 0 ? null : "assisted-curation";
        boolean z = (i & 16) == 0;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j2);
        if (z || t45Var.i == null) {
            t45Var.i = lValueOf;
        }
        t45Var.m.add(new nod(str, str2, lValueOf, lValueOf2));
    }

    public static void d(t45 t45Var, String str, Long l, Long l2, int i) {
        if ((i & 8) != 0) {
            l2 = null;
        }
        if (t45Var.i == null) {
            t45Var.i = l;
        }
        t45Var.m.add(new nod(str, null, l, l2));
    }

    public static ArrayList f(ConcurrentLinkedQueue concurrentLinkedQueue, ConcurrentLinkedQueue concurrentLinkedQueue2, ConcurrentLinkedQueue concurrentLinkedQueue3) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            pod podVar = (pod) it.next();
            Iterator it2 = concurrentLinkedQueue2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((ood) next).a, podVar.a));
            ood oodVar = (ood) next;
            if (oodVar != null) {
                long j = oodVar.b;
                long j2 = podVar.c;
                arrayList.add(new di40(podVar.a, podVar.b, Long.valueOf(j2), Long.valueOf(j - j2)));
            }
        }
        Iterator it3 = concurrentLinkedQueue3.iterator();
        while (it3.hasNext()) {
            nod nodVar = (nod) it3.next();
            arrayList.add(new di40(nodVar.a, nodVar.b, nodVar.c, nodVar.d));
        }
        return arrayList;
    }

    public static Object i(t45 t45Var, String str, Function0 function0) {
        t45Var.l(str, null, false);
        Object objInvoke = function0.invoke();
        t45Var.g(str);
        return objInvoke;
    }

    public static Set j(long j, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            di40 di40Var = (di40) it.next();
            Long l = (Long) di40Var.c;
            arrayList2.add(new di40(di40Var.a, di40Var.b, l != null ? Long.valueOf(l.longValue() - j) : null, di40Var.d));
        }
        return o7h.p1(arrayList2);
    }

    public final void a(String str, String str2) {
        this.g.put(str, str2);
    }

    public final void b(String str, String str2) {
        this.f.put(str, str2);
    }

    public final pne1 e() {
        une1 une1Var;
        nif1 nif1Var;
        Object next;
        if (this.j.getAndSet(false)) {
            hwb hwbVar = this.c;
            sri1 sri1Var = new sri1(this.m, this.k, this.l, this.g);
            hwbVar.getClass();
            dn90 dn90VarD = hwb.D(sri1Var);
            une1Var = dn90VarD != null ? new une1(dn90VarD, k()) : null;
        } else {
            une1Var = new une1(2, b7x.a, k());
        }
        Set setJ = w7x.a;
        if (une1Var == null) {
            ArrayList arrayListF = f(this.k, this.l, this.m);
            Long l = this.i;
            setJ = j(l != null ? l.longValue() : 0L, arrayListF);
        }
        Set set = setJ;
        if (this.d && (nif1Var = this.o) != null) {
            boolean z = une1Var != null;
            kj41 kj41Var = this.n;
            for (Map.Entry entry : this.g.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (kj41Var != null) {
                    kj41Var.setAttribute(str, str2);
                }
                nif1Var.setAttribute(str, str2);
            }
            for (Map.Entry entry2 : this.f.entrySet()) {
                nif1Var.setAttribute((String) entry2.getKey(), (String) entry2.getValue());
            }
            String str3 = z ? "timekeeper_error" : "success";
            if (kj41Var != null) {
                kj41Var.setAttribute("observation_outcome", str3);
            }
            nif1Var.setAttribute("observation_outcome", str3);
            nif1 nif1Var2 = this.o;
            if (nif1Var2 != null) {
                for (pod podVar : this.k) {
                    Iterator it = this.l.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!u890.j(((ood) next).a, podVar.a));
                    ood oodVar = (ood) next;
                    if (oodVar != null) {
                        nif1Var2.d(podVar.c, oodVar.b, podVar.a);
                    } else {
                        nif1Var2.d(podVar.c, 0L, podVar.a);
                    }
                }
                for (nod nodVar : this.m) {
                    Long l2 = nodVar.c;
                    Long l3 = nodVar.d;
                    if (l2 != null && l3 != null) {
                        nif1Var2.d(l2.longValue(), l3.longValue() + l2.longValue(), nodVar.a);
                    }
                }
            }
            nif1 nif1Var3 = this.o;
            if (nif1Var3 != null) {
                nif1Var3.stop();
            }
            kj41 kj41Var2 = this.n;
            if (kj41Var2 != null) {
                Long l4 = this.i;
                if (l4 != null) {
                    kj41Var2.d(l4.longValue());
                }
                kj41Var2.stop();
            }
        }
        return new pne1(this.e, this.a, this.f, this.g, set, this.h, null, une1Var);
    }

    public final void g(String str) {
        this.l.add(new ood(str, this.b.a()));
    }

    public final LinkedHashMap h() {
        ArrayList arrayListF = f(this.k, this.l, this.m);
        int iS = zno1.s(q7h.U(arrayListF, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : arrayListF) {
            linkedHashMap.put(((di40) obj).a, obj);
        }
        return linkedHashMap;
    }

    public final Set k() {
        ArrayList<pod> arrayList = new ArrayList();
        for (Object obj : this.k) {
            pod podVar = (pod) obj;
            ConcurrentLinkedQueue concurrentLinkedQueue = this.l;
            if (concurrentLinkedQueue == null || !concurrentLinkedQueue.isEmpty()) {
                Iterator it = concurrentLinkedQueue.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (!u890.j(((ood) it.next()).a, podVar.a));
            }
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (pod podVar2 : arrayList) {
            arrayList2.add(new di40(podVar2.a, podVar2.b, Long.valueOf(podVar2.c), null));
        }
        Long l = this.i;
        return j(l != null ? l.longValue() : 0L, arrayList2);
    }

    public final void l(String str, String str2, boolean z) {
        long jA = this.b.a();
        if (this.i == null) {
            this.i = Long.valueOf(jA);
        }
        this.k.add(new pod(jA, str, str2, z));
    }
}
