package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.home.funkispage.v1.proto.Animation;
import com.spotify.home.funkispage.v1.proto.Feed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class nyo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(cy cyVar, Function0 function0, qim0 qim0Var, idn0 idn0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        idn0 idn0Var2;
        idn0 idn0Var3;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-805658081);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 = i2 | 1408;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = ktd.n(x340Var);
                }
                idn0Var3 = (idn0) objT;
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                idn0Var3 = idn0Var;
            }
            x340Var.s();
            ven0 ven0VarM = k1u.m(idn0Var3, x340Var, 0);
            tob1 tob1VarB = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.97f : 1.0f, (fe5) null, "scale", (iu30) null, x340Var, 3072, 22);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0VarM.getValue()).booleanValue() ? 0.8f : 1.0f, (fe5) null, "alpha", (iu30) null, x340Var, 3072, 22);
            qim0 qim0VarH = u291.h(u291.v(qim0Var3, 343.0f), 206.0f);
            boolean zI = x340Var.i(tob1VarB2) | x340Var.i(tob1VarB);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new dy(tob1VarB2, tob1VarB, (byte) 0);
                x340Var.s0(objT2);
            }
            qim0 qim0VarN = anm1.N("card", i541.C(qim0VarH, (iu30) objT2));
            String strO0 = cwl1.o0(x340Var, 2131953450);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            idn0 idn0Var4 = idn0Var3;
            cwl1.b(qim0VarN, (tl3) null, er31.b(16.0f), mgx.e, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, idn0Var4, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(-402245290, new o2(cyVar, b2), x340Var), x340Var, 0, 48, 1378);
            x340Var = x340Var;
            qim0Var2 = qim0Var3;
            idn0Var2 = idn0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            idn0Var2 = idn0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8((byte) 1, i, cyVar, function0, idn0Var2, qim0Var2);
        }
    }

    public static final void b(String str, String str2, String str3, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        boolean z2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1691308370);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0Var);
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
            if (z) {
                b0kVar3.i0(468053671);
                z2 = true;
                vbe.s(str3, (qim0) null, 0L, 0L, (lee1) null, false, b0kVar3, (i2 >> 6) & 14, 62);
                b0kVar3.r(false);
            } else {
                z2 = true;
                b0kVar3.i0(468126800);
                uwr uwrVar = cbx.a;
                uwo1.e(str3, null, cbx.d(b0kVar3).n, cbx.a(b0kVar3).b.a, null, null, 2, false, new cjc0(1), 0, null, b0kVar3, (i2 >> 6) & 14, 0, 1714);
                b0kVar3.r(false);
            }
            pbh pbhVar = pbh.a;
            nim0 nim0Var = nim0.a;
            op71.g(b0kVar3, pbhVar.a(1.0f, nim0Var, z2));
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, null, cbx.d(b0kVar3).e, cbx.a(b0kVar3).b.a, null, null, 2, false, new cjc0(3), 0, null, b0kVar3, i2 & 14, 0, 1714);
            uwo1.e(str2, null, kk0.p(nim0Var, 6.0f, b0kVar3, b0kVar3).j, cbx.a(b0kVar3).b.a, null, null, 2, false, new cjc0(3), 0, null, b0kVar3, (i2 >> 3) & 14, 0, 1714);
            b0kVar2 = b0kVar3;
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, z2));
            b0kVar2.r(z2);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((byte) 0, i, (Object) str, (Object) str2, (Object) str3, qim0Var, z);
        }
    }

    public static final void c(String str, String str2, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1042176454);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarN = anm1.N("mainImage", qim0Var3);
            u5j1 u5j1Var = d4o1.a;
            if (z2) {
                qim0VarN = qim0VarN.then(fc11.n(qim0Var3, 10.0f, 10.0f, u5j1Var));
            }
            Uri uri = Uri.parse(str);
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            ecx ecxVarC = uwr.c();
            isl islVar = isl.a;
            eso1.e(uri, islVar, qim0VarN, (p3v) null, (zvx) null, ecxVarC, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 27696, 0, 3968);
            h2c h2cVar = h2c.a;
            op71.g(x340Var, dug.f(h2cVar.b(qim0Var3), u7h.b(u7h.b, 0.7f, 0.0f, 0.0f, 0.0f, 14), u5j1Var));
            qim0 qim0VarA = h2cVar.a(qim0Var3, een.h);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarN2 = anm1.N("previewSpinner", h2cVar.b(qim0Var3));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fy.h;
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean z5 = (i2 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z5 || objT2 == m4cVar) {
                z3 = z;
                objT2 = new gy((byte) 0, z3);
                x340Var.s0(objT2);
            } else {
                z3 = z;
            }
            dm5.a(iu30Var, qim0VarN2, (iu30) objT2, x340Var, 6, 0);
            eso1.e(Uri.parse(str2), islVar, anm1.N("previewImage", i1p1.q(uyn1.x(qim0Var3, 4.0f), er31.a)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            z3 = z;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(str, str2, z3, z2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void d(p220 p220Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        Object next;
        String str;
        char c;
        char c2;
        nex nexVar;
        String str2 = p220Var.d;
        c380 c380Var = p220Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1185486887);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(p220Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Iterator it = c380Var.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((m4g) next).b, str2));
            m4g m4gVar = (m4g) next;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE2, lljVar4, 474124829, c380Var);
            while (itN.hasNext()) {
                m4g m4gVar2 = (m4g) itN.next();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                nim0 nim0Var2 = nim0Var;
                qim0 qim0VarB2 = uyn1.B(nim0Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                boolean zG = ((i2 & 112) == 32) | x340Var.g(m4gVar2) | ((i2 & 14) == 4);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    c = 16;
                    objT = new d1c(iu30Var, m4gVar2, p220Var, (byte) 16);
                    x340Var.s0(objT);
                } else {
                    c = 16;
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT);
                if (u890.j(m4gVar2.b, str2)) {
                    c2 = 4;
                    nexVar = new nex(4);
                } else {
                    c2 = 4;
                    nexVar = pex.b;
                }
                int i3 = i2;
                x340 x340Var2 = x340Var;
                poo1.e(gbxVar, nexVar, yoo1.z(x340Var), qim0VarB2, 0, null, null, null, null, null, null, false, null, apo.r(-478842591, new qff(m4gVar2, (byte) 7), x340Var), x340Var2, 0, 3072, 8176);
                m4gVar = m4gVar;
                x340Var = x340Var2;
                i2 = i3;
                nim0Var = nim0Var2;
                str2 = str2;
            }
            m4g m4gVar3 = m4gVar;
            x340Var.r(false);
            x340Var.r(true);
            if (m4gVar3 == null || (str = m4gVar3.c) == null) {
                str = "";
            }
            x340 x340Var3 = x340Var;
            uwo1.e(str, null, null, 0L, null, null, 0, false, null, 0, null, x340Var3, 0, 0, 2046);
            x340Var = x340Var3;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(p220Var, iu30Var, qim0Var, i, (byte) 17);
        }
    }

    public static final void e(hux huxVar, b0k b0kVar, int i) {
        hux huxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(58066559);
        int i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            huxVar2 = huxVar;
            w0h1.a(huxVar2, isl.a, (qim0) null, cbx.a(x340Var).b.c, 0L, false, x340Var, 56 | (i2 & 14), 52);
        } else {
            huxVar2 = huxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u9o(huxVar2, i, b2);
        }
    }

    public static final void f(String str, zsu0 zsu0Var, qxc0 qxc0Var, ArrayList arrayList, r3d0 r3d0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2083073071);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(zsu0Var) ? 32 : 16) | (x340Var2.i(qxc0Var) ? 256 : 128) | (x340Var2.i(arrayList) ? 2048 : 1024) | (x340Var2.i(r3d0Var) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | 1572864;
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = r3d0Var.c(str);
                x340Var2.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, u2d0.a, null, x340Var2, 0, 2);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var2);
                x340Var2.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            boolean zG = x340Var2.g(qxc0Var);
            Object objT3 = x340Var2.T();
            Object obj = objT3;
            if (zG || objT3 == m4cVar) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((tha1) obj2).e(qxc0Var)) {
                        arrayList2.add(obj2);
                    }
                }
                x340Var2.s0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            uvx uvxVar = new uvx((pgx) null, 2, (tvx) null, (p3v) null, 26);
            kiv kivVar = xce0.a;
            gce0 gce0Var = gce0.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarI = zr7.i(qim0Var3, gce0Var);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarC = hqq0.C(lhc.g(x340Var2).g, x340Var2);
            boolean zI = ((i2 & 14) == 4) | x340Var2.i(uvxVar) | x340Var2.i(list) | x340Var2.i(ven0VarG) | x340Var2.i(qxc0Var) | x340Var2.i(c9nVar) | ((i2 & 458752) == 131072) | ((i2 & 112) == 32) | x340Var2.i(r3d0Var);
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                vd6 vd6Var = new vd6(list, uvxVar, qxc0Var, c9nVar, str, function0, zsu0Var, r3d0Var, ven0VarG, (byte) 7);
                x340Var2.s0(vd6Var);
                objT4 = vd6Var;
            }
            ujo1.d(qim0VarI, xtb0VarA, vk80VarC, false, null, null, null, false, null, (iu30) objT4, x340Var2, 0, 504);
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(str, zsu0Var, qxc0Var, arrayList, r3d0Var, function0, qim0Var2, i, (byte) 24);
        }
    }

    public static final void g(kct0 kct0Var, qim0 qim0Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(110152475);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(kct0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            fq7.g(((Boolean) ven0Var.getValue()).booleanValue(), (qim0) null, (bby) null, xay.l(13, (ni20) null).a(xay.f(3, (ni20) null)), (String) null, apo.r(1627845955, new c9y(kct0Var, iu30Var, ven0Var, function0), x340Var), x340Var, 196608, 22);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(kct0Var, qim0Var2, function0, iu30Var, i, (byte) 4);
        }
    }

    public static final void h(o17 o17Var, gw70 gw70Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(956417126);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(o17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mod.b(oi7.a.a(gw70Var), apo.r(1253095334, new kpw0((Object) o17Var, (Object) qim0Var, (byte) 26), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(o17Var, gw70Var, qim0Var, i, (byte) 17);
        }
    }

    public static final void i(q571 q571Var, qim0 qim0Var, lee1 lee1Var, b0k b0kVar, int i) {
        long j;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1563179966);
        int i2 = i | (x340Var.g(q571Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.g(lee1Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarB = u291.b(0.0f, 74.0f, 1, anm1.N("destination", qim0Var));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nim0 nim0Var = nim0.a;
            w3p1.c(q571Var.d, anm1.N("destination.icon", nim0Var), q571Var.c, apo.r(1367526979, new u841(q571Var, (byte) 21), x340Var), x340Var, 3120, 0);
            if (q571Var.c) {
                x340Var.i0(1374586207);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(1374634908);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            }
            long j2 = j;
            String strO0 = cwl1.o0(x340Var, q571Var.a);
            String strO1 = cwl1.o0(x340Var, 2131959113);
            zma1 zma1VarA = zma1.a(cbx.d(x340Var).k.a, cbx.a(x340Var).b.g, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534);
            boolean zG = x340Var.g(strO1) | x340Var.g(strO0) | x340Var.g(zma1VarA);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                ye5 ye5Var = new ye5();
                int iO = ye5Var.o(zma1VarA);
                try {
                    ye5Var.g(strO1);
                    ye5Var.k(iO);
                    ye5Var.g(" • ");
                    ye5Var.g(strO0);
                    objT = ye5Var.p();
                    x340Var.s0(objT);
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            }
            CharSequence af5Var = (af5) objT;
            if (q571Var.e) {
                z = true;
            } else {
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM = xvj1.m();
                new ArrayList();
                sb.append(strO0);
                String string = sb.toString();
                ArrayList arrayList = new ArrayList(arrayListM.size());
                int size = arrayListM.size();
                for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                }
                z = true;
                af5Var = new af5(string, arrayList);
            }
            CharSequence charSequence = af5Var;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = rq61.d1;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(nim0Var, false, (iu30) objT2);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.d(charSequence, j2, uyn1.B(qim0VarB2, 0.0f, 6.0f, 0.0f, 0.0f, 13), lee1Var, new a0e1(3), null, 2, ihc1.i0(charSequence, ' '), new cjc0(2), 2, null, null, x340Var, ((i2 << 3) & 7168) | 806879232, 0, 3104);
            x340Var = x340Var;
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(q571Var, qim0Var, lee1Var, i, (byte) 28);
        }
    }

    public static final void j(y341 y341Var) {
        smc0 smc0VarN = k4p1.n();
        d441 d441VarG1 = y341Var.g1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (d441VarG1.f1()) {
            try {
                smc0VarN.add(d441VarG1.P0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o0c.v(d441VarG1, th);
                    throw th2;
                }
            }
        }
        o0c.v(d441VarG1, (Throwable) null);
        rmc0 rmc0VarListIterator = k4p1.k(smc0VarN).listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                return;
            }
            String str = (String) rmc0Var.next();
            if (nhc1.Y(str, "room_fts_content_sync_", false)) {
                qxy0.s(y341Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static final go80 k(klm klmVar, ubp0 ubp0Var, obp0 obp0Var, ubp0 ubp0Var2) {
        return klmVar.a("HomeRefreshPubSubListener", new iyo0(ubp0Var, obp0Var, ubp0Var2, (byte) 17));
    }

    public static Object l(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final uhd1 m(xse xseVar, c380 c380Var, b0k b0kVar) {
        df41 df41Var = j2h1.b;
        m4c m4cVar = fkj0.X;
        Object[] objArr = {c380Var};
        x340 x340Var = (x340) b0kVar;
        boolean zI = x340Var.i(df41Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new qd81(1, (byte) 22);
            x340Var.s0(objT);
        }
        iu30 iu30Var = (iu30) objT;
        boolean zI2 = x340Var.i(xseVar) | x340Var.i(c380Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new ccb1(xseVar, c380Var, (byte) 25);
            x340Var.s0(objT2);
        }
        return xfo1.n(objArr, iu30Var, (iu30) objT2, x340Var, 0, 4);
    }

    public static final bq10 n(Feed feed) {
        aq10 aq10Var;
        String id = feed.getId();
        String name = feed.getName();
        String id2 = feed.getId();
        List<Feed> childrenList = feed.getChildrenList();
        ArrayList arrayList = new ArrayList(q7h.U(childrenList, 10));
        for (Feed feed2 : childrenList) {
            feed2.getClass();
            arrayList.add(n(feed2));
        }
        int iOrdinal = feed.q().ordinal();
        zp10 zp10Var = null;
        if (iOrdinal == 0) {
            aq10Var = null;
        } else if (iOrdinal == 1) {
            aq10Var = aq10.b;
        } else if (iOrdinal == 2) {
            aq10Var = aq10.a;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                eg.o();
                return null;
            }
            aq10Var = null;
        } else {
            aq10Var = aq10.c;
        }
        String strP = feed.p();
        if (ihc1.y0(strP)) {
            strP = null;
        }
        if (feed.r()) {
            Animation animationO = feed.o();
            zp10Var = new zp10(animationO.p(), animationO.q());
        }
        return new bq10(id, name, id2, arrayList, aq10Var, strP, zp10Var);
    }
}
