package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rx1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx1(Function0 function0, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        j2i j2iVar = this.c;
        Function0 function0 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                v9p1.d(function0, j2iVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                k2r0.b(function0, j2iVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
