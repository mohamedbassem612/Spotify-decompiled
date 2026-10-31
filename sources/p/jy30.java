package p;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.spotify.messages.AndroidAppExitReasonNonAuth;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jy30 implements xm5 {
    public static final bma1 e = bma1.b.q("app_exit_reason_last_reported_timestamp");
    public final ynb0 a;
    public final Context b;
    public final ut71 c;
    public final idd1 d = new idd1(new f710(this, (byte) 23));

    public jy30(ynb0 ynb0Var, Context context, ut71 ut71Var) {
        this.a = ynb0Var;
        this.b = context;
        this.c = ut71Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.xm5
    public final void a(ApplicationExitInfo applicationExitInfo) throws NoWhenBranchMatchedException {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            long timestamp = applicationExitInfo.getTimestamp();
            idd1 idd1Var = this.d;
            dma1 dma1Var = (dma1) idd1Var.getValue();
            bma1 bma1Var = e;
            if (timestamp <= dma1Var.g(bma1Var, 0L)) {
                return;
            }
            x44 x44VarO = AndroidAppExitReasonNonAuth.o();
            String str = "REASON_UNKNOWN";
            if (i >= 34) {
                str = (String) wgl.c.getOrDefault(Integer.valueOf(applicationExitInfo.getReason()), "REASON_UNKNOWN");
            } else if (i >= 33) {
                str = (String) wgl.b.getOrDefault(Integer.valueOf(applicationExitInfo.getReason()), "REASON_UNKNOWN");
            } else if (i >= 30) {
                str = (String) wgl.a.getOrDefault(Integer.valueOf(applicationExitInfo.getReason()), "REASON_UNKNOWN");
            }
            x44VarO.t(str);
            x44VarO.q(applicationExitInfo.getDescription());
            x44VarO.r(i >= 30 ? (String) wgl.d.getOrDefault(Integer.valueOf(applicationExitInfo.getImportance()), "IMPORTANCE_UNKNOWN") : "IMPORTANCE_UNKNOWN");
            x44VarO.v(applicationExitInfo.getStatus());
            x44VarO.s(applicationExitInfo.getPss());
            x44VarO.u(applicationExitInfo.getRss());
            x44VarO.w(applicationExitInfo.getTimestamp());
            vrw0 vrw0VarL = sjo0.l(applicationExitInfo.getProcessStateSummary());
            if (vrw0VarL instanceof vrw0) {
                vrw0 vrw0Var = vrw0VarL;
                x44VarO.n("diagnostic_session_id", vrw0Var.a().toString());
                String strD = vrw0Var.d();
                if (strD != null) {
                    x44VarO.n("latest_known_page_instance_identifier", strD);
                }
                String strB = vrw0Var.b();
                if (strB != null) {
                    x44VarO.n("latest_known_interaction_identifier", strB);
                }
                b3e0 b3e0VarC = vrw0Var.c();
                if (b3e0VarC != null) {
                    x44VarO.n("main_thread_stall_level", String.valueOf(b3e0VarC.b()));
                    x44VarO.n("core_thread_stall_level", String.valueOf(b3e0VarC.a()));
                    x44VarO.n("device_memory_headroom_level", String.valueOf(b3e0VarC.c()));
                    x44VarO.n("own_cpu_level", String.valueOf(b3e0VarC.d()));
                }
            } else if (vrw0VarL instanceof urw0) {
                x44VarO.n("invalid_process_state_summary", ((urw0) vrw0VarL).a());
            } else if (vrw0VarL != null) {
                eg.o();
                return;
            }
            ((t2j0) this.a.get()).a(x44VarO.build());
            hma1 hma1VarEdit = ((dma1) idd1Var.getValue()).edit();
            hma1VarEdit.c(bma1Var, applicationExitInfo.getTimestamp());
            hma1VarEdit.g();
        }
    }
}
