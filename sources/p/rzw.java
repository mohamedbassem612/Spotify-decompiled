package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rzw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wen0 a;
    public final /* synthetic */ z1x b;
    public final /* synthetic */ sen0 c;
    public final /* synthetic */ d1x d;

    public rzw(wen0 wen0Var, z1x z1xVar, sen0 sen0Var, d1x d1xVar) {
        this.a = wen0Var;
        this.b = z1xVar;
        this.c = sen0Var;
        this.d = d1xVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ji0 ji0Var;
        tn0 tn0Var = (tn0) obj;
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1Var = this.a;
        bpb1Var.getClass();
        String str = null;
        bpb1Var.m((Object) null, bool);
        z1x z1xVar = this.b;
        q1x q1xVar = z1xVar.f181p;
        if (q1xVar != null && (ji0Var = q1xVar.a.a) != null) {
            str = ji0Var.a;
        }
        if (str == null ? false : str.equals(tn0Var.a.a)) {
            q1x q1xVar2 = z1xVar.f181p;
            if (q1xVar2 != null) {
                q1xVar2.b = true;
            }
            this.c.a(iwo0.a);
            d1x.b(this.d, 7, tn0Var.a, (Map) null, (String) null, 12);
        }
        return rih1.a;
    }
}
