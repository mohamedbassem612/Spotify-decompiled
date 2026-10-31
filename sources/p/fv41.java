package p;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fv41 extends f9 {
    public final tka0 a;
    public final List b;
    public final znb0 c;
    public final Map d;
    public final LinkedHashMap e;

    public fv41(String str, tka0 tka0Var, tka0[] tka0VarArr, nma0[] nma0VarArr, Annotation[] annotationArr) {
        this.a = tka0Var;
        this.b = z6x.a;
        this.c = dm5.S(2, new qga0(str, this, (byte) 12));
        if (tka0VarArr.length != nma0VarArr.length) {
            mna0.e("All subclasses of sealed class ", tka0Var.r(), " should be marked @Serializable");
            throw null;
        }
        Map mapT = sqg0.T(f46.W0(tka0VarArr, nma0VarArr));
        this.d = mapT;
        rpv0 rpv0Var = new rpv0(mapT.entrySet(), (byte) 26);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itF = rpv0Var.f();
        while (itF.hasNext()) {
            Object next = itF.next();
            Object objA = rpv0Var.a(next);
            Object obj = linkedHashMap.get(objA);
            if (obj == null) {
                linkedHashMap.containsKey(objA);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str2 = (String) objA;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.a);
                sb.append("' have the same serial name '");
                sb.append(str2);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(objA, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (nma0) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.b = f46.H(annotationArr);
    }

    @Override // p.f9
    public final nma0 a(x1k x1kVar, String str) {
        nma0 nma0Var = (nma0) this.e.get(str);
        return nma0Var != null ? nma0Var : super.a(x1kVar, str);
    }

    @Override // p.f9
    public final nma0 b(uax uaxVar, Object obj) {
        nma0 nma0Var = (nma0) this.d.get(rc11.a.b(obj.getClass()));
        nma0 nma0VarB = nma0Var != null ? nma0Var : super.b(uaxVar, obj);
        if (nma0VarB != null) {
            return nma0VarB;
        }
        return null;
    }

    @Override // p.f9
    public final tka0 c() {
        return this.a;
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return (h661) this.c.getValue();
    }
}
