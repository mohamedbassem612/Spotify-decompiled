package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qyo1 {
    public static b180 a;
    public static b180 b;

    public static final String A(String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        xkk1 xkk1Var;
        mq70 mq70Var;
        up70 up70VarA;
        hoj0 hoj0VarC = ioj0Var.c(xkk1.class, str);
        String str2 = (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (xkk1Var = (xkk1) goj0VarA.a) == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null) ? null : up70VarA.a.a;
        return str2 == null ? "" : str2;
    }

    public static final void B(zle1 zle1Var, t45 t45Var, int i) {
        String str;
        if (i == 1) {
            str = "success";
        } else if (i == 2) {
            str = "error";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "cancelled";
        }
        t45Var.a("outcome", str);
        ((s45) zle1Var).b(t45Var.e());
    }

    public static final void C(t45 t45Var) {
        t45.m(t45Var, "fetch_list_platform", 4);
    }

    public static final void D(t45 t45Var) {
        t45.m(t45Var, "load_recents_any", 4);
    }

    public static final void E(t45 t45Var) {
        t45.m(t45Var, "load_recents", 4);
    }

    public static final void F(t45 t45Var) {
        t45.m(t45Var, "load_recents_network", 4);
    }

    public static final eln0 G(yod yodVar) {
        String str = yodVar.c;
        String str2 = str == null ? "" : str;
        String str3 = yodVar.d;
        String str4 = str3 == null ? "" : str3;
        String str5 = yodVar.e;
        String str6 = str5 == null ? "" : str5;
        String str7 = yodVar.g;
        String str8 = str7 == null ? "" : str7;
        String str9 = yodVar.f;
        String str10 = str9 == null ? "" : str9;
        String str11 = yodVar.h;
        return new eln0(str2, str4, str8, str6, str10, str11 == null ? "" : str11);
    }

    public static void H(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void a(int i, String str, Function0 function0, b0k b0kVar) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1631324836);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b2 = 1;
            foo1.c(new gbx(z50.c, function0), new idx(4), null, null, yla.r(x340Var), null, null, null, null, null, apo.r(-2013554967, new nl(str, (byte) 3), x340Var), x340Var, 0, 48, 2012);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, b2);
        }
    }

    public static final void b(lyi1 lyi1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(55336550);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(lyi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            zui1 zui1Var = new zui1(lyi1Var.i, lyi1Var.j);
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new izg1(function0, (byte) 3);
                x340Var.s0(objT);
            }
            fyo1.h(zui1Var, (iu30) objT, nim0Var, x340Var, (i2 << 3) & 896);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(lyi1Var, function0, i);
        }
    }

    public static final void c(cn8 cn8Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1630393344);
        int i2 = i | (x340Var2.g(cn8Var) ? 4 : 2) | (x340Var2.i(iu30Var) ? 32 : 16) | (x340Var2.i(qim0Var) ? 256 : 128);
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarThen = uyn1.y(qim0VarF, 16.0f, 16.0f).then(qim0Var);
            mbh mbhVarA = jbh.a(new d36(20.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarThen);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(cn8Var.a, null, cbx.d(x340Var2).d, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
            uwo1.f((af5) iu30Var.invoke(cn8Var.b), null, cbx.d(x340Var2).g, null, null, null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4090);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zt6(cn8Var, iu30Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-899062517);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarThen = u291.f(nim0Var, 1.0f).then(qim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarN = anm1.N("AuthorBioSheetProgress", uyn1.x(h2c.a.a(nim0Var, een.h), 48.0f));
            uwr uwrVar = cbx.a;
            rhx0.a(qim0VarN, cbx.a(x340Var).c.c, 0.0f, 0L, 0, 0.0f, x340Var, 0, 60);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 10);
        }
    }

    public static final void e(en8 en8Var, iu30 iu30Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1038122548);
        int i2 = (x340Var.g(en8Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nyx.a(2, (wux) null, apo.r(-2094620321, new kn8(en8Var, qim0Var, iu30Var, function0), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kn8(en8Var, iu30Var, qim0Var, function0, i);
        }
    }

    public static final void f(ArrayList arrayList, String str, boolean z, iu30 iu30Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f;
        boolean z2;
        boolean z3;
        qim0 qim0Var3;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-797015767);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(arrayList) ? 4 : 2) | (x340Var.e(0) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (i2 & 599187) != 599186)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarN = anm1.N("chips_section", u291.f(qim0Var4, 1.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            float f2 = cbx.b(x340Var).b.b;
            if (z) {
                x340Var.i0(-1141443295);
                x340Var.r(false);
                f = 32.0f + f2;
            } else {
                x340Var.i0(-1141441367);
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            }
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, f, 0.0f, 11);
            boolean z5 = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (z5 || objT == fkj0.X) {
                objT = new w9f(arrayList, iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            too1.b(qim0VarF2, xtb0VarA, zzq0VarJ, (iu30) objT, x340Var, 0, 0);
            if (z) {
                x340Var.i0(-1024322674);
                long j = cbx.a(x340Var).a.c;
                mic0 mic0VarK = x340Var.k(t4k.n) == flb0.b ? v9c.k(new mmr0[]{new mmr0(fValueOf2, new u7h(j)), new mmr0(Float.valueOf(0.6f), new u7h(j)), new mmr0(fValueOf, new u7h(u7h.j))}, 0.0f, 0.0f, 14) : v9c.k(new mmr0[]{new mmr0(fValueOf2, new u7h(u7h.j)), new mmr0(Float.valueOf(0.4f), new u7h(j)), new mmr0(fValueOf, new u7h(j))}, 0.0f, 0.0f, 14);
                qim0 qim0VarB = h2c.a.b(qim0Var4);
                gfh0 gfh0VarC2 = t1c.c(een.i, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                z3 = false;
                t1c.a(dug.e(u291.v(u291.c(qim0Var4, 1.0f), 32.0f + f2), mic0VarK, null, 0.0f, 6), x340Var, 0);
                g((i2 >> 15) & 14, function0, x340Var, anm1.N("chips_section_share_button", qim0Var4));
                z2 = true;
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z2 = true;
                z3 = false;
                x340Var.i0(-1023539459);
                x340Var.r(false);
            }
            x340Var.r(z2);
            if (str != null) {
                x340Var.i0(-1812028820);
                lee1 lee1Var = cbx.d(x340Var).j;
                long j2 = cbx.a(x340Var).b.b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                uwo1.e(str, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), lee1Var, j2, null, null, 0, false, null, 0, null, x340Var, (i2 >> 6) & 14, 0, 2032);
                x340Var = x340Var;
                x340Var.r(z3);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-1811816253);
                x340Var.r(z3);
            }
            x340Var.r(z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1((Object) arrayList, str, z, iu30Var, (Object) function0, qim0Var2, i, (byte) 3);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(268291286);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            wro1.h(new gbx(z50.c, function0), ldx.c, qim0Var, null, yla.s(x340Var).a(), null, false, null, null, nci.a, x340Var, (i2 << 3) & 896, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 8);
        }
    }

    public static final void h(oyi1 oyi1Var, xfx xfxVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1375391890);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(oyi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xfxVar) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zI = x340Var.i(xfxVar) | ((i2 & 7168) == 2048) | x340Var.i(oyi1Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new rsc1(xfxVar, oyi1Var, function0, (byte) 28);
                x340Var.s0(objT);
            }
            dm5.a((iu30) objT, nim0Var, (iu30) null, x340Var, (i2 >> 3) & 112, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(oyi1Var, xfxVar, function0, i);
        }
    }

    public static final void i(pyi1 pyi1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1240476117);
        int i2 = (x340Var.i(pyi1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            b7u b7uVar = new b7u((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), (byte) 1);
            String str = pyi1Var.h;
            String str2 = pyi1Var.i;
            LatLng latLng = pyi1Var.j;
            myi1 myi1Var = pyi1Var.k;
            otw.c(b7uVar, new hyi1(str, str2, (String) null, latLng, myi1Var != null ? new byi1(myi1Var.a, myi1Var.b) : null), (qim0) null, (ipb1) null, x340Var, 72, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new muh1(pyi1Var, i, (byte) 9);
        }
    }

    public static final void j(xtb0 xtb0Var, kyi1 kyi1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        xtb0 xtb0Var2;
        kyi1 kyi1Var2;
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1714316739);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(kyi1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(xtb0Var) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                xtb0Var2 = xtb0Var;
                kyi1Var2 = kyi1Var;
                iu30Var2 = iu30Var;
                vxg1 vxg1Var = new vxg1(xtb0Var2, kyi1Var2, iu30Var2, (lnm) null, (byte) 12);
                x340Var.s0(vxg1Var);
                objT = vxg1Var;
            } else {
                xtb0Var2 = xtb0Var;
                kyi1Var2 = kyi1Var;
                iu30Var2 = iu30Var;
            }
            qxd0.s(xtb0Var2, kyi1Var2, (vu30) objT, x340Var);
        } else {
            xtb0Var2 = xtb0Var;
            kyi1Var2 = kyi1Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(xtb0Var2, kyi1Var2, iu30Var2, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(t8r0 t8r0Var, f6m f6mVar, xfx xfxVar, j2i j2iVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2121760730);
        int i2 = i | (x340Var.g(t8r0Var) ? 4 : 2) | (x340Var.g(f6mVar) ? 32 : 16) | (x340Var.i(xfxVar) ? 256 : 128) | (x340Var.i(j2iVar) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            lyi1 lyi1Var = f6mVar.b;
            if (lyi1Var instanceof lyi1) {
                x340Var.i0(1097415638);
                lyi1 lyi1Var2 = lyi1Var;
                boolean zG = ((i2 & 14) == 4) | x340Var.g(lyi1Var) | ((i2 & 57344) == 16384);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new jxi1(t8r0Var, lyi1Var, iu30Var, (byte) 0);
                    x340Var.s0(objT);
                }
                b(lyi1Var2, (Function0) objT, x340Var, 48);
                x340Var.r(false);
            } else if (lyi1Var instanceof pyi1) {
                x340Var.i0(1097425081);
                i((pyi1) lyi1Var, x340Var, 0);
                x340Var.r(false);
            } else if (lyi1Var instanceof oyi1) {
                x340Var.i0(1097427214);
                oyi1 oyi1Var = (oyi1) lyi1Var;
                boolean zG2 = ((i2 & 14) == 4) | x340Var.g(lyi1Var) | ((i2 & 57344) == 16384);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new jxi1(t8r0Var, lyi1Var, iu30Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                h(oyi1Var, xfxVar, (Function0) objT2, x340Var, ((i2 >> 3) & 112) | 384);
                x340Var.r(false);
            } else if (lyi1Var instanceof ryi1) {
                x340Var.i0(1097437477);
                l((ryi1) lyi1Var, x340Var, 48);
                x340Var.r(false);
            } else if (lyi1Var instanceof qyi1) {
                x340Var.i0(1097439746);
                j2iVar.invoke(lyi1Var, x340Var, Integer.valueOf((i2 >> 6) & 112));
                x340Var.r(false);
            } else {
                if (!lyi1Var.equals(nyi1.h)) {
                    throw p3d1.k(x340Var, 1097413463, false);
                }
                x340Var.i0(-339049510);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(t8r0Var, f6mVar, xfxVar, j2iVar, iu30Var, qim0Var2, i, (byte) 19);
        }
    }

    public static final void l(ryi1 ryi1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-659548902);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ryi1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = ryi1Var.h;
            uwr uwrVar = cbx.a;
            uwo1.e(str, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oib1(ryi1Var, i);
        }
    }

    public static final void m(kyi1 kyi1Var, q1a q1aVar, t8r0 t8r0Var, xfx xfxVar, j2i j2iVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        t8r0 t8r0Var2;
        iu30 iu30Var2;
        x340 x340Var;
        qim0 qim0Var2;
        Object fjkVar;
        int i2;
        boolean z;
        g36 g36Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1910637074);
        int i3 = i | (x340Var2.g(kyi1Var) ? 4 : 2) | (x340Var2.g(q1aVar) ? 32 : 16) | (x340Var2.g(t8r0Var) ? 256 : 128) | (x340Var2.i(xfxVar) ? 2048 : 1024) | (x340Var2.i(j2iVar) ? 16384 : 8192) | (x340Var2.i(iu30Var) ? 131072 : 65536) | 1572864;
        if (x340Var2.Y(i3 & 1, (599187 & i3) != 599186)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            i6o0 i6o0VarQ = k1o1.q(x340Var2);
            Object[] objArr = new Object[0];
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = vbh1.R0;
                x340Var2.s0(objT);
            }
            hdn0 hdn0Var = (hdn0) k5p1.s(objArr, (Function0) objT, x340Var2, 48);
            Object[] objArr2 = new Object[0];
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = vbh1.Q0;
                x340Var2.s0(objT2);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr2, (Function0) objT2, x340Var2, 48);
            Boolean bool = (Boolean) ven0Var.getValue();
            bool.getClass();
            boolean zI = x340Var2.i(xtb0VarA) | x340Var2.i(ven0Var) | x340Var2.i(hdn0Var);
            Object objT3 = x340Var2.T();
            lnm lnmVar = null;
            if (zI || objT3 == m4cVar) {
                objT3 = new l4z0(xtb0VarA, ven0Var, hdn0Var, lnmVar, (byte) 1);
                x340Var2.s0(objT3);
            }
            qxd0.s(xtb0VarA, bool, (vu30) objT3, x340Var2);
            Integer numValueOf = Integer.valueOf(kyi1Var.b);
            int i4 = i3 & 14;
            boolean zI2 = (i4 == 4) | x340Var2.i(xtb0VarA) | x340Var2.i(hdn0Var) | x340Var2.i(ven0Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                i2 = i4;
                fjkVar = new fjk(kyi1Var, xtb0VarA, hdn0Var, ven0Var, (lnm) null, (byte) 4);
                x340Var2.s0(fjkVar);
            } else {
                fjkVar = objT4;
                i2 = i4;
            }
            qxd0.t(numValueOf, x340Var2, (vu30) fjkVar);
            j(xtb0VarA, kyi1Var, iu30Var, x340Var2, ((i3 << 3) & 112) | ((i3 >> 9) & 896));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(bmq0.L(qim0Var3, i6o0VarQ, (g6o0) 0), 16.0f);
            g36 d36Var = new d36(16.0f, true, new um5(false));
            int i5 = i3 & 896;
            int i6 = i3 & 458752;
            boolean zI3 = (i2 == 4) | (i5 == 256) | x340Var2.i(xfxVar) | ((i3 & 57344) == 16384) | (i6 == 131072);
            Object objT5 = x340Var2.T();
            if (zI3 || objT5 == m4cVar) {
                iu30Var2 = iu30Var;
                z = true;
                g36Var = d36Var;
                t8r0Var2 = t8r0Var;
                kdg1 kdg1Var = new kdg1(kyi1Var, t8r0Var2, xfxVar, j2iVar, iu30Var2, (byte) 1);
                x340Var2.s0(kdg1Var);
                objT5 = kdg1Var;
            } else {
                iu30Var2 = iu30Var;
                z = true;
                t8r0Var2 = t8r0Var;
                g36Var = d36Var;
            }
            qim0Var2 = qim0Var3;
            ujo1.d(qim0VarX, xtb0VarA, null, false, g36Var, null, null, false, null, (iu30) objT5, x340Var2, 0, 492);
            x340Var = x340Var2;
            if (q1aVar instanceof p1a) {
                x340Var.i0(-1410555242);
                h1a h1aVar = ((p1a) q1aVar).a;
                String str = h1aVar.a;
                String str2 = h1aVar.b;
                String str3 = h1aVar.c;
                n1a n1aVar = h1aVar.d;
                evi1 evi1Var = new evi1(str, str2, str3, n1aVar.a, n1aVar.b, n1aVar.c);
                boolean z2 = i6 == 131072 ? z : false;
                if (i5 != 256) {
                    z = false;
                }
                boolean zG = z2 | z | x340Var.g(h1aVar);
                Object objT6 = x340Var.T();
                if (zG || objT6 == m4cVar) {
                    objT6 = new rsc1(iu30Var2, t8r0Var2, h1aVar, (byte) 29);
                    x340Var.s0(objT6);
                }
                gyo1.D(evi1Var, (iu30) objT6, null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1409669200);
                x340Var.r(false);
            }
        } else {
            t8r0Var2 = t8r0Var;
            iu30Var2 = iu30Var;
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0(kyi1Var, q1aVar, t8r0Var2, xfxVar, j2iVar, iu30Var2, qim0Var2, i);
        }
    }

    public static Object[] n(int i, int i2, Object[] objArr, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i, i2, objArr2.getClass());
    }

    public static final t45 o(zle1 zle1Var, int i) {
        String str;
        if (i != 15) {
            str = i != 20 ? "recents_page_load_pagination" : "recents_shelf_load";
        } else {
            str = "recents_page_load_initial";
        }
        t45 t45VarA = ((s45) zle1Var).a(str);
        t45VarA.h = "android-feature-recents";
        return t45VarA;
    }

    public static final void p(t45 t45Var) {
        t45Var.g("fetch_list_platform");
    }

    public static final void q(t45 t45Var) {
        t45Var.g("load_recents_any");
    }

    public static final void r(t45 t45Var) {
        t45Var.g("load_recents");
    }

    public static final void s(t45 t45Var) {
        t45Var.g("load_recents_network");
    }

    public static final ArrayList t(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (list2.contains(((g471) obj).a())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static h4d0 u(String str) {
        try {
            return h4d0.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return h4d0.b;
        }
    }

    public static final o8n v(en31 en31Var, boolean z, onm onmVar) {
        o8n o8nVarY;
        p7g1 p7g1VarA = onmVar.getContext().A(p7g1.b);
        q8n q8nVar = p7g1VarA != null ? p7g1VarA.a : null;
        if (!en31Var.m()) {
            o8n o8nVarJ = en31Var.j();
            if (q8nVar == null) {
                q8nVar = o6x.a;
            }
            o8nVarY = o8nVarJ.y(q8nVar);
        } else if (q8nVar != null) {
            o8nVarY = en31Var.j().y(q8nVar);
        } else {
            if (z) {
                o8n o8nVar = en31Var.b;
                if (o8nVar != null) {
                    return o8nVar;
                }
                u890.C("transactionContext");
                throw null;
            }
            o8nVarY = en31Var.j();
        }
        return o8nVarY;
    }

    public static xot w(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        if (fpi1.y(strOptString)) {
            return null;
        }
        List listQ0 = ihc1.Q0(strOptString, new String[]{"|"}, 0, 6);
        if (listQ0.size() != 2) {
            return null;
        }
        String str = (String) o7h.q0(listQ0);
        String str2 = (String) o7h.A0(listQ0);
        if (fpi1.y(str) || fpi1.y(str2)) {
            return null;
        }
        String strOptString2 = jSONObject.optString("url");
        if (!fpi1.y(strOptString2)) {
            Uri.parse(strOptString2);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("versions");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int iOptInt = jSONArrayOptJSONArray.optInt(i, -1);
                if (iOptInt == -1) {
                    String strOptString3 = jSONArrayOptJSONArray.optString(i);
                    if (!fpi1.y(strOptString3)) {
                        try {
                            i2 = Integer.parseInt(strOptString3);
                        } catch (NumberFormatException unused) {
                            wf10 wf10Var = wf10.a;
                        }
                        iOptInt = i2;
                    }
                }
                iArr[i] = iOptInt;
            }
        }
        return new xot(str, str2, (byte) 1);
    }

    public static final Object x(en31 en31Var, boolean z, boolean z2, iu30 iu30Var) {
        en31Var.a();
        en31Var.b();
        o6x o6xVar = (o8n) en31Var.i.get();
        if (o6xVar == null) {
            o6xVar = o6x.a;
        }
        return yah0.x(new cuo(o6xVar, en31Var, z2, z, iu30Var, (lnm) null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(en31 en31Var, fpo fpoVar, onm onmVar) {
        euo euoVar;
        if (onmVar instanceof euo) {
            euoVar = (euo) onmVar;
            int i = euoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                euoVar.d = i - Integer.MIN_VALUE;
            } else {
                euoVar = new euo(onmVar);
            }
        } else {
            euoVar = new euo(onmVar);
        }
        Object objV = euoVar.c;
        int i2 = euoVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objV);
            if (en31Var.m()) {
                fpo fpoVar2 = new fpo(en31Var, fpoVar, (lnm) null, (byte) 1);
                euoVar.d = 1;
                Object objZ = fn31.Z(euoVar, fpoVar2, en31Var);
                if (objZ != d9nVar) {
                    return objZ;
                }
            } else if (en31Var.m() && en31Var.q() && en31Var.n()) {
                guo guoVar = new guo((byte) 1, (lnm) null, fpoVar, en31Var);
                euoVar.d = 2;
                Object objT = en31Var.t(false, guoVar, euoVar);
                if (objT != d9nVar) {
                    return objT;
                }
            } else {
                euoVar.a = en31Var;
                euoVar.b = fpoVar;
                euoVar.d = 3;
                objV = v(en31Var, true, euoVar);
                if (objV != d9nVar) {
                }
            }
        }
        if (i2 == 1) {
            hm5.M(objV);
            return objV;
        }
        if (i2 == 2) {
            hm5.M(objV);
            return objV;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                hm5.M(objV);
                return objV;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        fpoVar = euoVar.b;
        en31Var = euoVar.a;
        hm5.M(objV);
        duo duoVar = new duo((lnm) null, fpoVar, en31Var);
        euoVar.a = null;
        euoVar.b = null;
        euoVar.d = 4;
        Object objY = fn31.Y((o8n) objV, duoVar, euoVar);
        return objY == d9nVar ? d9nVar : objY;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object z(lnm lnmVar, iu30 iu30Var, en31 en31Var, boolean z, boolean z2) {
        huo huoVar;
        boolean z3;
        iu30 iu30Var2;
        en31 en31Var2;
        boolean z4;
        if (lnmVar instanceof huo) {
            huoVar = (huo) lnmVar;
            int i = huoVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                huoVar.f = i - Integer.MIN_VALUE;
            } else {
                huoVar = new huo(lnmVar);
            }
        } else {
            huoVar = new huo(lnmVar);
        }
        huo huoVar2 = huoVar;
        Object obj = huoVar2.e;
        int i2 = huoVar2.f;
        o8n o8nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            if (en31Var.m() && en31Var.q() && en31Var.n()) {
                iuo iuoVar = new iuo((lnm) null, iu30Var, en31Var, z2, z);
                huoVar2.f = 1;
                Object objT = en31Var.t(z, iuoVar, huoVar2);
                if (objT != o8nVar) {
                    return objT;
                }
            } else {
                z3 = z2;
                huoVar2.a = en31Var;
                huoVar2.b = iu30Var;
                huoVar2.c = z;
                huoVar2.d = z3;
                huoVar2.f = 2;
                o8n o8nVarV = v(en31Var, z3, huoVar2);
                if (o8nVarV != o8nVar) {
                    iu30Var2 = iu30Var;
                    en31Var2 = en31Var;
                    obj = o8nVarV;
                    z4 = z;
                }
            }
        }
        if (i2 == 1) {
            hm5.M(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z3 = huoVar2.d;
        boolean z5 = huoVar2.c;
        iu30 iu30Var3 = huoVar2.b;
        en31 en31Var3 = huoVar2.a;
        hm5.M(obj);
        z4 = z5;
        iu30Var2 = iu30Var3;
        en31Var2 = en31Var3;
        es9 es9Var = new es9((lnm) null, iu30Var2, en31Var2, z4, z3);
        huoVar2.a = null;
        huoVar2.b = null;
        huoVar2.f = 3;
        Object objY = fn31.Y((o8n) obj, es9Var, huoVar2);
        return objY == o8nVar ? o8nVar : objY;
    }
}
