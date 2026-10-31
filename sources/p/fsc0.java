package p;

import com.spotify.listplatform.endpointsimpl.proto.PlaylistUriResolverResponse;
import com.spotify.listplatform.endpointsimpl.proto.ResolvedPersonalizedPlaylist;
import com.spotify.playlist.proto.PlaylistMembersRequest;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fsc0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ rsc0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsc0(String str, rsc0 rsc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = str;
        this.c = rsc0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        rsc0 rsc0Var = this.c;
        switch (b) {
            case 0:
                return new fsc0(str, rsc0Var, lnmVar);
            default:
                return new fsc0(rsc0Var, str, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rsc0 rsc0Var = this.c;
        d9n d9nVar = d9n.a;
        String str = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    cpu0 cpu0VarN = PlaylistMembersRequest.n();
                    cpu0VarN.n(str);
                    jn7 jn7Var = rsc0Var.d;
                    PlaylistMembersRequest playlistMembersRequestBuild = cpu0VarN.build();
                    this.b = true;
                    obj = jn7Var.B(playlistMembersRequestBuild, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                PlaylistMembersResponse playlistMembersResponse = (PlaylistMembersResponse) obj;
                return i2x0.l(playlistMembersResponse.o(), str, new esc0(rsc0Var, str, playlistMembersResponse, (byte) 0));
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    dss0 dss0Var = rsc0Var.h;
                    this.b = true;
                    obj = dss0Var.a(str, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ResolvedPersonalizedPlaylist resolvedPersonalizedPlaylist = (ResolvedPersonalizedPlaylist) o7h.s0(((PlaylistUriResolverResponse) obj).getResolvedPlaylistsList());
                String uri = resolvedPersonalizedPlaylist != null ? resolvedPersonalizedPlaylist.getUri() : null;
                return (uri == null || uri.length() == 0) ? new ly21(new gy21(l1d.m("No playlist found for URI: ", str))) : new oy21(uri);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsc0(rsc0 rsc0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.c = rsc0Var;
        this.d = str;
    }
}
