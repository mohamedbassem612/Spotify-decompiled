package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bnx0 extends hab0 implements zu30 {
    public static final bnx0 X;
    public static final bnx0 Y;
    public static final bnx0 b;
    public static final bnx0 c;
    public static final bnx0 d;
    public static final bnx0 e;
    public static final bnx0 f;
    public static final bnx0 g;
    public static final bnx0 h;
    public static final bnx0 i;
    public static final bnx0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new bnx0(i2, (byte) 0);
        c = new bnx0(i2, (byte) 1);
        d = new bnx0(i2, (byte) 2);
        e = new bnx0(i2, (byte) 3);
        f = new bnx0(i2, (byte) 4);
        g = new bnx0(i2, (byte) 5);
        h = new bnx0(i2, (byte) 6);
        i = new bnx0(i2, (byte) 7);
        t = new bnx0(i2, (byte) 8);
        X = new bnx0(i2, (byte) 9);
        Y = new bnx0(i2, (byte) 10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnx0(xpw xpwVar, byte b2) {
        super(4);
        this.a = b2;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        k0y0 k0y0VarG;
        String strB;
        switch (this.a) {
            case 0:
                tmx0 tmx0Var = (tmx0) obj;
                umx0 umx0Var = (umx0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String strB2 = umx0Var.b();
                if (ihc1.y0(strB2)) {
                    strB2 = umx0Var.a();
                }
                return si1.n(Integer.valueOf(iIntValue), r6h1Var).e(qon1.D(tmx0Var.b()), strB2);
            case 1:
                return si1.n(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).e(3, ((mox0) obj2).a());
            case 2:
                wzx0 wzx0Var = (wzx0) obj;
                yzx0 yzx0Var = (c0y0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                r6h1 r6h1Var2 = (r6h1) obj4;
                String strA = null;
                yzx0 yzx0Var2 = yzx0Var instanceof yzx0 ? yzx0Var : null;
                if (yzx0Var2 != null && (k0y0VarG = yzx0Var2.g()) != null) {
                    strA = k0y0VarG.a();
                }
                return jm5.i(Integer.valueOf(iIntValue2), r6h1Var2).e(wzx0Var.a(), strA);
            case 3:
                return c97.m(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).f(((oq01) obj).b);
            case 4:
                return d5p1.l(f5p1.l(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).a(((cf31) obj).e()).b()).a(1);
            case 5:
                return (n8h1) ((ig51) obj).a().invoke(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 6:
                he81 he81Var = (he81) obj2;
                return si1.n(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).e(he81Var.G == 3 ? 5 : 4, he81Var.d);
            case 7:
                return d5p1.l(f5p1.l(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).a(((fw81) obj).b()).b()).a(2);
            case 8:
                kef1 kef1Var = (kef1) obj;
                ((Number) obj3).intValue();
                apk0 apk0VarA = lcc.A(Integer.valueOf(kef1Var.a()), (r6h1) obj4);
                String strC = kef1Var.c();
                cvt0 cvt0VarB = kef1Var.b();
                if (cvt0VarB == null || (strB = cvt0VarB.b()) == null) {
                    strB = "";
                }
                return apk0VarA.g(strC, strB);
            case 9:
                n6j1 n6j1Var = (n6j1) obj;
                return p9p1.v(sj1.r(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).e(n6j1Var.b(), n6j1Var.a())).d(3, n6j1Var.c());
            case 10:
                y8j1 y8j1Var = (y8j1) obj;
                return sqe.q(k4p1.q(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).a(y8j1Var.c())).b(y8j1Var.b().a);
            case 11:
                m6k1 m6k1Var = ((n6k1) obj2).a;
                return e4y.e(m6k1Var.g, m6k1Var.c, m6k1Var.f, ((Number) obj3).intValue(), (r6h1) obj4);
            default:
                return e4y.a(((Number) obj3).intValue(), ((z7l1) obj2).a.a.c, (r6h1) obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnx0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
