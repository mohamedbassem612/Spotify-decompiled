package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class mub0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ hab1 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ fvb0 d;
    public final /* synthetic */ zzq0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ iq20 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ hxq0 i;
    public final /* synthetic */ iu30 t;

    public /* synthetic */ mub0(hab1 hab1Var, qim0 qim0Var, fvb0 fvb0Var, zzq0 zzq0Var, float f, c36 c36Var, iq20 iq20Var, boolean z, hxq0 hxq0Var, iu30 iu30Var, int i) {
        this.b = hab1Var;
        this.c = qim0Var;
        this.d = fvb0Var;
        this.e = zzq0Var;
        this.f = f;
        this.X = c36Var;
        this.g = iq20Var;
        this.h = z;
        this.i = hxq0Var;
        this.t = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Integer) obj2).getClass();
                int iP = czo1.p(1);
                boo1.f(this.b, this.c, this.d, this.e, this.f, (c36) obj3, this.g, this.h, this.i, this.t, (b0k) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = czo1.p(1);
                boo1.e(this.b, this.c, this.d, this.e, (g36) obj3, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    public /* synthetic */ mub0(hab1 hab1Var, qim0 qim0Var, fvb0 fvb0Var, zzq0 zzq0Var, g36 g36Var, float f, iq20 iq20Var, boolean z, hxq0 hxq0Var, iu30 iu30Var, int i) {
        this.b = hab1Var;
        this.c = qim0Var;
        this.d = fvb0Var;
        this.e = zzq0Var;
        this.X = g36Var;
        this.f = f;
        this.g = iq20Var;
        this.h = z;
        this.i = hxq0Var;
        this.t = iu30Var;
    }
}
