package p;

import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yba1 {
    public static final long e;
    public final LinkedHashMap a;
    public final q8n b;
    public final bpb1 c;
    public final xe01 d;

    static {
        ytw0 ytw0Var = jfv.b;
        e = fdg1.k0(30, ngv.e);
    }

    public yba1(LinkedHashMap linkedHashMap, q8n q8nVar) {
        this.a = linkedHashMap;
        this.b = q8nVar;
        Set setKeySet = linkedHashMap.keySet();
        int iS = zno1.s(q7h.U(setKeySet, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj : setKeySet) {
            String str = ((aea1) obj).a;
            linkedHashMap2.put(obj, xda1.a);
        }
        bpb1 bpb1VarB = gio1.b(linkedHashMap2);
        this.c = bpb1VarB;
        this.d = d5p1.h(bpb1VarB);
    }
}
