package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qvx extends hab0 implements vu30 {
    public final /* synthetic */ qim0 X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ tvx b;
    public final /* synthetic */ uvx c;
    public final /* synthetic */ float d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ xu30 f;
    public final /* synthetic */ xu30 g;
    public final /* synthetic */ xu30 h;
    public final /* synthetic */ xu30 i;
    public final /* synthetic */ xu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qvx(tvx tvxVar, uvx uvxVar, float f, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = tvxVar;
        this.c = uvxVar;
        this.d = f;
        this.e = xu30Var;
        this.f = xu30Var2;
        this.g = xu30Var3;
        this.h = xu30Var4;
        this.i = xu30Var5;
        this.t = xu30Var6;
        this.X = qim0Var;
        this.Y = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.Y;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                jto1.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                jto1.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                jto1.l(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
