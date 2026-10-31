package p;

import android.content.Intent;
import android.os.Build;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.AlarmClockWarmupCachePlaylistNonAuth;
import com.spotify.messages.AlarmClockWarmupSessionAlreadyActiveNonAuth;
import com.spotify.messages.AlarmClockWarmupSessionInitializingNonAuth;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class z43 {
    public final xh61 a;
    public final isc b;
    public final yt91 c;
    public final Scheduler d;
    public final hr0 e;
    public final CompositeDisposable f = new CompositeDisposable();

    public z43(xh61 xh61Var, isc iscVar, yt91 yt91Var, Scheduler scheduler, hr0 hr0Var) {
        this.a = xh61Var;
        this.b = iscVar;
        this.c = yt91Var;
        this.d = scheduler;
        this.e = hr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    public final void a(String str, String str2, nx2 nx2Var) {
        CompletableCreate completableCreateD;
        r43 r43VarN = AlarmClockWarmupCachePlaylistNonAuth.n();
        r43VarN.q(str2);
        if (str != null) {
            r43VarN.n(str);
        }
        this.e.a.a(r43VarN.build());
        if (str != null) {
            Set set = s4b1.f;
            v5b1 v5b1Var = uic.x(str).d;
            if (u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                Logger.b("Caching playlist context for: ".concat(str), new Object[0]);
                completableCreateD = j2h1.D(o6x.a, new hsc(this.b, str, (lnm) null, (byte) 0));
            } else {
                completableCreateD = CompletableEmpty.a;
                completableCreateD.getClass();
            }
        } else {
            completableCreateD = CompletableEmpty.a;
            completableCreateD.getClass();
        }
        this.f.b(completableCreateD.n(this.d).o(Functions.h).subscribe(new bm0(this, nx2Var, (byte) 7)));
    }

    public void b(Intent intent, String str, nx2 nx2Var) {
        String stringExtra = intent.getStringExtra("com.spotify.music.extra.CONTEXT_URI");
        this.f.b(Single.create(new up41(this.a, (byte) 8)).subscribe(new y43(this, str, stringExtra, nx2Var, (byte) 0)));
        d(stringExtra, str, nx2Var);
    }

    public boolean c() {
        return false;
    }

    public final void d(String str, String str2, nx2 nx2Var) {
        if (this.a.b) {
            Logger.b("SpotifyAlarmLauncherService cachePlaylistContext launched from delayed task when sessionStateMonitor.isSessionActive()", new Object[0]);
            t2j0 t2j0Var = this.e.a;
            s43 s43VarN = AlarmClockWarmupSessionAlreadyActiveNonAuth.n();
            s43VarN.n(str2);
            t2j0Var.a(s43VarN.build());
            a(str, str2, nx2Var);
            return;
        }
        Logger.b("SpotifyAlarmLauncherService launching SpotifyService from AlarmWarmupExecutor", new Object[0]);
        yt91 yt91Var = this.c;
        t2j0 t2j0Var2 = ((hr0) yt91Var.d).a;
        t43 t43VarN = AlarmClockWarmupSessionInitializingNonAuth.n();
        t43VarN.n(str2);
        t43VarN.q();
        t2j0Var2.a(t43VarN.build());
        ((oo70) yt91Var.c).a(new pzm0(new jd30(2131430173, ((gid) yt91Var.b).c(), true, Build.VERSION.SDK_INT >= 31 ? 2 : null), "Alarm Warmup", true));
    }
}
