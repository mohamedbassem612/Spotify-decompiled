package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class j6c extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cir0 b;
    public final /* synthetic */ obk1 c;
    public final /* synthetic */ q59 d;
    public final /* synthetic */ ymd0 e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j6c(cir0 cir0Var, obk1 obk1Var, q59 q59Var, ymd0 ymd0Var, j2i j2iVar, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = cir0Var;
        this.c = obk1Var;
        this.d = q59Var;
        this.e = ymd0Var;
        this.f = j2iVar;
        this.g = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    rce0.a(cwl1.B(this.b.g()), apo.r(-443164536, new m(this.c, this.d, this.e, this.f, this.g, (byte) 20), x340Var2), x340Var2, 48);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    cir0 cir0Var = this.b;
                    k2r0.a(cir0Var, apo.r(1840530201, new j6c(cir0Var, this.c, this.d, this.e, this.f, this.g, (byte) 0), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }
}
