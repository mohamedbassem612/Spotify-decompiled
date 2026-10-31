package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yt10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mu10 a;

    public yt10(mu10 mu10Var) {
        this.a = mu10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        lt10 lt10Var = (lt10) obj;
        gw10 gw10Var = this.a.d;
        uv10 uv10Var = lt10Var.a;
        String str = lt10Var.b;
        String str2 = lt10Var.c;
        gw10Var.a.m((Object) null, uv10Var);
        gw10Var.c.m((Object) null, new dw10(uv10Var, str, str2));
        gw10Var.d.m((Object) null, Boolean.valueOf(!u890.j(ihc1.e1(str).toString(), ihc1.e1(str2).toString())));
        return rih1.a;
    }
}
