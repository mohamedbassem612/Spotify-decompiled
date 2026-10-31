package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fou extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fou(boolean z, int i, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 0;
        this.c = z;
        this.b = i;
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
                qxd0.l(this.b, iP, this.d, (b0k) obj, this.e, this.c);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ot11.e(this.b, iP2, this.d, (b0k) obj, this.e, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                rqg0.r(this.b, iP3, this.d, (b0k) obj, this.e, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fou(int i, boolean z, Function0 function0, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = z;
        this.d = function0;
        this.e = qim0Var;
        this.f = i2;
    }
}
