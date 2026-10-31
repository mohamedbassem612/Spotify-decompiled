package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jpc1 extends oxa {
    public final List e;
    public final n5f0 f;
    public final int g;
    public final int h;
    public final long i;
    public final up41 j;
    public final Bitmap k;
    public Bitmap l;
    public feo m;

    public jpc1(Context context, List list, n5f0 n5f0Var, int i, int i2, long j) {
        this.e = list;
        this.f = n5f0Var;
        this.g = i;
        this.h = i2;
        this.i = j;
        this.j = new up41(context);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        this.k = bitmapCreateBitmap;
        this.l = bitmapCreateBitmap;
        this.m = new feo("", null, null, null, -3.4028235E38f, os00.INVALID_ID, os00.INVALID_ID, -3.4028235E38f, os00.INVALID_ID, os00.INVALID_ID, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, os00.INVALID_ID, 0.0f, 0);
    }

    @Override // p.oxa
    public final Bitmap a(long j) {
        Float fValueOf;
        Object next;
        n5f0 n5f0Var = this.f;
        long j2 = n5f0Var.b;
        long j3 = n5f0Var.a;
        if (j2 - j3 > 0 && j >= 0) {
            ep20 ep20Var = new ep20(z561.Y(ljc1.i, z561.T(new ps((byte) 28, (((j / 1000) - this.i) * 1000) + (j3 * 1000)), new i46(this.e, (byte) 1))));
            while (true) {
                fValueOf = null;
                if (!ep20Var.hasNext()) {
                    next = null;
                    break;
                }
                next = ep20Var.next();
                CharSequence charSequence = ((feo) next).a;
                if (charSequence != null && charSequence.length() != 0) {
                    break;
                }
            }
            feo feoVar = (feo) next;
            if (feoVar != null) {
                float f = feoVar.o;
                if (u890.j(feoVar.a, this.m.a)) {
                    return this.l;
                }
                this.m = feoVar;
                int i = this.g;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int i2 = this.h;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                float f2 = i2;
                float f3 = 1.0f * 0.0533f * f2;
                int i3 = feoVar.n;
                if (i3 == 0 || i3 == 1) {
                    Float fValueOf2 = Float.valueOf(f);
                    if (f == -3.4028235E38f) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fValueOf = Float.valueOf(fValueOf2.floatValue() * f2);
                    }
                } else if (i3 == 2) {
                    Float fValueOf3 = Float.valueOf(f);
                    if (f != -3.4028235E38f) {
                        fValueOf = fValueOf3;
                    }
                }
                ((iqc1) this.j.b).a(feoVar, bnd.g, f3, fValueOf != null ? fValueOf.floatValue() : f3, 0.08f, canvas, 0, 0, this.g, this.h);
                this.l = bitmapCreateBitmap;
                return bitmapCreateBitmap;
            }
        }
        return this.k;
    }
}
