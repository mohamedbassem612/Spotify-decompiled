package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class f45 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;

    public /* synthetic */ f45(byte b, int i, j2i j2iVar, qim0 qim0Var) {
        this.a = b;
        this.b = qim0Var;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        j2i j2iVar = this.c;
        qim0 qim0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hon1.g(czo1.p(i | 1), j2iVar, b0kVar, qim0Var);
                break;
            case 1:
                hon1.f(czo1.p(i | 1), j2iVar, b0kVar, qim0Var);
                break;
            case 2:
                fus.d(czo1.p(i | 1), j2iVar, b0kVar, qim0Var);
                break;
            case 3:
                ryo1.i(czo1.p(i | 1), j2iVar, b0kVar, qim0Var);
                break;
            default:
                ryo1.h(czo1.p(i | 1), j2iVar, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }
}
