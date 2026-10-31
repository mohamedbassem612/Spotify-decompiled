package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hdf0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public Bitmap f;

    public hdf0(int i, int i2, String str, String str2, String str3) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final hdf0 a(float f) {
        int i = (int) (this.a * f);
        int i2 = (int) (this.b * f);
        hdf0 hdf0Var = new hdf0(i, i2, this.c, this.d, this.e);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            hdf0Var.f = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return hdf0Var;
    }

    public final String b() {
        return this.d;
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final int e() {
        return this.a;
    }

    public final void f(Bitmap bitmap) {
        this.f = bitmap;
    }
}
