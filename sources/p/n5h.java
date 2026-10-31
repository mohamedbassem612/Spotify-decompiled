package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n5h extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5h(float f) {
        super(2);
        this.a = (byte) 1;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        float f = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                o5h.e(f, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var2).c.a;
                boolean zD = x340Var2.d(f);
                Object objT = x340Var2.T();
                if (zD || objT == fkj0.X) {
                    if (f == 0.0f) {
                        objT = null;
                    } else {
                        int size = qqu.a.size();
                        int i = size - 1;
                        int iMin = Math.min((int) ((Math.log((((double) Math.min(Math.abs(f), 1.0f)) * 10.0d) + 1.0d) / Math.log(11.0d)) * ((double) size)), i);
                        objT = f < 0.0f ? Integer.valueOf(i - iMin) : Integer.valueOf(size + iMin);
                    }
                    x340Var2.s0(objT);
                } else {
                    rih1Var = rih1Var;
                }
                Integer num = (Integer) objT;
                boolean z = f == 0.0f;
                qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 24.0f);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                x340Var2.i0(1060020594);
                int i2 = 0;
                for (Object obj3 : qqu.a) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    qqu.a(i2, num, ((Number) obj3).intValue(), j, x340Var2, 0);
                    i2 = i3;
                }
                x340Var2.r(false);
                qqu.b(0, j, x340Var2, z);
                x340Var2.i0(1060033971);
                int i4 = 0;
                for (Object obj4 : o7h.T0(qqu.a)) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    qqu.a(qqu.a.size() + i4, num, ((Number) obj4).intValue(), j, x340Var2, 0);
                    i4 = i5;
                }
                x340Var2.r(false);
                x340Var2.r(true);
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w0h1.a(cox.c, isl.a, u291.r(nim0Var, f), 0L, 0L, true, x340Var4, cox.d | 196656, 24);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    w0h1.a(htx.c, isl.a, u291.r(nim0Var, f), 0L, 0L, true, x340Var6, htx.d | 196656, 24);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    w0h1.a(btx.c, isl.a, u291.r(nim0Var, f), 0L, 0L, true, x340Var8, btx.d | 196656, 24);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                who1.f(f, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                who1.m(f, czo1.p(7), (b0k) obj);
                return rih1Var;
            case 7:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    float fO = yoi1.o(f, 0.0f, 1.0f);
                    qim0 qim0VarN = anm1.N("MDCSubtitleProgress", u291.s(nim0Var, 36.0f, 4.0f));
                    Object objT2 = x340Var10.T();
                    if (objT2 == fkj0.X) {
                        objT2 = pfi0.b;
                        x340Var10.s0(objT2);
                    }
                    qim0 qim0VarA = s161.a(qim0VarN, (iu30) objT2);
                    uwr uwrVar2 = cbx.a;
                    tto1.d(fO, 0, 0, cbx.a(x340Var10).c.c, cbx.a(x340Var10).a.b.c(), x340Var10, qim0VarA);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                fqo1.v(f, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                hyr0.d(f, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                lq01.c(f, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                vvm1.q(f, czo1.p(1), (b0k) obj);
                return rih1Var;
            case 12:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    op71.g(x340Var12, u291.v(nim0Var, f));
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                uah1.c(f, czo1.p(1), (b0k) obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5h(byte b, float f, int i) {
        super(2);
        this.a = b;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5h(byte b, float f) {
        super(2);
        this.a = b;
        this.b = f;
    }
}
