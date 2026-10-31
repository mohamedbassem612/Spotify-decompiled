package p;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vvh0 extends uvh0 {
    public PackageManager k;

    public vvh0(zvh0 zvh0Var) {
        super(zvh0Var);
    }

    public final jqd0 j(jqd0 jqd0Var, String str) {
        if (jqd0Var == null) {
            return null;
        }
        List<gvh0> list = (List) jqd0Var.d;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        boolean z = jqd0Var.b;
        List list2 = Collections.EMPTY_LIST;
        arrayList.clear();
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        for (gvh0 gvh0Var : list) {
            List list3 = gvh0Var.c;
            if (!list3.isEmpty()) {
                if (this.k == null) {
                    this.k = ((zvh0) ((mv2) this).c).getPackageManager();
                }
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((Set) it.next()).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                if (this.k.checkPermission(str2, str) != 0) {
                                    if ("android.permission.ACCESS_LOCAL_NETWORK".equals(str2)) {
                                        try {
                                            if (this.k.getApplicationInfo(str, 0).targetSdkVersion <= 36) {
                                                int i = zvh0.f;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused) {
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        int i2 = zvh0.f;
                    }
                }
            }
            if (arrayList.contains(gvh0Var)) {
                hhg1.n("route descriptor already added");
                return null;
            }
            arrayList.add(gvh0Var);
        }
        return new jqd0(arrayList, z);
    }
}
