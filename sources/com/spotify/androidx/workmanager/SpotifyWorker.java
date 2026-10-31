package com.spotify.androidx.workmanager;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import p.hhp0;
import p.ob51;
import p.x8d0;
import p.y8d0;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/androidx/workmanager/SpotifyWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/zvl1;", "tracker", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/zvl1;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_androidx_workmanager-workmanager"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SpotifyWorker extends Worker {
    public final WorkerParameters e;
    public final zvl1 f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotifyWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, new zvl1());
        hhp0 hhp0Var = hhp0.a;
    }

    public final void c() {
        zvl1 zvl1Var = this.f;
        int iH = ob51.h(this);
        synchronized (zvl1Var) {
            zvl1Var.b();
            zvl1Var.a(iH);
        }
    }

    public final y8d0 f() {
        String simpleName = getClass().getSimpleName();
        String name = getClass().getName();
        WorkerParameters workerParameters = this.e;
        String string = workerParameters.a.toString();
        int i = workerParameters.c;
        zvl1 zvl1Var = this.f;
        zvl1Var.f(simpleName, name, i, string);
        try {
            x8d0 x8d0VarG = g();
            if (b()) {
                zvl1Var.b();
            } else {
                zvl1Var.c(ob51.p(x8d0VarG));
            }
            zvl1Var.d(ob51.h(this));
            return x8d0VarG;
        } catch (Throwable th) {
            try {
                zvl1Var.e(th);
                throw th;
            } catch (Throwable th2) {
                zvl1Var.d(ob51.h(this));
                throw th2;
            }
        }
    }

    public abstract x8d0 g();

    public SpotifyWorker(Context context, WorkerParameters workerParameters, zvl1 zvl1Var) {
        super(context, workerParameters);
        this.e = workerParameters;
        this.f = zvl1Var;
    }
}
