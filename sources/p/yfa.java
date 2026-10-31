package p;

import com.spotify.eventsender.eventsender.MissingTransportException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yfa implements Runnable {
    public final jc00 X;
    public final zq4 a;
    public final sc00 b;
    public final brg c;
    public final qav d;
    public final List e;
    public final zq4 f;
    public final sc00 g;
    public final kc00 h;
    public final kb00 i;
    public final jc00 t;

    public yfa(List list, brg brgVar, zq4 zq4Var, rav ravVar, rc00 rc00Var, kc00 kc00Var, kb00 kb00Var, jc00 jc00Var, jc00 jc00Var2) {
        this.a = zq4Var;
        this.b = rc00Var;
        this.c = brgVar;
        this.d = ravVar;
        this.e = list;
        this.f = zq4Var;
        this.g = rc00Var;
        this.h = kc00Var;
        this.i = kb00Var;
        this.t = jc00Var;
        this.X = jc00Var2;
    }

    public final Collection a(List list, Set set, qd00 qd00Var) {
        return z561.k0(new sgg1(new t6(list, this, qd00Var, (byte) 0), z561.T(new s6(list, (byte) 0), new i46(set, (byte) 1))));
    }

    public final synchronized void b() {
        xfo1 dj00Var;
        oc00 oc00Var;
        try {
            adn0 adn0Var = (adn0) ((den0) this.h.b).get();
            String strA = this.i.a();
            boolean z = strA != null;
            jc00 jc00Var = z ? this.t : this.X;
            r561 it = new i46(new wfa(z561.X(new xfa(strA, (byte) 0), new i46(this.e, (byte) 1)), this, adn0Var.k, adn0Var.j, null), (byte) 3).iterator();
            while (true) {
                r561 r561Var = it;
                if (!r561Var.hasNext()) {
                    return;
                }
                List list = (List) r561Var.next();
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add((n700) ((mmr0) it2.next()).b);
                }
                String strA2 = this.i.a();
                if (z && !u890.j(strA, strA2)) {
                    return;
                }
                try {
                    dj00Var = jc00Var.a(arrayList);
                } catch (MissingTransportException unused) {
                    dj00Var = new dj00("No HTTP transport available to publish events.", 1);
                }
                if (dj00Var instanceof dj00) {
                    this.f.a();
                    sc00 sc00Var = this.g;
                    int iC = l1d.C(((dj00) dj00Var).c);
                    if (iC == 0) {
                        oc00Var = oc00.EVENTS_SYNC_MISSING_TRANSPORT;
                    } else {
                        if (iC != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oc00Var = oc00.EVENTS_SYNC_REQUEST_FAILED;
                    }
                    ((rc00) sc00Var).d(oc00Var);
                    return;
                }
                if (!(dj00Var instanceof ej00)) {
                    throw new NoWhenBranchMatchedException();
                }
                ej00 ej00Var = (ej00) dj00Var;
                ArrayList arrayListN0 = o7h.N0(a(list, ej00Var.c, qd00.REJECTED_BACKEND), a(list, ej00Var.b, qd00.DELIVERED));
                zq4 zq4Var = this.f;
                arrayListN0.size();
                o7h.y0(arrayListN0, (CharSequence) null, (String) null, (String) null, xj.t, 31);
                zq4Var.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayListN0) {
                    zga zgaVar = (zga) ((mmr0) obj).a;
                    Object arrayList2 = linkedHashMap.get(zgaVar);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(zgaVar, arrayList2);
                    }
                    ((List) arrayList2).add((n700) ((mmr0) obj).b);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ((zga) entry.getKey()).a((List) entry.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zq4 zq4Var = this.a;
        try {
            this.c.a();
            b();
            zq4Var.a();
        } catch (Throwable th) {
            ((rc00) this.b).d(oc00.EVENTS_SYNC_EXC_THROWN);
            zq4Var.e("Events sync failed with exception", th);
        }
    }
}
