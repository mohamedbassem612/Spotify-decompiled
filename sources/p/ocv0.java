package p;

import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ocv0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yeu0 b;

    public /* synthetic */ ocv0(yeu0 yeu0Var, byte b) {
        this.a = b;
        this.b = yeu0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        yeu0 yeu0Var = this.b;
        switch (b) {
            case 0:
                ClientPollResponse clientPollResponse = (ClientPollResponse) obj;
                if (clientPollResponse.q()) {
                    ((q6v0) yeu0Var.c).a(clientPollResponse);
                }
                break;
            default:
                ((q6v0) yeu0Var.c).a((ClientPollResponse) obj);
                break;
        }
    }
}
