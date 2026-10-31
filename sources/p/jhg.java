package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jhg extends a8d1 implements vu30 {
    public final /* synthetic */ wat a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhg(wat watVar, float f, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, lnm lnmVar) {
        super(2, lnmVar);
        this.a = watVar;
        this.b = f;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new jhg(this.a, this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        jhg jhgVarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        jhgVarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Offset offset;
        hm5.M(obj);
        float f = phg.c;
        y9e1 y9e1Var = (y9e1) this.c.getValue();
        rih1 rih1Var = rih1.a;
        if (y9e1Var != null && (offset = (Offset) this.d.getValue()) != null) {
            long j = offset.a;
            float fX0 = this.a.X0(0.0f);
            iu30 iu30Var = (iu30) this.e.getValue();
            List list = (List) this.f.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                String str = ((i220) obj2).b.a;
                Object objH = linkedHashMap.get(str);
                if (objH == null) {
                    objH = cfm0.h(str, linkedHashMap);
                }
                ((List) objH).add(obj2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List list2 = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    r7h.W(phg.d(y9e1Var, ((i220) it.next()).a, fX0, this.b), arrayList);
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((n511) it2.next()).n(j));
                }
                linkedHashMap2.put(key, arrayList2);
            }
            iu30Var.invoke(linkedHashMap2);
        }
        return rih1Var;
    }
}
