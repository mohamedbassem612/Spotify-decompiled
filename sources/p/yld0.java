package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yld0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yld0(String str, String str2, String str3, String str4, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                int iP = czo1.p(1);
                o1p1.a(this.b, this.c, this.d, this.e, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                int iP2 = czo1.p(1);
                o1p1.b(this.b, this.c, this.d, this.e, qim0Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.f;
                int iP3 = czo1.p(1);
                ilo1.i(this.b, this.c, this.d, this.e, qim0Var3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
