package p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uih0 implements oih0 {
    public final oyr a;
    public final oih0 b;

    public uih0(oyr oyrVar, oih0 oih0Var) {
        this.a = oyrVar;
        this.b = oih0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(nih0 nih0Var, onm onmVar) {
        tih0 tih0Var;
        UbiSpecificationId ubiSpecificationId;
        UbiSpecificationId ubiSpecificationId2;
        oyr oyrVar = this.a;
        Map map = oyrVar.b;
        if (onmVar instanceof tih0) {
            tih0Var = (tih0) onmVar;
            int i = tih0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tih0Var.d = i - Integer.MIN_VALUE;
            } else {
                tih0Var = new tih0(this, onmVar);
            }
        } else {
            tih0Var = new tih0(this, onmVar);
        }
        Object obj = tih0Var.b;
        int i2 = tih0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            String str = nih0Var.a;
            if (str == null) {
                str = nih0Var.b;
            }
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    ubiSpecificationId = UbiSpecificationId.UNKNOWN;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                UbiSpecificationId ubiSpecificationId3 = (UbiSpecificationId) entry.getKey();
                ((r64) entry.getValue()).getClass();
                if (jo31.o(str)) {
                    ubiSpecificationId = ubiSpecificationId3;
                    break;
                }
            }
            oyrVar.c(new r710(ubiSpecificationId, "com.spotify.expanded-search-result", (Integer) null, 12));
            tih0Var.a = ubiSpecificationId;
            tih0Var.d = 1;
            Object objA = this.b.a(nih0Var, tih0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            UbiSpecificationId ubiSpecificationId4 = ubiSpecificationId;
            obj = objA;
            ubiSpecificationId2 = ubiSpecificationId4;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ubiSpecificationId2 = tih0Var.a;
            hm5.M(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            int i3 = 0;
            for (Object obj2 : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                arrayList.add(new q710(((u310) obj2).a, i3, "com.spotify.expanded-search-result"));
                i3 = i4;
            }
            if (map.containsKey(ubiSpecificationId2)) {
                oyrVar.d.put(ubiSpecificationId2, arrayList);
            }
        }
        return list;
    }

    public final Single b(nih0 nih0Var) {
        return rqt0.F(o6x.a, new tfe0((Object) this, (Object) nih0Var, (lnm) null, (byte) 21));
    }
}
