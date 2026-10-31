package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mye0 extends hab0 implements vu30 {
    public final /* synthetic */ nye0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mye0(nye0 nye0Var) {
        super(2);
        this.a = nye0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        kye0 kye0Var = this.a.f;
        aye0 aye0Var = kye0Var.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(yxe0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zxe0(aye0Var)));
        MobiusLoop.Builder builderD = Mobius.d(jye0.a, new a(aye0Var.b, coroutinesSubtypeEffectHandlerBuilderI));
        hye0 hye0Var = kye0Var.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        mr20[] mr20VarArr = {new s1g(new fu20(hye0Var.a, new iyb0(hye0Var, null, (byte) 8), (byte) 1), (byte) 6)};
        companion.getClass();
        return builderD.h(new b(bs50Var, mr20VarArr));
    }
}
