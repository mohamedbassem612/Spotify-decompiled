package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eel implements EventSource {
    public final /* synthetic */ byte a;
    public final los b;

    public /* synthetic */ eel(los losVar, byte b) {
        this.a = b;
        this.b = losVar;
    }

    public final Disposable a(Consumer consumer) {
        byte b = this.a;
        los losVar = this.b;
        switch (b) {
            case 0:
                return new del(losVar.b(new m42(consumer, (byte) 9)), (byte) 0);
            default:
                return new b0c(losVar.d(new my71(consumer, (byte) 0)), (byte) 6);
        }
    }
}
