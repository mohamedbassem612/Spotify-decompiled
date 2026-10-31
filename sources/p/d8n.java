package p;

import com.spotify.concurrency.asyncimpl.NativeTimerManagerThreadImpl;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d8n implements a8n, f961 {
    public final NativeTimerManagerThreadImpl a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final lo9 c = new lo9(this, (byte) 23);

    public d8n() {
        NativeTimerManagerThreadImpl nativeTimerManagerThreadImplCreate = NativeTimerManagerThreadImpl.INSTANCE.create("Core Thread");
        nativeTimerManagerThreadImplCreate.start();
        this.a = nativeTimerManagerThreadImplCreate;
    }

    public final void shutdown() {
        this.b.set(true);
        NativeTimerManagerThreadImpl nativeTimerManagerThreadImpl = this.a;
        nativeTimerManagerThreadImpl.stop();
        nativeTimerManagerThreadImpl.destroy();
    }

    public final Object getApi() {
        return this;
    }
}
