package com.spotify.androidx.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import p.lnm;
import p.s3b1;
import p.upn1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/androidx/workmanager/CoroutineDaggerWorker;", "Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_androidx_workmanager-workmanager"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class CoroutineDaggerWorker extends SpotifyCoroutineWorker {
    public CoroutineDaggerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final Object i(lnm lnmVar) {
        upn1.w(this);
        return j((s3b1) lnmVar);
    }

    public abstract Object j(s3b1 s3b1Var);
}
