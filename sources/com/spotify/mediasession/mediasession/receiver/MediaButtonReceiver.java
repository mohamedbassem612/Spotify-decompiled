package com.spotify.mediasession.mediasession.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import p.f15;
import p.gd30;
import p.gv20;
import p.j1e1;
import p.jjh0;
import p.nnw;
import p.oo70;
import p.qzm0;
import p.w43;
import p.yqu0;
import p.zce0;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class MediaButtonReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int h = 0;
    public zn41 a;
    public zce0 b;
    public yqu0 c;
    public Scheduler d;
    public Scheduler e;
    public f15 f;
    public oo70 g;

    public final void a(int i, KeyEvent keyEvent) {
        if (i != 126 && i != 85 && i != 79) {
            zce0 zce0Var = this.b;
            Intent intent = new Intent("PausingMediaEventsLifecycleDecoupler.optionalaction.pause");
            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
            zce0Var.c(intent);
            return;
        }
        Logger.b("onReceive %d %d", new Object[]{Integer.valueOf(keyEvent.getAction()), Integer.valueOf(keyEvent.getKeyCode())});
        this.g.a(new qzm0(new gd30(new Intent()), "Media Button", true));
        this.a.c("Media Button Background Start", new gv20(keyEvent, (byte) 23));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.b("onReceive %s", new Object[]{intent.toUri(0)});
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getRepeatCount() <= 0 || keyCode == 85 || keyCode == 79) {
            if (this.a == null || this.b == null) {
                j1e1.s(this, context);
            }
            this.f.getClass();
            if (f15.a(context)) {
                a(keyCode, keyEvent);
            } else {
                Single.defer(new nnw(this, (byte) 1)).subscribeOn(this.d).observeOn(this.e).doOnSuccess(new jjh0(this, keyEvent, keyCode)).doFinally(new w43(goAsync(), (byte) 8)).subscribe();
            }
        }
    }
}
