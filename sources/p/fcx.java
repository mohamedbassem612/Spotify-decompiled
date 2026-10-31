package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fcx extends hab0 implements vu30 {
    public final /* synthetic */ Uri a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ hcx c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ short t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fcx(Uri uri, qim0 qim0Var, hcx hcxVar, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        super(2);
        this.a = uri;
        this.b = qim0Var;
        this.c = hcxVar;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = j2;
        this.h = z;
        this.i = i;
        this.t = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bmq0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(this.i | 1), this.t);
        return rih1.a;
    }
}
