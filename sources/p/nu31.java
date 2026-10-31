package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nu31 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu31(List list, ls71 ls71Var, os71 os71Var) {
        super(3);
        this.a = (byte) 10;
        this.b = list;
        this.c = ls71Var;
        this.d = os71Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        eea1 eea1Var = (eea1) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.c;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(eea1Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            String str = eea1Var.a;
            c380 c380Var = eea1Var.b;
            int i = eea1Var.c;
            fea1 fea1Var = (fea1) this.b;
            qtt0 qtt0Var = fea1Var.c;
            boolean z = qtt0Var == null || qtt0Var == qtt0.b || qtt0Var == qtt0.a;
            boolean z2 = eea1Var.e;
            j2i j2iVarR = apo.r(-631200962, new qm71(eea1Var, (iea1) this.d, fea1Var, (byte) 20), x340Var2);
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new pba1(iu30Var, (byte) 1);
                x340Var2.s0(objT);
            }
            y7y0.j(str, c380Var, i, z, z2, j2iVarR, (Function0) objT, null, x340Var2, 196608);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        c380 c380Var = (c380) this.b;
        vu30 vu30Var = (vu30) this.c;
        String str = (String) this.d;
        int i = 0;
        for (Object obj4 : c380Var) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            dka1 dka1Var = (dka1) obj4;
            String str2 = dka1Var.a;
            x340 x340Var2 = x340Var;
            boolean zG = x340Var2.g(vu30Var) | x340Var2.i(dka1Var) | x340Var2.e(i);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new wv1(vu30Var, dka1Var, i, (byte) 25);
                x340Var2.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            qim0 qim0VarN = nim0.a;
            if (str != null) {
                qim0VarN = anm1.N("SourceChips.Chip." + i, qim0VarN);
            }
            i541.g(0, str2, function0, x340Var2, qim0VarN);
            i = i2;
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        j2i j2iVar = tkj.e;
        ven0 ven0Var = (ven0) this.b;
        x340 x340Var = (b0k) obj2;
        boolean zI = x340Var.i(ven0Var);
        iu30 iu30Var = (iu30) this.c;
        boolean zG = zI | x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new rc21(iu30Var, ven0Var, (byte) 6);
            x340Var.s0(objT);
        }
        gt4.b(j2iVar, (Function0) objT, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var, 6, 508);
        j2i j2iVarR = apo.r(981807461, new nl41((String) this.d, (byte) 21), x340Var);
        boolean zI2 = x340Var.i(ven0Var) | x340Var.g(iu30Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new rc21(iu30Var, ven0Var, (byte) 7);
            x340Var.s0(objT2);
        }
        gt4.b(j2iVarR, (Function0) objT2, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var, 6, 508);
        j2i j2iVar2 = tkj.f;
        boolean zI3 = x340Var.i(ven0Var) | x340Var.g(iu30Var);
        Object objT3 = x340Var.T();
        if (zI3 || objT3 == m4cVar) {
            objT3 = new rc21(iu30Var, ven0Var, (byte) 8);
            x340Var.s0(objT3);
        }
        gt4.b(j2iVar2, (Function0) objT3, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var, 6, 508);
        j2i j2iVar3 = tkj.g;
        boolean zI4 = x340Var.i(ven0Var) | x340Var.g(iu30Var);
        Object objT4 = x340Var.T();
        if (zI4 || objT4 == m4cVar) {
            objT4 = new rc21(iu30Var, ven0Var, (byte) 9);
            x340Var.s0(objT4);
        }
        gt4.b(j2iVar3, (Function0) objT4, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var, 6, 508);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        gra graVar = een.d;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16);
        j06 j06Var = x340Var2.a;
        if (zY) {
            fra fraVar = een.N0;
            xu30 xu30Var = (xu30) this.b;
            xu30 xu30Var2 = (xu30) this.c;
            xu30 xu30Var3 = (xu30) this.d;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            h2c h2cVar = h2c.a;
            if (xu30Var != null) {
                x340Var2.i0(-654535605);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                xu30Var.invoke(h2cVar, x340Var2, 6);
                x340Var2.r(true);
                z = false;
                x340Var2.r(false);
            } else {
                z = false;
                x340Var2.i0(-654476023);
                x340Var2.r(false);
            }
            if (xu30Var2 != 0) {
                x340Var2.i0(-654428438);
                gfh0 gfh0VarC2 = t1c.c(graVar, z);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, nim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC2, x340Var2, lljVar);
                nko1.H(xos0VarM3, x340Var2, lljVar2);
                x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar4);
                xu30Var2.invoke(h2cVar, x340Var2, 6);
                x340Var2.r(true);
                z = false;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-654367895);
                x340Var2.r(z);
            }
            if (xu30Var3 != 0) {
                x340Var2.i0(-654322356);
                gfh0 gfh0VarC3 = t1c.c(graVar, z);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, nim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC3, x340Var2, lljVar);
                nko1.H(xos0VarM4, x340Var2, lljVar2);
                x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar4);
                xu30Var3.invoke(h2cVar, x340Var2, 6);
                z2 = true;
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                boolean z4 = z;
                z2 = true;
                x340Var2.i0(-654263735);
                x340Var2.r(z4);
            }
            x340Var2.r(z2);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        g2c g2cVar = (g2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        hwq hwqVar = (hwq) this.c;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(g2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            tk90 tk90Var = (tk90) this.b;
            if (tk90Var == null) {
                x340Var2.i0(-708687884);
            } else {
                x340Var2.i0(531328429);
                tk90Var.a(hwqVar, x340Var2, 0);
            }
            x340Var2.r(false);
            for (tk90 tk90Var2 : (ArrayList) this.d) {
                qim0 qim0VarB = g2cVar.b(nim0.a);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                tk90Var2.getClass();
                tk90Var2.a(hwqVar, x340Var2, 0);
                x340Var2.r(true);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        fvb1 fvb1Var = (fvb1) this.c;
        hvb1 hvb1Var = (hvb1) this.b;
        xm10 xm10Var = (xm10) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? x340Var.g(xm10Var) : x340Var.i(xm10Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            wmb0 wmb0VarA = xm10Var.a();
            wmb0 wmb0Var = wmb0.b;
            Object obj4 = this.d;
            if (wmb0VarA == wmb0Var) {
                x340Var2.i0(-1555363156);
                hvb1Var.f(fvb1Var, (ya30) obj4, xm10Var, x340Var2, (iIntValue << 6) & 896);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1555281843);
                hvb1Var.h(fvb1Var, (ya30) obj4, xm10Var, x340Var2, (iIntValue << 6) & 896);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        qim0 qim0VarH = u291.h(u291.f(dug.f(nim0.a, cbx.a(x340Var).a.c, d4o1.a), 1.0f), 100.0f);
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
        cvx cvxVar2 = cbx.b(x340Var).b;
        d36 d36Var = new d36(8.0f, true, new um5(false));
        fra fraVar = een.N0;
        xwb1 xwb1Var = (xwb1) this.b;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(xwb1Var);
        tyq tyqVar = (tyq) this.c;
        boolean zI2 = zI | x340Var2.i(tyqVar);
        iu30 iu30Var = (iu30) this.d;
        boolean zG = zI2 | x340Var2.g(iu30Var);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            objT = new ny51(xwb1Var, tyqVar, iu30Var, (byte) 24);
            x340Var2.s0(objT);
        }
        ujo1.e(qim0VarZ, (xtb0) null, (vzq0) null, d36Var, fraVar, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 0, 462);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object j(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        ryf ryfVar = (ryf) this.d;
        lzn0 lzn0Var = (lzn0) this.c;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        soc1 soc1Var = (soc1) this.b;
        int iC = l1d.C(soc1Var.b);
        if (iC == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1660378545);
            xio1.e(soc1Var.c, lzn0Var, ryfVar, vzq0Var, x340Var2, (iIntValue << 12) & 57344);
            x340Var2.r(false);
        } else {
            if (iC != 1) {
                throw p3d1.k(x340Var, 1660376522, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1660385227);
            ajo1.j(soc1Var.d, lzn0Var, ryfVar, vzq0Var, x340Var3, (iIntValue << 12) & 57344);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        bin.c(384, apo.r(373331921, new j2r0((j2i) this.b, (byte) 23), x340Var), x340Var, u291.d(nim0Var, 1.0f));
        uwr uwrVar = cbx.a;
        op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.a));
        era eraVar = een.Q0;
        cvx cvxVar = cbx.b(x340Var).b;
        d36 d36Var = new d36(16.0f, true, new um5(false));
        qim0 qim0Var = (qim0) ((iu30) this.c).invoke(nim0Var);
        j2i j2iVar = (j2i) this.d;
        mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        j2iVar.invoke(x340Var, 0);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        f9d1 f9d1Var = (f9d1) obj;
        ((Number) obj3).intValue();
        smp0 smp0Var = (smp0) this.c;
        iu30 iu30Var = (iu30) this.d;
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            usq usqVar = (usq) smp0Var.c;
            h9d1 h9d1Var = new h9d1((vsq) ((jly0) ((jmq) usqVar.a.c).b).get(), new iuy0(iu30Var, (byte) 21));
            x340Var.s0(h9d1Var);
            objT = h9d1Var;
        }
        c9 c9VarF = mqo1.F(f9d1Var.a);
        k9d1 k9d1Var = (k9d1) this.b;
        otw.c((h9d1) objT, new g9d1(c9VarF, k9d1Var.a, k9d1Var.b), (qim0) null, (ipb1) null, x340Var, 8, 12);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        Object objValueOf;
        rih1 rih1Var;
        byte b = this.a;
        gex0 gex0Var = h36.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var2 = rih1.a;
        Object obj4 = this.b;
        Object obj5 = this.c;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ftv ftvVar = ((fu31) obj5).b;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).g;
                    cjc0 cjc0Var = new cjc0(1);
                    List list = ftvVar.i;
                    ((ru31) obj4).getClass();
                    uvx uvxVar = (uvx) obj6;
                    uwo1.e(ru31.o(list, ", ", x340Var2), uyn1.z(gto1.B(uvxVar.a, x340Var2, uvxVar.c).b, 0.0f, 2, pqo.h(nim0Var, !ftvVar.g)), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 1572864, 0, 1720);
                } else {
                    x340Var2.b0();
                }
                return rih1Var2;
            case 1:
                i251 i251Var = (i251) obj2;
                if (i251Var instanceof f251) {
                    ((iu30) obj4).invoke(((f251) i251Var).a);
                } else if (i251Var instanceof g251) {
                    ((iu30) obj5).invoke(((g251) i251Var).a);
                } else {
                    if (!i251Var.equals(e251.a)) {
                        eg.o();
                        return null;
                    }
                    ((Function0) obj6).invoke();
                }
                return rih1Var2;
            case 2:
                boolean z = false;
                xxr0 xxr0Var = (xxr0) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(xxr0Var) : x340Var3.i(xxr0Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    iyr0 iyr0Var = (iyr0) obj4;
                    if (((g4a) ((ven0) obj5).getValue()) == ilo1.D(iyr0Var)) {
                        z = true;
                    }
                    y2o1.a(xxr0Var, iyr0Var, z, (vb1) obj6, x340Var4, iIntValue2 & 14);
                } else {
                    x340Var4.b0();
                }
                return rih1Var2;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    otw.c((xkg1) obj4, new wkg1(((fli0) obj5).a, ((cx) obj6).b), (qim0) null, (ipb1) null, x340Var6, 6, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 4:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                fli0 fli0Var = (fli0) obj4;
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16);
                j06 j06Var = x340Var8.a;
                if (zY) {
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
                    mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(z4p1.e(fli0Var.g), 1.0f, 0.0f, 0.0f, 0.0f, 14)));
                    Float fValueOf = Float.valueOf(1.0f);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarE = dug.e(qim0VarZ, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(x340Var8).a.c))}, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6);
                    ob9 ob9Var = (ob9) obj5;
                    cx cxVar = (cx) obj6;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarE);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var8, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var8, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var8, lljVar3);
                    nko1.F(x340Var8);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE2, x340Var8, lljVar4);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, nim0Var);
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA, x340Var8, lljVar);
                    nko1.H(xos0VarM2, x340Var8, lljVar2);
                    x0d.q(iHashCode2, x340Var8, lljVar3, x340Var8);
                    nko1.H(qim0VarE3, x340Var8, lljVar4);
                    wat watVar = (wat) x340Var8.k(t4k.h);
                    Context context = (Context) x340Var8.k(AndroidCompositionLocals_androidKt.b);
                    Object objT = x340Var8.T();
                    if (objT == fkj0.X) {
                        objT = ktd.k(watVar.M0(h4o1.n(context.getResources())), x340Var8);
                    }
                    op71.g(x340Var8, u291.f(u291.h(nim0Var, 56.0f + ((p3v) objT).a), 1.0f));
                    otw.c(ob9Var, new mb9(fli0Var.d, cxVar.a, fli0Var.b), (qim0) null, (ipb1) null, x340Var8, 6, 12);
                    x340Var8.r(true);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var2;
            case 5:
                gn61 gn61Var = (gn61) obj5;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                y441 y441Var = (y441) obj4;
                idd1 idd1Var = (idd1) y441Var.c;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    kn61 kn61Var = (kn61) obj6;
                    otw.c((jn61) idd1Var.getValue(), gn61Var, (qim0) null, wpb1.D(rc11.a.b(((kly0) y441Var.a).getClass()).o() + "." + kn61Var.a + "." + kn61Var.b, (jn61) idd1Var.getValue(), gn61Var, x340Var10, 0), x340Var10, 0, 4);
                } else {
                    x340Var10.b0();
                }
                return rih1Var2;
            case 6:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var2, 1.0f);
                lee1 lee1Var2 = (lee1) obj4;
                hux huxVar = (hux) obj5;
                j2i j2iVar = (j2i) obj6;
                jw31 jw31VarA = ew31.a(gex0Var, een.Z, x340Var11, 0);
                x340 x340Var12 = x340Var11;
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE4 = zr7.E(x340Var11, qim0VarF);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(jw31VarA, x340Var11, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM3, x340Var11, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var11, lljVar7);
                nko1.F(x340Var11);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE4, x340Var11, lljVar8);
                uwr uwrVar3 = cbx.a;
                long j = cbx.a(x340Var11).b.a;
                yae1 yae1VarQ = d5p1.q(0, x340Var11, 1);
                boolean zG = x340Var13.g(yae1VarQ);
                Object objT2 = x340Var13.T();
                if (zG || objT2 == fkj0.X) {
                    objValueOf = Integer.valueOf((int) (yae1.a(yae1VarQ, "", lee1Var2, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L));
                    x340Var13.s0(objValueOf);
                } else {
                    objValueOf = objT2;
                }
                int iIntValue6 = ((Number) objValueOf).intValue();
                x340Var13.i0(-742724284);
                wat watVar2 = (wat) x340Var13.k(t4k.h);
                cvx cvxVar = cbx.b(x340Var11).b;
                w0h1.a(huxVar, isl.a, u291.h(u291.v(uyn1.B(nim0Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11), watVar2.y(lee1Var2.a.b)), watVar2.M0(iIntValue6)), j, 0L, false, x340Var11, 56, 48);
                x340Var13.r(false);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode4 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM4 = x340Var13.m();
                qim0 qim0VarE5 = zr7.E(x340Var11, nim0Var2);
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(gfh0VarC2, x340Var11, lljVar5);
                nko1.H(xos0VarM4, x340Var11, lljVar6);
                i3a.l(iHashCode4, x340Var11, lljVar7, x340Var11);
                nko1.H(qim0VarE5, x340Var11, lljVar8);
                j2iVar.invoke(h2c.a, x340Var11, 6);
                x340Var13.r(true);
                x340Var13.r(true);
                return rih1Var2;
            case 7:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var14 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var14.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var15 = x340Var14;
                boolean zY2 = x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18);
                j06 j06Var2 = x340Var15.a;
                if (zY2) {
                    c8e1 c8e1Var = (c8e1) obj4;
                    vt61 vt61Var = (vt61) obj5;
                    iu30 iu30Var = (iu30) obj6;
                    jw31 jw31VarA2 = ew31.a(gex0Var, een.N0, x340Var15, 48);
                    int iHashCode5 = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM5 = x340Var15.m();
                    qim0 qim0VarE6 = zr7.E(x340Var15, nim0Var);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    llj lljVar9 = y580.O0;
                    nko1.H(jw31VarA2, x340Var15, lljVar9);
                    llj lljVar10 = y580.N0;
                    nko1.H(xos0VarM5, x340Var15, lljVar10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    llj lljVar11 = y580.R0;
                    nko1.H(numValueOf3, x340Var15, lljVar11);
                    nko1.F(x340Var15);
                    llj lljVar12 = y580.Y;
                    wnb0 wnb0VarQ = kk0.q(x340Var15, qim0VarE6, lljVar12, 1.0f, true);
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iHashCode6 = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM6 = x340Var15.m();
                    qim0 qim0VarE7 = zr7.E(x340Var15, wnb0VarQ);
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var15, lljVar9);
                    nko1.H(xos0VarM6, x340Var15, lljVar10);
                    x0d.q(iHashCode6, x340Var15, lljVar11, x340Var15);
                    nko1.H(qim0VarE7, x340Var15, lljVar12);
                    if (c8e1Var.a.b.length() == 0) {
                        x340Var15.i0(-1494254637);
                        String strO0 = cwl1.o0(x340Var15, 2131962104);
                        uwr uwrVar4 = cbx.a;
                        uwo1.e(strO0, (qim0) null, cbx.d(x340Var15).g, cbx.a(x340Var15).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2034);
                        x340Var15.r(false);
                    } else {
                        x340Var15.i0(-1494018231);
                        x340Var15.r(false);
                    }
                    us71.j(iIntValue7 & 14, vu30Var, x340Var15, true);
                    if (c8e1Var.a.b.length() > 0) {
                        x340Var15.i0(1828494553);
                        boolean zI = x340Var15.i(vt61Var) | x340Var15.g(iu30Var);
                        Object objT3 = x340Var15.T();
                        if (zI || objT3 == fkj0.X) {
                            objT3 = new fh61(vt61Var, iu30Var, (byte) 3);
                            x340Var15.s0(objT3);
                        }
                        vt61Var.a(0, (Function0) objT3, x340Var15, (qim0) null);
                        x340Var15.r(false);
                    } else {
                        x340Var15.i0(1828719427);
                        x340Var15.r(false);
                    }
                    x340Var15.r(true);
                } else {
                    x340Var15.b0();
                }
                return rih1Var2;
            case 8:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                kiv kivVar = vvx.a;
                uwr uwrVar5 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar).b;
                mod.b(kivVar.a(new uvx(0, null, 0, null, uyn1.h(2, 4.0f, 0.0f), null, null, 0, null, 495)), apo.r(-613848095, new gh61((su61) obj4, (List) obj5, (vzq0) obj, (String) obj6, (byte) 2), b0kVar), b0kVar, 56);
                return rih1Var2;
            case 9:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj6;
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    tln tlnVar = (tln) obj4;
                    String uri = ((dp71) obj5).b.getUri();
                    boolean zG2 = x340Var17.g(iu30Var2);
                    Object objT4 = x340Var17.T();
                    if (zG2 || objT4 == fkj0.X) {
                        objT4 = new et61(iu30Var2, (byte) 6);
                        x340Var17.s0(objT4);
                    }
                    otw.c(tlnVar, new pln(new rln(uri, (iu30) objT4)), (qim0) null, (ipb1) null, x340Var17, 0, 12);
                } else {
                    x340Var17.b0();
                }
                return rih1Var2;
            case 10:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var19).g, 32, nim0Var);
                    uwr uwrVar6 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var19).b;
                    qim0 qim0VarB = uyn1.B(qim0VarO, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    List list2 = (List) obj4;
                    ls71 ls71Var = (ls71) obj5;
                    os71 os71Var = (os71) obj6;
                    mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var19, 0);
                    int iHashCode7 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM7 = x340Var19.m();
                    qim0 qim0VarE8 = zr7.E(x340Var19, qim0VarB);
                    hzj.A.getClass();
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
                    nko1.H(mbhVarA2, x340Var19, y580.O0);
                    nko1.H(xos0VarM7, x340Var19, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode7), x340Var19, y580.R0);
                    nko1.F(x340Var19);
                    nko1.H(qim0VarE8, x340Var19, y580.Y);
                    String strU = cwl1.U(2131820894, list2.size(), new Object[]{Integer.valueOf(list2.size())}, x340Var19);
                    lee1 lee1Var3 = cbx.d(x340Var19).h;
                    long j2 = cbx.a(x340Var19).b.a;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    cvx cvxVar4 = cbx.b(x340Var19).b;
                    cvx cvxVar5 = cbx.b(x340Var19).b;
                    uwo1.e(strU, uyn1.y(qim0VarF2, 16.0f, 12.0f), lee1Var3, j2, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var19, 0, 0, 2016);
                    boolean zG3 = x340Var19.g(list2) | x340Var19.i(ls71Var) | x340Var19.i(os71Var);
                    Object objT5 = x340Var19.T();
                    if (zG3 || objT5 == fkj0.X) {
                        objT5 = new ny51(list2, ls71Var, os71Var, (byte) 9);
                        x340Var19.s0(objT5);
                    }
                    ujo1.d((qim0) null, (xtb0) null, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, x340Var19, 0, 511);
                    x340Var19.r(true);
                } else {
                    x340Var19.b0();
                }
                return rih1Var2;
            case 11:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                he81 he81Var = (he81) obj5;
                j7p1.a(Uri.parse(((mxh) obj4).b), he81Var.d, (qim0) null, x340Var20, 0);
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj6;
                if (videoSurfaceView == null || !u890.j(he81Var.n, Boolean.TRUE)) {
                    videoSurfaceView = null;
                }
                if (videoSurfaceView == null) {
                    x340 x340Var21 = x340Var20;
                    x340Var21.i0(-829765889);
                    x340Var21.r(false);
                    rih1Var = null;
                } else {
                    x340 x340Var22 = x340Var20;
                    x340Var22.i0(-829765888);
                    boolean zI2 = x340Var22.i(videoSurfaceView);
                    Object objT6 = x340Var22.T();
                    if (zI2 || objT6 == fkj0.X) {
                        objT6 = new mc81(videoSurfaceView, (byte) 0);
                        x340Var22.s0(objT6);
                    }
                    dm5.a((iu30) objT6, u291.r(nim0Var, 142.0f), (iu30) null, x340Var22, 0, 4);
                    x340Var22.r(false);
                    rih1Var = rih1Var2;
                }
                if (rih1Var == null) {
                    x340 x340Var23 = x340Var20;
                    x340Var23.i0(-442403972);
                    j7p1.a(Uri.parse(he81Var.e), he81Var.d, (qim0) null, x340Var23, 0);
                    x340Var23.r(false);
                } else {
                    x340 x340Var24 = x340Var20;
                    x340Var24.i0(-442411226);
                    x340Var24.r(false);
                }
                return rih1Var2;
            case 12:
                vzq0 vzq0Var = (vzq0) obj;
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar7 = cbx.a;
                j1e1.f((qim0) null, ((xex) ((gmt) zex.a.c).b).z, b0kVar2, 0, 1);
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), l6o1.C(0, 0, 1, b0kVar2), apo.r(-1680007225, new gh61(vzq0Var, (cd71) obj4, (z710) obj5, (wj81) obj6, (byte) 11), b0kVar2), b0kVar2, 384, 0);
                return rih1Var2;
            case 13:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var25 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x2y x2yVar = (x2y) obj4;
                uwr uwrVar8 = cbx.a;
                j1e1.f((qim0) null, ((xex) ((gmt) zex.a.c).b).z, x340Var25, 0, 1);
                y4o1 y4o1Var = ((bhm0) ((ven0) obj6).getValue()).a;
                if (u890.j(y4o1Var, pdh1.f)) {
                    x340 x340Var26 = x340Var25;
                    x340Var26.i0(885202751);
                    mk81 mk81Var = ((kk81) obj5).K1;
                    if (mk81Var == null) {
                        u890.C("logger");
                        throw null;
                    }
                    cto1.i(vzq0Var2, x2yVar, mk81Var, (qim0) null, x340Var26, iIntValue10 & 14);
                    x340Var26.r(false);
                } else if (u890.j(y4o1Var, ndh1.f)) {
                    x340 x340Var27 = x340Var25;
                    x340Var27.i0(885205580);
                    p6p1.m(vzq0Var2, (qim0) null, x340Var27, iIntValue10 & 14);
                    x340Var27.r(false);
                } else {
                    if (!u890.j(y4o1Var, jdh1.f)) {
                        throw p3d1.k(x340Var25, 885201382, false);
                    }
                    x340 x340Var28 = x340Var25;
                    x340Var28.i0(885208527);
                    boolean zI3 = x340Var28.i(x2yVar);
                    Object objT7 = x340Var28.T();
                    if (zI3 || objT7 == m4cVar) {
                        objT7 = new hk81(x2yVar, (byte) 1);
                        x340Var28.s0(objT7);
                    }
                    Function0 function0 = (Function0) objT7;
                    boolean zI4 = x340Var28.i(x2yVar);
                    Object objT8 = x340Var28.T();
                    if (zI4 || objT8 == m4cVar) {
                        objT8 = new hk81(x2yVar, (byte) 2);
                        x340Var28.s0(objT8);
                    }
                    b2u.e(function0, (Function0) objT8, x340Var28, 0);
                    x340Var28.r(false);
                }
                return rih1Var2;
            case 14:
                ((Number) obj3).intValue();
                f5p1.h((String) obj4, (String) obj5, (q10) obj6, dm5.J(et40.a), nee1.a, nee1.b, (String) null, (String) null, 0, (b0k) obj2, 0, 448);
                return rih1Var2;
            case 15:
                x340 x340Var29 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar9 = cbx.a;
                cvx cvxVar6 = cbx.b(x340Var29).b;
                bc81 bc81Var = (bc81) obj4;
                Map map = (Map) obj5;
                Function0 function1 = (Function0) obj6;
                mbh mbhVarA3 = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var29, 0);
                x340 x340Var30 = x340Var29;
                int iHashCode8 = Long.hashCode(x340Var30.T);
                xos0 xos0VarM8 = x340Var30.m();
                qim0 qim0VarE9 = zr7.E(x340Var29, nim0Var);
                hzj.A.getClass();
                x340 x340Var31 = x340Var29;
                if (x340Var31.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var31.m0();
                if (x340Var31.S) {
                    x340Var31.l(n4kVar);
                } else {
                    x340Var31.v0();
                }
                nko1.H(mbhVarA3, x340Var29, y580.O0);
                nko1.H(xos0VarM8, x340Var29, y580.N0);
                nko1.H(Integer.valueOf(iHashCode8), x340Var29, y580.R0);
                nko1.F(x340Var29);
                nko1.H(qim0VarE9, x340Var29, y580.Y);
                gm50.j((qim0) null, x340Var29, 0);
                gm50.d(bc81Var.d, map, (qim0) null, x340Var29, 0);
                gm50.k(bc81Var, (rv21) map.get(bc81Var.c), function1, (qim0) null, x340Var29, 0);
                x340Var31.r(true);
                return rih1Var2;
            case 16:
                x340 x340Var32 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    Object objT9 = x340Var33.T();
                    if (objT9 == fkj0.X) {
                        objT9 = p9a1.U0;
                        x340Var33.s0(objT9);
                    }
                    qim0 qim0VarB2 = s161.b(nim0Var, false, (iu30) objT9);
                    hw2 hw2Var = (hw2) obj4;
                    s9a1 s9a1Var = (s9a1) obj5;
                    gft0 gft0Var = (gft0) obj6;
                    jw31 jw31VarA3 = ew31.a(gex0Var, een.Z, x340Var33, 0);
                    int iHashCode9 = Long.hashCode(x340Var33.T);
                    xos0 xos0VarM9 = x340Var33.m();
                    qim0 qim0VarE10 = zr7.E(x340Var33, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var33.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var33.m0();
                    if (x340Var33.S) {
                        x340Var33.l(n4kVar);
                    } else {
                        x340Var33.v0();
                    }
                    nko1.H(jw31VarA3, x340Var33, y580.O0);
                    nko1.H(xos0VarM9, x340Var33, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode9), x340Var33, y580.R0);
                    nko1.F(x340Var33);
                    nko1.H(qim0VarE10, x340Var33, y580.Y);
                    otw.c((idm) hw2Var.i, new wcm(s9a1Var.a, s9a1Var.g, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1020), (qim0) null, (ipb1) null, x340Var33, 0, 12);
                    otw.c(gft0Var, new qet0(s9a1Var.a, s9a1Var.f == qtt0.b, false, new oet0(), 4), anm1.N("music-play-button", nim0Var), (ipb1) null, x340Var33, 448, 8);
                    x340Var33.r(true);
                } else {
                    x340Var33.b0();
                }
                return rih1Var2;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return a(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return d(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return e(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Number) obj3).intValue();
                vvm1.o((uoa) obj4, (Function0) obj5, (Function0) obj6, u291.c(u291.f(nim0Var, 1.0f), 0.5f), (b0k) obj2, 0);
                return rih1Var2;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return f(obj, obj2, obj3);
            case 22:
                return g(obj, obj2, obj3);
            case 23:
                return h(obj, obj2, obj3);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return i(obj, obj2, obj3);
            case 25:
                return j(obj, obj2, obj3);
            case 26:
                return k(obj, obj2, obj3);
            case 27:
                xto1.u((i2c) obj, (ArrayList) obj4, (vi11) obj5, (vzq0) obj6, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var2;
            case 28:
                return m(obj, obj2, obj3);
            default:
                int iIntValue12 = ((Number) obj).intValue();
                x340 x340Var34 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                vu30 vu30Var2 = (vu30) obj6;
                m4c m4cVar2 = fkj0.X;
                vu30 vu30Var3 = (vu30) obj5;
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= x340Var34.e(iIntValue12) ? 4 : 2;
                }
                x340 x340Var35 = x340Var34;
                if (x340Var35.Y(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    String str = (String) ((List) obj4).get(iIntValue12);
                    x340Var35.i0(-1288551471);
                    int i = (iIntValue13 & 14) ^ 6;
                    boolean zG4 = x340Var35.g(vu30Var3) | ((i > 4 && x340Var35.e(iIntValue12)) || (iIntValue13 & 6) == 4) | x340Var35.g(str);
                    Object objT10 = x340Var35.T();
                    if (zG4 || objT10 == m4cVar2) {
                        objT10 = new v2b(vu30Var3, iIntValue12, str, (lnm) null, (byte) 12);
                        x340Var35.s0(objT10);
                    }
                    qxd0.t(str, x340Var35, (vu30) objT10);
                    boolean zG5 = ((i > 4 && x340Var35.e(iIntValue12)) || (iIntValue13 & 6) == 4) | x340Var35.g(vu30Var2) | x340Var35.g(str);
                    Object objT11 = x340Var35.T();
                    if (zG5 || objT11 == m4cVar2) {
                        objT11 = new ic5(vu30Var2, iIntValue12, str);
                        x340Var35.s0(objT11);
                    }
                    gbx gbxVar = new gbx(z50.c, (Function0) objT11);
                    qim0 qim0VarX = u291.x(0.0f, cvd1.c, 1, nim0Var);
                    pex pexVar = pex.b;
                    lex lexVarZ = yoo1.z(x340Var35);
                    uwr uwrVar10 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var35).b;
                    cvx cvxVar8 = cbx.b(x340Var35).b;
                    poo1.e(gbxVar, pexVar, lexVarZ, qim0VarX, 2, cwl1.n0(2131963106, new Object[]{ihc1.f1(ihc1.J0(ihc1.J0(ihc1.f1(str).toString(), "…"), "...")).toString()}, x340Var35), (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, new zzq0(6.0f, 4.0f, 6.0f, 4.0f), apo.r(-280441826, new zsd1(str, (byte) 1), x340Var35), x340Var35, 24576, 3072, 4032);
                    x340Var35.r(false);
                } else {
                    x340Var35.b0();
                }
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nu31(Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu31(xwb1 xwb1Var, tyq tyqVar, iu30 iu30Var) {
        super(3);
        this.a = (byte) 24;
        this.b = xwb1Var;
        this.c = tyqVar;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu31(soc1 soc1Var, lzn0 lzn0Var, ryf ryfVar) {
        super(3);
        this.a = (byte) 25;
        this.b = soc1Var;
        this.c = lzn0Var;
        this.d = ryfVar;
    }
}
