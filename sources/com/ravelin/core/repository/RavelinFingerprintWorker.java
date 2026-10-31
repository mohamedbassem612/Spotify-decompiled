package com.ravelin.core.repository;

import android.content.Context;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.ravelin.core.model.Events;
import kotlin.Metadata;
import p.d9n;
import p.dvz0;
import p.eg;
import p.fn31;
import p.gvg;
import p.hm5;
import p.i3y0;
import p.ike1;
import p.l1d;
import p.lnm;
import p.m5n1;
import p.o5n1;
import p.o8n;
import p.onm;
import p.u890;
import p.utw0;
import p.v8d0;
import p.w0h1;
import p.w8d0;
import p.y8d0;
import p.z8d0;
import p.zdp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ravelin/core/repository/RavelinFingerprintWorker;", "Lcom/ravelin/core/repository/RavelinWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class RavelinFingerprintWorker extends RavelinWorker {
    public static final String l;

    static {
        String canonicalName = RavelinFingerprintWorker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "RavelinFingerprintWorker";
        }
        l = canonicalName;
    }

    public RavelinFingerprintWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.ravelin.core.repository.RavelinWorker
    public final Object f(lnm lnmVar) {
        dvz0 dvz0Var;
        if (lnmVar instanceof dvz0) {
            dvz0Var = (dvz0) lnmVar;
            int i = dvz0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dvz0Var.c = i - Integer.MIN_VALUE;
            } else {
                dvz0Var = new dvz0(this, (onm) lnmVar);
            }
        } else {
            dvz0Var = new dvz0(this, (onm) lnmVar);
        }
        Object objY = dvz0Var.a;
        int i2 = dvz0Var.c;
        String str = l;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                WorkerParameters workerParameters = ((z8d0) this).b;
                if (workerParameters.c > 72) {
                    return new v8d0();
                }
                String strC = workerParameters.b.c("Api");
                String strC2 = workerParameters.b.c("Payload");
                String strH = gvg.h("doWork was called with keys: apiKey - ", strC, ", payloadKey - ", strC2);
                utw0 utw0Var = ike1.a;
                utw0Var.y(str);
                utw0Var.o(strH, new Object[0]);
                if (strC == null || strC.length() == 0 || strC2 == null || strC2.length() == 0) {
                    utw0Var.y(str);
                    utw0Var.o("Failed with lack of information", new Object[0]);
                    return new v8d0();
                }
                i(strC);
                Events events = (Events) ((Parcelable) w0h1.d(new o5n1((byte) 2)).a(strC2, m5n1.z(Events.INSTANCE.serializer())));
                zdp0 zdp0Var = this.i;
                if (zdp0Var == null) {
                    u890.C("coroutineContextProvider");
                    throw null;
                }
                o8n o8nVarA = zdp0Var.a();
                i3y0 i3y0Var = new i3y0(this, strC, events, (lnm) null, (byte) 5);
                dvz0Var.c = 1;
                objY = fn31.Y(o8nVarA, i3y0Var, dvz0Var);
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
            String strM = l1d.m("Failed to make api call with the following reason: ", e.getMessage());
            utw0 utw0Var2 = ike1.a;
            utw0Var2.y(str);
            utw0Var2.o(strM, new Object[0]);
            return new w8d0();
        }
    }
}
