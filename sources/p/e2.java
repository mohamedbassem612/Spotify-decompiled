package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ tn30 f;
    public final /* synthetic */ cyn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(String str, String str2, int i, int i2, tn30 tn30Var, cyn cynVar, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = tn30Var;
        this.g = cynVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                cyn cynVar = this.g;
                int iP = czo1.p(262145);
                pro1.g(this.b, this.c, this.d, this.e, this.f, cynVar, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                cyn cynVar2 = this.g;
                int iP2 = czo1.p(262145);
                pro1.g(this.b, this.c, this.d, this.e, this.f, cynVar2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
