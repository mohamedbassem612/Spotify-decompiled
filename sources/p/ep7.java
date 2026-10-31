package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ep7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ep7(float f, float f2, float f3, cr31 cr31Var, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.g = cr31Var;
        this.e = i;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.e;
        Object obj3 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.f;
                ((fp7) obj3).g(this.b, this.c, this.d, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.f;
                float f = this.b;
                float f2 = this.c;
                float f3 = this.d;
                i6p1.d(f, f2, f3, (cr31) obj3, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(s | 1);
                byte b4 = this.f;
                ((mta) obj3).j(this.b, this.c, this.d, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ep7(Object obj, float f, float f2, float f3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.g = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = i2;
    }
}
