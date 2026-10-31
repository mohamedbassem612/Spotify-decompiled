package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rze0 extends hab0 implements vu30 {
    public final /* synthetic */ sze0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rze0(sze0 sze0Var) {
        super(2);
        this.a = sze0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        oze0 oze0Var = this.a.b;
        dze0 dze0Var = oze0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        byp bypVar = dze0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        zye0 zye0Var = new zye0(bypVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(vye0.class), runSequentially.a(zye0Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(uye0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new cze0(dze0Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(wye0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new aze0(dze0Var)));
        return Mobius.d(nze0.a, new a(dze0Var.b, coroutinesSubtypeEffectHandlerBuilderI)).h(RxEventSources.a(new ObservableSource[]{new ObservableFromPublisher(oze0Var.b.a).switchMapMaybe(kc20.Y)}));
    }
}
