package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ey10 {
    public static final Object b = new Object();
    public static final bma1 c;
    public static final bma1 d;
    public final dma1 a;

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.q("internal_bug_report_delivery_receipts");
        d = nbcVar.q("internal_bug_report_queue_entries");
    }

    public ey10(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public static dy10 b(String str) {
        UUID m231Var;
        UUID uuid;
        List listP0 = ihc1.P0(str, new char[]{'|'}, 6);
        String str2 = (String) o7h.t0(0, listP0);
        if (str2 != null) {
            try {
                m231Var = UUID.fromString(str2);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            uuid = m231Var;
        } else {
            uuid = null;
        }
        String str3 = (String) o7h.t0(1, listP0);
        Long lD0 = str3 != null ? nhc1.d0(10, str3) : null;
        if (uuid == null || lD0 == null) {
            return null;
        }
        long jLongValue = lD0.longValue();
        List listK0 = o7h.k0(listP0, 2);
        ArrayList arrayList = new ArrayList(q7h.U(listK0, 10));
        Iterator it = listK0.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.decode((String) it.next()));
        }
        return new dy10(uuid, jLongValue, o7h.p1(arrayList));
    }

    public final void a(dy10 dy10Var) {
        synchronized (b) {
            try {
                ArrayList arrayListC = c();
                ArrayList arrayList = new ArrayList();
                for (Object obj : arrayListC) {
                    if (!((dy10) obj).a.equals(dy10Var.a)) {
                        arrayList.add(obj);
                    }
                }
                k(o7h.O0(dy10Var, arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (b) {
            try {
                Set setA = this.a.a(d);
                arrayList = new ArrayList();
                Iterator it = setA.iterator();
                while (it.hasNext()) {
                    dy10 dy10VarB = b((String) it.next());
                    if (dy10VarB != null) {
                        arrayList.add(dy10VarB);
                    }
                }
                if (arrayList.size() != setA.size()) {
                    k(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public final void d(String str, Set set) {
        synchronized (b) {
            try {
                Map mapF = f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapF.entrySet()) {
                    UUID uuid = (UUID) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (!set.contains(uuid) || (!u890.j(str2, str) && str2.length() != 0)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                l(linkedHashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set e() {
        Set setKeySet;
        synchronized (b) {
            try {
                Map mapF = f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapF.entrySet()) {
                    if (((String) entry.getValue()).length() == 0) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return setKeySet;
    }

    public final Map f() {
        UUID m231Var;
        UUID uuid;
        Set setA = this.a.a(c);
        ArrayList arrayList = new ArrayList();
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            List listP0 = ihc1.P0((String) it.next(), new char[]{'|'}, 2);
            String str = (String) o7h.s0(listP0);
            mmr0 mmr0Var = null;
            if (str != null) {
                try {
                    m231Var = UUID.fromString(str);
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                uuid = m231Var;
            } else {
                uuid = null;
            }
            String str2 = (String) o7h.t0(1, listP0);
            String strDecode = str2 != null ? Uri.decode(str2) : null;
            if (uuid != null && strDecode != null) {
                mmr0Var = new mmr0(uuid, strDecode);
            }
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return sqg0.T(arrayList);
    }

    public final void g(UUID uuid) {
        h("", uuid);
    }

    public final void h(String str, UUID uuid) {
        synchronized (b) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(f());
            linkedHashMap.put(uuid, str);
            l(linkedHashMap);
        }
    }

    public final dy10 i(UUID uuid) {
        Object next;
        dy10 dy10Var;
        synchronized (b) {
            try {
                ArrayList arrayListC = c();
                Iterator it = arrayListC.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((dy10) next).a.equals(uuid));
                dy10Var = (dy10) next;
                if (dy10Var != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : arrayListC) {
                        if (!((dy10) obj).a.equals(uuid)) {
                            arrayList.add(obj);
                        }
                    }
                    k(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dy10Var;
    }

    public final Set j(String str) {
        Set setKeySet;
        synchronized (b) {
            try {
                Map mapF = f();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapF.entrySet()) {
                    if (u890.j((String) entry.getValue(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                setKeySet = linkedHashMap.keySet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return setKeySet;
    }

    public final void k(ArrayList arrayList) {
        hma1 hma1VarEdit = this.a.edit();
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dy10 dy10Var = (dy10) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(dy10Var.a);
            sb.append('|');
            sb.append(dy10Var.b);
            for (String str : o7h.Z0(dy10Var.c)) {
                sb.append('|');
                sb.append(Uri.encode(str));
            }
            arrayList2.add(sb.toString());
        }
        hma1VarEdit.e(d, o7h.p1(arrayList2));
        hma1VarEdit.h();
    }

    public final void l(LinkedHashMap linkedHashMap) {
        hma1 hma1VarEdit = this.a.edit();
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(((UUID) entry.getKey()) + "|" + Uri.encode((String) entry.getValue()));
        }
        hma1VarEdit.e(c, o7h.p1(arrayList));
        hma1VarEdit.h();
    }
}
