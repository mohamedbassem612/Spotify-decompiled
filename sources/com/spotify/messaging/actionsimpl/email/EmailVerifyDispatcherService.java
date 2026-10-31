package com.spotify.messaging.actionsimpl.email;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.Metadata;
import p.hpq;
import p.kt91;
import p.l9x0;
import p.m7y0;
import p.u890;
import p.uyw;
import p.vhc;
import p.vyw;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/messaging/actionsimpl/email/EmailVerifyDispatcherService;", "Lp/hpq;", "<init>", "()V", "src_main_java_com_spotify_messaging_actionsimpl-actionsimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class EmailVerifyDispatcherService extends hpq {
    public static final /* synthetic */ int e = 0;
    public m7y0 a;
    public kt91 b;
    public Scheduler c;
    public vhc d;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int onStartCommand(Intent intent, int i, int i2) {
        super/*android.app.Service*/.onStartCommand(intent, i, i2);
        m7y0 m7y0Var = this.a;
        if (m7y0Var == null) {
            u890.C("emailService");
            throw null;
        }
        Observable observable = ((vyw) m7y0Var.b).a().map(l9x0.g).onErrorReturnItem(Boolean.FALSE).toObservable();
        Scheduler scheduler = this.c;
        if (scheduler != null) {
            observable.observeOn(scheduler).subscribe(new uyw(this, i2));
            return 2;
        }
        u890.C("observeScheduler");
        throw null;
    }
}
