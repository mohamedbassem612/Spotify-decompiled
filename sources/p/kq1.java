package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qr1 a;

    public kq1(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        np1 np1Var = (np1) obj;
        in71 in71Var = this.a.o;
        Set set = np1Var.a;
        String str = np1Var.b;
        in71Var.i = false;
        fn31.T(in71Var.e, (o8n) null, 0, new bn71(in71Var, set, str, null, (byte) 0), 3);
        return rih1.a;
    }
}
