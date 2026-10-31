package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ydm1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydm1(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) obj2).floatValue();
                ((hav0) obj).a();
                udm1 udm1Var = (udm1) obj4;
                int i = (int) (((nav0) obj3).Y0 >> 32);
                if (udm1Var.e && i > 0) {
                    float f = udm1Var.i + udm1Var.j + ((fFloatValue / i) * 0.5235988f);
                    float f2 = udm1Var.l;
                    udm1Var.j = yoi1.o(f, -f2, f2) - udm1Var.i;
                    udm1Var.a();
                }
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ((j2i) obj4).invoke((nw31) obj3, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }
}
