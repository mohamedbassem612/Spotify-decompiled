package com.spotify.androidx.workmanager;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.d9n;
import p.eg;
import p.hhp0;
import p.hm5;
import p.lnm;
import p.ob51;
import p.onm;
import p.s3b1;
import p.y8d0;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/zvl1;", "tracker", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/zvl1;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_androidx_workmanager-workmanager"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SpotifyCoroutineWorker extends CoroutineWorker {
    public final WorkerParameters g;
    public final zvl1 h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotifyCoroutineWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, new zvl1());
        hhp0 hhp0Var = hhp0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(lnm lnmVar) {
        s3b1 s3b1Var;
        if (lnmVar instanceof s3b1) {
            s3b1Var = (s3b1) lnmVar;
            int i = s3b1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3b1Var.c = i - Integer.MIN_VALUE;
            } else {
                s3b1Var = new s3b1(this, (onm) lnmVar);
            }
        } else {
            s3b1Var = new s3b1(this, (onm) lnmVar);
        }
        Object objI = s3b1Var.a;
        int i2 = s3b1Var.c;
        zvl1 zvl1Var = this.h;
        try {
            try {
                try {
                    if (i2 == 0) {
                        hm5.M(objI);
                        String simpleName = getClass().getSimpleName();
                        String name = getClass().getName();
                        WorkerParameters workerParameters = this.g;
                        zvl1Var.f(simpleName, name, workerParameters.c, workerParameters.a.toString());
                        s3b1Var.c = 1;
                        objI = i(s3b1Var);
                        d9n d9nVar = d9n.a;
                        if (objI == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i2 != 1) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objI);
                    }
                    y8d0 y8d0Var = (y8d0) objI;
                    if (b()) {
                        zvl1Var.b();
                    } else {
                        zvl1Var.c(ob51.p(y8d0Var));
                    }
                    y8d0 y8d0Var2 = (y8d0) objI;
                    zvl1Var.d(ob51.h(this));
                    return y8d0Var2;
                } catch (CancellationException e) {
                    zvl1Var.b();
                    throw e;
                }
            } catch (Throwable th) {
                zvl1Var.e(th);
                throw th;
            }
        } catch (Throwable th2) {
            zvl1Var.d(ob51.h(this));
            throw th2;
        }
    }

    public abstract Object i(lnm lnmVar);

    public SpotifyCoroutineWorker(Context context, WorkerParameters workerParameters, zvl1 zvl1Var) {
        super(context, workerParameters);
        this.g = workerParameters;
        this.h = zvl1Var;
    }
}
