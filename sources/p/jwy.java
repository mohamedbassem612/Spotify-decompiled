package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jwy implements mqw {
    public static final sjb b = new sjb((byte) 9);
    public final /* synthetic */ e7m0 a;

    public jwy(q8n q8nVar, oey oeyVar, cxy cxyVar, eb80 eb80Var, o4t o4tVar, ekb ekbVar, bhf bhfVar, lhc lhcVar, t8r0 t8r0Var, wh71 wh71Var, oud oudVar, ol71 ol71Var) {
        auy auyVar = auy.Y0;
        drm1 drm1Var = new drm1(ekbVar, lhcVar);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        iwy iwyVar = new iwy(lhcVar, oudVar, o4tVar, ol71Var, oeyVar, t8r0Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bwy.class), runSequentially.a(iwyVar));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cwy.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gwy(eb80Var, wh71Var, cxyVar, bhfVar)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dwy.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new ewy(oudVar)));
        this.a = sbl.A(auyVar, drm1Var, new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI), new htu((byte) 12, 2, false), new lhx(oudVar, q8nVar, lhcVar, wh71Var, (byte) 3));
    }

    public final lqw a(Object obj, ipb1 ipb1Var) {
        return this.a.a((twy) obj, ipb1Var);
    }

    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b((ywy) obj, dtsVar, str);
    }

    public final mc41 c() {
        return this.a.c();
    }

    public final Object d(Object obj) {
        return (ywy) this.a.a.invoke((twy) obj);
    }
}
