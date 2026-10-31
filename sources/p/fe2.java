package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fe2 implements Connectable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EventSource b;

    public /* synthetic */ fe2(EventSource eventSource, byte b) {
        this.a = b;
        this.b = eventSource;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        EventSource eventSource = this.b;
        switch (b) {
            case 0:
                return new bd2(eventSource.a(consumer), (byte) 1);
            case 1:
                return new bd2(eventSource.a(consumer), (byte) 3);
            case 2:
                return new bd2(eventSource.a(consumer), (byte) 4);
            case 3:
                return new bd2(eventSource.a(consumer), (byte) 5);
            default:
                return new bd2(eventSource.a(consumer), (byte) 12);
        }
    }
}
