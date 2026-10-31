package p;

import kotlin.jvm.functions.Function0;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class esc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rsc0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ PlaylistMembersResponse d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esc0(rsc0 rsc0Var, String str, PlaylistMembersResponse playlistMembersResponse, byte b) {
        super(0);
        this.a = b;
        this.b = rsc0Var;
        this.c = str;
        this.d = playlistMembersResponse;
    }

    public final Object invoke() {
        byte b = this.a;
        PlaylistMembersResponse playlistMembersResponse = this.d;
        String str = this.c;
        rsc0 rsc0Var = this.b;
        switch (b) {
            case 0:
                return rsc0Var.b.c(str, playlistMembersResponse.n());
            default:
                return rsc0Var.b.c(str, playlistMembersResponse.n());
        }
    }
}
