package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h13 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h13(hux huxVar, int i, int i2, int i3) {
        super(2);
        this.a = (byte) 2;
        this.c = huxVar;
        this.b = i;
        this.d = i2;
        this.e = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.e;
        int i = this.d;
        int i2 = this.b;
        Object obj3 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                k1u.b(i2, czo1.p(i | 1), b2, b0kVar, (qim0) obj3);
                break;
            case 1:
                kqn1.d(i2, czo1.p(i | 1), b2, b0kVar, (qim0) obj3);
                break;
            default:
                n1p1.c((hux) obj3, i2, i, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h13(byte b, int i, int i2, int i3, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = qim0Var;
        this.d = i2;
        this.e = i3;
    }
}
