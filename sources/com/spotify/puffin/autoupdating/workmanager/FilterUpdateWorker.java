package com.spotify.puffin.autoupdating.workmanager;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.DaggerRxWorker;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/puffin/autoupdating/workmanager/FilterUpdateWorker;", "Lcom/spotify/androidx/workmanager/DaggerRxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_puffin_autoupdating-autoupdating"}, k = 1, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class FilterUpdateWorker extends DaggerRxWorker {
    public FilterUpdateWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final Single h() {
        u890.C("updateAllFiltersUseCase");
        throw null;
    }
}
