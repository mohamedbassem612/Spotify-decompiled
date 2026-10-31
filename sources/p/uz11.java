package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uz11 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vz11 b;

    public /* synthetic */ uz11(vz11 vz11Var, byte b) {
        this.a = b;
        this.b = vz11Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        vz11 vz11Var = this.b;
        switch (b) {
            case 0:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                vz11Var.g.onNext(geh1.a);
                break;
            case 1:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                vz11Var.g.onNext(geh1.a);
                break;
            case 2:
                vz11Var.f.set(System.currentTimeMillis());
                break;
            default:
                if (((Throwable) obj) instanceof TimeoutException) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - vz11Var.f.get();
                    aq80 aq80Var = vz11Var.c;
                    mtk mtkVarE = aq80Var.e(jCurrentTimeMillis, "BLOCKING");
                    mtkVarE.E(-1);
                    mtkVarE.t(zjy.i(4));
                    mtkVarE.r("upstream timeout");
                    aq80Var.b.w("ConfigurationFetchedNonAuth", mtkVarE.build().toByteArray());
                }
                break;
        }
    }
}
