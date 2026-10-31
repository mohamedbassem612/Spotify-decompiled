package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kn50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn50(w5q0 w5q0Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.c = w5q0Var;
        this.b = z;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ern1.f((w5q0) obj4, z, (qim0) obj3, (b0k) obj, czo1.p(1));
                break;
            default:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                un60 un60Var = (un60) obj4;
                x340 x340Var = (x340) b0kVar;
                if (!x340Var.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var.b0();
                } else {
                    qim0 qim0VarX = lrn1.x(u291.u(nim0.a, 40.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                    if (!z && un60Var.f && (i = un60Var.g) != 4) {
                        qim0VarX = jmo1.k(i, qim0VarX, un60Var.h);
                    }
                    so60.d((gbx) obj3, so60.e(un60Var), yoo1.z(x340Var), this.b, qim0VarX, (qex) null, (idn0) null, false, (vzq0) null, apo.r(968466234, new no60(un60Var, (byte) 0), x340Var), x340Var, 817889280, 352);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn50(boolean z, un60 un60Var, gbx gbxVar) {
        super(2);
        this.b = z;
        this.c = un60Var;
        this.d = gbxVar;
    }
}
