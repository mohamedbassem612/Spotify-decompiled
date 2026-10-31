package p;

import android.content.Context;
import com.spotify.collection.downloaded.service.OffliningService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class byl implements ayl {
    public final Context a;

    public byl(Context context) {
        this.a = context;
    }

    @Override // p.ayl
    public final void a(String str, String str2) {
        int i = OffliningService.b;
        zod.Q(this.a, str, false);
    }

    @Override // p.ayl
    public final void d(String str, String str2) {
        int i = OffliningService.b;
        zod.Q(this.a, str, true);
    }
}
