package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class md6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i2c b;
    public final /* synthetic */ yj41 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ qim0 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ md6(i2c i2cVar, yj41 yj41Var, int i, boolean z, boolean z2, boolean z3, boolean z4, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i2cVar;
        this.c = yj41Var;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = qim0Var;
        this.t = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.t;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                ggo1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ggo1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                ggo1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                ggo1.b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }
}
