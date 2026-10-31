package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class x9c0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ iac0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;

    public /* synthetic */ x9c0(Object obj, iac0 iac0Var, iu30 iu30Var, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = iac0Var;
        this.d = iu30Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.d;
        iac0 iac0Var = this.c;
        Object obj3 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cso1.m(obj3, iac0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                cso1.k(obj3, iac0Var, iu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
