package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ety0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ fty0 a;

    public ety0(fty0 fty0Var) {
        this.a = fty0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        l0x0 l0x0Var = this.a.a;
        Object objY = fn31.Y((q8n) l0x0Var.d, new cqu0(l0x0Var, pzm.g("puffin_setup_flow_should_resume_music_when_exiting_flow", ((usy0) obj).b), (lnm) null, (byte) 28), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
