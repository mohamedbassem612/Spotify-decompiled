package p;

import spotify.playlist.esperanto.proto.PlaylistGetResponse;
import spotify.playlist.esperanto.proto.PlaylistMembersResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lsc0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ rsc0 d;

    public /* synthetic */ lsc0(vr20 vr20Var, String str, rsc0 rsc0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
        this.d = rsc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) {
        ksc0 ksc0Var;
        osc0 osc0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rsc0 rsc0Var = this.d;
        String str = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ksc0) {
                    ksc0Var = (ksc0) lnmVar;
                    int i = ksc0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ksc0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ksc0Var = new ksc0(this, lnmVar);
                    }
                } else {
                    ksc0Var = new ksc0(this, lnmVar);
                }
                Object obj2 = ksc0Var.a;
                int i2 = ksc0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                PlaylistGetResponse playlistGetResponse = (PlaylistGetResponse) obj;
                py21 py21VarL = i2x0.l(playlistGetResponse.r(), str, new dsc0(rsc0Var, playlistGetResponse, (byte) 3));
                ksc0Var.b = 1;
                return vr20Var.emit(py21VarL, ksc0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof osc0) {
                    osc0Var = (osc0) lnmVar;
                    int i3 = osc0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        osc0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        osc0Var = new osc0(this, lnmVar);
                    }
                } else {
                    osc0Var = new osc0(this, lnmVar);
                }
                Object obj3 = osc0Var.a;
                int i4 = osc0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                PlaylistMembersResponse playlistMembersResponse = (PlaylistMembersResponse) obj;
                py21 py21VarL2 = i2x0.l(playlistMembersResponse.o(), str, new esc0(rsc0Var, str, playlistMembersResponse, (byte) 1));
                osc0Var.b = 1;
                return vr20Var.emit(py21VarL2, osc0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
