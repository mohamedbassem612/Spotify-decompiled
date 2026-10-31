package p;

import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mph0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em61 b;
    public final /* synthetic */ MediaBrowserServiceCompat.Result c;

    public /* synthetic */ mph0(em61 em61Var, MediaBrowserServiceCompat.Result result, byte b) {
        this.a = b;
        this.b = em61Var;
        this.c = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        MediaBrowserServiceCompat.Result result = this.c;
        em61 em61Var = this.b;
        switch (b) {
            case 0:
                try {
                    List list = (List) em61Var.get();
                    result.sendResult(list == null ? null : bai0.g(list));
                } catch (InterruptedException | CancellationException | ExecutionException e) {
                    oon1.I("Library operation failed", e);
                    result.sendResult(null);
                }
                break;
            default:
                try {
                    result.sendResult((MediaBrowserCompat.MediaItem) em61Var.get());
                } catch (InterruptedException | CancellationException | ExecutionException e2) {
                    oon1.I("Library operation failed", e2);
                    result.sendResult(null);
                    return;
                }
                break;
        }
    }
}
