package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ju01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju01(int i, Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    public final Object invoke(Object obj) {
        iu30 iu30Var;
        Object alhVar;
        sju sjuVar;
        sju sjuVar2;
        sju sjuVar3;
        sju sjuVar4;
        byte b = this.a;
        int i = 2;
        int i2 = 5;
        ykh glhVar = null;
        rih1 rih1Var = rih1.a;
        int i3 = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                du01 du01Var = (du01) obj3;
                List list = du01Var.b;
                ((rtb0) obj).e(list.size(), new iio0(list, (byte) 26), new iio0(list, (byte) 27), new j2i(2039820996, new ixj(list, du01Var, this.b, (kt01) obj2, (byte) 2), true));
                return rih1Var;
            case 1:
                ((Number) obj).intValue();
                ksk0 ksk0Var = (ksk0) obj3;
                Integer numValueOf = Integer.valueOf(i3);
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("section", (String) obj2, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ksk0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA);
                return new r6h1(arrayList, r6h1Var2.b);
            case 2:
                if (((fg21) obj) instanceof fg21) {
                    ((qka) obj2).invoke(new blh(i3, (ikh) obj3, false));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                zhh zhhVar = (eih) obj;
                hkh hkhVar = (hkh) obj3;
                boolean z = zhhVar instanceof yhh;
                int i4 = this.b;
                if (z) {
                    glhVar = new wkh(i4, hkhVar, ((yhh) zhhVar).a);
                } else if (zhhVar instanceof zhh) {
                    glhVar = new ykh(i4, hkhVar, zhhVar.a);
                } else if (!(zhhVar instanceof aih)) {
                    if (zhhVar instanceof bih) {
                        glhVar = new blh(i4, hkhVar, ((bih) zhhVar).a);
                    } else if (zhhVar instanceof cih) {
                        cih cihVar = (cih) zhhVar;
                        glhVar = new flh(i4, cihVar.c, hkhVar, cihVar.b, cihVar.a);
                    } else {
                        if (!(zhhVar instanceof dih)) {
                            eg.o();
                            return null;
                        }
                        dih dihVar = (dih) zhhVar;
                        glhVar = new glh(i4, dihVar.b, hkhVar, dihVar.a);
                    }
                }
                if (glhVar != null) {
                    ((qka) obj2).invoke(glhVar);
                }
                return rih1Var;
            case 4:
                float fM0 = ((wat) obj3).M0((int) (((elb0) obj).b() >> 32));
                bw91 bw91Var = (bw91) obj2;
                p3v p3vVar = (p3v) o7h.t0(i3, bw91Var);
                if (!(p3vVar != null ? p3v.c(p3vVar.a, fM0) : false)) {
                    bw91Var.set(i3, new p3v(fM0));
                }
                return rih1Var;
            case 5:
                ((vu30) obj2).invoke(Integer.valueOf(i3), new p3v(((wat) obj3).M0((int) (((elb0) obj).b() >> 32))));
                return rih1Var;
            case 6:
                if (((err0) obj3).s() > 0 && (iu30Var = (iu30) obj2) != null) {
                    iu30Var.invoke(Integer.valueOf(i3));
                }
                return new tj4((byte) 22);
            case 7:
                bxc1 bxc1Var = (bxc1) obj2;
                ((iu30) obj3).invoke(new xwc1(bxc1Var.a, i3, bxc1Var.d));
                return rih1Var;
            case 8:
                e261 e261Var = (e261) obj;
                if (i3 == ((kes) obj3).o()) {
                    b261.x(e261Var, 5);
                    b261.n(e261Var, ((nxc1) ((mxc1) obj2).a.get(i3)).n);
                }
                return rih1Var;
            case 9:
                xhm1 xhm1Var = (xhm1) obj;
                qyc1 qyc1Var = (qyc1) obj3;
                if (qyc1Var == null) {
                    return null;
                }
                ryc1 ryc1Var = (ryc1) obj2;
                uba ubaVar = ryc1Var.b;
                c4m0 c4m0VarA = ryc1Var.a(xhm1Var);
                int iY = pto1.y(qyc1Var);
                Integer numValueOf2 = Integer.valueOf(i3);
                x6h1 x6h1VarC2 = c4m0VarA.c.c();
                x6h1VarC2.i.add(new a7h1("share_card_variant", z3m0.e(iY), numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).b = c4m0VarA.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return ubaVar.p(k7h1Var.a(), ryc1.d);
            case 10:
                yih yihVar = (yih) obj;
                String str = ((okh) obj3).b;
                if (yihVar.equals(vih.a)) {
                    alhVar = new zkh(i3, str);
                } else if (yihVar.equals(wih.a)) {
                    alhVar = new xkh(i3, str);
                } else {
                    if (!yihVar.equals(xih.a)) {
                        eg.o();
                        return null;
                    }
                    alhVar = new alh(str, i3, true, false);
                }
                ((qka) obj2).invoke(alhVar);
                return rih1Var;
            case 11:
                xhm1 xhm1Var2 = (xhm1) obj;
                int i5 = this.b;
                int i6 = i5 + 1;
                if (i6 == 1) {
                    i2 = 1;
                } else if (i6 == 2) {
                    i2 = 2;
                } else if (i6 == 3) {
                    i2 = 3;
                } else if (i6 == 4) {
                    i2 = 4;
                } else if (i6 != 5) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    return null;
                }
                ard1 ard1Var = (ard1) ((ce6) obj3).d;
                rx7 rx7Var = ((k7f1) obj2).f;
                if (rx7Var != null && (sjuVar = rx7Var.c) != null) {
                    glhVar = sjuVar.c;
                }
                return ard1Var.c(xhm1Var2, zqd1.e, i5, glhVar, i2);
            case 12:
                xhm1 xhm1Var3 = (xhm1) obj;
                int i7 = this.b;
                int i8 = i7 + 1;
                if (i8 == 1) {
                    i2 = 1;
                } else if (i8 == 2) {
                    i2 = 2;
                } else if (i8 == 3) {
                    i2 = 3;
                } else if (i8 == 4) {
                    i2 = 4;
                } else if (i8 != 5) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    return null;
                }
                ard1 ard1Var2 = (ard1) ((naf1) obj3).d;
                rx7 rx7Var2 = ((laf1) obj2).b;
                if (rx7Var2 != null && (sjuVar2 = rx7Var2.c) != null) {
                    glhVar = sjuVar2.c;
                }
                return ard1Var2.c(xhm1Var3, zqd1.b, i7, glhVar, i2);
            case 13:
                xhm1 xhm1Var4 = (xhm1) obj;
                int i9 = this.b;
                int i10 = i9 + 1;
                if (i10 == 1) {
                    i2 = 1;
                } else if (i10 == 2) {
                    i2 = 2;
                } else if (i10 == 3) {
                    i2 = 3;
                } else if (i10 == 4) {
                    i2 = 4;
                } else if (i10 != 5) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    return null;
                }
                ard1 ard1Var3 = (ard1) ((lf6) obj3).h;
                rx7 rx7Var3 = (rx7) o7h.s0(((cj40) obj2).d);
                if (rx7Var3 != null && (sjuVar3 = rx7Var3.c) != null) {
                    glhVar = sjuVar3.c;
                }
                return ard1Var3.c(xhm1Var4, zqd1.a, i9, glhVar, i2);
            case 14:
                xhm1 xhm1Var5 = (xhm1) obj;
                int i11 = this.b;
                int i12 = i11 + 1;
                if (i12 == 1) {
                    i = 1;
                } else if (i12 != 2) {
                    if (i12 == 3) {
                        i = 3;
                    } else if (i12 != 4) {
                        i = i12 != 5 ? 0 : 5;
                    } else {
                        i = 4;
                    }
                }
                if (i == 0) {
                    return null;
                }
                ard1 ard1Var4 = (ard1) obj3;
                rx7 rx7Var4 = ((tnu0) obj2).h;
                if (rx7Var4 != null && (sjuVar4 = rx7Var4.c) != null) {
                    glhVar = sjuVar4.c;
                }
                return ard1Var4.c(xhm1Var5, zqd1.c, i11, glhVar, i);
            case 15:
                aqf1 aqf1Var = (aqf1) obj2;
                ((qqf1) obj3).h.invoke(new lrf1(aqf1Var.a, i3, aqf1Var.h, aqf1Var.f));
                return rih1Var;
            default:
                return new t6v((vjr0) obj3, (z0i) obj2, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju01(Object obj, int i, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju01(Object obj, Object obj2, int i, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
