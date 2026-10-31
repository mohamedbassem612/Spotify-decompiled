package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g8o implements h8q0 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ File c;
    public final /* synthetic */ AtomicReference d;

    public g8o(Context context, boolean z, File file, AtomicReference atomicReference) {
        this.a = context;
        this.b = z;
        this.c = file;
        this.d = atomicReference;
    }

    @Override // p.h8q0
    public final void onSuccess(Object obj) {
        Context context = this.a;
        try {
            List<CronetProvider> allProviders = CronetProvider.getAllProviders(context);
            Logger.g("CronetRuntime: available providers (%d):", Integer.valueOf(allProviders.size()));
            for (CronetProvider cronetProvider : allProviders) {
                Logger.g("CronetRuntime:   %s (version=%s, enabled=%s)", cronetProvider.getName(), cronetProvider.getVersion(), Boolean.valueOf(cronetProvider.isEnabled()));
            }
            this.d.set(new CronetEngine.Builder(context).enableQuic(this.b).setStoragePath(this.c.getAbsolutePath()).enableHttpCache(3, 5242880L).build());
            Logger.g("CronetRuntime: engine created", new Object[0]);
        } catch (Exception e) {
            n57.t("CronetRuntime: engine creation failed: " + e.getMessage(), e);
        }
    }
}
