package p;

import android.content.Context;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aa01 implements o4h1 {
    public final s59 a;
    public final MobiusLoop.Controller b;

    public aa01(s59 s59Var, Context context, fl21 fl21Var, ea01 ea01Var) {
        this.a = s59Var;
        fa01 fa01Var = new fa01(fl21Var.a, p7h.M(new gl21[]{new gl21("INACCURATE_TRANSCRIPT", context.getString(2131963342)), new gl21("WRONG_TRANSCRIPT", context.getString(2131963343)), new gl21("INCORRECT_SYNC", context.getString(2131963341)), new gl21("COPYRIGHT", context.getString(2131963340))}), fl21Var.b);
        ca01 ca01Var = new ca01();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        lyw0 lyw0Var = new lyw0(ea01Var, ea01Var.a, (byte) 14);
        Scheduler scheduler = ea01Var.e;
        subtypeEffectHandlerBuilderC.d(r901.class, lyw0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(t901.class, new da01(ea01Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.c(s901.class, new da01(ea01Var, (byte) 0));
        MobiusLoop.Builder builderD = Mobius.d(ca01Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        tk21 tk21Var = ea01Var.c;
        tk21Var.getClass();
        this.b = MobiusAndroid.a(builderD.c(RxEventSources.a(new ObservableSource[]{Observable.defer(new yj1(tk21Var, (byte) 25)).observeOn(tk21Var.a).map(e4x0.e)}), new EventSource[0]), fa01Var);
    }

    public final void start() {
        s59 s59Var = this.a;
        MobiusLoop.Controller controller = this.b;
        controller.c(s59Var);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.b;
        controller.stop();
        controller.disconnect();
    }
}
