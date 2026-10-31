package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h40 extends hab0 implements zu30 {
    public static final h40 N0;
    public static final h40 O0;
    public static final h40 P0;
    public static final h40 Q0;
    public static final h40 R0;
    public static final h40 S0;
    public static final h40 T0;
    public static final h40 U0;
    public static final h40 V0;
    public static final h40 W0;
    public static final h40 X;
    public static final h40 X0;
    public static final h40 Y;
    public static final h40 Y0;
    public static final h40 Z;
    public static final h40 Z0;
    public static final h40 a1;
    public static final h40 b;
    public static final h40 b1;
    public static final h40 c;
    public static final h40 c1;
    public static final h40 d;
    public static final h40 d1;
    public static final h40 e;
    public static final h40 e1;
    public static final h40 f;
    public static final h40 g;
    public static final h40 h;
    public static final h40 i;
    public static final h40 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new h40(i2, (byte) 0);
        c = new h40(i2, (byte) 1);
        d = new h40(i2, (byte) 2);
        e = new h40(i2, (byte) 3);
        f = new h40(i2, (byte) 4);
        g = new h40(i2, (byte) 5);
        h = new h40(i2, (byte) 6);
        i = new h40(i2, (byte) 7);
        t = new h40(i2, (byte) 8);
        X = new h40(i2, (byte) 9);
        Y = new h40(i2, (byte) 10);
        Z = new h40(i2, (byte) 11);
        N0 = new h40(i2, (byte) 12);
        O0 = new h40(i2, (byte) 13);
        P0 = new h40(i2, (byte) 14);
        Q0 = new h40(i2, (byte) 15);
        R0 = new h40(i2, (byte) 16);
        S0 = new h40(i2, (byte) 17);
        T0 = new h40(i2, (byte) 18);
        U0 = new h40(i2, (byte) 19);
        V0 = new h40(i2, (byte) 20);
        W0 = new h40(i2, (byte) 21);
        X0 = new h40(i2, (byte) 22);
        Y0 = new h40(i2, (byte) 23);
        Z0 = new h40(i2, (byte) 24);
        a1 = new h40(i2, (byte) 25);
        b1 = new h40(i2, (byte) 26);
        c1 = new h40(i2, (byte) 27);
        d1 = new h40(i2, (byte) 28);
        e1 = new h40(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h40(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.a) {
            case 0:
                return fq7.A(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).f(((d40) obj).a());
            case 1:
                kp0 kp0Var = (kp0) obj;
                ((Number) obj3).intValue();
                return l4p1.r((r6h1) obj4).a(kp0Var.a().k(), gq0.e(kp0Var.a().a()));
            case 2:
                return u4p1.R(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).a(((i04) obj2).getUri());
            case 3:
                return m87.r(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).f((String) null, ((x5d) obj).a());
            case 4:
                return upf.d(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).g(((d6d) obj).a());
            case 5:
                ygc0 ygc0Var = (ygc0) obj2;
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                nim0 nim0Var = nim0.a;
                t1c.a(u291.f(nim0Var, 1.0f), b0kVar, 0);
                qgc0.c(7, 48, 0, ygc0Var.a, b0kVar, anm1.N("LIMITED_EXPERIENCE_INDICATOR_MESSAGE", nim0Var));
                qgc0.c(15, 48, 0, ygc0Var.b, b0kVar, anm1.N("LIMITED_EXPERIENCE_INDICATOR_ANNOUNCEMENT", nim0Var));
                return rih1.a;
            case 6:
                return e6p1.i(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).b(sok.q((jdk) obj2), ((udk) obj).a());
            case 7:
                return g6p1.g(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).c(((hqk) obj).a());
            case 8:
                return l6p1.j(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).c(((dtl) obj).a);
            case 9:
                ((Number) obj3).intValue();
                return m6p1.r((r6h1) obj4).n();
            case 10:
                return new wc3((Context) obj2, (iu30) obj4, (byte) 2);
            case 11:
                ((Number) obj3).intValue();
                return h7p1.t((r6h1) obj4).h();
            case 12:
                ((Number) obj3).intValue();
                return o4p1.p((r6h1) obj4).a().e();
            case 13:
                zgu zguVar = (zgu) obj;
                return z6p1.w(k4p1.q(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).a(zguVar.b())).i(zguVar.a().a);
            case 14:
                aw70 aw70Var = (aw70) obj;
                return m87.r(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).f(aw70Var.t ? "has_sponsorship" : null, aw70Var.b);
            case 15:
                return n9p1.m(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).c(((ky80) obj).f());
            case 16:
                return upo1.r((mey0) obj, (hob1) obj2, ((Number) obj3).intValue(), (r6h1) obj4, 16);
            case 17:
                return new sbi0((nbw0) obj, (pjw0) obj2, (w281) obj3, (e2k1) obj4);
            case 18:
                ndi0 ndi0Var = (ndi0) obj;
                return d7p1.h(f7p1.j(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).b(ndi0Var.a(), ndi0Var.c())).g(((odi0) obj2).a() instanceof qdi0 ? ndi0Var.b() : null, ndi0Var.c());
            case 19:
                return upo1.r((mey0) obj, (hob1) obj2, ((Number) obj3).intValue(), (r6h1) obj4, 24);
            case 20:
                return upo1.r((mey0) obj, (hob1) obj2, ((Number) obj3).intValue(), (r6h1) obj4, 24);
            case 21:
                return ucp1.h(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).d(((hgi0) obj).a());
            case 22:
                oii0 oii0Var = (oii0) obj;
                return sj1.r(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).e(oii0Var.b, oii0Var.c);
            case 23:
                ((Number) obj3).intValue();
                return mod.r().j();
            case 24:
                jao0 jao0Var = (jao0) obj;
                ((Number) obj3).intValue();
                return jap1.p(jao0Var.b()).e(jao0Var.a() instanceof ud10 ? 1 : 2);
            case 25:
                return pap1.u(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).d();
            case 26:
                return c97.m(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).f("offline-ready-shelf");
            case 27:
                rhq0 rhq0Var = (rhq0) obj;
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String strA = rhq0Var.a();
                return (strA == null || ihc1.y0(strA)) ? aq8.x(r6h1Var).b() : e9p1.h(r6h1Var).a(rhq0Var.a());
            case 28:
                ((Number) obj3).intValue();
                return yap1.i((r6h1) obj4).m();
            default:
                return p9p1.u(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4).d(4, ((nnt0) obj2).c());
        }
    }
}
