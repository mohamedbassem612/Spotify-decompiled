package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dp9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hux b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dp9(hux huxVar, String str, Function0 function0, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = huxVar;
        this.c = str;
        this.d = function0;
        this.e = qim0Var;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                g3p1.f(czo1.p(b2 | 1), this.c, this.d, (b0k) obj, this.b, this.e);
                break;
            case 1:
                ((Number) obj2).intValue();
                myo1.c(czo1.p(b2 | 1), this.c, this.d, (b0k) obj, this.b, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                r4o1.p(czo1.p(b2 | 1), this.c, this.d, (b0k) obj, this.b, this.e);
                break;
        }
        return rih1Var;
    }
}
