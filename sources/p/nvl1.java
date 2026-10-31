package p;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nvl1 {
    public final awl1 a;
    public final String b;
    public final int c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;
    public final List g;
    public boolean h;
    public w4b1 i;

    static {
        qs10.c("WorkContinuationImpl");
    }

    public nvl1(awl1 awl1Var, String str, int i, List list, List list2) {
        this.a = awl1Var;
        this.b = str;
        this.c = i;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((nvl1) it.next()).f);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i == 1 && ((rwl1) list.get(i2)).b.u != Long.MAX_VALUE) {
                hhg1.n("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((rwl1) list.get(i2)).a.toString();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static boolean b(nvl1 nvl1Var, HashSet hashSet) {
        hashSet.addAll(nvl1Var.e);
        HashSet hashSetC = c(nvl1Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetC.contains((String) it.next())) {
                return true;
            }
        }
        List list = nvl1Var.g;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (b((nvl1) it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(nvl1Var.e);
        return false;
    }

    public static HashSet c(nvl1 nvl1Var) {
        HashSet hashSet = new HashSet();
        List list = nvl1Var.g;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((nvl1) it.next()).e);
            }
        }
        return hashSet;
    }

    public final w4b1 a() {
        if (this.h) {
            qs10 qs10VarA = qs10.a();
            TextUtils.join(", ", this.e);
            qs10VarA.getClass();
        } else {
            awl1 awl1Var = this.a;
            this.i = ila0.y(awl1Var.b.h, "EnqueueRunnable_".concat(bb00.r(this.c)), awl1Var.d.a, new ww21(this, (byte) 29));
        }
        return this.i;
    }

    public nvl1(awl1 awl1Var, List list) {
        this(awl1Var, null, 2, list, null);
    }
}
