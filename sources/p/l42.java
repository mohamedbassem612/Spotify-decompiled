package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l42 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l42(hux huxVar, String str, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = str;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        String str = this.c;
        hux huxVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                yoi1.f(huxVar, str, qim0Var, b0kVar, czo1.p(9));
                break;
            case 1:
                ppo1.b(huxVar, str, qim0Var, b0kVar, czo1.p(9));
                break;
            default:
                mue1.d(huxVar, str, qim0Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
