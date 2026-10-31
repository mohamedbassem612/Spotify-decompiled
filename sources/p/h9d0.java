package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h9d0 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public h9d0(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, rdd1 rdd1Var, f9d0 f9d0Var, boolean z) {
        this.c = thread;
        this.f = copyOnWriteArraySet;
        this.e = f9d0Var;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        if (looper == null || rdd1Var == null || f9d0Var == null) {
            this.d = null;
        } else {
            this.d = rdd1Var.a(looper, new owu(this, (byte) 2));
        }
        this.b = z;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (this.a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f).add(new g9d0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        wdd1 wdd1Var = (wdd1) this.d;
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        if (this.b) {
            dm5.y(Thread.currentThread() == ((Thread) this.c));
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.h;
        if (arrayDeque2.isEmpty()) {
            return;
        }
        if (((f9d0) this.e) != null) {
            wdd1Var.getClass();
            Handler handler = wdd1Var.a;
            if (!handler.hasMessages(1)) {
                vdd1 vdd1VarA = wdd1Var.a(1);
                Message message = vdd1VarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                vdd1VarA.a();
            }
        }
        boolean zIsEmpty = arrayDeque.isEmpty();
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        if (zIsEmpty) {
            while (!arrayDeque.isEmpty()) {
                ((Runnable) arrayDeque.peekFirst()).run();
                arrayDeque.removeFirst();
            }
        }
    }

    public void c(int i, e9d0 e9d0Var) {
        if (this.b) {
            dm5.y(Thread.currentThread() == ((Thread) this.c));
        }
        ((ArrayDeque) this.h).add(new z0d((Object) new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), i, (Object) e9d0Var, (byte) 7));
    }

    public void d() {
        if (this.b) {
            dm5.y(Thread.currentThread() == ((Thread) this.c));
        }
        synchronized (this.i) {
            this.a = true;
        }
        for (g9d0 g9d0Var : (CopyOnWriteArraySet) this.f) {
            f9d0 f9d0Var = (f9d0) this.e;
            g9d0Var.d = true;
            if (f9d0Var != null && g9d0Var.c) {
                g9d0Var.c = false;
                f9d0Var.e(g9d0Var.a, g9d0Var.b.l());
            }
        }
        ((CopyOnWriteArraySet) this.f).clear();
    }

    public void e(Object obj) {
        if (this.b) {
            dm5.y(Thread.currentThread() == ((Thread) this.c));
        }
        CopyOnWriteArraySet<g9d0> copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        for (g9d0 g9d0Var : copyOnWriteArraySet) {
            if (g9d0Var.a.equals(obj)) {
                f9d0 f9d0Var = (f9d0) this.e;
                g9d0Var.d = true;
                if (f9d0Var != null && g9d0Var.c) {
                    g9d0Var.c = false;
                    f9d0Var.e(g9d0Var.a, g9d0Var.b.l());
                }
                copyOnWriteArraySet.remove(g9d0Var);
            }
        }
    }

    public void f() {
        ((Handler) this.e).post((gv40) this.i);
    }

    public void g() {
        int i;
        kv40 kv40Var = (kv40) this.d;
        Context context = (Context) this.c;
        PackageManager packageManager = (PackageManager) this.f;
        ArrayList arrayList = (ArrayList) this.g;
        if (this.b) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.a || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (true) {
                boolean zIsEmpty = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if ((owh0.c == null ? false : owh0.c().i()) && !arrayList2.isEmpty()) {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                ServiceInfo serviceInfo3 = (ServiceInfo) it3.next();
                                if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                                }
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            i3 = -1;
                            break;
                        }
                        ComponentName componentName = ((if11) arrayList.get(i3)).i;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i3 < 0) {
                        if11 if11Var = new if11(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        if11Var.P0 = new jf11(this, if11Var);
                        if (!if11Var.Y) {
                            if11Var.Y = true;
                            if11Var.m();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, if11Var);
                        kv40Var.a(if11Var, false);
                    } else if (i3 >= i2) {
                        if11 if11Var2 = (if11) arrayList.get(i3);
                        if (!if11Var2.Y) {
                            if11Var2.Y = true;
                            if11Var2.m();
                        }
                        if (if11Var2.N0 == null) {
                            if (!if11Var2.Y) {
                                zIsEmpty = false;
                            } else if (((rvh0) if11Var2).e == null) {
                                zIsEmpty = true ^ if11Var2.X.isEmpty();
                            }
                            if (zIsEmpty) {
                                if11Var2.l();
                                if11Var2.i();
                            }
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i3, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i2; size2--) {
                    if11 if11Var3 = (if11) arrayList.get(size2);
                    kwh0 kwh0VarD = kv40Var.d(if11Var3);
                    if (kwh0VarD != null) {
                        if11Var3.getClass();
                        owh0.b();
                        ((rvh0) if11Var3).d = null;
                        if11Var3.h((hvh0) null);
                        kv40Var.o(kwh0VarD, (jqd0) null);
                        kv40Var.a.b(514, kwh0VarD);
                        kv40Var.l.remove(kwh0VarD);
                    }
                    arrayList.remove(if11Var3);
                    if11Var3.P0 = null;
                    if (if11Var3.Y) {
                        if11Var3.Y = false;
                        if11Var3.m();
                    }
                }
            }
        }
    }

    public void h(int i, e9d0 e9d0Var) {
        c(i, e9d0Var);
        b();
    }

    public void i() {
        Handler handler = (Handler) this.e;
        if (this.b) {
            return;
        }
        this.b = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        ((Context) this.c).registerReceiver((jlb) this.h, intentFilter, null, handler);
        handler.post((gv40) this.i);
    }

    public h9d0(Context context, kv40 kv40Var) {
        this.g = new ArrayList();
        this.h = new jlb(this, (byte) 16);
        this.i = new gv40(this, (byte) 27);
        this.c = context;
        this.d = kv40Var;
        this.e = new Handler();
        this.f = context.getPackageManager();
    }

    public h9d0(Looper looper) {
        this(looper.getThread());
    }

    public h9d0(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public h9d0(Looper looper, rdd1 rdd1Var, f9d0 f9d0Var) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), rdd1Var, f9d0Var, true);
    }

    public h9d0(Context context, i1r0 i1r0Var, kt91 kt91Var, ut71 ut71Var, boolean z, boolean z2, wz4 wz4Var, g0l g0lVar, w4h w4hVar) {
        this.c = context;
        this.d = i1r0Var;
        this.e = kt91Var;
        this.f = ut71Var;
        this.a = z;
        this.b = z2;
        this.g = wz4Var;
        this.h = g0lVar;
        this.i = w4hVar;
    }
}
