package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ta60 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oc60(ta60 ta60Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ta60Var;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        qim0 qim0Var = this.c;
        ta60 ta60Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kno1.i(ta60Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                ioo1.f(ta60Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                poo1.i(ta60Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                too1.c(ta60Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                voo1.e(ta60Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
