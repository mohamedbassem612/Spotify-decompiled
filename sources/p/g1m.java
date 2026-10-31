package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g1m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wol b;
    public final /* synthetic */ ujo c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1m(wol wolVar, ujo ujoVar, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = wolVar;
        this.c = ujoVar;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        ujo ujoVar = this.c;
        wol wolVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zpn1.e(wolVar, ujoVar, function0, b0kVar, czo1.p(1));
                break;
            default:
                zpn1.e(wolVar, ujoVar, function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
