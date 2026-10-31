package com.spotify.androidx.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.rxjava3.RxWorker;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p.aj91;
import p.hhp0;
import p.m6b1;
import p.n6b1;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/spotify/androidx/workmanager/SpotifyRxWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/zvl1;", "tracker", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/zvl1;)V", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_androidx_workmanager-workmanager"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class SpotifyRxWorker extends RxWorker {
    public final WorkerParameters f;
    public final zvl1 g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotifyRxWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, new zvl1());
        hhp0 hhp0Var = hhp0.a;
    }

    public final Single f() {
        return Single.defer(new aj91(this, (byte) 2)).doOnSuccess(new m6b1(this, (byte) 0)).doOnError(new m6b1(this, (byte) 1)).doOnDispose(new n6b1(this, (byte) 0)).doFinally(new n6b1(this, (byte) 1));
    }

    public abstract Single g();

    public SpotifyRxWorker(Context context, WorkerParameters workerParameters, zvl1 zvl1Var) {
        super(context, workerParameters);
        this.f = workerParameters;
        this.g = zvl1Var;
    }
}
