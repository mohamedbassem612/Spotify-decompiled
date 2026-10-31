package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zph0 {
    public AtomicReference a;

    public final xph0 a() {
        Object obj = this.a.get();
        if (((xph0) obj) instanceof yph0) {
            Logger.b("MLS: delegate is DefaultDelegate — service not fully initialized", new Object[0]);
        }
        return (xph0) obj;
    }
}
