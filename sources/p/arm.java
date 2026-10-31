package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class arm extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ vy30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ arm(pt ptVar, vy30 vy30Var, boolean z, int i, int i2, iu30 iu30Var, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = ptVar;
        this.c = vy30Var;
        this.d = z;
        this.e = i;
        this.f = i2;
        this.g = iu30Var;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.o(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.x(this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
