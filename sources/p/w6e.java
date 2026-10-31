package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w6e implements xpw {
    public final t9p a;
    public final gw70 b;
    public final d0r c;
    public final e7m0 d;
    public final ia00 e;
    public final psw f;

    public w6e(s9p s9pVar, t9p t9pVar, gw70 gw70Var, zeu zeuVar, d0r d0rVar) {
        this.a = t9pVar;
        this.b = gw70Var;
        this.c = d0rVar;
        qka qkaVar = new qka(1, this, w6e.class, "defaultState", "defaultState(Lcom/spotify/videorecommendation/categorizedvideolist/CategorizedVideoListElement$Props;)Lcom/spotify/videorecommendation/categorizedvideolist/CategorizedVideoListElement$State;", 0, (byte) 17);
        n4 n4Var = n4.r;
        g6e g6eVar = new g6e(xqu.a(((u9p) s9pVar.a.c).G), zeuVar);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        e6e e6eVar = new e6e(g6eVar);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(k6e.class), runSequentially.a(e6eVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(l6e.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new c6e(g6eVar)));
        a aVar = new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI);
        u6e u6eVar = u6e.a;
        w6m0 w6m0Var = new w6m0(n4Var, (byte) 0);
        cas casVar = new cas();
        casVar.a = v6e.a;
        this.d = new e7m0(qkaVar, w6m0Var, aVar, u6eVar, casVar);
        this.e = n3o1.q(this).a(emd.X, emd.Y);
        j2i j2iVar = new j2i(-508187616, new gtd(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
