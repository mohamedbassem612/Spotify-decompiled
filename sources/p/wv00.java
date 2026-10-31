package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.mdata.esperanto.proto.ObserveResponse;
import com.spotify.mdata.esperanto.proto.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wv00 extends uv00 {
    public final ObserveResponse a;
    public final pv00 b;
    public final LinkedHashMap c;
    public final ConcurrentHashMap d;
    public final LinkedHashMap e;
    public final boolean f;

    public wv00(ObserveResponse observeResponse, pv00 pv00Var) {
        this.a = observeResponse;
        this.b = pv00Var;
        h290<ObserveResponse.ExtensionResult> h290VarO = observeResponse.o();
        int iS = zno1.s(q7h.U(h290VarO, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (ObserveResponse.ExtensionResult extensionResult : h290VarO) {
            linkedHashMap.put(new vv00(extensionResult.getEntityUri(), extensionResult.getExtensionKind().getNumber()), extensionResult);
        }
        this.c = linkedHashMap;
        this.d = new ConcurrentHashMap();
        h290 h290VarO2 = this.a.o();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : h290VarO2) {
            Integer numValueOf = Integer.valueOf(((ObserveResponse.ExtensionResult) obj).getExtensionKind().getNumber());
            Object arrayList = linkedHashMap2.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(zno1.s(linkedHashMap2.size()));
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            Object key = entry.getKey();
            Iterable<ObserveResponse.ExtensionResult> iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
            for (ObserveResponse.ExtensionResult extensionResult2 : iterable) {
                arrayList2.add(new vv00(extensionResult2.getEntityUri(), extensionResult2.getExtensionKind().getNumber()));
            }
            linkedHashMap3.put(key, arrayList2);
        }
        this.e = linkedHashMap3;
        this.f = this.a.p();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001f A[PHI: r3
      0x001f: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:5:0x0012, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    public static sv00 e(ObserveResponse.Details details) {
        boolean zQ = details.q();
        int iOrdinal = details.o().ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            int i2 = 2;
            if (iOrdinal == 1) {
                i = i2;
            } else if (iOrdinal != 2) {
                i2 = 4;
                if (iOrdinal == 3) {
                    i = i2;
                } else if (iOrdinal == 4) {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        return new sv00(i, zQ);
    }

    @Override // p.uv00
    public final tv00 a(Class cls, String str) {
        return d(str, this.b.a(cls));
    }

    @Override // p.uv00
    public final List b(Class cls) {
        ov00 ov00VarA = this.b.a(cls);
        if (ov00VarA != null) {
            List list = (List) this.e.get(Integer.valueOf(ov00VarA.b()));
            if (list != null) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(d(((vv00) it.next()).a, ov00VarA));
                }
                return arrayList;
            }
        }
        return z6x.a;
    }

    @Override // p.uv00
    public final boolean c() {
        h290 h290VarO = this.a.o();
        if (h290VarO.isEmpty()) {
            return true;
        }
        Iterator<E> it = h290VarO.iterator();
        while (it.hasNext()) {
            if (!((ObserveResponse.ExtensionResult) it.next()).o().q()) {
                return false;
            }
        }
        return true;
    }

    public final tv00 d(String str, ov00 ov00Var) {
        tv00 tv00Var;
        if (ov00Var == null) {
            return new tv00(str, null, new sv00(1, false));
        }
        vv00 vv00Var = new vv00(str, ov00Var.b());
        ConcurrentHashMap concurrentHashMap = this.d;
        tv00 tv00Var2 = (tv00) concurrentHashMap.get(vv00Var);
        if (tv00Var2 != null) {
            return tv00Var2;
        }
        ObserveResponse.ExtensionResult extensionResult = (ObserveResponse.ExtensionResult) this.c.get(vv00Var);
        if (extensionResult == null) {
            return new tv00(str, null, new sv00(1, false));
        }
        Class clsType = ov00Var.type();
        if (extensionResult.o().o() != e.c) {
            tv00Var = new tv00(extensionResult.getEntityUri(), null, e(extensionResult.o()));
        } else {
            try {
                tv00Var = new tv00(extensionResult.getEntityUri(), ov00Var.a(extensionResult.p().q().t()), e(extensionResult.o()));
            } catch (InvalidProtocolBufferException e) {
                n57.g(cy30.p("Failed parsing Extension: ExtensionType=\"", clsType.getName(), "\" URI=\"", extensionResult.getEntityUri(), "\""), e);
                tv00Var = new tv00(extensionResult.getEntityUri(), null, new sv00(1, false));
            }
        }
        concurrentHashMap.put(vv00Var, tv00Var);
        return tv00Var;
    }
}
