package p;

import android.content.Context;
import android.content.Intent;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.net.http.UrlResponseInfo;
import android.os.Trace;
import androidx.car.app.model.Alert;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.spotify.appauthorization.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class uk4 implements o7o, Function, ci7, v0i, f9d0, e9d0, rwr, hc10, i4d1, qiw, i2q0, mnm, gka1, e670, de70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uk4(tz3 tz3Var, d2e0 d2e0Var, qqh0 qqh0Var, IOException iOException, boolean z) {
        this.a = (byte) 12;
        this.b = qqh0Var;
        this.c = iOException;
    }

    public int a(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.b;
        x8h x8hVar = (x8h) this.c;
        x8hVar.getClass();
        if (abx.h(mediaCodecInfo, str, x8hVar)) {
            return 0;
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    public Object apply(Object obj) {
        boolean zEquals;
        final byte b = 0;
        switch (this.a) {
            case 2:
                final ro5 ro5Var = (ro5) this.b;
                final fy8 fy8Var = (fy8) this.c;
                Map map = fy8Var.b;
                vh61 vh61Var = (vh61) obj;
                int iOrdinal = vh61Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return Completable.j(new BuiltInAuthException(2, "The user must go to the Spotify and log-in"));
                    }
                    if (iOrdinal == 2) {
                        return Completable.j(new BuiltInAuthException(3, "Spotify must be online to verify this authorization request."));
                    }
                    if (iOrdinal == 3) {
                        Locale locale = Locale.ENGLISH;
                        return Completable.j(new BuiltInAuthException(4, "Could not authenticate within 60 s. It is possible that there's an issue with Spotify auth services or the connection is unstable"));
                    }
                    jah.g(l1d.m("Unknown session state result: ", vh61Var.name()));
                    return null;
                }
                String str = fy8Var.a;
                if (map == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                Object obj2 = map.get("redirect_uri");
                if (obj2 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String str2 = (String) obj2;
                t380 t380VarB = i1o1.B(fy8Var);
                xig xigVar = fy8Var.d;
                String string = (String) map.get("state");
                if (string == null) {
                    string = UUID.randomUUID().toString();
                }
                str.getClass();
                wq8 wq8Var = new wq8(str, 1, str2, xigVar, string, new ArrayList((Collection) t380VarB), false, 4032);
                boolean z = Boolean.parseBoolean((String) map.get("show_auth_view"));
                lag lagVar = ro5Var.b;
                xig xigVar2 = fy8Var.d;
                xigVar2.getClass();
                FlowableIgnoreElementsCompletable flowableIgnoreElementsCompletableK = lagVar.k(xigVar2.a, wq8Var);
                ow3 ow3Var = ro5Var.c;
                Context context = ro5Var.d;
                km3 km3Var = (km3) ow3Var.b;
                return flowableIgnoreElementsCompletableK.c(((yze1) km3Var.b).c().map(t9w.X).flatMap(new cp5((Object) km3Var, (byte) 28)).flatMap(new hr8(ow3Var, context, wq8Var, z, (byte) 0)).onErrorReturn(new kr60((Object) wq8Var, (byte) 25)).flatMapCompletable(new um5((byte) 14)).h(new po5(ro5Var, fy8Var, (byte) 0)).g(new Action() { // from class: p.qo5
                    public final void run() {
                        byte b2 = b;
                        Object obj3 = fy8Var;
                        Object obj4 = ro5Var;
                        switch (b2) {
                            case 0:
                                lag lagVar2 = ((ro5) obj4).b;
                                xig xigVar3 = ((fy8) obj3).d;
                                xigVar3.getClass();
                                lagVar2.l(xigVar3.a);
                                break;
                            default:
                                ((oh61) obj4).c.b().b((String) obj3);
                                break;
                        }
                    }
                }));
            case 6:
                jrd jrdVar = (jrd) this.b;
                z310 z310Var = (z310) obj;
                if (!((r9c) this.c).g && !z310Var.a.isEmpty()) {
                    return Single.just(z310Var);
                }
                Uri uri = Uri.EMPTY;
                Context context2 = jrdVar.a;
                return Single.just(new z310(z1p1.B(new u310[]{new u310("com.spotify.inter-app.home", (String) null, context2.getString(2131956593), (String) null, kno1.q(context2, 2131233208), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12), new u310("com.spotify.recently-played", (String) null, context2.getString(2131960950), (String) null, kno1.q(context2, 2131233213), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12), new u310("com.spotify.your-library", (String) null, context2.getString(2131954022), (String) null, kno1.q(context2, 2131233216), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, true, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12), new u310("com.spotify.browse", (String) null, gm50.p(context2.getString(2131955874), Locale.getDefault()), (String) null, kno1.q(context2, 2131233204), (Uri) null, uri, uri, uri, (Uri) null, (Uri) null, 2, false, false, false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12)}), (f410) null, (m510) null, (String) null));
            case 8:
                mp8 mp8Var = (mp8) this.b;
                py8 py8Var = (py8) this.c;
                Throwable th = (Throwable) obj;
                synchronized (mp8Var) {
                    new IllegalStateException("command failed", th);
                }
                leh lehVar = (leh) mp8Var.b;
                if (lehVar == null) {
                    return th;
                }
                try {
                    lehVar.e(py8Var, th);
                    return th;
                } catch (RuntimeException e) {
                    return e instanceof Assertion.RecoverableAssertionError ? e : new meh(e);
                }
            case 14:
                pxr pxrVar = (pxr) this.b;
                String str3 = (String) this.c;
                PlayerState playerState = (PlayerState) obj;
                spq0 spq0VarTrack = playerState.track();
                if (spq0VarTrack.c()) {
                    ContextTrack contextTrack = (ContextTrack) spq0VarTrack.b();
                    String strUri = (String) contextTrack.metadata().get("parent_episode.uri");
                    if (strUri == null) {
                        strUri = contextTrack.uri();
                    }
                    zEquals = strUri.equals(str3);
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    return new a8z(((Long) playerState.position(pxrVar.b.b()).e(0L)).longValue(), ((Long) playerState.duration().e(0L)).longValue(), str3, !playerState.isPaused() && playerState.isPlaying());
                }
                return y7z.a;
            default:
                v7s v7sVar = (v7s) this.b;
                LoggingParams loggingParams = (LoggingParams) obj;
                return new b8p1(v7sVar.i, 1, ((m210) this.c).a, (String) loggingParams.interactionId().b(), (byte) 3).w(v7sVar.b.c().h(loggingParams)).flatMap(new thn(loggingParams, (byte) 7));
        }
    }

    public y570 b(y570 y570Var) {
        return ((de70) this.c).b(((de70) this.b).b(y570Var));
    }

    public Object d(Task task) {
        return (wyo1.j() && ((Integer) task.g()).intValue() == 402) ? oj80.a((Context) this.b, (Intent) this.c).o(new l5o(), new n9v((byte) 20)) : task;
    }

    public void e(Object obj, ko20 ko20Var) {
        uz3 uz3Var = (uz3) obj;
        uz3Var.t((r8u0) this.c, new em3(ko20Var, ((pfr) this.b).e));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    public void f() {
        boolean z;
        boolean zA;
        c120 c120Var = (c120) this.b;
        String str = (String) this.c;
        Set set = dhn.a;
        if (set.contains(wwg.class)) {
            return;
        }
        if (c120Var != null) {
            try {
                if (c120Var.g) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                dhn.a(wwg.class, th);
            }
        } else {
            z = false;
        }
        wf10 wf10Var = wf10.a;
        wgi1 wgi1Var = wgi1.a;
        if (set.contains(wgi1.class)) {
            zA = false;
        } else {
            try {
                wgi1.a.e();
                zA = wgi1.g.a();
            } catch (Throwable th2) {
                dhn.a(wgi1.class, th2);
                zA = false;
            }
        }
        if (z && zA) {
            wwg wwgVar = wwg.a;
            if (dhn.a.contains(wwgVar)) {
                return;
            }
            try {
                if (wwg.h) {
                    return;
                }
                wwg.h = true;
                wf10.c().execute(new vwg(str, (byte) 0));
                return;
            } catch (Throwable th3) {
                dhn.a(wwgVar, th3);
                return;
            }
            dhn.a(wwg.class, th);
        }
    }

    @Override // p.hc10
    public ec10[] g() {
        z7s z7sVar = (z7s) this.b;
        ie30 ie30Var = (ie30) this.c;
        return new ec10[]{z7sVar.c.e(ie30Var) ? new upc1(z7sVar.c.h(ie30Var), null) : new ukb(ie30Var)};
    }

    public int h(y570 y570Var) {
        return d670.b((e670) this.b, (e670) this.c, y570Var);
    }

    public jku i(uk4 uk4Var) {
        return ((ex30) this.b).a(new uk4((av30) this.c, uk4Var, (byte) 26));
    }

    public void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 11:
                ((uz3) obj).q((tz3) obj3, (qqh0) obj2);
                break;
            default:
                ((uz3) obj).r((qqh0) obj3, (IOException) obj2);
                break;
        }
    }

    public void j(o29 o29Var) {
        rts rtsVar = (rts) this.b;
        ey30 ey30Var = (((j4d1) this.c).c.a() && o29Var.d) ? ey30.c : ey30.b;
        xmm0 xmm0Var = rtsVar.a;
        hy30.d((AtomicBoolean) xmm0Var.c, true);
        hy30.c((Thread) xmm0Var.e);
        if (((ey30) xmm0Var.m) != ey30Var) {
            xmm0Var.m = ey30Var;
            xmm0Var.p(xmm0Var.b);
        }
    }

    public void k(String str, String str2) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.c;
        ges gesVar = (ges) this.b;
        switch (b) {
            case 17:
                k241 k241Var = (k241) obj;
                ix7 ix7Var = gesVar.X0;
                if (ix7Var != null) {
                    i8h1 i8h1Var = (i8h1) ix7Var.b;
                    x6h1 x6h1VarC = ((pdl0) ix7Var.c).b.c();
                    x6h1VarC.i.add(new a7h1("toast", str, (Integer) null, (String) null, str2));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("toast_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                if (k241Var.c != null) {
                    k241Var.c();
                    if (k241Var.c != null) {
                        eg.m("Loader is already running.");
                    } else {
                        k241Var.c = k241Var.a.subscribe(new fv5(k241Var, (byte) 17));
                    }
                }
                break;
            default:
                y690 y690Var = (lyg) obj;
                if (y690Var instanceof y690) {
                    y690 y690Var2 = y690Var;
                    ix7 ix7Var2 = gesVar.X0;
                    if (ix7Var2 != null) {
                        i8h1 i8h1Var2 = (i8h1) ix7Var2.b;
                        x6h1 x6h1VarC3 = ((pdl0) ix7Var2.c).b.c();
                        x6h1VarC3.i.add(new a7h1("toast", "network error", (Integer) null, (String) null, str2));
                        x6h1VarC3.j = true;
                        x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                        x6h1VarC4.i.add(new a7h1("toast_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                    y690Var2.d.invoke();
                }
                break;
        }
    }

    public Object m(dxy dxyVar) {
        String str = (String) this.b;
        vzh vzhVar = (vzh) this.c;
        try {
            Trace.beginSection(str);
            return vzhVar.f.m(dxyVar);
        } finally {
            Trace.endSection();
        }
    }

    public void onComplete(Task task) {
        ((FirebaseMessagingService) this.b).a((Intent) this.c);
    }

    @Override // p.o7o
    public Object run() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((vk4) obj2).c((URL) obj);
            default:
                l65 l65Var = (l65) obj2;
                l65Var.a.onResponseStarted(l65Var.b, o65.b((UrlResponseInfo) obj));
                return null;
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 21:
                ((r4u) obj3).e(((av30) obj2).apply(obj));
                break;
            case 25:
                qiw qiwVar = (qiw) obj2;
                if (!((AtomicBoolean) obj3).get()) {
                    qiwVar.v(obj);
                }
                break;
            default:
                ((uk4) obj2).v(((av30) obj3).apply(obj));
                break;
        }
    }

    public /* synthetic */ uk4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public n8d0 m712apply(Object obj) {
        iod iodVar = (iod) this.b;
        g280 g280Var = (g280) this.c;
        iodVar.a();
        g280Var.a();
        return iodVar.l();
    }
}
