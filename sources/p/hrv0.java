package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final /* synthetic */ class hrv0 implements Update {
    public final Next a(Object obj, Object obj2) {
        erv0 erv0Var = (erv0) obj2;
        if (!(erv0Var instanceof brv0)) {
            if (erv0Var instanceof crv0) {
                return Next.h(new grv0(mrv0.a));
            }
            if (erv0Var instanceof drv0) {
                return Next.i(new grv0(orv0.a), Collections.singleton(nqv0.a));
            }
            if (erv0Var instanceof yqv0) {
                return Next.a(Collections.singleton(new pqv0(((yqv0) erv0Var).a)));
            }
            eg.o();
            return null;
        }
        brv0 brv0Var = (brv0) erv0Var;
        boolean z = brv0Var instanceof arv0;
        oqv0 oqv0Var = oqv0.a;
        if (z) {
            return Next.a(f46.S0(new tqv0[]{new rqv0(((arv0) brv0Var).a), oqv0Var}));
        }
        if (brv0Var instanceof zqv0) {
            return Next.i(new grv0(nrv0.a), f46.S0(new tqv0[]{new qqv0(((zqv0) brv0Var).a), oqv0Var}));
        }
        eg.o();
        return null;
    }
}
