package p;

import android.os.Bundle;
import com.spotify.leavebehindads.events.proto.LeavebehindAdEvent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rxb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ byp a;
    public final /* synthetic */ dg30 b;
    public final /* synthetic */ t700 c;

    public rxb0(byp bypVar, dg30 dg30Var, t700 t700Var) {
        this.a = bypVar;
        this.b = dg30Var;
        this.c = t700Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ujb0 ujb0Var = (ujb0) obj;
        eyb0 eyb0Var = ujb0Var.a;
        ryb0 ryb0VarN = LeavebehindAdEvent.n();
        ryb0VarN.t(kaa0.e(eyb0Var.h.a));
        ryb0VarN.u(1);
        ryb0VarN.n("event_clicked");
        ryb0VarN.q("cta_see_all");
        vxb0 vxb0Var = eyb0Var.a;
        ryb0VarN.v(vxb0Var.a);
        ryb0VarN.r("");
        ji0 ji0Var = (ji0) o7h.s0(vxb0Var.b);
        ryb0VarN.s(ji0Var != null ? ji0Var.t : null);
        ((t2j0) this.a.b).a(ryb0VarN.build());
        eyb0 eyb0Var2 = ujb0Var.a;
        String str = eyb0Var2.a.a;
        d3d1 d3d1Var = eyb0Var2.g;
        t2u t2uVarA = this.c.a();
        Bundle bundleG = cy30.g("entity_uri_argument_key", str);
        bundleG.putSerializable("sponsor_surface_key", d3d1.PODCAST_SCROLL_NPV);
        bundleG.putSerializable("see_all_surface_key", d3d1Var);
        t2uVarA.T0(bundleG);
        th30 th30VarE0 = this.b.e0();
        if (!th30VarE0.U()) {
            t2uVarA.g1(th30VarE0, ((zf30) t2uVarA).a1);
        }
        return rih1.a;
    }
}
