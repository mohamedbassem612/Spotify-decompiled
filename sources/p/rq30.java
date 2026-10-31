package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rq30 implements xpw {
    public final gqg a;
    public final wh71 b;
    public final oud c;
    public final q8n d;
    public final e7m0 e;
    public final eih1 f;
    public final psw g;

    public rq30(gqg gqgVar, wh71 wh71Var, oud oudVar, q8n q8nVar) {
        this.a = gqgVar;
        this.b = wh71Var;
        this.c = oudVar;
        this.d = q8nVar;
        gq30 gq30Var = gq30.i;
        t2m t2mVar = t2m.v;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(jq30.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new qq30(this)));
        this.e = sbl.A(gq30Var, t2mVar, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), bp30.e, new u830(this, (byte) 9));
        this.f = new eih1();
        j2i j2iVar = new j2i(1400064057, new xyh(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
