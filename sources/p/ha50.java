package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ha50 {
    public final ua50 a;

    public ha50(ua50 ua50Var) {
        this.a = ua50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MobiusLoop.Controller a(dg30 dg30Var, Observable observable, String str, String str2) {
        va50 va50Var = new va50(1, str, str2);
        ta50 ta50Var = new ta50();
        ua50 ua50Var = this.a;
        kg0 kg0Var = ua50Var.a;
        wza0 wza0Var = ua50Var.b;
        Scheduler scheduler = ua50Var.c;
        pbk1 pbk1Var = ua50Var.d;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(ja50.class, new z850(wza0Var, (byte) 1));
        subtypeEffectHandlerBuilderC.d(ia50.class, new od30(kg0Var, (byte) 11), scheduler);
        subtypeEffectHandlerBuilderC.d(ka50.class, new lgr(dg30Var, pbk1Var, (byte) 24), scheduler);
        return MobiusAndroid.a(Mobius.d(ta50Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{observable})), va50Var);
    }
}
