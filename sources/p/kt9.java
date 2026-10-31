package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kt9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kt9(qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = (byte) 1;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.c;
        boolean z = this.d;
        qim0 qim0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                n3p1.b(czo1.p(b2 | 1), b0kVar, qim0Var, z);
                break;
            case 1:
                rqo1.g(czo1.p(b2 | 1), z ? 1 : 0, b0kVar, qim0Var);
                break;
            case 2:
                s9p1.t(czo1.p(b2 | 1), b0kVar, qim0Var, z);
                break;
            case 3:
                r6p1.o(b2, czo1.p(1), b0kVar, qim0Var, z);
                break;
            default:
                cev0.h(czo1.p(1), b2, b0kVar, qim0Var, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kt9(qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 4;
        this.b = qim0Var;
        this.d = z;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kt9(boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = z;
        this.b = qim0Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kt9(boolean z, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.d = z;
        this.b = qim0Var;
        this.c = i;
    }
}
