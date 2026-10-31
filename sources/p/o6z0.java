package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o6z0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z4z0 b;

    public /* synthetic */ o6z0(z4z0 z4z0Var, byte b) {
        this.a = b;
        this.b = z4z0Var;
    }

    public final Object apply(Object obj) {
        List list;
        byte b = this.a;
        z4z0 z4z0Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = z4z0Var.d;
                int iS = zno1.s(q7h.U(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(obj2, Boolean.FALSE);
                }
                return new i7z0(linkedHashMap);
            default:
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList2 = z4z0Var.d;
                int iS2 = zno1.s(q7h.U(arrayList2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                for (Object obj3 : arrayList2) {
                    hll hllVar = uv00Var.a(hll.class, (String) obj3).b;
                    linkedHashMap2.put(obj3, Boolean.valueOf((hllVar == null || (list = hllVar.d) == null) ? false : list.contains(fll.c)));
                }
                return new i7z0(linkedHashMap2);
        }
    }
}
