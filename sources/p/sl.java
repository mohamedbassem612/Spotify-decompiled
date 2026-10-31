package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ short f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sl(String str, String str2, qim0 qim0Var, boolean z, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = qim0Var;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.g;
                yxo1.a(this.b, this.c, this.d, this.e, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.g;
                cto1.h(this.b, this.c, this.d, this.e, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(s | 1);
                byte b4 = this.g;
                jm5.f(this.b, this.c, this.d, this.e, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }
}
