package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vre extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vre(oxj1 oxj1Var, boolean z, Function0 function0, boolean z2, boolean z3, int i) {
        super(2);
        this.a = (byte) 3;
        this.g = oxj1Var;
        this.b = z;
        this.f = function0;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.f;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                voo1.c(z, (Function0) obj3, (qim0) obj4, this.c, this.d, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                int iP2 = czo1.p(i | 1);
                ((l8r0) obj3).e(this.b, this.c, this.d, iu30Var, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                boolean z2 = this.b;
                boolean z3 = this.c;
                boolean z4 = this.d;
                acq0.y((vtf1) obj3, z2, z3, z4, (qim0) obj4, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z5 = this.b;
                ((oxj1) obj4).g(z5, (Function0) obj3, this.c, this.d, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vre(Object obj, boolean z, boolean z2, boolean z3, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.f = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = obj2;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vre(boolean z, Function0 function0, qim0 qim0Var, boolean z2, boolean z3, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = z;
        this.f = function0;
        this.g = qim0Var;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }
}
