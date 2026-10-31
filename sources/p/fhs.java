package p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fhs implements h611 {
    public final /* synthetic */ toj0 a;
    public final /* synthetic */ RecyclerView b;

    public fhs(toj0 toj0Var, RecyclerView recyclerView) {
        this.a = toj0Var;
        this.b = recyclerView;
    }

    public final void a(View view) throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = (AutoCloseable) ((LinkedHashMap) this.a.g).remove(view);
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                }
                if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                } else if (autoCloseable instanceof MediaDrm) {
                    ((MediaDrm) autoCloseable).release();
                    return;
                } else {
                    bhn0.q();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void c(View view) {
        toj0 toj0Var = this.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) toj0Var.g;
        if (linkedHashMap.containsKey(view)) {
            return;
        }
        linkedHashMap.put(view, ((gik1) toj0Var.b).a(view, new nxr(this.b, view, toj0Var)));
    }
}
