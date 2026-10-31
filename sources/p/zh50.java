package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class zh50 implements Init {
    public static final zh50 a = new zh50();

    public final First e0(Object obj) {
        yh50 yh50Var = (yh50) obj;
        int iOrdinal = yh50Var.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                return First.c(yh50Var, Collections.singleton(y4b.g));
            }
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    String str = yh50Var.g;
                    if (str != null) {
                        return First.c(yh50Var, Collections.singleton(new c5b(str)));
                    }
                    hhg1.n("Required value was null.");
                    return null;
                }
                if (iOrdinal != 5) {
                    eg.o();
                    return null;
                }
            }
        }
        return First.b(yh50Var);
    }
}
