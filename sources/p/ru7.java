package p;

import com.spotify.playbacknative.AudioRenderer;
import com.spotify.playbacknative.AudioTrackAdapter;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ru7 implements dwo {
    public final pu7 N0;
    public final ou7 O0;
    public final vku P0;
    public volatile Disposable Q0;
    public final ConcurrentLinkedQueue R0;
    public volatile boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public final m54 X;
    public boolean X0;
    public final mw7 Y;
    public final AtomicReference Y0;
    public final v6a0 Z;
    public final fnh0 a;
    public final inh0 b;
    public final v5u0 c;
    public final x6o0 d;
    public final ynb0 e;
    public final ynb0 f;
    public final Flowable g;
    public final Scheduler h;
    public final Set i;
    public final sf0 t;

    public ru7(fnh0 fnh0Var, inh0 inh0Var, v5u0 v5u0Var, x6o0 x6o0Var, ynb0 ynb0Var, ynb0 ynb0Var2, Flowable flowable, Scheduler scheduler, Set set, Observable observable, sf0 sf0Var, m54 m54Var, mw7 mw7Var, v6a0 v6a0Var) {
        this.a = fnh0Var;
        this.b = inh0Var;
        this.c = v5u0Var;
        this.d = x6o0Var;
        this.e = ynb0Var;
        this.f = ynb0Var2;
        this.g = flowable;
        this.h = scheduler;
        this.i = set;
        this.t = sf0Var;
        this.X = m54Var;
        this.Y = mw7Var;
        this.Z = v6a0Var;
        pu7 pu7Var = new pu7(this);
        this.N0 = pu7Var;
        ou7 ou7Var = new ou7(this, (byte) 0);
        this.O0 = ou7Var;
        vku vkuVar = new vku();
        this.P0 = vkuVar;
        this.R0 = new ConcurrentLinkedQueue();
        this.Y0 = new AtomicReference(null);
        vkuVar.a(observable.observeOn(scheduler).filter(fkj0.f).subscribe(new xu(this, (byte) 3)));
        fnh0Var.e.add(pu7Var);
        AudioRenderer.Companion.addListener(ou7Var);
        vkuVar.a(flowable.L(scheduler).subscribe(new ku7(this, (byte) 0)));
    }

    public final boolean a() {
        for (qt7 qt7Var : ((uw7) this.Y).c()) {
            if (qt7Var.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    public final void b() {
        AudioTrackAdapter audioTrackAdapter;
        if (this.S0) {
            return;
        }
        boolean z = false;
        if (!this.c.b || !this.d.n()) {
            this.T0 = false;
            return;
        }
        this.V0 = a();
        if (this.X.e() || this.b.f != AudioStream.ALARM) {
            if (!this.a.d || ((audioTrackAdapter = (AudioTrackAdapter) this.Y0.get()) != null && audioTrackAdapter.getPlayState() == AudioTrackAdapter.Companion.getPLAYSTATE_PLAYING())) {
                z = true;
            } else {
                if (this.a.d ? !this.t.a.isEmpty() : true) {
                    z = true;
                }
            }
        }
        this.T0 = z;
        d9u0 d9u0VarC = q9u0.c("audiofocusplugin", true);
        if (!this.S0) {
            d(((w9u0) this.f.get()).a(d9u0VarC), null);
        }
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((dxg1) it.next()).c = this.U0;
        }
    }

    public final void c() {
        if (this.T0 && this.U0) {
            inh0 inh0Var = this.b;
            if (!this.V0 || a()) {
                inh0Var.i.set(true);
                if (inh0Var.f == AudioStream.ALARM) {
                    d(this.g.y(PlayerState.EMPTY).flatMap(new qu7(this)).flatMap(qbo1.g), inh0Var);
                } else {
                    g9u0 g9u0VarE = q9u0.e("audiofocusplugin", true);
                    if (!this.S0) {
                        d(((w9u0) this.f.get()).a(g9u0VarE), inh0Var);
                    }
                }
            } else {
                this.T0 = false;
            }
        }
        this.T0 = false;
        for (dxg1 dxg1Var : this.i) {
            SingleEmitter singleEmitter = dxg1Var.b;
            if (singleEmitter != null && dxg1Var.c) {
                singleEmitter.onSuccess(Boolean.TRUE);
            }
            dxg1Var.c = false;
        }
    }

    public final void d(Single single, inh0 inh0Var) {
        boolean zG = this.X.g();
        Single singleObserveOn = single.observeOn(this.h);
        if (zG) {
            singleObserveOn = singleObserveOn.doFinally(new bm0(inh0Var, this, (byte) 11));
        }
        singleObserveOn.getClass();
        Disposable disposableSubscribe = singleObserveOn.subscribe(nm.Q0, new ku7(this, (byte) 1));
        if (zG) {
            this.Q0 = disposableSubscribe;
        } else {
            this.P0.a(disposableSubscribe);
        }
        if (this.S0) {
            disposableSubscribe.dispose();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void e() throws NoWhenBranchMatchedException {
        mu7 mu7Var;
        while (!this.S0) {
            Disposable disposable = this.Q0;
            if ((disposable != null && !disposable.isDisposed()) || (mu7Var = (nu7) this.R0.poll()) == null) {
                return;
            }
            if (mu7Var instanceof lu7) {
                c();
            } else {
                if (!(mu7Var instanceof mu7)) {
                    eg.o();
                    return;
                }
                mu7 mu7Var2 = mu7Var;
                this.U0 = mu7Var2.b();
                if (!mu7Var2.b() || !mu7Var2.a()) {
                    b();
                }
            }
        }
    }

    public final void shutdown() {
        this.S0 = true;
        this.R0.clear();
        AudioRenderer.Companion.removeListener(this.O0);
        fnh0 fnh0Var = this.a;
        fnh0Var.e.remove(this.N0);
        this.P0.c();
        Disposable disposable = this.Q0;
        if (disposable != null) {
            disposable.dispose();
        }
        this.Q0 = null;
        this.Z.w();
    }
}
