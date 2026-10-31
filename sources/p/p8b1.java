package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p8b1 implements ufg1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;

    public p8b1(int i, int i2, int i3, int i4, int i5, int i6, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = str;
    }

    public final Bitmap a(Bitmap bitmap, Integer num, Integer num2) {
        int i = this.e;
        int i2 = this.c;
        int i3 = this.f;
        int i4 = this.d;
        return Bitmap.createBitmap(bitmap, i * i2, i3 * i4, i2, i4);
    }

    public final String b() {
        StringBuilder sbQ = cy30.q(this.a, this.b, "SpritemapTransformation(columns=", ",rows=", ",x=");
        ktd.p(this.e, this.f, ",y=", ",sourceUri=", sbQ);
        return l1d.n(this.g, ")", sbQ);
    }
}
