package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class xia1 {
    public static final /* synthetic */ mma0[] a = {new een0(xia1.class, "viewDensityIcon", "getViewDensityIcon(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/spotify/encore/icons/EncoreIcons;", 1)};
    public static final d261 b = new d261("ViewDensityIcon");

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(dia1 dia1Var, as3 as3Var, boolean z, iu30 iu30Var, qim0 qim0Var, boolean z2, boolean z3, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var;
        int i3;
        int i4;
        int i5;
        String strN0;
        boolean z4;
        int i6;
        int i7;
        Object eu91Var;
        boolean z5;
        dzo1 dzo1Var;
        qim0 qim0Var2;
        boolean z6;
        hux huxVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(523169369);
        if ((i & 6) == 0) {
            i2 = (x340Var2.e(dia1Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.e(as3Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var2.h(z3) ? 1048576 : 524288;
        }
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            switch (dia1Var.ordinal()) {
                case 0:
                    i3 = 2131964159;
                    break;
                case 1:
                    i3 = 2131964158;
                    break;
                case 2:
                    i3 = 2131964153;
                    break;
                case 3:
                    i3 = 2131964155;
                    break;
                case 4:
                    i3 = 2131964156;
                    break;
                case 5:
                    i3 = 2131964160;
                    break;
                case 6:
                    i3 = 2131964154;
                    break;
                case 7:
                    i3 = 2131964162;
                    break;
                case 8:
                    i3 = 2131964157;
                    break;
                case 9:
                    i3 = 2131964161;
                    break;
                default:
                    eg.o();
                    return;
            }
            String strO0 = cwl1.o0(x340Var2, i3);
            String strO1 = cwl1.o0(x340Var2, 2131964091);
            if (z) {
                strN0 = x0d.k(x340Var2, -697185139, 2131957321, x340Var2, false);
            } else if (z2) {
                x340Var2.i0(-697063309);
                x340Var2.r(false);
                strN0 = strO0;
            } else if (z3) {
                x340Var2.i0(-697003603);
                strN0 = cwl1.n0(2131957322, new Object[]{strO0, strO1}, x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-696834529);
                int iOrdinal = as3Var.ordinal();
                if (iOrdinal == 0) {
                    i4 = 254618812;
                    i5 = 2131957264;
                } else {
                    if (iOrdinal != 1) {
                        throw p3d1.k(x340Var2, 254617308, false);
                    }
                    i4 = 254621948;
                    i5 = 2131957305;
                }
                strN0 = cwl1.n0(2131957322, new Object[]{strO0, x0d.k(x340Var2, i4, i5, x340Var2, false)}, x340Var2);
                x340Var2.r(false);
            }
            String strO2 = cwl1.o0(x340Var2, 2131957317);
            int i8 = i2 & 7168;
            boolean z7 = i8 == 2048;
            Object objT = x340Var2.T();
            if (z7 || objT == m4cVar) {
                objT = new pba1(iu30Var, (byte) 6);
                x340Var2.s0(objT);
            }
            epo epoVar = new epo(strO2, (Function0) objT);
            if (z3) {
                x340Var2.i0(-696137184);
                z4 = false;
                x340Var2.r(false);
            } else {
                z4 = false;
                x340Var2.i0(-696072766);
                int iOrdinal2 = as3Var.ordinal();
                if (iOrdinal2 == 0) {
                    i6 = 254642267;
                    i7 = 2131957319;
                } else {
                    if (iOrdinal2 != 1) {
                        throw p3d1.k(x340Var2, 254640704, false);
                    }
                    i6 = 254645435;
                    i7 = 2131957318;
                }
                strO1 = x0d.k(x340Var2, i6, i7, x340Var2, false);
                x340Var2.r(false);
            }
            boolean z8 = i8 == 2048 ? true : z4;
            Object objT2 = x340Var2.T();
            if (z8 || objT2 == m4cVar) {
                objT2 = new pba1(iu30Var, (byte) 7);
                x340Var2.s0(objT2);
            }
            epo epoVar2 = new epo(strO1, (Function0) objT2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zG = x340Var2.g(strN0) | ((i2 & 458752) == 131072) | x340Var2.i(epoVar) | x340Var2.i(epoVar2);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == m4cVar) {
                z5 = false;
                eu91Var = new eu91(strN0, z2, epoVar, epoVar2, (byte) 1);
                x340Var2.s0(eu91Var);
            } else {
                eu91Var = objT3;
                z5 = false;
            }
            qim0 qim0VarN = anm1.N("sort_row_element_test_tag", s161.b(qim0VarF, true, (iu30) eu91Var));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
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
            boolean z9 = i8 == 2048 ? true : z5;
            Object objT4 = x340Var2.T();
            if (z9 || objT4 == m4cVar) {
                objT4 = new pba1(iu30Var, (byte) 3);
                x340Var2.s0(objT4);
            }
            dzo1 dzo1Var2 = z50.c;
            gbx gbxVar = new gbx(dzo1Var2, (Function0) objT4);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, ldxVar, anm1.N("sort_order_button_test_tag", uyn1.B(qim0Var3, 4.0f, 0.0f, 0.0f, 0.0f, 14)), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, hkj.a, (vu30) null, apo.r(-1798785732, new nl41(strO0, (byte) 20), x340Var2), x340Var2, 805306416, 48, 1496);
            x340Var = x340Var2;
            kk0.s(1.0f, true, x340Var);
            if (z) {
                x340Var.i0(-970590564);
                boolean z10 = i8 == 2048;
                Object objT5 = x340Var.T();
                if (z10 || objT5 == m4cVar) {
                    objT5 = new pba1(iu30Var, (byte) 4);
                    x340Var.s0(objT5);
                }
                dzo1Var = dzo1Var2;
                qim0Var2 = qim0Var3;
                foo1.c(new gbx(dzo1Var2, (Function0) objT5), ldxVar, anm1.N("edit_button_test_tag", qim0Var3), (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hkj.b, x340Var, 432, 48, 2008);
                x340Var = x340Var;
                z6 = false;
                x340Var.r(false);
            } else {
                dzo1Var = dzo1Var2;
                qim0Var2 = qim0Var3;
                z6 = false;
                x340Var.i0(-970237691);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(-969452027);
                x340Var.r(z6);
            } else {
                x340Var.i0(-970180465);
                if (z3) {
                    huxVar = qnx.c;
                } else {
                    int iOrdinal3 = as3Var.ordinal();
                    if (iOrdinal3 == 0) {
                        huxVar = nox.c;
                    } else {
                        if (iOrdinal3 != 1) {
                            eg.o();
                            return;
                        }
                        huxVar = qnx.c;
                    }
                }
                boolean z11 = i8 == 2048 ? true : z6;
                Object objT6 = x340Var.T();
                if (z11 || objT6 == m4cVar) {
                    objT6 = new pba1(iu30Var, (byte) 5);
                    x340Var.s0(objT6);
                }
                gbx gbxVar2 = new gbx(dzo1Var, (Function0) objT6);
                gdx gdxVarS2 = yla.s(x340Var);
                qim0 qim0VarN2 = anm1.N("view_density_button_test_tag", qim0Var2);
                boolean zI = x340Var.i(huxVar);
                Object objT7 = x340Var.T();
                if (zI || objT7 == m4cVar) {
                    objT7 = new dr91(huxVar, (byte) 23);
                    x340Var.s0(objT7);
                }
                x340 x340Var3 = x340Var;
                wro1.h(gbxVar2, ldxVar, s161.b(qim0VarN2, z6, (iu30) objT7), (max) null, gdxVarS2, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1457576358, new f90(huxVar, (byte) 17), x340Var), x340Var3, 48, 6, 984);
                x340Var = x340Var3;
                x340Var.r(z6);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w040(dia1Var, as3Var, z, iu30Var, qim0Var, z2, z3, i);
        }
    }
}
