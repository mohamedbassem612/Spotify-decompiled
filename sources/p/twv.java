package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class twv extends hab0 implements vu30 {
    public final /* synthetic */ uwv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twv(uwv uwvVar) {
        super(2);
        this.a = uwvVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        pwv pwvVar = this.a.e;
        v9c v9cVar = pwvVar.c;
        mwv mwvVar = new mwv();
        vvv vvvVar = pwvVar.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(tvv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new uvv(vvvVar.a)));
        MobiusLoop.Builder builderD = Mobius.d(mwvVar, new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
        gwv gwvVar = pwvVar.b;
        FlowEventSources.Companion companion = FlowEventSources.a;
        q8n q8nVar = gwvVar.c;
        mr20[] mr20VarArr = {new x3s(gwvVar.a.b, (byte) 17), new x3s(rqt0.u(new dwv(gwvVar.b.a, (byte) 0)), (byte) 18)};
        companion.getClass();
        return l1d.g(builderD.h(new b(q8nVar, mr20VarArr))).b(new nwv(pwvVar)).d(new owv(pwvVar));
    }
}
