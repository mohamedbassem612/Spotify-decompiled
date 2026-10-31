package p;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k0a1 {
    public final yqg a;
    public final Resources b;

    public k0a1(Context context, yqg yqgVar) {
        this.a = yqgVar;
        this.b = context.getResources();
    }

    public final String a(double d, int i) {
        return this.b.getString(i, d % 1.0d == 0.0d ? String.valueOf((int) d) : String.valueOf(d));
    }

    public final String b(int i, long j) {
        return this.b.getQuantityString(i, (int) j, Long.valueOf(j));
    }
}
