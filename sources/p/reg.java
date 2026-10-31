package p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class reg {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public reg(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            k8c0 k8c0Var = (k8c0) entry.getValue();
            List arrayList = (List) this.a.get(k8c0Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(k8c0Var, arrayList);
            }
            arrayList.add((seg) entry.getKey());
        }
    }

    public static void a(List list, iac0 iac0Var, k8c0 k8c0Var, hac0 hac0Var) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                seg segVar = (seg) list.get(size);
                Method method = segVar.b;
                try {
                    int i = segVar.a;
                    if (i == 0) {
                        method.invoke(hac0Var, null);
                    } else if (i == 1) {
                        method.invoke(hac0Var, iac0Var);
                    } else if (i == 2) {
                        method.invoke(hac0Var, iac0Var, k8c0Var);
                    }
                } catch (IllegalAccessException e) {
                    eg.j(e);
                    return;
                } catch (InvocationTargetException e2) {
                    bhn0.o("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
