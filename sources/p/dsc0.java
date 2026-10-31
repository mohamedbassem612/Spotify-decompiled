package p;

import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.PlaylistGetResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dsc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsc0 b;
    public final /* synthetic */ PlaylistGetResponse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsc0(rsc0 rsc0Var, PlaylistGetResponse playlistGetResponse, byte b) {
        super(0);
        this.a = b;
        this.b = rsc0Var;
        this.c = playlistGetResponse;
    }

    public final Object invoke() {
        byte b = this.a;
        PlaylistGetResponse playlistGetResponse = this.c;
        rsc0 rsc0Var = this.b;
        switch (b) {
            case 0:
                return xsc0.d(rsc0Var.b.b(playlistGetResponse.o()));
            case 1:
                return xsc0.c(rsc0Var.b.b(playlistGetResponse.o()));
            case 2:
                return wsc0.a(rsc0Var.b.b(playlistGetResponse.o()), Integer.valueOf(rsc0.e(playlistGetResponse.q())));
            case 3:
                return (oqc0) rsc0Var.j.invoke(playlistGetResponse);
            case 4:
                return xsc0.d(rsc0Var.b.b(playlistGetResponse.o()));
            default:
                return xsc0.c(rsc0Var.b.b(playlistGetResponse.o()));
        }
    }
}
