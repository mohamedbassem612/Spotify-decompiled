package p;

import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.eventsender.api.EventSenderCoreBridge;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yb00 implements AnalyticsDelegate {
    public final EventSenderCoreBridge a;

    public yb00(EventSenderCoreBridge eventSenderCoreBridge) {
        this.a = eventSenderCoreBridge;
    }

    @Override // com.spotify.connectivity.AnalyticsDelegate
    public final void logEvent(byte[] bArr, byte[] bArr2) {
        this.a.send(bArr, bArr2, null, null);
    }
}
