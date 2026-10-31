package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gj80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj80(boolean z, Integer num, boolean z2, Function0 function0, boolean z3, int i) {
        super(2);
        this.a = (byte) 3;
        this.b = z;
        this.f = num;
        this.c = z2;
        this.e = function0;
        this.d = z3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj3;
                int iP = czo1.p(1);
                h7p1.n(this.b, this.c, this.d, function0, function1, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                boolean z = this.b;
                boolean z2 = this.c;
                boolean z3 = this.d;
                y7y0.a((c380) obj4, z, z2, z3, (iu30) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                boolean z4 = this.b;
                boolean z5 = this.c;
                boolean z6 = this.d;
                pto1.h((String) obj4, z4, z5, z6, (iu30) obj3, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(7);
                boolean z7 = this.b;
                boolean z8 = this.c;
                eqr0.e(z7, (Integer) obj3, z8, (Function0) obj4, this.d, (b0k) obj, iP4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(1);
                boolean z9 = this.b;
                boolean z10 = this.c;
                boolean z11 = this.d;
                d5p1.d((String) obj4, z9, z10, z11, (qim0) obj3, (b0k) obj, iP5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj80(Object obj, boolean z, boolean z2, boolean z3, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj80(boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = function0;
        this.f = function1;
    }
}
