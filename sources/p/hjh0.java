package p;

import android.os.SystemClock;
import android.view.InputDevice;
import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hjh0 implements f961, djh0 {
    public volatile PlayerState X;
    public final uqk0 Y;
    public final h89 a;
    public final Scheduler b;
    public final tjb c;
    public final g510 d;
    public final i8h1 e;
    public final uwt0 f;
    public final FlowableMap g;
    public Disposable h = EmptyDisposable.a;
    public final CompositeDisposable i;
    public long t;

    public hjh0(h89 h89Var, Flowable flowable, Scheduler scheduler, tau0 tau0Var, tjb tjbVar, g510 g510Var, i8h1 i8h1Var) {
        this.a = h89Var;
        this.b = scheduler;
        this.c = tjbVar;
        this.d = g510Var;
        this.e = i8h1Var;
        this.f = new uwt0(new ojv(tau0Var, (byte) 3));
        this.g = flowable.J(vf61.Y0);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.i = compositeDisposable;
        this.Y = new uqk0();
        compositeDisposable.b(flowable.subscribe(new dy40(this, (byte) 8), zzc0.i));
    }

    public final void a(iu30 iu30Var, cjh0 cjh0Var) {
        FlowableMap flowableMap = this.g;
        flowableMap.getClass();
        this.i.b(new FlowableTake(flowableMap).L(this.b).C(new ze3(iu30Var, (byte) 1), false, Integer.MAX_VALUE).subscribe(new rwa0(cjh0Var, (byte) 25)));
    }

    public final void b(Function0 function0, cjh0 cjh0Var) {
        this.i.b(((Single) function0.invoke()).subscribe((Consumer) new rwa0(cjh0Var, (byte) 25)));
    }

    public final LoggingParams c(m210 m210Var, boolean z, PlayerState playerState) {
        String strO = playerState != null ? o4p1.o(playerState) : null;
        if (strO == null) {
            strO = "";
        }
        uqk0 uqk0Var = this.Y;
        w7h1 w7h1VarT = z ? uqk0Var.t(strO) : uqk0Var.l(strO);
        try {
            tv80 tv80VarM = this.e.m(w7h1VarT, null);
            try {
                this.d.b(m210Var, w7h1VarT, tv80VarM.a);
            } catch (Exception e) {
                Logger.e(e, "Could not log media-button accessory metadata", new Object[0]);
            }
            return LoggingParams.builder().interactionId(tv80VarM.a.a).build();
        } catch (Exception e2) {
            Logger.e(e2, "Could not log media-button interaction", new Object[0]);
            return LoggingParams.EMPTY;
        }
    }

    public final void d(KeyEvent keyEvent, cjh0 cjh0Var) {
        int keyCode = keyEvent.getKeyCode();
        tjb tjbVar = this.c;
        if (keyCode != 85 && keyCode != 86 && keyCode != 126 && keyCode != 127) {
            tjbVar.getClass();
            InputDevice device = keyEvent.getDevice();
            q59 q59Var = tjbVar.c;
            if (q59Var != null) {
                boolean z = device != null && "AVRCP".equals(device.getName());
                boolean zK = q59Var.l().K();
                if (z && zK) {
                    tjbVar.b.a(q59Var.l().A(keyEvent).subscribe());
                }
            }
        }
        Logger.b("Media button keycode %d", new Object[]{Integer.valueOf(keyEvent.getKeyCode())});
        q59 q59Var2 = tjbVar.c;
        m210 m210VarL = null;
        if (q59Var2 != null) {
            InputDevice device2 = keyEvent.getDevice();
            if (u890.j(device2 != null ? device2.getName() : null, "AVRCP")) {
                m210VarL = sjb.l(q59Var2.j());
            }
        }
        if (m210VarL == null) {
            m210VarL = ijh0.a;
        }
        int keyCode2 = keyEvent.getKeyCode();
        if (keyCode2 == 79) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.t;
            CompositeDisposable compositeDisposable = this.i;
            if (jElapsedRealtime < 600) {
                b(new ejh0(this, (byte) 2), cjh0Var);
                if (!this.h.isDisposed()) {
                    this.h.dispose();
                }
                h89 h89Var = this.a;
                compositeDisposable.b(h89Var.a.n(h89Var.b).ignoreElement().subscribe());
            } else {
                a(new fjh0(this, (byte) 4), cjh0Var);
                FlowableMap flowableMap = this.g;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Scheduler scheduler = this.b;
                Completable completableFlatMapCompletable = new FlowableSingleSingle(new FlowableTake(flowableMap.S(600L, timeUnit, scheduler).x(si10.O0).J(xi10.O0))).observeOn(scheduler).flatMapCompletable(new zc80(this, (byte) 22));
                completableFlatMapCompletable.getClass();
                Disposable disposableSubscribe = completableFlatMapCompletable.o(Functions.h).subscribe();
                this.h = disposableSubscribe;
                compositeDisposable.b(disposableSubscribe);
            }
            this.t = SystemClock.elapsedRealtime();
            return;
        }
        if (keyCode2 == 126) {
            b(new gjh0(this, m210VarL, (byte) 0), cjh0Var);
            return;
        }
        if (keyCode2 != 127) {
            switch (keyCode2) {
                case 85:
                    a(new uah0(this, m210VarL, (byte) 2), cjh0Var);
                    break;
                case 86:
                    break;
                case 87:
                    a(new fjh0(this, (byte) 2), cjh0Var);
                    break;
                case 88:
                    a(new fjh0(this, (byte) 3), cjh0Var);
                    break;
                default:
                    switch (keyCode2) {
                        case 272:
                            b(new ejh0(this, (byte) 1), cjh0Var);
                            break;
                        case 273:
                            b(new ejh0(this, (byte) 0), cjh0Var);
                            break;
                        case 274:
                            a(new fjh0(this, (byte) 1), cjh0Var);
                            break;
                        case 275:
                            a(new fjh0(this, (byte) 0), cjh0Var);
                            break;
                    }
                    break;
            }
            return;
        }
        b(new gjh0(this, m210VarL, (byte) 1), cjh0Var);
    }

    @Override // p.dwo
    public final void shutdown() {
        this.i.dispose();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
