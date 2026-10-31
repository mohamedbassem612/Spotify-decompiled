package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wx1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx1(int i, String str, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.c = i;
        this.b = str;
        this.d = function0;
        this.e = qim0Var;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                v9p1.t(this.c, iP, this.b, this.d, (b0k) obj, this.e);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                zgo1.k(this.c, iP2, this.b, this.d, (b0k) obj, this.e);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx1(String str, int i, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.b = str;
        this.c = i;
        this.d = function0;
        this.e = qim0Var;
        this.f = i2;
    }
}
