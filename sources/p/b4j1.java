package p;

import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b4j1 extends UrlRequest.StatusListener {
    public final UrlRequest.StatusListener a;

    public b4j1(UrlRequest.StatusListener statusListener) {
        this.a = statusListener;
    }

    @Override // org.chromium.net.UrlRequest.StatusListener
    public final void onStatus(int i) {
        this.a.onStatus(i);
    }
}
