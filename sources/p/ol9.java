package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ol9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jl9 b;
    public final /* synthetic */ w460 c;
    public final /* synthetic */ al9 d;
    public final /* synthetic */ d0r e;
    public final /* synthetic */ yqg f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol9(jl9 jl9Var, w460 w460Var, al9 al9Var, d0r d0rVar, yqg yqgVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = jl9Var;
        this.c = w460Var;
        this.d = al9Var;
        this.e = d0rVar;
        this.f = yqgVar;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                g2p1.c(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                g2p1.c(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
