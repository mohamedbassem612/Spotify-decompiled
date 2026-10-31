package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ttr0 implements Update {
    public static final ttr0 a = new ttr0();

    public final Next a(Object obj, Object obj2) {
        j100 j100Var = (c600) obj2;
        if (j100Var instanceof x000) {
            return Next.a(Collections.singleton(new vcw(((x000) j100Var).a)));
        }
        if (j100Var.equals(x100.a)) {
            return Next.a(Collections.singleton(w9w.f));
        }
        if (j100Var instanceof j100) {
            return Next.a(Collections.singleton(new qdw(j100Var.a)));
        }
        eg.o();
        return null;
    }
}
