package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g13 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ cv30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g13(iu30 iu30Var, qim0 qim0Var, int i, int i2, int i3, int i4) {
        super(2);
        this.g = iu30Var;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                qim0 qim0Var = this.b;
                int i2 = this.c;
                int i3 = this.d;
                k1u.a(qim0Var, i2, i3, (Function0) iu30Var, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                i0p1.b(iu30Var, this.b, this.c, this.d, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g13(qim0 qim0Var, int i, int i2, Function0 function0, int i3, int i4) {
        super(2);
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
        this.g = function0;
        this.e = i3;
        this.f = i4;
    }
}
