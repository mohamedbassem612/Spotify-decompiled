package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tvh0 extends xvh0 {
    public final y36 i;
    public final Handler j;
    public final Map k;
    public final /* synthetic */ uvh0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvh0(uvh0 uvh0Var, Messenger messenger, int i, String str) {
        super(uvh0Var, messenger, i, str);
        this.l = uvh0Var;
        this.i = new y36(0);
        this.j = new Handler(Looper.getMainLooper());
        if (i < 4) {
            this.k = new y36(0);
        } else {
            this.k = Collections.EMPTY_MAP;
        }
    }

    @Override // p.xvh0
    public final Bundle a(jqd0 jqd0Var) {
        Map map = this.k;
        if (map.isEmpty()) {
            return super.a(jqd0Var);
        }
        ArrayList arrayList = new ArrayList();
        for (gvh0 gvh0Var : (List) jqd0Var.d) {
            if (map.containsKey(gvh0Var.g())) {
                new ArrayList();
                new ArrayList();
                new HashSet();
                new ArrayList();
                Bundle bundle = new Bundle(gvh0Var.a);
                ArrayList arrayListE = gvh0Var.e();
                ArrayList arrayListB = gvh0Var.b();
                HashSet hashSetA = gvh0Var.a();
                List list = gvh0Var.c;
                String str = gvh0Var.b;
                bundle.putBoolean("enabled", false);
                bundle.putParcelableArrayList("controlFilters", new ArrayList<>(arrayListB));
                bundle.putStringArrayList("groupMemberIds", new ArrayList<>(arrayListE));
                bundle.putStringArrayList("allowedPackages", new ArrayList<>(hashSetA));
                arrayList.add(new gvh0(str, bundle, list));
            } else {
                arrayList.add(gvh0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll((List) jqd0Var.d);
        boolean z = jqd0Var.b;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        return super.a(new jqd0(arrayList2, z));
    }

    @Override // p.xvh0
    public final boolean b(String str, String str2, ovh0 ovh0Var, int i) {
        y36 y36Var = this.i;
        nvh0 nvh0Var = (nvh0) y36Var.get(str);
        SparseArray sparseArray = this.f;
        if (nvh0Var != null) {
            sparseArray.put(i, nvh0Var);
            return true;
        }
        boolean zB = super.b(str, str2, ovh0Var, i);
        if (zB) {
            y36Var.put(str, (nvh0) sparseArray.get(i));
        }
        return zB;
    }

    @Override // p.xvh0
    public final void c() {
        this.i.clear();
        super.c();
    }

    @Override // p.xvh0
    public final boolean e(int i) {
        jqd0 jqd0Var;
        nvh0 nvh0Var = (nvh0) this.f.get(i);
        if (nvh0Var != null) {
            y36 y36Var = this.i;
            for (Map.Entry entry : y36Var.entrySet()) {
                if (entry.getValue() == nvh0Var) {
                    y36Var.remove(entry.getKey());
                    break;
                }
            }
        }
        Map map = this.k;
        for (Map.Entry entry2 : map.entrySet()) {
            if (((Integer) entry2.getValue()).intValue() == i) {
                if (map.remove((String) entry2.getKey()) != null && (jqd0Var = ((rvh0) ((zvh0) ((mv2) this.l).c).d).g) != null) {
                    zvh0.d(this.a, 5, 0, 0, a(jqd0Var), (Bundle) null);
                    break;
                }
                break;
                break;
            }
        }
        return super.e(i);
    }
}
