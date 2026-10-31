package p;

import app.rive.Artboard;
import app.rive.Fit;
import app.rive.RiveFile;
import app.rive.RiveFrameRate;
import app.rive.RiveKt;
import app.rive.RivePointerInputMode;
import app.rive.RiveSemanticsMode;
import app.rive.StateMachine;
import app.rive.ViewModelInstance;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kj21 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj21(vnr vnrVar, ArrayList arrayList, k5p1 k5p1Var, iu30 iu30Var, j2i j2iVar, ArrayList arrayList2, String str, String str2, cb80 cb80Var) {
        super(3);
        this.a = (byte) 10;
        this.b = vnrVar;
        this.c = arrayList;
        this.d = iu30Var;
        this.e = j2iVar;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0047  */
    private final Object a(Object obj, Object obj2, Object obj3) {
        vu30 vu30Var = y580.Y;
        vu30 vu30Var2 = y580.R0;
        llj lljVar = y580.N0;
        llj lljVar2 = y580.O0;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.d;
        vnr vnrVar = (vnr) this.b;
        int iD = (int) ((i2c) obj).d();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        int i = 2;
        if (vnrVar.a.getResources().getConfiguration().fontScale >= 1.6f) {
            if (iD < 600) {
                i = 1;
            }
        } else if (iD < 320) {
            i = 1;
        } else if ((320 > iD || iD >= 600) && size != 1 && size != 2) {
            i = 3;
            if (size != 3 && size != 5 && size != 6) {
                i = 4;
            }
        }
        d36 d36Var = new d36(8.0f, true, new um5(false));
        j2i j2iVar = (j2i) this.e;
        mbh mbhVarA = jbh.a(d36Var, een.P0, b0kVar, 0);
        x340 x340Var = (x340) b0kVar;
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(b0kVar, nim0Var);
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar;
        if (x340Var2.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        boolean z = x340Var2.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(mbhVarA, b0kVar, lljVar2);
        nko1.H(xos0VarM, b0kVar, lljVar);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, vu30Var2);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, vu30Var);
        x340Var2.i0(-552321945);
        Iterator it = o7h.s1(arrayList, i, i).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            qim0 qim0VarThen = u291.f(nim0Var, 1.0f).then(nim0Var);
            Iterator it2 = it;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, b0kVar, 0);
            b0k b0kVar2 = b0kVar;
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarThen);
            hzj.A.getClass();
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar2);
            nko1.H(xos0VarM2, b0kVar2, lljVar);
            nko1.H(Integer.valueOf(iHashCode2), b0kVar2, vu30Var2);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, vu30Var);
            x340Var2.i0(889850216);
            for (Object obj4 : list) {
                x340Var2.f0(416612692, (String) iu30Var.invoke(obj4));
                x340Var2.i0(416614459);
                vu30 vu30Var3 = vu30Var;
                vu30 vu30Var4 = vu30Var2;
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                j2iVar.J(obj4, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), b0kVar2, 0);
                x340Var2.r(false);
                x340Var2.r(false);
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
            }
            vu30 vu30Var5 = vu30Var;
            vu30 vu30Var6 = vu30Var2;
            x340Var2.r(false);
            x340Var2.i0(889867877);
            int size2 = i - list.size();
            int i2 = 0;
            while (i2 < size2) {
                j2i j2iVar2 = j2iVar;
                int i3 = size2;
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(b0kVar2, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                i2++;
                j2iVar = j2iVar2;
                size2 = i3;
            }
            x340Var2.r(false);
            x340Var2.r(true);
            b0kVar = b0kVar2;
            vu30Var = vu30Var5;
            it = it2;
            vu30Var2 = vu30Var6;
        }
        x340Var2.r(false);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.66f);
        c380 c380Var = (c380) this.b;
        ven0 ven0Var = (ven0) this.c;
        vu30 vu30Var = (vu30) this.d;
        Function0 function0 = (Function0) this.e;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String strO0 = cwl1.o0(x340Var, 2131952944);
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).h;
        long j = cbx.a(x340Var).b.a;
        cvx cvxVar = cbx.b(x340Var).b;
        uwo1.e(strO0, uyn1.z(12.0f, 0.0f, 2, nim0Var), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        cvx cvxVar2 = cbx.b(x340Var).b;
        op71.g(x340Var, u291.h(nim0Var, 16.0f));
        WeakHashMap weakHashMap = osl1.x;
        vk80 vk80VarX = poo1.x(new bgc0(lhc.g(x340Var).g, 32), x340Var);
        d36 d36Var = new d36(0.0f, true, new um5(false));
        boolean zG = x340Var3.g(c380Var) | x340Var3.i(ven0Var) | x340Var3.g(vu30Var) | x340Var3.g(function0);
        Object objT = x340Var3.T();
        if (zG || objT == fkj0.X) {
            objT = new e971((Object) c380Var, (Object) ven0Var, (Object) vu30Var, (Object) function0, (byte) 5);
            x340Var3.s0(objT);
        }
        ujo1.d((qim0) null, (xtb0) null, vk80VarX, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 491);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        x340 x340Var;
        x340 x340Var2 = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        qim0 qim0VarX = uyn1.x(u291.d(nim0.a, 1.0f), 16.0f);
        gra graVar = een.X;
        ven0 ven0Var = (ven0) this.b;
        cce cceVar = (cce) this.c;
        dbp dbpVar = (dbp) this.d;
        ven0 ven0Var2 = (ven0) this.e;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(gfh0VarC, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        boolean zI = x340Var4.i(ven0Var);
        Object objT = x340Var4.T();
        if (zI || objT == m4cVar) {
            objT = new ry71(ven0Var, (byte) 2);
            x340Var4.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        x340Var4.i0(-485754360);
        kiv kivVar = t4k.h;
        wat watVar = (wat) x340Var4.k(kivVar);
        boolean zG = x340Var4.g(watVar);
        Object objT2 = x340Var4.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new w7d1(watVar, (byte) 1);
            x340Var4.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        x340Var4.r(false);
        wat watVar2 = (wat) x340Var4.k(kivVar);
        Object[] objArr = new Object[0];
        df41 df41Var = new df41(new pg(watVar2, iu30Var, iu30Var2, (byte) 28), new f6f0((byte) 18));
        boolean zE = x340Var4.e(2) | x340Var4.g(watVar2) | x340Var4.g(iu30Var) | x340Var4.g(iu30Var2);
        Object objT3 = x340Var4.T();
        if (zE || objT3 == m4cVar) {
            qd4 qd4Var = new qd4(jad1.c, watVar2, iu30Var, iu30Var2, (byte) 6);
            x340Var4.s0(qd4Var);
            objT3 = qd4Var;
        }
        iad1 iad1Var = (iad1) k5p1.u(objArr, df41Var, (Function0) objT3, x340Var4, 0);
        wt91 wt91Var = (wt91) ven0Var.getValue();
        if (wt91Var == null) {
            x340Var4.i0(63708126);
            x340Var4.r(false);
            x340Var = x340Var4;
            z = true;
        } else {
            x340Var4.i0(63708127);
            j2i j2iVar = gjj.a;
            z = true;
            j2i j2iVarR = apo.r(455498577, new kj21((Object) cceVar, (Object) dbpVar, (Object) wt91Var, (Object) ven0Var2, (byte) 14), x340Var2);
            x340Var = x340Var4;
            gxo1.g(iad1Var, (qim0) null, false, false, false, (iu30) null, j2iVarR, x340Var2, 12582968);
            x340Var.r(false);
        }
        x340Var.r(z);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.e;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        byte b = 1;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            int i = iIntValue2 & 14;
            kba1 kba1Var = (kba1) ((List) this.b).get(iIntValue);
            x340Var2.i0(1177408967);
            j2i j2iVar = (j2i) this.c;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Boolean boolValueOf = Boolean.valueOf(kba1Var.a.equals((String) this.d));
            boolean zG = x340Var2.g(iu30Var) | x340Var2.g(kba1Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new k7a1(iu30Var, kba1Var, b);
                x340Var2.s0(objT);
            }
            j2iVar.Y(kba1Var, numValueOf, boolValueOf, objT, x340Var2, Integer.valueOf((i << 3) & 112));
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fC = i2cVar.c();
            float fD = i2cVar.d();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            d36 d36Var = new d36(uyn1.n(((xm10) this.b).b(), (flb0) x340Var2.k(t4k.n)), true, new um5(false));
            fra fraVar = een.N0;
            fvb1 fvb1Var = (fvb1) this.c;
            hvb1 hvb1Var = (hvb1) this.d;
            ya30 ya30Var = (ya30) this.e;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
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
            mhm0 mhm0Var = fvb1Var.d;
            List list = fvb1Var.e;
            float f = fD * 0.4f;
            qim0 qim0VarR = d7e.r(0.8605263f, u291.w(nim0Var, 0.0f, f), p3v.b(fC, f) < 0);
            c9 c9VarS = mqo1.s(new u7h[]{list.get(0), list.get(2)});
            boolean z = fvb1Var.f;
            hvb1Var.g(mhm0Var, c9VarS, z, !z, qim0VarR, x340Var2, 0);
            otw.c(ya30Var, new wa30(fvb1Var.a, fvb1Var.b, fvb1Var.c, mqo1.s(new u7h[]{list.get(2), list.get(1)}), false), u291.d(nim0Var, 1.0f), (ipb1) null, x340Var2, 384, 8);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        sw9 njx0Var;
        iu30 iu30Var = (iu30) obj;
        iu30 iu30Var2 = (iu30) obj2;
        Function0 function0 = (Function0) obj3;
        teb tebVar = new teb(new twa(), (zu30) null, true, false, 10);
        ne neVar = (ne) this.c;
        l1o l1oVar = (l1o) neVar.d;
        xf4 xf4Var = (xf4) neVar.e;
        if (l1oVar.b == 1 && xf4Var.o() && xf4Var.p()) {
            tebVar = new yeu0(tebVar, (iac0) neVar.b, (byte) 11);
        }
        jto jtoVar = (jto) this.b;
        int iC = l1d.C(l1oVar.b);
        if (iC == 0) {
            njx0Var = new njx0((byte) 28);
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            njx0Var = new sw9(((vfr0) ((tcr0) this.d).a(qcr0.a)).c.size(), (w3l0) this.e);
        }
        return new jpg0(new jb3(tebVar, jtoVar, iu30Var, iu30Var2, function0, njx0Var), d6d1.Y0);
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        vnr0 vnr0Var;
        vnr0 vnr0Var2;
        float f;
        x340 x340Var;
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var2 = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        c380 c380Var = (c380) this.b;
        m4c m4cVar = fkj0.X;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var2.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var3 = x340Var2;
        if (x340Var3.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            boolean z = iIntValue == ((hdn0) this.d).s();
            vu30 vu30Var = ((r6f1) c380Var.get(iIntValue)).a;
            if (vu30Var == null) {
                x340Var3.i0(507110957);
                x340Var3.r(false);
                vnr0Var = null;
            } else {
                x340Var3.i0(-2061851564);
                vnr0 vnr0Var3 = (vnr0) vu30Var.invoke(x340Var3, 0);
                x340Var3.r(false);
                vnr0Var = vnr0Var3;
            }
            vu30 vu30Var2 = ((r6f1) c380Var.get(iIntValue)).c;
            if (vu30Var2 == null) {
                x340Var3.i0(507172461);
                x340Var3.r(false);
                vnr0Var2 = null;
            } else {
                x340Var3.i0(-2061849580);
                vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var3, 0);
                x340Var3.r(false);
            }
            boolean z2 = vnr0Var != null;
            boolean z3 = vnr0Var2 != null;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            float f2 = cbx.b(x340Var3).b.b;
            float f3 = z2 ? 8.0f : 0.0f;
            float f4 = z3 ? 8.0f : 0.0f;
            if (!z3 && z2) {
                f2 = 8.0f;
            }
            qim0 qim0Var = (qim0) this.c;
            era eraVar = een.Q0;
            iyd iydVar = (iyd) this.e;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var3, 48);
            float f5 = f2;
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0Var);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            nim0 nim0Var = nim0.a;
            if (vnr0Var == null) {
                x340Var3.i0(-673657357);
                x340Var3.r(false);
                x340Var = x340Var3;
                f = f5;
            } else {
                x340Var3.i0(-673657356);
                Object objT = x340Var3.T();
                if (objT == m4cVar) {
                    objT = nhe1.b1;
                    x340Var3.s0(objT);
                }
                qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
                boolean zH = x340Var3.h(z) | x340Var3.i(vnr0Var) | x340Var3.g(iydVar);
                Object objT2 = x340Var3.T();
                if (zH || objT2 == m4cVar) {
                    objT2 = new z6f1(z, vnr0Var, iydVar, (byte) 0);
                    x340Var3.s0(objT2);
                }
                f = f5;
                qgo1.f(vnr0Var, i541.C(qim0VarB, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var3, 8, 56);
                x340Var = x340Var3;
                x0d.s(nim0Var, f3, x340Var, false);
            }
            vnr0 vnr0Var4 = (vnr0) ((r6f1) c380Var.get(iIntValue)).b.invoke(x340Var, 0);
            boolean zH2 = x340Var.h(z) | x340Var.g(iydVar);
            Object objT3 = x340Var.T();
            if (zH2 || objT3 == m4cVar) {
                objT3 = new a7f1(z, iydVar, (byte) 0);
                x340Var.s0(objT3);
            }
            x340 x340Var4 = x340Var;
            qgo1.f(vnr0Var4, i541.C(nim0Var, (iu30) objT3), (a0e1) null, 0, false, (iu30) null, x340Var4, 8, 60);
            x340 x340Var5 = x340Var4;
            if (vnr0Var2 == null) {
                x340Var5.i0(-672852163);
                x340Var5.r(false);
            } else {
                v8i0.i(f4, -672852162, x340Var5, x340Var5, nim0Var);
                boolean zH3 = x340Var5.h(z) | x340Var5.i(vnr0Var2) | x340Var5.g(iydVar);
                Object objT4 = x340Var5.T();
                if (zH3 || objT4 == m4cVar) {
                    objT4 = new z6f1(z, vnr0Var2, iydVar, (byte) 1);
                    x340Var5.s0(objT4);
                }
                qgo1.f(vnr0Var2, i541.C(nim0Var, (iu30) objT4), (a0e1) null, 0, false, (iu30) null, x340Var5, 8, 60);
                x340Var5 = x340Var5;
                x340Var5.r(false);
            }
            op71.g(x340Var5, u291.h(nim0Var, f));
            vnr0 vnr0Var5 = (vnr0) ((r6f1) c380Var.get(iIntValue)).e.invoke(x340Var5, 0);
            boolean zH4 = x340Var5.h(z) | x340Var5.g(iydVar);
            Object objT5 = x340Var5.T();
            if (zH4 || objT5 == m4cVar) {
                objT5 = new a7f1(z, iydVar, (byte) 1);
                x340Var5.s0(objT5);
            }
            x340 x340Var6 = x340Var5;
            qgo1.f(vnr0Var5, i541.C(nim0Var, (iu30) objT5), (a0e1) null, 0, false, (iu30) null, x340Var6, 8, 60);
            x340Var6.r(true);
        } else {
            x340Var3.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        thd0 thd0Var = (thd0) this.b;
        u7f1 u7f1Var = (u7f1) thd0Var.c;
        nbh nbhVar = (nbh) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        tob1 tob1Var = (tob1) this.d;
        tob1 tob1Var2 = (tob1) this.c;
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(nbhVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            yj41 yj41Var = u7f1Var.b;
            boolean zG = x340Var2.g(tob1Var2);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ctd1(tob1Var2, (byte) 11);
                x340Var2.s0(objT);
            }
            nim0 nim0Var = nim0.a;
            thd0Var.e(nbhVar, yj41Var, i541.C(nim0Var, (iu30) objT), x340Var2, (iIntValue & 14) | 64);
            uwr uwrVar = cbx.a;
            qim0 qim0VarO = ab80.o(nim0Var, cbx.b(x340Var2).b.c, x340Var2, nim0Var, 1.0f);
            boolean zG2 = x340Var2.g(tob1Var);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new ctd1(tob1Var, (byte) 12);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0VarO, (iu30) objT2);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = v7f1.b;
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarC, true, (iu30) objT3);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            tob1 tob1Var3 = (tob1) this.e;
            mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 48);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qgo1.f((vnr0) u7f1Var.c.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
            qgo1.f((vnr0) u7f1Var.d.invoke(x340Var2, 0), (qim0) null, (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 62);
            x340Var2.r(true);
            vnr0 vnr0Var = (vnr0) u7f1Var.e.invoke(x340Var2, 0);
            boolean zG3 = x340Var2.g(tob1Var3);
            Object objT4 = x340Var2.T();
            if (zG3 || objT4 == m4cVar) {
                objT4 = new ctd1(tob1Var3, (byte) 13);
                x340Var2.s0(objT4);
            }
            qgo1.f(vnr0Var, i541.C(nim0Var, (iu30) objT4), (a0e1) null, 0, false, (iu30) null, x340Var2, 8, 60);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        List<Locale> list = ((ox2) ((ven0) this.b).getValue()).a;
        ven0 ven0Var = (ven0) this.c;
        px2 px2Var = (px2) this.d;
        Locale locale = (Locale) this.e;
        for (Locale locale2 : list) {
            j2i j2iVarR = apo.r(102356200, new eii1(locale2, locale, (byte) 20), x340Var);
            x340 x340Var2 = x340Var;
            boolean zI = x340Var2.i(ven0Var) | x340Var2.i(px2Var) | x340Var2.g(locale2);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new o8e1(px2Var, locale2, ven0Var, (byte) 23);
                x340Var2.s0(objT);
            }
            gt4.b(j2iVarR, (Function0) objT, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var2, 6, 508);
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), u7h.b(u7h.b, 0.7f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
        ven0 ven0Var = (ven0) this.b;
        ven0 ven0Var2 = (ven0) this.c;
        p5j1 p5j1Var = (p5j1) this.d;
        ncf0 ncf0Var = (ncf0) this.e;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
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
        if (((Boolean) ven0Var2.getValue()).booleanValue()) {
            x340Var3.i0(-1325862857);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean zI = x340Var3.i(ven0Var);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new mek1(ven0Var, (byte) 6);
                x340Var3.s0(objT);
            }
            t1c.a(bin.x(qim0VarD, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), x340Var, 0);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1325777328);
            x340Var3.r(false);
        }
        qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
        mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        fcf0 fcf0VarC = ncf0Var.c();
        qim0 qim0VarC = u291.c(u291.f(nim0Var, 0.42f), 0.3f);
        boolean zG = x340Var3.g(p5j1Var);
        Object objT2 = x340Var3.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new tak1(p5j1Var, (byte) 18);
            x340Var3.s0(objT2);
        }
        mp10.f(fcf0VarC, s161.b(qim0VarC, false, (iu30) objT2), false, false, (bcf0) null, Integer.MAX_VALUE, (ddf0) null, (tl3) null, (j6m) null, x340Var, 1572864, 0, 2097084);
        String str = p5j1Var.a;
        uwr uwrVar = cbx.a;
        uwo1.e(str, uyn1.B(nim0Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
        x340Var3.r(true);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:298:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:300:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:302:0x0b66  */
    /* JADX WARN: Code duplicated, block: B:305:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:306:0x0b77  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:317:0x0b8e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:320:0x0b94 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:322:0x0b99  */
    /* JADX WARN: Code duplicated, block: B:330:0x0bb3  */
    /* JADX WARN: Code duplicated, block: B:332:0x0bbc  */
    /* JADX WARN: Code duplicated, block: B:336:0x0bdd  */
    /* JADX WARN: Code duplicated, block: B:338:0x0be4  */
    /* JADX WARN: Code duplicated, block: B:363:0x0bd9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v60 */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        q5c1 s5c1Var;
        m5c1 m5c1Var;
        u5c1 v5c1Var;
        boolean z;
        String str;
        char c;
        String string;
        String str2;
        Fit.Layout contain;
        ?? r0;
        lee1 lee1Var;
        x340 x340Var;
        mhg1 mhg1Var;
        Boolean bool;
        byte b = this.a;
        f36 f36Var = h36.c;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                yla ylaVar = (yla) obj7;
                is10 is10Var = (is10) obj6;
                xi21 xi21Var = (xi21) obj5;
                y7e1 y7e1Var = (y7e1) obj4;
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                x340 x340Var3 = x340Var2;
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                x340 x340Var4 = x340Var2;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                boolean z2 = !is10Var.b.isEmpty();
                qim0 qim0VarF2 = u291.f(nim0Var2, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                ylaVar.j(0, x340Var2, uyn1.B(qim0VarF2, 0.0f, 16.0f, 0.0f, 0.0f, 13), z2);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                ylaVar.g(xi21Var, y7e1Var, uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), x340Var2, 0);
                cvx cvxVar3 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.h(nim0Var2, 8.0f));
                fq7.b(pbh.a, y7e1Var.d().d.length() > 500, null, null, null, null, apo.r(-535897647, new lw11(ylaVar, (byte) 9), x340Var2), x340Var2, 1572870, 30);
                x340Var4.r(true);
                return rih1Var;
            case 1:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarH = l6o1.H(uyn1.w(u291.d(nim0Var, 1.0f), (vzq0) obj), l6o1.C(0, 0, 1, x340Var5), false, 14);
                xu30 xu30Var = (xu30) obj7;
                ja31 ja31Var = (ja31) obj6;
                Function0 function0 = (Function0) obj5;
                noq noqVar = (noq) obj4;
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var5, 0);
                x340 x340Var6 = x340Var5;
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var5, qim0VarH);
                hzj.A.getClass();
                x340 x340Var7 = x340Var5;
                if (x340Var7.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var7.m0();
                if (x340Var7.S) {
                    x340Var7.l(n4kVar);
                } else {
                    x340Var7.v0();
                }
                nko1.H(mbhVarA2, x340Var5, y580.O0);
                nko1.H(xos0VarM2, x340Var5, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var5, y580.R0);
                nko1.F(x340Var5);
                nko1.H(qim0VarE2, x340Var5, y580.Y);
                boolean zG = x340Var7.g(xu30Var);
                Object objT = x340Var7.T();
                if (zG || objT == fkj0.X) {
                    zvj zvjVar = new zvj(xu30Var, (byte) 1);
                    wj3 wj3Var = (wj3) noqVar.a.c;
                    objT = new k4c1((ooq) ((jly0) wj3Var.Y).get(), (roq) ((jly0) wj3Var.Z).get(), (soq) ((jly0) wj3Var.N0).get(), (toq) ((jly0) wj3Var.O0).get(), zvjVar);
                    x340Var7.s0(objT);
                }
                k4c1 k4c1Var = (k4c1) objT;
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                String str3 = ja31Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str3, qim0VarZ, cbx.d(x340Var5).e, 0L, new a0e1(1), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var5, 0, 0, 2024);
                op71.g(x340Var5, u291.h(nim0Var, 16.0f));
                x340Var7.i0(-266836533);
                List list = ja31Var.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    z5c1 z5c1Var = (z5c1) next;
                    ff ffVar = z5c1Var.g;
                    x5c1 x5c1Var = z5c1Var.i;
                    int i3 = z5c1Var.d;
                    Paragraph paragraph = z5c1Var.c;
                    Paragraph paragraph2 = z5c1Var.b;
                    String strB = gqg0.b(paragraph2);
                    if (ihc1.y0(strB)) {
                        strB = gqg0.b(paragraph);
                    }
                    String str4 = z5c1Var.a;
                    vnr0 vnr0VarA = shy0.a(paragraph2, x340Var5);
                    vnr0 vnr0VarA2 = shy0.a(paragraph, x340Var5);
                    boolean z3 = i3 == 3;
                    vnr0 vnr0VarA3 = shy0.a(x5c1Var.a, x340Var5);
                    int i4 = x5c1Var.c;
                    m5c1 m5c1Var2 = z5c1Var.e;
                    if (!(m5c1Var2 instanceof m5c1)) {
                        if (m5c1Var2 instanceof n5c1) {
                            s5c1Var = new r5c1(((n5c1) m5c1Var2).a);
                        } else if (m5c1Var2 instanceof o5c1) {
                            o5c1 o5c1Var = (o5c1) m5c1Var2;
                            s5c1Var = new s5c1(o5c1Var.a, o5c1Var.b);
                            q5c1 q5c1Var = s5c1Var;
                            m5c1Var = z5c1Var.f;
                            if (m5c1Var instanceof m5c1) {
                                v5c1Var = new u5c1(m5c1Var.a);
                            } else if (!(m5c1Var instanceof n5c1)) {
                                v5c1Var = new v5c1(((n5c1) m5c1Var).a);
                            } else if (m5c1Var instanceof o5c1) {
                                eg.m("backgroundSmall cannot be Summary");
                            } else {
                                eg.o();
                            }
                            u5c1 u5c1Var = v5c1Var;
                            String str5 = z5c1Var.h;
                            if (i3 == 3) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (ffVar == null && (str = ffVar.a) != null) {
                                if (ihc1.y0(str)) {
                                    str = null;
                                }
                                if (str == null) {
                                    if (ihc1.y0(strB)) {
                                        str = null;
                                    } else {
                                        str = strB;
                                    }
                                }
                            } else if (ihc1.y0(strB)) {
                                str = strB;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                if (ffVar != null) {
                                    str2 = ffVar.c;
                                } else {
                                    str2 = null;
                                }
                                StringBuilder sb = new StringBuilder(str);
                                if (z || str2 == null || ihc1.y0(str2)) {
                                    c = '\n';
                                } else {
                                    c = '\n';
                                    sb.append('\n');
                                    sb.append(str2);
                                }
                                string = sb.toString();
                            } else {
                                c = '\n';
                                string = null;
                            }
                            arrayList.add(new y5c1(str4, vnr0VarA, vnr0VarA2, z3, vnr0VarA3, i4, q5c1Var, u5c1Var, i, str5, string, gqg0.c(ffVar)));
                            it = it;
                            i = i2;
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    s5c1Var = new q5c1(m5c1Var2.a);
                    q5c1 q5c1Var2 = s5c1Var;
                    m5c1Var = z5c1Var.f;
                    if (m5c1Var instanceof m5c1) {
                        v5c1Var = new u5c1(m5c1Var.a);
                    } else {
                        if (!(m5c1Var instanceof n5c1)) {
                            if (m5c1Var instanceof o5c1) {
                                eg.m("backgroundSmall cannot be Summary");
                            } else {
                                eg.o();
                            }
                            return null;
                        }
                        v5c1Var = new v5c1(((n5c1) m5c1Var).a);
                    }
                    u5c1 u5c1Var2 = v5c1Var;
                    String str6 = z5c1Var.h;
                    if (i3 == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (ffVar == null) {
                        if (ihc1.y0(strB)) {
                            str = strB;
                        } else {
                            str = null;
                        }
                    } else if (ihc1.y0(strB)) {
                        str = strB;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        if (ffVar != null) {
                            str2 = ffVar.c;
                        } else {
                            str2 = null;
                        }
                        StringBuilder sb2 = new StringBuilder(str);
                        if (z) {
                            c = '\n';
                        } else {
                            c = '\n';
                        }
                        string = sb2.toString();
                    } else {
                        c = '\n';
                        string = null;
                    }
                    arrayList.add(new y5c1(str4, vnr0VarA, vnr0VarA2, z3, vnr0VarA3, i4, q5c1Var2, u5c1Var2, i, str6, string, gqg0.c(ffVar)));
                    it = it;
                    i = i2;
                }
                x340Var7.r(false);
                otw.c(k4c1Var, new j4c1(arrayList, new i4c1(), ja31Var.d, ja31Var.e), (qim0) null, (ipb1) null, x340Var5, 0, 12);
                d7e.h(ja31Var.c, ja31Var.t, function0, x340Var5, 0);
                x340Var7.r(true);
                return rih1Var;
            case 2:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var8).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                fqm fqmVar = (fqm) obj7;
                gg31 gg31Var = (gg31) obj6;
                era eraVar = (era) obj5;
                iu30 iu30Var = (iu30) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var9 = x340Var8;
                int iHashCode3 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM3 = x340Var9.m();
                qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarB);
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
                nko1.H(gfh0VarC, x340Var8, y580.O0);
                nko1.H(xos0VarM3, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE3, x340Var8, y580.Y);
                String str7 = gg31Var.j;
                boolean zG2 = x340Var10.g(iu30Var);
                Object objT2 = x340Var10.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new wg31(iu30Var, (byte) 0);
                    x340Var10.s0(objT2);
                }
                otw.c(fqmVar, new eqm(str7, eraVar, 1, (Function0) objT2), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                x340Var10.r(true);
                return rih1Var;
            case 3:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                long j = ((i2c) obj).b;
                if (!((Boolean) ((ven0) obj4).getValue()).booleanValue() || hjl.i(j) <= 0 || hjl.h(j) <= 0) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(-881710996);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(-882102309);
                    v8e0 v8e0Var = (v8e0) obj7;
                    RiveFile riveFile = v8e0Var.a;
                    Artboard artboard = v8e0Var.b;
                    StateMachine stateMachine = v8e0Var.c;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    jk31 jk31Var = (jk31) obj6;
                    boolean z4 = jk31Var.b;
                    int i5 = jk31Var.c;
                    int i6 = jk31Var.d;
                    int iC = l1d.C(i5);
                    if (iC == 0) {
                        contain = Fit.Fill.INSTANCE;
                    } else if (iC == 1) {
                        contain = new Fit.Contain(ok31.g(i6));
                    } else if (iC == 2) {
                        contain = new Fit.Cover(ok31.g(i6));
                    } else if (iC == 3) {
                        contain = new Fit.FitWidth(ok31.g(i6));
                    } else {
                        if (iC != 4) {
                            eg.o();
                            return null;
                        }
                        contain = new Fit.Layout(0.0f, 1, (DefaultConstructorMarker) null);
                    }
                    RiveKt.Rive(riveFile, qim0VarD, z4, artboard, stateMachine, (ViewModelInstance) obj5, contain, 0, RivePointerInputMode.PassThrough, (RiveFrameRate) null, (RiveSemanticsMode) null, (iu30) null, x340Var13, (Artboard.$stable << 9) | 100663296 | (StateMachine.$stable << 12) | (ViewModelInstance.$stable << 15) | (Fit.$stable << 18), 0, 3712);
                    x340Var13.r(false);
                }
                return rih1Var;
            case 4:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var14.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                boolean zY = x340Var15.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var15.a;
                if (zY) {
                    c8e1 c8e1Var = (c8e1) obj7;
                    Function0 function1 = (Function0) obj6;
                    String str8 = (String) obj5;
                    String str9 = (String) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var15, 48);
                    int iHashCode4 = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM4 = x340Var15.m();
                    qim0 qim0VarE4 = zr7.E(x340Var15, nim0Var);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(jw31VarA, x340Var15, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM4, x340Var15, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var15, lljVar3);
                    nko1.F(x340Var15);
                    llj lljVar4 = y580.Y;
                    wnb0 wnb0VarQ = kk0.q(x340Var15, qim0VarE4, lljVar4, 1.0f, true);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode5 = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM5 = x340Var15.m();
                    qim0 qim0VarE5 = zr7.E(x340Var15, wnb0VarQ);
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var15, lljVar);
                    nko1.H(xos0VarM5, x340Var15, lljVar2);
                    x0d.q(iHashCode5, x340Var15, lljVar3, x340Var15);
                    nko1.H(qim0VarE5, x340Var15, lljVar4);
                    if (c8e1Var.a.b.length() == 0) {
                        x340Var15.i0(2072423151);
                        uwr uwrVar4 = cbx.a;
                        uwo1.e(str9, (qim0) null, cbx.d(x340Var15).g, cbx.a(x340Var15).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2034);
                        r0 = 0;
                        x340Var15.r(false);
                    } else {
                        r0 = 0;
                        x340Var15.i0(2072604780);
                        x340Var15.r(false);
                    }
                    us71.j(iIntValue & 14, vu30Var, x340Var15, true);
                    if (c8e1Var.a.b.length() > 0) {
                        x340Var15.i0(1581098819);
                        ezn1.a((int) r0, str8, function1, x340Var15, (qim0) null);
                        x340Var15.r((boolean) r0);
                    } else {
                        x340Var15.i0(1581205490);
                        x340Var15.r((boolean) r0);
                    }
                    x340Var15.r(true);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 5:
                qim0 qim0VarS = (qim0) obj;
                ((Number) obj3).intValue();
                Object obj8 = fkj0.X;
                x340 x340Var16 = (b0k) obj2;
                x340Var16.i0(2058091969);
                xb51 xb51Var = (xb51) obj7;
                if (xb51Var != null) {
                    ven0 ven0VarS = v8r.s((iu30) obj6, x340Var16);
                    ven0 ven0VarS2 = v8r.s((Function0) obj5, x340Var16);
                    ven0 ven0VarS3 = v8r.s((iu30) obj4, x340Var16);
                    boolean zE = x340Var16.e(xb51Var.a);
                    Object objT3 = x340Var16.T();
                    if (zE || objT3 == obj8) {
                        objT3 = new AtomicBoolean(false);
                        x340Var16.s0(objT3);
                    }
                    AtomicBoolean atomicBoolean = (AtomicBoolean) objT3;
                    boolean zI = x340Var16.i(atomicBoolean) | x340Var16.i(ven0VarS) | x340Var16.g(xb51Var) | x340Var16.i(ven0VarS2) | x340Var16.i(ven0VarS3);
                    xb51 xb51Var2 = (xb51) obj7;
                    Object objT4 = x340Var16.T();
                    if (zI || objT4 == obj8) {
                        tjf0 tjf0Var = new tjf0(atomicBoolean, ven0VarS, xb51Var2, ven0VarS2, ven0VarS3, (byte) 19);
                        x340Var16.s0(tjf0Var);
                        objT4 = tjf0Var;
                    }
                    qim0VarS = exd0.s(qim0VarS, (iu30) objT4);
                }
                x340Var16.r(false);
                return qim0VarS;
            case 6:
                x340 x340Var17 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str10 = (String) obj7;
                up51 up51Var = (up51) obj6;
                hy50 hy50Var = up51Var.g;
                String str11 = (String) obj5;
                j2i j2iVar = (j2i) obj4;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var17, 0);
                x340 x340Var18 = x340Var17;
                int iHashCode6 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM6 = x340Var18.m();
                qim0 qim0VarE6 = zr7.E(x340Var17, nim0Var);
                hzj.A.getClass();
                x340 x340Var19 = x340Var17;
                if (x340Var19.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var19.m0();
                if (x340Var19.S) {
                    x340Var19.l(n4kVar);
                } else {
                    x340Var19.v0();
                }
                nko1.H(mbhVarA3, x340Var17, y580.O0);
                nko1.H(xos0VarM6, x340Var17, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var17, y580.R0);
                nko1.F(x340Var17);
                nko1.H(qim0VarE6, x340Var17, y580.Y);
                boolean z5 = up51Var.h;
                int i7 = up51Var.b;
                if (i7 == 1) {
                    x340Var19.i0(-1918392796);
                    uwr uwrVar5 = cbx.a;
                    lee1Var = cbx.d(x340Var17).h;
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(-1918325464);
                    uwr uwrVar6 = cbx.a;
                    lee1Var = cbx.d(x340Var17).g;
                    x340Var19.r(false);
                }
                wgo1.q(str10, z5, lee1Var, i7 == 1 ? new cjc0(1) : new cjc0(2), x340Var17, 0);
                if (!(hy50Var instanceof fy50) && up51Var.f == null && str11 == null) {
                    x340Var19.i0(-1917913598);
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(-1918000088);
                    wgo1.k(up51Var.f, str11, hy50Var, j2iVar, x340Var17, 0);
                    x340Var19.r(false);
                }
                x340Var19.r(true);
                return rih1Var;
            case 7:
                boolean z6 = false;
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var20 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var20.g(vzq0Var) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    z6 = true;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(1 & iIntValue2, z6)) {
                    kiv kivVar = vvx.a;
                    uwr uwrVar7 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var21).b;
                    mod.b(kivVar.a(new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495)), apo.r(850555788, new wnx0(obj7, (Object) vzq0Var, obj6, obj5, obj4, (byte) 10), x340Var21), x340Var21, 56);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var22 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar8 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var22).b;
                era eraVar2 = (era) obj7;
                qim0 qim0VarN = anm1.N("ErrorRow", uyn1.B(nim0.a, 0.0f, 4.0f, 0.0f, 0.0f, 13).then(new tq60(eraVar2)));
                fqm fqmVar2 = (fqm) obj6;
                j171 j171Var = (j171) obj5;
                iu30 iu30Var2 = (iu30) obj4;
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                x340 x340Var23 = x340Var22;
                int iHashCode7 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM7 = x340Var23.m();
                qim0 qim0VarE7 = zr7.E(x340Var22, qim0VarN);
                hzj.A.getClass();
                x340 x340Var24 = x340Var22;
                if (x340Var24.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var24.m0();
                if (x340Var24.S) {
                    x340Var24.l(n4kVar);
                } else {
                    x340Var24.v0();
                }
                nko1.H(gfh0VarC3, x340Var22, y580.O0);
                nko1.H(xos0VarM7, x340Var22, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var22, y580.R0);
                nko1.F(x340Var22);
                nko1.H(qim0VarE7, x340Var22, y580.Y);
                String str12 = j171Var.j.a;
                boolean zG3 = x340Var24.g(iu30Var2);
                Object objT5 = x340Var24.T();
                if (zG3 || objT5 == fkj0.X) {
                    objT5 = new m861(iu30Var2, (byte) 2);
                    x340Var24.s0(objT5);
                }
                otw.c(fqmVar2, new eqm(str12, eraVar2, 1, (Function0) objT5), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                x340Var24.r(true);
                return rih1Var;
            case 9:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                qi71 qi71Var = qi71.b1;
                mhg1 mhg1Var2 = (mhg1) obj6;
                x340 x340Var25 = (b0k) obj2;
                x340Var25.i0(-1539505585);
                ov71 ov71Var = (ov71) obj7;
                Object obj9 = ov71Var.a;
                x340Var25.f0(-1996110647, obj9);
                pv71 pv71Var = (pv71) obj5;
                Object objT6 = x340Var25.T();
                m4c m4cVar = fkj0.X;
                if (objT6 == m4cVar) {
                    dw91 dw91Var = pv71Var.i;
                    Object xs71Var = dw91Var.get(obj9);
                    if (xs71Var == null) {
                        xs71Var = new xs71(obj9, pv71Var);
                        dw91Var.put(obj9, xs71Var);
                    }
                    objT6 = (xs71) xs71Var;
                    x340Var25.s0(objT6);
                }
                xs71 xs71Var2 = (xs71) objT6;
                x340Var25.f0(-1996106866, mhg1Var2);
                if (mhg1Var2 != null) {
                    k9 k9Var = mhg1Var2.a;
                    x340Var25.i0(-1749734647);
                    String string2 = obj9.toString();
                    boolean zG4 = x340Var25.g(mhg1Var2);
                    Object objT7 = x340Var25.T();
                    if (zG4 || objT7 == m4cVar) {
                        objT7 = k9Var.P0();
                        x340Var25.s0(objT7);
                    }
                    if (mhg1Var2.g()) {
                        objT7 = k9Var.P0();
                    }
                    x340Var25.i0(1498260051);
                    Boolean bool2 = (Boolean) qi71Var.invoke(objT7);
                    x340Var25.r(false);
                    Object value = mhg1Var2.d.getValue();
                    x340Var25.i0(1498260051);
                    Boolean bool3 = (Boolean) qi71Var.invoke(value);
                    x340Var25.r(false);
                    mhg1 mhg1VarM = bno1.m(mhg1Var2, bool2, bool3, string2, x340Var25, 0);
                    x340Var = x340Var25;
                    if (mhg1Var2.g()) {
                        x340Var.i0(782538635);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(782386797);
                        Object value2 = mhg1Var2.e.getValue();
                        if (value2 == null) {
                            x340Var.i0(782437481);
                            x340Var.r(false);
                            bool = null;
                        } else {
                            x340Var.i0(782437482);
                            x340Var.i0(1498260051);
                            bool = (Boolean) qi71Var.invoke(value2);
                            x340Var.r(false);
                            x340Var.r(false);
                        }
                        mhg1VarM.q(bool);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                    mhg1Var = mhg1VarM;
                } else {
                    x340Var = x340Var25;
                    x340Var.i0(-1749482679);
                    w0h1.o(1, qi71Var);
                    Boolean bool4 = (Boolean) qi71Var.invoke(rih1Var);
                    boolean zBooleanValue = bool4.booleanValue();
                    Object objT8 = x340Var.T();
                    if (objT8 == m4cVar) {
                        if (!xs71Var2.c().isEmpty()) {
                            zBooleanValue = !zBooleanValue;
                        }
                        objT8 = new zen0(Boolean.valueOf(zBooleanValue));
                        x340Var.s0(objT8);
                    }
                    zen0 zen0Var = (zen0) objT8;
                    zen0Var.w1(bool4);
                    mhg1 mhg1VarU = bno1.u(zen0Var, (String) null, x340Var, 0, 2);
                    x340Var.r(false);
                    mhg1Var = mhg1VarU;
                }
                x340Var.f0(-1996043323, Boolean.valueOf(pv71Var.c()));
                zgg1 zgg1VarN = bno1.n(mhg1Var, rno1.i, (String) null, x340Var, 0, 2);
                x340Var.r(false);
                boolean zG5 = x340Var.g(mhg1Var);
                Object objT9 = x340Var.T();
                if (zG5 || objT9 == m4cVar) {
                    objT9 = new m1c(pv71Var, mhg1Var, zgg1VarN, xs71Var2.h);
                    x340Var.s0(objT9);
                }
                m1c m1cVar = (m1c) objT9;
                if (!u890.j((zgg1) m1cVar.d.getValue(), zgg1VarN)) {
                    m1cVar.d.setValue(zgg1VarN);
                    m1cVar.h.setValue((Object) null);
                    m1cVar.f = n1c.a;
                }
                m1cVar.e.setValue(qgo1.a);
                x340Var.r(false);
                qv71 qv71Var = (qv71) obj4;
                Object objT10 = x340Var.T();
                if (objT10 == m4cVar) {
                    objT10 = new ys71(xs71Var2, m1cVar, qv71Var, ov71Var);
                    x340Var.s0(objT10);
                }
                ys71 ys71Var = (ys71) objT10;
                ov71Var.c.setValue(ys71Var);
                ys71Var.d.setValue(xs71Var2);
                hrr0 hrr0Var = ys71Var.g;
                Boolean bool5 = Boolean.TRUE;
                hrr0Var.setValue(bool5);
                ys71Var.e.setValue(m1cVar);
                ys71Var.f.setValue(mv71.b);
                ys71Var.h.setValue(qv71Var);
                drr0 drr0Var = ys71Var.b;
                if (drr0Var.s() != 0.0f) {
                    drr0Var.t(0.0f);
                    err0 err0Var = ys71Var.k().b.g;
                    err0Var.t(err0Var.s() + 1);
                }
                ys71Var.c.setValue(bool5);
                ys71Var.i.setValue(ov71Var);
                x340Var.r(false);
                qim0 qim0VarThen = qim0Var.then(new zq71(ys71Var));
                x340Var.r(false);
                return qim0VarThen;
            case 10:
                return a(obj, obj2, obj3);
            case 11:
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                i681 i681Var = (i681) obj6;
                j681 j681Var = (j681) obj7;
                int iC2 = l1d.C(j681Var.e);
                if (iC2 == 0) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(-1988518031);
                    qim0 qim0VarN2 = anm1.N("show_generation_row_progress", nim0Var);
                    uwr uwrVar9 = cbx.a;
                    xto1.e(qim0VarN2, 2, cbx.a(x340Var27).b.b, 0L, x340Var27, 48, 8);
                    x340Var27.r(false);
                } else if (iC2 == 1) {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(-1988509971);
                    r6p1.n(i681Var.d, "show_generation_row_retry", (Function0) obj5, false, x340Var28, 48, 8);
                    x340Var28.r(false);
                } else {
                    if (iC2 != 2) {
                        throw p3d1.k(x340Var26, -1988519275, false);
                    }
                    x340 x340Var29 = x340Var26;
                    x340Var29.i0(-1514081854);
                    String str13 = i681Var.e;
                    String str14 = j681Var.d;
                    r6p1.n(str13, "show_generation_row_view", (Function0) obj4, !(str14 == null || ihc1.y0(str14)), x340Var29, 48, 0);
                    x340Var29.r(false);
                }
                return rih1Var;
            case 12:
                return d(obj, obj2, obj3);
            case 13:
                x340 x340Var30 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ila0.d((vu30) null, (vu30) obj7, (vu30) obj6, (vu30) obj5, (vu30) obj4, x340Var31, 0, 1);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 14:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                gfx.b(6, apo.r(-2076209594, new xt91((cce) obj7, (dbp) obj6, (wt91) obj5, (ven0) obj4, (byte) 1), b0kVar), b0kVar, 54);
                return rih1Var;
            case 15:
                return e(obj, obj2, obj3);
            case 16:
                return f(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return h(obj, obj2, obj3);
            case 19:
                return i(obj, obj2, obj3);
            case 20:
                return j(obj, obj2, obj3);
            case 21:
                return k(obj, obj2, obj3);
            case 22:
                return m(obj, obj2, obj3);
            default:
                x340 x340Var32 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str15 = (String) obj7;
                mml1 mml1Var = (mml1) obj6;
                lik1 lik1Var = (lik1) obj5;
                iu30 iu30Var3 = (iu30) obj4;
                gfh0 gfh0VarC4 = t1c.c(een.d, false);
                x340 x340Var33 = x340Var32;
                int iHashCode8 = Long.hashCode(x340Var33.T);
                xos0 xos0VarM8 = x340Var33.m();
                qim0 qim0VarE8 = zr7.E(x340Var32, nim0Var);
                hzj.A.getClass();
                x340 x340Var34 = x340Var32;
                if (x340Var34.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var34.m0();
                if (x340Var34.S) {
                    x340Var34.l(n4kVar);
                } else {
                    x340Var34.v0();
                }
                nko1.H(gfh0VarC4, x340Var32, y580.O0);
                nko1.H(xos0VarM8, x340Var32, y580.N0);
                nko1.H(Integer.valueOf(iHashCode8), x340Var32, y580.R0);
                nko1.F(x340Var32);
                nko1.H(qim0VarE8, x340Var32, y580.Y);
                uwr uwrVar10 = cbx.a;
                j1e1.f((qim0) null, ((xex) ((gmt) zex.a.c).b).z, x340Var32, 0, 1);
                x340Var34.i0(-1291241748);
                String strN0 = cwl1.n0(2131959617, new Object[]{str15}, x340Var32);
                x340Var34.r(false);
                String strO0 = cwl1.o0(x340Var32, 2131959616);
                j2i j2iVarR = apo.r(1340991503, new pej1(mml1Var, lik1Var, iu30Var3, (byte) 16), x340Var32);
                Object objT11 = x340Var34.T();
                if (objT11 == fkj0.X) {
                    objT11 = w3l1.S0;
                    x340Var34.s0(objT11);
                }
                c97.c(strN0, (qim0) null, strO0, j2iVarR, false, (Function0) objT11, x340Var32, 224256, 2);
                x340Var34.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj21(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj21(ven0 ven0Var, cce cceVar, dbp dbpVar, ven0 ven0Var2) {
        super(3);
        this.a = (byte) 15;
        this.b = ven0Var;
        this.c = cceVar;
        this.d = dbpVar;
        this.e = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj21(boolean z, String str, mml1 mml1Var, lik1 lik1Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 23;
        this.b = str;
        this.c = mml1Var;
        this.d = lik1Var;
        this.e = iu30Var;
    }
}
