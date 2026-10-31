package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ff60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ff60(Uri uri, qim0 qim0Var, float f, float f2, int i, int i2) {
        super(2);
        this.a = (byte) 2;
        this.f = uri;
        this.d = qim0Var;
        this.b = f;
        this.c = f2;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.e;
                ((gf60) obj3).e(this.b, this.c, iP, b2, (b0k) obj, this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.e;
                ((c491) obj3).e(this.b, this.c, iP2, b3, (b0k) obj, this.d);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b4 = this.e;
                k2g1.a((Uri) obj3, this.d, this.b, this.c, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ff60(xpw xpwVar, float f, float f2, qim0 qim0Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.f = xpwVar;
        this.b = f;
        this.c = f2;
        this.d = qim0Var;
        this.e = i2;
    }
}
