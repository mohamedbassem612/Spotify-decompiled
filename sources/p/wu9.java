package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wu9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu9(be50 be50Var, qim0 qim0Var, long j, xo30 xo30Var, float f, j2i j2iVar, int i) {
        super(2);
        this.f = be50Var;
        this.d = qim0Var;
        this.c = j;
        this.g = xo30Var;
        this.b = f;
        this.h = j2iVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Function0 function0 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                qim0 qim0Var = this.d;
                long j = this.c;
                float f = this.b;
                e4p1.d((be50) obj4, qim0Var, j, (xo30) obj3, f, (j2i) function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                float f2 = this.b;
                long j2 = this.c;
                rje1.b((nte1) obj4, (vue1) obj3, f2, j2, function0, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu9(nte1 nte1Var, vue1 vue1Var, float f, long j, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.f = nte1Var;
        this.g = vue1Var;
        this.b = f;
        this.c = j;
        this.h = function0;
        this.d = qim0Var;
        this.e = i;
    }
}
