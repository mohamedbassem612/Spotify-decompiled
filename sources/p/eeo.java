package p;

import android.graphics.Bitmap;
import android.text.Layout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eeo {
    public CharSequence a = null;
    public Bitmap b = null;
    public Layout.Alignment c = null;
    public Layout.Alignment d = null;
    public float e = -3.4028235E38f;
    public int f = os00.INVALID_ID;
    public int g = os00.INVALID_ID;
    public float h = -3.4028235E38f;
    public int i = os00.INVALID_ID;
    public int j = os00.INVALID_ID;
    public float k = -3.4028235E38f;
    public float l = -3.4028235E38f;
    public float m = -3.4028235E38f;
    public boolean n = false;
    public int o = -16777216;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44p = os00.INVALID_ID;
    public float q;
    public int r;

    public final feo a() {
        return new feo(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.f44p, this.q, this.r);
    }

    public final CharSequence b() {
        return this.a;
    }

    public final void c(CharSequence charSequence) {
        this.a = charSequence;
        this.b = null;
    }

    public final void d() {
        this.k = -3.4028235E38f;
        this.j = os00.INVALID_ID;
    }
}
