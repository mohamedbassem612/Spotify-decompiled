package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pwx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pwx(oiw0 oiw0Var, Function0 function0, boolean z, qim0 qim0Var, boolean z2, int i, int i2) {
        super(2);
        this.h = oiw0Var;
        this.b = function0;
        this.c = z;
        this.d = qim0Var;
        this.e = z2;
        this.f = i;
        this.g = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.g;
                boolean z = this.c;
                Function0 function0 = this.b;
                qim0 qim0Var = this.d;
                boolean z2 = this.e;
                yoi1.b(z, function0, qim0Var, z2, (idn0) obj3, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.g;
                fiw0.a((oiw0) obj3, this.b, this.c, this.d, this.e, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pwx(boolean z, Function0 function0, qim0 qim0Var, boolean z2, idn0 idn0Var, int i, int i2) {
        super(2);
        this.c = z;
        this.b = function0;
        this.d = qim0Var;
        this.e = z2;
        this.h = idn0Var;
        this.f = i;
        this.g = i2;
    }
}
