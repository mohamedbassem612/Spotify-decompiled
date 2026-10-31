package p;

import android.app.Application;
import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r5n1 {
    public static final mga0 a = w0h1.d(new o5n1((byte) 0));

    public static qpc a(Application application) {
        return new qpc(new File(application.getCacheDir(), "https_cache"), 41943040L);
    }
}
