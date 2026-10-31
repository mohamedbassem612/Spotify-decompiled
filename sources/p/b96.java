package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b96 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l96 b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b96(l96 l96Var, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = l96Var;
        this.c = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new ht0(this.b, this.c, (byte) 4);
            default:
                Map map = (Map) obj;
                q120 q120Var = this.b.k;
                Object obj2 = this.c;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    List<n511> list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (n511 n511Var : list) {
                        arrayList.add(new j220(n511Var.a, n511Var.b, n511Var.c, n511Var.d));
                    }
                    linkedHashMap.put(key, arrayList);
                }
                synchronized (q120Var) {
                    q120Var.a.remove(obj2);
                    q120Var.a.put(obj2, linkedHashMap);
                }
                return rih1.a;
        }
    }
}
