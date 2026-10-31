package com.ravelin.core.repository;

import android.content.Context;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.ravelin.core.model.MobileReportRequest;
import kotlin.Metadata;
import p.az80;
import p.bvl0;
import p.d9n;
import p.eg;
import p.fn31;
import p.hm5;
import p.ike1;
import p.lnm;
import p.m5n1;
import p.o5n1;
import p.o8n;
import p.onm;
import p.rih1;
import p.u890;
import p.utw0;
import p.v8d0;
import p.w0h1;
import p.w8d0;
import p.y8d0;
import p.z8d0;
import p.zdp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ravelin/core/repository/MobileReportWorker;", "Lcom/ravelin/core/repository/RavelinWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class MobileReportWorker extends RavelinWorker {
    public MobileReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.ravelin.core.repository.RavelinWorker
    public final Object f(lnm lnmVar) {
        bvl0 bvl0Var;
        rih1 rih1Var;
        if (lnmVar instanceof bvl0) {
            bvl0Var = (bvl0) lnmVar;
            int i = bvl0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bvl0Var.c = i - Integer.MIN_VALUE;
            } else {
                bvl0Var = new bvl0(this, (onm) lnmVar);
            }
        } else {
            bvl0Var = new bvl0(this, (onm) lnmVar);
        }
        Object objY = bvl0Var.a;
        int i2 = bvl0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                WorkerParameters workerParameters = ((z8d0) this).b;
                if (workerParameters.c > 72) {
                    return new v8d0();
                }
                String strC = workerParameters.b.c("Api");
                String strC2 = workerParameters.b.c("MobileReportRequest");
                if (strC != null) {
                    i(strC);
                    rih1Var = rih1.a;
                } else {
                    rih1Var = null;
                }
                if (rih1Var == null) {
                    return new v8d0();
                }
                MobileReportRequest mobileReportRequest = (MobileReportRequest) (strC2 != null ? (Parcelable) w0h1.d(new o5n1((byte) 2)).a(strC2, m5n1.z(MobileReportRequest.INSTANCE.serializer())) : null);
                zdp0 zdp0Var = this.i;
                if (zdp0Var == null) {
                    u890.C("coroutineContextProvider");
                    throw null;
                }
                o8n o8nVarA = zdp0Var.a();
                az80 az80Var = new az80(this, strC, mobileReportRequest, (lnm) null, (byte) 27);
                bvl0Var.c = 1;
                objY = fn31.Y(o8nVarA, az80Var, bvl0Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objY);
            }
            return (y8d0) objY;
        } catch (Exception e) {
            String message = e.getMessage();
            utw0 utw0Var = ike1.a;
            utw0Var.y("MobileReportError");
            utw0Var.o(message, new Object[0]);
            return new w8d0();
        }
    }
}
