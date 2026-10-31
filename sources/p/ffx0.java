package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ffx0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffx0(Function0 function0, lz20 lz20Var, y7e1 y7e1Var) {
        super(2);
        this.a = (byte) 27;
        this.c = function0;
        this.b = lz20Var;
        this.d = y7e1Var;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x033b  */
    /* JADX WARN: Code duplicated, block: B:160:0x043a  */
    /* JADX WARN: Code duplicated, block: B:177:0x046d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0499  */
    /* JADX WARN: Code duplicated, block: B:193:0x049d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0165  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f8  */
    public final Object invoke(Object obj, Object obj2) {
        vu30 vu30Var;
        byte b;
        gbx gbxVar;
        boolean z;
        boolean z2;
        CharSequence charSequenceJ0;
        boolean z3;
        Integer num;
        Integer num2;
        boolean z4;
        boolean z5;
        String str;
        String str2;
        byte b2 = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b2) {
            case 0:
                ((Number) obj2).intValue();
                gfx0.b((ifx0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                hon1.e((hjv0) obj5, (wiv0) obj4, (iu30) obj3, (b0k) obj, czo1.p(393));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                uyn1.k((List) obj5, (ngs0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((de40) obj5).e((a6y0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((yby0) obj5).e((List) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                tho1.d((h67) obj5, (String) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p9z0 p9z0Var = (p9z0) obj5;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new j9z0(iu30Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    q9z0 q9z0Var = (q9z0) obj3;
                    jtl1 jtl1Var = q9z0Var.e;
                    ven0 ven0VarJ = f4p1.j(q9z0Var.c.c, b2l.a, null, x340Var2, 0, 14);
                    if ((((c2l) ven0VarJ.getValue()) instanceof y1l) || (((c2l) ven0VarJ.getValue()) instanceof z1l)) {
                        x340Var2.i0(-800725222);
                        vu30 vu30VarR = apo.r(-1985214976, new y6w0(q9z0Var, (byte) 25), x340Var2);
                        x340Var2.r(false);
                        vu30Var = vu30VarR;
                    } else {
                        x340Var2.i0(-800374674);
                        x340Var2.r(false);
                        vu30Var = null;
                    }
                    ijo1.k(p9z0Var, function0, jtl1Var, (qim0) null, vu30Var, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fiz0 fiz0Var = (fiz0) obj4;
                    otw.c((xiz0) obj5, new tiz0(fiz0Var.a, true, fiz0Var.N0, ((klz0) obj3).a), (qim0) null, (ipb1) null, x340Var4, 8, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                zmo1.k((eka1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ioo1.r((mtz0) obj5, (ltz0) obj4, (j2i) obj3, (b0k) obj, czo1.p(393));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((phi0) obj5).e((l201) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                iqo1.i((w201) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((b0i0) obj5).b(czo1.p(1), (String) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 13:
                String str3 = (String) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                b0i0 b0i0Var = (b0i0) obj5;
                boolean zEquals = str3.equals(((mmv0) b0i0Var.b).c((String) obj4));
                iu30 iu30Var2 = (iu30) obj3;
                nmv0 nmv0Var = (mmv0) b0i0Var.b;
                if (zEquals) {
                    iu30Var2.invoke(new q301(nmv0Var.b(str3), iIntValue3));
                } else {
                    iu30Var2.invoke(new s301(nmv0Var.b(str3), iIntValue3));
                }
                return rih1Var;
            case 14:
                x340 x340Var5 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                w501 w501Var = (w501) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uvx uvxVar = new uvx(mgx.e, 0, (tvx) null, (p3v) null, 28);
                    iu30 iu30Var3 = (iu30) obj5;
                    if (iu30Var3 == null) {
                        x340Var6.i0(-336250412);
                        x340Var6.r(false);
                        b = 0;
                        gbxVar = null;
                    } else {
                        x340Var6.i0(-336250411);
                        boolean zG2 = x340Var6.g(w501Var) | x340Var6.g(iu30Var3);
                        Object objT2 = x340Var6.T();
                        if (zG2 || objT2 == fkj0.X) {
                            objT2 = new zkz0((byte) 2, w501Var, iu30Var3);
                            x340Var6.s0(objT2);
                        }
                        gbx gbxVar2 = new gbx(z50.c, (Function0) objT2);
                        b = 0;
                        x340Var6.r(false);
                        gbxVar = gbxVar2;
                    }
                    jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-756905018, new hov0((gw70) obj3, w501Var, (byte) 10), x340Var6), (xu30) null, (xu30) null, apo.r(382839300, new x501(w501Var, b), x340Var6), apo.r(246812003, new x501(w501Var, (byte) 1), x340Var6), (xu30) null, (xu30) null, apo.r(-161269888, new x501(w501Var, (byte) 2), x340Var6), x340Var6, 100663366, 197040, 26300);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                e601 e601Var = (e601) obj4;
                jkr0 jkr0Var = (jkr0) obj5;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var8, 2131960880);
                    qim0 qim0VarN = anm1.N("reactions_sheet_tab", nim0Var);
                    boolean z6 = ((err0) jkr0Var.d.c).s() == 0;
                    boolean zI = x340Var8.i(e601Var);
                    Object objT3 = x340Var8.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new a601(e601Var, (byte) 0);
                        x340Var8.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    m5n1.d(z6, new gbx(new y50(strO0), function1), apo.r(-1101195231, new ziz0(jkr0Var, (byte) 9), x340Var8), qim0VarN, (idn0) null, (max) null, 0L, 0L, x340Var8, 3456, 496);
                    int i = 0;
                    for (Object obj6 : (c380) obj3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        pxz0 pxz0Var = (pxz0) obj6;
                        String strF = f4i1.f(e601Var.h.c(pxz0Var.a), " ", e601Var.c.a(pxz0Var.b));
                        qim0 qim0VarN2 = anm1.N("reactions_sheet_tab", nim0Var);
                        boolean z7 = ((err0) jkr0Var.d.c).s() == i2;
                        boolean zI2 = x340Var8.i(e601Var) | x340Var8.i(pxz0Var) | x340Var8.e(i);
                        Object objT4 = x340Var8.T();
                        if (zI2 || objT4 == m4cVar) {
                            objT4 = new wv1(e601Var, pxz0Var, i, (byte) 22);
                            x340Var8.s0(objT4);
                        }
                        Function0 function2 = (Function0) objT4;
                        if (ihc1.y0(strF)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        m5n1.d(z7, new gbx(new y50(strF), function2), apo.r(-651527648, new wjz0(jkr0Var, i, strF), x340Var8), qim0VarN2, (idn0) null, (max) null, 0L, 0L, x340Var8, 3456, 496);
                        i = i2;
                    }
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    era eraVar = een.Q0;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var10).b;
                    qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF2), 0.0f, 0.0f, 0.0f, ((vzq0) obj5).a(), 7);
                    x2y x2yVar = (x2y) obj4;
                    mk81 mk81Var = (mk81) obj3;
                    mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var10, 0);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(hmb0.t1);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(mbhVarA, x340Var10, y580.O0);
                    nko1.H(xos0VarM, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE, x340Var10, y580.Y);
                    xap1.h((qim0) null, x340Var10, 0);
                    cvx cvxVar2 = cbx.b(x340Var10).b;
                    op71.g(x340Var10, u291.h(nim0Var, 16.0f));
                    cto1.b(x340Var10, 0);
                    op71.g(x340Var10, u291.h(nim0Var, cbx.b(x340Var10).b.c));
                    cto1.c(x2yVar.b(), mk81Var, x340Var10, 0);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                zj01.e((Paragraph) obj5, (Paragraph) obj4, (Paragraph) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                um01 um01Var = (um01) obj;
                h910 h910Var = (h910) obj2;
                tb51 tb51Var = (tb51) obj3;
                di4 di4Var = (di4) obj5;
                mfk mfkVar = h910Var.i;
                an01 an01Var = h910Var.h;
                String str4 = an01Var.h;
                String str5 = um01Var.a;
                boolean z8 = sgy.i(str5) && (an01Var.p instanceof xn01);
                boolean z9 = an01Var.t;
                String str6 = an01Var.s;
                String str7 = an01Var.r;
                int i3 = an01Var.k;
                boolean z10 = str4.length() > 0;
                boolean zQ0 = di4Var.q0();
                ci4 ci4Var = ci4.b;
                boolean z11 = zQ0 || di4Var.s0() != ci4Var;
                int iOrdinal = mqo1.q(str5).ordinal();
                if (iOrdinal == 0) {
                    z = z10;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 13) {
                            z = z10;
                        }
                    } else if (z10 && z11) {
                        z = true;
                    }
                    z = false;
                }
                boolean z12 = sgy.e(str5) && h910Var.l;
                boolean z13 = sgy.i(str5) && z8 && h910Var.n;
                boolean z14 = i3 == 11 && ((fza1) obj4).b(str5);
                int iOrdinal2 = mqo1.q(str5).ordinal();
                if (iOrdinal2 == 0) {
                    z2 = z;
                } else if (iOrdinal2 == 1) {
                    z2 = z8;
                } else if (iOrdinal2 != 13) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (i3 == 11) {
                    charSequenceJ0 = bmq0.i0(tb51Var.e(an01Var.j, an01Var.m), tb51Var.d(an01Var.l, an01Var.n));
                    if (tb51Var.b.c0() && z14) {
                        charSequenceJ0 = tb51Var.b(charSequenceJ0);
                    }
                } else if (z8 || (z9 && an01Var.u)) {
                    if (!z9) {
                        str6 = "";
                    }
                    charSequenceJ0 = bmq0.j0(bmq0.j0(tb51Var.a.getResources().getString(2131961527), str7), str6);
                } else {
                    charSequenceJ0 = z9 ? bmq0.j0(bmq0.j0(tb51Var.a.getResources().getString(2131961531), str7), str6) : an01Var.b;
                }
                String string = (di4Var.N() && sgy.a(str5) && (str = an01Var.o) != null) ? tb51Var.a.getResources().getString(2131961553, str) : null;
                String str8 = um01Var.a;
                String str9 = an01Var.a;
                CharSequence charSequenceI0 = bmq0.i0(bmq0.i0(charSequenceJ0, mfkVar.a), string);
                String str10 = an01Var.c;
                boolean z15 = h910Var.d;
                boolean z16 = z2;
                int i4 = an01Var.d;
                boolean z17 = h910Var.c;
                boolean z18 = h910Var.b;
                boolean z19 = h910Var.f;
                boolean z20 = h910Var.g;
                boolean z21 = an01Var.w;
                int iQ = o0c.Q(h910Var.a, str5);
                boolean z22 = an01Var.e;
                boolean z23 = an01Var.f;
                boolean z24 = an01Var.g;
                bi4 bi4VarR0 = di4Var.r0();
                ci4 ci4VarS0 = di4Var.s0();
                boolean z25 = z12;
                if (xj60.a[mqo1.q(str5).ordinal()] != 3) {
                    z3 = false;
                } else {
                    boolean z26 = z8 && di4Var.s0() != ci4Var;
                    if (z && di4Var.q0() && !z26) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                boolean z27 = h910Var.j;
                boolean z28 = h910Var.k;
                boolean z29 = um01Var.f;
                boolean z30 = an01Var.l;
                boolean z31 = z25 || z13;
                if (!z25) {
                    if (z13) {
                        num2 = h910Var.o;
                    } else {
                        num = null;
                    }
                    if (z9 || !sgy.d(str5)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    boolean z32 = an01Var.v;
                    boolean z33 = an01Var.u;
                    boolean z34 = h910Var.e;
                    if (!h910Var.p && sgy.i(str5) && um01Var.f && !h910Var.f && an01Var.d == 2 && h910Var.b) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    return new vm01(str8, str9, charSequenceI0, str10, str4, z15, i4, z17, z18, z19, z20, z21, iQ, z, z3, z22, z23, z24, bi4VarR0, ci4VarS0, z27, z28, z29, z30, z31, num, z8, z9, z4, z32, z33, z14, z34, z5, z16 ? an01Var.q : "", mfkVar.b);
                }
                num2 = h910Var.m;
                num = num2;
                if (z9) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                boolean z35 = an01Var.v;
                boolean z36 = an01Var.u;
                boolean z37 = h910Var.e;
                if (!h910Var.p) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                return new vm01(str8, str9, charSequenceI0, str10, str4, z15, i4, z17, z18, z19, z20, z21, iQ, z, z3, z22, z23, z24, bi4VarR0, ci4VarS0, z27, z28, z29, z30, z31, num, z8, z9, z4, z35, z36, z14, z37, z5, z16 ? an01Var.q : "", mfkVar.b);
            case 19:
                ((Number) obj2).intValue();
                wwo1.k((eq01) obj5, (znb0) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                xk00 xk00Var = (xk00) obj4;
                uq01 uq01Var = (uq01) obj5;
                w25 w25Var = uq01Var.g;
                bpb1 bpb1Var = uq01Var.j.a;
                if (w25Var.F()) {
                    d0r d0rVar = ((ji50) obj3).a;
                    ufp ufpVar = uq01Var.l;
                    kdy0 kdy0Var = uq01Var.m;
                    sq01 sq01Var = new sq01(xk00Var);
                    wgp wgpVar = (wgp) ufpVar.a.c;
                    return new jpg0(f6o1.A(new cm0((vfp) wgpVar.N0.get(), wgpVar.u(), wgpVar.a(), d0rVar, bpb1Var, kdy0Var, sq01Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), mm01.X0);
                }
                dw01 dw01Var = uq01Var.a;
                vyq0 vyq0Var = uq01Var.b;
                vgm vgmVar = uq01Var.c;
                fgx fgxVar = uq01Var.d;
                lo60 lo60Var = uq01Var.e;
                tq01 tq01Var = new tq01(xk00Var);
                kly0 kly0Var = uq01Var.f;
                boolean z38 = uq01Var.h;
                agc0 agc0Var = uq01Var.i;
                t2j0 t2j0Var = uq01Var.k;
                boolean zA = uq01Var.n.a();
                c35 c35Var = uq01Var.p;
                return new jpg0(new aso(new zhc0(dw01Var, vyq0Var, vgmVar, fgxVar, lo60Var, tq01Var, kly0Var, bpb1Var, z38, agc0Var, t2j0Var, zA, c35Var.c(), c35Var.c() ? uq01Var.o : null, w25Var.N(), uq01Var.q, uq01Var.r), new ldz0((Object) uq01Var, (byte) 12)), mm01.Y0);
            case 21:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                kob1 kob1Var = (kob1) obj5;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    gm50 gm50Var = kob1Var.f;
                    String str11 = kob1Var.c;
                    if (str11 == null) {
                        str2 = kob1Var.b;
                    } else {
                        str2 = str11.length() > 0 ? str11 : null;
                        if (str2 == null) {
                            str2 = kob1Var.b;
                        }
                    }
                    String str12 = str2;
                    ycm ycmVar = (ycm) obj4;
                    String str13 = kob1Var.h;
                    String str14 = nik1.x0.a;
                    boolean zG3 = x340Var12.g(iu30Var4);
                    Object objT5 = x340Var12.T();
                    if (zG3 || objT5 == m4cVar2) {
                        objT5 = new fr01(iu30Var4, (byte) 14);
                        x340Var12.s0(objT5);
                    }
                    Function0 function3 = (Function0) objT5;
                    boolean zG4 = x340Var12.g(iu30Var4);
                    Object objT6 = x340Var12.T();
                    if (zG4 || objT6 == m4cVar2) {
                        objT6 = new fr01(iu30Var4, (byte) 15);
                        x340Var12.s0(objT6);
                    }
                    kyo1.l(gm50Var, false, str12, ycmVar, str13, str14, function3, (Function0) objT6, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((lx01) obj5).y((jx01) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                ((ky01) obj5).f(czo1.p(1), (String) obj4, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((ky01) obj5).g((gy01) obj3, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ((e511) obj5).a(czo1.p(385), (String) obj4, (b0k) obj, (iu30) obj3);
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                z1p1.f((Set) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                lz20 lz20Var = (lz20) obj5;
                Function0 function4 = (Function0) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    k6a1 k6a1Var = (k6a1) x340Var14.k(t4k.q);
                    boolean zI3 = x340Var14.i(k6a1Var) | x340Var14.g(function4);
                    Object objT7 = x340Var14.T();
                    if (zI3 || objT7 == fkj0.X) {
                        objT7 = new onv(k6a1Var, function4, (byte) 3);
                        x340Var14.s0(objT7);
                    }
                    Function0 function5 = (Function0) objT7;
                    ud11.c(function4, x340Var14, 0);
                    ud11.b(lz20Var, x340Var14, 0);
                    ud11.a(function5, apo.r(880599213, new hho0(obj3, (Object) function5, (Object) lz20Var, (byte) 24), x340Var14), x340Var14, 48);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                kw7.a((fk11) obj5, (j2i) obj4, (gbx) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                u2p1.b((nk11) obj5, (j2i) obj4, (gbx) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffx0(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffx0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ffx0(byte b, int i, Object obj, Object obj2, Function0 function0) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = function0;
    }
}
