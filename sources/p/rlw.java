package p;

import com.spotify.checkout.spotifycheckout.events.proto.AddressCollectionView;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rlw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mmw a;

    public rlw(mmw mmwVar) {
        this.a = mmwVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        String str2;
        ecw ecwVar = (ecw) obj;
        b8p1 b8p1Var = this.a.c;
        String str3 = ecwVar.a;
        int i = ecwVar.b;
        t2j0 t2j0Var = (t2j0) b8p1Var.c;
        h12 h12VarN = AddressCollectionView.n();
        h12VarN.n(((UUID) b8p1Var.e).toString());
        int i2 = b8p1Var.b;
        if (i2 == 1) {
            str = "native-debug";
        } else if (i2 == 2) {
            str = "cp-native-checkout";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "native-account-pages";
        }
        h12VarN.r(str);
        h12VarN.s(str3);
        if (i == 1) {
            str2 = "NEW_ADDRESS_VIEW";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "EXISTING_ADDRESS_VIEW";
        }
        h12VarN.q(str2);
        String str4 = (String) b8p1Var.d;
        if (str4 != null) {
            h12VarN.t(str4);
        }
        t2j0Var.a(h12VarN.build());
        return rih1.a;
    }
}
