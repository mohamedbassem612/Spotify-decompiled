package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.h;
import com.spotify.eventsender.droppedevents.proto.EventCounters;
import com.spotify.eventsender.droppedevents.proto.a;
import com.spotify.eventsender.droppedevents.proto.b;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rav implements qav, dc00 {
    public final zq4 a;
    public final rc00 b;
    public final nfa0 c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final ArrayList e;

    public rav(zq4 zq4Var, rc00 rc00Var, nfa0 nfa0Var) {
        this.a = zq4Var;
        this.b = rc00Var;
        this.c = nfa0Var;
        this.e = p7h.H(new sd00[]{new pav(nfa0Var), new rd00(nfa0Var)});
    }

    public static void e(LinkedHashMap linkedHashMap, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            td00 td00Var = (td00) entry.getValue();
            Object td00Var2 = linkedHashMap.get(str);
            if (td00Var2 == null) {
                td00Var2 = new td00();
                linkedHashMap.put(str, td00Var2);
            }
            td00 td00Var3 = (td00) td00Var2;
            nav[] navVarArr = td00Var.a;
            int length = navVarArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                nav navVar = navVarArr[i];
                nav[] navVarArr2 = td00Var3.a;
                nav navVar2 = navVarArr2[i2];
                navVar2.a += navVar.a;
                navVar2.b += navVar.b;
                navVarArr2[i2] = navVar2;
                i++;
                i2++;
            }
        }
    }

    public static LinkedHashMap h(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2;
        synchronized ("DroppedEventsPersisterImplLock") {
            linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    @Override // p.dc00
    public final void a(FileOutputStream fileOutputStream) {
        LinkedHashMap linkedHashMapH = h(this.d);
        if (linkedHashMapH.isEmpty()) {
            return;
        }
        a aVarQ = EventCounters.q();
        aVarQ.q();
        for (Map.Entry entry : linkedHashMapH.entrySet()) {
            String str = (String) entry.getKey();
            td00 td00Var = (td00) entry.getValue();
            b bVarQ = EventCounters.Counters.q();
            nav[] navVarArr = td00Var.a;
            ArrayList arrayList = new ArrayList(navVarArr.length);
            for (nav navVar : navVarArr) {
                arrayList.add(Long.valueOf(navVar.a));
            }
            bVarQ.n(arrayList);
            aVarQ.n(str, bVarQ.build());
        }
        aVarQ.build().writeTo(fileOutputStream);
    }

    @Override // p.dc00
    public final void b(FileInputStream fileInputStream) {
        Map linkedHashMap;
        EventCounters eventCountersR;
        byte[] bArrK = o0c.K(fileInputStream);
        zq4 zq4Var = this.a;
        String str = new String(bArrK, nne.a);
        try {
            if (str.length() <= 4 || !((str.charAt(0) == '1' || str.charAt(0) == '2') && str.charAt(1) == '\n' && str.charAt(2) == '\n' && str.charAt(3) == '{' && str.charAt(str.length() - 1) == '}')) {
                try {
                    eventCountersR = EventCounters.r(bArrK);
                    eventCountersR.getClass();
                } catch (InvalidProtocolBufferException e) {
                    zq4Var.b("Error reading EventCounters proto file: %s", new Object[]{e.getMessage()});
                    this.b.d(oc00.COUNTERS_PARSE_FROM_PROTO);
                    h hVarBuild = EventCounters.q().build();
                    hVarBuild.getClass();
                    eventCountersR = (EventCounters) hVarBuild;
                }
                linkedHashMap = g(eventCountersR);
            } else {
                linkedHashMap = f(str);
            }
        } catch (RuntimeException e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            "Cannot parse data: ".concat(message);
            zq4Var.a();
            linkedHashMap = new LinkedHashMap();
        }
        synchronized ("DroppedEventsPersisterImplLock") {
            e(this.d, linkedHashMap);
        }
    }

    public final void d(String str, qd00 qd00Var) {
        synchronized ("DroppedEventsPersisterImplLock") {
            try {
                LinkedHashMap linkedHashMap = this.d;
                Object td00Var = linkedHashMap.get(str);
                if (td00Var == null) {
                    td00Var = new td00();
                    linkedHashMap.put(str, td00Var);
                }
                ((td00) td00Var).a[qd00Var.ordinal()].a++;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map f(String str) {
        List listQ0 = ihc1.Q0(str, new String[]{"\n\n"}, 0, 6);
        if (listQ0.size() != 2) {
            return new LinkedHashMap();
        }
        int i = Integer.parseInt((String) listQ0.get(0));
        if (i != 3) {
            int i2 = i - 1;
            if (i2 >= 0) {
                ArrayList arrayList = this.e;
                if (i2 < arrayList.size()) {
                    return ((sd00) arrayList.get(i2)).a((String) listQ0.get(1));
                }
            }
            eg.m("No EventStatesCounter migration for version 3");
            return null;
        }
        chc1 chc1Var = chc1.a;
        Map map = (Map) this.c.a((String) listQ0.get(1), new nlc0(chc1Var, new nlc0(chc1Var, nav.Companion.serializer())));
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            td00 td00Var = new td00();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                qd00 qd00VarValueOf = qd00.valueOf((String) entry2.getKey());
                nav navVar = (nav) entry2.getValue();
                int iOrdinal = qd00VarValueOf.ordinal();
                nav[] navVarArr = td00Var.a;
                nav navVar2 = navVarArr[iOrdinal];
                navVar2.a += navVar.a;
                navVar2.b += navVar.b;
                navVarArr[iOrdinal] = navVar2;
            }
            linkedHashMap.put(key, td00Var);
        }
        return linkedHashMap;
    }

    public final LinkedHashMap g(EventCounters eventCounters) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iO = eventCounters.o();
        zq4 zq4Var = this.a;
        if (iO != 3) {
            eventCounters.toString();
            zq4Var.a();
            return linkedHashMap;
        }
        for (Map.Entry entry : eventCounters.n().entrySet()) {
            String str = (String) entry.getKey();
            EventCounters.Counters counters = (EventCounters.Counters) entry.getValue();
            td00 td00VarF0 = y3o1.f0(counters.o());
            if (td00VarF0 == null) {
                e290 e290VarO = counters.o();
                ArrayList arrayList = new ArrayList(q7h.U(e290VarO, 10));
                Iterator<E> it = e290VarO.iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf((Long) it.next()));
                }
                arrayList.toString();
                zq4Var.a();
            } else {
                linkedHashMap.put(str, td00VarF0);
            }
        }
        return linkedHashMap;
    }

    @Override // p.dc00
    public final String getFileName() {
        return "ESDrop";
    }

    public final void i(List list) {
        synchronized ("DroppedEventsPersisterImplLock") {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oav oavVar = (oav) it.next();
                td00 td00Var = (td00) this.d.get(oavVar.a);
                if (td00Var != null) {
                    td00Var.a[oavVar.d.ordinal()].b = oavVar.b;
                }
            }
        }
    }
}
