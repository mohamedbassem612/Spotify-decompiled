package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lpa extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lpa(Object obj, long j, byte b) {
        super(0);
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((opa) obj).a(j);
                break;
            case 1:
                aiz aizVar = (aiz) obj;
                ao0 ao0Var = aizVar.w1;
                co0 co0Var = co0.IMPRESSION;
                xu0 xu0Var = aizVar.v1;
                t0u0.X(aizVar, ao0Var, co0Var, xu0Var.a, Long.valueOf(j), null, xu0Var.c, 8);
                break;
            case 2:
                ((d990) obj).d.t(j);
                break;
            default:
                xhx0 xhx0Var = (xhx0) obj;
                ao0 ao0Var2 = xhx0Var.w1;
                co0 co0Var2 = co0.PROGRESS;
                xu0 xu0Var2 = xhx0Var.u1;
                xhx0Var.W(ao0Var2, co0Var2, xu0Var2.a, Long.valueOf(j), xhx0Var.v1.a.d, xu0Var2.c);
                break;
        }
        return rih1Var;
    }
}
