package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qk7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk7(c380 c380Var, int i, boolean z, iu30 iu30Var, Function0 function0, int i2) {
        super(2);
        this.b = c380Var;
        this.f = i;
        this.d = z;
        this.c = iu30Var;
        this.e = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = this.e;
                int iP = czo1.p(1);
                zqo1.e(this.b, this.f, this.d, this.c, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.f | 1);
                ltn1.c(this.b, this.c, nim0.a, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk7(c380 c380Var, iu30 iu30Var, boolean z, Function0 function0, int i) {
        super(2);
        this.b = c380Var;
        this.c = iu30Var;
        this.d = z;
        this.e = function0;
        this.f = i;
    }
}
