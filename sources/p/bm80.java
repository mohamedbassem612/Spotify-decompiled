package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bm80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zl80 b;
    public final /* synthetic */ ul80 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm80(zl80 zl80Var, ul80 ul80Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = zl80Var;
        this.c = ul80Var;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        ul80 ul80Var = this.c;
        zl80 zl80Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x8p1.a(zl80Var, ul80Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                x8p1.e(zl80Var, ul80Var, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
