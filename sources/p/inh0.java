package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.AudioStream;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class inh0 implements f961 {
    public final tau0 a;
    public final fnh0 b;
    public final m54 c;
    public final Context d;
    public final vku e;
    public AudioStream f;
    public enh0 g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final jlb t;

    public inh0(Context context, tau0 tau0Var, fnh0 fnh0Var, Observable observable, Flowable flowable, Scheduler scheduler, m54 m54Var) {
        this.a = tau0Var;
        this.b = fnh0Var;
        this.c = m54Var;
        this.d = context.getApplicationContext();
        vku vkuVar = new vku();
        this.e = vkuVar;
        this.f = AudioStream.DEFAULT;
        this.g = enh0.DEFAULT;
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.t = new jlb(this, (byte) 12);
        vkuVar.b(flowable.L(scheduler).subscribe(new dy40(this, (byte) 9)), observable.observeOn(scheduler).subscribe(new rwa0(this, (byte) 26)));
    }

    public final void a(String str) {
        try {
            if (this.h.getAndSet(false)) {
                Logger.b("Unregistering receiver in MediaFocusManagerService (" + str + ")", new Object[0]);
                this.d.unregisterReceiver(this.t);
            }
        } catch (IllegalArgumentException e) {
            n57.g("Error unregistering receiver with tag \"" + str + "\" in MediaFocusManagerService", e);
        }
    }

    public final void shutdown() {
        this.e.c();
        a("Shutting down");
    }

    public final Object getApi() {
        return this;
    }
}
