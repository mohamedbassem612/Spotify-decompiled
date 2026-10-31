package p;

import com.spotify.connectivity.auth.esperanto.proto.EsSession;
import io.reactivex.rxjava3.functions.Function;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oa61 implements Function {
    public static final oa61 a = new oa61();

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object apply(Object obj) throws NoWhenBranchMatchedException {
        EsSession.APPermanentErrorResult aPPermanentErrorResult = (EsSession.APPermanentErrorResult) obj;
        int i = na61.a[aPPermanentErrorResult.n().ordinal()];
        if (i != -1) {
            if (i == 1) {
                return r.a;
            }
            if (i == 2) {
                return r.b;
            }
            if (i == 3) {
                return r.c;
            }
            if (i != 4) {
                eg.o();
                return null;
            }
        }
        EsSession.APPermanentErrorResult.GenericError genericErrorO = aPPermanentErrorResult.o();
        return new s(genericErrorO.o(), genericErrorO.p());
    }
}
