package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hv40 implements lvh0 {
    public final lwh0 a;
    public final mvh0 b;
    public final HashMap c = new HashMap();
    public final Handler d = new Handler(Looper.getMainLooper());
    public final gv40 e = new gv40(this, (byte) 0);
    public iwh0 f;
    public final /* synthetic */ kv40 g;

    public hv40(kv40 kv40Var, lwh0 lwh0Var, mvh0 mvh0Var) {
        this.g = kv40Var;
        this.a = lwh0Var;
        this.b = mvh0Var;
    }

    public final void c(mvh0 mvh0Var, gvh0 gvh0Var, Collection collection) {
        nvh0 nvh0VarD;
        if (this.b != mvh0Var) {
            return;
        }
        if (gvh0Var != null) {
            boolean z = false;
            boolean z2 = gvh0Var.e().size() == collection.size();
            if (!z2) {
                z = z2;
                break;
            }
            Iterator it = collection.iterator();
            do {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
            } while (gvh0Var.e().contains(((kvh0) it.next()).a.g()));
            if (!z) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((kvh0) it2.next()).a.g());
                }
                wmy wmyVar = new wmy(gvh0Var);
                ((ArrayList) wmyVar.b).clear();
                wmyVar.e(arrayList);
                gvh0Var = wmyVar.h();
            }
        }
        lwh0 lwh0Var = this.a;
        if (gvh0Var == null && this.f == null) {
            Objects.toString(lwh0Var);
            return;
        }
        iwh0 iwh0Var = this.f;
        kv40 kv40Var = this.g;
        if (iwh0Var == null) {
            kwh0 kwh0Var = lwh0Var.a;
            String strG = gvh0Var.g();
            iwh0 iwh0Var2 = new iwh0(kwh0Var, strG, kv40Var.b(kwh0Var, strG));
            iwh0Var2.h(gvh0Var);
            this.f = iwh0Var2;
            iwh0Var2.q(collection);
            this.d.removeCallbacks(this.e);
            cv40 cv40Var = kv40Var.a;
            iwh0 iwh0Var3 = this.f;
            iwh0Var3.getClass();
            cv40Var.getClass();
            cv40Var.obtainMessage(265, new iv40(lwh0Var, iwh0Var3)).sendToTarget();
        } else {
            kv40Var.p(iwh0Var, gvh0Var);
            this.f.q(collection);
        }
        if (this.f == null) {
            return;
        }
        HashMap map = this.c;
        HashSet<String> hashSet = new HashSet(map.keySet());
        for (lwh0 lwh0Var2 : ((lwh0) this.f).v) {
            String str = lwh0Var2.c;
            hashSet.remove(str);
            if (!map.containsKey(str) && !map.containsKey(str) && this.f != null && (nvh0VarD = lwh0Var.b().d(lwh0Var2.b, ((lwh0) this.f).b)) != null) {
                map.put(str, nvh0VarD);
                nvh0VarD.f();
            }
        }
        for (String str2 : hashSet) {
            nvh0 nvh0Var = (nvh0) map.get(str2);
            if (nvh0Var != null) {
                nvh0Var.i(1);
                nvh0Var.e();
                map.remove(str2);
            }
        }
    }

    public final void e() {
        HashMap map = this.c;
        for (nvh0 nvh0Var : map.values()) {
            nvh0Var.i(1);
            nvh0Var.e();
        }
        map.clear();
        mvh0 mvh0Var = this.b;
        mvh0Var.i(1);
        mvh0Var.e();
        this.d.removeCallbacks(this.e);
        cv40 cv40Var = this.g.a;
        iwh0 iwh0Var = this.f;
        cv40Var.getClass();
        Message messageObtainMessage = cv40Var.obtainMessage(266, new iv40(this.a, iwh0Var));
        messageObtainMessage.arg1 = 1;
        messageObtainMessage.sendToTarget();
    }
}
