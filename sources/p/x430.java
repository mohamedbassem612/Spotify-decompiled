package p;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.EsperantoRxRouter;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x430 implements EsperantoRxRouter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RxRouter b;

    public /* synthetic */ x430(RxRouter rxRouter, byte b) {
        this.a = b;
        this.b = rxRouter;
    }

    public final Observable resolve(Request request) {
        byte b = this.a;
        RxRouter rxRouter = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
        }
        return rxRouter.resolve(request);
    }
}
