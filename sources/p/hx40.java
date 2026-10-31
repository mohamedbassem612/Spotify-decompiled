package p;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hx40 {
    public final zf50 a;
    public final SparseIntArray b = new SparseIntArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    public hx40(Context context, boolean z) {
        this.j = z;
        context.getClass();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166166);
        this.d = dimensionPixelSize;
        this.e = resources.getDimensionPixelSize(2131166161);
        this.f = resources.getDimensionPixelSize(2131166160);
        this.h = resources.getDimensionPixelSize(2131166167);
        this.g = dimensionPixelSize / 4;
        int dimensionPixelSize2 = z ? resources.getDimensionPixelSize(2131165541) : 0;
        this.i = dimensionPixelSize2;
        this.a = new zf50(dimensionPixelSize, dimensionPixelSize2, bno1.s(context));
    }

    public final void a() {
        ((SparseIntArray) this.a.e).clear();
        this.b.clear();
    }
}
