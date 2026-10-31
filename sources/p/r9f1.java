package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r9f1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ wi90 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9f1(wi90 wi90Var, int i, float f, boolean z, int i2, boolean z2, qim0 qim0Var, int i3) {
        super(2);
        this.b = wi90Var;
        this.c = i;
        this.e = f;
        this.d = z;
        this.h = i2;
        this.f = z2;
        this.g = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.g;
                int iP = czo1.p(1);
                d1u.y(this.e, this.c, this.h, iP, (b0k) obj, this.b, qim0Var, this.d, this.f);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.h | 1);
                wmo1.i(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.g;
                int iP3 = czo1.p(1);
                wmo1.j(this.e, this.c, this.h, iP3, (b0k) obj, this.b, qim0Var2, this.d, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9f1(wi90 wi90Var, int i, boolean z, float f, boolean z2, qim0 qim0Var, int i2) {
        super(2);
        this.b = wi90Var;
        this.c = i;
        this.d = z;
        this.e = f;
        this.f = z2;
        this.g = qim0Var;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9f1(wi90 wi90Var, int i, boolean z, int i2, float f, boolean z2, qim0 qim0Var, int i3) {
        super(2);
        this.b = wi90Var;
        this.c = i;
        this.d = z;
        this.h = i2;
        this.e = f;
        this.f = z2;
        this.g = qim0Var;
    }
}
