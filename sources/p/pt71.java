package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface pt71 {
    ut71 a();

    default dma1 c() {
        return a().c(getContext());
    }

    Context getContext();
}
