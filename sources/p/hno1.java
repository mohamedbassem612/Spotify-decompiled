package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class hno1 {
    public static final Object a = new Object();
    public static b180 b;

    public static final void a(mb60 mb60Var, hjp hjpVar, kjp kjpVar, b0k b0kVar, int i) {
        gc60 gc60Var;
        String str = mb60Var.f;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1824117436);
        int i2 = i | (b0kVar2.i(mb60Var) ? 4 : 2) | (b0kVar2.i(hjpVar) ? 32 : 16) | (b0kVar2.i(kjpVar) ? 256 : 128);
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (b0kVar2.i(nim0Var) ? 2048 : 1024);
        byte b2 = 1;
        if (b0kVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = hjpVar.a();
                b0kVar2.s0(objT);
            }
            ob60 ob60Var = (ob60) objT;
            ipb1 ipb1VarC = wpb1.C("highlight_details_carousel_".concat(str), ob60Var, mb60Var, b0kVar2, 576 | ((i3 << 6) & 896), 8);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = kjpVar.a();
                b0kVar2.s0(objT2);
            }
            gc60 gc60Var2 = (gc60) objT2;
            boolean zG = b0kVar2.g(ipb1VarC);
            Object objT3 = b0kVar2.T();
            fc60 fc60Var = null;
            if (zG || objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                b0kVar2.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            boolean zI = b0kVar2.i(ven0Var) | b0kVar2.i(ipb1VarC);
            Object objT4 = b0kVar2.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new fz40(ipb1VarC, ven0Var, (byte) 20);
                b0kVar2.s0(objT4);
            }
            qxd0.i(ipb1VarC, (iu30) objT4, b0kVar2);
            int iN = omo1.n(mb60Var.e, (String) ven0Var.getValue(), mb60Var.a());
            Object objT0 = o7h.t0(iN, mb60Var.a());
            pb60 pb60Var = objT0 instanceof pb60 ? (pb60) objT0 : null;
            if (pb60Var != null) {
                gc60Var = gc60Var2;
                fc60Var = new fc60(pb60Var.b, mb60Var.d, mb60Var.c, iN, str, false);
            } else {
                gc60Var = gc60Var2;
            }
            b0kVar2 = b0kVar2;
            irn1.u(nim0Var, apo.r(1271117809, new ic60(fc60Var, gc60Var), b0kVar2), null, null, apo.r(-1447981077, new dc60(ob60Var, mb60Var, ipb1VarC, b2), b0kVar2), b0kVar2, ((i3 >> 9) & 14) | 24624, 12);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) mb60Var, (Object) hjpVar, (Object) kjpVar, i, (byte) 7);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1832743317);
        if (b0kVar3.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            b0kVar2 = b0kVar3;
            ioo1.c(u291.v(nim0.a, (uyn1.n(zzq0Var, (flb0) b0kVar3.k(t4k.n)) * 2.0f) + 144.0f), ngx.e, new ydx(2.0f, 12.0f, 8.0f, zzq0Var), null, null, null, null, null, null, egj.b, null, egj.c, egj.d, null, null, null, egj.e, b0kVar2, 805306880, 1573296, 58872);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 18);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(143814955);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            pi30 pi30VarO = bbp1.o(x340Var);
            Bundle bundleE = vhc.e(62, false, false, false, false, false);
            w8c0 w8c0Var = (w8c0) hso1.v(((iac0) x340Var.k(jfe0.a)).getLifecycle(), x340Var).getValue();
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = zqb0.h;
                x340Var.s0(objT);
            }
            m5n1.a(s0p0.class, qim0VarF, pi30VarO, bundleE, w8c0Var, (iu30) objT, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var, i, (byte) 14);
        }
    }

    public static final void d(a7s0 a7s0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-90383510);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(a7s0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = a7s0Var.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.z(0.0f, 8.0f, 1, nim0Var), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            uwo1.e(a7s0Var.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            String str2 = a7s0Var.c;
            Function0 function0 = a7s0Var.d;
            if (ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str2), function0);
            gdx gdxVarS = yla.s(x340Var);
            jdx jdxVar = jdx.c;
            cvx cvxVar3 = cbx.b(x340Var).b;
            foo1.c(gbxVar, jdxVar, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), null, gdxVarS, null, null, null, null, null, apo.r(1076742741, new nso0(a7s0Var, (byte) 22), x340Var), x340Var, 0, 48, 2008);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(a7s0Var, i, (byte) 18);
        }
    }

    public static final void e(int i, j2i j2iVar, b0k b0kVar) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-45465098);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = (x340Var.i(nim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j2r0(j2iVar, (byte) 12);
                x340Var.s0(objT);
            }
            ejo1.l(i2 & 14, 0, x340Var, (vu30) objT, nim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bf6(j2iVar, i, (byte) 8);
        }
    }

    public static qim0 f(qim0 qim0Var, ecx ecxVar) {
        return d7e.r(ecxVar.a, qim0Var, false);
    }

    public static final String g(long j, yqg yqgVar) {
        long jB = j - yqgVar.b();
        if (jB <= 0) {
            return "0:00:00";
        }
        return String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jB / 3600000), Long.valueOf((jB % 3600000) / 60000), Long.valueOf((jB % 60000) / 1000)}, 3));
    }

    public static final boolean h(int i, int i2) {
        return i == i2;
    }

    public static final mr20 i(uu00 uu00Var, String str, String str2) {
        String strF = fno1.f(str2);
        if (strF == null) {
            Logger.k("ChapteredContentResolver: Could not build chaptered content list URI for: ".concat(str2), new Object[0]);
            return new huz(Boolean.FALSE, (byte) 10);
        }
        return yoi1.g(((zu00) uu00Var).b(new oi(str, false, new w8c(strF, (byte) 19))).filter(qzs0.P0).map(new njp1(strF, (byte) 4)).onErrorReturnItem(Boolean.FALSE).distinctUntilChanged());
    }

    public static int j(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean k(gt40 gt40Var) {
        return gt40Var.a(gkz0.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:16:0x0071  */
    /* JADX WARN: Code duplicated, block: B:275:0x0597  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ptb0 l(int i, ntb0 ntb0Var, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, boolean z, g36 g36Var, c36 c36Var, boolean z2, wat watVar, bsb0 bsb0Var, edn0 edn0Var, boolean z3, boolean z4, c9n c9nVar, ven0 ven0Var, yd50 yd50Var, t2b t2bVar, boolean z5, mtb0 mtb0Var) throws KotlinNothingValueException {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ArrayList arrayList;
        float f2;
        int i16;
        ArrayList arrayList2;
        int i17;
        ktb0 ktb0Var;
        int i18;
        int i19;
        ntb0 ntb0Var2;
        Integer numValueOf;
        int i20;
        int[] iArr;
        int i21;
        int iM;
        int iF;
        ktb0 ktb0Var2 = ntb0Var.c;
        long j2 = ntb0Var.e;
        if (i3 < 0) {
            tf80.a("invalid beforeContentPadding");
        }
        if (i4 < 0) {
            tf80.a("invalid afterContentPadding");
        }
        qqq0 qqq0Var = qqq0.b;
        qqq0 qqq0Var2 = qqq0.a;
        ArrayList arrayList3 = z6x.a;
        if (i <= 0) {
            int iK = hjl.k(j);
            int iJ = hjl.j(j);
            bsb0Var.d(0, iK, iJ, new ArrayList(), ktb0Var2.d, ntb0Var, z, z4, 1, z3, 0, 0, c9nVar, yd50Var);
            if (z4) {
                iF = iJ;
            } else {
                long jB = bsb0Var.b();
                if (yr80.b(jB, 0L)) {
                    iF = iJ;
                } else {
                    iK = jjl.g((int) (jB >> 32), j);
                    iF = jjl.f((int) (jB & 4294967295L), j);
                }
            }
            return new ptb0((qtb0) null, 0, false, 0.0f, (hfh0) mtb0Var.invoke(Integer.valueOf(iK), Integer.valueOf(iF), new pv40((byte) 18)), 0.0f, false, c9nVar, watVar, ntb0Var.e, 0, arrayList3, -i3, i2 + i4, 0, z2, z ? qqq0Var2 : qqq0Var, i4, i5);
        }
        int i22 = i3;
        int i23 = i6;
        if (i23 >= i) {
            i23 = i - 1;
            i8 = 0;
        } else {
            i8 = i7;
        }
        int iRound = Math.round(f);
        int i24 = i8 - iRound;
        if (i23 == 0 && i24 < 0) {
            iRound += i24;
            i24 = 0;
        }
        n36 n36Var = new n36();
        int i25 = -i22;
        int i26 = (i5 < 0 ? i5 : 0) + i25;
        int iM2 = i24 + i26;
        int iMax = 0;
        while (iM2 < 0 && i23 > 0) {
            int i27 = i23 - 1;
            qtb0 qtb0VarV1 = ntb0Var.v1(i27, j2);
            n36Var.add(0, qtb0VarV1);
            iMax = Math.max(iMax, qtb0VarV1.v);
            iM2 += qtb0VarV1.m();
            i23 = i27;
        }
        if (iM2 < i26) {
            iRound -= i26 - iM2;
            iM2 = i26;
        }
        int i28 = iRound;
        int i29 = iM2 - i26;
        int i30 = i2 + i4;
        int i31 = iMax;
        int i32 = i30 < 0 ? 0 : i30;
        int i33 = i23;
        int iM3 = -i29;
        int i34 = i33;
        int i35 = 0;
        boolean z6 = false;
        while (i35 < n36Var.c) {
            if (iM3 >= i32) {
                n36Var.c(i35);
                z6 = true;
            } else {
                i34++;
                int iM4 = ((qtb0) n36Var.get(i35)).m() + iM3;
                i35++;
                iM3 = iM4;
            }
        }
        int iMax2 = i31;
        boolean z7 = z6;
        int i36 = i34;
        int i37 = i33;
        int i38 = i29;
        while (i36 < i && (iM3 < i32 || iM3 <= 0 || n36Var.isEmpty())) {
            int i39 = i32;
            qtb0 qtb0VarV2 = ntb0Var.v1(i36, j2);
            iM3 = qtb0VarV2.m() + iM3;
            if (iM3 <= i26) {
                i21 = i26;
                if (i36 != i - 1) {
                    iM = i38 - qtb0VarV2.m();
                    i37 = i36 + 1;
                    z7 = true;
                }
                i36++;
                i26 = i21;
                i38 = iM;
                i32 = i39;
            } else {
                i21 = i26;
            }
            iMax2 = Math.max(iMax2, qtb0VarV2.v);
            n36Var.addLast(qtb0VarV2);
            iM = i38;
            i36++;
            i26 = i21;
            i38 = iM;
            i32 = i39;
        }
        if (iM3 < i2) {
            int i40 = i2 - iM3;
            int i41 = iM3 + i40;
            int iM5 = i38 - i40;
            while (iM5 < i22 && i37 > 0) {
                int i42 = iM5;
                int i43 = i37 - 1;
                qtb0 qtb0VarV3 = ntb0Var.v1(i43, j2);
                n36Var.add(0, qtb0VarV3);
                iMax2 = Math.max(iMax2, qtb0VarV3.v);
                iM5 = qtb0VarV3.m() + i42;
                i22 = i3;
                i37 = i43;
            }
            int i44 = iM5;
            i10 = i28 + i40;
            if (i44 < 0) {
                i10 += i44;
                i12 = iMax2;
                i9 = i41 + i44;
                i13 = i37;
                i11 = 0;
            } else {
                i12 = iMax2;
                i9 = i41;
                i13 = i37;
                i11 = i44;
            }
        } else {
            i9 = iM3;
            i10 = i28;
            i11 = i38;
            i12 = iMax2;
            i13 = i37;
        }
        int i45 = i36;
        float f3 = (Integer.signum(Math.round(f)) != Integer.signum(i10) || Math.abs(Math.round(f)) < Math.abs(i10)) ? f : i10;
        float f4 = f - f3;
        float f5 = 0.0f;
        if (z4 && i10 > i28 && f4 <= 0.0f) {
            f5 = (i10 - i28) + f4;
        }
        float f6 = f5;
        if (i11 < 0) {
            tf80.a("negative currentFirstItemScrollOffset");
        }
        int i46 = -i11;
        qtb0 qtb0Var = (qtb0) n36Var.first();
        if (i3 > 0 || i5 < 0) {
            int iB = n36Var.b();
            qtb0 qtb0Var2 = qtb0Var;
            int i47 = i11;
            int i48 = 0;
            while (true) {
                if (i48 >= iB) {
                    i14 = i46;
                    break;
                }
                i14 = i46;
                int iM6 = ((qtb0) n36Var.get(i48)).m();
                if (i47 == 0 || iM6 > i47 || i48 == p7h.L(n36Var)) {
                    break;
                }
                i47 -= iM6;
                i48++;
                qtb0Var2 = (qtb0) n36Var.get(i48);
                i46 = i14;
            }
            i11 = i47;
            qtb0Var = qtb0Var2;
        } else {
            i14 = i46;
        }
        int iMax3 = Math.max(0, i13);
        int i49 = i13 - 1;
        Integer numValueOf2 = null;
        if (iMax3 <= i49) {
            ArrayList arrayList4 = null;
            while (true) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                i15 = i11;
                arrayList = arrayList4;
                arrayList.add(ntb0Var.v1(i49, j2));
                if (i49 == iMax3) {
                    break;
                }
                i49--;
                i11 = i15;
                arrayList4 = arrayList;
            }
        } else {
            i15 = i11;
            arrayList = null;
        }
        int[] iArr2 = edn0Var.a;
        for (int i50 = edn0Var.b - 1; -1 < i50; i50--) {
            int i51 = iArr2[i50];
            if (i51 < iMax3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ntb0Var.v1(i51, j2));
            }
        }
        if (arrayList == null) {
            arrayList = arrayList3;
        }
        ArrayList arrayList5 = arrayList;
        int size = arrayList5.size();
        int iMax4 = i12;
        for (int i52 = 0; i52 < size; i52++) {
            iMax4 = Math.max(iMax4, ((qtb0) arrayList.get(i52)).v);
        }
        int iMin = Math.min(((qtb0) o7h.A0(n36Var)).a, i - 1);
        int i53 = ((qtb0) o7h.A0(n36Var)).a + 1;
        if (i53 <= iMin) {
            ArrayList arrayList6 = null;
            while (true) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                f2 = f3;
                i16 = iMax4;
                arrayList2 = arrayList6;
                arrayList2.add(ntb0Var.v1(i53, j2));
                if (i53 == iMin) {
                    break;
                }
                i53++;
                arrayList6 = arrayList2;
                iMax4 = i16;
                f3 = f2;
            }
        } else {
            f2 = f3;
            i16 = iMax4;
            arrayList2 = null;
        }
        if (arrayList2 != null && ((qtb0) o7h.A0(arrayList2)).a > iMin) {
            iMin = ((qtb0) o7h.A0(arrayList2)).a;
        }
        int[] iArr3 = edn0Var.a;
        int i54 = edn0Var.b;
        int i55 = 0;
        while (i55 < i54) {
            int[] iArr4 = iArr3;
            int i56 = iArr4[i55];
            if (i56 > iMin) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(ntb0Var.v1(i56, j2));
            }
            i55++;
            iArr3 = iArr4;
        }
        if (arrayList2 == null) {
            arrayList2 = arrayList3;
        }
        ArrayList arrayList7 = arrayList2;
        int size2 = arrayList7.size();
        int iMax5 = i16;
        for (int i57 = 0; i57 < size2; i57++) {
            iMax5 = Math.max(iMax5, ((qtb0) arrayList2.get(i57)).v);
        }
        boolean z8 = u890.j(qtb0Var, n36Var.first()) && arrayList.isEmpty() && arrayList2.isEmpty();
        int iG = jjl.g(z ? iMax5 : i9, j);
        if (z) {
            iMax5 = i9;
        }
        int iF2 = jjl.f(iMax5, j);
        int i58 = z ? iF2 : iG;
        boolean z9 = i9 < Math.min(i58, i2);
        if (z9 && i14 != 0) {
            tf80.c("non-zero itemsScrollOffset");
        }
        ArrayList arrayList8 = new ArrayList(arrayList2.size() + arrayList.size() + n36Var.b());
        if (z9) {
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                tf80.a("no extra items");
            }
            int iB2 = n36Var.b();
            int[] iArr5 = new int[iB2];
            for (int i59 = 0; i59 < iB2; i59++) {
                iArr5[i59] = ((qtb0) n36Var.get(!z2 ? i59 : (iB2 - i59) - 1)).q;
            }
            int[] iArr6 = new int[iB2];
            if (z) {
                if (g36Var == null) {
                    throw kaa0.g("null verticalArrangement when isVertical == true");
                }
                g36Var.b(watVar, i58, iArr5, iArr6);
                i20 = i58;
                iArr = iArr6;
            } else {
                if (c36Var == null) {
                    throw kaa0.g("null horizontalArrangement when isVertical == false");
                }
                i20 = i58;
                iArr = iArr6;
                c36Var.e(watVar, i20, iArr5, flb0.a, iArr);
            }
            rr80 rr80VarL0 = f46.l0(iArr);
            if (z2) {
                rr80VarL0 = yoi1.M(rr80VarL0);
            }
            int i60 = rr80VarL0.a;
            int i61 = rr80VarL0.b;
            int i62 = rr80VarL0.c;
            if ((i62 > 0 && i60 <= i61) || (i62 < 0 && i61 <= i60)) {
                while (true) {
                    int i63 = iArr[i60];
                    qtb0 qtb0Var3 = (qtb0) n36Var.get(!z2 ? i60 : (iB2 - i60) - 1);
                    if (z2) {
                        i63 = (i20 - i63) - qtb0Var3.q;
                    }
                    qtb0Var3.o(i63, iG, iF2);
                    arrayList8.add(qtb0Var3);
                    if (i60 == i61) {
                        break;
                    }
                    i60 += i62;
                    iB2 = iB2;
                }
            }
        } else {
            int size3 = arrayList5.size();
            int iM7 = i14;
            for (int i64 = 0; i64 < size3; i64++) {
                qtb0 qtb0Var4 = (qtb0) arrayList.get(i64);
                iM7 -= qtb0Var4.m();
                qtb0Var4.o(iM7, iG, iF2);
                arrayList8.add(qtb0Var4);
            }
            int iB3 = n36Var.b();
            int iM8 = i14;
            for (int i65 = 0; i65 < iB3; i65++) {
                qtb0 qtb0Var5 = (qtb0) n36Var.get(i65);
                qtb0Var5.o(iM8, iG, iF2);
                arrayList8.add(qtb0Var5);
                iM8 += qtb0Var5.m();
            }
            int size4 = arrayList7.size();
            for (int i66 = 0; i66 < size4; i66++) {
                qtb0 qtb0Var6 = (qtb0) arrayList2.get(i66);
                qtb0Var6.o(iM8, iG, iF2);
                arrayList8.add(qtb0Var6);
                iM8 += qtb0Var6.m();
            }
        }
        int iG2 = iG;
        if (z5) {
            ktb0Var = ktb0Var2;
            i17 = i9;
            i18 = 0;
            i19 = i15;
            bsb0Var.d((int) f2, iG2, iF2, arrayList8, ktb0Var2.d, ntb0Var, z, z4, 1, z3, i19, i17, c9nVar, yd50Var);
            ntb0Var2 = ntb0Var;
        } else {
            i17 = i9;
            ktb0Var = ktb0Var2;
            i18 = 0;
            i19 = i15;
            ntb0Var2 = ntb0Var;
        }
        if (!z4) {
            long jB2 = bsb0Var.b();
            if (!yr80.b(jB2, 0L)) {
                int i67 = z ? iF2 : iG2;
                iG2 = jjl.g(Math.max(iG2, (int) (jB2 >> 32)), j);
                iF2 = jjl.f(Math.max(iF2, (int) (jB2 & 4294967295L)), j);
                int i68 = z ? iF2 : iG2;
                if (i68 != i67) {
                    int size5 = arrayList8.size();
                    for (int i69 = i18; i69 < size5; i69++) {
                        qtb0 qtb0Var7 = (qtb0) arrayList8.get(i69);
                        qtb0Var7.x = i68;
                        qtb0Var7.z = qtb0Var7.i + i68;
                    }
                }
            }
        }
        int i70 = iG2;
        int i71 = iF2;
        qtb0 qtb0Var8 = (qtb0) n36Var.f();
        int i72 = qtb0Var8 != null ? qtb0Var8.a : i18;
        qtb0 qtb0Var9 = (qtb0) n36Var.k();
        int i73 = qtb0Var9 != null ? qtb0Var9.a : i18;
        edn0 edn0Var2 = ktb0Var.b.d;
        if (edn0Var2 == null) {
            edn0Var2 = mr80.a;
        }
        List listL = zmo1.l(t2bVar, i72, i73, arrayList8, edn0Var2, i3, i70, i71, z, new gv20(ntb0Var2, (byte) 16));
        if (z8) {
            qtb0 qtb0Var10 = (qtb0) o7h.s0(arrayList8);
            if (qtb0Var10 != null) {
                numValueOf = Integer.valueOf(qtb0Var10.a);
            } else {
                numValueOf = null;
            }
        } else {
            qtb0 qtb0Var11 = (qtb0) n36Var.f();
            if (qtb0Var11 != null) {
                numValueOf = Integer.valueOf(qtb0Var11.a);
            } else {
                numValueOf = null;
            }
        }
        if (z8) {
            qtb0 qtb0Var12 = (qtb0) o7h.C0(arrayList8);
            if (qtb0Var12 != null) {
                numValueOf2 = Integer.valueOf(qtb0Var12.a);
            }
        } else {
            qtb0 qtb0Var13 = (qtb0) n36Var.k();
            if (qtb0Var13 != null) {
                numValueOf2 = Integer.valueOf(qtb0Var13.a);
            }
        }
        boolean z10 = (i45 < i || i17 > i2) ? 1 : i18;
        hfh0 hfh0Var = (hfh0) mtb0Var.invoke(Integer.valueOf(i70), Integer.valueOf(i71), new kpb0(ven0Var, arrayList8, listL, z4, (byte) 1));
        List listF = men1.F(numValueOf != null ? numValueOf.intValue() : i18, numValueOf2 != null ? numValueOf2.intValue() : i18, arrayList8, listL);
        qqq0 qqq0Var3 = z ? qqq0Var2 : qqq0Var;
        long j3 = ntb0Var2.e;
        int size6 = listL.size();
        int i74 = i19;
        int i75 = i18;
        int i76 = i75;
        while (i75 < size6) {
            i76 += ((qtb0) listL.get(i75)).q;
            i75++;
        }
        return new ptb0(qtb0Var, i74, z10, f2, hfh0Var, f6, z7, c9nVar, watVar, j3, i76, listF, i25, i30, i, z2, qqq0Var3, i4, i5);
    }

    public static final void m() {
        eps0 eps0Var = eps0.d;
    }

    public static final mqs0 n() {
        mqs0 mqs0Var = mqs0.d;
        return mqs0.d;
    }

    public static final String o(Long l, yqg yqgVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-2081216156);
        if (l == null) {
            x340Var.r(false);
            return null;
        }
        String strG = g(l.longValue(), yqgVar);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && x340Var.g(l)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !x340Var.g(yqgVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objT = x340Var.T();
        if (z3 || objT == fkj0.X) {
            objT = new hff(l, yqgVar, (lnm) null, (byte) 26);
            x340Var.s0(objT);
        }
        String str = (String) yto.p(strG, l, (vu30) objT, x340Var, (i << 3) & 112).getValue();
        x340Var.r(false);
        return str;
    }

    public static final im6 p(pz6 pz6Var) {
        u7h u7hVar;
        String str = pz6Var.a;
        List list = pz6Var.d;
        Long l = pz6Var.e;
        if (l != null) {
            long jLongValue = l.longValue();
            int i = u7h.l;
            u7hVar = new u7h(w361.m(jLongValue));
        } else {
            u7hVar = null;
        }
        return new im6(str, list, u7hVar);
    }

    public static final Uri q(Uri uri, Uri uri2) {
        int i = nhc1.Y(uri2.toString(), "spotify:artist:", false) ? 1 : 2;
        if (!u890.j(uri.getScheme(), "content")) {
            return uri;
        }
        String upperCase = v8i0.m(i).toUpperCase(Locale.ROOT);
        Uri.Builder builderFragment = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).fragment(uri.getFragment());
        for (String str : uri.getQueryParameterNames()) {
            if (!u890.j(str, "transformation")) {
                Iterator<T> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderFragment.appendQueryParameter(str, (String) it.next());
                }
            }
        }
        builderFragment.appendQueryParameter("transformation", upperCase);
        return builderFragment.build();
    }

    public static int r(int i, int i2) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = ((i ^ i2) >> 31) | 1;
        switch (u8p1.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i3;
            case 3:
                if (i5 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i5 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i4);
                int iAbs2 = iAbs - (Math.abs(i2) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i3;
                }
                if (iAbs2 <= 0) {
                    return i3;
                }
                break;
            default:
                hhg1.c();
                return 0;
        }
        return i3 + i5;
    }
}
