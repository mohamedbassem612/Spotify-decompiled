package p;

import android.content.Context;
import android.media.metrics.EditingSession;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m4w implements AutoCloseable {
    public EditingSession a;
    public boolean b;

    public m4w(Context context) {
        MediaMetricsManager mediaMetricsManagerG = swg0.g(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerG != null) {
            this.a = mediaMetricsManagerG.createEditingSession();
        }
    }

    public final LogSessionId a() {
        EditingSession editingSession = this.a;
        if (editingSession != null) {
            return editingSession.getSessionId();
        }
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        EditingSession editingSession = this.a;
        if (editingSession != null) {
            editingSession.close();
            this.a = null;
        }
    }
}
