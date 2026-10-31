package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k5o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbo1 b;
    public final /* synthetic */ j5o c;
    public final /* synthetic */ af10 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ly2 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k5o(pbo1 pbo1Var, j5o j5oVar, af10 af10Var, iu30 iu30Var, ly2 ly2Var, iu30 iu30Var2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pbo1Var;
        this.c = j5oVar;
        this.d = af10Var;
        this.e = iu30Var;
        this.f = ly2Var;
        this.g = iu30Var2;
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
                this.b.d(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.d(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
