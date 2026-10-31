package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class co1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fu1 b;
    public final /* synthetic */ kw1 c;
    public final /* synthetic */ jw1 d;
    public final /* synthetic */ ow1 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ vzq0 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ co1(fu1 fu1Var, kw1 kw1Var, jw1 jw1Var, ow1 ow1Var, iu30 iu30Var, vzq0 vzq0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = fu1Var;
        this.c = kw1Var;
        this.d = jw1Var;
        this.e = ow1Var;
        this.f = iu30Var;
        this.g = vzq0Var;
        this.h = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                p8p1.a(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                p8p1.a(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
