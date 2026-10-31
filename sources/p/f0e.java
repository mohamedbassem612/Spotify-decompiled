package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f0e extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0e(int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.b = i;
        this.d = qim0Var;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        int i = this.c;
        int i2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                wgo1.m(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 1:
                xzo1.b(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 2:
                qxd0.f(i2, czo1.p(i | 1), b0kVar, qim0Var);
                break;
            case 3:
                sjo0.a(i2, i, czo1.p(385), b0kVar, qim0Var);
                break;
            case 4:
                sbl.q(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 5:
                lvx.c(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 6:
                s1p1.o(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 7:
                j6p1.d(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 8:
                t3p1.i(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 9:
                aq8.e(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
            default:
                aq8.e(i2, i, czo1.p(1), b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0e(byte b, int i, int i2, int i3, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = qim0Var;
    }
}
