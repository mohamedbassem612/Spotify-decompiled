package p;

import android.net.nsd.NsdServiceInfo;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kap0 implements jap0 {
    public final /* synthetic */ byte a = 1;
    public final Set b;

    public kap0(q8n q8nVar) {
        smo1.e(flo1.l(op71.f(), q8nVar));
        this.b = new LinkedHashSet();
    }

    @Override // p.jap0
    public final Maybe b(NsdServiceInfo nsdServiceInfo) {
        byte b = this.a;
        Set set = this.b;
        switch (b) {
            case 0:
                return Observable.fromIterable(o7h.a1(set, new ktg0((byte) 6))).reduce(Maybe.e(nsdServiceInfo), kc20.S0).flatMapMaybe(ud20.S0);
            default:
                z7u z7uVarB = r110.b(nsdServiceInfo);
                if (z7uVarB != null) {
                    return ((LinkedHashSet) set).contains(z7uVarB.a) ? MaybeEmpty.a : Maybe.e(nsdServiceInfo);
                }
                return Maybe.e(nsdServiceInfo);
        }
    }

    public kap0(t380 t380Var) {
        this.b = t380Var;
    }
}
