package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b0i0 implements hx30, Function {
    public long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public b0i0(Context context, mmv0 mmv0Var, qxz0 qxz0Var, h4q h4qVar, zwz0 zwz0Var) {
        this.b = mmv0Var;
        this.c = qxz0Var;
        this.d = h4qVar;
        this.e = zwz0Var;
        Resources resources = context.getResources();
        this.a = fc11.Y((16.0f * resources.getDisplayMetrics().density) / resources.getDisplayMetrics().scaledDensity, 4294967296L);
    }

    public static n8b1 h() {
        return irn1.l0(0.45f, 3000.0f, (Object) null, 4);
    }

    public void a(iu30 iu30Var, boolean z, long j, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-118029646);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gra graVar = een.h;
            qim0 qim0VarH = u291.h(u291.v(dug.f(pqo.h(qim0Var, !z), j, er31.a), 32.0f), 32.0f);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new z20(z, iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = (i4 == 4) | (i3 == 32);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new z20(z, iu30Var, (byte) 28);
                x340Var.s0(objT2);
            }
            qim0 qim0VarN = anm1.N("add-reaction-button", bin.z(qim0VarH, (pm31) null, (String) null, function0, (Function0) objT2, 239));
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            tjx tjxVar = tjx.c;
            uwr uwrVar = cbx.a;
            w0h1.a(tjxVar, isl.a, u291.m(nim0.a, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, tjx.d | 432, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mvf(this, iu30Var, z, j, qim0Var, i);
        }
    }

    public Object apply(Object obj) {
        Single singleA;
        lag1 lag1Var = (lag1) this.b;
        t5y t5yVar = lag1Var.a;
        if (((Boolean) obj).booleanValue()) {
            return Single.error(new Throwable("Transcript excerpts are not available for static transcripts."));
        }
        String str = (String) this.c;
        long j = this.a;
        kag1 kag1Var = (kag1) this.d;
        if (kag1Var instanceof iag1) {
            singleA = t5yVar.b(str, j, ((iag1) kag1Var).a);
        } else {
            if (!(kag1Var instanceof jag1)) {
                eg.o();
                return null;
            }
            singleA = t5yVar.a(str, j, 70, 140);
        }
        return singleA.flatMap(new hdn1((byte) 11, lag1Var, (String) this.e));
    }

    public void b(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1745769950);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strC = ((mmv0) this.b).c(str);
            uwr uwrVar = cbx.a;
            uwo1.e(strC, qim0Var, lee1.a(cbx.d(x340Var).g, 0L, this.a, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 112, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0((Object) this, (Object) str, (Object) qim0Var, i, (byte) 12);
        }
    }

    public void c(int i, int i2, boolean z, b0k b0kVar, int i3) {
        p9m p9mVarP;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1509701204);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            if (i2 > i) {
                x340Var.i0(1389095563);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = gkz0.b1;
                    x340Var.s0(objT);
                }
                bby bbyVarA = xay.p(1, (iu30) objT).a(xay.e(3, (ni20) null));
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = gkz0.c1;
                    x340Var.s0(objT2);
                }
                p9mVarP = hm5.P(bbyVarA, xay.t(1, (iu30) objT2).a(xay.f(3, (ni20) null)));
                x340Var.r(false);
            } else {
                x340Var.i0(1389207659);
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = gkz0.d1;
                    x340Var.s0(objT3);
                }
                bby bbyVarA2 = xay.p(1, (iu30) objT3).a(xay.e(3, (ni20) null));
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = gkz0.e1;
                    x340Var.s0(objT4);
                }
                p9mVarP = hm5.P(bbyVarA2, xay.t(1, (iu30) objT4).a(xay.f(3, (ni20) null)));
                x340Var.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 8.0f, 12.0f, 8.0f, 1);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zI = x340Var.i(p9mVarP);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new fbz0(p9mVarP, (byte) 19);
                x340Var.s0(objT5);
            }
            hm5.a(numValueOf, qim0VarB, (iu30) objT5, (tl3) null, "counter", (iu30) null, apo.r(-36866954, new i301(this, z, (byte) 0), x340Var), x340Var, ((i4 >> 3) & 14) | 1597440, 40);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nnv(this, i, i2, z, i3);
        }
    }

    public void d(a401 a401Var, b0k b0kVar, int i) {
        ArrayList arrayListN0;
        float f;
        Object vvu0Var;
        c36 c36Var;
        List list;
        ven0 ven0Var;
        z301 z301Var = a401Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-278567946);
        int i2 = (x340Var.g(a401Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (z301Var.d.length() > 0) {
                List listSingletonList = Collections.singletonList(z301Var.d);
                c380 c380Var = z301Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (!u890.j((String) obj, z301Var.d)) {
                        arrayList.add(obj);
                    }
                }
                arrayListN0 = o7h.N0(arrayList, listSingletonList);
            } else {
                arrayListN0 = z301Var.b;
            }
            List listSubList = arrayListN0.subList(0, Math.min(3, arrayListN0.size()));
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            if (z301Var.c > 1) {
                x340Var.i0(-940475509);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 6.0f;
            } else {
                x340Var.i0(-940405108);
                cvx cvxVar4 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            }
            cvx cvxVar5 = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(12.0f, 8.0f, f, 8.0f);
            qim0 qim0VarD = o0c.d(nim0.a, irn1.l0(0.45f, 400.0f, (Object) null, 4), 2);
            c36 d36Var = new d36(-6.0f, true, new um5(false));
            boolean zG = x340Var.g(listSubList) | ((i2 & 14) == 4) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                c36Var = d36Var;
                list = listSubList;
                ven0Var = ven0Var2;
                vvu0Var = new vvu0(list, a401Var, this, ven0Var, (byte) 12);
                x340Var.s0(vvu0Var);
            } else {
                list = listSubList;
                c36Var = d36Var;
                vvu0Var = objT2;
                ven0Var = ven0Var2;
            }
            ujo1.e(qim0VarD, (xtb0) null, zzq0Var, c36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) vvu0Var, x340Var, 24576, 490);
            x340Var = x340Var;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new vk1(ven0Var, (lnm) null, (byte) 25);
                x340Var.s0(objT3);
            }
            qxd0.t(list, x340Var, (vu30) objT3);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(this, a401Var, i, (byte) 16);
        }
    }

    public void e(xyz0 xyz0Var, boolean z, boolean z2, iu30 iu30Var, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1130276927);
        int i2 = i | (x340Var.i(xyz0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(this) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            ss50 ss50Var = (ss50) x340Var.k(t4k.l);
            qim0 qim0VarH = pqo.h(nim0.a, !z2);
            long jH = xyz0Var.h(z, x340Var);
            cr31 cr31Var = er31.a;
            qim0 qim0VarF = dug.f(qim0VarH, jH, cr31Var);
            qqb qqbVarD = k1u.d(1.0f, xyz0Var.d(z, x340Var));
            qim0 qim0VarR = i1p1.r(o0c.d(d1u.F(qim0VarF, qqbVarD.a, qqbVarD.b, cr31Var), h(), 2));
            int i3 = i2 & 896;
            int i4 = i2 & 7168;
            boolean zI = (i3 == 256) | x340Var.i(ss50Var) | (i4 == 2048);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new vm1(z2, ss50Var, iu30Var);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = (i3 == 256) | (i4 == 2048);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new z20(z2, iu30Var, (byte) 29);
                x340Var.s0(objT2);
            }
            qim0 qim0VarN = anm1.N("reactions-button", bin.z(qim0VarR, (pm31) null, (String) null, function0, (Function0) objT2, 239));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pw31.a, x340Var, 54);
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new erc(this, xyz0Var, z, z2, iu30Var, j2iVar2, i);
        }
    }

    public void f(String str, boolean z, long j, c380 c380Var, String str2, vu30 vu30Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1492172344);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(c380Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.i(this) ? 8388608 : 4194304;
        }
        if (!b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else if (z) {
            b0kVar3.i0(-394449377);
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar3).f;
            int i3 = u85Var.e().b;
            boolean z2 = (i2 & 3670016) == 1048576;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 18);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            sy4.b((tl3) null, 0L, (Function0) objT, new nfv0(25, false, true, true), apo.r(-255383440, new qta0(function0, j, i3, this, str, c380Var, str2, vu30Var), b0kVar3), b0kVar2, 27648, 3);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.i0(-392178534);
            b0kVar2.r(false);
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new s9o(this, str, z, j, c380Var, str2, vu30Var, function0, i);
        }
    }

    public void g(a401 a401Var, xyz0 xyz0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        b0i0 b0i0Var;
        iu30 iu30Var2;
        nmv0 nmv0Var = (mmv0) this.b;
        z301 z301Var = a401Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-427319220);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(a401Var) : x340Var.i(a401Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(xyz0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarG = rwq.g(((zwz0) this.e).c(), Boolean.TRUE, (o8n) null, x340Var, 48, 2);
            boolean z2 = z301Var.h;
            String str = z301Var.d;
            boolean z3 = z2 && ((Boolean) ven0VarG.getValue()).booleanValue();
            Object objT = x340Var.T();
            boolean z4 = z3;
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = kaa0.h(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            int i3 = z301Var.c;
            x340Var.f0(1663105747, z301Var.a);
            fra fraVar = een.N0;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new r9y0(ven0Var, (byte) 2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = ern1.x(nim0.a, (iu30) objT2);
            int i4 = i2;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z5 = z301Var.d.length() > 0;
            boolean z6 = !z301Var.b.isEmpty() || z5;
            bby bbyVarE = xay.e(2, h());
            n8b1 n8b1VarL0 = irn1.l0(0.45f, 1200.0f, (Object) null, 4);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = k301.b;
                x340Var.s0(objT3);
            }
            boolean z7 = z5;
            fq7.f(z6, null, bbyVarE.a(xay.o(n8b1VarL0, (iu30) objT3)), xay.f(2, h()).a(xay.i(h(), (era) null, (iu30) null, 14)), null, apo.r(1537832181, new jjd0(this, xyz0Var, z5, z4, iu30Var, a401Var, i3), x340Var), x340Var, 1572870, 18);
            x340Var = x340Var;
            if (xyz0Var.g(z301Var.c)) {
                x340Var.i0(-473049297);
                b0i0Var = this;
                iu30Var2 = iu30Var;
                z = true;
                fq7.f(!z7, null, xay.e(2, h()), xay.f(2, h()), null, apo.r(524673168, new jaf(b0i0Var, iu30Var, z4, xyz0Var, i3), x340Var), x340Var, 1572870, 18);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                z = true;
                b0i0Var = this;
                iu30Var2 = iu30Var;
                x340Var.i0(-472443867);
                x340Var.r(false);
            }
            x340Var.r(z);
            boolean zG = x340Var.g(str);
            Object objT4 = x340Var.T();
            if (zG || objT4 == m4cVar) {
                x340Var.s0(str);
                objT4 = str;
            }
            String str2 = (String) objT4;
            String str3 = z301Var.a;
            boolean z8 = z;
            boolean z9 = a401Var.c;
            long j = ((Offset) ven0Var.getValue()).a;
            nmv0 nmv0Var2 = nmv0Var;
            c380 c380VarA = nmv0Var2.a();
            String strC = nmv0Var2.c(str2);
            int i5 = i4 & 896;
            boolean zI = x340Var.i(b0i0Var) | x340Var.g(str2) | (i5 == 256 ? z8 : false);
            Object objT5 = x340Var.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new ffx0(b0i0Var, str2, iu30Var2, (byte) 13);
                x340Var.s0(objT5);
            }
            vu30 vu30Var = (vu30) objT5;
            if (i5 != 256) {
                z8 = false;
            }
            Object objT6 = x340Var.T();
            if (z8 || objT6 == m4cVar) {
                objT6 = new j9z0(iu30Var2, (byte) 12);
                x340Var.s0(objT6);
            }
            b0i0Var.f(str3, z9, j, c380VarA, strC, vu30Var, (Function0) objT6, x340Var, 29360128 & (i4 << 12));
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(this, a401Var, xyz0Var, iu30Var, i, (byte) 18);
        }
    }

    public f4g1 i(r4g1 r4g1Var) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d;
        if (r4g1Var instanceof q4g1) {
            concurrentHashMap.put(((q4g1) r4g1Var).a, new g4g1(r4g1Var));
            return null;
        }
        if ((r4g1Var instanceof m4g1) || (r4g1Var instanceof n4g1)) {
            if (concurrentHashMap.remove(r4g1Var.getId()) == null) {
                return new f4g1("Terminal event without start detected: ".concat(ihc1.c1(15, r4g1Var.toString())), r4g1Var);
            }
            return null;
        }
        g4g1 g4g1Var = (g4g1) concurrentHashMap.get(r4g1Var.getId());
        if (g4g1Var == null) {
            return new f4g1("Event after a terminal event detected: ".concat(ihc1.c1(15, r4g1Var.toString())), r4g1Var);
        }
        ArrayList arrayList = g4g1Var.a;
        if (r4g1Var instanceof o4g1) {
            Map map = ((o4g1) r4g1Var).c.c;
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (nhc1.S(str, "Accept", true) && ihc1.h0(str2, "text/event-stream", true)) {
                        g4g1Var.b = true;
                        break;
                    }
                }
            }
        }
        if (arrayList.size() >= 20) {
            arrayList.remove(1);
        }
        arrayList.add(r4g1Var);
        return null;
    }

    public ArrayList j(long j, long j2) {
        Collection collectionValues = ((ConcurrentHashMap) this.d).values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((g4g1) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g4g1) it.next()).a);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            List list = (List) obj2;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (j - ((r4g1) it2.next()).getTimestamp() > j2);
            }
            arrayList3.add(obj2);
        }
        return arrayList3;
    }

    public void onFailure(Throwable th) {
        if (this != ((c0i0) this.e).e.p) {
            return;
        }
        oon1.H("Failed to load bitmap: " + th.getMessage());
    }

    public void onSuccess(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        e0i0 e0i0Var = ((c0i0) this.e).e;
        if (this != e0i0Var.p) {
            return;
        }
        e0i0Var.j.setMetadata(yzb0.f((tqh0) this.b, (String) this.c, (Uri) this.d, this.a, bitmap));
        fzh0 fzh0Var = e0i0Var.d;
        zoi1.c0(fzh0Var.o, new xyh0(fzh0Var, (byte) 2));
    }

    public b0i0(yqg yqgVar, v4g1 v4g1Var) {
        this.b = v4g1Var;
        this.c = yqgVar;
        this.d = new ConcurrentHashMap();
        this.e = new Object();
    }

    public b0i0(lag1 lag1Var, String str, long j, kag1 kag1Var, String str2) {
        this.b = lag1Var;
        this.c = str;
        this.a = j;
        this.d = kag1Var;
        this.e = str2;
    }

    public b0i0(c0i0 c0i0Var, tqh0 tqh0Var, String str, Uri uri, long j) {
        this.e = c0i0Var;
        this.b = tqh0Var;
        this.c = str;
        this.d = uri;
        this.a = j;
    }
}
