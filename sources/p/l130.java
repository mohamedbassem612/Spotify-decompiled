package p;

import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.RootlistModificationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l130 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RootlistModificationResponse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l130(RootlistModificationResponse rootlistModificationResponse, byte b) {
        super(0);
        this.a = b;
        this.b = rootlistModificationResponse;
    }

    public final Object invoke() {
        byte b = this.a;
        RootlistModificationResponse rootlistModificationResponse = this.b;
        switch (b) {
            case 0:
                break;
        }
        return rootlistModificationResponse.n().getUri();
    }
}
