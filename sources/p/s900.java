package p;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s900 {
    public final List a;

    public s900(Context context, cu71 cu71Var, zq4 zq4Var, xk4 xk4Var, fo80 fo80Var, kg60 kg60Var, List list, kc00 kc00Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("context_monotonic_clock", new eo80(new ubc((byte) 16), new mgc(cu71Var, new rok0(cu71Var, new q59(context, zq4Var, (byte) 17), (byte) 15))));
        linkedHashMap.put("context_device_android", new iqt(context, xk4Var, kg60Var));
        linkedHashMap.put("context_sdk", new dv41(kc00Var));
        linkedHashMap.put("context_application_android", new wz5(context, zq4Var));
        linkedHashMap.put("context_installation_id", new eo80(fo80Var));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r900 r900Var = (r900) it.next();
            linkedHashMap.put(r900Var.a(), r900Var);
        }
        this.a = o7h.l1(linkedHashMap.values());
    }
}
