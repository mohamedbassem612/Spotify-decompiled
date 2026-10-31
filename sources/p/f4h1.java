package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface f4h1 {
    Object getView();

    default Bundle serialize() {
        return null;
    }

    void start();

    void stop();
}
