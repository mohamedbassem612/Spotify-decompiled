package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.cj61;
import p.d9n;
import p.dg61;
import p.eg;
import p.ewq;
import p.fns;
import p.hm5;
import p.igu;
import p.jm5;
import p.jve1;
import p.lc41;
import p.lnm;
import p.n9x0;
import p.o0c;
import p.onm;
import p.pyf0;
import p.q8n;
import p.t8e1;
import p.x8d0;
import p.xf61;
import p.y8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/glance/session/SessionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "Lp/xf61;", "sessionManager", "Lp/jve1;", "timeouts", "Lp/q8n;", "coroutineContext", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/xf61;Lp/jve1;Lp/q8n;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters g;
    public final xf61 h;
    public final jve1 i;
    public final q8n j;
    public final String k;

    public SessionWorker(Context context, WorkerParameters workerParameters, xf61 xf61Var, jve1 jve1Var, q8n q8nVar) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = xf61Var;
        this.i = jve1Var;
        this.j = q8nVar;
        ewq ewqVar = this.b.b;
        xf61Var.getClass();
        String strC = ewqVar.c("KEY");
        if (strC != null) {
            this.k = strC;
        } else {
            eg.m("SessionWorker must be started with a key");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object f(lnm lnmVar) {
        cj61 cj61Var;
        if (lnmVar instanceof cj61) {
            cj61Var = (cj61) lnmVar;
            int i = cj61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cj61Var.c = i - Integer.MIN_VALUE;
            } else {
                cj61Var = new cj61(this, (onm) lnmVar);
            }
        } else {
            cj61Var = new cj61(this, (onm) lnmVar);
        }
        Object objT = cj61Var.a;
        int i2 = cj61Var.c;
        if (i2 == 0) {
            hm5.M(objT);
            this.i.getClass();
            t8e1 t8e1Var = n9x0.R0;
            lc41 lc41Var = new lc41(this, (lnm) null, (byte) 29);
            cj61Var.c = 1;
            objT = jm5.t(t8e1Var, lc41Var, cj61Var);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        y8d0 y8d0Var = (y8d0) objT;
        if (y8d0Var != null) {
            return y8d0Var;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("TIMEOUT_EXIT_REASON", Boolean.TRUE);
        ewq ewqVar = new ewq(linkedHashMap);
        o0c.N(ewqVar);
        return new x8d0(ewqVar);
    }

    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: g, reason: from getter */
    public final q8n getJ() {
        return this.j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, xf61 xf61Var, jve1 jve1Var, q8n q8nVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        xf61 xf61VarA = (i & 4) != 0 ? dg61.a() : xf61Var;
        jve1 jve1Var2 = (i & 8) != 0 ? new jve1() : jve1Var;
        if ((i & 16) != 0) {
            fns fnsVar = igu.a;
            q8nVar = pyf0.a;
        }
        this(context, workerParameters, xf61VarA, jve1Var2, q8nVar);
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, dg61.a(), null, null, 24, null);
    }
}
