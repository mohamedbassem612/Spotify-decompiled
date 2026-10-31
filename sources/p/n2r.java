package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface n2r {
    ymd0 getState();

    default Bundle serialize() {
        return null;
    }

    void start();

    void stop();
}
