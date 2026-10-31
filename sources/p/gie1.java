package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gie1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Bitmap b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gie1(Bitmap bitmap, boolean z, boolean z2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = bitmap;
        this.c = z;
        this.d = z2;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                t9p1.g(this.b, this.c, this.d, this.e, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                vvm1.j(this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
