package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class fxa0 implements Update {
    public static final fxa0 a = new fxa0();

    public final Next a(Object obj, Object obj2) {
        hxa0 hxa0Var = (hxa0) obj;
        exa0 exa0Var = (exa0) obj2;
        if (exa0Var instanceof bxa0) {
            return Next.h(hxa0.a(hxa0Var, new ewr0(((bxa0) exa0Var).a), null, 62));
        }
        if (exa0Var instanceof dxa0) {
            return Next.h(hxa0.a(hxa0Var, null, new ewr0(((dxa0) exa0Var).a), 61));
        }
        if (exa0Var instanceof axa0) {
            return Next.a(Collections.singleton(new xwa0(hxa0Var.a, hxa0Var.b, hxa0Var.c, ((axa0) exa0Var).a)));
        }
        if (exa0Var instanceof cxa0) {
            return Next.a(Collections.singleton(new ywa0(((cxa0) exa0Var).a)));
        }
        eg.o();
        return null;
    }
}
