package com.spotify.tap.spoton;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import p.a2b1;
import p.a7h1;
import p.av60;
import p.c4m0;
import p.hpq;
import p.i8h1;
import p.i961;
import p.k7h1;
import p.k961;
import p.l7h1;
import p.li4;
import p.m210;
import p.o7h;
import p.o900;
import p.ruz0;
import p.u890;
import p.vqd1;
import p.x6h1;
import p.xjn;
import p.y6h1;
import p.yrg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/tap/spoton/SpotOnService;", "Lp/hpq;", "<init>", "()V", "src_main_java_com_spotify_tap_spoton-spoton"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class SpotOnService extends hpq {
    public i961 a;
    public vqd1 b;
    public Scheduler c;
    public yrg0 d;
    public li4 e;
    public i8h1 f;
    public c4m0 g;
    public av60 h;
    public boolean i;
    public final CompositeDisposable t = new CompositeDisposable();

    public final av60 a() {
        av60 av60Var = this.h;
        if (av60Var != null) {
            return av60Var;
        }
        u890.C("spotOnEventLogger");
        throw null;
    }

    public final vqd1 b() {
        vqd1 vqd1Var = this.b;
        if (vqd1Var != null) {
            return vqd1Var;
        }
        u890.C("tapPlaybackManager");
        throw null;
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDestroy() {
        this.t.dispose();
        this.i = false;
        k961 k961Var = this.a;
        if (k961Var == null) {
            u890.C("serviceForegroundManager");
            throw null;
        }
        k961Var.f(this, "SpotOnService");
        super/*android.app.Service*/.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean zI0;
        k961 k961Var = this.a;
        if (k961Var == null) {
            u890.C("serviceForegroundManager");
            throw null;
        }
        k961Var.e(this, "SpotOnService", Build.VERSION.SDK_INT >= 31 ? 2 : null);
        li4 li4Var = this.e;
        if (li4Var == null) {
            u890.C("remoteConfig");
            throw null;
        }
        if (!li4Var.a()) {
            stopSelf();
            return 2;
        }
        if (this.i) {
            return 2;
        }
        k961 k961Var2 = this.a;
        if (k961Var2 == null) {
            u890.C("serviceForegroundManager");
            throw null;
        }
        k961Var2.g("SpotOnService", getString(2131962874));
        this.i = true;
        String stringExtra = intent.getStringExtra("com.spotify.tap.spoton.extras.CLIENT_ID");
        String stringExtra2 = intent.getStringExtra("com.spotify.tap.spoton.extras.COMMAND_ID");
        if (stringExtra2 == null) {
            stringExtra2 = UUID.randomUUID().toString();
        }
        String str = stringExtra2;
        String stringExtra3 = intent.getStringExtra("com.spotify.tap.spoton.extras.BRAND");
        String stringExtra4 = intent.getStringExtra("com.spotify.tap.spoton.extras.MODEL");
        String stringExtra5 = intent.getStringExtra("com.spotify.tap.spoton.extras.VERSION");
        String stringExtra6 = intent.getStringExtra("com.spotify.tap.spoton.extras.DEVICE_NAME");
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("com.spotify.tap.spoton.extras.PENDING_INTENT");
        av60.b(a(), str, stringExtra, stringExtra3, stringExtra4, stringExtra6, "RECEIVED", (String) null, (String) null, 192);
        yrg0 yrg0Var = this.d;
        if (yrg0Var == null) {
            u890.C("authorizer");
            throw null;
        }
        if (pendingIntent == null) {
            zI0 = false;
        } else {
            zI0 = o7h.i0((HashSet) yrg0Var.b, pendingIntent.getCreatorPackage());
        }
        if (!zI0) {
            av60.b(a(), str, stringExtra, stringExtra3, stringExtra4, stringExtra6, "ERROR", "UNAUTHORIZED", (String) null, 128);
            this.i = false;
            stopSelf();
            return 2;
        }
        if (stringExtra == null) {
            av60.b(a(), str, (String) null, stringExtra3, stringExtra4, stringExtra6, "ERROR", "MISSING_CLIENT_ID", (String) null, 128);
            this.i = false;
            stopSelf();
            return 2;
        }
        c4m0 c4m0Var = this.g;
        if (c4m0Var == null) {
            u890.C("eventFactory");
            throw null;
        }
        x6h1 x6h1VarC = c4m0Var.c.c();
        x6h1VarC.i.add(new a7h1("spoton_service", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).b = c4m0Var.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        l7h1 l7h1VarA = k7h1Var.a();
        i8h1 i8h1Var = this.f;
        if (i8h1Var == null) {
            u890.C("ubiLogger");
            throw null;
        }
        i8h1Var.f(l7h1VarA, (Set) null);
        Single singleTimeout = b().d(new m210(1040, "spotify_one_touch", stringExtra, stringExtra6 == null ? "" : stringExtra6, "bluetooth", "headphones", stringExtra3 == null ? "" : stringExtra3, stringExtra4 == null ? "" : stringExtra4, stringExtra5 == null ? "" : stringExtra5, "spot_on", (String) null)).e(Single.defer(new o900(this, (byte) 3))).timeout(15L, TimeUnit.SECONDS);
        Scheduler scheduler = this.c;
        if (scheduler != null) {
            this.t.b(singleTimeout.observeOn(scheduler).doFinally(new ruz0(this, (byte) 12)).subscribe(new a2b1(this, str, stringExtra, stringExtra3, stringExtra4, stringExtra6, (byte) 0), new a2b1(this, str, stringExtra, stringExtra3, stringExtra4, stringExtra6, (byte) 1)));
            return 2;
        }
        u890.C("mainScheduler");
        throw null;
    }
}
