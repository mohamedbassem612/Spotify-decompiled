package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.observers.BlockingMultiObserver;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oh61 {
    public static final Pattern B = Pattern.compile(",\\s*");
    public static final PlayOrigin C;
    public static final m210 D;
    public final dxz0 A;
    public final AppProtocolRemoteService a;
    public final f0q b;
    public final x610 c;
    public final i090 d;
    public final o241 e;
    public final Flowable f;
    public final b7n g;
    public final Flowable h;
    public final yqg i;
    public final Scheduler j;
    public final g510 k;
    public final a791 l;
    public final dbm m;
    public final Map n;
    public zq5 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f31p;
    public boolean q;
    public uw0 r;
    public rl1 s;
    public Disposable t;
    public c610 u;
    public a710 v;
    public k710 w;
    public m5a1 x;
    public String y = "default";
    public m210 z;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("inter-app-protocol");
        a690 a690Var = b690.a;
        C = builder.referrerIdentifier("app_integration").build();
        D = new m210("app_remote", "", "", "", "", "", "", "", "", "inter_app", "");
    }

    public oh61(AppProtocolRemoteService appProtocolRemoteService, f0q f0qVar, x610 x610Var, dbm dbmVar, i090 i090Var, Scheduler scheduler, yt91 yt91Var, o241 o241Var, Flowable flowable, b7n b7nVar, Flowable flowable2, yqg yqgVar, g510 g510Var, dxz0 dxz0Var, b791 b791Var, Map map) {
        this.a = appProtocolRemoteService;
        this.b = f0qVar;
        this.m = dbmVar;
        this.c = x610Var;
        this.d = i090Var;
        this.e = o241Var;
        this.f = flowable;
        this.g = b7nVar;
        this.h = flowable2;
        this.i = yqgVar;
        this.k = g510Var;
        this.l = b791Var;
        this.j = scheduler;
        this.A = dxz0Var;
        this.n = map;
    }

    public static void a(HashMap map, PreparePlayOptions.Builder builder) {
        npq0 npq0Var;
        opq0 opq0Var = opq0.d;
        if (map.containsKey(opq0Var)) {
            String str = (String) map.get(opq0Var);
            if (str != null) {
                builder.skipTo(SkipToTrack.builder().trackUid(str).build());
                return;
            }
            return;
        }
        opq0 opq0Var2 = opq0.c;
        if (map.containsKey(opq0Var2)) {
            String str2 = (String) map.get(opq0Var2);
            if (str2 != null) {
                builder.skipTo(SkipToTrack.builder().trackUri(str2).build());
                return;
            }
            return;
        }
        opq0 opq0Var3 = opq0.b;
        if (!map.containsKey(opq0Var3) || (npq0Var = (npq0) map.get(opq0Var3)) == null) {
            return;
        }
        builder.skipTo(SkipToTrack.builder().trackIndex(Long.valueOf(npq0Var.a)).build());
    }

    public static void b(String str, HashMap map, PreparePlayOptions.Builder builder) {
        npq0 npq0Var;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        v5b1 v5b1Var = s4b1VarX.d;
        if (s4b1VarX.c == blc0.g1 || (v5b1Var != null && v5b1Var.getType() == nyu0.e)) {
            opq0 opq0Var = opq0.b;
            if (!map.containsKey(opq0Var) || (npq0Var = (npq0) map.get(opq0Var)) == null) {
                return;
            }
            builder.skipTo(SkipToTrack.builder().pageIndex(0L).trackIndex(Long.valueOf(npq0Var.a)).build());
        }
    }

    public static yr5 c(z310 z310Var, int i, int i2) {
        int i3 = i;
        List list = z310Var.a;
        int i4 = i2 == 0 ? Integer.MAX_VALUE : i2;
        if (i4 <= 0 || i3 < 0 || i3 >= list.size()) {
            return new yr5(Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(list.size()), Arrays.asList(new vr5[0]));
        }
        ArrayList arrayList = new ArrayList(Math.min(list.size(), i4));
        int i5 = i3;
        while (i5 < i3 + i4 && i5 < list.size()) {
            u310 u310Var = (u310) list.get(i5);
            String str = u310Var.c;
            int i6 = u310Var.G;
            String str2 = u310Var.a;
            if (!jhc1.F(str)) {
                String str3 = u310Var.b;
                String strValueOf = String.valueOf(u310Var.e);
                String str4 = u310Var.c;
                String str5 = u310Var.d;
                if (str5 == null) {
                    str5 = "";
                }
                Boolean boolValueOf = Boolean.valueOf(i6 == 1);
                Boolean boolValueOf2 = Boolean.valueOf(i6 == 2);
                Boolean boolValueOf3 = Boolean.valueOf(u310Var.l);
                hs5 hs5Var = new hs5();
                hs5Var.b = null;
                hs5Var.c = null;
                hs5Var.d = null;
                hs5Var.e = null;
                hs5Var.f = null;
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str2).c;
                blc0 blc0Var2 = blc0.ti;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (blc0Var == blc0Var2 || uic.x(str2).c == blc0.Pg) {
                    hs5Var.b = Boolean.valueOf(u310Var.m);
                    hs5Var.c = Boolean.valueOf(u310Var.n);
                    Integer num = u310Var.q;
                    if (num != null) {
                        hs5Var.d = Long.valueOf(timeUnit.toMillis(num.intValue()));
                    }
                }
                if (uic.x(str2).c == blc0.Pg) {
                    Integer num2 = u310Var.r;
                    if (num2 != null) {
                        hs5Var.e = Long.valueOf(timeUnit.toMillis(num2.intValue()));
                    }
                    hs5Var.f = Boolean.valueOf(u310Var.I == 3);
                }
                vr5 vr5Var = new vr5();
                vr5Var.b = str2;
                vr5Var.c = str3;
                vr5Var.d = str2;
                vr5Var.e = strValueOf;
                vr5Var.f = str4;
                vr5Var.g = str5;
                vr5Var.h = boolValueOf;
                vr5Var.i = boolValueOf2;
                vr5Var.j = boolValueOf3;
                vr5Var.k = hs5Var;
                arrayList.add(vr5Var);
            }
            i5++;
            i3 = i;
            list = list;
            i4 = i4;
        }
        return new yr5(Integer.valueOf(i4), Integer.valueOf(i), Integer.valueOf(list.size()), arrayList);
    }

    public static PlayOrigin d(String str) {
        if (str == null) {
            return C;
        }
        PlayOrigin.Builder builder = PlayOrigin.builder(str);
        a690 a690Var = b690.a;
        return builder.referrerIdentifier("app_integration").build();
    }

    public static String e(t380 t380Var) {
        if (t380Var.contains("mft_disallow") || t380Var.contains("disallow-mft-radio")) {
            return "CANT_PLAY_ON_DEMAND";
        }
        if (t380Var.contains("ad_disallow") || t380Var.contains("endless_context") || t380Var.contains("disallow-radio")) {
            return "ACTION_NOT_ALLOWED_IN_CONTEXT";
        }
        if (t380Var.contains("invalid_uri")) {
            return "NOT_A_VALID_URI";
        }
        return t380Var.contains("track_unavailable_offline") ? "TRACK_UNAVAILABLE_OFFLINE" : "UNKNOWN";
    }

    public final Observable f() {
        return this.h.T(this.m.c(4).v()).z().toObservable().map(new mh61(this, (byte) 6));
    }

    public final Single g(String str, PreparePlayOptions preparePlayOptions, String str2) {
        return this.k.e(this.z, str, (w7h1) null, (ou80) null, 1).map(new nh61((byte) 3)).flatMap(new tws(this, str, preparePlayOptions, str2, (byte) 3)).map(new hfr("Cannot play specified uri", (byte) 18));
    }

    public final Observable h(pu5 pu5Var) {
        return g(pu5Var.b, null, pu5Var.c).toObservable().startWith(this.m.c(2).w());
    }

    public final Observable i(vu5 vu5Var) {
        String str = vu5Var.b;
        List list = vu5Var.c;
        return Single.create(new h341((String[]) list.toArray(new String[list.size()]), str, (byte) 10)).flatMap(new k65(this, str, vu5Var.d, (byte) 24)).toObservable().startWith(this.m.c(2).w());
    }

    public final Observable j(int i) {
        g710 g710Var = this.v;
        Completable completableQ = ((pta1) g710Var.l.getValue()).c(g710Var.j, i).h(dxu.U0).q(this.m.c(2));
        Completable completableIgnoreElements = this.c.b().a().firstOrError().toObservable().flatMap(new nh61((byte) 11)).ignoreElements();
        completableQ.getClass();
        Objects.requireNonNull(completableIgnoreElements, "other is null");
        CompletableAndThenCompletable completableAndThenCompletable = new CompletableAndThenCompletable(completableQ, completableIgnoreElements);
        Completable completableIgnoreElements2 = f().firstOrError().toObservable().flatMap(new nh61((byte) 25)).ignoreElements();
        Objects.requireNonNull(completableIgnoreElements2, "other is null");
        return new CompletableAndThenCompletable(completableAndThenCompletable, completableIgnoreElements2).w().concatWith(Observable.just(cv5.a)).map(new f341((byte) 19)).timeout(25L, TimeUnit.SECONDS, Observable.error(new TimeoutException())).onErrorResumeNext(new f341((byte) 20));
    }

    public final Observable k(zs5 zs5Var) {
        return Single.just(zs5Var.b).flatMap(new mh61(this, (byte) 0)).map(new hfr("Could not set repeat mode", (byte) 18)).toObservable().startWith(this.m.c(1).w());
    }

    public final Observable l(rt5 rt5Var) {
        Observable observable = this.h.T(this.m.c(1).v()).z().flatMap(new h341(this, rt5Var, (byte) 11)).map(new hfr("Could not update shuffle", (byte) 18)).toObservable();
        m210 m210Var = this.z;
        boolean zBooleanValue = rt5Var.b.booleanValue();
        g510 g510Var = this.k;
        return observable.startWith((zBooleanValue ? g510Var.m(m210Var, 1, 2) : g510Var.m(m210Var, 2, 1)).ignoreElement().w());
    }

    public final int m(int i, String str) {
        int iIncrementAndGet;
        CompletableFromAction completableFromAction = new CompletableFromAction(new ok70(this.m, 4));
        BlockingMultiObserver blockingMultiObserver = new BlockingMultiObserver();
        completableFromAction.subscribe(blockingMultiObserver);
        blockingMultiObserver.b();
        nhc.F(0, Integer.MAX_VALUE, i, "request id");
        nhc.D(str, "uri");
        xca xcaVarM = this.r.m(str);
        if (xcaVarM == null) {
            Logger.k("Attempted to subscribe to unknown topic \"%s\".", new Object[]{str});
            return 0;
        }
        synchronized (xcaVarM) {
            iIncrementAndGet = xca.d.incrementAndGet();
            xcaVarM.a.add(Integer.valueOf(iIncrementAndGet));
        }
        return iIncrementAndGet;
    }

    public final boolean n(int i, int i2) {
        xca xcaVar;
        nhc.F(0, Integer.MAX_VALUE, i, "request id");
        nhc.F(Integer.MIN_VALUE, Integer.MAX_VALUE, i2, "subscription id");
        Iterator it = ((HashMap) this.r.f).values().iterator();
        do {
            if (!it.hasNext()) {
                xcaVar = null;
                break;
            }
            xcaVar = (xca) it.next();
        } while (!xcaVar.a.contains(Integer.valueOf(i2)));
        if (xcaVar == null) {
            return false;
        }
        xcaVar.a.remove(Integer.valueOf(i2));
        return true;
    }
}
