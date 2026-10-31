package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tkx0 implements mkm1 {
    public final Context a;
    public final o8n b;

    public tkx0(Context context, o8n o8nVar) {
        this.a = context;
        this.b = o8nVar;
    }

    public final x8c0 getLifecycle() {
        return new dlx0(this, this.a, this.b);
    }
}
