package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bj80 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ lz20 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Uri i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj80(iu30 iu30Var, lz20 lz20Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Uri uri, String str, boolean z7, boolean z8, boolean z9, int i) {
        super(2);
        this.a = iu30Var;
        this.b = lz20Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = uri;
        this.t = str;
        this.X = z7;
        this.Y = z8;
        this.Z = z9;
        this.N0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.N0 | 1);
        h7p1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP);
        return rih1.a;
    }
}
