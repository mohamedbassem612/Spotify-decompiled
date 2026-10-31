package p;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m65 implements UrlRequest$StatusListener {
    public final UrlRequest.StatusListener a;

    public m65(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
