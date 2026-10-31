package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nwd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ lb50 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwd0(int i, String str, String str2, lb50 lb50Var, int i2) {
        super(2);
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = lb50Var;
        this.f = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                d3p1.t(this.b, iP, this.c, this.d, (b0k) obj, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                d3p1.u(this.b, iP2, this.c, this.d, (b0k) obj, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwd0(String str, String str2, int i, lb50 lb50Var, int i2) {
        super(2);
        this.c = str;
        this.d = str2;
        this.b = i;
        this.e = lb50Var;
        this.f = i2;
    }
}
