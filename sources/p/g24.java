package p;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class g24 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g24(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((r24) obj).b();
            case 1:
                return ((x340) obj).o();
            case 2:
                try {
                    return (List) ((Function0) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return z6x.a;
                }
            case 3:
                return (List) obj;
            case 4:
                lmb0 lmb0Var = ((hmb0) obj).f1;
                lmb0Var.f68p.Z0 = true;
                c6f0 c6f0Var = lmb0Var.q;
                if (c6f0Var != null) {
                    c6f0Var.U0 = true;
                }
                return rih1Var;
            case 5:
                ndo0 ndo0Var = ((ndo0) obj).Y0;
                if (ndo0Var != null) {
                    ndo0Var.u1();
                }
                return rih1Var;
            case 6:
                k5s0 k5s0Var = (k5s0) obj;
                return k5s0Var.a.b(k5s0Var.b);
            case 7:
                Disposable disposable = (Disposable) ((AtomicReference) obj).getAndSet(EmptyDisposable.a);
                if (disposable != null) {
                    disposable.dispose();
                }
                return rih1Var;
            case 8:
                return a6o1.n((sck1) obj);
            case 9:
                j661 j661Var = (j661) obj;
                return Integer.valueOf(p6p1.s(j661Var, j661Var.k));
            default:
                awl1 awl1Var = (awl1) obj;
                WorkDatabase workDatabase = awl1Var.c;
                Context context = awl1Var.a;
                int i = hed1.e;
                if (Build.VERSION.SDK_INT >= 34) {
                    jaa0.a(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListC = hed1.c(context, jobScheduler);
                if (arrayListC != null && !arrayListC.isEmpty()) {
                    Iterator it = arrayListC.iterator();
                    while (it.hasNext()) {
                        hed1.a(jobScheduler, ((JobInfo) it.next()).getId());
                    }
                }
                ((Number) qyo1.x(workDatabase.A().a, false, true, new qti1((byte) 20))).intValue();
                om41.b(awl1Var.b, workDatabase, awl1Var.e);
                return rih1Var;
        }
    }
}
