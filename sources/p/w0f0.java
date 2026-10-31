package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.idj.v1.MicPermissionPageResponse;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import io.reactivex.rxjava3.core.Flowable;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w0f0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0f0(iu30 iu30Var, yrg0 yrg0Var, qim0 qim0Var, p091 p091Var, int i) {
        super(2);
        this.a = (byte) 15;
        this.c = iu30Var;
        this.d = yrg0Var;
        this.b = qim0Var;
        this.e = p091Var;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        ven0 ven0Var = (ven0) this.e;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            j2i j2iVar = (j2i) this.c;
            jjm0 jjm0Var = (jjm0) this.d;
            Object value = ((tob1) this.b).getValue();
            Object value2 = ven0Var.getValue();
            boolean zI = x340Var2.i(ven0Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new abh0(ven0Var, (byte) 16);
                x340Var2.s0(objT);
            }
            j2iVar.Y(jjm0Var, value, value2, objT, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        up30.e((qkm0) this.c, (vu30) this.d, (vu30) this.e, (qim0) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((e27) this.c).e((jgn0) this.d, (iu30) this.e, (qim0) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.c;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            qim0 qim0Var = (qim0) this.b;
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            boolean zG = x340Var2.g(iu30Var);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 15);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0Var, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28);
            zkn0 zkn0Var = (zkn0) this.d;
            String str = zkn0Var.b;
            tob1 tob1Var = (tob1) this.e;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
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
            String str2 = zkn0Var.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            uwr uwrVar = cbx.a;
            uwo1.e(str2, qim0VarB, cbx.d(x340Var2).h, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            op71.g(x340Var2, u291.h(nim0Var, 13.0f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            uwo1.e(str, d9y0.k(nim0Var, 0.0f), cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            uwo1.e(ihc1.c1(((Number) tob1Var.getValue()).intValue(), str), null, cbx.d(x340Var2).j, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        bqn1.m((mpn0) this.c, (qim0) this.b, (Function0) this.d, (Function0) this.e, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        boolean z;
        ihl ihlVar;
        boolean z2;
        int i;
        byte b = this.a;
        byte b2 = 21;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                sqe.j((r0f0) obj6, (kqp) obj5, (w6e0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                u7n0.d((c9) obj6, (xym) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                qtf0 qtf0Var = (qtf0) obj6;
                gra graVar = een.h;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    cmf0 cmf0Var = qtf0Var.e;
                    if (cmf0Var instanceof emf0) {
                        x340Var2.i0(1364571456);
                        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                        gfh0 gfh0VarC = t1c.c(graVar, false);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC, x340Var2, lljVar4);
                        nko1.H(xos0VarM, x340Var2, lljVar3);
                        x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
                        nko1.H(qim0VarE, x340Var2, lljVar);
                        r9e1.a("Loading lyrics...", (qim0) null, 0L, 0L, (FontWeight) null, 0L, 0, 0L, 0, false, 0, 0, (iu30) null, (lee1) null, x340Var2, 6, 0, 262142);
                        x340Var2.r(true);
                        x340Var2.r(false);
                    } else if (cmf0Var instanceof fmf0) {
                        x340Var2.i0(1364753085);
                        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode2 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM2 = x340Var2.m();
                        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarD2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var2, lljVar4);
                        nko1.H(xos0VarM2, x340Var2, lljVar3);
                        x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                        nko1.H(qim0VarE2, x340Var2, lljVar);
                        r9e1.a("Lyrics not available", (qim0) null, 0L, 0L, (FontWeight) null, 0L, 0, 0L, 0, false, 0, 0, (iu30) null, (lee1) null, x340Var2, 6, 0, 262142);
                        x340Var2.r(true);
                        x340Var2.r(false);
                    } else if (cmf0Var instanceof dmf0) {
                        x340Var2.i0(1364930684);
                        qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                        gfh0 gfh0VarC3 = t1c.c(graVar, false);
                        int iHashCode3 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM3 = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarD3);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var2, lljVar4);
                        nko1.H(xos0VarM3, x340Var2, lljVar3);
                        x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                        nko1.H(qim0VarE3, x340Var2, lljVar);
                        r9e1.a("Could not load lyrics", (qim0) null, 0L, 0L, (FontWeight) null, 0L, 0, 0L, 0, false, 0, 0, (iu30) null, (lee1) null, x340Var2, 6, 0, 262142);
                        x340Var2.r(true);
                        x340Var2.r(false);
                    } else {
                        if (!(cmf0Var instanceof cmf0)) {
                            throw p3d1.k(x340Var2, 44016791, false);
                        }
                        x340Var2.i0(1365128588);
                        d9y0.i(cmf0Var.a.a.a, qtf0Var.c, qtf0Var.d, qtf0Var.X.c, qtf0Var.f, qtf0Var.g, qtf0Var.h, qtf0Var.i, qtf0Var.t, (Flowable) obj5, (yqg) obj4, (iu30) obj3, x340Var2, 0);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                jzf0 jzf0Var = (jzf0) obj5;
                m4c m4cVar = fkj0.X;
                v0g0 v0g0Var = (v0g0) obj6;
                m0g0 m0g0Var = (m0g0) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    df41 df41Var = p0g0.e;
                    boolean zG = x340Var4.g(v0g0Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == m4cVar) {
                        objT = new tzf0(v0g0Var, (byte) 1);
                        x340Var4.s0(objT);
                    }
                    p0g0 p0g0Var = (p0g0) k5p1.u(objArr, df41Var, (Function0) objT, x340Var4, 0);
                    boolean zG2 = x340Var4.g(p0g0Var) | x340Var4.g(v0g0Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new tfe0(p0g0Var, v0g0Var, (lnm) null, (byte) 13);
                        x340Var4.s0(objT2);
                    }
                    qxd0.t(v0g0Var, x340Var4, (vu30) objT2);
                    y9g1.g(p0g0Var, apo.r(8503429, new h6a0((j0g0) obj3, p0g0Var, (byte) 22), x340Var4), x340Var4, 48);
                    Object objT3 = x340Var4.T();
                    if (objT3 == m4cVar) {
                        l7p0 l7p0Var = new l7p0(m0g0Var.b.c.incrementAndGet());
                        x340Var4.s0(l7p0Var);
                        objT3 = l7p0Var;
                    }
                    l7p0 l7p0Var2 = (l7p0) objT3;
                    Boolean boolValueOf = Boolean.valueOf(jzf0Var.a);
                    boolean zI = x340Var4.i(jzf0Var) | x340Var4.g(m0g0Var) | x340Var4.i(l7p0Var2);
                    Object objT4 = x340Var4.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new az80(jzf0Var, m0g0Var, l7p0Var2, (lnm) null, (byte) 14);
                        x340Var4.s0(objT4);
                    }
                    qxd0.t(boolValueOf, x340Var4, (vu30) objT4);
                    boolean zG3 = x340Var4.g(m0g0Var) | x340Var4.i(l7p0Var2);
                    Object objT5 = x340Var4.T();
                    if (zG3 || objT5 == m4cVar) {
                        objT5 = new j2d0(m0g0Var, l7p0Var2, (byte) 20);
                        x340Var4.s0(objT5);
                    }
                    qxd0.i(rih1Var, (iu30) objT5, x340Var4);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dzf0 dzf0Var = (dzf0) rwq.h((zob1) obj6, x340Var6, 0).getValue();
                    if (dzf0Var == null) {
                        x340Var6.i0(-994242832);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-994242831);
                        qim0 qim0Var = (qim0) obj3;
                        String str = (String) obj5;
                        vzq0 vzq0Var = (vzq0) obj4;
                        Object[] objArr2 = {dzf0Var};
                        boolean zI2 = x340Var6.i(dzf0Var);
                        Object objT6 = x340Var6.T();
                        if (zI2 || objT6 == m4cVar2) {
                            objT6 = new fzf0(dzf0Var, (byte) 1);
                            x340Var6.s0(objT6);
                        }
                        ven0 ven0Var = (ven0) k5p1.s(objArr2, (Function0) objT6, x340Var6, 0);
                        boolean zI3 = x340Var6.i(dzf0Var) | x340Var6.g(ven0Var);
                        Object objT7 = x340Var6.T();
                        if (zI3 || objT7 == m4cVar2) {
                            objT7 = new ezf0(dzf0Var, ven0Var, (lnm) null, (byte) 1);
                            x340Var6.s0(objT7);
                        }
                        qxd0.t(dzf0Var, x340Var6, (vu30) objT7);
                        gfh0 gfh0VarC4 = t1c.c(een.d, false);
                        int iHashCode4 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM4 = x340Var6.m();
                        qim0 qim0VarE4 = zr7.E(x340Var6, qim0Var);
                        hzj.A.getClass();
                        if (x340Var6.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(gfh0VarC4, x340Var6, y580.O0);
                        nko1.H(xos0VarM4, x340Var6, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode4), x340Var6, y580.R0);
                        nko1.F(x340Var6);
                        nko1.H(qim0VarE4, x340Var6, y580.Y);
                        Boolean bool = (Boolean) ven0Var.getValue();
                        if (bool == null) {
                            x340Var6.i0(-164547188);
                            z = false;
                            x340Var6.r(false);
                        } else {
                            z = false;
                            x340Var6.i0(-164547187);
                            cgj1.c(str, dzf0Var, bool.booleanValue(), vzq0Var, (qim0) null, x340Var6, 0);
                            x340Var6.r(false);
                        }
                        x340Var6.r(true);
                        x340Var6.r(z);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var7 = (b0k) obj;
                xhl xhlVar = (xhl) obj5;
                u1g0 u1g0Var = (u1g0) obj3;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    x340 x340Var8 = x340Var7;
                    if (x340Var8.H()) {
                        x340Var8.b0();
                        return rih1Var;
                    }
                }
                ((ven0) obj6).setValue(rih1Var);
                int i2 = ((uhl) xhlVar).b;
                xhlVar.m();
                x340 x340Var9 = x340Var7;
                x340Var9.i0(2101879298);
                xhl xhlVar2 = (xhl) xhlVar.l().b;
                ihl ihlVarK = xhlVar2.k();
                ihl ihlVarK2 = xhlVar2.k();
                ihl ihlVarK3 = xhlVar2.k();
                ihl ihlVarK4 = xhlVar2.k();
                ihl ihlVarK5 = xhlVar2.k();
                ihl ihlVarK6 = xhlVar2.k();
                ihl ihlVarK7 = xhlVar2.k();
                ihl ihlVarK8 = xhlVar2.k();
                ihl ihlVarK9 = xhlVar2.k();
                ihl ihlVarK10 = xhlVar2.k();
                ihl ihlVarK11 = xhlVar2.k();
                ihl ihlVarK12 = xhlVar2.k();
                ihl ihlVarK13 = xhlVar2.k();
                ihl ihlVarK14 = xhlVar2.k();
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarE5 = yoo1.E(nim0Var, lhc.g(x340Var9).g);
                Object objT8 = x340Var9.T();
                Object obj7 = fkj0.X;
                if (objT8 == obj7) {
                    objT8 = dvf0.T0;
                    x340Var9.s0(objT8);
                }
                op71.g(x340Var9, xhl.j(qim0VarE5, ihlVarK, (iu30) objT8));
                qim0 qim0VarE6 = yoo1.E(nim0Var, lhc.g(x340Var9).g);
                boolean zI4 = x340Var9.i(xhlVar) | x340Var9.g(ihlVarK) | x340Var9.g(ihlVarK4);
                Object objT9 = x340Var9.T();
                if (zI4 || objT9 == obj7) {
                    objT9 = new x1g0(xhlVar, ihlVarK, ihlVarK4, (byte) 2);
                    x340Var9.s0(objT9);
                }
                op71.g(x340Var9, xhl.j(qim0VarE6, ihlVarK5, (iu30) objT9));
                qim0 qim0VarD4 = yoo1.D(nim0Var, lhc.g(x340Var9).g);
                Object objT10 = x340Var9.T();
                if (objT10 == obj7) {
                    objT10 = dvf0.V0;
                    x340Var9.s0(objT10);
                }
                op71.g(x340Var9, xhl.j(qim0VarD4, ihlVarK2, (iu30) objT10));
                qim0 qim0VarD5 = yoo1.D(nim0Var, lhc.g(x340Var9).c);
                Object objT11 = x340Var9.T();
                if (objT11 == obj7) {
                    objT11 = dvf0.W0;
                    x340Var9.s0(objT11);
                }
                op71.g(x340Var9, xhl.j(qim0VarD5, ihlVarK3, (iu30) objT11));
                Object objT12 = x340Var9.T();
                if (objT12 == obj7) {
                    objT12 = dvf0.X0;
                    x340Var9.s0(objT12);
                }
                fj30.a(u1g0Var, xhl.j(nim0Var, ihlVarK4, (iu30) objT12), x340Var9, 0);
                boolean zG4 = x340Var9.g(ihlVarK5);
                Object objT13 = x340Var9.T();
                if (zG4 || objT13 == obj7) {
                    objT13 = new pu(ihlVarK5, (byte) 18);
                    x340Var9.s0(objT13);
                }
                fj30.g(u1g0Var, xhl.j(nim0Var, ihlVarK6, (iu30) objT13), x340Var9, 0);
                boolean zI5 = x340Var9.i(xhlVar) | x340Var9.g(ihlVarK8) | x340Var9.g(ihlVarK11);
                Object objT14 = x340Var9.T();
                if (zI5 || objT14 == obj7) {
                    objT14 = new x1g0(xhlVar, ihlVarK8, ihlVarK11, (byte) 3);
                    x340Var9.s0(objT14);
                }
                qim0 qim0VarJ = xhl.j(nim0Var, ihlVarK7, (iu30) objT14);
                boolean zG5 = x340Var9.g(u1g0Var);
                Object objT15 = x340Var9.T();
                if (zG5 || objT15 == obj7) {
                    objT15 = new w1g0(u1g0Var, (byte) 1);
                    x340Var9.s0(objT15);
                }
                op71.g(x340Var9, ern1.x(qim0VarJ, (iu30) objT15));
                boolean zI6 = x340Var9.i(xhlVar) | x340Var9.g(ihlVarK9) | x340Var9.g(ihlVarK10) | x340Var9.g(ihlVarK12) | x340Var9.g(ihlVarK2);
                Object objT16 = x340Var9.T();
                if (zI6 || objT16 == obj7) {
                    objT16 = new tjf0(xhlVar, ihlVarK9, ihlVarK10, ihlVarK12, ihlVarK2, (byte) 1);
                    ihlVar = ihlVarK2;
                    x340Var9.s0(objT16);
                } else {
                    ihlVar = ihlVarK2;
                }
                qim0 qim0VarJ2 = xhl.j(nim0Var, ihlVarK8, (iu30) objT16);
                boolean zG6 = x340Var9.g(u1g0Var);
                Object objT17 = x340Var9.T();
                if (zG6 || objT17 == obj7) {
                    objT17 = new w1g0(u1g0Var, (byte) 0);
                    x340Var9.s0(objT17);
                }
                qim0 qim0VarX = ern1.x(qim0VarJ2, (iu30) objT17);
                Object objT18 = x340Var9.T();
                if (objT18 == obj7) {
                    objT18 = mia.o;
                    x340Var9.s0(objT18);
                }
                t1c.a(lrn1.x(f8d1.b(qim0VarX, rih1Var, (PointerInputEventHandler) objT18), 0.9f), x340Var9, 0);
                boolean zI7 = x340Var9.i(xhlVar) | x340Var9.g(ihlVarK3) | x340Var9.g(ihlVar) | x340Var9.g(ihlVarK8);
                Object objT19 = x340Var9.T();
                if (zI7 || objT19 == obj7) {
                    objT19 = new x1g0(xhlVar, ihlVarK3, ihlVar, ihlVarK8);
                    x340Var9.s0(objT19);
                }
                fj30.n(u1g0Var, xhl.j(nim0Var, ihlVarK14, (iu30) objT19), x340Var9, 0);
                boolean zG7 = x340Var9.g(ihlVarK10);
                Object objT20 = x340Var9.T();
                if (zG7 || objT20 == obj7) {
                    objT20 = new pu(ihlVarK10, (byte) 16);
                    x340Var9.s0(objT20);
                }
                fj30.i(u1g0Var, xhl.j(nim0Var, ihlVarK9, (iu30) objT20), x340Var9, 0);
                boolean zI8 = x340Var9.i(xhlVar) | x340Var9.g(ihlVarK12) | x340Var9.g(ihlVar);
                Object objT21 = x340Var9.T();
                if (zI8 || objT21 == obj7) {
                    objT21 = new x1g0(xhlVar, ihlVarK12, ihlVar, (byte) 1);
                    x340Var9.s0(objT21);
                }
                fj30.h(u1g0Var, xhl.j(nim0Var, ihlVarK10, (iu30) objT21), x340Var9, 0);
                fj30.b(xhlVar, ihlVarK11, ihlVarK8, ihlVarK10, ihlVarK12, x340Var9, 8);
                Object objT22 = x340Var9.T();
                if (objT22 == obj7) {
                    objT22 = dvf0.U0;
                    x340Var9.s0(objT22);
                }
                fj30.e(u1g0Var, xhl.j(nim0Var, ihlVarK12, (iu30) objT22), x340Var9, 0);
                boolean zG8 = x340Var9.g(ihlVarK5);
                Object objT23 = x340Var9.T();
                if (zG8 || objT23 == obj7) {
                    objT23 = new pu(ihlVarK5, (byte) 17);
                    x340Var9.s0(objT23);
                }
                fj30.j(u1g0Var, xhl.j(nim0Var, ihlVarK13, (iu30) objT23), x340Var9, 0);
                x340Var9.r(false);
                if (((uhl) xhlVar).b == i2) {
                    return rih1Var;
                }
                qxd0.S((su) obj4, x340Var9);
                return rih1Var;
            case 6:
                x340 x340Var10 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nlg0 nlg0Var = (nlg0) obj3;
                    irn1.e((bv40) obj6, (d0r) obj5, (mjm) obj4, nlg0Var.a, nlg0Var.b, nlg0Var.c.q(), x340Var11, 0);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var12 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    gmg0 gmg0Var = (gmg0) obj3;
                    lrn1.d((bv40) obj6, (d0r) obj5, (njm) obj4, gmg0Var.a, gmg0Var.g, gmg0Var.h.intValue(), x340Var13, 0);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var14 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                uyg0 uyg0Var = (uyg0) obj5;
                ezg0 ezg0Var = (ezg0) obj6;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    o3r o3rVar = ezg0.S0;
                    gzg0 gzg0Var = uyg0Var.e;
                    if (!ezg0Var.h()) {
                        gzg0Var = null;
                    }
                    tra0 tra0Var = ezg0Var.h;
                    Object objT24 = x340Var15.T();
                    Object obj8 = fkj0.X;
                    if (objT24 == obj8) {
                        objT24 = v8r.q(Boolean.FALSE);
                        x340Var15.s0(objT24);
                    }
                    ven0 ven0Var2 = (ven0) objT24;
                    Object objT25 = x340Var15.T();
                    if (objT25 == obj8) {
                        objT25 = v8r.q((Object) null);
                        x340Var15.s0(objT25);
                    }
                    ven0 ven0Var3 = (ven0) objT25;
                    if (ezg0Var.c.s()) {
                        x340Var15.i0(1272025655);
                        z2 = !((Boolean) h7w.y(x340Var15).getValue()).booleanValue();
                        x340Var15.r(false);
                    } else {
                        x340Var15.i0(778090878);
                        x340Var15.r(false);
                        z2 = false;
                    }
                    boolean zP = too1.p((jre) rwq.h(ezg0Var.i.s, x340Var15, 0).getValue());
                    boolean zH = x340Var15.h(z2) | x340Var15.h(zP) | x340Var15.i(ven0Var2);
                    Object objT26 = x340Var15.T();
                    if (zH || objT26 == obj8) {
                        objT26 = new dzg0(z2, zP, ven0Var2);
                        x340Var15.s0(objT26);
                    }
                    qxd0.S((Function0) objT26, x340Var15);
                    if (z2) {
                        x340Var15.i0(778417840);
                        boolean zG9 = x340Var15.g(tra0Var);
                        Object objT27 = x340Var15.T();
                        if (zG9 || objT27 == obj8) {
                            objT27 = tra0Var.a(ezg0Var.e, new c470(ven0Var2, (byte) 19));
                            x340Var15.s0(objT27);
                        }
                        wra0 wra0Var = (wra0) objT27;
                        boolean z3 = ((Boolean) ven0Var2.getValue()).booleanValue() && !zP;
                        rq2 rq2Var = gzg0Var != null ? rq2.GENPODS_PROMPT_CHAT : rq2.NPV_MARTINI_CHAT;
                        String str2 = gzg0Var != null ? "genpods_prompt_chat" : "npv_martini_chat";
                        if (uyg0Var.c) {
                            i = 2;
                        } else {
                            i = uyg0Var.d ? 3 : 4;
                        }
                        otw.c(wra0Var, new ura0(z3, rq2Var, str2, i, (String) ven0Var3.getValue(), gzg0Var != null ? gzg0Var.b : null, gzg0Var != null ? gzg0Var.b : "spotify:internal:npv-mini-chat", 128), (qim0) null, (ipb1) null, x340Var15, 0, 12);
                        x340Var15.r(false);
                    } else {
                        x340Var15.i0(779610441);
                        x340Var15.r(false);
                    }
                    boolean zI9 = x340Var15.i(ven0Var3) | x340Var15.i(ven0Var2);
                    Object objT28 = x340Var15.T();
                    if (zI9 || objT28 == obj8) {
                        objT28 = new xs3(ven0Var3, ven0Var2, (byte) 10);
                        x340Var15.s0(objT28);
                    }
                    ezg0Var.f((ksw) obj4, uyg0Var, (iu30) objT28, (iu30) obj3, x340Var15, 0);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var16 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                c9n c9nVar = (c9n) obj4;
                Function0 function0 = (Function0) obj5;
                ryx ryxVar = (ryx) obj6;
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ldx ldxVar = ldx.c;
                    gdx gdxVarS = yla.s(x340Var17);
                    boolean zI10 = x340Var17.i(ryxVar) | x340Var17.g(function0) | x340Var17.i(c9nVar);
                    Object objT29 = x340Var17.T();
                    if (zI10 || objT29 == fkj0.X) {
                        objT29 = new y3f(ryxVar, function0, c9nVar, (byte) 1);
                        x340Var17.s0(objT29);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT29), ldxVar, null, null, gdxVarS, null, false, null, null, apo.r(-1746917630, new mbf0((bbh0) obj3, (byte) 25), x340Var17), x340Var17, 12582960, 6, 860);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                r4o1.c((String) obj6, (ItemAlternative) obj5, (String) obj4, (p410) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var18 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                znb0 znb0Var = (znb0) obj6;
                x340 x340Var19 = x340Var18;
                if (!x340Var19.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x340Var19.b0();
                } else if (znb0Var == null) {
                    x340Var19.i0(391189791);
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(391189792);
                    otw.c((maa) znb0Var.getValue(), rpo1.w(((hob1) obj5).m, (i091) obj4, (iu30) obj3, x340Var19, 0), (qim0) null, (ipb1) null, x340Var19, 0, 12);
                    x340Var19.r(false);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var20 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    wdi0 wdi0Var = (wdi0) obj6;
                    odi0 odi0Var = (odi0) obj5;
                    iu30 iu30Var = (iu30) obj4;
                    fns fnsVar = (fns) obj3;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var21, 0);
                    int iHashCode5 = Long.hashCode(x340Var21.T);
                    xos0 xos0VarM5 = x340Var21.m();
                    qim0 qim0VarE7 = zr7.E(x340Var21, nim0Var);
                    hzj.A.getClass();
                    if (x340Var21.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var21.m0();
                    if (x340Var21.S) {
                        x340Var21.l(n4kVar);
                    } else {
                        x340Var21.v0();
                    }
                    nko1.H(mbhVarA, x340Var21, y580.O0);
                    nko1.H(xos0VarM5, x340Var21, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var21, y580.R0);
                    nko1.F(x340Var21);
                    nko1.H(qim0VarE7, x340Var21, y580.Y);
                    wdi0Var.c.a(odi0Var.b, x340Var21, 0);
                    j2i j2iVarR = apo.r(-2072601564, new q0g0(wdi0Var, odi0Var, (byte) 21), x340Var21);
                    boolean zG10 = x340Var21.g(iu30Var);
                    Object objT30 = x340Var21.T();
                    if (zG10 || objT30 == m4cVar3) {
                        objT30 = new edi0(iu30Var, (byte) 4);
                        x340Var21.s0(objT30);
                    }
                    Function0 function1 = (Function0) objT30;
                    boolean zG11 = x340Var21.g(iu30Var);
                    Object objT31 = x340Var21.T();
                    if (zG11 || objT31 == m4cVar3) {
                        objT31 = new edi0(iu30Var, (byte) 5);
                        x340Var21.s0(objT31);
                    }
                    Function0 function2 = (Function0) objT31;
                    boolean zG12 = x340Var21.g(iu30Var);
                    Object objT32 = x340Var21.T();
                    if (zG12 || objT32 == m4cVar3) {
                        objT32 = new edi0(iu30Var, (byte) 6);
                        x340Var21.s0(objT32);
                    }
                    wpo1.e(odi0Var, j2iVarR, function1, function2, (Function0) objT32, fnsVar, null, x340Var21, 48);
                    x340Var21.r(true);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 13:
                mey0 mey0Var = (mey0) obj;
                t810 t810Var = (t810) obj2;
                thi0 thi0Var = (thi0) obj5;
                return lro1.x(mey0Var, t810Var, lro1.n(t810Var.a, mey0Var), (yqg) obj6, thi0Var.c, (ytp0) obj4, (hvp0) obj3, new shi0(mey0Var, thi0Var, (byte) 1), thi0Var.a);
            case 14:
                mey0 mey0Var2 = (mey0) obj;
                cii0 cii0Var = (cii0) obj2;
                gii0 gii0Var = (gii0) obj5;
                return lro1.x(mey0Var2, cii0Var.a, cii0Var.b, (yqg) obj6, gii0Var.a, (ytp0) obj4, (hvp0) obj3, new dvg0(mey0Var2, gii0Var, (byte) 8), gii0Var.f);
            case 15:
                ((Number) obj2).intValue();
                eqr0.h((iu30) obj6, (yrg0) obj5, (qim0) obj3, (p091) obj4, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                jto1.g((Function0) obj6, (j2i) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(433));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                cuo1.r((zri0) obj6, (iu30) obj5, (iu30) obj4, (vu30) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ouo1.n((String) obj6, (gbx) obj5, (yf) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                m0p1.k((MicPermissionPageResponse) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                ((r4k0) obj6).i((fy00) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                x340 x340Var22 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fq7.g(u890.j(((zgk0) obj6).e, utb1.a), (qim0) null, xay.g(0.0f, 6, 0L, irn1.l0(0.0f, 400.0f, null, 5)), (ln00) null, (String) null, apo.r(72281488, new iwf0((pek0) obj5, (iu30) obj4, (hdn0) obj3, b2), x340Var23), x340Var23, 196992, 26);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((sek0) obj6).e((Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                t3p1.o((kkk0) obj6, (iu30) obj5, (xsk) obj4, (hvj0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                return a(obj, obj2);
            case 25:
                return d(obj, obj2);
            case 26:
                return e(obj, obj2);
            case 27:
                return f(obj, obj2);
            case 28:
                return g(obj, obj2);
            default:
                ((Number) obj2).intValue();
                j0o1.l((hux) obj6, (String) obj5, (String) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0f0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0f0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0f0(qim0 qim0Var, iu30 iu30Var, zkn0 zkn0Var, tob1 tob1Var) {
        super(2);
        this.a = (byte) 27;
        this.b = qim0Var;
        this.c = iu30Var;
        this.d = zkn0Var;
        this.e = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0f0(mpn0 mpn0Var, qim0 qim0Var, Function0 function0, Function0 function1, int i) {
        super(2);
        this.a = (byte) 28;
        this.c = mpn0Var;
        this.b = qim0Var;
        this.d = function0;
        this.e = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0f0(zob1 zob1Var, qim0 qim0Var, String str, vzq0 vzq0Var) {
        super(2);
        this.a = (byte) 4;
        this.c = zob1Var;
        this.b = qim0Var;
        this.d = str;
        this.e = vzq0Var;
    }
}
