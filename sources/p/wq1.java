package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qeh1 a;

    public wq1(qeh1 qeh1Var) {
        this.a = qeh1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        yp1 yp1Var = (yp1) obj;
        String str = yp1Var.a;
        so1 so1Var = (so1) ((brh1) this.a.b).invoke(yp1Var.b);
        if (so1Var != null) {
            bpb1 bpb1Var = so1Var.Y0;
            if (!u890.j((String) bpb1Var.getValue(), str)) {
                so1Var.O0.d((String) bpb1Var.getValue(), str);
                bpb1Var.l(str);
            }
        }
        return rih1.a;
    }
}
