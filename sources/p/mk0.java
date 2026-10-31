package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mk0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk0(txj txjVar, String str, cxc0 cxc0Var, int i, int i2) {
        super(3);
        this.d = txjVar;
        this.e = str;
        this.f = cxc0Var;
        this.b = i;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                vvx.a(o40.e, apo.r(-1401817449, new lk0((vzq0) obj, (oj80) obj6, this.b, this.c, (Integer) obj5, (List) obj4), b0kVar), b0kVar, 48);
                break;
            default:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    ((txj) obj6).e((String) obj5, (cxc0) obj4, this.b + this.c, x340Var2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk0(oj80 oj80Var, int i, int i2, Integer num, List list) {
        super(3);
        this.d = oj80Var;
        this.b = i;
        this.c = i2;
        this.e = num;
        this.f = list;
    }
}
