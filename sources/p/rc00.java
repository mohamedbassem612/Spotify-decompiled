package p;

import com.spotify.eventsender.internalerrors.proto.EventSenderInternalErrors;
import com.spotify.eventsender.internalerrors.proto.a;
import com.spotify.eventsender.internalerrors.proto.b;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rc00 implements sc00, tc00, dc00 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final Object b = new Object();
    public final LinkedHashMap c;

    public rc00() {
        oc00[] oc00VarArrValues = oc00.values();
        int iS = zno1.s(oc00VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (oc00 oc00Var : oc00VarArrValues) {
            linkedHashMap.put(oc00Var.a, oc00Var);
        }
        this.c = linkedHashMap;
    }

    public static void c(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            oc00 oc00Var = (oc00) entry.getKey();
            qc00 qc00Var = (qc00) entry.getValue();
            Object qc00Var2 = linkedHashMap.get(oc00Var);
            if (qc00Var2 == null) {
                qc00Var2 = new qc00();
                linkedHashMap.put(oc00Var, qc00Var2);
            }
            qc00 qc00Var3 = (qc00) qc00Var2;
            qc00Var3.d(qc00Var.b() + qc00Var3.b());
            qc00Var3.c(qc00Var.a() + qc00Var3.a());
        }
    }

    @Override // p.dc00
    public final void a(FileOutputStream fileOutputStream) {
        LinkedHashMap linkedHashMapE = e(this.a);
        if (linkedHashMapE.isEmpty()) {
            return;
        }
        a aVarP = EventSenderInternalErrors.p();
        for (Map.Entry entry : linkedHashMapE.entrySet()) {
            oc00 oc00Var = (oc00) entry.getKey();
            qc00 qc00Var = (qc00) entry.getValue();
            b bVarQ = EventSenderInternalErrors.Counts.q();
            bVarQ.q(qc00Var.b());
            bVarQ.n(qc00Var.a());
            aVarP.n(oc00Var.a, bVarQ.build());
        }
        aVarP.build().writeTo(fileOutputStream);
    }

    @Override // p.dc00
    public final void b(FileInputStream fileInputStream) {
        EventSenderInternalErrors eventSenderInternalErrorsQ = EventSenderInternalErrors.q(o0c.K(fileInputStream));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : eventSenderInternalErrorsQ.n().entrySet()) {
            String str = (String) entry.getKey();
            EventSenderInternalErrors.Counts counts = (EventSenderInternalErrors.Counts) entry.getValue();
            oc00 oc00Var = (oc00) this.c.get(str);
            if (oc00Var != null) {
                linkedHashMap.put(oc00Var, new qc00(counts.p(), counts.o()));
            }
        }
        synchronized (this.b) {
            c(this.a, linkedHashMap);
        }
    }

    public final void d(oc00 oc00Var) {
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = this.a;
                Object qc00Var = linkedHashMap.get(oc00Var);
                if (qc00Var == null) {
                    qc00Var = new qc00();
                    linkedHashMap.put(oc00Var, qc00Var);
                }
                qc00 qc00Var2 = (qc00) qc00Var;
                qc00Var2.d(qc00Var2.b() + 1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LinkedHashMap e(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2;
        synchronized (this.b) {
            linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public final void f(Map map) {
        synchronized (this.b) {
            for (Map.Entry entry : map.entrySet()) {
                oc00 oc00Var = (oc00) entry.getKey();
                long jLongValue = ((Number) entry.getValue()).longValue();
                qc00 qc00Var = (qc00) this.a.get(oc00Var);
                if (qc00Var != null) {
                    qc00Var.c(jLongValue);
                }
            }
        }
    }

    @Override // p.dc00
    public final String getFileName() {
        return "ESInternalErrors";
    }
}
