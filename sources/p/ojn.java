package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ojn extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ojn(c380 c380Var, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = function0;
        this.d = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        Function0 function1 = this.c;
        c380 c380Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                voo1.d(c380Var, function1, function0, b0kVar, czo1.p(1));
                break;
            default:
                yto.f(c380Var, function1, function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
