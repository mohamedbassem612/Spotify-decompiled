package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tdx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ydx b;
    public final /* synthetic */ xu30 c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ xu30 e;
    public final /* synthetic */ xu30 f;
    public final /* synthetic */ xu30 g;
    public final /* synthetic */ xu30 h;
    public final /* synthetic */ xu30 i;
    public final /* synthetic */ xu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tdx(ydx ydxVar, xu30 xu30Var, j2i j2iVar, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ydxVar;
        this.c = xu30Var;
        this.d = j2iVar;
        this.e = xu30Var2;
        this.f = xu30Var3;
        this.g = xu30Var4;
        this.h = xu30Var5;
        this.i = xu30Var6;
        this.t = xu30Var7;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                xu30 xu30Var = this.t;
                int iP = czo1.p(1);
                ioo1.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, xu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                xu30 xu30Var2 = this.t;
                int iP2 = czo1.p(1);
                ioo1.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, xu30Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
