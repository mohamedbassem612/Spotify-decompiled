package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kbe extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i2c b;
    public final /* synthetic */ rdm1 c;
    public final /* synthetic */ Set d;
    public final /* synthetic */ idm1 e;
    public final /* synthetic */ iu30 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kbe(i2c i2cVar, rdm1 rdm1Var, Set set, idm1 idm1Var, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = i2cVar;
        this.c = rdm1Var;
        this.d = set;
        this.e = idm1Var;
        this.f = iu30Var;
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
                dko1.c(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                dko1.c(this.b, this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
