package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y6r extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ x6r c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6r(iu30 iu30Var, o0g1 o0g1Var, x6r x6rVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = x6rVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x6r x6rVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30Var.invoke(new u6r(x6rVar.c.plusMonths(1L)));
                break;
            default:
                iu30Var.invoke(new u6r(x6rVar.c.minusMonths(1L)));
                break;
        }
        return rih1Var;
    }
}
