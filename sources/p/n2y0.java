package p;

import android.net.Uri;
import android.os.Handler;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n2y0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2y0(czj1 czj1Var, iu30 iu30Var, pzj1 pzj1Var, vzj1 vzj1Var, jzj1 jzj1Var) {
        super(3);
        this.a = (byte) 12;
        this.c = czj1Var;
        this.b = iu30Var;
        this.d = pzj1Var;
        this.e = vzj1Var;
        this.f = jzj1Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        j2i j2iVar = (j2i) this.e;
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        vu30 vu30Var = (vu30) this.d;
        uwr uwrVar = cbx.a;
        cbx.a.getClass();
        float f = uwr.d().a * 240.0f;
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        j06 j06Var = x340Var.a;
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = bb00.h(0, x340Var);
        }
        hdn0 hdn0Var = (hdn0) objT;
        double d = ((double) (i2cVar.d() - f)) / 2.0d;
        ((j2i) this.c).invoke(x340Var, 0);
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        if (vu30Var != null) {
            x340Var.i0(-1958416550);
            float fD = i2cVar.d() * 0.6f;
            qim0 qim0VarB = uyn1.B(u291.f(i2cVar.a(nim0Var, een.X), 1.0f), 16.0f, 0.0f, 16.0f, bth.b, 2);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            qim0 qim0VarX = u291.x(0.0f, fD, 1, nim0Var);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            vu30Var.invoke(x340Var, 0);
            x340Var.r(true);
            cvx cvxVar = cbx.b(x340Var).b;
            wnb0 wnb0VarK = c13.k(nim0Var, 4.0f, x340Var, 1.0f, false);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, wnb0VarK);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar4);
            nko1.H(xos0VarM3, x340Var, lljVar3);
            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar);
            ktd.s(j2iVar, x340Var, 0, true, true);
            x340Var.r(false);
        } else {
            x340Var.i0(-1957562376);
            qim0 qim0VarB2 = i2cVar.b(nim0Var);
            vu30 vu30Var2 = (vu30) this.f;
            hob1 hob1Var = (hob1) this.b;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM4, x340Var, lljVar3);
            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            jw31 jw31VarA2 = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar4);
            nko1.H(xos0VarM5, x340Var, lljVar3);
            x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar);
            if (d > 0.0d) {
                x340Var.i0(1898780861);
                ab80.p(nim0Var, (float) d, x340Var, false);
            } else {
                x340Var.i0(1898866390);
                x340Var.r(false);
            }
            op71.g(x340Var, new wnb0(1.0f, true));
            boolean zI = x340Var.i(hdn0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new myg0(hdn0Var, (byte) 28);
                x340Var.s0(objT2);
            }
            bth.a((iu30) objT2, j2iVar, (vu30) null, vu30Var2, hob1Var.A, (iu30) null, x340Var, 384, 32);
            us71.m(x340Var, true, true, false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        e27 e27Var;
        cm0 cm0Var;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarW = uyn1.w(nim0Var, (vzq0) obj);
        bve1 bve1Var = (si1) this.c;
        ztq ztqVar = (ztq) this.d;
        iu30 iu30Var = (iu30) this.b;
        fhi1 fhi1Var = (fhi1) this.e;
        ytq ytqVar = (ytq) this.f;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z2) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        if (bve1Var == null || (bve1Var instanceof ave1)) {
            x340Var3.i0(-2016649159);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xto1.e((qim0) null, 0, 0L, 0L, x340Var, 0, 15);
            z = true;
            x340Var3.r(true);
            x340Var3.r(false);
        } else {
            if (bve1Var instanceof bve1) {
                x340Var3.i0(-2016439134);
                boolean zG = x340Var3.g(iu30Var);
                Object objT = x340Var3.T();
                if (zG || objT == m4cVar) {
                    objT = new b1c1(iu30Var, (byte) 12);
                    x340Var3.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                switch (ztqVar.a) {
                    case 0:
                        f0a f0aVar = (f0a) ztqVar.b.c;
                        lsq lsqVar = (lsq) ((jly0) f0aVar.i).get();
                        msq msqVar = (msq) ((jly0) f0aVar.X).get();
                        auq auqVar = (auq) ((jly0) f0aVar.Y).get();
                        buq buqVar = (buq) ((jly0) f0aVar.Z).get();
                        cuq cuqVar = (cuq) ((jly0) f0aVar.N0).get();
                        duq duqVar = (duq) ((jly0) f0aVar.O0).get();
                        xtq xtqVar = (xtq) ((jly0) f0aVar.P0).get();
                        fhi1 fhi1Var2 = (fhi1) ((jly0) f0aVar.g).get();
                        yqg yqgVar = (yqg) ((lii1) f0aVar.b).r.get();
                        c8o.l(yqgVar);
                        cm0Var = new cm0(iu30Var2, lsqVar, msqVar, auqVar, buqVar, cuqVar, duqVar, xtqVar, fhi1Var2, yqgVar);
                        break;
                    default:
                        wj3 wj3Var = (wj3) ztqVar.b.c;
                        lsq lsqVar2 = (lsq) ((jly0) wj3Var.h).get();
                        msq msqVar2 = (msq) ((jly0) wj3Var.t).get();
                        auq auqVar2 = (auq) ((jly0) wj3Var.X).get();
                        buq buqVar2 = (buq) ((jly0) wj3Var.Y).get();
                        cuq cuqVar2 = (cuq) ((jly0) wj3Var.Z).get();
                        duq duqVar2 = (duq) ((jly0) wj3Var.N0).get();
                        xtq xtqVar2 = (xtq) ((jly0) wj3Var.O0).get();
                        fhi1 fhi1Var3 = (fhi1) ((jly0) wj3Var.f).get();
                        yqg yqgVar2 = (yqg) ((pii1) wj3Var.b).q.get();
                        c8o.l(yqgVar2);
                        cm0Var = new cm0(iu30Var2, lsqVar2, msqVar2, auqVar2, buqVar2, cuqVar2, duqVar2, xtqVar2, fhi1Var3, yqgVar2);
                        break;
                }
                otw.c(cm0Var, new tse1(bve1Var.f), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var3.r(false);
            } else if (bve1Var instanceof zue1) {
                x340Var3.i0(-2015780415);
                boolean zG2 = x340Var3.g(iu30Var);
                Object objT2 = x340Var3.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new pwc1(iu30Var, (byte) 21);
                    x340Var3.s0(objT2);
                }
                otw.c(new hhz(fhi1Var, (Function0) objT2), ((zue1) bve1Var).f, (qim0) null, (ipb1) null, x340Var, 8, 12);
                x340Var3.r(false);
            } else {
                if (!(bve1Var instanceof cve1)) {
                    throw p3d1.k(x340Var3, -342149095, false);
                }
                x340Var3.i0(-2015518124);
                switch (ytqVar.a) {
                    case 0:
                        f0a f0aVar2 = (f0a) ytqVar.b.c;
                        lzn0 lzn0Var = (lzn0) ((lii1) f0aVar2.b).f.get();
                        c8o.l(lzn0Var);
                        gw70 gw70Var = (gw70) ((lii1) f0aVar2.b).d.get();
                        c8o.l(gw70Var);
                        e27Var = new e27(gw70Var, lzn0Var);
                        break;
                    default:
                        wj3 wj3Var2 = (wj3) ytqVar.b.c;
                        lzn0 lzn0Var2 = (lzn0) ((pii1) wj3Var2.b).c.get();
                        c8o.l(lzn0Var2);
                        gw70 gw70Var2 = (gw70) ((pii1) wj3Var2.b).e.get();
                        c8o.l(gw70Var2);
                        e27Var = new e27(gw70Var2, lzn0Var2);
                        break;
                }
                otw.c(e27Var, ((cve1) bve1Var).f, (qim0) null, (ipb1) null, x340Var, 8, 12);
                x340Var3.r(false);
            }
            z = true;
        }
        x340Var3.r(z);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:310:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:312:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:314:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:315:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:323:0x0b5d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:331:0x0bcb  */
    /* JADX WARN: Code duplicated, block: B:334:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:335:0x0c40  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        t201 t201Var;
        m4c m4cVar;
        int iIntValue;
        long j;
        String strN0;
        boolean z;
        max maxVar;
        String strO0;
        boolean zG;
        Object objT;
        Function0 function0;
        int iIntValue2;
        d631 d631Var;
        String strU;
        tl3 tl3Var;
        m4c m4cVar2;
        boolean z2;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.e;
        Object obj7 = this.f;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj5;
                List list = (List) obj8;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((x2y0) it.next()).b);
                }
                p40 p40Var = (p40) obj4;
                hz5 hz5Var = (hz5) obj6;
                op41 op41Var = (op41) obj7;
                x340 x340Var2 = x340Var;
                boolean zG2 = x340Var2.g(iu30Var) | x340Var2.g(list);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new v40(iu30Var, list, (byte) 2);
                    x340Var2.s0(objT2);
                }
                ryn1.i(arrayList, p40Var, hz5Var, op41Var, (qim0) null, (iu30) objT2, (iu30) null, x340Var2, 0, 80);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar3 = fkj0.X;
                iu30 iu30Var2 = (iu30) obj5;
                u201 u201Var = (u201) obj8;
                c380 c380Var = (c380) obj4;
                if (c380Var != null) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-398033272);
                    String str = (String) obj6;
                    boolean zG3 = x340Var4.g(iu30Var2);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == m4cVar3) {
                        objT3 = new iuy0(iu30Var2, (byte) 1);
                        x340Var4.s0(objT3);
                    }
                    t201 t201Var2 = new t201(c380Var, str, (vu30) objT3, (iu30) obj7);
                    x340Var4.r(false);
                    t201Var = t201Var2;
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-397763541);
                    String str2 = (String) obj6;
                    boolean zG4 = x340Var5.g(iu30Var2);
                    Object objT4 = x340Var5.T();
                    if (zG4 || objT4 == m4cVar3) {
                        objT4 = new iuy0(iu30Var2, (byte) 2);
                        x340Var5.s0(objT4);
                    }
                    t201 t201Var3 = new t201(null, str2, (vu30) objT4, (iu30) obj7, 1);
                    x340Var5.r(false);
                    t201Var = t201Var3;
                }
                otw.c(u201Var, t201Var, (qim0) null, (ipb1) null, x340Var3, 0, 12);
                return rih1Var;
            case 2:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, cbx.b(x340Var6).b.e, 7);
                x340 x340Var7 = x340Var6;
                String str3 = (String) obj6;
                boolean zI = x340Var7.i((dc8) obj4) | x340Var7.g(str3) | x340Var7.g((List) obj8) | x340Var7.i((lgu0) obj7) | x340Var7.g((iu30) obj5);
                List list3 = (List) obj8;
                dc8 dc8Var = (dc8) obj4;
                lgu0 lgu0Var = (lgu0) obj7;
                iu30 iu30Var3 = (iu30) obj5;
                Object objT5 = x340Var7.T();
                if (zI || objT5 == fkj0.X) {
                    objT5 = new tjf0(list3, dc8Var, str3, lgu0Var, iu30Var3, (byte) 11);
                    x340Var7.s0(objT5);
                }
                ujo1.d(qim0VarB, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, x340Var7, 0, 510);
                return rih1Var;
            case 3:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar4 = fkj0.X;
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarY = too1.y(qim0VarF2, lhc.g(x340Var8).e);
                cvx cvxVar = cbx.b(x340Var8).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarY);
                cvx cvxVar2 = cbx.b(x340Var8).b;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                String str4 = (String) obj8;
                ven0 ven0Var = (ven0) obj4;
                ven0 ven0Var2 = (ven0) obj6;
                y7e1 y7e1Var = (y7e1) obj7;
                vu30 vu30Var = (vu30) obj5;
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode = Long.hashCode(x340Var9.T);
                xos0 xos0VarM = x340Var9.m();
                qim0 qim0VarE = zr7.E(x340Var8, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var8, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var8, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var8, lljVar3);
                nko1.F(x340Var8);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var8, lljVar4);
                era eraVar2 = een.Q0;
                tq60 tq60Var = new tq60(eraVar2);
                cvx cvxVar3 = cbx.b(x340Var8).b;
                uwo1.e(str4, uyn1.B(tq60Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), cbx.d(x340Var8).h, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2032);
                rqo1.g(0, 1, x340Var8, (qim0) null);
                cvx cvxVar4 = cbx.b(x340Var8).b;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                cvx cvxVar5 = cbx.b(x340Var8).b;
                mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var8, 0);
                int iHashCode2 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM2 = x340Var10.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarZ2);
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(mbhVarA2, x340Var8, lljVar);
                nko1.H(xos0VarM2, x340Var8, lljVar2);
                i3a.l(iHashCode2, x340Var8, lljVar3, x340Var8);
                nko1.H(qim0VarE2, x340Var8, lljVar4);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                cvx cvxVar6 = cbx.b(x340Var8).b;
                d36 d36Var2 = new d36(8.0f, true, new um5(false));
                cvx cvxVar7 = cbx.b(x340Var8).b;
                k5p1.d(qim0VarF3, d36Var2, new d36(16.0f, true, new um5(false)), (pl3) null, 0, 0, apo.r(666752361, new nf0(ven0Var, (byte) 7), x340Var8), x340Var8, 1572864, 56);
                x340Var10.i0(-1287185461);
                x340Var10.i0(939287598);
                zxx zxxVarM = pwo1.m(x340Var10);
                x340Var10.r(false);
                fyx fyxVar = new fyx(zxx.a(zxxVarM, zxxVarM.f, 0L, 0L, 0L, 1007));
                x340Var10.r(false);
                boolean zI2 = x340Var10.i(ven0Var2);
                Object objT6 = x340Var10.T();
                if (!zI2) {
                    m4cVar = m4cVar4;
                    if (objT6 == m4cVar) {
                    }
                    rwo1.a(y7e1Var, fyxVar, anm1.N("reflection_survey_sheet_text_field", i1p1.q(u291.f(u291.h(nim0Var, 138.0f), 1.0f), er31.b(20.0f))), (max) null, cwl1.o0(x340Var10, 2131961003), (vu30) null, (vu30) null, false, (dk80) objT6, (lee1) null, kua0.a(kua0.g, 7, (Boolean) null, 118), (yta0) null, (e6e1) null, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, x340Var10, 0, 0, 0, 2094568);
                    iIntValue = 500 - ((Number) ven0Var2.getValue()).intValue();
                    if (iIntValue < 10) {
                        x340Var10.i0(-746474812);
                        j = cbx.a(x340Var10).c.d;
                        x340Var10.r(false);
                    } else if (iIntValue < 30) {
                        x340Var10.i0(-746471869);
                        j = cbx.a(x340Var10).c.e;
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-746470269);
                        j = cbx.a(x340Var10).c.b;
                        x340Var10.r(false);
                    }
                    long j2 = j;
                    cvx cvxVar8 = cbx.b(x340Var8).b;
                    uwo1.e(String.valueOf(iIntValue), u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f), cbx.d(x340Var8).m, j2, new a0e1(6), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2016);
                    if (!((Set) ven0Var.getValue()).isEmpty() || (iIntValue2 = ((Number) ven0Var2.getValue()).intValue()) < 0 || iIntValue2 >= 501) {
                        x340Var10.i0(-2012428147);
                        if (((Set) ven0Var.getValue()).isEmpty()) {
                            z = false;
                            strN0 = x0d.k(x340Var10, -2012337689, 2131960999, x340Var10, false);
                        } else {
                            x340Var10.i0(-2012222121);
                            strN0 = cwl1.n0(2131960998, new Object[]{500, Integer.valueOf(((Number) ven0Var2.getValue()).intValue())}, x340Var10);
                            z = false;
                            x340Var10.r(false);
                        }
                        max haxVar = new hax(strN0);
                        x340Var10.r(z);
                        maxVar = haxVar;
                    } else {
                        x340Var10.i0(-2012480847);
                        x340Var10.r(false);
                        maxVar = jax.a;
                    }
                    strO0 = cwl1.o0(x340Var8, 2131961002);
                    zG = x340Var10.g(vu30Var) | x340Var10.i(ven0Var) | x340Var10.i(y7e1Var);
                    objT = x340Var10.T();
                    if (zG || objT == m4cVar) {
                        objT = new d4v0(vu30Var, y7e1Var, ven0Var, (byte) 18);
                        x340Var10.s0(objT);
                    }
                    function0 = (Function0) objT;
                    if (!ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(strO0), function0);
                    idx idxVar = new idx(4);
                    cvx cvxVar9 = cbx.b(x340Var10).b;
                    foo1.c(gbxVar, idxVar, anm1.N("reflection_survey_sheet_submit_button", u291.x(102.0f, 0.0f, 2, uyn1.z(0.0f, 8.0f, 1, nim0Var).then(new tq60(eraVar2)))), maxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, pcj.a, x340Var10, 0, 48, 2024);
                    ydh.l(nim0Var, cbx.b(x340Var8).b.c, x340Var8, x340Var10, true);
                    x340Var10.r(true);
                    return rih1Var;
                }
                m4cVar = m4cVar4;
                objT6 = new sd11(ven0Var2);
                x340Var10.s0(objT6);
                rwo1.a(y7e1Var, fyxVar, anm1.N("reflection_survey_sheet_text_field", i1p1.q(u291.f(u291.h(nim0Var, 138.0f), 1.0f), er31.b(20.0f))), (max) null, cwl1.o0(x340Var10, 2131961003), (vu30) null, (vu30) null, false, (dk80) objT6, (lee1) null, kua0.a(kua0.g, 7, (Boolean) null, 118), (yta0) null, (e6e1) null, (vu30) null, (idn0) null, (uwg) null, (es41) null, (vzq0) null, 0.0f, false, x340Var10, 0, 0, 0, 2094568);
                iIntValue = 500 - ((Number) ven0Var2.getValue()).intValue();
                if (iIntValue < 10) {
                    x340Var10.i0(-746474812);
                    j = cbx.a(x340Var10).c.d;
                    x340Var10.r(false);
                } else if (iIntValue < 30) {
                    x340Var10.i0(-746471869);
                    j = cbx.a(x340Var10).c.e;
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(-746470269);
                    j = cbx.a(x340Var10).c.b;
                    x340Var10.r(false);
                }
                long j3 = j;
                cvx cvxVar10 = cbx.b(x340Var8).b;
                uwo1.e(String.valueOf(iIntValue), u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f), cbx.d(x340Var8).m, j3, new a0e1(6), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2016);
                if (((Set) ven0Var.getValue()).isEmpty()) {
                    x340Var10.i0(-2012428147);
                    if (((Set) ven0Var.getValue()).isEmpty()) {
                        z = false;
                        strN0 = x0d.k(x340Var10, -2012337689, 2131960999, x340Var10, false);
                    } else {
                        x340Var10.i0(-2012222121);
                        strN0 = cwl1.n0(2131960998, new Object[]{500, Integer.valueOf(((Number) ven0Var2.getValue()).intValue())}, x340Var10);
                        z = false;
                        x340Var10.r(false);
                    }
                    max haxVar2 = new hax(strN0);
                    x340Var10.r(z);
                    maxVar = haxVar2;
                } else {
                    x340Var10.i0(-2012428147);
                    if (((Set) ven0Var.getValue()).isEmpty()) {
                        z = false;
                        strN0 = x0d.k(x340Var10, -2012337689, 2131960999, x340Var10, false);
                    } else {
                        x340Var10.i0(-2012222121);
                        strN0 = cwl1.n0(2131960998, new Object[]{500, Integer.valueOf(((Number) ven0Var2.getValue()).intValue())}, x340Var10);
                        z = false;
                        x340Var10.r(false);
                    }
                    max haxVar3 = new hax(strN0);
                    x340Var10.r(z);
                    maxVar = haxVar3;
                }
                strO0 = cwl1.o0(x340Var8, 2131961002);
                zG = x340Var10.g(vu30Var) | x340Var10.i(ven0Var) | x340Var10.i(y7e1Var);
                objT = x340Var10.T();
                if (zG) {
                    objT = new d4v0(vu30Var, y7e1Var, ven0Var, (byte) 18);
                    x340Var10.s0(objT);
                } else {
                    objT = new d4v0(vu30Var, y7e1Var, ven0Var, (byte) 18);
                    x340Var10.s0(objT);
                }
                function0 = (Function0) objT;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar2 = new gbx(new y50(strO0), function0);
                idx idxVar2 = new idx(4);
                cvx cvxVar11 = cbx.b(x340Var10).b;
                foo1.c(gbxVar2, idxVar2, anm1.N("reflection_survey_sheet_submit_button", u291.x(102.0f, 0.0f, 2, uyn1.z(0.0f, 8.0f, 1, nim0Var).then(new tq60(eraVar2)))), maxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, pcj.a, x340Var10, 0, 48, 2024);
                ydh.l(nim0Var, cbx.b(x340Var8).b.c, x340Var8, x340Var10, true);
                x340Var10.r(true);
                return rih1Var;
            case 4:
                d631 d631Var2 = (d631) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                Handler handler = (Handler) obj5;
                txk0 txk0Var = (txk0) obj6;
                g5l0 g5l0Var = (g5l0) obj7;
                m4c m4cVar5 = fkj0.X;
                s531 s531Var = (s531) obj4;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var11.g(d631Var2) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zB = ef.a(x340Var12).b(7);
                    wzv0 wzv0Var = (wzv0) obj8;
                    int i = iIntValue3 & 14;
                    boolean zI3 = x340Var12.i(s531Var) | (i == 4);
                    Object objT7 = x340Var12.T();
                    if (zI3 || objT7 == m4cVar5) {
                        objT7 = new ob01(s531Var, d631Var2, (lnm) null, (byte) 9);
                        x340Var12.s0(objT7);
                    }
                    iu30 iu30Var4 = (iu30) objT7;
                    boolean zI4 = x340Var12.i(s531Var) | x340Var12.i(txk0Var);
                    Object objT8 = x340Var12.T();
                    if (zI4 || objT8 == m4cVar5) {
                        objT8 = new rl21(s531Var, txk0Var, (byte) 2);
                        x340Var12.s0(objT8);
                    }
                    Function0 function1 = (Function0) objT8;
                    boolean zI5 = x340Var12.i(s531Var) | x340Var12.i(g5l0Var) | (i == 4) | x340Var12.i(handler);
                    Object objT9 = x340Var12.T();
                    if (zI5 || objT9 == m4cVar5) {
                        d631Var = d631Var2;
                        odp0 odp0Var = new odp0(s531Var, g5l0Var, d631Var, handler, (byte) 11);
                        x340Var12.s0(odp0Var);
                        objT9 = odp0Var;
                    } else {
                        d631Var = d631Var2;
                    }
                    Function0 function2 = (Function0) objT9;
                    boolean zI6 = x340Var12.i(s531Var) | (i == 4);
                    Object objT10 = x340Var12.T();
                    if (zI6 || objT10 == m4cVar5) {
                        objT10 = new nt01(s531Var, d631Var, (byte) 27);
                        x340Var12.s0(objT10);
                    }
                    iu30 iu30Var5 = (iu30) objT10;
                    boolean zI7 = x340Var12.i(s531Var) | x340Var12.i(g5l0Var) | (i == 4);
                    Object objT11 = x340Var12.T();
                    if (zI7 || objT11 == m4cVar5) {
                        objT11 = new d4v0(s531Var, g5l0Var, d631Var, (byte) 22);
                        x340Var12.s0(objT11);
                    }
                    kbb.i(d631Var, zB, wzv0Var, iu30Var4, function1, function2, iu30Var5, (Function0) objT11, x340Var12, i);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                int i2 = ((hu31) obj6).d;
                fu31 fu31Var = (fu31) obj4;
                ftv ftvVar = fu31Var.b;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ((ru31) obj8).getClass();
                    String str5 = ftvVar.h;
                    String strO = ftvVar.d;
                    if (str5 == null) {
                        x340Var14.i0(-1868896455);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(-1868895032);
                        strO = ru31.o(p7h.M(new String[]{strO, ftvVar.h}), " - ", x340Var14);
                        x340Var14.r(false);
                    }
                    eu31 eu31Var = fu31Var.g;
                    if (eu31Var == null || !((Boolean) ((tob1) obj5).getValue()).booleanValue() || eu31Var.a <= 0) {
                        eu31Var = null;
                    }
                    if (eu31Var == null) {
                        x340Var14.i0(-1319894125);
                        x340Var14.r(false);
                        strU = null;
                    } else {
                        x340Var14.i0(-1319894124);
                        int i3 = eu31Var.a;
                        strU = cwl1.U(2131820671, i3, new Object[]{strO, Integer.valueOf(i3)}, x340Var14);
                        x340Var14.r(false);
                    }
                    String str6 = strU == null ? strO : strU;
                    boolean z3 = i2 != 1;
                    fra fraVar = een.N0;
                    uvx uvxVar = (uvx) obj7;
                    qim0 qim0VarZ3 = uyn1.z(gto1.B(uvxVar.a, x340Var14, uvxVar.c).b, 0.0f, 2, pqo.h(nim0Var, !ftvVar.g));
                    ru31 ru31Var = (ru31) obj8;
                    jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var14, 48);
                    int iHashCode3 = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM3 = x340Var14.m();
                    qim0 qim0VarE3 = zr7.E(x340Var14, qim0VarZ3);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(jw31VarA, x340Var14, y580.O0);
                    nko1.H(xos0VarM3, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE3, x340Var14, y580.Y);
                    if (z3) {
                        x340Var14.i0(-415009977);
                        ru31Var.l(i2, x340Var14, 0);
                        uwr uwrVar3 = cbx.a;
                        cvx cvxVar12 = cbx.b(x340Var14).b;
                        ab80.p(nim0Var, 4.0f, x340Var14, false);
                    } else {
                        x340Var14.i0(-414850451);
                        x340Var14.r(false);
                    }
                    ru31Var.h(0, str6, x340Var14, (qim0) null, z3);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 6:
                llj lljVar5 = y580.Y;
                llj lljVar6 = y580.R0;
                llj lljVar7 = y580.N0;
                llj lljVar8 = y580.O0;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                as80 as80Var = mif1.P0;
                tl3 tl3Var2 = een.d;
                fu31 fu31Var2 = (fu31) obj8;
                m4c m4cVar6 = fkj0.X;
                x340 x340Var16 = x340Var15;
                boolean zY = x340Var16.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16);
                j06 j06Var = x340Var16.a;
                if (!zY) {
                    x340Var16.b0();
                    return rih1Var;
                }
                fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var16, ltx.d, 30);
                boolean zG5 = x340Var16.g(fwxVarG);
                Object objT12 = x340Var16.T();
                if (zG5 || objT12 == m4cVar6) {
                    objT12 = new pux(fwxVarG, fwxVarG);
                    x340Var16.s0(objT12);
                }
                pux puxVar = (pux) objT12;
                eu31 eu31Var2 = fu31Var2.g;
                ftv ftvVar2 = fu31Var2.b;
                if (eu31Var2 == null || !((Boolean) ((tob1) obj4).getValue()).booleanValue()) {
                    eu31Var2 = null;
                }
                boolean z4 = ftvVar2.g;
                String str7 = ftvVar2.e;
                qim0 qim0VarK = xcg1.k(cbx.a, pqo.h(nim0Var, !z4));
                ru31 ru31Var2 = (ru31) obj6;
                hu31 hu31Var = (hu31) obj7;
                iu30 iu30Var6 = (iu30) obj5;
                gfh0 gfh0VarC = t1c.c(tl3Var2, false);
                tl3 tl3Var3 = tl3Var2;
                int iHashCode4 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM4 = x340Var16.m();
                qim0 qim0VarE4 = zr7.E(x340Var16, qim0VarK);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(gfh0VarC, x340Var16, lljVar8);
                nko1.H(xos0VarM4, x340Var16, lljVar7);
                x0d.q(iHashCode4, x340Var16, lljVar6, x340Var16);
                nko1.H(qim0VarE4, x340Var16, lljVar5);
                c380 c380Var2 = eu31Var2 != null ? eu31Var2.b : null;
                isl islVar = isl.a;
                h2c h2cVar = h2c.a;
                if (c380Var2 == null) {
                    x340Var16.i0(271271587);
                    z2 = false;
                    x340Var16.r(false);
                    tl3Var = tl3Var3;
                    m4cVar2 = m4cVar6;
                } else {
                    x340Var16.i0(271271588);
                    Iterator it2 = c380Var2.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        String str8 = (String) next;
                        qim0 qim0VarX = lrn1.x(h2cVar.b(nim0Var), -i5);
                        boolean zE = x340Var16.e(i5);
                        Iterator it3 = it2;
                        Object objT13 = x340Var16.T();
                        if (zE || objT13 == m4cVar6) {
                            objT13 = new sl11(i5, (byte) 5);
                            x340Var16.s0(objT13);
                        }
                        qim0 qim0VarC = i541.C(qim0VarX, (iu30) objT13);
                        tl3 tl3Var4 = tl3Var3;
                        gfh0 gfh0VarC2 = t1c.c(tl3Var4, false);
                        m4c m4cVar7 = m4cVar6;
                        int iHashCode5 = Long.hashCode(x340Var16.T);
                        xos0 xos0VarM5 = x340Var16.m();
                        qim0 qim0VarE5 = zr7.E(x340Var16, qim0VarC);
                        hzj.A.getClass();
                        x340Var16.m0();
                        if (x340Var16.S) {
                            x340Var16.l(n4kVar);
                        } else {
                            x340Var16.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var16, lljVar8);
                        nko1.H(xos0VarM5, x340Var16, lljVar7);
                        x0d.q(iHashCode5, x340Var16, lljVar6, x340Var16);
                        nko1.H(qim0VarE5, x340Var16, lljVar5);
                        Uri uri = str8.length() > 0 ? Uri.parse(str8) : Uri.EMPTY;
                        uri.getClass();
                        eso1.e(uri, islVar, (qim0) null, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, puxVar, false, false, x340Var16, 1075314736, 0, 3516);
                        x340Var16.r(true);
                        it2 = it3;
                        tl3Var3 = tl3Var4;
                        i4 = i5;
                        m4cVar6 = m4cVar7;
                    }
                    tl3Var = tl3Var3;
                    m4cVar2 = m4cVar6;
                    z2 = false;
                    x340Var16.r(false);
                }
                qim0 qim0VarQ = i1p1.q(h2cVar.b(nim0Var), er31.b(4.0f));
                gfh0 gfh0VarC3 = t1c.c(tl3Var, z2);
                int iHashCode6 = Long.hashCode(x340Var16.T);
                xos0 xos0VarM6 = x340Var16.m();
                qim0 qim0VarE6 = zr7.E(x340Var16, qim0VarQ);
                hzj.A.getClass();
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(gfh0VarC3, x340Var16, lljVar8);
                nko1.H(xos0VarM6, x340Var16, lljVar7);
                x0d.q(iHashCode6, x340Var16, lljVar6, x340Var16);
                nko1.H(qim0VarE6, x340Var16, lljVar5);
                Uri uri2 = str7.length() > 0 ? Uri.parse(str7) : Uri.EMPTY;
                uri2.getClass();
                eso1.e(uri2, islVar, (qim0) null, (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, puxVar, false, false, x340Var16, 1075314736, 0, 3516);
                x340Var16.i0(1809829128);
                yeu0 yeu0Var = ru31Var2.h;
                String str9 = ftvVar2.d;
                uiw0 uiw0Var = hu31Var.e;
                boolean zG6 = x340Var16.g(iu30Var6);
                Object objT14 = x340Var16.T();
                if (zG6 || objT14 == m4cVar2) {
                    objT14 = new n601(iu30Var6, (byte) 15);
                    x340Var16.s0(objT14);
                }
                yeu0Var.d(str9, uiw0Var, (iu30) objT14, x340Var16, 6);
                us71.m(x340Var16, false, true, true);
                return rih1Var;
            case 7:
                xxr0 xxr0Var = (xxr0) obj;
                x340 x340Var17 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                dc80 dc80Var = (dc80) obj5;
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= (iIntValue6 & 8) == 0 ? x340Var17.g(xxr0Var) : x340Var17.i(xxr0Var) ? 4 : 2;
                }
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    int iOrdinal = ((ha51) ((ven0) obj8).getValue()).ordinal();
                    if (iOrdinal == 0) {
                        x340Var18.i0(-906146287);
                        iyr0 iyr0Var = (iyr0) obj4;
                        y2o1.a(xxr0Var, iyr0Var, ((g4a) ((ven0) obj6).getValue()) == ilo1.D(iyr0Var), (vb1) obj7, x340Var18, iIntValue6 & 14);
                        x340Var18.r(false);
                    } else if (iOrdinal == 1) {
                        x340Var18.i0(-906135888);
                        y2o1.f(xxr0Var, 1, dc80Var, x340Var18, 48 | (iIntValue6 & 14));
                        x340Var18.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw p3d1.k(x340Var18, -906148881, false);
                        }
                        x340Var18.i0(-906125488);
                        y2o1.f(xxr0Var, 2, dc80Var, x340Var18, 48 | (iIntValue6 & 14));
                        x340Var18.r(false);
                    }
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 8:
                int iIntValue7 = ((Number) obj).intValue();
                x340 x340Var19 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                iu30 iu30Var7 = (iu30) obj5;
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var19.e(iIntValue7) ? 4 : 2;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    vb61 vb61Var = (vb61) ((List) obj8).get(iIntValue7);
                    x340Var20.i0(1103869252);
                    boolean z5 = ((c380) obj4).indexOf(vb61Var) == 0 && ((ljx0) ((ven0) obj7).getValue()) == ljx0.b && vb61Var.c != rb61.b;
                    p40 p40Var2 = ((dc61) obj6).O0;
                    boolean zI8 = x340Var20.i(vb61Var) | x340Var20.g(iu30Var7);
                    Object objT15 = x340Var20.T();
                    if (zI8 || objT15 == fkj0.X) {
                        objT15 = new uq00(vb61Var, iu30Var7, (byte) 1);
                        x340Var20.s0(objT15);
                    }
                    otw.c(p40Var2, new qb61(vb61Var, z5, (iu30) objT15), (qim0) null, (ipb1) null, x340Var20, 64, 12);
                    x340Var20.r(false);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 9:
                return a(obj, obj2, obj3);
            case 10:
                return d(obj, obj2, obj3);
            case 11:
                x340 x340Var21 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                cvx cvxVar13 = cbx.b(x340Var21).b;
                d36 d36Var3 = new d36(12.0f, true, new um5(false));
                zdj1 zdj1Var = (zdj1) obj8;
                ydj1 ydj1Var = zdj1Var.b;
                Function0 function3 = (Function0) obj4;
                Function0 function4 = (Function0) obj6;
                Function0 function5 = (Function0) obj7;
                Function0 function6 = (Function0) obj5;
                mbh mbhVarA3 = jbh.a(d36Var3, een.P0, x340Var21, 0);
                x340 x340Var22 = x340Var21;
                int iHashCode7 = Long.hashCode(x340Var22.T);
                xos0 xos0VarM7 = x340Var22.m();
                qim0 qim0VarE7 = zr7.E(x340Var21, nim0Var);
                hzj.A.getClass();
                x340 x340Var23 = x340Var21;
                if (x340Var23.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var23.m0();
                if (x340Var23.S) {
                    x340Var23.l(n4kVar);
                } else {
                    x340Var23.v0();
                }
                nko1.H(mbhVarA3, x340Var21, y580.O0);
                nko1.H(xos0VarM7, x340Var21, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var21, y580.R0);
                nko1.F(x340Var21);
                nko1.H(qim0VarE7, x340Var21, y580.Y);
                s1p1.q(ydj1Var, zdj1Var.f, function3, x340Var21, 0);
                s1p1.f(zdj1Var.a, ydj1Var.b, zdj1Var.c, zdj1Var.d, zdj1Var.e, function4, function5, function6, x340Var21, 0);
                x340Var23.r(true);
                return rih1Var;
            case 12:
                rcx rcxVar = (rcx) obj;
                ((Number) obj3).intValue();
                czj1 czj1Var = (czj1) obj8;
                iu30 iu30Var8 = (iu30) obj5;
                x340 x340Var24 = (b0k) obj2;
                boolean zG7 = x340Var24.g(iu30Var8);
                Object objT16 = x340Var24.T();
                if (zG7 || objT16 == fkj0.X) {
                    objT16 = new otj1(iu30Var8, (byte) 3);
                    x340Var24.s0(objT16);
                }
                iu30 iu30Var9 = (iu30) objT16;
                pzj1 pzj1Var = (pzj1) obj4;
                vzj1 vzj1Var = (vzj1) obj6;
                jd6 jd6Var = ((jzj1) obj7).d;
                p3v p3vVar = rcxVar.a;
                d5p1.f(czj1Var, iu30Var9, pzj1Var, vzj1Var, jd6Var, uyn1.j(0.0f, 0.0f, 0.0f, p3vVar != null ? p3vVar.a : 0.0f, 7), (qim0) null, x340Var24, 0);
                return rih1Var;
            default:
                qim0 qim0Var = (qim0) obj;
                x340 x340Var25 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                ffj1 ffj1Var = (ffj1) obj6;
                iu30 iu30Var10 = (iu30) obj5;
                m4c m4cVar8 = fkj0.X;
                n6k1 n6k1Var = (n6k1) obj4;
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= x340Var25.g(qim0Var) ? 4 : 2;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    h8l1 h8l1Var = ((t7l1) obj8).a;
                    String str10 = h8l1Var.a;
                    String str11 = h8l1Var.b;
                    String str12 = h8l1Var.c;
                    String str13 = h8l1Var.e;
                    h8l1 h8l1Var2 = n6k1Var.a.a.a;
                    String str14 = h8l1Var2.d;
                    String str15 = h8l1Var.j;
                    Float f = h8l1Var2.i;
                    boolean zG8 = x340Var26.g(iu30Var10);
                    Object objT17 = x340Var26.T();
                    if (zG8 || objT17 == m4cVar8) {
                        objT17 = new izj1(iu30Var10, (byte) 6);
                        x340Var26.s0(objT17);
                    }
                    Function0 function7 = (Function0) objT17;
                    boolean zI9 = x340Var26.i(n6k1Var) | x340Var26.i(ffj1Var);
                    Object objT18 = x340Var26.T();
                    if (zI9 || objT18 == m4cVar8) {
                        objT18 = new hij1(n6k1Var, ffj1Var, (byte) 14);
                        x340Var26.s0(objT18);
                    }
                    iu30 iu30Var11 = (iu30) objT18;
                    boolean zI10 = x340Var26.i(n6k1Var);
                    ven0 ven0Var3 = (ven0) obj7;
                    Object objT19 = x340Var26.T();
                    if (zI10 || objT19 == m4cVar8) {
                        objT19 = new g4k1(n6k1Var, ven0Var3, (byte) 1);
                        x340Var26.s0(objT19);
                    }
                    xto.f(str10, str13, str14, function7, qim0Var, (hw61) null, str15, f, false, str12, str11, iu30Var11, (Function0) objT19, x340Var26, (iIntValue9 << 12) & 57344, 288);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2y0(Object obj, Object obj2, Object obj3, Object obj4, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = iu30Var;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2y0(Object obj, c380 c380Var, Object obj2, iu30 iu30Var, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = c380Var;
        this.e = obj2;
        this.b = iu30Var;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2y0(String str, ven0 ven0Var, ven0 ven0Var2, y7e1 y7e1Var, vu30 vu30Var) {
        super(3);
        this.a = (byte) 3;
        this.c = str;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = y7e1Var;
        this.b = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2y0(dc8 dc8Var, String str, List list, lgu0 lgu0Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 2;
        this.d = dc8Var;
        this.e = str;
        this.c = list;
        this.f = lgu0Var;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2y0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }
}
