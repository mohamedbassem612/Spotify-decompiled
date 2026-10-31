package p;

import com.google.protobuf.Empty;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vop0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vop0(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                return rqt0.u(new lt20(new uop0(yoi1.g(((vpp0) resVar.f).callStream("spotify.offline_esperanto.proto.Offline", "SubscribeOfflinePlaybackStatus", Empty.n()).map(cj20.T0)), (byte) 0), new i440(3, null, (byte) 21), (byte) 0));
            default:
                ((qtr) obj).b(new pnp0(resVar, (lnm) null, (byte) 1));
                return rih1.a;
        }
    }
}
