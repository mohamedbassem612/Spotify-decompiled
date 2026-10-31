package p;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l3k {
    public final Map a;

    public l3k(Map map) {
        this.a = map;
    }

    public final Bitmap a(String str) {
        Bitmap bitmap = (Bitmap) this.a.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        k220.f("No bitmap found for url: ".concat(str));
        return null;
    }
}
