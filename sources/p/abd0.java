package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class abd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cbd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ abd0(cbd0 cbd0Var, byte b) {
        super(2);
        this.a = b;
        this.b = cbd0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        cbd0 cbd0Var = this.b;
        switch (b) {
            case 0:
                xad0 xad0Var = (xad0) obj;
                yad0 yad0Var = (yad0) obj2;
                cbd0Var.a.c.m((Object) null, xad0Var);
                Map map = yad0Var.a;
                Set setKeySet = map.keySet();
                LinkedHashMap linkedHashMap = xad0Var.a;
                boolean zJ = u890.j(setKeySet, linkedHashMap.keySet());
                boolean zEquals = map.equals(linkedHashMap);
                Map map2 = yad0Var.b;
                if (!zJ) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (linkedHashMap.keySet().contains((String) entry.getKey())) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    map2 = linkedHashMap2;
                }
                yad0 yad0VarA = yad0.a(yad0Var, linkedHashMap, map2, null, 4);
                return Next.i(yad0VarA, (!zJ || zEquals || yad0VarA.b.isEmpty()) ? w7x.a : Collections.singleton(new hbw(yad0VarA)));
            default:
                xad0 xad0Var2 = (xad0) obj;
                yad0 yad0Var2 = (yad0) obj2;
                cbd0Var.a.c.m((Object) null, xad0Var2);
                LinkedHashMap linkedHashMap3 = xad0Var2.a;
                Map map3 = yad0Var2.b;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry2 : map3.entrySet()) {
                    if (linkedHashMap3.keySet().contains((String) entry2.getKey())) {
                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return First.b(yad0.a(yad0Var2, linkedHashMap3, linkedHashMap4, null, 4));
        }
    }
}
