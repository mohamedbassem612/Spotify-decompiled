package p;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dts {
    public final Map a;
    public final Map b;
    public final Object c;

    public dts(Map map, Map map2, Object obj, Bundle bundle) {
        Bundle bundle2;
        this.a = map;
        this.b = map2;
        this.c = obj;
        if (bundle == null || (bundle2 = bundle.getBundle("StateHolderStoreKey")) == null) {
            return;
        }
        Set<String> setKeySet = bundle2.keySet();
        int iS = zno1.s(q7h.U(setKeySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        for (Object obj2 : setKeySet) {
            linkedHashMap.put(obj2, bundle2.getBundle((String) obj2));
        }
        this.b.putAll(sqg0.X(linkedHashMap));
    }

    public final ipb1 a(Object obj, Object obj2, mc41 mc41Var, Function0 function0) {
        Object objC = c(obj);
        cts ctsVar = null;
        Map map = this.a;
        if (mc41Var != null) {
            Map map2 = this.b;
            Bundle bundle = (Bundle) map2.get(objC);
            Object objE = bundle != null ? mc41Var.e(bundle, obj2) : null;
            w0h1.k(map2).remove(objC);
            if (objE != null) {
                Bundle bundle2 = (Bundle) map2.remove(objC + "_ui");
                cts ctsVar2 = new cts(objE, this, obj.toString(), mc41Var);
                ctsVar2.f = bundle2;
                map.put(objC, ctsVar2);
                ctsVar = ctsVar2;
            }
        }
        if (ctsVar != null) {
            return ctsVar;
        }
        ipb1 ipb1Var = (ipb1) map.get(objC);
        if (ipb1Var != null) {
            return ipb1Var;
        }
        ipb1 ipb1Var2 = (ipb1) function0.invoke();
        map.put(objC, ipb1Var2);
        return ipb1Var2;
    }

    public Object c(Object obj) {
        Object obj2 = this.c;
        return obj2 != null ? pze0.i("/", obj2, obj) : obj;
    }

    public dts(Bundle bundle) {
        this(new LinkedHashMap(), new LinkedHashMap(), null, bundle);
    }
}
