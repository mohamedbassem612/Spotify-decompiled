package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.eventsender.Fragment;
import com.spotify.messages.EventSenderInternalError2NonAuth;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v390 implements zga {
    public static final hhc f = phc.i("EventSenderInternalError2NonAuth");
    public final tc00 a;
    public final t561 b;
    public final ac00 c;
    public final s900 d;
    public final zq4 e;

    public v390(rc00 rc00Var, t561 t561Var, ac00 ac00Var, s900 s900Var, zq4 zq4Var) {
        this.a = rc00Var;
        this.b = t561Var;
        this.c = ac00Var;
        this.d = s900Var;
        this.e = zq4Var;
    }

    @Override // p.zga
    public final void a(Collection collection) {
        Object next;
        if (collection.isEmpty()) {
            return;
        }
        int size = collection.size();
        zq4 zq4Var = this.e;
        if (size > 1) {
            zq4Var.e("Error while setting ESIENA2 datasource as successful.", new IllegalStateException(gvg.e(collection.size(), "Expected only one ESIENA2 event but got ", " events.")));
            return;
        }
        n700 n700Var = (n700) o7h.p0(collection);
        if (u890.j(n700Var.b, "EventSenderInternalError2NonAuth")) {
            Iterator it = n700Var.e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((mmr0) next).a, "message"));
            mmr0 mmr0Var = (mmr0) next;
            if (mmr0Var == null) {
                return;
            }
            try {
                EventSenderInternalError2NonAuth eventSenderInternalError2NonAuthV = EventSenderInternalError2NonAuth.v((phc) mmr0Var.b);
                if (eventSenderInternalError2NonAuthV.s() != eventSenderInternalError2NonAuthV.q()) {
                    zq4Var.e("Error while updating ESIENA2 reported count.", new IllegalStateException("Expected same list size, but got " + eventSenderInternalError2NonAuthV.s() + " error types and " + eventSenderInternalError2NonAuthV.q() + " total counts."));
                    return;
                }
                tr80 tr80VarQ = yoi1.Q(0, eventSenderInternalError2NonAuthV.s());
                ArrayList arrayList = new ArrayList();
                lr80 it2 = tr80VarQ.iterator();
                while (((sr80) it2).c) {
                    int iNextInt = it2.nextInt();
                    String str = (String) eventSenderInternalError2NonAuthV.t().get(iNextInt);
                    str.getClass();
                    oc00 oc00VarL = i3o1.l(str);
                    mmr0 mmr0VarN = oc00VarL != null ? oqn1.n(oc00VarL, Long.valueOf(((Number) eventSenderInternalError2NonAuthV.r().get(iNextInt)).intValue())) : null;
                    if (mmr0VarN != null) {
                        arrayList.add(mmr0VarN);
                    }
                }
                ((rc00) this.a).f(sqg0.T(arrayList));
            } catch (InvalidProtocolBufferException e) {
                zq4Var.e("Couldn't parse ESIENA2.", e);
            }
        }
    }

    @Override // p.zga
    public final n561 b(String str) {
        rc00 rc00Var = (rc00) this.a;
        LinkedHashMap linkedHashMap = rc00Var.a;
        LinkedHashMap linkedHashMapE = rc00Var.e(linkedHashMap);
        if (!linkedHashMapE.isEmpty()) {
            Iterator it = linkedHashMapE.entrySet().iterator();
            while (it.hasNext()) {
                qc00 qc00Var = (qc00) ((Map.Entry) it.next()).getValue();
                if (qc00Var.b() > 0 && qc00Var.b() > qc00Var.a()) {
                    LinkedHashMap linkedHashMapE2 = rc00Var.e(linkedHashMap);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMapE2.entrySet()) {
                        if (((qc00) entry.getValue()).b() > 0) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    ArrayList<pc00> arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        oc00 oc00Var = (oc00) entry2.getKey();
                        qc00 qc00Var2 = (qc00) entry2.getValue();
                        arrayList.add(new pc00(oc00Var, qc00Var2.b(), qc00Var2.b() - qc00Var2.a()));
                    }
                    if (arrayList.isEmpty()) {
                        break;
                    }
                    hhc hhcVar = f;
                    long jA = this.b.a(2, "EventSenderInternalError2NonAuth", hhcVar.t());
                    nc00 nc00VarU = EventSenderInternalError2NonAuth.u();
                    for (pc00 pc00Var : arrayList) {
                        nc00VarU.q(pc00Var.a().a);
                        nc00VarU.n((int) pc00Var.b());
                        nc00VarU.r((int) pc00Var.c());
                    }
                    byte[] byteArray = nc00VarU.build().toByteArray();
                    this.c.getClass();
                    h290<Fragment> h290VarQ = q1o1.e(byteArray, ac00.a(), this.d).q();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarQ, 10));
                    for (Fragment fragment : h290VarQ) {
                        arrayList2.add(oqn1.n(fragment.getName(), fragment.getData()));
                    }
                    return z561.h0(new n700(-1L, "EventSenderInternalError2NonAuth", hhcVar, jA, arrayList2, true));
                }
            }
        }
        return v7x.a;
    }
}
