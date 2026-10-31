package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ifh {
    public final cwe1 a;
    public final fwp b;
    public final hfh c;
    public final fna d;

    public ifh(cwe1 cwe1Var, fwp fwpVar, hfh hfhVar, fna fnaVar) {
        this.a = cwe1Var;
        this.b = fwpVar;
        this.c = hfhVar;
        this.d = fnaVar;
    }

    public final kfh a(boolean z, muz muzVar, i8h1 i8h1Var) {
        tjh tjhVar = (tjh) this.d.b;
        EventSource eventSourceA = RxEventSources.a(new ObservableSource[]{tjhVar.j.delay(500L, TimeUnit.MILLISECONDS).subscribeOn(tjhVar.a).map(qzs0.R0)});
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        hfh hfhVar = this.c;
        subtypeEffectHandlerBuilderC.g(lfh.class, new gfh(hfhVar, (byte) 0));
        subtypeEffectHandlerBuilderC.g(mfh.class, new gfh(hfhVar, (byte) 1));
        return new kfh(z, this.a, muzVar, i8h1Var, eventSourceA, subtypeEffectHandlerBuilderC.h(), this.b);
    }
}
