package p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimeout;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTimer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n5b1 {
    public final CompositeDisposable D;
    public final idd1 E;
    public long F;
    public Disposable G;
    public final LinkedHashMap H;
    public final Set a;
    public final Context b;
    public final kly0 c;
    public final kly0 d;
    public final kly0 e;
    public final o5b1 f;
    public final kly0 g;
    public final kly0 h;
    public final kly0 i;
    public final kly0 j;
    public ti k;
    public final kly0 l;
    public final kly0 m;
    public final Scheduler n;
    public final Scheduler o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kly0 f55p;
    public final tuk q;
    public final pw3 r;
    public final pr4 s;
    public final idd1 t = new idd1(new j5b1(this, (byte) 5));
    public final idd1 u = new idd1(new j5b1(this, (byte) 9));
    public final idd1 v = new idd1(new j5b1(this, (byte) 0));
    public final idd1 w = new idd1(new j5b1(this, (byte) 3));
    public final idd1 x = new idd1(new j5b1(this, (byte) 1));
    public final idd1 y = new idd1(new j5b1(this, (byte) 2));
    public final idd1 z = new idd1(new j5b1(this, (byte) 7));
    public final idd1 A = new idd1(new j5b1(this, (byte) 8));
    public final idd1 B = new idd1(new j5b1(this, (byte) 6));
    public final idd1 C = new idd1(new j5b1(this, (byte) 4));

    public n5b1(Set set, Context context, kly0 kly0Var, jly0 jly0Var, jly0 jly0Var2, kly0 kly0Var2, o5b1 o5b1Var, caq caqVar, jly0 jly0Var3, kly0 kly0Var3, kly0 kly0Var4, ti tiVar, jly0 jly0Var4, kly0 kly0Var5, Scheduler scheduler, Scheduler scheduler2, kly0 kly0Var6, tuk tukVar, pw3 pw3Var, uic uicVar, pr4 pr4Var) {
        this.a = set;
        this.b = context;
        this.c = kly0Var;
        this.d = jly0Var;
        this.e = jly0Var2;
        this.f = o5b1Var;
        this.g = caqVar;
        this.h = jly0Var3;
        this.i = kly0Var3;
        this.j = kly0Var4;
        this.k = tiVar;
        this.l = jly0Var4;
        this.m = kly0Var5;
        this.n = scheduler;
        this.o = scheduler2;
        this.f55p = kly0Var6;
        this.q = tukVar;
        this.r = pw3Var;
        this.s = pr4Var;
        Logger.b("MBS: New SpotifyMediaBrowserServiceHandler instance", new Object[0]);
        this.D = new CompositeDisposable();
        this.E = new idd1(new k7a1(kly0Var2, this, (byte) 9));
        this.G = EmptyDisposable.a;
        this.H = new LinkedHashMap();
    }

    public final void a(String str) {
        if (this.G.isDisposed()) {
            long j = this.F + 1;
            this.F = j;
            n4e0 n4e0Var = (n4e0) ((xgb0) this.y.getValue()).c.get(str);
            if (n4e0Var != null) {
                t45 t45Var = n4e0Var.b;
                t45Var.getClass();
                t45.m(t45Var, "eis_connection", 4);
            }
            Logger.b("MBS: connecting to EIP (generation=%d)", new Object[]{Long.valueOf(j)});
            e5l0 e5l0Var = new e5l0((wjs0) this.x.getValue(), (byte) 22);
            Flowable flowableA = ((y610) this.v.getValue()).a((String) this.w.getValue());
            FlowableTimer flowableTimerA0 = Flowable.a0(30L, TimeUnit.SECONDS, this.o);
            flowableA.getClass();
            FlowableDoOnEach flowableDoOnEachV = new FlowableTimeout(flowableA, flowableTimerA0).L(this.n).v(new z0u0(this, str, (byte) 20));
            h5b1 h5b1Var = new h5b1(this, (byte) 0);
            Consumer consumer = Functions.d;
            Action action = Functions.c;
            FlowableDoOnEach flowableDoOnEachU = new FlowableDoFinally(flowableDoOnEachV.u(consumer, h5b1Var, action, action), new i5b1(j, this)).w(new xjs0(e5l0Var, (byte) 0)).v(new xjs0(e5l0Var, (byte) 1)).u(consumer, new xjs0(e5l0Var, (byte) 2), action, action).u(consumer, consumer, new yjs0(e5l0Var, (byte) 0), action);
            yjs0 yjs0Var = new yjs0(e5l0Var, (byte) 1);
            LongConsumer longConsumer = Functions.g;
            Objects.requireNonNull(consumer, "onSubscribe is null");
            Objects.requireNonNull(longConsumer, "onRequest is null");
            this.G = new FlowableDoOnLifecycle(flowableDoOnEachU, consumer, longConsumer, yjs0Var).subscribe(iqa1.c, new h5b1(this, (byte) 1));
        }
    }

    public final whh0 b(String str, int i, tn31 tn31Var) {
        Object next;
        vsr0 vsr0VarD;
        Bundle bundle;
        Bundle bundle2 = tn31Var.h;
        Logger.b("MBS: onGetRoot string=%s", new Object[]{str});
        whh0 whh0Var = null;
        if (!d(i, str)) {
            Logger.d("MBS: onGetRoot: IGNORING request from untrusted package %s", new Object[]{str});
            return null;
        }
        Iterator it = this.a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((suk) next).b(str));
        suk sukVar = (suk) next;
        String strI = sukVar != null ? sukVar.i(str, tn31Var) : null;
        if (strI != null) {
            str = strI;
        }
        if (bundle2 != null) {
            bundle2.getString("com.spotify.music.extra.AUTHORIZATION_CODE");
        }
        idd1 idd1Var = this.y;
        xgb0 xgb0Var = (xgb0) idd1Var.getValue();
        Map mapN = vpb1.n(bundle2);
        ti tiVar = this.k;
        LinkedHashMap linkedHashMap = xgb0Var.c;
        Set set = xgb0Var.b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                if (((w64) it2.next()).b(str)) {
                    linkedHashMap.put(str, new n4e0(xgb0Var.a, str, mapN));
                    n4e0 n4e0Var = (n4e0) linkedHashMap.get(str);
                    if (n4e0Var == null) {
                        break;
                    }
                    n4e0Var.b.a("app_state", tiVar.a);
                    break;
                }
            }
        }
        this.k = yi5.c;
        a(str);
        c().a.b(str, tn31Var);
        Set set2 = c().b;
        Iterator it3 = set2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                vsr0VarD = null;
                break;
            }
            suk sukVar2 = (suk) it3.next();
            if (sukVar2.b(str)) {
                vsr0VarD = uic.d(str, sukVar2.f());
                break;
            }
        }
        if (vsr0VarD != null) {
            Bundle bundleG = pzm.g("android.media.browse.SEARCH_SUPPORTED", true);
            Iterator it4 = set2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    bundle = new Bundle();
                    break;
                }
                suk sukVar3 = (suk) it4.next();
                if (sukVar3.b(str)) {
                    sukVar3.getExtras();
                    bundle = (Bundle) sukVar3.getExtras().b;
                    break;
                }
            }
            bundleG.putAll(bundle);
            whh0Var = new whh0(vsr0VarD, bundleG);
        }
        n4e0 n4e0Var2 = (n4e0) ((xgb0) idd1Var.getValue()).c.get(str);
        if (n4e0Var2 != null) {
            n4e0Var2.b.g("get_root");
        }
        if (whh0Var != null) {
            Logger.b("MBS: package connected ".concat(str), new Object[0]);
        }
        return whh0Var;
    }

    public final uhh0 c() {
        return (uhh0) this.A.getValue();
    }

    public final boolean d(int i, String str) {
        if (u890.j(str, "android.media.session.MediaController") && i == -1) {
            return true;
        }
        if (this.q.b(str) != null) {
            return this.r.a(this.b, new szc(str, i, SpotifyMediaBrowserService.class.getName()));
        }
        return false;
    }

    public final boolean e(int i, String str) {
        return d(i, str);
    }

    public final void f(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        Logger.b("MBS: loadChildren: parentId=%s, eipConnected=%s", new Object[]{vsr0Var, Boolean.valueOf(!this.G.isDisposed())});
        String strT = uic.t(vsr0Var);
        if (strT != null) {
            a(strT);
            c().a(strT);
        }
        c().a.a(vsr0Var, new k5b1(vsr0Var, bundle, iu30Var));
    }

    public final void g(int i, String str) {
        if ((u890.j(str, "android.media.session.MediaController") && i == -1) || this.s.b()) {
            Logger.b("MBS: onControllerConnected: package %s, ensuring EIS connection", new Object[]{str});
            a(str);
        }
    }

    public final void h(Throwable th) {
        Logger.d("MBS: EIP connection failed, failing pending search requests: %s", new Object[]{th.getMessage()});
        uhh0 uhh0VarC = c();
        String strM = l1d.m("External Integration Platform connection failed: ", th.getMessage());
        ArrayList arrayList = uhh0VarC.a.i;
        if (arrayList.isEmpty()) {
            return;
        }
        Logger.k("Failing %d pending search requests: %s", new Object[]{Integer.valueOf(arrayList.size()), strM});
        List<xih0> listL1 = o7h.l1(arrayList);
        arrayList.clear();
        for (xih0 xih0Var : listL1) {
            Logger.b("Failing deferred search for query='%s', package='%s'", new Object[]{xih0Var.a, xih0Var.c});
            xih0Var.f.invoke(pih0.c, strM);
        }
    }

    public final void i() {
        Logger.b("MBS: SpotifyMediaBrowserService destroyed, disconnecting from EIP and cleaning up", new Object[0]);
        if (!this.G.isDisposed()) {
            this.G.dispose();
        }
        if (this.A.isInitialized()) {
            uhh0 uhh0VarC = c();
            uhh0VarC.c.b.clear();
            uhh0VarC.a.i(true);
            uhh0VarC.d.c = null;
        }
        if (this.B.isInitialized()) {
            d6b1 d6b1Var = (d6b1) this.B.getValue();
            d6b1Var.i = false;
            d6b1Var.c();
        }
        if (this.C.isInitialized()) {
        }
    }

    public final void j(vsr0 vsr0Var) {
        uhh0 uhh0VarC = c();
        uhh0VarC.a.a(vsr0Var, new vhh0(new l5b1(vsr0Var, (byte) 0), vsr0Var, (byte) 0));
    }

    public final void k(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        Logger.b("MBS: search: query=%s, packageName=%s, extras=%s", new Object[]{str, str2, vpb1.n(bundle)});
        vih0 vih0VarH = c().a.h(str2);
        if (vih0VarH != null) {
            vih0VarH.d(str, bundle, str2, q1mVar, iu30Var, vu30Var, function0);
            return;
        }
        Logger.b(f4i1.f("MBS: No service session found for package: ", str2, ", deferring search request"), new Object[0]);
        uhh0 uhh0VarC = c();
        h5z h5zVar = new h5z(iu30Var, (byte) 7);
        up41 up41Var = new up41(vu30Var, (byte) 21);
        is3 is3Var = new is3(function0, (byte) 10);
        zih0 zih0Var = uhh0VarC.a;
        zih0Var.i.add(new xih0(str, bundle, str2, q1mVar, new z6h0(h5zVar, (byte) 6), new yih0(up41Var, (byte) 0), new tzf0(is3Var, (byte) 24)));
        if (zih0Var.f() != null) {
            zih0Var.d();
        }
    }

    public final void l(vsr0 vsr0Var) {
        String strT = uic.t(vsr0Var);
        if (strT != null) {
            a(strT);
            c().a(strT);
        }
        uhh0 uhh0VarC = c();
        uhh0VarC.a.a(vsr0Var, new vhh0(new m5b1(vsr0Var, this, (byte) 0), vsr0Var, (byte) 0));
    }

    public final void m(vsr0 vsr0Var) {
        uhh0 uhh0VarC = c();
        uhh0VarC.a.a(vsr0Var, new vhh0(new m5b1(vsr0Var, this, (byte) 1), vsr0Var, (byte) 0));
    }
}
