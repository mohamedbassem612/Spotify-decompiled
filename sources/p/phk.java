package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class phk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dg30 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ kt91 c;

    public phk(dg30 dg30Var, Context context, kt91 kt91Var) {
        this.a = dg30Var;
        this.b = context;
        this.c = kt91Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tfk tfkVar = (tfk) obj;
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new sr1(this.a, tfkVar, this.b, this.c, (lnm) null, (byte) 4), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
