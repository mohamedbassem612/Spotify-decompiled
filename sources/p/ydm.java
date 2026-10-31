package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ydm extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cfm b;
    public final /* synthetic */ tem c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydm(cfm cfmVar, tem temVar, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = cfmVar;
        this.c = temVar;
        this.d = qim0Var;
        this.e = j2iVar;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.g(this.c, this.d, this.e, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.g(this.c, this.d, this.e, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                this.b.g(this.c, this.d, this.e, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
