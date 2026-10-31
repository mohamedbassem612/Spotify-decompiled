package p;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m8b0 {
    public static final Set c = f46.S0(new mnw0[]{knw0.i, knw0.n, lnw0.h, knw0.m});
    public final List a;
    public final nfa0 b;

    public m8b0(List list, nfa0 nfa0Var) {
        this.a = list;
        this.b = nfa0Var;
    }

    public static ega0 e(ega0 ega0Var, h661 h661Var) {
        aha0 aha0VarB;
        BigInteger m231Var;
        aha0 aha0VarC;
        if (u890.j(ega0Var, rga0.INSTANCE)) {
            return ega0Var;
        }
        if (u890.j(h661Var.getKind(), knw0.o) && (ega0Var instanceof aha0)) {
            aha0 aha0Var = (aha0) ega0Var;
            if (!aha0Var.c()) {
                Double dA0 = nhc1.a0(aha0Var.b());
                return (dA0 == null || (aha0VarC = fga0.c(String.valueOf(dA0.doubleValue()))) == null) ? aha0Var : aha0VarC;
            }
        }
        if (o7h.i0(c, h661Var.getKind()) && (ega0Var instanceof aha0)) {
            aha0 aha0Var2 = (aha0) ega0Var;
            Double dA1 = nhc1.a0(aha0Var2.b());
            BigInteger bigInteger = null;
            if (dA1 != null) {
                if (Math.abs(dA1.doubleValue()) > Double.MAX_VALUE) {
                    dA1 = null;
                }
                if (dA1 != null) {
                    try {
                        m231Var = BigDecimal.valueOf(dA1.doubleValue()).toBigIntegerExact();
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    bigInteger = m231Var instanceof m231 ? null : m231Var;
                }
            }
            return (bigInteger == null || (aha0VarB = fga0.b(bigInteger)) == null) ? aha0Var2 : aha0VarB;
        }
        if (u890.j(h661Var.getKind(), uic1.h) && (ega0Var instanceof uga0)) {
            Map map = (Map) ega0Var;
            LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                ega0 ega0VarE = (ega0) entry.getValue();
                int iC = h661Var.c(str);
                if (iC != -3) {
                    ega0VarE = e(ega0VarE, h661Var.g(iC));
                }
                linkedHashMap.put(key, ega0VarE);
            }
            return new uga0(linkedHashMap);
        }
        if (u890.j(h661Var.getKind(), uic1.i) && (ega0Var instanceof pfa0)) {
            Iterable iterable = (Iterable) ega0Var;
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(e((ega0) it.next(), h661Var.g(0)));
            }
            return new pfa0(arrayList);
        }
        if (!u890.j(h661Var.getKind(), vic1.h) || !(ega0Var instanceof uga0)) {
            return ega0Var;
        }
        Map map2 = (Map) ega0Var;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map2.size()));
        for (Map.Entry entry2 : map2.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), e((ega0) entry2.getValue(), h661Var.g(1)));
        }
        return new uga0(linkedHashMap2);
    }

    public final int a() {
        return (int) Double.parseDouble(fga0.m((ega0) this.a.get(0)).b());
    }

    public final int b(int i) {
        return (int) Double.parseDouble(fga0.m((ega0) this.a.get(i)).b());
    }

    public final Object c(Class cls, int i) {
        uga0 uga0VarL = fga0.l((ega0) this.a.get(i));
        if (cls.equals(qlv.class)) {
            ega0 ega0Var = (ega0) uga0VarL.get("request");
            return new qlv(ega0Var != null ? fga0.g(fga0.m(ega0Var)) : null);
        }
        if (cls.equals(rlv.class)) {
            ega0 ega0Var2 = (ega0) uga0VarL.get("response");
            return new rlv(ega0Var2 != null ? fga0.g(fga0.m(ega0Var2)) : null);
        }
        nma0 nma0Var = (nma0) l8b0.a.get(cls);
        if (nma0Var == null) {
            hhg1.n("Unsupported WAMP payload: ".concat(cls.getName()));
            return null;
        }
        nma0 nma0Var2 = nma0Var;
        ega0 ega0VarE = e(uga0VarL, nma0Var.getDescriptor());
        nfa0 nfa0Var = this.b;
        nfa0Var.getClass();
        return hon1.z(nfa0Var, ega0VarE, nma0Var2);
    }

    public final String d(int i) {
        aha0 aha0Var = (ega0) this.a.get(i);
        if (aha0Var instanceof aha0) {
            aha0 aha0Var2 = aha0Var;
            if (aha0Var2.c()) {
                return aha0Var2.b();
            }
        }
        return aha0Var.toString();
    }
}
