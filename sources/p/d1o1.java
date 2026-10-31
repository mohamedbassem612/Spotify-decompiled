package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class d1o1 {
    public static final ky4 a = new ky4(1000);
    public static final ky4 b;
    public static final ky4 c;
    public static b180 d;

    static {
        new ky4(1007);
        b = new ky4(1008);
        c = new ky4(1002);
    }

    public static final void a(qp5 qp5Var, Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-67177354);
        int i2 = (x340Var.g(qp5Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ((i8h1) qp5Var.c.getValue()).f(qp5Var.b.e(), (Set) null);
            String strO0 = cwl1.o0(x340Var, 2131952368);
            String strO1 = cwl1.o0(x340Var, 2131952366);
            String strO2 = cwl1.o0(x340Var, 2131952367);
            boolean z = (i2 & 14) == 4;
            int i3 = i2 & 112;
            boolean z2 = z | (i3 == 32);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new nx2(qp5Var, function0, (byte) 15);
                x340Var.s0(objT);
            }
            zgx zgxVar = new zgx(strO2, new gbx(z50.c, (Function0) objT));
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new lj2(function0, (byte) 5);
                x340Var.s0(objT2);
            }
            mqo1.d((Function0) objT2, null, null, strO0, strO1, zgxVar, null, x340Var, 262144, 70);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pp5(qp5Var, function0, i, (byte) 0);
        }
    }

    public static final void b(x6e1 x6e1Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2080741862);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(x6e1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w8p1.c(x6e1Var, j2iVar, x340Var, i2 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bsh(x6e1Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void c(r7e1 r7e1Var, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-579239002);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(r7e1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w8p1.d(r7e1Var, z, j2iVar, x340Var, i2 & 1022);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ash(r7e1Var, z, j2iVar, i, (byte) 1);
        }
    }

    public static final void d(nt70 nt70Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        float fE;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1303839294);
        int i2 = (b0kVar3.g(nt70Var) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            if (nt70Var.f25p) {
                b0kVar3.i0(1007972906);
                Object objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = ktd.o(0.0f, b0kVar3);
                }
                ven0 ven0Var = (ven0) objT;
                b0kVar2 = b0kVar3;
                w2g0.c((qim0) null, (tl3) null, apo.r(-1531405060, new nf0(ven0Var, (byte) 1), b0kVar3), b0kVar2, 3072, 7);
                fE = ((p3v) ven0Var.getValue()).a;
                b0kVar2.r(false);
            } else {
                b0kVar2 = b0kVar3;
                fE = z5c.e(b0kVar2, 1008032426, 2131165289, b0kVar2, false);
            }
            qim0 qim0VarN = anm1.N("header_action_row", u291.j(0.0f, dsa0.m(b0kVar2, 2131165597), 1, uyn1.z(fE + 16.0f, 0.0f, 2, nim0.a)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            b0kVar2.i0(-133514505);
            Iterator it = nt70Var.m.iterator();
            while (it.hasNext()) {
                b0k b0kVar4 = b0kVar2;
                otw.c((maa) it.next(), nt70Var.a, (qim0) null, (ipb1) null, b0kVar4, 0, 12);
                b0kVar2 = b0kVar4;
            }
            b0kVar2.r(false);
            op71.g(b0kVar2, new wnb0(1.0f, true));
            b0kVar2.i0(-133508841);
            Iterator it2 = o7h.T0(nt70Var.n).iterator();
            while (it2.hasNext()) {
                b0k b0kVar5 = b0kVar2;
                otw.c((maa) it2.next(), nt70Var.a, (qim0) null, (ipb1) null, b0kVar5, 0, 12);
                b0kVar2 = b0kVar5;
            }
            b0kVar2.r(false);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hv50(nt70Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void e(k9e k9eVar, v4b0 v4b0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i2;
        int i3;
        Function0 function0;
        boolean z;
        int i4;
        boolean z2;
        rih1 rih1Var;
        k9e k9eVar2 = k9eVar;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        m4c m4cVar = fkj0.X;
        ArrayList arrayList = k9eVar2.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1498160090);
        j06 j06Var = x340Var.a;
        int i5 = i | (x340Var.g(k9eVar2) ? 4 : 2) | (x340Var.i(v4b0Var) ? 32 : 16) | 384;
        if (x340Var.Y(i5 & 1, (i5 & 147) != 146)) {
            g7e g7eVar = (g7e) o7h.s0(arrayList);
            if (g7eVar == null || (i2 = g7eVar.c) == 0) {
                i2 = 1;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mmr0 mmr0VarR = eio1.r(x340Var, i2);
            qim0 qim0VarH = u291.h(qim0VarF, (((p3v) mmr0VarR.b).a * 2.0f) + ((p3v) mmr0VarR.a).a);
            int i6 = i5 & 14;
            boolean z3 = i6 == 4;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new hu90(k9eVar2, (byte) 23);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarH, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z4) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar3);
            nko1.H(xos0VarM, x340Var, lljVar2);
            nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            x340Var.i0(-119367769);
            int i7 = 0;
            for (int i8 = k9eVar2.c; i7 < i8; i8 = i8) {
                g7e g7eVar2 = (g7e) o7h.t0(i7, arrayList);
                if (g7eVar2 == null) {
                    x340Var.i0(473157915);
                    x340Var.r(false);
                    function0 = function1;
                    z = false;
                    i3 = i5;
                    z2 = true;
                    i4 = i6;
                    rih1Var = null;
                } else {
                    x340Var.i0(473157916);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    boolean zE = (i6 == 4) | x340Var.e(i7);
                    Object objT2 = x340Var.T();
                    if (zE || objT2 == m4cVar) {
                        objT2 = new ym(k9eVar2, i7, (byte) 15);
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarB2 = s161.b(wnb0Var, false, (iu30) objT2);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    i3 = i5;
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB2);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar3);
                    nko1.H(xos0VarM2, x340Var, lljVar2);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE2, x340Var, vu30Var);
                    function0 = function1;
                    z = false;
                    i4 = i6;
                    z2 = true;
                    otw.c(v4b0Var, g7eVar2, (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
                    x340Var.r(true);
                    x340Var.r(false);
                    rih1Var = rih1.a;
                }
                if (rih1Var == null) {
                    x340Var.i0(-538912488);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z2));
                } else {
                    x340Var.i0(-538926934);
                }
                x340Var.r(z);
                i7++;
                k9eVar2 = k9eVar;
                i6 = i4;
                function1 = function0;
                i5 = i3;
                vu30Var = vu30Var;
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb90(k9eVar, v4b0Var, qim0Var2, i, (byte) 15);
        }
    }

    public static final void f(r1q0 r1q0Var, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1138766090);
        int i2 = (x340Var.i(r1q0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            s1q0 s1q0VarA = vfe0.a(x340Var);
            if (s1q0VarA == null) {
                eg.m("Required value was null.");
                return;
            }
            x8c0 lifecycle = s1q0VarA.getLifecycle();
            boolean zG = x340Var.g(r1q0Var) | x340Var.g(lifecycle);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new u5o0(r1q0Var, lifecycle);
                x340Var.s0(objT);
            }
            u5o0 u5o0Var = (u5o0) objT;
            boolean zI = ((i2 & 112) == 32) | x340Var.i(r1q0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new s2n0(r1q0Var, function0, (byte) 18);
                x340Var.s0(objT2);
            }
            q3p1.b(0, 1, (Function0) objT2, x340Var, false);
            mod.b(vfe0.a.a(u5o0Var), j2iVar, x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(r1q0Var, function0, j2iVar, i, (byte) 5);
        }
    }

    public static final lht g(fhy0 fhy0Var) {
        switch (fhy0Var == null ? -1 : qhy0.b[fhy0Var.ordinal()]) {
            case 1:
                return mht.d;
            case 2:
                return mht.a;
            case 3:
                return mht.b;
            case 4:
                return mht.c;
            case 5:
                return mht.e;
            case 6:
                return mht.f;
            default:
                return mht.a;
        }
    }

    public static final float h(float f, float f2) {
        float fO = yoi1.o(f, 0.0f, 1.0f);
        float fO2 = yoi1.o(f2, 0.0f, 1.0f);
        if (fO <= fO2 || fO2 >= 1.0f) {
            return 0.0f;
        }
        return yoi1.o((fO - fO2) / (1.0f - fO2), 0.0f, 1.0f);
    }

    public static final String i(String str) {
        try {
            String strName = nne.a.name();
            strName.getClass();
            return s751.a.matcher(URLEncoder.encode(str, strName)).replaceAll("%20");
        } catch (UnsupportedEncodingException e) {
            eg.f(e);
            return null;
        }
    }

    public static final int j(xjr0 xjr0Var) {
        return (int) (xjr0Var.e == qqq0.a ? xjr0Var.g() & 4294967295L : xjr0Var.g() >> 32);
    }

    public static final String k(String str) {
        return str.replace('_', '-').toLowerCase(Locale.ROOT);
    }

    public static final First l(wxg0 wxg0Var) {
        return First.c(wxg0Var, Effects.a(new z0o1[0]));
    }

    public static final int m(zfy0 zfy0Var) {
        int i = zfy0Var == null ? -1 : qhy0.a[zfy0Var.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    public static final t4h1 n(vsp vspVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            jzo jzoVar = (jzo) vspVar.a.c;
            objT2 = new t4h1((oyb) jzoVar.n.get(), (oyj0) jzoVar.o.get(), c9nVar);
            x340Var.s0(objT2);
        }
        return (t4h1) objT2;
    }

    public static final js20 o(iu30 iu30Var, vu30 vu30Var, o8n o8nVar, iu30 iu30Var2) {
        qtr qtrVar = new qtr();
        iu30Var2.invoke(qtrVar);
        return new js20(iu30Var, new zmd0(vu30Var, iu30Var, (byte) 1), vu30Var, qtrVar, true, o8nVar, true);
    }

    public static final Next p(wxg0 wxg0Var, qxg0 qxg0Var) {
        ywg0 axg0Var;
        boolean z = wxg0Var.b;
        String str = wxg0Var.a;
        boolean z2 = qxg0Var instanceof pxg0;
        uwg0 uwg0Var = uwg0.c;
        if (z2) {
            wxg0 wxg0VarA = wxg0.a(wxg0Var, ((pxg0) qxg0Var).a, false, false, 6);
            return wxg0VarA.a.equalsIgnoreCase(nik1.z0.a) ? Next.i(wxg0VarA, Effects.a(new dxg0[]{dxg0.c})) : Next.i(wxg0VarA, Effects.a(new uwg0[]{uwg0Var}));
        }
        if (qxg0Var instanceof lxg0) {
            return str.equalsIgnoreCase(nik1.z0.a) ? Next.a(Effects.a(new vwg0[]{new vwg0(((lxg0) qxg0Var).a)})) : Next.j();
        }
        if (qxg0Var instanceof kxg0) {
            return Next.a(Effects.a(new xwg0[]{new xwg0("no marquee returned")}));
        }
        if (qxg0Var instanceof jxg0) {
            return Next.j();
        }
        if (qxg0Var instanceof mxg0) {
            return Next.h(wxg0.a(wxg0Var, (String) null, ((mxg0) qxg0Var).a, false, 5));
        }
        if (!(qxg0Var instanceof oxg0)) {
            if (qxg0Var instanceof nxg0) {
                String str2 = ((nxg0) qxg0Var).a;
                return str2 != null ? Next.a(Effects.a(new axg0[]{new axg0(str2)})) : Next.a(Effects.a(new xwg0[]{new xwg0("Failed to load Marquee metadata")}));
            }
            if (qxg0Var instanceof fxg0) {
                return Next.a(Effects.a(new uwg0[]{uwg0Var}));
            }
            if (qxg0Var instanceof gxg0) {
                return Next.h(wxg0.a(wxg0Var, (String) null, false, ((gxg0) qxg0Var).a, 3));
            }
            if (qxg0Var instanceof ixg0) {
                iug0 iug0Var = ((ixg0) qxg0Var).a;
                return rxg0.a[l1d.C(iug0Var.R0)] == 1 ? Next.a(Effects.a(new zwg0[]{new zwg0(iug0Var.Z, iug0Var.Y)})) : Next.j();
            }
            if (!(qxg0Var instanceof hxg0)) {
                eg.o();
                return null;
            }
            String message = ((hxg0) qxg0Var).a.getMessage();
            if (message == null) {
                message = "No error message";
            }
            return Next.a(Effects.a(new wwg0[]{new wwg0(message)}));
        }
        iug0 iug0Var2 = ((oxg0) qxg0Var).a;
        String str3 = iug0Var2.a;
        String str4 = iug0Var2.Y;
        String str5 = iug0Var2.Z;
        if (iug0Var2.R0 == 3) {
            axg0Var = new ywg0(str5, str4, iug0Var2.S0);
        } else {
            boolean z3 = wxg0Var.c;
            if (!z && str.equalsIgnoreCase(nik1.z0.a) && !z3) {
                axg0Var = new cxg0(iug0Var2);
            } else {
                if (!z && !z3) {
                    return Next.j();
                }
                axg0Var = new axg0(str3);
            }
        }
        xj61 xj61Var = new xj61();
        xj61Var.add(axg0Var);
        if (iug0Var2.T0) {
            xj61Var.add(new bxg0(str3, str5, str4));
        }
        return Next.a(cwl1.j(xj61Var));
    }

    public static ECParameterSpec q(vgn1 vgn1Var) throws NoSuchAlgorithmException {
        int iOrdinal = vgn1Var.ordinal();
        if (iOrdinal == 0) {
            return lcp1.a;
        }
        if (iOrdinal == 1) {
            return lcp1.b;
        }
        if (iOrdinal == 2) {
            return lcp1.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(vgn1Var.toString()));
    }

    public static byte[] r(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i2 = (bArr[i] & 128) == 128 ? 1 : 0;
        int i3 = length - i;
        byte[] bArr2 = new byte[i3 + i2];
        System.arraycopy(bArr, i, bArr2, i2, i3);
        return bArr2;
    }
}
