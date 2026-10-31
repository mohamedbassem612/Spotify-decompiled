package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oib1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oib1(int i, xrg1 xrg1Var, int i2) {
        super(2);
        this.a = (byte) 5;
        this.b = i;
        this.c = xrg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                xzn1.c((rib1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                vvd1.c((mvd1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                n8p1.g((erc1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                xap1.c((ule1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 4:
                sjo0.h((asf1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 5:
                cpn1.h(i, (xrg1) obj3, b0kVar, czo1.p(1));
                break;
            case 6:
                wro1.g((b5i1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 7:
                qyo1.l((ryi1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 8:
                j82.o((qyk1) obj3, b0kVar, czo1.p(i | 1));
                break;
            case 9:
                wm5.m((kwk1) obj3, b0kVar, czo1.p(i | 1));
                break;
            default:
                wm5.o((lwk1) obj3, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oib1(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oib1(mvd1 mvd1Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.c = mvd1Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oib1(ryi1 ryi1Var, int i) {
        super(2);
        this.a = (byte) 7;
        this.c = ryi1Var;
        this.b = i;
    }
}
