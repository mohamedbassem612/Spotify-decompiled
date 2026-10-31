package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vc60(gd60 gd60Var, float f, float f2, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = (byte) 0;
        this.g = gd60Var;
        this.b = f;
        this.d = f2;
        this.c = qim0Var;
        this.e = i;
        this.f = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                boo1.q((gd60) obj3, this.b, this.d, this.c, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                fy81.a((k37) obj3, this.b, this.c, this.d, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                byte b4 = this.f;
                pok1.h((Function0) obj3, this.b, this.c, this.d, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vc60(Object obj, float f, qim0 qim0Var, float f2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.g = obj;
        this.b = f;
        this.c = qim0Var;
        this.d = f2;
        this.e = i;
        this.f = i2;
    }
}
