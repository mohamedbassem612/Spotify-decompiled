package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ovf extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovf(qim0 qim0Var, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 3;
        this.d = qim0Var;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        boolean z2 = this.b;
        qim0 qim0Var = this.d;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                byo1.b(czo1.p(49), b0kVar, qim0Var, z2, z);
                break;
            case 1:
                z5p1.e(czo1.p(1), b0kVar, qim0Var, z2, z);
                break;
            case 2:
                crm0.d(czo1.p(1), b0kVar, qim0Var, z2, z);
                break;
            default:
                kno1.k(czo1.p(433), b0kVar, qim0Var, z2, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovf(boolean z, qim0 qim0Var, boolean z2, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = z;
        this.d = qim0Var;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovf(boolean z, boolean z2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = qim0Var;
    }
}
