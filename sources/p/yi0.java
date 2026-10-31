package p;

import com.spotify.adsinternal.v1.CarouselItem;
import com.spotify.adsinternal.v1.ClientPayload;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yi0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ao0 a;

    public yi0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        co0 co0Var;
        nny0 nny0Var = (nny0) obj;
        int iC = l1d.C(nny0Var.d);
        if (iC == 0) {
            co0Var = co0.N0;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            co0Var = co0.O0;
        }
        co0 co0Var2 = co0Var;
        String str = nny0Var.a;
        String str2 = nny0Var.b;
        int i = nny0Var.c;
        wkg wkgVarN = ClientPayload.n();
        fzd fzdVarN = CarouselItem.n();
        fzdVarN.n(str2);
        fzdVarN.q(i + 1);
        wkgVarN.n(fzdVarN.build());
        ao0.c(this.a, co0Var2, str, (Long) null, str2, (String) null, wkgVarN.build().toByteString().v(), (String) null, 84);
        return rih1.a;
    }
}
