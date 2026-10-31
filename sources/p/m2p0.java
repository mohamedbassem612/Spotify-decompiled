package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m2p0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y3p0 b;
    public final /* synthetic */ alt0 c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2p0(y3p0 y3p0Var, alt0 alt0Var, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = y3p0Var;
        this.c = alt0Var;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        alt0 alt0Var = this.c;
        y3p0 y3p0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boo1.o(y3p0Var, alt0Var, qim0Var, b0kVar, czo1.p(1));
                break;
            default:
                boo1.o(y3p0Var, alt0Var, qim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
