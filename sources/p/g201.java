package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class g201 implements Init {
    public static final g201 a = new g201();

    public final First e0(Object obj) {
        l201 l201Var = (l201) obj;
        return l201Var.a instanceof qbe0 ? First.c(l201Var, Collections.singleton(new g101(null))) : First.b(l201Var);
    }
}
