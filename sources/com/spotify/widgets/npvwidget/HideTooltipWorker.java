package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.SpotifyWorker;
import kotlin.Metadata;
import p.x8d0;
import p.y8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/widgets/npvwidget/HideTooltipWorker;", "Lcom/spotify/androidx/workmanager/SpotifyWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HideTooltipWorker extends SpotifyWorker {
    public final Context g;

    public HideTooltipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    public final x8d0 g() {
        Context context = this.g;
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_UPDATE");
        context.sendBroadcast(intent);
        return y8d0.a();
    }
}
