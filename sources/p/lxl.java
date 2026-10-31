package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lxl extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lxl(int i, String str, lee1 lee1Var, String str2, lee1 lee1Var2) {
        super(2);
        this.d = i;
        this.e = str;
        this.f = lee1Var;
        this.b = str2;
        this.c = lee1Var2;
    }

    public final Object invoke(Object obj, Object obj2) {
        mmr0 mmr0Var;
        byte b = this.a;
        byte b2 = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                pxl.g((String) obj6, (yvh) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1), this.d);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                pro1.f((tix) obj6, (iu30) obj4, (qim0) obj3, (vzq0) obj5, (b0k) obj, czo1.p(1), this.d);
                return rih1Var;
            case 2:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                n811 n811Var = new n811();
                n811Var.a = 1;
                String str = (String) obj6;
                lee1 lee1Var = (lee1) obj5;
                byte b3 = this.d;
                ((afh0) o7h.q0(tlc1Var.P("title_probe", new j2i(-187896617, new nkj0(b3, str, lee1Var, n811Var, (byte) 0), true)))).H(j);
                n811 n811Var2 = new n811();
                n811Var2.a = 1;
                String str2 = (String) obj4;
                lee1 lee1Var2 = (lee1) obj3;
                ((afh0) o7h.q0(tlc1Var.P("subtitle_probe", new j2i(1247278542, new nkj0(b3, str2, lee1Var2, n811Var2, (byte) 1), true)))).H(j);
                int i = n811Var.a;
                int i2 = n811Var2.a;
                if (i + i2 <= b3) {
                    mmr0Var = new mmr0(Integer.valueOf(i), Integer.valueOf(i2));
                } else {
                    int i3 = b3 / 2;
                    int i4 = b3 - i3;
                    if (i <= i4) {
                        mmr0Var = new mmr0(Integer.valueOf(i), Integer.valueOf(b3 - i));
                    } else {
                        mmr0Var = i2 <= i3 ? new mmr0(Integer.valueOf(b3 - i2), Integer.valueOf(i2)) : new mmr0(Integer.valueOf(i4), Integer.valueOf(i3));
                    }
                }
                int iIntValue = ((Number) mmr0Var.a).intValue();
                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("title", new j2i(695595337, new pkj0(iIntValue, str, lee1Var, (byte) 1), true)))).H(j);
                q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P("subtitle", new j2i(2089122117, new pkj0(iIntValue2, str2, lee1Var2, (byte) 0), true)))).H(j);
                return tlc1Var.S(hjl.i(j), q5t0VarH.b + q5t0VarH2.b, b7x.a, new okj0(q5t0VarH, q5t0VarH2, (byte) 0));
            case 3:
                ((Number) obj2).intValue();
                crm0.j((String) obj6, (qim0) obj3, (ufq0) obj5, (qfq0) obj4, (b0k) obj, czo1.p(1), this.d);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                o1p1.f((hux) obj5, (String) obj6, (String) obj4, (qim0) obj3, (b0k) obj, czo1.p(b2 | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                a4p1.d((uoa) obj6, (b3k1) obj5, (a7j1) obj4, (qim0) obj3, (b0k) obj, czo1.p(b2 | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lxl(String str, yvh yvhVar, iu30 iu30Var, qim0 qim0Var, int i, int i2) {
        super(2);
        this.e = str;
        this.f = yvhVar;
        this.b = iu30Var;
        this.c = qim0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lxl(String str, qim0 qim0Var, ufq0 ufq0Var, qfq0 qfq0Var, int i, int i2) {
        super(2);
        this.e = str;
        this.c = qim0Var;
        this.f = ufq0Var;
        this.b = qfq0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lxl(uoa uoaVar, b3k1 b3k1Var, a7j1 a7j1Var, qim0 qim0Var, int i) {
        super(2);
        this.e = uoaVar;
        this.f = b3k1Var;
        this.b = a7j1Var;
        this.c = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lxl(tix tixVar, iu30 iu30Var, qim0 qim0Var, vzq0 vzq0Var, int i, int i2) {
        super(2);
        this.e = tixVar;
        this.b = iu30Var;
        this.c = qim0Var;
        this.f = vzq0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lxl(hux huxVar, String str, String str2, qim0 qim0Var, int i) {
        super(2);
        this.f = huxVar;
        this.e = str;
        this.b = str2;
        this.c = qim0Var;
        this.d = i;
    }
}
