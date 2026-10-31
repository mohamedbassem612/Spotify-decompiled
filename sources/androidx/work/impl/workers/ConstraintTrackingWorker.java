package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.af0;
import p.ajl;
import p.awe;
import p.awl1;
import p.cwh0;
import p.d9n;
import p.eg;
import p.fn31;
import p.hm5;
import p.lnm;
import p.mvl1;
import p.nhl;
import p.o7h;
import p.onm;
import p.os00;
import p.q8n;
import p.qgo1;
import p.qs10;
import p.qti1;
import p.smo1;
import p.v8d0;
import p.vil;
import p.vwl1;
import p.w8d0;
import p.wil;
import p.x4c;
import p.xil;
import p.y8d0;
import p.z8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "p/vil", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = workerParameters;
    }

    public final Object f(lnm lnmVar) {
        return fn31.Y(qgo1.q(((z8d0) this).b.d), new awe(this, (lnm) null, (byte) 19), lnmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(z8d0 z8d0Var, cwh0 cwh0Var, vwl1 vwl1Var, onm onmVar) {
        wil wilVar;
        if (onmVar instanceof wil) {
            wilVar = (wil) onmVar;
            int i = wilVar.c;
            if ((i & os00.INVALID_ID) != 0) {
                wilVar.c = i - os00.INVALID_ID;
            } else {
                wilVar = new wil(this, onmVar);
            }
        } else {
            wilVar = new wil(this, onmVar);
        }
        Object objS = wilVar.a;
        int i2 = wilVar.c;
        if (i2 == 0) {
            hm5.M(objS);
            af0 af0Var = new af0(z8d0Var, cwh0Var, vwl1Var, (lnm) null, (byte) 6);
            wilVar.c = 1;
            objS = smo1.s(af0Var, wilVar);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objS);
        }
        return objS;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object j(onm onmVar) {
        xil xilVar;
        int i;
        z8d0 z8d0Var = this.g;
        if (onmVar instanceof xil) {
            xilVar = (xil) onmVar;
            int i2 = xilVar.d;
            if ((i2 & os00.INVALID_ID) != 0) {
                xilVar.d = i2 - os00.INVALID_ID;
            } else {
                xilVar = new xil(this, onmVar);
            }
        } else {
            xilVar = new xil(this, onmVar);
        }
        xil xilVar2 = xilVar;
        Object objY = xilVar2.b;
        int i3 = xilVar2.d;
        try {
            if (i3 == 0) {
                hm5.M(objY);
                WorkerParameters workerParameters = ((z8d0) this).b;
                String strC = workerParameters.b.c("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                if (strC == null || strC.length() == 0) {
                    int i4 = ajl.a;
                    qs10.a().getClass();
                    return new v8d0();
                }
                Context context = ((z8d0) this).a;
                awl1 awl1VarD = awl1.d(context);
                vwl1 vwl1VarD = awl1VarD.c.A().d(workerParameters.a.toString());
                if (vwl1VarD == null) {
                    return new v8d0();
                }
                cwh0 cwh0Var = new cwh0(awl1VarD.j);
                ArrayList arrayList = cwh0Var.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((nhl) obj).a(vwl1VarD)) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    qs10 qs10VarA = qs10.a();
                    int i5 = mvl1.a;
                    o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, new qti1((byte) 18), 31);
                    qs10VarA.getClass();
                }
                if (!arrayList2.isEmpty()) {
                    int i6 = ajl.a;
                    qs10.a().getClass();
                    return new w8d0();
                }
                int i7 = ajl.a;
                qs10.a().getClass();
                try {
                    z8d0 z8d0VarB = workerParameters.g.b(context, strC, z8d0Var);
                    try {
                        q8n q8nVarQ = qgo1.q(((WorkerParameters) z8d0Var).f.d);
                        z8d0Var = z8d0VarB;
                        x4c x4cVar = new x4c(this, z8d0Var, cwh0Var, vwl1VarD, (lnm) null, (byte) 24);
                        xilVar2.a = z8d0Var;
                        xilVar2.d = 1;
                        objY = fn31.Y(q8nVarQ, x4cVar, xilVar2);
                        d9n d9nVar = d9n.a;
                        if (objY == d9nVar) {
                            return d9nVar;
                        }
                    } catch (CancellationException e) {
                        e = e;
                        z8d0Var = z8d0VarB;
                        if (b() || (e instanceof vil)) {
                            if (Build.VERSION.SDK_INT < 31) {
                                i = -512;
                            } else if (b()) {
                                i = ((z8d0) this).c.get();
                            } else {
                                if (!(e instanceof vil)) {
                                    eg.m("Unreachable");
                                    return null;
                                }
                                i = ((vil) e).a;
                            }
                            z8d0Var.e(i);
                        }
                        if (e instanceof vil) {
                            return new w8d0();
                        }
                        throw e;
                    }
                } catch (Throwable unused) {
                    int i8 = ajl.a;
                    qs10.a().getClass();
                    awl1VarD.b.getClass();
                    return new v8d0();
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z8d0Var = xilVar2.a;
                hm5.M(objY);
            }
            return (y8d0) objY;
        } catch (CancellationException e2) {
            e = e2;
        }
    }
}
