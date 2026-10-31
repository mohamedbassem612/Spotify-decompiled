package p;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sdb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdb1(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((vdb1) obj4).e((tdb1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                usb1 usb1Var = (usb1) obj4;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                sdv0 sdv0Var = (sdv0) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int iC = l1d.C(usb1Var.e);
                    if (iC == 0) {
                        x340Var2.i0(-1563689830);
                        b3o1.n(usb1Var, sdv0Var.b, (nsq) sdv0Var.d, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var2, -1563695061, false);
                        }
                        x340Var2.i0(-1563693184);
                        e130.l(usb1Var, sdv0Var.b, (nsq) sdv0Var.d, (qim0) null, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Object obj5 = fkj0.X;
                ewb1 ewb1Var = (ewb1) obj4;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                boolean z = ewb1Var.h;
                boolean zG = x340Var4.g(iu30Var);
                Object objT = x340Var4.T();
                if (zG || objT == obj5) {
                    objT = new et61(iu30Var, (byte) 27);
                    x340Var4.s0(objT);
                }
                qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
                boolean zG2 = x340Var4.g(iu30Var);
                Object objT2 = x340Var4.T();
                if (zG2 || objT2 == obj5) {
                    objT2 = new ni6(iu30Var, (byte) 4);
                    x340Var4.s0(objT2);
                }
                y4o1.o(ewb1Var, k8p1.q(qim0VarF, z, f8d1.b(qim0VarB, rih1Var, (PointerInputEventHandler) objT2)), x340Var4, 0);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                y4o1.a((cwb1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                y4o1.o((ewb1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                boolean zY = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                j06 j06Var = x340Var6.a;
                if (!zY) {
                    x340Var6.b0();
                    return rih1Var;
                }
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var6).b;
                zov0 zov0Var = cbx.b(x340Var6).g;
                int iX0 = (int) (((wat) x340Var6.k(t4k.h)).X0(368.0f) * 0.33783785f * 3.0f);
                qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.g);
                float f = cbx.b(x340Var6).b.a;
                cvx cvxVar2 = cbx.b(x340Var6).b;
                qim0 qim0VarY2 = uyn1.y(qim0VarY, f, 8.0f);
                mxb1 mxb1Var = (mxb1) obj4;
                iu30 iu30Var2 = (iu30) obj3;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var6, 0);
                int iHashCode = Long.hashCode(x340Var6.T);
                xos0 xos0VarM = x340Var6.m();
                qim0 qim0VarE = zr7.E(x340Var6, qim0VarY2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var6, lljVar4);
                nko1.H(xos0VarM, x340Var6, lljVar3);
                nko1.H(Integer.valueOf(iHashCode), x340Var6, lljVar2);
                nko1.F(x340Var6);
                nko1.H(qim0VarE, x340Var6, lljVar);
                x340Var6.i0(257722562);
                Iterator it = o7h.s1(mxb1Var.a, 4, 4).iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    List list = (List) next;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    Iterator it2 = it;
                    int i3 = i;
                    jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var6, 0);
                    llj lljVar5 = lljVar;
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarF2);
                    hzj.A.getClass();
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA, x340Var6, lljVar4);
                    nko1.H(xos0VarM2, x340Var6, lljVar3);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, lljVar2);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, lljVar5);
                    x340Var6.i0(-657145948);
                    Iterator it3 = list.iterator();
                    int i4 = 0;
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        nxb1 nxb1Var = (nxb1) next2;
                        int i6 = (i3 * 4) + i4;
                        rih1 rih1Var2 = rih1Var;
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        Iterator it4 = it3;
                        qim0 qim0VarN = anm1.N("stickers_bottom_sheet_cell_" + nxb1Var.a, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                        boolean zG3 = x340Var6.g(iu30Var2) | x340Var6.e(i6) | x340Var6.g(nxb1Var);
                        Object objT3 = x340Var6.T();
                        if (zG3 || objT3 == fkj0.X) {
                            objT3 = new wv1(iu30Var2, i6, nxb1Var, (byte) 28);
                            x340Var6.s0(objT3);
                        }
                        qim0 qim0VarX = bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15);
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        int iHashCode3 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM3 = x340Var6.m();
                        qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarX);
                        hzj.A.getClass();
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(gfh0VarC, x340Var6, lljVar4);
                        nko1.H(xos0VarM3, x340Var6, lljVar3);
                        nko1.H(Integer.valueOf(iHashCode3), x340Var6, lljVar2);
                        nko1.F(x340Var6);
                        nko1.H(qim0VarE3, x340Var6, lljVar5);
                        x340 x340Var7 = x340Var6;
                        iko1.f(Uri.parse(nxb1Var.a), iX0, u291.r(nim0Var, 64.0f), nxb1Var.b, x340Var7, 0);
                        x340Var7.r(true);
                        x340Var6 = x340Var7;
                        i4 = i5;
                        rih1Var = rih1Var2;
                        it3 = it4;
                    }
                    x340 x340Var8 = x340Var6;
                    rih1 rih1Var3 = rih1Var;
                    x340Var8.r(false);
                    x340Var8.i0(-657119472);
                    int size = 4 - list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        op71.g(x340Var8, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    }
                    x340Var8.r(false);
                    x340Var8.r(true);
                    x340Var6 = x340Var8;
                    i = i2;
                    lljVar = lljVar5;
                    rih1Var = rih1Var3;
                    it = it2;
                }
                x340 x340Var9 = x340Var6;
                rih1 rih1Var4 = rih1Var;
                x340Var9.r(false);
                x340Var9.r(true);
                return rih1Var4;
            case 6:
                x340 x340Var10 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    bjc1 bjc1Var = (bjc1) obj3;
                    for (qm70 qm70Var : (c380) obj4) {
                        cqs0 cqs0Var = bjc1Var.a;
                        Class<?> cls = qm70Var.getClass();
                        jd11 jd11Var = rc11.a;
                        Object obj6 = cqs0Var.get(jd11Var.b(cls));
                        if (obj6 == null) {
                            hhg1.f(l1d.m("No mapping found for type ", jd11Var.b(qm70Var.getClass()).r()));
                            return null;
                        }
                        ((hqg0) obj6).a(qm70Var, x340Var11, 0);
                    }
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                bpo1.a((wb81) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                eso1.k((oxc1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var12 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    eso1.m((rxc1) obj4, ((txc1) obj3).a, (qim0) null, x340Var13, 8);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                kto1.f((v660) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                kto1.i((w660) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var14 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                    wck wckVar = (wck) obj4;
                    String str = (String) obj3;
                    jw31 jw31VarA2 = ew31.a(h36.e, een.N0, x340Var15, 0);
                    int iHashCode4 = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM4 = x340Var15.m();
                    qim0 qim0VarE4 = zr7.E(x340Var15, qim0VarF3);
                    hzj.A.getClass();
                    if (x340Var15.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    nko1.H(jw31VarA2, x340Var15, y580.O0);
                    nko1.H(xos0VarM4, x340Var15, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var15, y580.R0);
                    nko1.F(x340Var15);
                    nko1.H(qim0VarE4, x340Var15, y580.Y);
                    int i8 = wckVar instanceof uck ? 3 : 0;
                    x340Var15.i0(-687802209);
                    x340Var15.r(false);
                    uwr uwrVar2 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var15).k;
                    cvx cvxVar3 = cbx.b(x340Var15).b;
                    uwo1.e(str, uyn1.z(0.0f, 4.0f, 1, nim0Var), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2040);
                    if (i8 != 0) {
                        x340Var15.i0(-687568996);
                        cvx cvxVar4 = cbx.b(x340Var15).b;
                        op71.g(x340Var15, u291.v(nim0Var, 8.0f));
                        hux huxVarK = rck.k(i8);
                        zov0 zov0Var2 = cbx.b(x340Var15).g;
                        w0h1.a(huxVarK, isl.a, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var15, 56, 56);
                        x340Var15.r(false);
                    } else {
                        x340Var15.i0(-687320097);
                        x340Var15.r(false);
                    }
                    x340Var15.r(true);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 13:
                return new jpg0(f6o1.A(((rk11) ((uw0) obj4).g).a((zob1) obj, (hho) obj3, 2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), zld1.f);
            case 14:
                mmd1 mmd1Var = (mmd1) obj4;
                return l6o1.A(new jpg0(f6o1.A(ycm.a(mmd1Var.x), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), new cmd1(mmd1Var, (wlr) obj3, b2)));
            case 15:
                return new kpg0(((mmd1) obj4).k.a((zob1) obj, (hho) obj3, 2), zld1.d1);
            case 16:
                x340 x340Var16 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var17).b;
                    fod1 fod1Var = (fod1) obj4;
                    iod1 iod1Var = (iod1) obj3;
                    jw31 jw31VarA3 = ew31.a(new d36(8.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var17, 0);
                    int iHashCode5 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM5 = x340Var17.m();
                    qim0 qim0VarE5 = zr7.E(x340Var17, nim0Var);
                    hzj.A.getClass();
                    if (x340Var17.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(jw31VarA3, x340Var17, y580.O0);
                    nko1.H(xos0VarM5, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE5, x340Var17, y580.Y);
                    String str2 = fod1Var.b;
                    if (str2 == null || ihc1.y0(str2) || iod1Var.N0 == null) {
                        x340Var17.i0(1154301642);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(1153769248);
                        mod.b(oi7.a.a(iod1Var.getImageLoader()), apo.r(-195250624, new gsc1(fod1Var, (byte) 3), x340Var17), x340Var17, 56);
                        x340Var17.r(false);
                    }
                    uwo1.e(fod1Var.a, (qim0) null, cbx.d(x340Var17).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var17, 0, 0, 2042);
                    x340Var17.r(true);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                mpd1.a((lpd1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                n2m0 n2m0Var = (n2m0) obj3;
                Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
                n2m0Var.getClass();
                x6h1 x6h1VarC = n2m0Var.a.c();
                x6h1VarC.i.add(new a7h1("prompt_suggestion_chip", (String) obj2, numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = n2m0Var.b.c;
                ((i8h1) obj4).f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                cvd1.i((String) obj4, (lee1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                x340 x340Var18 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                txd1 txd1Var = (txd1) obj4;
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    foo1.f(new gbx(z50.c, txd1Var.b), (qim0) obj3, (max) null, yla.s(x340Var19), (idn0) null, (vu30) null, (vu30) null, apo.r(1016972417, new gsc1(txd1Var, (byte) 10), x340Var19), x340Var19, 12582912, 116);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var20 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    u0e1 u0e1Var = (u0e1) obj4;
                    chf0 chf0Var = u0e1Var.a;
                    int i9 = u0e1Var.b;
                    boolean z2 = u0e1Var.c;
                    boolean zG4 = x340Var21.g(iu30Var3);
                    Object objT4 = x340Var21.T();
                    if (zG4 || objT4 == m4cVar) {
                        objT4 = new b1c1(iu30Var3, (byte) 6);
                        x340Var21.s0(objT4);
                    }
                    iu30 iu30Var4 = (iu30) objT4;
                    boolean zG5 = x340Var21.g(iu30Var3);
                    Object objT5 = x340Var21.T();
                    if (zG5 || objT5 == m4cVar) {
                        objT5 = new pwc1(iu30Var3, (byte) 7);
                        x340Var21.s0(objT5);
                    }
                    Function0 function0 = (Function0) objT5;
                    boolean zG6 = x340Var21.g(iu30Var3);
                    Object objT6 = x340Var21.T();
                    if (zG6 || objT6 == m4cVar) {
                        objT6 = new pwc1(iu30Var3, (byte) 8);
                        x340Var21.s0(objT6);
                    }
                    i2p1.g(chf0Var, i9, z2, iu30Var4, function0, (Function0) objT6, x340Var21, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var22 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    a3e1 a3e1Var = (a3e1) obj3;
                    j2p1.o(((w2e1) ((y2e1) obj4)).a, a3e1Var.i, a3e1Var.t, a3e1Var.X, a3e1Var.Y, a3e1Var.g, a3e1Var.Z, (qim0) null, x340Var23, 0, 128);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                q3p1.f((v220) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((lvc1) obj4).f(czo1.p(7), (j2i) obj3, (b0k) obj);
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                x9p1.d((wr21) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                xap1.j((yle1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                long j = ((Offset) obj2).a;
                ((hav0) obj).a();
                m811 m811Var = (m811) obj4;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + m811Var.a;
                m811Var.a = fIntBitsToFloat;
                ((iu30) obj3).invoke(Float.valueOf(fIntBitsToFloat));
                return rih1Var;
            case 28:
                x340 x340Var24 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ((aqw) obj4).a((e5f1) obj3, (qe41) null, x340Var25, 0, 2);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                sbl.c((r6f1) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdb1(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
