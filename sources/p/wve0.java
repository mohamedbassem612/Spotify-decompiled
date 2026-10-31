package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateRequest$AuthenticateRequest;
import com.spotify.esperanto.esperanto.ClientBase;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wve0 extends ClientBase {
    public final Transport a;

    public wve0(Transport transport) {
        super(transport);
        this.a = transport;
    }

    public final Observable a(EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest) {
        return callStream("spotify.authentication.login5.impl.proto.Login5", "authenticate", esAuthenticateRequest$AuthenticateRequest).map(f331.V0);
    }
}
