package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ecn implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ tz01 a;

    public ecn(tz01 tz01Var) {
        this.a = tz01Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xbn xbnVar = (xbn) obj;
        ycn ycnVar = (ycn) this.a.b;
        String str = xbnVar.a;
        int i = xbnVar.b;
        hma1 hma1VarEdit = ycnVar.b.b(ycnVar.a, str).edit();
        hma1VarEdit.b(ycn.c, i);
        hma1VarEdit.g();
        return rih1.a;
    }
}
