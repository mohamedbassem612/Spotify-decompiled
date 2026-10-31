package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yl30 implements wl30 {
    public final rzh1 a;
    public final q8n b;
    public final q8n c;
    public final kt91 d;
    public final kp00 e;
    public final cn30 f;
    public final c9c0 g;
    public final vl30 h;

    public yl30(rzh1 rzh1Var, q8n q8nVar, q8n q8nVar2, kt91 kt91Var, kp00 kp00Var, cn30 cn30Var, c9c0 c9c0Var, vl30 vl30Var) {
        this.a = rzh1Var;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.d = kt91Var;
        this.e = kp00Var;
        this.f = cn30Var;
        this.g = c9c0Var;
        this.h = vl30Var;
    }

    public final MobiusLoop.Builder a() {
        xl30 xl30Var = new xl30();
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        pl30 pl30Var = new pl30(this.d, this.h);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(ol30.class), runSequentially.a(pl30Var));
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially2 = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        kp00 kp00Var = this.e;
        cn30 cn30Var = this.f;
        c9c0 c9c0Var = this.g;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nl30.class), runSequentially2.a(new ql30(kp00Var, cn30Var, c9c0Var)));
        MobiusLoop.Builder builderD = Mobius.d(xl30Var, new a(this.c, coroutinesSubtypeEffectHandlerBuilderI));
        FlowEventSources.Companion companion = FlowEventSources.a;
        rzh1 rzh1Var = this.a;
        mr20[] mr20VarArr = {new tf2(rzh1Var.a.a("social-connect/v2/upsell_messages", new hcf1(1, rzh1Var, rzh1.class, "parseUpsellMessage", "parseUpsellMessage(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/models/UpsellMessage;", 0, (byte) 15)), (byte) 28)};
        companion.getClass();
        q8n q8nVar = this.b;
        return l1d.g(builderD.h(new b(q8nVar, new mr20[]{FlowEventSources.Companion.a(new b(q8nVar, mr20VarArr)), FlowEventSources.Companion.a(new b(q8nVar, new mr20[]{new huz(new ry50(rqt0.u(new ry50(c9c0Var.b.current(), (byte) 15)), (byte) 14), (byte) 17)}))})));
    }
}
