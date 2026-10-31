package p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class l2p extends jw9 {
    public l2p() {
        super(fmv.Z.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, Intent intent) {
        j1e1.s(this, context);
        b(context, intent);
    }

    public abstract void b(Context context, Intent intent);
}
