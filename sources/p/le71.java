package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class le71 {
    public final uu00 a;
    public final q8n b;

    public /* synthetic */ le71(uu00 uu00Var, q8n q8nVar) {
        this.a = uu00Var;
        this.b = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(ArrayList arrayList, onm onmVar) {
        je71 je71Var;
        if (onmVar instanceof je71) {
            je71Var = (je71) onmVar;
            int i = je71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                je71Var.c = i - Integer.MIN_VALUE;
            } else {
                je71Var = new je71(this, onmVar);
            }
        } else {
            je71Var = new je71(this, onmVar);
        }
        Object objY = je71Var.a;
        int i2 = je71Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                String str = (String) obj;
                Set set = s4b1.f;
                uic.x(str);
                String str2 = w6b1.k.split(str, 0)[0];
                Object objH = linkedHashMap.get(str2);
                if (objH == null) {
                    objH = cfm0.h(str2, linkedHashMap);
                }
                ((List) objH).add(obj);
            }
            p651 p651Var = new p651(this, new oi("share-format-restrictions", false, new nec0(o7h.l1(linkedHashMap.keySet()), (byte) 21)), arrayList, linkedHashMap, null, (byte) 11);
            je71Var.c = 1;
            objY = fn31.Y(this.b, p651Var, je71Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return objY;
    }
}
