package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v9a implements bv1 {
    public final Resources a;
    public final boolean b;

    public v9a(Resources resources, boolean z) {
        this.a = resources;
        this.b = z;
    }

    @Override // p.bv1
    public final int a(int i, int i2) {
        Resources resources = this.a;
        int i3 = resources.getDisplayMetrics().heightPixels;
        return (this.b || resources.getConfiguration().fontScale > 2.0f || i2 >= i3 / 2) ? i3 : yoi1.p(i, 0, i3);
    }
}
