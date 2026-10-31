package p;

import com.spotify.core.http.CronetRuntime;
import com.spotify.core.http.HttpConnectionFactory;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h8o implements CronetRuntime {
    public final AtomicReference a;
    public final ScheduledExecutorService b;
    public final File c;
    public final yqg d;
    public final Function0 e;
    public final boolean f;

    public h8o(AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, File file, yqg yqgVar, Function0 function0, boolean z) {
        this.a = atomicReference;
        this.b = scheduledExecutorService;
        this.c = file;
        this.d = yqgVar;
        this.e = function0;
        this.f = z;
    }

    @Override // com.spotify.core.http.CronetRuntime
    public final void clearCache() {
        File[] fileArrListFiles = this.c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.getClass();
                y520.E(file);
            }
        }
    }

    @Override // com.spotify.core.http.CronetRuntime
    public final HttpConnectionFactory wrapFactory(HttpConnectionFactory httpConnectionFactory) {
        return new wzn(this, httpConnectionFactory, this.d);
    }
}
