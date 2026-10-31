package p;

import android.content.Context;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ats0 implements rhh0 {
    public final Context a;
    public final zuz b;
    public final o3e0 c;
    public final ytp0 d;
    public final t7c e;
    public final n3q0 f;
    public final o241 g;
    public final Scheduler h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    public ats0(Context context, zuz zuzVar, o3e0 o3e0Var, ytp0 ytp0Var, t7c t7cVar, n3q0 n3q0Var, o241 o241Var, rh11 rh11Var, Scheduler scheduler) {
        this.a = context;
        this.b = zuzVar;
        this.c = o3e0Var;
        this.d = ytp0Var;
        this.e = t7cVar;
        this.f = n3q0Var;
        this.g = o241Var;
        this.h = scheduler;
    }

    public static l510 e(l510 l510Var, boolean z) {
        if (!z) {
            return l510Var;
        }
        List listB = l510Var.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (!u890.j(((p510) obj).a(), "nft-home-recently-played")) {
                arrayList.add(obj);
            }
        }
        return l510.a(l510Var, arrayList);
    }

    @Override // p.w310
    public final Single b(r9c r9cVar) {
        m210 m210VarB = r9cVar.b();
        return m210VarB == null ? Single.error(new Throwable("externalAccessoryDescription is null")) : Single.zip(this.g.a.firstOrError(), this.e.b().b(r9cVar).map(yz10.V0), new r0s0(r9cVar, this, m210VarB, (byte) 8)).flatMap(zz10.W0).map(a020.X0);
    }

    public final void c(r9c r9cVar, boolean z, boolean z2, p510 p510Var, int i, ArrayList arrayList) {
        p710 p710Var = new p710(16, Integer.valueOf(i), "SECTION", p510Var.a(), p510Var.d(), (String) null);
        int i2 = 0;
        for (Object obj : p510Var.b()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            t510 t510Var = (t510) obj;
            p710 p710Var2 = new p710(18, Integer.valueOf(i2), "ITEM", (String) null, t510Var.a(), (String) null);
            spq0 spq0VarD = this.c.d(t510Var, p510Var.c(), Boolean.valueOf(r9cVar.i()), z, z2, this.f, new y310(p7h.M(p710Var, p710Var2)), r9cVar.b());
            if (spq0VarD.c()) {
                arrayList.add(spq0VarD.b());
            }
            i2 = i3;
        }
    }

    public final ArrayList d(l510 l510Var, m210 m210Var, boolean z, boolean z2) {
        this.i.put(m210Var, l510Var);
        ArrayList arrayList = new ArrayList();
        for (p510 p510Var : l510Var.b()) {
            if (z2 || !u890.j(p510Var.a(), "nft-home-recently-played") || !z) {
                spq0 spq0VarB = o3e0.b(p510Var);
                if (spq0VarB.c()) {
                    arrayList.add(spq0VarB.b());
                }
            }
        }
        return arrayList;
    }

    public final Single f(m210 m210Var, l510 l510Var) {
        List listB = l510Var.b();
        if (!(listB instanceof Collection) || !listB.isEmpty()) {
            Iterator it = listB.iterator();
            while (it.hasNext()) {
                if (u890.j(((p510) it.next()).a(), "nft-home-recently-played")) {
                    return Observable.combineLatest((ObservableSource) this.b.a(), (ObservableSource) Observable.timer(700L, TimeUnit.MILLISECONDS, this.h).map(ws10.Y0).startWith(Observable.just(Boolean.FALSE)), (BiFunction) ok10.V0).takeUntil((Predicate) sl10.Z0).takeLast(1).flatMapIterable(as10.W0).filter(qs10.Y0).toList().map(new r0s0(this, m210Var, l510Var, (byte) 7));
                }
            }
        }
        return Single.just(oqn1.n(l510Var, Boolean.FALSE));
    }

    public final Single g(r9c r9cVar, boolean z, boolean z2) {
        m210 m210VarB = r9cVar.b();
        if (m210VarB == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        l510 l510Var = (l510) this.i.get(m210VarB);
        if (l510Var == null) {
            return ytp0.z(this.d, r9cVar).firstOrError().doOnSuccess(new zss0(this, m210VarB, (byte) 0)).flatMap(new m3c(this, r9cVar, z, z2, (byte) 7));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : l510Var.b()) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            p510 p510Var = (p510) obj;
            if (u890.j(r9cVar.e(), p510Var.d())) {
                c(r9cVar, z, z2, p510Var, i, arrayList);
            }
            i = i2;
        }
        return Single.just(arrayList);
    }

    public final Single h(r9c r9cVar, m210 m210Var, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList;
        l510 l510Var = (l510) this.i.get(r9cVar.b());
        if (l510Var == null) {
            return ytp0.z(this.d, r9cVar).firstOrError().map(new m980(this, z3, (byte) 22)).flatMap(new yss0(this, m210Var, (byte) 1)).doOnSuccess(new zss0(this, m210Var, (byte) 1)).flatMap(new ie90(this, r9cVar, m210Var, z, z2, z3));
        }
        ats0 ats0Var = this;
        boolean z4 = z;
        boolean z5 = z2;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : e(l510Var, z3).b()) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            p510 p510Var = (p510) obj;
            if (!u890.j(r9cVar.e(), p510Var.d())) {
                arrayList = arrayList2;
            } else if (u890.j(p510Var.a(), "nft-home-recently-played")) {
                List list = (List) ats0Var.j.get(m210Var);
                if (list == null) {
                    list = z6x.a;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    boolean z6 = z5;
                    boolean z7 = z4;
                    spq0 spq0VarF = ats0Var.c.f((RecentlyPlayedEntity) it.next(), spq0.d(ats0Var.a.getString(2131960950)), 1, r9cVar, z7, z6);
                    z4 = z7;
                    z5 = z6;
                    if (spq0VarF.c()) {
                        arrayList2.add(spq0VarF.b());
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                ats0 ats0Var2 = ats0Var;
                boolean z8 = z4;
                ats0Var2.c(r9cVar, z8, z5, p510Var, i, arrayList);
                z4 = z8;
                ats0Var = ats0Var2;
            }
            i = i2;
            arrayList2 = arrayList;
        }
        return Single.just(arrayList2);
    }
}
