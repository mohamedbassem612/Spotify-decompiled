package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mf6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ cv30 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf6(hg6 hg6Var, boolean z, boolean z2, boolean z3, int i, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.h = hg6Var;
        this.b = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.i = function0;
        this.c = qim0Var;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        Object obj3 = this.c;
        iu30 iu30Var = this.i;
        Object obj4 = this.h;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                boolean z2 = this.d;
                boolean z3 = this.e;
                int i2 = this.f;
                wgo1.a((hg6) obj4, z, z2, z3, i2, (Function0) iu30Var, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z4 = this.b;
                u0p1.a(z4, (aa9) obj4, iu30Var, (qim0) obj3, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                vzq0 vzq0Var = (vzq0) obj3;
                int iP3 = czo1.p(i | 1);
                boolean z5 = this.b;
                u0p1.b(z5, (aa9) obj4, iu30Var, this.f, this.d, this.e, vzq0Var, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z6 = this.b;
                int i3 = this.f;
                boolean z7 = this.d;
                boolean z8 = this.e;
                tm80.l((hdh1) obj4, z6, i3, z7, z8, iu30Var, (qim0) obj3, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf6(hdh1 hdh1Var, boolean z, int i, boolean z2, boolean z3, iu30 iu30Var, qim0 qim0Var, int i2) {
        super(2);
        this.h = hdh1Var;
        this.b = z;
        this.f = i;
        this.d = z2;
        this.e = z3;
        this.i = iu30Var;
        this.c = qim0Var;
        this.g = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf6(boolean z, aa9 aa9Var, iu30 iu30Var, int i, boolean z2, boolean z3, vzq0 vzq0Var, int i2) {
        super(2);
        this.b = z;
        this.h = aa9Var;
        this.i = iu30Var;
        this.f = i;
        this.d = z2;
        this.e = z3;
        this.c = vzq0Var;
        this.g = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf6(boolean z, aa9 aa9Var, iu30 iu30Var, qim0 qim0Var, boolean z2, boolean z3, int i, int i2) {
        super(2);
        this.b = z;
        this.h = aa9Var;
        this.i = iu30Var;
        this.c = qim0Var;
        this.d = z2;
        this.e = z3;
        this.f = i;
        this.g = i2;
    }
}
