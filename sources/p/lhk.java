package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lhk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bhk a;
    public final /* synthetic */ dg30 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ kt91 d;

    public lhk(bhk bhkVar, dg30 dg30Var, Context context, kt91 kt91Var) {
        this.a = bhkVar;
        this.b = dg30Var;
        this.c = context;
        this.d = kt91Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zfk zfkVar = (zfk) obj;
        fns fnsVar = igu.a;
        Object objY = fn31.Y(pyf0.a, new ur1((byte) 9, this.a, zfkVar, this.b, this.c, this.d, (lnm) null), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
