package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kws0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gxs0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kws0(gxs0 gxs0Var, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = gxs0Var;
        this.c = function0;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        Function0 function0 = this.c;
        gxs0 gxs0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ows0.a(gxs0Var, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                ows0.b(gxs0Var, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                ows0.c(gxs0Var, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                ows0.h(gxs0Var, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                ows0.i(gxs0Var, function0, qim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
