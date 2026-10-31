package p;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z6a0 implements Application.ActivityLifecycleCallbacks {
    public long N0;
    public long O0;
    public long P0;
    public long X;
    public long Y;
    public long Z;
    public final m4e0 a;
    public final iu30 b;
    public final Object c;
    public final Object d;
    public final LinkedHashMap e;
    public final LinkedHashSet f;
    public final LinkedHashSet g;
    public final ArrayList h;
    public boolean i;
    public boolean t;

    public z6a0() {
        m4e0 m4e0Var = new m4e0((byte) 4);
        mr90 mr90Var = mr90.X;
        this.a = m4e0Var;
        this.b = mr90Var;
        this.c = new Object();
        this.d = new Object();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashSet();
        this.g = new LinkedHashSet();
        this.h = new ArrayList();
        this.P0 = Long.MIN_VALUE;
    }

    public final a7a0 a(t6a0 t6a0Var) {
        long j;
        if (t6a0Var.d) {
            this.Y++;
            long j2 = this.Z;
            j = t6a0Var.b;
            this.Z = j2 + j;
        } else {
            this.N0++;
            long j3 = this.O0;
            j = t6a0Var.b;
            this.O0 = j3 + j;
        }
        long j4 = t6a0Var.a;
        ytw0 ytw0Var = jfv.b;
        return new a7a0(t6a0Var.c, j4, fdg1.l0(j, ngv.b), t6a0Var.d);
    }

    public final s6a0 b(List list) {
        return new s6a0(o7h.l1(this.g), list);
    }

    public final List c() {
        this.t = false;
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return z6x.a;
        }
        List listA1 = o7h.a1(arrayList, new cvt((byte) 17));
        arrayList.clear();
        List list = listA1;
        ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(a((t6a0) it.next()));
        }
        return arrayList2;
    }

    public final void d(Function0 function0) {
        s6a0 s6a0Var;
        synchronized (this.c) {
            synchronized (this.d) {
                s6a0Var = (s6a0) function0.invoke();
            }
            if (s6a0Var == null) {
                return;
            }
            for (a7a0 a7a0Var : s6a0Var.b) {
                Iterator it = s6a0Var.a.iterator();
                while (it.hasNext()) {
                    ((djq0) it.next()).a(a7a0Var);
                }
            }
        }
    }

    public final void e(boolean z) {
        synchronized (this.d) {
            if (z == this.i) {
                return;
            }
            this.i = z;
            ((Handler) this.a.b).postDelayed(new is3(new w6a0(this, (byte) 2), (byte) 5), 0L);
        }
    }

    public final void f(Activity activity) {
        LinkedHashMap linkedHashMap = this.e;
        Object b95Var = linkedHashMap.get(activity);
        if (b95Var == null) {
            b95Var = new b95(new e7a0(activity.getWindow(), new v6a0(this, activity.getWindow().getDecorView(), (byte) 0)));
            linkedHashMap.put(activity, b95Var);
        }
        e7a0 e7a0Var = ((b95) b95Var).a;
        if (true != e7a0Var.c) {
            g7a0 g7a0Var = e7a0Var.b;
            g7a0Var.e.getDecorView().post(new s38(true, g7a0Var));
            e7a0Var.c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        LinkedHashMap linkedHashMap = this.e;
        b95 b95Var = (b95) linkedHashMap.get(activity);
        if (b95Var != null) {
            e7a0 e7a0Var = b95Var.a;
            if (e7a0Var.c) {
                g7a0 g7a0Var = e7a0Var.b;
                g7a0Var.e.getDecorView().post(new s38(false, g7a0Var));
                e7a0Var.c = false;
            }
        }
        this.f.remove(activity);
        linkedHashMap.remove(activity);
        d(new w6a0(this, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        boolean z;
        this.f.add(activity);
        synchronized (this.d) {
            z = this.i;
        }
        if (z) {
            f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        b95 b95Var = (b95) this.e.get(activity);
        if (b95Var != null) {
            e7a0 e7a0Var = b95Var.a;
            if (e7a0Var.c) {
                g7a0 g7a0Var = e7a0Var.b;
                g7a0Var.e.getDecorView().post(new s38(false, g7a0Var));
                e7a0Var.c = false;
            }
        }
        this.f.remove(activity);
        d(new w6a0(this, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
