package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pk6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk6(long j, String str, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = j;
        this.b = str;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                iu30 iu30Var = this.d;
                rk6.c(czo1.p(1), this.c, this.b, (b0k) obj, iu30Var);
                break;
            case 1:
                ((Number) obj2).intValue();
                iu30 iu30Var2 = this.d;
                rk6.c(czo1.p(1), this.c, this.b, (b0k) obj, iu30Var2);
                break;
            default:
                ((Number) obj2).intValue();
                iu30 iu30Var3 = this.d;
                u4p1.k(czo1.p(1), this.c, this.b, (b0k) obj, iu30Var3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk6(String str, long j, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = j;
        this.d = iu30Var;
    }
}
