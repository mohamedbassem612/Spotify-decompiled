package p;

import com.spotify.connect.smartcontrol.events.proto.ConnectSmartControlLifecycleEvent;
import com.spotify.messages.MetricMeasurement;
import com.spotify.messages.WhereToPlayClientRecommendationAutoDismissed;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mwb {
    public final t2j0 a;

    public void a(UUID uuid, int i, kub1 kub1Var, t6l t6lVar, m6l m6lVar) {
        String str;
        String str2;
        String str3;
        iyk0 iyk0Var;
        boolean z = t6lVar instanceof s6l;
        s6l s6lVar = z ? (s6l) t6lVar : null;
        u6l u6lVarN = ConnectSmartControlLifecycleEvent.n();
        u6lVarN.r(uuid.toString());
        if (i == 1) {
            str = "requested";
        } else if (i == 2) {
            str = "queued";
        } else if (i == 3) {
            str = "suppressed";
        } else if (i == 4) {
            str = "presented";
        } else {
            if (i != 5) {
                throw null;
            }
            str = "dismissed";
        }
        u6lVarN.t(str);
        if (z) {
            str2 = "simple";
        } else {
            if (!(t6lVar instanceof n6l)) {
                eg.o();
                return;
            }
            str2 = "custom";
        }
        u6lVarN.v(str2);
        if (m6lVar instanceof l6l) {
            str3 = "user_interaction_immediate";
        } else {
            if (!(m6lVar instanceof k6l)) {
                eg.o();
                return;
            }
            str3 = "background_time_sensitive";
        }
        u6lVarN.s(str3);
        String str4 = (s6lVar == null || (iyk0Var = s6lVar.d) == null) ? null : iyk0Var.a;
        if (str4 == null) {
            str4 = "";
        }
        u6lVarN.n(str4);
        String str5 = s6lVar != null ? s6lVar.e : null;
        if (str5 == null) {
            str5 = "";
        }
        u6lVarN.q(str5);
        String str6 = kub1Var != null ? kub1Var.a : null;
        u6lVarN.u(str6 != null ? str6 : "");
        this.a.a(u6lVarN.build());
    }

    public void b(String str) {
        tnl1 tnl1VarN = WhereToPlayClientRecommendationAutoDismissed.n();
        tnl1VarN.q(str);
        tnl1VarN.n();
        WhereToPlayClientRecommendationAutoDismissed whereToPlayClientRecommendationAutoDismissedBuild = tnl1VarN.build();
        Objects.toString(whereToPlayClientRecommendationAutoDismissedBuild);
        this.a.a(whereToPlayClientRecommendationAutoDismissedBuild);
    }

    public void c(o860 o860Var) {
        upj0 upj0VarQ = MetricMeasurement.q();
        upj0VarQ.u(((UUID) o860Var.b).toString());
        upj0VarQ.s();
        upj0VarQ.t();
        upj0VarQ.r(o860Var.n());
        upj0VarQ.n((ConcurrentHashMap) o860Var.c);
        upj0VarQ.q((ConcurrentHashMap) o860Var.d);
        this.a.a(upj0VarQ.build());
    }
}
