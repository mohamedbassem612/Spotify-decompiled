package p;

import android.app.Application;
import android.content.Context;
import com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d1q implements dl4 {
    public final daq a;

    public void w(Object obj) {
        ForegroundKeeperService foregroundKeeperService = (ForegroundKeeperService) obj;
        daq daqVar = this.a;
        foregroundKeeperService.c = (ji5) daqVar.B6.get();
        foregroundKeeperService.a = (rd30) daqVar.Hh.get();
        fo9 fo9Var = new fo9((Context) daqVar.x1.a, (byte) 1);
        r380 r380VarL = t380.l(3);
        r380VarL.g(new fo9(xqu.a(daqVar.Un), (byte) 0));
        rp5 rp5Var = new rp5((Context) daqVar.x1.a);
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) daqVar.ah.get();
        r380VarL.g(new j250(rp5Var, new g050(activityLifecycleCallbacks, (byte) 1), (zn41) daqVar.am.get()));
        r380VarL.h(w7x.a);
        foregroundKeeperService.b = new j8q0(fo9Var, r380VarL.i(), new y1n0((oo70) daqVar.M2.get()));
        foregroundKeeperService.d = new rp5((Context) daqVar.x1.a);
        foregroundKeeperService.e = (Random) daqVar.I1.get();
    }
}
