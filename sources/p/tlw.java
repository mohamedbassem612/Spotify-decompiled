package p;

import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionSuccess;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tlw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mmw a;

    public tlw(mmw mmwVar) {
        this.a = mmwVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        b8p1 b8p1Var = this.a.c;
        boolean z = ((mcw) obj).a;
        t2j0 t2j0Var = (t2j0) b8p1Var.c;
        g12 g12VarN = AddressCollectionSuccess.n();
        g12VarN.n(((UUID) b8p1Var.e).toString());
        g12VarN.q(z);
        t2j0Var.a(g12VarN.build());
        return rih1.a;
    }
}
