package p;

import com.spotify.playlist.proto.ModificationRequest;
import spotify.playlist.esperanto.proto.PlaylistModificationRequest;
import spotify.playlist.esperanto.proto.PlaylistModificationResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pyc0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ xyc0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ModificationRequest e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pyc0(xyc0 xyc0Var, String str, ModificationRequest modificationRequest, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = xyc0Var;
        this.d = str;
        this.e = modificationRequest;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new pyc0(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new pyc0(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        ModificationRequest modificationRequest = this.e;
        xyc0 xyc0Var = this.c;
        d9n d9nVar = d9n.a;
        String str = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    jn7 jn7Var = xyc0Var.d;
                    gpu0 gpu0VarN = PlaylistModificationRequest.n();
                    gpu0VarN.q(str);
                    gpu0VarN.n(modificationRequest);
                    PlaylistModificationRequest playlistModificationRequest = (PlaylistModificationRequest) gpu0VarN.build();
                    this.b = true;
                    obj = jn7Var.N(playlistModificationRequest, this);
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
                PlaylistModificationResponse playlistModificationResponse = (PlaylistModificationResponse) obj;
                return i2x0.l(playlistModificationResponse.o(), str, new nzb0(playlistModificationResponse, (byte) 14));
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    jn7 jn7Var2 = xyc0Var.d;
                    gpu0 gpu0VarN2 = PlaylistModificationRequest.n();
                    gpu0VarN2.q(str);
                    gpu0VarN2.n(modificationRequest);
                    PlaylistModificationRequest playlistModificationRequest2 = (PlaylistModificationRequest) gpu0VarN2.build();
                    this.b = true;
                    obj = jn7Var2.N(playlistModificationRequest2, this);
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
                return i2x0.l(((PlaylistModificationResponse) obj).o(), str, fnc0.Z);
        }
    }
}
