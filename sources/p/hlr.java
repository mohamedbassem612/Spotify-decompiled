package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messages.InconsistencyMonitorEvent;
import com.spotify.widgets.recommendationswidget.events.proto.NpvRecommendationsWidgetErrorNonAuth;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hlr {
    public final t2j0 a;

    public void a(a790 a790Var) {
        k980 k980Var = a790Var.a;
        String str = k980Var.a;
        String str2 = a790Var.b;
        l980 l980VarN = InconsistencyMonitorEvent.n();
        l980VarN.q(str);
        l980VarN.r(str2);
        l980VarN.n(true);
        InconsistencyMonitorEvent inconsistencyMonitorEventBuild = l980VarN.build();
        inconsistencyMonitorEventBuild.getClass();
        this.a.a(inconsistencyMonitorEventBuild);
        Logger.k(l1d.m("[InteropMonitor] Inconsistency detected: ", k980Var.a), new Object[0]);
    }

    public void b(b790 b790Var) {
        k980 k980Var = b790Var.a;
        String str = k980Var.a;
        String str2 = b790Var.b;
        l980 l980VarN = InconsistencyMonitorEvent.n();
        l980VarN.q(str);
        l980VarN.r(str2);
        l980VarN.n(false);
        InconsistencyMonitorEvent inconsistencyMonitorEventBuild = l980VarN.build();
        inconsistencyMonitorEventBuild.getClass();
        this.a.a(inconsistencyMonitorEventBuild);
        Logger.k(l1d.m("[InteropMonitor] Inconsistency resolved: ", k980Var.a), new Object[0]);
    }

    public void c(String str, TimeoutException timeoutException) {
        i9p0 i9p0VarN = NpvRecommendationsWidgetErrorNonAuth.n();
        i9p0VarN.q("TIMEOUT");
        i9p0VarN.s(str);
        i9p0VarN.r(j2h1.I(timeoutException));
        i9p0VarN.n();
        this.a.a(i9p0VarN.build());
    }
}
