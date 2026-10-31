package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import p.awl1;
import p.dxl1;
import p.en31;
import p.g2u;
import p.gc4;
import p.gwl1;
import p.gxl1;
import p.qs10;
import p.qti1;
import p.qyo1;
import p.y8d0;
import p.ytw0;
import p.z8d0;
import p.zdd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticsWorker extends Worker {
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final y8d0 f() {
        awl1 awl1VarD = awl1.d(((z8d0) this).a);
        WorkDatabase workDatabase = awl1VarD.c;
        dxl1 dxl1VarA = workDatabase.A();
        gwl1 gwl1VarY = workDatabase.y();
        gxl1 gxl1VarB = workDatabase.B();
        zdd1 zdd1VarX = workDatabase.x();
        ytw0 ytw0Var = awl1VarD.b.d;
        List list = (List) qyo1.x(dxl1VarA.a, true, false, new gc4((byte) 5, System.currentTimeMillis() - 86400000));
        en31 en31Var = dxl1VarA.a;
        List list2 = (List) qyo1.x(en31Var, true, false, new qti1((byte) 23));
        List list3 = (List) qyo1.x(en31Var, true, false, new qti1((byte) 28));
        if (!list.isEmpty()) {
            qs10 qs10VarA = qs10.a();
            int i = g2u.a;
            qs10VarA.getClass();
            qs10 qs10VarA2 = qs10.a();
            g2u.a(gwl1VarY, gxl1VarB, zdd1VarX, list);
            qs10VarA2.getClass();
        }
        if (!list2.isEmpty()) {
            qs10 qs10VarA3 = qs10.a();
            int i2 = g2u.a;
            qs10VarA3.getClass();
            qs10 qs10VarA4 = qs10.a();
            g2u.a(gwl1VarY, gxl1VarB, zdd1VarX, list2);
            qs10VarA4.getClass();
        }
        if (!list3.isEmpty()) {
            qs10 qs10VarA5 = qs10.a();
            int i3 = g2u.a;
            qs10VarA5.getClass();
            qs10 qs10VarA6 = qs10.a();
            g2u.a(gwl1VarY, gxl1VarB, zdd1VarX, list3);
            qs10VarA6.getClass();
        }
        return y8d0.a();
    }
}
