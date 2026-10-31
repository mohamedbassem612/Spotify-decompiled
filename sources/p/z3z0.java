package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z3z0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z3z0(byte b, int i, int i2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.c = qim0Var;
        this.b = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        qim0 qim0Var = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zho1.k(czo1.p(1), b0kVar, qim0Var, z);
                break;
            case 1:
                zho1.w(czo1.p(1), b0kVar, qim0Var, z);
                break;
            case 2:
                gio1.h(czo1.p(1), b0kVar, qim0Var, z);
                break;
            case 3:
                i3o1.e(czo1.p(1), z ? 1 : 0, b0kVar, qim0Var);
                break;
            case 4:
                fap1.b(czo1.p(1), b0kVar, qim0Var, z);
                break;
            case 5:
                j2p1.q(czo1.p(1), b0kVar, qim0Var, z);
                break;
            default:
                rc2.j(czo1.p(1), z ? 1 : 0, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3z0(boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = qim0Var;
    }
}
