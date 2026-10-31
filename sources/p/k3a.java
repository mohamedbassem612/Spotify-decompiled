package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k3a extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ short d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k3a(Uri uri, String str, boolean z, String str2, hdn0 hdn0Var, int i, int i2) {
        super(2);
        this.e = uri;
        this.f = str;
        this.b = z;
        this.g = str2;
        this.h = hdn0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.d;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                boolean z = this.b;
                int i = this.c;
                ((uq8) obj6).D(z, i, (fbp1) obj5, (c380) obj4, (vu30) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                boolean z2 = this.b;
                j7p1.m((Uri) obj6, (String) obj5, z2, (String) obj4, (hdn0) obj3, this.c, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k3a(uq8 uq8Var, boolean z, int i, fbp1 fbp1Var, c380 c380Var, vu30 vu30Var, int i2) {
        super(2);
        this.e = uq8Var;
        this.b = z;
        this.c = i;
        this.f = fbp1Var;
        this.g = c380Var;
        this.h = vu30Var;
        this.d = i2;
    }
}
