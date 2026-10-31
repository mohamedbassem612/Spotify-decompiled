package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ota0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ota0(boolean z, boolean z2, boolean z3, iu30 iu30Var, Function0 function0) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = iu30Var;
        this.f = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ltn1.k(this.b, this.c, !this.d, this.e, this.f, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                ltn1.k(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ota0(boolean z, boolean z2, boolean z3, iu30 iu30Var, Function0 function0, int i) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = iu30Var;
        this.f = function0;
    }
}
