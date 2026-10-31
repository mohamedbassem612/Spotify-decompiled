package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class n0s {
    public final Context a;

    public n0s(Context context) {
        Object obj = lz40.d;
        this.a = context;
    }

    public final g450 a() {
        Context context = this.a;
        try {
            int iC = lz40.e.c(context, mz40.a);
            h450.b(context);
            b(iC);
            return b(iC);
        } catch (Exception e) {
            Logger.d("Check for Google Play Services failed: %s", e);
            return new d450(e);
        }
    }

    public final g450 b(int i) {
        Object obj = lz40.d;
        if (i == 0) {
            return new c450(h450.b(this.a));
        }
        if (h450.g(i)) {
            Logger.g("Resolvable Google Play Services error", new Object[0]);
            return new f450(i);
        }
        Logger.k("Not resolvable Google Play Services error", new Object[0]);
        return new e450(i);
    }
}
