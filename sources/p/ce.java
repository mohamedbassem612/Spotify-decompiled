package p;

import com.spotify.authentication.login5esperanto.EsAccessTokenClient;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ce implements Function {
    public static final ce a = new ce();

    public final Object apply(Object obj) {
        EsAccessTokenClient.ErrorResponse errorResponse = (EsAccessTokenClient.ErrorResponse) obj;
        errorResponse.toString();
        if (errorResponse.s()) {
            return new ug8(Integer.valueOf(errorResponse.p().o()), errorResponse.p().p());
        }
        return errorResponse.t() ? new ug8(Integer.valueOf(errorResponse.r()), errorResponse.q().name()) : new ug8(null, "Received error without specific or generic error");
    }
}
