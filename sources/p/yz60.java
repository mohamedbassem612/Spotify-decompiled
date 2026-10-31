package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yz60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ e070 a;
    public final /* synthetic */ c070 b;

    public yz60(e070 e070Var, c070 c070Var) {
        this.a = e070Var;
        this.b = c070Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ez60 ez60Var = (ez60) obj;
        this.a.a.a.invoke();
        Iterator it = ez60Var.b.iterator();
        while (it.hasNext()) {
            ao0.a(this.b.a, (co0) it.next(), ez60Var.a.a(), (Long) null, (String) null, (String) null, 124);
        }
        return rih1.a;
    }
}
