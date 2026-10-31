package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kd60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha60 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd60(ha60 ha60Var, long j, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ha60Var;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        ha60 ha60Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ioo1.j(ha60Var, j, b0kVar, czo1.p(1));
                break;
            default:
                ioo1.l(ha60Var, j, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
