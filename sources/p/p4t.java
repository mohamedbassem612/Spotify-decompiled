package p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p4t extends z43 {
    public final yqg g;
    public final hp91 h;
    public boolean i;

    public p4t(xh61 xh61Var, isc iscVar, yt91 yt91Var, Scheduler scheduler, yqg yqgVar, hp91 hp91Var, hr0 hr0Var) {
        super(xh61Var, iscVar, yt91Var, scheduler, hr0Var);
        this.g = yqgVar;
        this.h = hp91Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:29:0x0122  */
    @Override // p.z43
    public final void b(Intent intent, String str, nx2 nx2Var) {
        String stringExtra;
        CompositeDisposable compositeDisposable;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        extras.getClass();
        Logger.g("Spotify alarm scheduled for context: %s", new Object[]{extras.getString("com.spotify.music.extra.CONTEXT_URI")});
        long jLongValue = -1;
        long j = extras.getLong("com.spotify.music.EXTRA_START_TIME", -1L);
        Long l = null;
        String str2 = j > 0 ? new SimpleDateFormat("HH:mm", Locale.US).format(new Date(j)) : null;
        boolean z = extras.getBoolean("com.spotify.music.EXTRA_START_TIME_IS_RANDOM");
        if (str2 != null) {
            Logger.g("Spotify alarm scheduled for %s", new Object[]{str2});
            long j2 = extras.getLong("com.spotify.music.EXTRA_START_TIME");
            if (z) {
                jLongValue = j2;
            } else {
                hp91 hp91Var = this.h;
                long jB = ((yqg) hp91Var.b).b();
                if (jB < j2) {
                    long j3 = j2 - jB;
                    vu30 vu30Var = (vu30) hp91Var.c;
                    l = j3 > 600000 ? (Long) vu30Var.invoke(Long.valueOf(j2 - 600000), Long.valueOf(j2)) : (Long) vu30Var.invoke(Long.valueOf(jB), Long.valueOf(j2));
                }
                if (l != null) {
                    jLongValue = l.longValue();
                }
            }
            stringExtra = intent.getStringExtra("com.spotify.music.extra.CONTEXT_URI");
            compositeDisposable = this.f;
            if (jLongValue > 0) {
                Logger.b("SpotifyAlarmLauncherService stopping from DelayedAlarmWarmupExecutor", new Object[0]);
                Logger.b("Stopping SpotifyAlarmLauncherService", new Object[0]);
                compositeDisposable.g();
                nx2Var.invoke();
                return;
            }
            this.i = true;
            long jB2 = jLongValue - this.g.b();
            Logger.b("Scheduling alarm optimizations launch in %d seconds (%s)", new Object[]{Long.valueOf(jB2 / 1000), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(jLongValue))});
            new Handler(Looper.getMainLooper()).postDelayed(new hw9(this, stringExtra, str, nx2Var, (byte) 7), jB2);
            compositeDisposable.b(Single.create(new up41(this.a, (byte) 8)).subscribe(new y43(this, str, stringExtra, nx2Var, (byte) 0)));
        }
        Logger.k("Timestamp not valid: %d", new Object[]{Long.valueOf(extras.getLong("com.spotify.music.EXTRA_START_TIME"))});
        stringExtra = intent.getStringExtra("com.spotify.music.extra.CONTEXT_URI");
        compositeDisposable = this.f;
        if (jLongValue > 0) {
            Logger.b("SpotifyAlarmLauncherService stopping from DelayedAlarmWarmupExecutor", new Object[0]);
            Logger.b("Stopping SpotifyAlarmLauncherService", new Object[0]);
            compositeDisposable.g();
            nx2Var.invoke();
            return;
        }
        this.i = true;
        long jB3 = jLongValue - this.g.b();
        Logger.b("Scheduling alarm optimizations launch in %d seconds (%s)", new Object[]{Long.valueOf(jB3 / 1000), new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date(jLongValue))});
        new Handler(Looper.getMainLooper()).postDelayed(new hw9(this, stringExtra, str, nx2Var, (byte) 7), jB3);
        compositeDisposable.b(Single.create(new up41(this.a, (byte) 8)).subscribe(new y43(this, str, stringExtra, nx2Var, (byte) 0)));
    }

    @Override // p.z43
    public final boolean c() {
        return this.i;
    }
}
