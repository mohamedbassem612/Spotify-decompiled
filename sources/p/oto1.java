package p;

import android.os.Bundle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class oto1 {
    public static b180 a;

    public static final void a(fjf fjfVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String strN0;
        af5 af5VarP;
        m4c m4cVar = fkj0.X;
        String str = fjfVar.a;
        boolean z = fjfVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-387677100);
        int i2 = i | (x340Var.g(fjfVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                x340Var.i0(-121191089);
                strN0 = cwl1.n0(2131953703, new Object[]{str}, x340Var);
                x340Var.r(false);
            } else {
                x340Var.i0(-121091176);
                strN0 = cwl1.n0(2131953702, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            boolean z2 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new ggf(iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            x340Var.i0(-338683670);
            if (z) {
                x340Var.i0(-846795592);
                x340Var.r(false);
                ye5 ye5Var = new ye5();
                ye5Var.g(cwl1.o0(x340Var, 2131953701));
                ye5Var.g(" ");
                String strO0 = cwl1.o0(x340Var, 2131953685);
                uwr uwrVar = cbx.a;
                FontFamily fontFamily = cbx.d(x340Var).n.a.f;
                zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).n.a.c, cbx.d(x340Var).n.a.d, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65490);
                boolean zG = x340Var.g(function0);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new vj0(function0, (byte) 14);
                    x340Var.s0(objT2);
                }
                vhg.a(ye5Var, strO0, "manageSocialSettings", zma1Var, (iu30) objT2);
                af5VarP = ye5Var.p();
            } else {
                x340Var.i0(-846872472);
                af5VarP = new af5(cwl1.o0(x340Var, 2131953701));
                x340Var.r(false);
            }
            x340Var.r(false);
            af5 af5Var = af5VarP;
            qim0 qim0Var3 = nim0.a;
            o6p1.b(strN0, af5Var, anm1.N("chat-request-received-view-test-tag", qim0Var3), apo.r(-930102777, new ip0(iu30Var, (byte) 9), x340Var), x340Var, 3072, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(fjfVar, iu30Var, qim0Var2, i, (byte) 11);
        }
    }

    public static final void b(String str, String str2, c380 c380Var, c380 c380Var2, dvp dvpVar, kko kkoVar, xj1 xj1Var, h4l0 h4l0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        float f;
        qim0 qim0Var2;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1797284669);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(c380Var) ? 256 : 128) | (x340Var2.g(c380Var2) ? 2048 : 1024) | (x340Var2.i(dvpVar) ? 16384 : 8192) | (x340Var2.i(kkoVar) ? 131072 : 65536) | (x340Var2.i(xj1Var) ? 1048576 : 524288) | (x340Var2.i(h4l0Var) ? 8388608 : 4194304);
        if (x340Var2.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            boolean z2 = str2.length() > 0;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            if (z2) {
                x340Var2.i0(-40762161);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 2.0f;
            } else {
                x340Var2.i0(-40760402);
                cvx cvxVar5 = cbx.b(x340Var2).b;
                x340Var2.r(false);
                f = 12.0f;
            }
            zzq0 zzq0Var = new zzq0(16.0f, 4.0f, 16.0f, f);
            qim0 qim0Var3 = nim0.a;
            boolean z3 = z2;
            uwo1.e(str, uyn1.w(qim0Var3, zzq0Var), lee1Var, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1720);
            x340 x340Var3 = x340Var2;
            if (z3) {
                x340Var3.i0(-1263401960);
                cvx cvxVar6 = cbx.b(x340Var3).b;
                cvx cvxVar7 = cbx.b(x340Var3).b;
                cvx cvxVar8 = cbx.b(x340Var3).b;
                qim0Var2 = qim0Var3;
                uwo1.e(str2, uyn1.w(qim0Var2, uyn1.j(16.0f, 0.0f, 16.0f, 12.0f, 2)), cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var3, (i2 >> 3) & 14, 0, 1712);
                x340Var3 = x340Var3;
                z = false;
                x340Var3.r(false);
            } else {
                qim0Var2 = qim0Var3;
                z = false;
                x340Var3.i0(-1262931845);
                x340Var3.r(false);
            }
            avw0 avw0Var = cbx.b(x340Var3).c;
            op71.g(x340Var3, dug.f(u291.f(u291.h(qim0Var2, 1.0f), 1.0f), cbx.a(x340Var3).a.b.c(), d4o1.a));
            boolean zI = x340Var3.i(h4l0Var);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new fnn(h4l0Var, (byte) 10);
                x340Var3.s0(objT);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(x340Var3).g, 32), x340Var3);
            boolean zI2 = x340Var3.i(dvpVar) | ((i2 & 896) != 256 ? z : true) | x340Var3.i(kkoVar) | ((i2 & 7168) == 2048 ? true : z) | x340Var3.i(xj1Var);
            Object objT2 = x340Var3.T();
            if (zI2 || objT2 == m4cVar) {
                uh0 uh0Var = new uh0(c380Var, c380Var2, dvpVar, kkoVar, xj1Var, (byte) 17);
                x340Var3.s0(uh0Var);
                objT2 = uh0Var;
            }
            x340 x340Var4 = x340Var3;
            s3o1.d(null, null, vk80VarX, null, null, null, false, h3h1Var, (iu30) objT2, x340Var4, 0, 251);
            x340Var = x340Var4;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(str, str2, c380Var, c380Var2, dvpVar, kkoVar, xj1Var, h4l0Var, qim0Var, i, (byte) 3);
        }
    }

    public static final void c(Object obj, o0i o0iVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1267963369);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            boolean zG = x340Var.g((iu30) ven0VarS.getValue());
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new abc0();
                ((iu30) ven0VarS.getValue()).invoke(objT);
                x340Var.s0(objT);
            }
            abc0 abc0Var = (abc0) objT;
            p811 p811Var = new p811();
            boolean zG2 = x340Var.g(obj);
            Object objT2 = x340Var.T();
            Object obj2 = null;
            if (zG2 || objT2 == m4cVar) {
                x340Var.s0((Object) null);
                objT2 = null;
            }
            p811Var.a = objT2;
            p811 p811Var2 = new p811();
            boolean zG3 = x340Var.g(obj);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                x340Var.s0((Object) null);
                objT3 = null;
            }
            p811Var2.a = objT3;
            p811 p811Var3 = new p811();
            boolean zG4 = x340Var.g(obj);
            Object objT4 = x340Var.T();
            if (zG4 || objT4 == m4cVar) {
                x340Var.s0((Object) null);
            } else {
                obj2 = objT4;
            }
            p811Var3.a = obj2;
            cbc0.a(o0iVar.b, obj, new uh0(p811Var3, p811Var2, p811Var, abc0Var, o0iVar, (byte) 29), x340Var, (i3 << 3) & 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ri60(obj, o0iVar, iu30Var, i, (byte) 22);
        }
    }

    public static final void d(fpi0 fpi0Var, gw70 gw70Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1312286951);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fpi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(nim0.a) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (fpi0Var.c.equals(lpi0.a)) {
            x340Var.i0(-1547986534);
            e(fpi0Var, gw70Var, iu30Var, x340Var, i2 & 8190);
            w5p1.d(null, x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(1612636889);
            e(fpi0Var, gw70Var, iu30Var, x340Var, i2 & 8190);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jpi0(fpi0Var, gw70Var, iu30Var, i, (byte) 0);
        }
    }

    public static final void e(fpi0 fpi0Var, gw70 gw70Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1286845369);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fpi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            irn1.u(nim0Var, apo.r(-822622042, new k2g0(iu30Var, (byte) 6), x340Var), null, null, apo.r(1270758688, new iwf0(fpi0Var, gw70Var, iu30Var, b), x340Var), x340Var, ((i2 >> 9) & 14) | 24624, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jpi0(fpi0Var, gw70Var, iu30Var, i, (byte) 1);
        }
    }

    public static final void f(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(141233197);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131952134);
            gbx gbxVar = new gbx(z50.c, function0);
            kdx kdxVar = kdx.c;
            gdx gdxVarS = yla.s(x340Var);
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, kdxVar, anm1.N("RealtimeVoice.Start", qim0Var3), jax.a, gdxVarS, null, false, null, null, apo.r(-2070355708, new p9y0(strO0, (byte) 7), x340Var), x340Var, 0, 6, 968);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 27);
        }
    }

    public static final boolean g(mrs0 mrs0Var, mrs0 mrs0Var2) {
        if (mrs0Var == null && mrs0Var2 == null) {
            return true;
        }
        if (mrs0Var == null || mrs0Var2 == null) {
            return false;
        }
        String str = mrs0Var.d;
        String str2 = mrs0Var2.d;
        if (str == null && str2 == null) {
            return u890.j(Objects.toString(mrs0Var.a), Objects.toString(mrs0Var2.a)) && u890.j(mrs0Var.c, mrs0Var2.c) && mrs0Var.e == mrs0Var2.e && mrs0Var.f == mrs0Var2.f;
        }
        return u890.j(str, str2);
    }

    public static final Bundle k(Bundle bundle, List list, vu30 vu30Var) {
        pih0 pih0Var = pih0.b;
        if (bundle == null) {
            vu30Var.invoke(pih0Var, "extras is null");
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!bundle.containsKey(str)) {
                vu30Var.invoke(pih0Var, "'" + str + "' is required");
                return null;
            }
        }
        return bundle;
    }

    public static zvx l(b0k b0kVar) {
        uwr uwrVar = cbx.a;
        cua cuaVar = cbx.b(b0kVar).f;
        cua cuaVar2 = cbx.b(b0kVar).f;
        return new zvx();
    }

    public static Shadow m() {
        return Shadow.d;
    }

    public static final int n(mrs0 mrs0Var) {
        if (mrs0Var == null) {
            return 0;
        }
        String str = mrs0Var.d;
        return str != null ? str.hashCode() : Objects.hash(mrs0Var.a, mrs0Var.c, Boolean.valueOf(mrs0Var.e), Boolean.valueOf(mrs0Var.f));
    }

    public static int o(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int p(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return o(b, bArr[i]);
        }
        if (i3 != 2) {
            hhg1.c();
            return 0;
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static final io80 q(klm klmVar, edp0 edp0Var) {
        return klmVar.b("CampfireVideoStorageService", new nap0(edp0Var, (byte) 12));
    }

    public static final boolean r(np21 np21Var) {
        List list;
        return np21Var == null || (list = np21Var.a) == null || list.isEmpty();
    }

    public static int s(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return p(i3, bArr, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return p(i3, bArr, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static final Integer t(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str));
        }
        return null;
    }

    public static final float w(float f, int i, b0k b0kVar) {
        return ((wat) ((x340) b0kVar).k(t4k.h)).N0(i * f);
    }

    public static final float x(float f, b0k b0kVar) {
        return ((wat) ((x340) b0kVar).k(t4k.h)).N0(f);
    }

    public boolean h(t9 t9Var, o9 o9Var, o9 o9Var2) {
        synchronized (t9Var) {
            try {
                if (t9Var.b != o9Var) {
                    return false;
                }
                t9Var.b = o9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean i(t9 t9Var, Object obj, Object obj2) {
        synchronized (t9Var) {
            try {
                if (t9Var.a != obj) {
                    return false;
                }
                t9Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean j(t9 t9Var, s9 s9Var, s9 s9Var2) {
        synchronized (t9Var) {
            try {
                if (t9Var.c != s9Var) {
                    return false;
                }
                t9Var.c = s9Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void u(s9 s9Var, s9 s9Var2) {
        s9Var.b = s9Var2;
    }

    public void v(s9 s9Var, Thread thread) {
        s9Var.a = thread;
    }
}
