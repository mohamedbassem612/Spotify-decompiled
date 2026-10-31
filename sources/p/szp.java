package p;

import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class szp implements jly0 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ szp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public final Object get() {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 0:
                return new fbm((me30) daqVar.w7.get());
            case 1:
                return new fbm((me30) daqVar.w7.get());
            case 2:
                return eth.X((xm41) daqVar.V4.get()).map(vf61.X);
            case 3:
                return new fbm((me30) daqVar.w7.get());
            case 4:
                return new fbm((me30) daqVar.w7.get());
            case 5:
                return new fbm((me30) daqVar.w7.get());
            case 6:
                return new fbm((me30) daqVar.w7.get());
            case 7:
                c2r0 c2r0Var = (c2r0) daqVar.hm.get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return c2r0Var.d(yon1.G1("ADAPTIVEAUTHENTICATION_WEBCHALLENGE", "adaptiveauthentication/webchallenge", 12, "adaptiveauthentication"), (qir0) null);
            case 8:
                return new kuz((vpp0) daqVar.C8.get(), (FireAndForgetResolver) daqVar.Dh.get());
            case 9:
                return new fbm((me30) daqVar.w7.get());
            case 10:
                return new qyx0((xm41) daqVar.V4.get());
            case 11:
                return new fbm((me30) daqVar.w7.get());
            case 12:
                return new iic0(new n381((i8h1) daqVar.A5.get(), (byte) 6));
            case 13:
                return new iic0(new n381((i8h1) daqVar.A5.get(), (byte) 6));
            case 14:
                return new iic0(new n381((i8h1) daqVar.A5.get(), (byte) 6));
            case 15:
                return new u891((t891) daqVar.v6.get(), (t891) daqVar.v6.get(), (t891) daqVar.v6.get());
            default:
                return new fbm((me30) daqVar.w7.get());
        }
    }
}
