package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class exk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(Function0 function0, vnm1 vnm1Var, int i) {
        super(2);
        this.a = (byte) 9;
        this.c = function0;
        this.d = vnm1Var;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                m87.h((i260) obj4, i, (qim0) obj3, b0kVar, czo1.p(1));
                break;
            case 1:
                ((svh0) obj4).c((g2c) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                y1a1.j((gzl1) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                ((n5m1) obj4).e((hwq) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 4:
                zpn1.g((wnm1) obj4, (Function0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 5:
                zpn1.i((tnm1) obj4, (Function0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 6:
                zpn1.j((rnm1) obj4, (Function0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 7:
                zpn1.k((snm1) obj4, (Function0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 8:
                zpn1.l((unm1) obj4, (Function0) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 9:
                zpn1.m((Function0) obj4, (vnm1) obj3, b0kVar, czo1.p(i | 1));
                break;
            default:
                bqn1.t((oom1) obj4, (qim0) obj3, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ exk1(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(i260 i260Var, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 0;
        this.c = i260Var;
        this.b = i;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(rnm1 rnm1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 6;
        this.c = rnm1Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(snm1 snm1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 7;
        this.c = snm1Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(tnm1 tnm1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 5;
        this.c = tnm1Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(unm1 unm1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 8;
        this.c = unm1Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exk1(wnm1 wnm1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 4;
        this.c = wnm1Var;
        this.d = function0;
        this.b = i;
    }
}
