package p;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x4u0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Map b;
    public /* synthetic */ Map c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4u0() {
        super(3, (lnm) null);
        this.a = (byte) 0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                x4u0 x4u0Var = new x4u0(i, lnmVar, (byte) 0);
                x4u0Var.b = map;
                x4u0Var.c = map2;
                return x4u0Var.invokeSuspend(rih1Var);
            default:
                x4u0 x4u0Var2 = new x4u0(i, lnmVar, (byte) 1);
                x4u0Var2.b = map;
                x4u0Var2.c = map2;
                return x4u0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        switch (this.a) {
            case 0:
                Map map = this.b;
                Map map2 = this.c;
                hm5.M(obj);
                return new u4u0(map, map2);
            default:
                Map map3 = this.b;
                Map map4 = this.c;
                hm5.M(obj);
                Set setKeySet = map3.keySet();
                int iS = zno1.s(q7h.U(setKeySet, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : setKeySet) {
                    String str = (String) obj2;
                    if (u890.j(map4.get(str), Boolean.TRUE)) {
                        zBooleanValue = true;
                    } else {
                        Boolean bool = (Boolean) map3.get(str);
                        zBooleanValue = bool != null ? bool.booleanValue() : false;
                    }
                    linkedHashMap.put(obj2, Boolean.valueOf(zBooleanValue));
                }
                return new fio(linkedHashMap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4u0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
