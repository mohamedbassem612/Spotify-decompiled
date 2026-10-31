package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rk9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rk9(jl9 jl9Var, int i, al9 al9Var, d0r d0rVar, qim0 qim0Var, xtb0 xtb0Var, boolean z, int i2, int i3) {
        super(2);
        this.g = jl9Var;
        this.d = i;
        this.h = al9Var;
        this.i = d0rVar;
        this.c = qim0Var;
        this.t = xtb0Var;
        this.b = z;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                xtb0 xtb0Var = (xtb0) obj3;
                int iP = czo1.p(i | 1);
                byte b2 = this.f;
                int i2 = this.d;
                z1p1.a((jl9) obj6, i2, (al9) obj5, (d0r) obj4, this.c, xtb0Var, this.b, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.f;
                boolean z = this.b;
                qim0 qim0Var = this.c;
                int i3 = this.d;
                aex.b(z, (iu30) obj6, qim0Var, (String) obj5, i3, (idn0) obj4, (ga80) obj3, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rk9(boolean z, iu30 iu30Var, qim0 qim0Var, String str, int i, idn0 idn0Var, ga80 ga80Var, int i2, int i3) {
        super(2);
        this.b = z;
        this.g = iu30Var;
        this.c = qim0Var;
        this.h = str;
        this.d = i;
        this.i = idn0Var;
        this.t = ga80Var;
        this.e = i2;
        this.f = i3;
    }
}
