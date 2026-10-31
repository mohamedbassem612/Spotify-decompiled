package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kj6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj6(phz0 phz0Var, ohz0 ohz0Var, ohz0 ohz0Var2, boolean z, float f, boolean z2, boolean z3, int i) {
        super(2);
        this.g = phz0Var;
        this.h = ohz0Var;
        this.i = ohz0Var2;
        this.b = z;
        this.c = f;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                b4g1 b4g1Var = (b4g1) obj4;
                iu30 iu30Var = (iu30) obj3;
                int iP = czo1.p(1572865);
                boolean z = this.b;
                boolean z2 = this.d;
                boolean z3 = this.e;
                gio1.k(z, z2, z3, (xd6) obj5, this.f, this.c, b4g1Var, iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.f | 1);
                omo1.h((phz0) obj5, (ohz0) obj4, (ohz0) obj3, this.b, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj6(boolean z, boolean z2, boolean z3, xd6 xd6Var, int i, float f, b4g1 b4g1Var, iu30 iu30Var, int i2) {
        super(2);
        this.b = z;
        this.d = z2;
        this.e = z3;
        this.g = xd6Var;
        this.f = i;
        this.c = f;
        this.h = b4g1Var;
        this.i = iu30Var;
    }
}
