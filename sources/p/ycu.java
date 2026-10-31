package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ycu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cdu a;

    public ycu(cdu cduVar) {
        this.a = cduVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        scu scuVar = (scu) obj;
        try {
            ((ak9) this.a.a.b).a.accept(new tj9(scuVar.a, jne.a, scuVar.b.getBytes(nne.a)));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        return rih1.a;
    }
}
