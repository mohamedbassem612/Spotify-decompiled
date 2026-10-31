package p;

import android.app.job.JobParameters;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ag20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ag20(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        jqd0 jqd0Var;
        byte b = this.a;
        byte b2 = 10;
        byte b3 = 1;
        byte b4 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((cg20) obj2).j.a((VideoFrameProcessingException) obj);
                return;
            case 1:
                l291 l291Var = (l291) obj;
                ((cg20) obj2).j.c(l291Var.a, l291Var.b);
                return;
            case 2:
                bsd1 bsd1Var = (bsd1) obj;
                try {
                    bsd1Var.b(((FirebaseMessaging) obj2).a());
                    return;
                } catch (Exception e) {
                    bsd1Var.a(e);
                    return;
                }
            case 3:
                od50 od50Var = (od50) obj;
                for (Pair pair : (ArrayList) obj2) {
                    ((id50) pair.first).a((pd50) pair.second);
                }
                Iterator it = od50Var.c.iterator();
                while (it.hasNext()) {
                    ((ke) it.next()).a.run();
                }
                return;
            case 4:
                ((ohd) obj2).C((bs50) obj, rih1.a);
                return;
            case 5:
                mk60 mk60Var = (mk60) obj2;
                dm5.y(mk60Var.k);
                mk60Var.i.remove((String) obj);
                if (mk60Var.m != null) {
                    mk60Var.e(-9223372036854775807L);
                    return;
                }
                return;
            case 6:
                fey feyVar = ((rl60) obj2).c;
                Uri uri = ((qk60) obj).m;
                g1s g1sVar = (g1s) ((sk60) feyVar.b).b.d.get(uri);
                if (g1sVar != null) {
                    g1sVar.e(uri, true);
                    return;
                }
                return;
            case 7:
                vnd vndVar = (vnd) obj;
                ((vnd) obj2).k();
                if (vndVar != null) {
                    vndVar.k();
                    return;
                }
                return;
            case 8:
                bsd1 bsd1Var2 = (bsd1) obj;
                try {
                    bsd1Var2.b(((ms70) obj2).a());
                    return;
                } catch (Exception e2) {
                    bsd1Var2.a(e2);
                    return;
                }
            case 9:
                z8a0 z8a0Var = (z8a0) obj;
                eo41.a("JavaUploadDataSinkBase#executeOnExecutor " + ((String) obj2) + " running callback");
                try {
                    z8a0Var.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            case 10:
                i9a0 i9a0Var = (i9a0) obj2;
                f9a0 f9a0Var = i9a0Var.a;
                String str = i9a0Var.p;
                f9a0Var.getClass();
                f9a0Var.b(new k65(f9a0Var, (v3i1) obj, str, b2), "onRedirectReceived");
                return;
            case 11:
                i9a0 i9a0Var2 = (i9a0) obj2;
                i9a0Var2.c(new z8a0(i9a0Var2, (x8a0) obj, (byte) 2), "read");
                return;
            case 12:
                int i5 = JobInfoSchedulerService.a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 13:
                ((kdn0) ((ye90) obj2).b).k((and0) obj);
                return;
            case 14:
                and0 and0Var = (and0) obj2;
                bnd0 bnd0Var = (bnd0) obj;
                if (and0Var.a.get()) {
                    bnd0Var.getClass();
                    and0Var.b.d(bnd0Var.a);
                    return;
                }
                return;
            case 15:
                m1f0 m1f0Var = (m1f0) obj2;
                Bundle bundle = (Bundle) obj;
                if (dhn.a.contains(m1f0.class)) {
                    return;
                }
                try {
                    m1f0Var.b.p(bundle, "fb_mobile_login_heartbeat");
                    return;
                } catch (Throwable th3) {
                    dhn.a(m1f0.class, th3);
                    return;
                }
            case 16:
                dkh0 dkh0Var = (dkh0) obj2;
                dkh0Var.d1.set(dkh0Var.G((w2z) obj, dkh0Var.X0, 0));
                return;
            case 17:
                rlh0 rlh0Var = (rlh0) obj2;
                wlh0 wlh0Var = (wlh0) obj;
                if (rlh0Var.o) {
                    return;
                }
                wlh0Var.a(rlh0Var);
                return;
            case 18:
                MediaBrowserServiceCompat.Result result = (MediaBrowserServiceCompat.Result) obj;
                try {
                    ch61 ch61Var = (ch61) ((s8d0) obj2).get();
                    dm5.s(ch61Var, "SessionResult must not be null");
                    result.sendResult(ch61Var.b);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e3) {
                    oon1.I("Custom action failed", e3);
                    result.sendError(null);
                    return;
                }
            case 19:
                ArrayList arrayList = (ArrayList) obj;
                if (((em61) obj2).isCancelled()) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        if (arrayList.get(i6) != null) {
                            ((n8d0) arrayList.get(i6)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            case 20:
                ArrayList arrayList2 = (ArrayList) obj;
                tph0 tph0Var = ((rph0) obj2).d;
                iqh0 iqh0Var = tph0Var.d;
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    sph0 sph0Var = (sph0) arrayList2.get(i7);
                    Bundle bundle2 = sph0Var.d;
                    MediaBrowserServiceCompat.Result result2 = sph0Var.e;
                    if (bundle2 != null) {
                        try {
                            bundle2.setClassLoader(iqh0Var.f.getClassLoader());
                            i = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE, -1);
                            i2 = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE, -1);
                        } catch (BadParcelableException unused) {
                            result2.sendResult(null);
                            return;
                        }
                    } else {
                        i = 0;
                        i2 = Integer.MAX_VALUE;
                    }
                    if (i < 0 || i2 < 1) {
                        i3 = 0;
                        i4 = Integer.MAX_VALUE;
                    } else {
                        i3 = i;
                        i4 = i2;
                    }
                    em61 em61VarM0 = zoi1.m0(tph0Var.d.I(sph0Var.a, sph0Var.c, i3, i4, yzb0.d(iqh0Var.f, bundle2)), new nph0(tph0Var, b3));
                    em61VarM0.b(new mph0(em61VarM0, result2, b4), l5u.a);
                    break;
                }
                return;
            case 21:
                iqh0 iqh0Var2 = (iqh0) obj2;
                String str2 = (String) obj;
                bg11 bg11VarF = iqh0Var2.H.a.f();
                while (b4 < bg11VarF.d) {
                    ixh0 ixh0VarJ = (ixh0) bg11VarF.get(b4);
                    if (!iqh0Var2.B || !iqh0Var2.o(ixh0VarJ) || (ixh0VarJ = iqh0Var2.j()) != null) {
                        iqh0Var2.c(ixh0VarJ, new x8a0(iqh0Var2, str2, b2));
                    }
                    b4++;
                }
                return;
            case 22:
                ((uqh0) obj2).y((TrackChangeEvent) obj);
                return;
            case 23:
                ((uqh0) obj2).v((NetworkEvent) obj);
                return;
            case 24:
                ((uqh0) obj2).w((PlaybackErrorEvent) obj);
                return;
            case 25:
                ((uqh0) obj2).m((PlaybackMetrics) obj);
                return;
            case 26:
                ((uqh0) obj2).x((PlaybackStateEvent) obj);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                tvh0 tvh0Var = (tvh0) obj2;
                if (tvh0Var.k.remove((String) obj) == null || (jqd0Var = ((rvh0) ((zvh0) ((mv2) tvh0Var.l).c).d).g) == null) {
                    return;
                }
                zvh0.d(tvh0Var.a, 5, 0, 0, tvh0Var.a(jqd0Var), (Bundle) null);
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((dkl) obj2).accept((ArrayList) obj);
                return;
            default:
                fzh0 fzh0Var = (fzh0) obj2;
                ffu0 ffu0Var = (ffu0) obj;
                e0i0 e0i0Var = fzh0Var.h;
                fzh0Var.t = ffu0Var;
                dzh0 dzh0Var = new dzh0(fzh0Var, ffu0Var);
                ffu0Var.J(dzh0Var);
                fzh0Var.v = dzh0Var;
                try {
                    e0i0Var.f.r(0, ffu0Var);
                    break;
                } catch (RemoteException e4) {
                    oon1.w("Exception in using media1 API", e4);
                }
                e0i0Var.j.setActive(true);
                fzh0Var.s = new jbu0(ffu0Var.L(), 0, ffu0Var.g1(), ffu0Var.f1(), ffu0Var.f1(), 0, ffu0Var.l(), ffu0Var.getRepeatMode(), ffu0Var.V0(), ffu0Var.w0(), ffu0Var.i1(), 0, ffu0Var.Y(18) ? ffu0Var.P0() : tqh0.M, ffu0Var.Y(22) ? ffu0Var.c() : 1.0f, 1.0f, ffu0Var.Y(21) ? ffu0Var.x0() : po7.i, 0, ffu0Var.Y(28) ? ffu0Var.W() : qeo.d, ffu0Var.y0(), ffu0Var.Y(23) ? ffu0Var.j0() : 0, ffu0Var.k1(), ffu0Var.q(), 1, ffu0Var.c0(), ffu0Var.getPlaybackState(), ffu0Var.i(), ffu0Var.b(), ffu0Var.j1(), ffu0Var.d1(), ffu0Var.I0(), ffu0Var.q0(), ffu0Var.Y(30) ? ffu0Var.U() : o3g1.b, ffu0Var.g0());
                fzh0Var.l(ffu0Var.n0());
                return;
        }
    }
}
