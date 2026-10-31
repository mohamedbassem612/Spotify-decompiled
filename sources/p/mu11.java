package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mu11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mu11(float f, float f2, int i, qim0 qim0Var) {
        super(2);
        this.b = f;
        this.c = f2;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = this.e;
        float f = this.c;
        float f2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b3 = this.e;
                l4p1.k(this.b, this.c, iP, b3, (b0k) obj, (qim0) obj3);
                break;
            case 1:
                ((Number) obj2).intValue();
                c8o.f(f2, f, (qim0) obj3, (b0k) obj, czo1.p(b2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                rck.b((String) obj3, f2, f, (b0k) obj, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mu11(float f, int i, float f2, qim0 qim0Var, int i2) {
        super(2);
        this.b = f;
        this.c = f2;
        this.d = qim0Var;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mu11(String str, float f, float f2, int i) {
        super(2);
        this.d = str;
        this.b = f;
        this.c = f2;
        this.e = i;
    }
}
