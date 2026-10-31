package p;

import com.spotify.common.uri.SpotifyUriParserException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fv01 {
    public final ytp0 a;
    public final kdy0 b;
    public final kls0 c;
    public final dp5 d;

    public fv01(ytp0 ytp0Var, kdy0 kdy0Var, kls0 kls0Var, dp5 dp5Var) {
        this.a = ytp0Var;
        this.b = kdy0Var;
        this.c = kls0Var;
        this.d = dp5Var;
    }

    public static String d(au01 au01Var, int i) {
        if (au01Var instanceof xt01) {
            return ab80.n("heading_", "_", i, ((xt01) au01Var).a.a);
        }
        if (au01Var instanceof wt01) {
            return ab80.n("context_", "_", i, ((wt01) au01Var).a.a);
        }
        if (au01Var instanceof zt01) {
            return ab80.n("sub_", "_", i, ((zt01) au01Var).a.a);
        }
        if (au01Var instanceof yt01) {
            return f4i1.c(i, "loading_");
        }
        eg.o();
        return null;
    }

    public final void a(au01 au01Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1659357606);
        int i2 = (x340Var.g(au01Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = au01Var instanceof xt01;
            kdy0 kdy0Var = this.b;
            if (z) {
                x340Var.i0(1209796603);
                otw.c((cx0) kdy0Var.e, ((xt01) au01Var).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else if (au01Var instanceof wt01) {
                x340Var.i0(1209801342);
                otw.c((rwj) kdy0Var.c, ((wt01) au01Var).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else if (au01Var instanceof zt01) {
                x340Var.i0(1209806042);
                otw.c((et90) kdy0Var.d, ((zt01) au01Var).a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                if (!(au01Var instanceof yt01)) {
                    throw p3d1.k(x340Var, 1209794823, false);
                }
                x340Var.i0(1209810751);
                otw.c((nu) kdy0Var.b, nu01.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ev01(this, au01Var, i);
        }
    }

    public final void b(c380 c380Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1748525590);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zG = x340Var.g(xtb0VarA) | x340Var.i(this);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new b201(xtb0VarA, this, (lnm) null, (byte) 16);
                x340Var.s0(objT);
            }
            qxd0.t(xtb0VarA, x340Var, (vu30) objT);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarO = td6.o(lhc.g(x340Var).g, 32, nim0.a);
            boolean zI = x340Var.i(this) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new nt01(c380Var, this, (byte) 1);
                x340Var.s0(objT2);
            }
            ujo1.d(qim0VarO, xtb0VarA, (vzq0) null, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT2, x340Var, 0, 508);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, c380Var, i, (byte) 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:106:0x0200  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01df  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final void c(zu01 zu01Var, b0k b0kVar, int i) {
        byte b;
        b0k b0kVar2;
        Optional optionalEmpty;
        ?? r10;
        boolean z;
        ytp0 ytp0Var;
        au01 au01VarF;
        au01 xt01Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-479898526);
        int i2 = (b0kVar3.i(zu01Var) ? 4 : 2) | i | (b0kVar3.i(this) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            b0kVar2 = b0kVar3;
            boolean z2 = true;
            bzn1.e((qim0) null, ecj.a, false, (vu30) null, rgr0.a, (ngr0) null, (ygr0) null, (Function0) null, b0kVar2, 48, 237);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            otw.c(this.c, new dt01(zu01Var.e, zu01Var.f, mqo1.A(zu01Var.j)), uyn1.B(qim0VarF, 12.0f, 0.0f, 0.0f, 4.0f, 6), (ipb1) null, b0kVar2, 0, 8);
            List list = zu01Var.a;
            int i3 = zu01Var.c;
            List<ut01> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof tt01) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            for (ut01 ut01Var : list2) {
                if (ut01Var instanceof ut01) {
                    xt01Var = new xt01(new et01(ut01Var.a));
                } else {
                    if (!(ut01Var instanceof tt01)) {
                        eg.o();
                        return;
                    }
                    cr01 cr01Var = ((tt01) ut01Var).a;
                    String str = cr01Var.b;
                    try {
                        optionalEmpty = Optional.of(new y6b1(str, z2));
                    } catch (SpotifyUriParserException unused) {
                        optionalEmpty = Optional.empty();
                    }
                    y6b1 y6b1Var = (y6b1) optionalEmpty.orElse(null);
                    String str2 = cr01Var.z;
                    if (str2 == null) {
                        String string = y6b1Var != null ? y6b1Var.c().toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        str = str2;
                    }
                    v6b1 v6b1Var = y6b1Var != null ? y6b1Var.c : null;
                    int i4 = v6b1Var == null ? -1 : bu01.a[v6b1Var.ordinal()];
                    if (i4 == z2 || i4 == 2) {
                        r10 = 4;
                    } else if (i4 != 3 && i4 != 4) {
                        switch (i4) {
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                r10 = 5;
                                break;
                            case 18:
                            case 19:
                            case 20:
                                r10 = 6;
                                break;
                            case 21:
                                if (!cr01Var.o.contains(m9m.b)) {
                                    r10 = 2;
                                    break;
                                }
                            default:
                                r10 = z2;
                                break;
                        }
                    } else {
                        r10 = 3;
                    }
                    boolean z3 = cr01Var.e == br01.c;
                    v6b1 v6b1Var2 = y6b1Var != null ? y6b1Var.c : null;
                    int i5 = v6b1Var2 == null ? -1 : bu01.a[v6b1Var2.ordinal()];
                    if (i5 != 5 && i5 != 6) {
                        if (i5 != 7 && i5 != 21) {
                            z = false;
                        }
                        ytp0Var = this.a;
                        if (z3) {
                            if (hxo1.s(cr01Var)) {
                                au01VarF = ytp0Var.F(cr01Var, (int) r10, str);
                            } else {
                                au01VarF = ytp0Var.G(cr01Var, (int) r10, str);
                            }
                        } else if (z) {
                            au01VarF = ytp0Var.F(cr01Var, (int) r10, str);
                        } else if (u890.j(cr01Var.i, "group_id_0") || hxo1.s(cr01Var)) {
                            au01VarF = ytp0Var.G(cr01Var, (int) r10, str);
                        } else {
                            au01VarF = ytp0Var.F(cr01Var, (int) r10, str);
                        }
                        xt01Var = au01VarF;
                    }
                    z = true;
                    ytp0Var = this.a;
                    if (z3) {
                        if (hxo1.s(cr01Var)) {
                            au01VarF = ytp0Var.F(cr01Var, (int) r10, str);
                        } else {
                            au01VarF = ytp0Var.G(cr01Var, (int) r10, str);
                        }
                    } else if (z) {
                        au01VarF = ytp0Var.F(cr01Var, (int) r10, str);
                    } else if (u890.j(cr01Var.i, "group_id_0")) {
                        au01VarF = ytp0Var.G(cr01Var, (int) r10, str);
                    } else {
                        au01VarF = ytp0Var.G(cr01Var, (int) r10, str);
                    }
                    xt01Var = au01VarF;
                }
                arrayList2.add(xt01Var);
                z2 = true;
            }
            b = 7;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            if (size < i3 && !arrayList3.isEmpty()) {
                arrayList3.add(new yt01());
            }
            b(mqo1.A(arrayList3), b0kVar2, i2 & 112);
            b0kVar2.r(true);
        } else {
            b = 7;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l04(this, zu01Var, i, b);
        }
    }
}
