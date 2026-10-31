package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class er2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er2(String str, String str2, String str3, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 0;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.d = i;
        this.f = qim0Var;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                vbe.c(this.d, iP, this.b, this.c, this.e, (b0k) obj, this.f);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                xto1.c(this.d, iP2, this.b, this.c, this.e, (b0k) obj, this.f);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                xto1.r(this.d, iP3, this.b, this.c, this.e, (b0k) obj, this.f);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er2(String str, String str2, int i, String str3, qim0 qim0Var, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = qim0Var;
        this.g = i2;
    }
}
