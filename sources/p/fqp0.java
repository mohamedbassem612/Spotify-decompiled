package p;

import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin;
import com.spotify.betamax.offlinecoordinator.proto.OfflinePlugin$DownloadResponse;
import com.spotify.betamax.player.offline.exception.BetamaxDownloadException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fqp0 implements vma {
    public final /* synthetic */ hqp0 a;

    public fqp0(hqp0 hqp0Var) {
        this.a = hqp0Var;
    }

    public final void c(swu swuVar, long j, long j2) {
        h(swuVar, j, true, null);
    }

    public final void f(swu swuVar, long j) {
        h(swuVar, j, false, null);
    }

    public final void g(swu swuVar, long j, BetamaxDownloadException betamaxDownloadException, long j2) {
        h(swuVar, j, false, betamaxDownloadException);
    }

    public final void h(swu swuVar, long j, boolean z, BetamaxDownloadException betamaxDownloadException) {
        iup0 iup0Var;
        String str = (String) swuVar.a.b.get("episode_uri");
        if (str == null) {
            return;
        }
        hqp0 hqp0Var = this.a;
        long jB = hqp0Var.a.b(swuVar.a.a);
        uqp0 uqp0Var = hqp0Var.d;
        hup0 hup0VarN = OfflinePlugin$DownloadResponse.n();
        hup0VarN.t(str);
        hup0VarN.q(z);
        hup0VarN.s(jB);
        hup0VarN.n(j);
        int i = betamaxDownloadException != null ? betamaxDownloadException.a : 0;
        int i2 = i == 0 ? -1 : vqp0.a[l1d.C(i)];
        if (i2 != -1) {
            iup0Var = i2 != 1 ? iup0.PERMANENT_ERROR : iup0.DISK_FULL;
        } else {
            iup0Var = iup0.OK;
        }
        hup0VarN.r(iup0Var);
        lup0 lup0Var = (lup0) sap1.c().toBuilder();
        lup0Var.n((OfflinePlugin$DownloadResponse) hup0VarN.build());
        OfflinePlugin.PluginResponse pluginResponseBuild = lup0Var.build();
        pluginResponseBuild.getClass();
        uqp0Var.b.a(uqp0Var.a.b(pluginResponseBuild).subscribe());
    }
}
