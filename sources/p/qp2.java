package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qp2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fq2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qp2(fq2 fq2Var, byte b) {
        super(0);
        this.a = b;
        this.b = fq2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        fq2 fq2Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                mr4 mr4Var = fq2Var.l;
                if ((mr4Var.t() || mr4Var.g()) && mr4Var.y()) {
                    return new bp60(fq2Var.q, new dt0(fq2Var, null, (byte) 7));
                }
                return null;
            case 1:
                return fq2Var.f.a(krw0.i.f).a();
            default:
                lpm1 lpm1Var = fq2Var.h;
                cr51 cr51VarA = fq2Var.i.a((w9u0) fq2Var.T.getValue());
                lpm1Var.getClass();
                return new mpm1(cr51VarA);
        }
    }
}
