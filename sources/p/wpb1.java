package p;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.listplatform.contextmenu.ItemUnavailableException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class wpb1 {
    public static final e5h1 a = new e5h1((byte) 5, true);
    public static final e5h1 b = new e5h1((byte) 1, true);
    public static final e5h1 c = new e5h1((byte) 3, false);
    public static final e5h1 d = new e5h1((byte) 2, true);
    public static final e5h1 e = new e5h1((byte) 4, true);
    public static final e5h1 f = new e5h1((byte) 6, true);
    public static final e5h1 g = new e5h1((byte) 7, false);
    public static final l590 h = new l590(true);
    public static b180 i;

    public static final void A(oyf0 oyf0Var) {
        oyf0Var.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(d0r d0rVar, bbn0 bbn0Var, onm onmVar) {
        gbn0 gbn0Var;
        if (onmVar instanceof gbn0) {
            gbn0Var = (gbn0) onmVar;
            int i2 = gbn0Var.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gbn0Var.b = i2 - Integer.MIN_VALUE;
            } else {
                gbn0Var = new gbn0(onmVar);
            }
        } else {
            gbn0Var = new gbn0(onmVar);
        }
        Object objJ = gbn0Var.a;
        int i3 = gbn0Var.b;
        if (i3 == 0) {
            hm5.M(objJ);
            wbn0.Y.getClass();
            ay8 ay8VarF = d3p1.F(d0rVar, wbn0.N0, bbn0Var);
            fca0 fca0Var = new fca0(2, null, (byte) 27);
            gbn0Var.b = 1;
            objJ = b5p1.j(ay8VarF, fca0Var, gbn0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (i1rVar instanceof i1r) {
            return new jbn0((qbn0) i1rVar.a);
        }
        if ((i1rVar instanceof h1r) || u890.j(i1rVar, j1r.a)) {
            return ibn0.a;
        }
        eg.o();
        return null;
    }

    public static final ipb1 C(String str, maa maaVar, Object obj, b0k b0kVar, int i2, int i3) {
        boolean z = true;
        Object[] objArr = (i3 & 8) != 0 ? new Object[0] : new String[]{str};
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        mqw behavior = maaVar.getBehavior();
        g521 g521Var = new g521(behavior, (byte) 18);
        mc41 mc41VarC = behavior.c();
        df41 df41Var = new df41(new vvu0(g521Var, str, obj, mc41VarC, (byte) 25), new u841(mc41VarC, (byte) 2));
        boolean z2 = (((i2 & 112) ^ 48) > 32 && ((x340) b0kVar).i(maaVar)) || (i2 & 48) == 32;
        if ((((i2 & 14) ^ 6) <= 4 || !((x340) b0kVar).g(str)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z3 = z2 | z;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (z3 || objT == fkj0.X) {
            objT = new rl21(maaVar, str, (byte) 9);
            x340Var.s0(objT);
        }
        return (ipb1) k5p1.t(objArrCopyOf, df41Var, str, (Function0) objT, x340Var, (i2 << 6) & 896, 0);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[PHI: r3
      0x0042: PHI (r3v9 p.maa) = (r3v4 p.maa), (r3v10 p.maa) binds: [B:17:0x0040, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d A[PHI: r4
      0x005d: PHI (r4v16 java.lang.Object) = (r4v6 java.lang.Object), (r4v17 java.lang.Object) binds: [B:27:0x005b, B:23:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    public static final ipb1 D(String str, maa maaVar, Object obj, b0k b0kVar, int i2) {
        maa maaVar2;
        boolean z;
        Object obj2;
        boolean z2;
        boolean z3;
        Object objT;
        Function0 function0;
        boolean zG;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        qe41 qe41Var = (qe41) x340Var.k(lge0.a);
        int i3 = (i2 & 14) ^ 6;
        boolean zI = ((i3 > 4 && x340Var.g(str)) || (i2 & 6) == 4) | x340Var.i(qe41Var);
        if (((i2 & 112) ^ 48) > 32) {
            maaVar2 = maaVar;
            if (x340Var.i(maaVar2)) {
                z = true;
            }
            boolean z4 = zI | z;
            if (((i2 & 896) ^ 384) > 256) {
                obj2 = obj;
                if (!x340Var.i(obj2)) {
                    z2 = true;
                }
                z3 = z4 | z2;
                objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    odp0 odp0Var = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
                    x340Var.s0(odp0Var);
                    objT = odp0Var;
                }
                function0 = (Function0) objT;
                Object[] objArr = {str};
                mc41 mc41VarC = maaVar.getBehavior().c();
                df41 df41Var = new df41(new vvu0(function0, str, obj, mc41VarC, (byte) 25), new u841(mc41VarC, (byte) 2));
                zG = x340Var.g(function0) | ((i3 <= 4 && x340Var.g(str)) || (i2 & 6) == 4);
                objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new rl21(function0, str, (byte) 10);
                    x340Var.s0(objT2);
                }
                return (ipb1) k5p1.t(objArr, df41Var, str, (Function0) objT2, x340Var, (i2 << 6) & 896, 0);
            }
            obj2 = obj;
            if ((i2 & 384) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = z4 | z2;
            objT = x340Var.T();
            if (z3) {
                odp0 odp0Var2 = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
                x340Var.s0(odp0Var2);
                objT = odp0Var2;
            } else {
                odp0 odp0Var3 = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
                x340Var.s0(odp0Var3);
                objT = odp0Var3;
            }
            function0 = (Function0) objT;
            Object[] objArr2 = {str};
            mc41 mc41VarC2 = maaVar.getBehavior().c();
            df41 df41Var2 = new df41(new vvu0(function0, str, obj, mc41VarC2, (byte) 25), new u841(mc41VarC2, (byte) 2));
            zG = x340Var.g(function0) | ((i3 <= 4 && x340Var.g(str)) || (i2 & 6) == 4);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new rl21(function0, str, (byte) 10);
                x340Var.s0(objT2);
            } else {
                objT2 = new rl21(function0, str, (byte) 10);
                x340Var.s0(objT2);
            }
            return (ipb1) k5p1.t(objArr2, df41Var2, str, (Function0) objT2, x340Var, (i2 << 6) & 896, 0);
        }
        maaVar2 = maaVar;
        if ((i2 & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean z5 = zI | z;
        if (((i2 & 896) ^ 384) > 256) {
            obj2 = obj;
            if (!x340Var.i(obj2)) {
                z2 = true;
            }
            z3 = z5 | z2;
            objT = x340Var.T();
            if (z3) {
                odp0 odp0Var4 = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
                x340Var.s0(odp0Var4);
                objT = odp0Var4;
            } else {
                odp0 odp0Var5 = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
                x340Var.s0(odp0Var5);
                objT = odp0Var5;
            }
            function0 = (Function0) objT;
            Object[] objArr3 = {str};
            mc41 mc41VarC3 = maaVar.getBehavior().c();
            df41 df41Var3 = new df41(new vvu0(function0, str, obj, mc41VarC3, (byte) 25), new u841(mc41VarC3, (byte) 2));
            zG = x340Var.g(function0) | ((i3 <= 4 && x340Var.g(str)) || (i2 & 6) == 4);
            objT2 = x340Var.T();
            if (zG) {
                objT2 = new rl21(function0, str, (byte) 10);
                x340Var.s0(objT2);
            } else {
                objT2 = new rl21(function0, str, (byte) 10);
                x340Var.s0(objT2);
            }
            return (ipb1) k5p1.t(objArr3, df41Var3, str, (Function0) objT2, x340Var, (i2 << 6) & 896, 0);
        }
        obj2 = obj;
        if ((i2 & 384) == 256) {
            z2 = true;
        } else {
            z2 = false;
        }
        z3 = z5 | z2;
        objT = x340Var.T();
        if (z3) {
            odp0 odp0Var6 = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
            x340Var.s0(odp0Var6);
            objT = odp0Var6;
        } else {
            odp0 odp0Var7 = new odp0(str, qe41Var, maaVar2, obj2, (byte) 12);
            x340Var.s0(odp0Var7);
            objT = odp0Var7;
        }
        function0 = (Function0) objT;
        Object[] objArr4 = {str};
        mc41 mc41VarC4 = maaVar.getBehavior().c();
        df41 df41Var4 = new df41(new vvu0(function0, str, obj, mc41VarC4, (byte) 25), new u841(mc41VarC4, (byte) 2));
        zG = x340Var.g(function0) | ((i3 <= 4 && x340Var.g(str)) || (i2 & 6) == 4);
        objT2 = x340Var.T();
        if (zG) {
            objT2 = new rl21(function0, str, (byte) 10);
            x340Var.s0(objT2);
        } else {
            objT2 = new rl21(function0, str, (byte) 10);
            x340Var.s0(objT2);
        }
        return (ipb1) k5p1.t(objArr4, df41Var4, str, (Function0) objT2, x340Var, (i2 << 6) & 896, 0);
    }

    public static final bs50 E(ud4 ud4Var) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new bs50(ds50.a(mainLooper));
        }
        eg.m("The main looper is not available");
        return null;
    }

    public static final void a(loy loyVar, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        byte b2;
        qim0 qim0Var2;
        cr31 cr31VarB;
        qim0 qim0Var3;
        int i4 = loyVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(762716098);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(loyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if (x340Var.Y(i5 & 1, (i5 & 19) != 18)) {
            float fM = dsa0.m(x340Var, 2131165956);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            qim0 qim0Var4 = nim0.a;
            if (i4 == 3) {
                x340Var.i0(1698529168);
                doy doyVar = loyVar.k;
                if (doyVar != null) {
                    x340Var.i0(1698600499);
                    ton1.f(1, 0, 3072, 16, doyVar.a, doyVar.b, x340Var, u291.r(qim0Var4, fM));
                    x340Var.r(false);
                } else {
                    x340Var.i0(1698785290);
                    cua cuaVar = cbx.b(x340Var).f;
                    cr31 cr31VarB2 = er31.b(4.0f);
                    t1c.a(dug.f(i1p1.q(u291.r(qim0Var4, fM), cr31VarB2), jC, cr31VarB2), x340Var, 0);
                    x340Var.r(false);
                }
                x340Var.r(false);
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new apy(loyVar, qim0Var4, i2, (byte) 0);
                    return;
                }
                return;
            }
            x340Var.i0(1699005824);
            x340Var.r(false);
            if (i4 == 1) {
                x340Var.i0(-1469212371);
                x340Var.r(false);
                cr31VarB = er31.a;
            } else {
                x340Var.i0(-1469211654);
                cua cuaVar2 = cbx.b(x340Var).f;
                cr31VarB = er31.b(4.0f);
                x340Var.r(false);
            }
            qim0 qim0VarF = dug.f(i1p1.q(u291.r(qim0Var4, fM), cr31VarB), jC, cr31VarB);
            String str = loyVar.e;
            if (str == null || ihc1.y0(str)) {
                b2 = 1;
                qim0Var3 = qim0Var4;
                x340Var.i0(1699308570);
                t1c.a(qim0VarF, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1699360836);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                Uri uri = (Uri) objT;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                uri.getClass();
                qim0Var3 = qim0Var4;
                eso1.e(uri, isl.a, u291.d(qim0Var4, 1.0f), null, null, null, null, null, null, oux.a, false, false, x340Var, 48, 0, 3576);
                x340Var.r(true);
                x340Var.r(false);
                b2 = 1;
            }
            qim0Var2 = qim0Var3;
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new apy(loyVar, qim0Var2, i2, b2);
        }
    }

    public static final void b(b10 b10Var, int i2, int i3, xu30 xu30Var, qim0 qim0Var, b0k b0kVar, int i4) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-780888160);
        int i5 = i4 | (b0kVar3.g(b10Var) ? 4 : 2) | (b0kVar3.e(i2) ? 32 : 16) | (b0kVar3.e(i3) ? 256 : 128) | (b0kVar3.i(xu30Var) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i5 & 1, (i5 & 9363) != 9362)) {
            String str = b10Var.a;
            boolean z = ((i5 & 14) == 4) | ((i5 & 7168) == 2048) | ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ill(xu30Var, b10Var, i2, i3);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            ldx ldxVar = ldx.c;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            j2i j2iVarR = apo.r(738604801, new hkl(b10Var, (byte) 1), b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, ldxVar, qim0Var3, (max) null, (gdx) null, zzq0Var, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j2iVarR, b0kVar2, 384, 48, 1976);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(b10Var, i2, i3, xu30Var, qim0Var2, i4);
        }
    }

    public static final void c(loy loyVar, Function0 function0, d0r d0rVar, wh1 wh1Var, ycm ycmVar, j6q j6qVar, String str, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        wh1 wh1Var2;
        j6q j6qVar2;
        String str2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-33396018);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(loyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(d0rVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wh1Var2 = wh1Var;
            i3 |= x340Var.i(wh1Var2) ? 2048 : 1024;
        } else {
            wh1Var2 = wh1Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(ycmVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            j6qVar2 = j6qVar;
            i3 |= x340Var.i(j6qVar2) ? 131072 : 65536;
        } else {
            j6qVar2 = j6qVar;
        }
        if ((1572864 & i2) == 0) {
            str2 = str;
            i3 |= x340Var.g(str2) ? 1048576 : 524288;
        } else {
            str2 = str;
        }
        int i4 = i3 | 12582912;
        if (x340Var.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            cr31 cr31VarB = er31.b(dsa0.m(x340Var, 2131165957));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3), cr31VarB);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var).c;
            qim0 qim0VarN = anm1.N("entity_preview_card", bin.x(dug.f(d1u.E(1.0f, cbx.a(x340Var).a.b.a(), qim0VarQ, cr31VarB), u7h.j, cr31VarB), !loyVar.g, (String) null, (pm31) null, (idn0) null, function0, 14));
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarN, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i5 = i4 & 14;
            int i6 = i4 >> 3;
            d(loyVar, d0rVar, wh1Var2, ycmVar, j6qVar2, str2, x340Var, (i6 & 458752) | i5 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i6));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(loyVar, function0, d0rVar, wh1Var, ycmVar, j6qVar, str, qim0Var2, i2);
        }
    }

    public static final void d(loy loyVar, d0r d0rVar, wh1 wh1Var, ycm ycmVar, j6q j6qVar, String str, b0k b0kVar, int i2) {
        int i3;
        d0r d0rVar2;
        wh1 wh1Var2;
        ycm ycmVar2;
        j6q j6qVar2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2080156355);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(loyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            d0rVar2 = d0rVar;
            i3 |= x340Var.i(d0rVar2) ? 32 : 16;
        } else {
            d0rVar2 = d0rVar;
        }
        if ((i2 & 384) == 0) {
            wh1Var2 = wh1Var;
            i3 |= x340Var.i(wh1Var2) ? 256 : 128;
        } else {
            wh1Var2 = wh1Var;
        }
        if ((i2 & 3072) == 0) {
            ycmVar2 = ycmVar;
            i3 |= x340Var.i(ycmVar2) ? 2048 : 1024;
        } else {
            ycmVar2 = ycmVar;
        }
        if ((i2 & 24576) == 0) {
            j6qVar2 = j6qVar;
            i3 |= x340Var.i(j6qVar2) ? 16384 : 8192;
        } else {
            j6qVar2 = j6qVar;
        }
        if ((196608 & i2) == 0) {
            str2 = str;
            i3 |= x340Var.g(str2) ? 131072 : 65536;
        } else {
            str2 = str;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            int i4 = i3 & 14;
            a(loyVar, null, x340Var, i4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            e(loyVar, c13.k(nim0Var, 12.0f, x340Var, 1.0f, true), x340Var, i4);
            if (loyVar.g) {
                x340Var.i0(-324636767);
                x340Var.r(false);
            } else {
                x340Var.i0(-325038465);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.v(nim0Var, 16.0f));
                l(loyVar, d0rVar2, wh1Var2, ycmVar2, j6qVar2, str2, x340Var, i3 & 524286);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bpy(loyVar, d0rVar, wh1Var, ycmVar, j6qVar, str, i2, (byte) 0);
        }
    }

    public static final void e(loy loyVar, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1277171177);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(loyVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            if (loyVar.g) {
                x340Var.i0(236687262);
                j(x340Var, 0);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(236735002);
                String str = loyVar.c;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                k(loyVar, x340Var, i4 & 14);
                x340Var.r(false);
                z = true;
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new apy(loyVar, qim0Var, i2, (byte) 2);
        }
    }

    public static final void f(c380 c380Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-660342050);
        int i3 = i2 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131953630);
            String strO1 = cwl1.o0(x340Var, 2131953631);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i3 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function2, ven0Var, (byte) 20);
                x340Var.s0(objT2);
            }
            Function0 function3 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-1299251353);
                String strO2 = cwl1.o0(x340Var, 2131953632);
                String strU = cwl1.U(2131820613, c380Var.size(), new Object[]{o7h.y0(c380Var, ", ", (String) null, (String) null, (iu30) null, 62)}, x340Var);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function3, (i3u) null, (hux) null, strO2, strU, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function1)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-1298577692);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i2, c380Var, function0, function1, function2, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:105:0x015e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0177  */
    /* JADX WARN: Code duplicated, block: B:115:0x0184  */
    /* JADX WARN: Code duplicated, block: B:118:0x018e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0195  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x01de  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:144:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:147:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:151:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:155:0x0229  */
    /* JADX WARN: Code duplicated, block: B:158:0x0244  */
    /* JADX WARN: Code duplicated, block: B:160:0x0249  */
    /* JADX WARN: Code duplicated, block: B:162:0x0259  */
    /* JADX WARN: Code duplicated, block: B:164:0x0260  */
    /* JADX WARN: Code duplicated, block: B:166:0x0264  */
    /* JADX WARN: Code duplicated, block: B:167:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x0269  */
    /* JADX WARN: Code duplicated, block: B:169:0x026c  */
    /* JADX WARN: Code duplicated, block: B:172:0x02da  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:79:0x0109  */
    /* JADX WARN: Code duplicated, block: B:80:0x0111  */
    /* JADX WARN: Code duplicated, block: B:82:0x0119  */
    /* JADX WARN: Code duplicated, block: B:83:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x012b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x0136  */
    /* JADX WARN: Code duplicated, block: B:95:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0143  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    public static final void g(final String str, final iu30 iu30Var, final qim0 qim0Var, boolean z, boolean z2, lee1 lee1Var, vu30 vu30Var, vu30 vu30Var2, vu30 vu30Var3, vu30 vu30Var4, boolean z3, elk1 elk1Var, kua0 kua0Var, bua0 bua0Var, boolean z4, int i2, int i3, hw61 hw61Var, final j4e1 j4e1Var, b0k b0kVar, final int i4, final int i5, final int i6) {
        iu30 iu30Var2;
        int i7;
        int i8;
        vu30 vu30Var5;
        int i9;
        int i10;
        int i11;
        vu30 vu30Var6;
        int i12;
        int i13;
        vu30 vu30Var7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        vu30 vu30Var8;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        char c2;
        boolean z5;
        b0k b0kVar2;
        final boolean z6;
        final boolean z7;
        final lee1 lee1Var2;
        final kua0 kua0Var2;
        final boolean z8;
        final int i32;
        final int i33;
        final hw61 hw61Var2;
        final vu30 vu30Var9;
        final vu30 vu30Var10;
        final vu30 vu30Var11;
        final vu30 vu30Var12;
        final boolean z9;
        final elk1 elk1Var2;
        final bua0 bua0Var2;
        h311 h311VarV;
        boolean z10;
        boolean z11;
        kua0 kua0Var3;
        bua0 bua0Var3;
        boolean z12;
        int i34;
        hw61 hw61VarB;
        kua0 kua0Var4;
        vu30 vu30Var13;
        vu30 vu30Var14;
        int i35;
        boolean z13;
        lee1 lee1Var3;
        elk1 elk1Var3;
        vu30 vu30Var15;
        bua0 bua0Var4;
        boolean z14;
        int i36;
        vu30 vu30Var16;
        boolean z15;
        Object objT;
        idn0 idn0Var;
        boolean z16;
        long jC;
        boolean zBooleanValue;
        boolean z17;
        long j;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1901501544);
        int i37 = (b0kVar3.g(str) ? 4 : 2) | i4;
        if ((i4 & 48) == 0) {
            iu30Var2 = iu30Var;
            i37 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        int i38 = i37 | (b0kVar3.g(qim0Var) ? 256 : 128);
        int i39 = i38 | 3072;
        int i40 = i6 & 16;
        if (i40 == 0) {
            if ((i4 & 24576) == 0) {
                i39 |= b0kVar3.h(z2) ? 16384 : 8192;
            }
            i7 = 1638400 | i39;
            i8 = i6 & 128;
            if (i8 != 0) {
                if ((i4 & 12582912) == 0) {
                    vu30Var5 = vu30Var;
                    if (b0kVar3.i(vu30Var5)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i7 |= i9;
                }
                i10 = i7 | 100663296;
                i11 = i6 & 512;
                if (i11 != 0) {
                    if ((805306368 & i4) == 0) {
                        vu30Var6 = vu30Var2;
                        if (b0kVar3.i(vu30Var6)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i10 |= i12;
                    }
                    i13 = i6 & 1024;
                    if (i13 != 0) {
                        i15 = i5 | 6;
                        vu30Var7 = vu30Var3;
                    } else {
                        vu30Var7 = vu30Var3;
                        if (b0kVar3.i(vu30Var7)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i15 = i5 | i14;
                    }
                    i16 = i15;
                    i17 = i16 | 48;
                    i18 = i6 & 4096;
                    if (i18 != 0) {
                        i20 = i16 | 432;
                        vu30Var8 = vu30Var4;
                    } else {
                        vu30Var8 = vu30Var4;
                        if (b0kVar3.i(vu30Var8)) {
                            i19 = 256;
                        } else {
                            i19 = 128;
                        }
                        i20 = i17 | i19;
                    }
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                        i23 = i20 | 3072;
                    } else {
                        int i41 = i20;
                        if (b0kVar3.h(z3)) {
                            i22 = 2048;
                        } else {
                            i22 = 1024;
                        }
                        i23 = i41 | i22;
                    }
                    i24 = i23 | 24576;
                    i25 = i6 & 32768;
                    if (i25 != 0) {
                        i27 = i23 | 221184;
                    } else {
                        if (b0kVar3.g(kua0Var)) {
                            i26 = 131072;
                        } else {
                            i26 = 65536;
                        }
                        i27 = i24 | i26;
                    }
                    i28 = i6 & 65536;
                    if (i28 != 0) {
                        i30 = i27 | 1572864;
                    } else {
                        if (b0kVar3.g(bua0Var)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i30 = i27 | i29;
                    }
                    i31 = i6 & 131072;
                    if (i31 != 0) {
                        i30 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
                    }
                    int i42 = i30 | 838860800;
                    if (b0kVar3.g(j4e1Var)) {
                        c2 = 256;
                    } else {
                        c2 = 128;
                    }
                    int i43 = 22 | c2;
                    if ((i10 & 306783379) != 306783378 && (i42 & 306783379) == 306783378 && (i43 & 147) == 146) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (b0kVar3.Y(i10 & 1, z5)) {
                        b0kVar3.d0();
                        if ((i4 & 1) != 0 || b0kVar3.E()) {
                            if (i40 != 0) {
                                z10 = false;
                            } else {
                                z10 = z2;
                            }
                            lee1 lee1Var4 = (lee1) b0kVar3.k(q9e1.a);
                            if (i8 != 0) {
                                vu30Var5 = null;
                            }
                            if (i11 != 0) {
                                vu30Var6 = null;
                            }
                            if (i13 != 0) {
                                vu30Var7 = null;
                            }
                            if (i18 != 0) {
                                vu30Var8 = null;
                            }
                            if (i21 != 0) {
                                z11 = false;
                            } else {
                                z11 = z3;
                            }
                            elk1 elk1Var4 = m9x0.X0;
                            if (i25 != 0) {
                                kua0Var3 = kua0.g;
                            } else {
                                kua0Var3 = kua0Var;
                            }
                            if (i28 != 0) {
                                bua0Var3 = bua0.d;
                            } else {
                                bua0Var3 = bua0Var;
                            }
                            if (i31 != 0) {
                                z12 = false;
                            } else {
                                z12 = z4;
                            }
                            if (z12) {
                                i34 = 1;
                            } else {
                                i34 = Integer.MAX_VALUE;
                            }
                            hw61VarB = px61.b(b0kVar3, 5);
                            kua0Var4 = kua0Var3;
                            vu30Var13 = vu30Var8;
                            vu30Var14 = vu30Var6;
                            i35 = i34;
                            z13 = z10;
                            lee1Var3 = lee1Var4;
                            elk1Var3 = elk1Var4;
                            vu30Var15 = vu30Var5;
                            bua0Var4 = bua0Var3;
                            z14 = true;
                            i36 = 1;
                            vu30Var16 = vu30Var7;
                            z15 = z12;
                        } else {
                            b0kVar3.b0();
                            z14 = z;
                            z13 = z2;
                            lee1Var3 = lee1Var;
                            z11 = z3;
                            kua0Var4 = kua0Var;
                            i36 = i3;
                            hw61VarB = hw61Var;
                            vu30Var15 = vu30Var5;
                            vu30Var16 = vu30Var7;
                            vu30Var13 = vu30Var8;
                            vu30Var14 = vu30Var6;
                            elk1Var3 = elk1Var;
                            bua0Var4 = bua0Var;
                            z15 = z4;
                            i35 = i2;
                        }
                        b0kVar3.s();
                        b0kVar3.i0(1310051731);
                        objT = b0kVar3.T();
                        if (objT == fkj0.X) {
                            objT = ktd.n(b0kVar3);
                        }
                        idn0Var = (idn0) objT;
                        z16 = false;
                        b0kVar3.r(false);
                        b0kVar3.i0(1981927842);
                        jC = lee1Var3.c();
                        if (jC != 16) {
                            z17 = z11;
                        } else {
                            zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                            if (z14) {
                                z17 = z11;
                                if (z17) {
                                    j = j4e1Var.d;
                                } else if (zBooleanValue) {
                                    j = j4e1Var.a;
                                } else {
                                    j = j4e1Var.b;
                                }
                            } else {
                                z17 = z11;
                                j = j4e1Var.c;
                            }
                            jC = j;
                            z16 = false;
                        }
                        long j2 = jC;
                        b0kVar3.r(z16);
                        boolean z18 = z17;
                        b0kVar2 = b0kVar3;
                        mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z18, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j2, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                        z6 = z14;
                        z7 = z13;
                        z8 = z15;
                        vu30Var9 = vu30Var15;
                        vu30Var12 = vu30Var14;
                        lee1Var2 = lee1Var3;
                        z9 = z18;
                        i32 = i35;
                        i33 = i36;
                        elk1Var2 = elk1Var3;
                        kua0Var2 = kua0Var4;
                        bua0Var2 = bua0Var4;
                        vu30Var10 = vu30Var16;
                        vu30Var11 = vu30Var13;
                        hw61Var2 = hw61VarB;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        z6 = z;
                        z7 = z2;
                        lee1Var2 = lee1Var;
                        kua0Var2 = kua0Var;
                        z8 = z4;
                        i32 = i2;
                        i33 = i3;
                        hw61Var2 = hw61Var;
                        vu30Var9 = vu30Var5;
                        vu30Var10 = vu30Var7;
                        vu30Var11 = vu30Var8;
                        vu30Var12 = vu30Var6;
                        z9 = z3;
                        elk1Var2 = elk1Var;
                        bua0Var2 = bua0Var;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new vu30() { // from class: p.mtq0
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iP = czo1.p(i4 | 1);
                                int iP2 = czo1.p(i5);
                                String str2 = str;
                                iu30 iu30Var3 = iu30Var;
                                qim0 qim0Var2 = qim0Var;
                                boolean z19 = z6;
                                boolean z20 = z7;
                                lee1 lee1Var5 = lee1Var2;
                                vu30 vu30Var17 = vu30Var9;
                                vu30 vu30Var18 = vu30Var12;
                                vu30 vu30Var19 = vu30Var10;
                                vu30 vu30Var20 = vu30Var11;
                                boolean z21 = z9;
                                elk1 elk1Var5 = elk1Var2;
                                kua0 kua0Var5 = kua0Var2;
                                bua0 bua0Var5 = bua0Var2;
                                boolean z22 = z8;
                                int i44 = i32;
                                boolean z23 = i33;
                                hw61 hw61Var3 = hw61Var2;
                                j4e1 j4e1Var2 = j4e1Var;
                                int i45 = i6;
                                wpb1.g(str2, iu30Var3, qim0Var2, z19, z20, lee1Var5, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var5, kua0Var5, bua0Var5, z22, i44, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i45);
                                return rih1.a;
                            }
                        };
                    }
                }
                i10 = i7 | 905969664;
                vu30Var6 = vu30Var2;
                i13 = i6 & 1024;
                if (i13 != 0) {
                    i15 = i5 | 6;
                    vu30Var7 = vu30Var3;
                } else {
                    vu30Var7 = vu30Var3;
                    if (b0kVar3.i(vu30Var7)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i15 = i5 | i14;
                }
                i16 = i15;
                i17 = i16 | 48;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i20 = i16 | 432;
                    vu30Var8 = vu30Var4;
                } else {
                    vu30Var8 = vu30Var4;
                    if (b0kVar3.i(vu30Var8)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i20 = i17 | i19;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i20 | 3072;
                } else {
                    int i44 = i20;
                    if (b0kVar3.h(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i44 | i22;
                }
                i24 = i23 | 24576;
                i25 = i6 & 32768;
                if (i25 != 0) {
                    i27 = i23 | 221184;
                } else {
                    if (b0kVar3.g(kua0Var)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i27 = i24 | i26;
                }
                i28 = i6 & 65536;
                if (i28 != 0) {
                    i30 = i27 | 1572864;
                } else {
                    if (b0kVar3.g(bua0Var)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i30 = i27 | i29;
                }
                i31 = i6 & 131072;
                if (i31 != 0) {
                    i30 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
                }
                int i45 = i30 | 838860800;
                if (b0kVar3.g(j4e1Var)) {
                    c2 = 256;
                } else {
                    c2 = 128;
                }
                int i46 = 22 | c2;
                if ((i10 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (b0kVar3.Y(i10 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i4 & 1) != 0) {
                        if (i40 != 0) {
                            z10 = false;
                        } else {
                            z10 = z2;
                        }
                        lee1 lee1Var5 = (lee1) b0kVar3.k(q9e1.a);
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i13 != 0) {
                            vu30Var7 = null;
                        }
                        if (i18 != 0) {
                            vu30Var8 = null;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        elk1 elk1Var5 = m9x0.X0;
                        if (i25 != 0) {
                            kua0Var3 = kua0.g;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        if (i28 != 0) {
                            bua0Var3 = bua0.d;
                        } else {
                            bua0Var3 = bua0Var;
                        }
                        if (i31 != 0) {
                            z12 = false;
                        } else {
                            z12 = z4;
                        }
                        if (z12) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        hw61VarB = px61.b(b0kVar3, 5);
                        kua0Var4 = kua0Var3;
                        vu30Var13 = vu30Var8;
                        vu30Var14 = vu30Var6;
                        i35 = i34;
                        z13 = z10;
                        lee1Var3 = lee1Var5;
                        elk1Var3 = elk1Var5;
                        vu30Var15 = vu30Var5;
                        bua0Var4 = bua0Var3;
                        z14 = true;
                        i36 = 1;
                        vu30Var16 = vu30Var7;
                        z15 = z12;
                    } else {
                        if (i40 != 0) {
                            z10 = false;
                        } else {
                            z10 = z2;
                        }
                        lee1 lee1Var6 = (lee1) b0kVar3.k(q9e1.a);
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i13 != 0) {
                            vu30Var7 = null;
                        }
                        if (i18 != 0) {
                            vu30Var8 = null;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        elk1 elk1Var6 = m9x0.X0;
                        if (i25 != 0) {
                            kua0Var3 = kua0.g;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        if (i28 != 0) {
                            bua0Var3 = bua0.d;
                        } else {
                            bua0Var3 = bua0Var;
                        }
                        if (i31 != 0) {
                            z12 = false;
                        } else {
                            z12 = z4;
                        }
                        if (z12) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        hw61VarB = px61.b(b0kVar3, 5);
                        kua0Var4 = kua0Var3;
                        vu30Var13 = vu30Var8;
                        vu30Var14 = vu30Var6;
                        i35 = i34;
                        z13 = z10;
                        lee1Var3 = lee1Var6;
                        elk1Var3 = elk1Var6;
                        vu30Var15 = vu30Var5;
                        bua0Var4 = bua0Var3;
                        z14 = true;
                        i36 = 1;
                        vu30Var16 = vu30Var7;
                        z15 = z12;
                    }
                    b0kVar3.s();
                    b0kVar3.i0(1310051731);
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(b0kVar3);
                    }
                    idn0Var = (idn0) objT;
                    z16 = false;
                    b0kVar3.r(false);
                    b0kVar3.i0(1981927842);
                    jC = lee1Var3.c();
                    if (jC != 16) {
                        z17 = z11;
                    } else {
                        zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                        if (z14) {
                            z17 = z11;
                            j = j4e1Var.c;
                        } else {
                            z17 = z11;
                            if (z17) {
                                j = j4e1Var.d;
                            } else if (zBooleanValue) {
                                j = j4e1Var.a;
                            } else {
                                j = j4e1Var.b;
                            }
                        }
                        jC = j;
                        z16 = false;
                    }
                    long j3 = jC;
                    b0kVar3.r(z16);
                    boolean z19 = z17;
                    b0kVar2 = b0kVar3;
                    mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z19, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j3, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                    z6 = z14;
                    z7 = z13;
                    z8 = z15;
                    vu30Var9 = vu30Var15;
                    vu30Var12 = vu30Var14;
                    lee1Var2 = lee1Var3;
                    z9 = z19;
                    i32 = i35;
                    i33 = i36;
                    elk1Var2 = elk1Var3;
                    kua0Var2 = kua0Var4;
                    bua0Var2 = bua0Var4;
                    vu30Var10 = vu30Var16;
                    vu30Var11 = vu30Var13;
                    hw61Var2 = hw61VarB;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z;
                    z7 = z2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    z8 = z4;
                    i32 = i2;
                    i33 = i3;
                    hw61Var2 = hw61Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var7;
                    vu30Var11 = vu30Var8;
                    vu30Var12 = vu30Var6;
                    z9 = z3;
                    elk1Var2 = elk1Var;
                    bua0Var2 = bua0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.mtq0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = czo1.p(i4 | 1);
                            int iP2 = czo1.p(i5);
                            String str2 = str;
                            iu30 iu30Var3 = iu30Var;
                            qim0 qim0Var2 = qim0Var;
                            boolean z110 = z6;
                            boolean z20 = z7;
                            lee1 lee1Var7 = lee1Var2;
                            vu30 vu30Var17 = vu30Var9;
                            vu30 vu30Var18 = vu30Var12;
                            vu30 vu30Var19 = vu30Var10;
                            vu30 vu30Var20 = vu30Var11;
                            boolean z21 = z9;
                            elk1 elk1Var7 = elk1Var2;
                            kua0 kua0Var5 = kua0Var2;
                            bua0 bua0Var5 = bua0Var2;
                            boolean z22 = z8;
                            int i47 = i32;
                            boolean z23 = i33;
                            hw61 hw61Var3 = hw61Var2;
                            j4e1 j4e1Var2 = j4e1Var;
                            int i48 = i6;
                            wpb1.g(str2, iu30Var3, qim0Var2, z110, z20, lee1Var7, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var7, kua0Var5, bua0Var5, z22, i47, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i48);
                            return rih1.a;
                        }
                    };
                }
            }
            i7 = 14221312 | i39;
            vu30Var5 = vu30Var;
            i10 = i7 | 100663296;
            i11 = i6 & 512;
            if (i11 != 0) {
                if ((805306368 & i4) == 0) {
                    vu30Var6 = vu30Var2;
                    if (b0kVar3.i(vu30Var6)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i10 |= i12;
                }
                i13 = i6 & 1024;
                if (i13 != 0) {
                    i15 = i5 | 6;
                    vu30Var7 = vu30Var3;
                } else {
                    vu30Var7 = vu30Var3;
                    if (b0kVar3.i(vu30Var7)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i15 = i5 | i14;
                }
                i16 = i15;
                i17 = i16 | 48;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i20 = i16 | 432;
                    vu30Var8 = vu30Var4;
                } else {
                    vu30Var8 = vu30Var4;
                    if (b0kVar3.i(vu30Var8)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i20 = i17 | i19;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i20 | 3072;
                } else {
                    int i47 = i20;
                    if (b0kVar3.h(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i47 | i22;
                }
                i24 = i23 | 24576;
                i25 = i6 & 32768;
                if (i25 != 0) {
                    i27 = i23 | 221184;
                } else {
                    if (b0kVar3.g(kua0Var)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i27 = i24 | i26;
                }
                i28 = i6 & 65536;
                if (i28 != 0) {
                    i30 = i27 | 1572864;
                } else {
                    if (b0kVar3.g(bua0Var)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i30 = i27 | i29;
                }
                i31 = i6 & 131072;
                if (i31 != 0) {
                    i30 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
                }
                int i48 = i30 | 838860800;
                if (b0kVar3.g(j4e1Var)) {
                    c2 = 256;
                } else {
                    c2 = 128;
                }
                int i49 = 22 | c2;
                if ((i10 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (b0kVar3.Y(i10 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i4 & 1) != 0) {
                        if (i40 != 0) {
                            z10 = false;
                        } else {
                            z10 = z2;
                        }
                        lee1 lee1Var7 = (lee1) b0kVar3.k(q9e1.a);
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i13 != 0) {
                            vu30Var7 = null;
                        }
                        if (i18 != 0) {
                            vu30Var8 = null;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        elk1 elk1Var7 = m9x0.X0;
                        if (i25 != 0) {
                            kua0Var3 = kua0.g;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        if (i28 != 0) {
                            bua0Var3 = bua0.d;
                        } else {
                            bua0Var3 = bua0Var;
                        }
                        if (i31 != 0) {
                            z12 = false;
                        } else {
                            z12 = z4;
                        }
                        if (z12) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        hw61VarB = px61.b(b0kVar3, 5);
                        kua0Var4 = kua0Var3;
                        vu30Var13 = vu30Var8;
                        vu30Var14 = vu30Var6;
                        i35 = i34;
                        z13 = z10;
                        lee1Var3 = lee1Var7;
                        elk1Var3 = elk1Var7;
                        vu30Var15 = vu30Var5;
                        bua0Var4 = bua0Var3;
                        z14 = true;
                        i36 = 1;
                        vu30Var16 = vu30Var7;
                        z15 = z12;
                    } else {
                        if (i40 != 0) {
                            z10 = false;
                        } else {
                            z10 = z2;
                        }
                        lee1 lee1Var8 = (lee1) b0kVar3.k(q9e1.a);
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i13 != 0) {
                            vu30Var7 = null;
                        }
                        if (i18 != 0) {
                            vu30Var8 = null;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        elk1 elk1Var8 = m9x0.X0;
                        if (i25 != 0) {
                            kua0Var3 = kua0.g;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        if (i28 != 0) {
                            bua0Var3 = bua0.d;
                        } else {
                            bua0Var3 = bua0Var;
                        }
                        if (i31 != 0) {
                            z12 = false;
                        } else {
                            z12 = z4;
                        }
                        if (z12) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        hw61VarB = px61.b(b0kVar3, 5);
                        kua0Var4 = kua0Var3;
                        vu30Var13 = vu30Var8;
                        vu30Var14 = vu30Var6;
                        i35 = i34;
                        z13 = z10;
                        lee1Var3 = lee1Var8;
                        elk1Var3 = elk1Var8;
                        vu30Var15 = vu30Var5;
                        bua0Var4 = bua0Var3;
                        z14 = true;
                        i36 = 1;
                        vu30Var16 = vu30Var7;
                        z15 = z12;
                    }
                    b0kVar3.s();
                    b0kVar3.i0(1310051731);
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(b0kVar3);
                    }
                    idn0Var = (idn0) objT;
                    z16 = false;
                    b0kVar3.r(false);
                    b0kVar3.i0(1981927842);
                    jC = lee1Var3.c();
                    if (jC != 16) {
                        z17 = z11;
                    } else {
                        zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                        if (z14) {
                            z17 = z11;
                            j = j4e1Var.c;
                        } else {
                            z17 = z11;
                            if (z17) {
                                j = j4e1Var.d;
                            } else if (zBooleanValue) {
                                j = j4e1Var.a;
                            } else {
                                j = j4e1Var.b;
                            }
                        }
                        jC = j;
                        z16 = false;
                    }
                    long j4 = jC;
                    b0kVar3.r(z16);
                    boolean z110 = z17;
                    b0kVar2 = b0kVar3;
                    mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z110, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j4, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                    z6 = z14;
                    z7 = z13;
                    z8 = z15;
                    vu30Var9 = vu30Var15;
                    vu30Var12 = vu30Var14;
                    lee1Var2 = lee1Var3;
                    z9 = z110;
                    i32 = i35;
                    i33 = i36;
                    elk1Var2 = elk1Var3;
                    kua0Var2 = kua0Var4;
                    bua0Var2 = bua0Var4;
                    vu30Var10 = vu30Var16;
                    vu30Var11 = vu30Var13;
                    hw61Var2 = hw61VarB;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z;
                    z7 = z2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    z8 = z4;
                    i32 = i2;
                    i33 = i3;
                    hw61Var2 = hw61Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var7;
                    vu30Var11 = vu30Var8;
                    vu30Var12 = vu30Var6;
                    z9 = z3;
                    elk1Var2 = elk1Var;
                    bua0Var2 = bua0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.mtq0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = czo1.p(i4 | 1);
                            int iP2 = czo1.p(i5);
                            String str2 = str;
                            iu30 iu30Var3 = iu30Var;
                            qim0 qim0Var2 = qim0Var;
                            boolean z111 = z6;
                            boolean z20 = z7;
                            lee1 lee1Var9 = lee1Var2;
                            vu30 vu30Var17 = vu30Var9;
                            vu30 vu30Var18 = vu30Var12;
                            vu30 vu30Var19 = vu30Var10;
                            vu30 vu30Var20 = vu30Var11;
                            boolean z21 = z9;
                            elk1 elk1Var9 = elk1Var2;
                            kua0 kua0Var5 = kua0Var2;
                            bua0 bua0Var5 = bua0Var2;
                            boolean z22 = z8;
                            int i410 = i32;
                            boolean z23 = i33;
                            hw61 hw61Var3 = hw61Var2;
                            j4e1 j4e1Var2 = j4e1Var;
                            int i411 = i6;
                            wpb1.g(str2, iu30Var3, qim0Var2, z111, z20, lee1Var9, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var9, kua0Var5, bua0Var5, z22, i410, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i411);
                            return rih1.a;
                        }
                    };
                }
            }
            i10 = i7 | 905969664;
            vu30Var6 = vu30Var2;
            i13 = i6 & 1024;
            if (i13 != 0) {
                i15 = i5 | 6;
                vu30Var7 = vu30Var3;
            } else {
                vu30Var7 = vu30Var3;
                if (b0kVar3.i(vu30Var7)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i15 = i5 | i14;
            }
            i16 = i15;
            i17 = i16 | 48;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i20 = i16 | 432;
                vu30Var8 = vu30Var4;
            } else {
                vu30Var8 = vu30Var4;
                if (b0kVar3.i(vu30Var8)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i20 = i17 | i19;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i20 | 3072;
            } else {
                int i410 = i20;
                if (b0kVar3.h(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i410 | i22;
            }
            i24 = i23 | 24576;
            i25 = i6 & 32768;
            if (i25 != 0) {
                i27 = i23 | 221184;
            } else {
                if (b0kVar3.g(kua0Var)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i27 = i24 | i26;
            }
            i28 = i6 & 65536;
            if (i28 != 0) {
                i30 = i27 | 1572864;
            } else {
                if (b0kVar3.g(bua0Var)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i30 = i27 | i29;
            }
            i31 = i6 & 131072;
            if (i31 != 0) {
                i30 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
            }
            int i411 = i30 | 838860800;
            if (b0kVar3.g(j4e1Var)) {
                c2 = 256;
            } else {
                c2 = 128;
            }
            int i412 = 22 | c2;
            if ((i10 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (b0kVar3.Y(i10 & 1, z5)) {
                b0kVar3.d0();
                if ((i4 & 1) != 0) {
                    if (i40 != 0) {
                        z10 = false;
                    } else {
                        z10 = z2;
                    }
                    lee1 lee1Var9 = (lee1) b0kVar3.k(q9e1.a);
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i13 != 0) {
                        vu30Var7 = null;
                    }
                    if (i18 != 0) {
                        vu30Var8 = null;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    elk1 elk1Var9 = m9x0.X0;
                    if (i25 != 0) {
                        kua0Var3 = kua0.g;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    if (i28 != 0) {
                        bua0Var3 = bua0.d;
                    } else {
                        bua0Var3 = bua0Var;
                    }
                    if (i31 != 0) {
                        z12 = false;
                    } else {
                        z12 = z4;
                    }
                    if (z12) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    hw61VarB = px61.b(b0kVar3, 5);
                    kua0Var4 = kua0Var3;
                    vu30Var13 = vu30Var8;
                    vu30Var14 = vu30Var6;
                    i35 = i34;
                    z13 = z10;
                    lee1Var3 = lee1Var9;
                    elk1Var3 = elk1Var9;
                    vu30Var15 = vu30Var5;
                    bua0Var4 = bua0Var3;
                    z14 = true;
                    i36 = 1;
                    vu30Var16 = vu30Var7;
                    z15 = z12;
                } else {
                    if (i40 != 0) {
                        z10 = false;
                    } else {
                        z10 = z2;
                    }
                    lee1 lee1Var10 = (lee1) b0kVar3.k(q9e1.a);
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i13 != 0) {
                        vu30Var7 = null;
                    }
                    if (i18 != 0) {
                        vu30Var8 = null;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    elk1 elk1Var10 = m9x0.X0;
                    if (i25 != 0) {
                        kua0Var3 = kua0.g;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    if (i28 != 0) {
                        bua0Var3 = bua0.d;
                    } else {
                        bua0Var3 = bua0Var;
                    }
                    if (i31 != 0) {
                        z12 = false;
                    } else {
                        z12 = z4;
                    }
                    if (z12) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    hw61VarB = px61.b(b0kVar3, 5);
                    kua0Var4 = kua0Var3;
                    vu30Var13 = vu30Var8;
                    vu30Var14 = vu30Var6;
                    i35 = i34;
                    z13 = z10;
                    lee1Var3 = lee1Var10;
                    elk1Var3 = elk1Var10;
                    vu30Var15 = vu30Var5;
                    bua0Var4 = bua0Var3;
                    z14 = true;
                    i36 = 1;
                    vu30Var16 = vu30Var7;
                    z15 = z12;
                }
                b0kVar3.s();
                b0kVar3.i0(1310051731);
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(b0kVar3);
                }
                idn0Var = (idn0) objT;
                z16 = false;
                b0kVar3.r(false);
                b0kVar3.i0(1981927842);
                jC = lee1Var3.c();
                if (jC != 16) {
                    z17 = z11;
                } else {
                    zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                    if (z14) {
                        z17 = z11;
                        j = j4e1Var.c;
                    } else {
                        z17 = z11;
                        if (z17) {
                            j = j4e1Var.d;
                        } else if (zBooleanValue) {
                            j = j4e1Var.a;
                        } else {
                            j = j4e1Var.b;
                        }
                    }
                    jC = j;
                    z16 = false;
                }
                long j5 = jC;
                b0kVar3.r(z16);
                boolean z111 = z17;
                b0kVar2 = b0kVar3;
                mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z111, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j5, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                z6 = z14;
                z7 = z13;
                z8 = z15;
                vu30Var9 = vu30Var15;
                vu30Var12 = vu30Var14;
                lee1Var2 = lee1Var3;
                z9 = z111;
                i32 = i35;
                i33 = i36;
                elk1Var2 = elk1Var3;
                kua0Var2 = kua0Var4;
                bua0Var2 = bua0Var4;
                vu30Var10 = vu30Var16;
                vu30Var11 = vu30Var13;
                hw61Var2 = hw61VarB;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z;
                z7 = z2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                z8 = z4;
                i32 = i2;
                i33 = i3;
                hw61Var2 = hw61Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var7;
                vu30Var11 = vu30Var8;
                vu30Var12 = vu30Var6;
                z9 = z3;
                elk1Var2 = elk1Var;
                bua0Var2 = bua0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.mtq0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i4 | 1);
                        int iP2 = czo1.p(i5);
                        String str2 = str;
                        iu30 iu30Var3 = iu30Var;
                        qim0 qim0Var2 = qim0Var;
                        boolean z112 = z6;
                        boolean z20 = z7;
                        lee1 lee1Var11 = lee1Var2;
                        vu30 vu30Var17 = vu30Var9;
                        vu30 vu30Var18 = vu30Var12;
                        vu30 vu30Var19 = vu30Var10;
                        vu30 vu30Var20 = vu30Var11;
                        boolean z21 = z9;
                        elk1 elk1Var11 = elk1Var2;
                        kua0 kua0Var5 = kua0Var2;
                        bua0 bua0Var5 = bua0Var2;
                        boolean z22 = z8;
                        int i413 = i32;
                        boolean z23 = i33;
                        hw61 hw61Var3 = hw61Var2;
                        j4e1 j4e1Var2 = j4e1Var;
                        int i414 = i6;
                        wpb1.g(str2, iu30Var3, qim0Var2, z112, z20, lee1Var11, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var11, kua0Var5, bua0Var5, z22, i413, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i414);
                        return rih1.a;
                    }
                };
            }
        }
        i39 = i38 | 27648;
        i7 = 1638400 | i39;
        i8 = i6 & 128;
        if (i8 != 0) {
            if ((i4 & 12582912) == 0) {
                vu30Var5 = vu30Var;
                if (b0kVar3.i(vu30Var5)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i7 |= i9;
            }
            i10 = i7 | 100663296;
            i11 = i6 & 512;
            if (i11 != 0) {
                if ((805306368 & i4) == 0) {
                    vu30Var6 = vu30Var2;
                    if (b0kVar3.i(vu30Var6)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i10 |= i12;
                }
                i13 = i6 & 1024;
                if (i13 != 0) {
                    i15 = i5 | 6;
                    vu30Var7 = vu30Var3;
                } else {
                    vu30Var7 = vu30Var3;
                    if (b0kVar3.i(vu30Var7)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i15 = i5 | i14;
                }
                i16 = i15;
                i17 = i16 | 48;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i20 = i16 | 432;
                    vu30Var8 = vu30Var4;
                } else {
                    vu30Var8 = vu30Var4;
                    if (b0kVar3.i(vu30Var8)) {
                        i19 = 256;
                    } else {
                        i19 = 128;
                    }
                    i20 = i17 | i19;
                }
                i21 = i6 & 8192;
                if (i21 != 0) {
                    i23 = i20 | 3072;
                } else {
                    int i413 = i20;
                    if (b0kVar3.h(z3)) {
                        i22 = 2048;
                    } else {
                        i22 = 1024;
                    }
                    i23 = i413 | i22;
                }
                i24 = i23 | 24576;
                i25 = i6 & 32768;
                if (i25 != 0) {
                    i27 = i23 | 221184;
                } else {
                    if (b0kVar3.g(kua0Var)) {
                        i26 = 131072;
                    } else {
                        i26 = 65536;
                    }
                    i27 = i24 | i26;
                }
                i28 = i6 & 65536;
                if (i28 != 0) {
                    i30 = i27 | 1572864;
                } else {
                    if (b0kVar3.g(bua0Var)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i30 = i27 | i29;
                }
                i31 = i6 & 131072;
                if (i31 != 0) {
                    i30 |= 12582912;
                } else if ((i5 & 12582912) == 0) {
                    i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
                }
                int i414 = i30 | 838860800;
                if (b0kVar3.g(j4e1Var)) {
                    c2 = 256;
                } else {
                    c2 = 128;
                }
                int i415 = 22 | c2;
                if ((i10 & 306783379) != 306783378) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                if (b0kVar3.Y(i10 & 1, z5)) {
                    b0kVar3.d0();
                    if ((i4 & 1) != 0) {
                        if (i40 != 0) {
                            z10 = false;
                        } else {
                            z10 = z2;
                        }
                        lee1 lee1Var11 = (lee1) b0kVar3.k(q9e1.a);
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i13 != 0) {
                            vu30Var7 = null;
                        }
                        if (i18 != 0) {
                            vu30Var8 = null;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        elk1 elk1Var11 = m9x0.X0;
                        if (i25 != 0) {
                            kua0Var3 = kua0.g;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        if (i28 != 0) {
                            bua0Var3 = bua0.d;
                        } else {
                            bua0Var3 = bua0Var;
                        }
                        if (i31 != 0) {
                            z12 = false;
                        } else {
                            z12 = z4;
                        }
                        if (z12) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        hw61VarB = px61.b(b0kVar3, 5);
                        kua0Var4 = kua0Var3;
                        vu30Var13 = vu30Var8;
                        vu30Var14 = vu30Var6;
                        i35 = i34;
                        z13 = z10;
                        lee1Var3 = lee1Var11;
                        elk1Var3 = elk1Var11;
                        vu30Var15 = vu30Var5;
                        bua0Var4 = bua0Var3;
                        z14 = true;
                        i36 = 1;
                        vu30Var16 = vu30Var7;
                        z15 = z12;
                    } else {
                        if (i40 != 0) {
                            z10 = false;
                        } else {
                            z10 = z2;
                        }
                        lee1 lee1Var12 = (lee1) b0kVar3.k(q9e1.a);
                        if (i8 != 0) {
                            vu30Var5 = null;
                        }
                        if (i11 != 0) {
                            vu30Var6 = null;
                        }
                        if (i13 != 0) {
                            vu30Var7 = null;
                        }
                        if (i18 != 0) {
                            vu30Var8 = null;
                        }
                        if (i21 != 0) {
                            z11 = false;
                        } else {
                            z11 = z3;
                        }
                        elk1 elk1Var12 = m9x0.X0;
                        if (i25 != 0) {
                            kua0Var3 = kua0.g;
                        } else {
                            kua0Var3 = kua0Var;
                        }
                        if (i28 != 0) {
                            bua0Var3 = bua0.d;
                        } else {
                            bua0Var3 = bua0Var;
                        }
                        if (i31 != 0) {
                            z12 = false;
                        } else {
                            z12 = z4;
                        }
                        if (z12) {
                            i34 = 1;
                        } else {
                            i34 = Integer.MAX_VALUE;
                        }
                        hw61VarB = px61.b(b0kVar3, 5);
                        kua0Var4 = kua0Var3;
                        vu30Var13 = vu30Var8;
                        vu30Var14 = vu30Var6;
                        i35 = i34;
                        z13 = z10;
                        lee1Var3 = lee1Var12;
                        elk1Var3 = elk1Var12;
                        vu30Var15 = vu30Var5;
                        bua0Var4 = bua0Var3;
                        z14 = true;
                        i36 = 1;
                        vu30Var16 = vu30Var7;
                        z15 = z12;
                    }
                    b0kVar3.s();
                    b0kVar3.i0(1310051731);
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(b0kVar3);
                    }
                    idn0Var = (idn0) objT;
                    z16 = false;
                    b0kVar3.r(false);
                    b0kVar3.i0(1981927842);
                    jC = lee1Var3.c();
                    if (jC != 16) {
                        z17 = z11;
                    } else {
                        zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                        if (z14) {
                            z17 = z11;
                            j = j4e1Var.c;
                        } else {
                            z17 = z11;
                            if (z17) {
                                j = j4e1Var.d;
                            } else if (zBooleanValue) {
                                j = j4e1Var.a;
                            } else {
                                j = j4e1Var.b;
                            }
                        }
                        jC = j;
                        z16 = false;
                    }
                    long j6 = jC;
                    b0kVar3.r(z16);
                    boolean z112 = z17;
                    b0kVar2 = b0kVar3;
                    mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z112, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j6, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                    z6 = z14;
                    z7 = z13;
                    z8 = z15;
                    vu30Var9 = vu30Var15;
                    vu30Var12 = vu30Var14;
                    lee1Var2 = lee1Var3;
                    z9 = z112;
                    i32 = i35;
                    i33 = i36;
                    elk1Var2 = elk1Var3;
                    kua0Var2 = kua0Var4;
                    bua0Var2 = bua0Var4;
                    vu30Var10 = vu30Var16;
                    vu30Var11 = vu30Var13;
                    hw61Var2 = hw61VarB;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    z6 = z;
                    z7 = z2;
                    lee1Var2 = lee1Var;
                    kua0Var2 = kua0Var;
                    z8 = z4;
                    i32 = i2;
                    i33 = i3;
                    hw61Var2 = hw61Var;
                    vu30Var9 = vu30Var5;
                    vu30Var10 = vu30Var7;
                    vu30Var11 = vu30Var8;
                    vu30Var12 = vu30Var6;
                    z9 = z3;
                    elk1Var2 = elk1Var;
                    bua0Var2 = bua0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30() { // from class: p.mtq0
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iP = czo1.p(i4 | 1);
                            int iP2 = czo1.p(i5);
                            String str2 = str;
                            iu30 iu30Var3 = iu30Var;
                            qim0 qim0Var2 = qim0Var;
                            boolean z113 = z6;
                            boolean z20 = z7;
                            lee1 lee1Var13 = lee1Var2;
                            vu30 vu30Var17 = vu30Var9;
                            vu30 vu30Var18 = vu30Var12;
                            vu30 vu30Var19 = vu30Var10;
                            vu30 vu30Var20 = vu30Var11;
                            boolean z21 = z9;
                            elk1 elk1Var13 = elk1Var2;
                            kua0 kua0Var5 = kua0Var2;
                            bua0 bua0Var5 = bua0Var2;
                            boolean z22 = z8;
                            int i416 = i32;
                            boolean z23 = i33;
                            hw61 hw61Var3 = hw61Var2;
                            j4e1 j4e1Var2 = j4e1Var;
                            int i417 = i6;
                            wpb1.g(str2, iu30Var3, qim0Var2, z113, z20, lee1Var13, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var13, kua0Var5, bua0Var5, z22, i416, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i417);
                            return rih1.a;
                        }
                    };
                }
            }
            i10 = i7 | 905969664;
            vu30Var6 = vu30Var2;
            i13 = i6 & 1024;
            if (i13 != 0) {
                i15 = i5 | 6;
                vu30Var7 = vu30Var3;
            } else {
                vu30Var7 = vu30Var3;
                if (b0kVar3.i(vu30Var7)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i15 = i5 | i14;
            }
            i16 = i15;
            i17 = i16 | 48;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i20 = i16 | 432;
                vu30Var8 = vu30Var4;
            } else {
                vu30Var8 = vu30Var4;
                if (b0kVar3.i(vu30Var8)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i20 = i17 | i19;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i20 | 3072;
            } else {
                int i416 = i20;
                if (b0kVar3.h(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i416 | i22;
            }
            i24 = i23 | 24576;
            i25 = i6 & 32768;
            if (i25 != 0) {
                i27 = i23 | 221184;
            } else {
                if (b0kVar3.g(kua0Var)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i27 = i24 | i26;
            }
            i28 = i6 & 65536;
            if (i28 != 0) {
                i30 = i27 | 1572864;
            } else {
                if (b0kVar3.g(bua0Var)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i30 = i27 | i29;
            }
            i31 = i6 & 131072;
            if (i31 != 0) {
                i30 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
            }
            int i417 = i30 | 838860800;
            if (b0kVar3.g(j4e1Var)) {
                c2 = 256;
            } else {
                c2 = 128;
            }
            int i418 = 22 | c2;
            if ((i10 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (b0kVar3.Y(i10 & 1, z5)) {
                b0kVar3.d0();
                if ((i4 & 1) != 0) {
                    if (i40 != 0) {
                        z10 = false;
                    } else {
                        z10 = z2;
                    }
                    lee1 lee1Var13 = (lee1) b0kVar3.k(q9e1.a);
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i13 != 0) {
                        vu30Var7 = null;
                    }
                    if (i18 != 0) {
                        vu30Var8 = null;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    elk1 elk1Var13 = m9x0.X0;
                    if (i25 != 0) {
                        kua0Var3 = kua0.g;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    if (i28 != 0) {
                        bua0Var3 = bua0.d;
                    } else {
                        bua0Var3 = bua0Var;
                    }
                    if (i31 != 0) {
                        z12 = false;
                    } else {
                        z12 = z4;
                    }
                    if (z12) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    hw61VarB = px61.b(b0kVar3, 5);
                    kua0Var4 = kua0Var3;
                    vu30Var13 = vu30Var8;
                    vu30Var14 = vu30Var6;
                    i35 = i34;
                    z13 = z10;
                    lee1Var3 = lee1Var13;
                    elk1Var3 = elk1Var13;
                    vu30Var15 = vu30Var5;
                    bua0Var4 = bua0Var3;
                    z14 = true;
                    i36 = 1;
                    vu30Var16 = vu30Var7;
                    z15 = z12;
                } else {
                    if (i40 != 0) {
                        z10 = false;
                    } else {
                        z10 = z2;
                    }
                    lee1 lee1Var14 = (lee1) b0kVar3.k(q9e1.a);
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i13 != 0) {
                        vu30Var7 = null;
                    }
                    if (i18 != 0) {
                        vu30Var8 = null;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    elk1 elk1Var14 = m9x0.X0;
                    if (i25 != 0) {
                        kua0Var3 = kua0.g;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    if (i28 != 0) {
                        bua0Var3 = bua0.d;
                    } else {
                        bua0Var3 = bua0Var;
                    }
                    if (i31 != 0) {
                        z12 = false;
                    } else {
                        z12 = z4;
                    }
                    if (z12) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    hw61VarB = px61.b(b0kVar3, 5);
                    kua0Var4 = kua0Var3;
                    vu30Var13 = vu30Var8;
                    vu30Var14 = vu30Var6;
                    i35 = i34;
                    z13 = z10;
                    lee1Var3 = lee1Var14;
                    elk1Var3 = elk1Var14;
                    vu30Var15 = vu30Var5;
                    bua0Var4 = bua0Var3;
                    z14 = true;
                    i36 = 1;
                    vu30Var16 = vu30Var7;
                    z15 = z12;
                }
                b0kVar3.s();
                b0kVar3.i0(1310051731);
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(b0kVar3);
                }
                idn0Var = (idn0) objT;
                z16 = false;
                b0kVar3.r(false);
                b0kVar3.i0(1981927842);
                jC = lee1Var3.c();
                if (jC != 16) {
                    z17 = z11;
                } else {
                    zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                    if (z14) {
                        z17 = z11;
                        j = j4e1Var.c;
                    } else {
                        z17 = z11;
                        if (z17) {
                            j = j4e1Var.d;
                        } else if (zBooleanValue) {
                            j = j4e1Var.a;
                        } else {
                            j = j4e1Var.b;
                        }
                    }
                    jC = j;
                    z16 = false;
                }
                long j7 = jC;
                b0kVar3.r(z16);
                boolean z113 = z17;
                b0kVar2 = b0kVar3;
                mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z113, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j7, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                z6 = z14;
                z7 = z13;
                z8 = z15;
                vu30Var9 = vu30Var15;
                vu30Var12 = vu30Var14;
                lee1Var2 = lee1Var3;
                z9 = z113;
                i32 = i35;
                i33 = i36;
                elk1Var2 = elk1Var3;
                kua0Var2 = kua0Var4;
                bua0Var2 = bua0Var4;
                vu30Var10 = vu30Var16;
                vu30Var11 = vu30Var13;
                hw61Var2 = hw61VarB;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z;
                z7 = z2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                z8 = z4;
                i32 = i2;
                i33 = i3;
                hw61Var2 = hw61Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var7;
                vu30Var11 = vu30Var8;
                vu30Var12 = vu30Var6;
                z9 = z3;
                elk1Var2 = elk1Var;
                bua0Var2 = bua0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.mtq0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i4 | 1);
                        int iP2 = czo1.p(i5);
                        String str2 = str;
                        iu30 iu30Var3 = iu30Var;
                        qim0 qim0Var2 = qim0Var;
                        boolean z114 = z6;
                        boolean z20 = z7;
                        lee1 lee1Var15 = lee1Var2;
                        vu30 vu30Var17 = vu30Var9;
                        vu30 vu30Var18 = vu30Var12;
                        vu30 vu30Var19 = vu30Var10;
                        vu30 vu30Var20 = vu30Var11;
                        boolean z21 = z9;
                        elk1 elk1Var15 = elk1Var2;
                        kua0 kua0Var5 = kua0Var2;
                        bua0 bua0Var5 = bua0Var2;
                        boolean z22 = z8;
                        int i419 = i32;
                        boolean z23 = i33;
                        hw61 hw61Var3 = hw61Var2;
                        j4e1 j4e1Var2 = j4e1Var;
                        int i4110 = i6;
                        wpb1.g(str2, iu30Var3, qim0Var2, z114, z20, lee1Var15, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var15, kua0Var5, bua0Var5, z22, i419, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i4110);
                        return rih1.a;
                    }
                };
            }
        }
        i7 = 14221312 | i39;
        vu30Var5 = vu30Var;
        i10 = i7 | 100663296;
        i11 = i6 & 512;
        if (i11 != 0) {
            if ((805306368 & i4) == 0) {
                vu30Var6 = vu30Var2;
                if (b0kVar3.i(vu30Var6)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i10 |= i12;
            }
            i13 = i6 & 1024;
            if (i13 != 0) {
                i15 = i5 | 6;
                vu30Var7 = vu30Var3;
            } else {
                vu30Var7 = vu30Var3;
                if (b0kVar3.i(vu30Var7)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i15 = i5 | i14;
            }
            i16 = i15;
            i17 = i16 | 48;
            i18 = i6 & 4096;
            if (i18 != 0) {
                i20 = i16 | 432;
                vu30Var8 = vu30Var4;
            } else {
                vu30Var8 = vu30Var4;
                if (b0kVar3.i(vu30Var8)) {
                    i19 = 256;
                } else {
                    i19 = 128;
                }
                i20 = i17 | i19;
            }
            i21 = i6 & 8192;
            if (i21 != 0) {
                i23 = i20 | 3072;
            } else {
                int i419 = i20;
                if (b0kVar3.h(z3)) {
                    i22 = 2048;
                } else {
                    i22 = 1024;
                }
                i23 = i419 | i22;
            }
            i24 = i23 | 24576;
            i25 = i6 & 32768;
            if (i25 != 0) {
                i27 = i23 | 221184;
            } else {
                if (b0kVar3.g(kua0Var)) {
                    i26 = 131072;
                } else {
                    i26 = 65536;
                }
                i27 = i24 | i26;
            }
            i28 = i6 & 65536;
            if (i28 != 0) {
                i30 = i27 | 1572864;
            } else {
                if (b0kVar3.g(bua0Var)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i30 = i27 | i29;
            }
            i31 = i6 & 131072;
            if (i31 != 0) {
                i30 |= 12582912;
            } else if ((i5 & 12582912) == 0) {
                i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
            }
            int i4110 = i30 | 838860800;
            if (b0kVar3.g(j4e1Var)) {
                c2 = 256;
            } else {
                c2 = 128;
            }
            int i4111 = 22 | c2;
            if ((i10 & 306783379) != 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (b0kVar3.Y(i10 & 1, z5)) {
                b0kVar3.d0();
                if ((i4 & 1) != 0) {
                    if (i40 != 0) {
                        z10 = false;
                    } else {
                        z10 = z2;
                    }
                    lee1 lee1Var15 = (lee1) b0kVar3.k(q9e1.a);
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i13 != 0) {
                        vu30Var7 = null;
                    }
                    if (i18 != 0) {
                        vu30Var8 = null;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    elk1 elk1Var15 = m9x0.X0;
                    if (i25 != 0) {
                        kua0Var3 = kua0.g;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    if (i28 != 0) {
                        bua0Var3 = bua0.d;
                    } else {
                        bua0Var3 = bua0Var;
                    }
                    if (i31 != 0) {
                        z12 = false;
                    } else {
                        z12 = z4;
                    }
                    if (z12) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    hw61VarB = px61.b(b0kVar3, 5);
                    kua0Var4 = kua0Var3;
                    vu30Var13 = vu30Var8;
                    vu30Var14 = vu30Var6;
                    i35 = i34;
                    z13 = z10;
                    lee1Var3 = lee1Var15;
                    elk1Var3 = elk1Var15;
                    vu30Var15 = vu30Var5;
                    bua0Var4 = bua0Var3;
                    z14 = true;
                    i36 = 1;
                    vu30Var16 = vu30Var7;
                    z15 = z12;
                } else {
                    if (i40 != 0) {
                        z10 = false;
                    } else {
                        z10 = z2;
                    }
                    lee1 lee1Var16 = (lee1) b0kVar3.k(q9e1.a);
                    if (i8 != 0) {
                        vu30Var5 = null;
                    }
                    if (i11 != 0) {
                        vu30Var6 = null;
                    }
                    if (i13 != 0) {
                        vu30Var7 = null;
                    }
                    if (i18 != 0) {
                        vu30Var8 = null;
                    }
                    if (i21 != 0) {
                        z11 = false;
                    } else {
                        z11 = z3;
                    }
                    elk1 elk1Var16 = m9x0.X0;
                    if (i25 != 0) {
                        kua0Var3 = kua0.g;
                    } else {
                        kua0Var3 = kua0Var;
                    }
                    if (i28 != 0) {
                        bua0Var3 = bua0.d;
                    } else {
                        bua0Var3 = bua0Var;
                    }
                    if (i31 != 0) {
                        z12 = false;
                    } else {
                        z12 = z4;
                    }
                    if (z12) {
                        i34 = 1;
                    } else {
                        i34 = Integer.MAX_VALUE;
                    }
                    hw61VarB = px61.b(b0kVar3, 5);
                    kua0Var4 = kua0Var3;
                    vu30Var13 = vu30Var8;
                    vu30Var14 = vu30Var6;
                    i35 = i34;
                    z13 = z10;
                    lee1Var3 = lee1Var16;
                    elk1Var3 = elk1Var16;
                    vu30Var15 = vu30Var5;
                    bua0Var4 = bua0Var3;
                    z14 = true;
                    i36 = 1;
                    vu30Var16 = vu30Var7;
                    z15 = z12;
                }
                b0kVar3.s();
                b0kVar3.i0(1310051731);
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(b0kVar3);
                }
                idn0Var = (idn0) objT;
                z16 = false;
                b0kVar3.r(false);
                b0kVar3.i0(1981927842);
                jC = lee1Var3.c();
                if (jC != 16) {
                    z17 = z11;
                } else {
                    zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                    if (z14) {
                        z17 = z11;
                        j = j4e1Var.c;
                    } else {
                        z17 = z11;
                        if (z17) {
                            j = j4e1Var.d;
                        } else if (zBooleanValue) {
                            j = j4e1Var.a;
                        } else {
                            j = j4e1Var.b;
                        }
                    }
                    jC = j;
                    z16 = false;
                }
                long j8 = jC;
                b0kVar3.r(z16);
                boolean z114 = z17;
                b0kVar2 = b0kVar3;
                mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z114, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j8, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
                z6 = z14;
                z7 = z13;
                z8 = z15;
                vu30Var9 = vu30Var15;
                vu30Var12 = vu30Var14;
                lee1Var2 = lee1Var3;
                z9 = z114;
                i32 = i35;
                i33 = i36;
                elk1Var2 = elk1Var3;
                kua0Var2 = kua0Var4;
                bua0Var2 = bua0Var4;
                vu30Var10 = vu30Var16;
                vu30Var11 = vu30Var13;
                hw61Var2 = hw61VarB;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z6 = z;
                z7 = z2;
                lee1Var2 = lee1Var;
                kua0Var2 = kua0Var;
                z8 = z4;
                i32 = i2;
                i33 = i3;
                hw61Var2 = hw61Var;
                vu30Var9 = vu30Var5;
                vu30Var10 = vu30Var7;
                vu30Var11 = vu30Var8;
                vu30Var12 = vu30Var6;
                z9 = z3;
                elk1Var2 = elk1Var;
                bua0Var2 = bua0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new vu30() { // from class: p.mtq0
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = czo1.p(i4 | 1);
                        int iP2 = czo1.p(i5);
                        String str2 = str;
                        iu30 iu30Var3 = iu30Var;
                        qim0 qim0Var2 = qim0Var;
                        boolean z115 = z6;
                        boolean z20 = z7;
                        lee1 lee1Var17 = lee1Var2;
                        vu30 vu30Var17 = vu30Var9;
                        vu30 vu30Var18 = vu30Var12;
                        vu30 vu30Var19 = vu30Var10;
                        vu30 vu30Var20 = vu30Var11;
                        boolean z21 = z9;
                        elk1 elk1Var17 = elk1Var2;
                        kua0 kua0Var5 = kua0Var2;
                        bua0 bua0Var5 = bua0Var2;
                        boolean z22 = z8;
                        int i4112 = i32;
                        boolean z23 = i33;
                        hw61 hw61Var3 = hw61Var2;
                        j4e1 j4e1Var2 = j4e1Var;
                        int i4113 = i6;
                        wpb1.g(str2, iu30Var3, qim0Var2, z115, z20, lee1Var17, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var17, kua0Var5, bua0Var5, z22, i4112, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i4113);
                        return rih1.a;
                    }
                };
            }
        }
        i10 = i7 | 905969664;
        vu30Var6 = vu30Var2;
        i13 = i6 & 1024;
        if (i13 != 0) {
            i15 = i5 | 6;
            vu30Var7 = vu30Var3;
        } else {
            vu30Var7 = vu30Var3;
            if (b0kVar3.i(vu30Var7)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i15 = i5 | i14;
        }
        i16 = i15;
        i17 = i16 | 48;
        i18 = i6 & 4096;
        if (i18 != 0) {
            i20 = i16 | 432;
            vu30Var8 = vu30Var4;
        } else {
            vu30Var8 = vu30Var4;
            if (b0kVar3.i(vu30Var8)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i20 = i17 | i19;
        }
        i21 = i6 & 8192;
        if (i21 != 0) {
            i23 = i20 | 3072;
        } else {
            int i4112 = i20;
            if (b0kVar3.h(z3)) {
                i22 = 2048;
            } else {
                i22 = 1024;
            }
            i23 = i4112 | i22;
        }
        i24 = i23 | 24576;
        i25 = i6 & 32768;
        if (i25 != 0) {
            i27 = i23 | 221184;
        } else {
            if (b0kVar3.g(kua0Var)) {
                i26 = 131072;
            } else {
                i26 = 65536;
            }
            i27 = i24 | i26;
        }
        i28 = i6 & 65536;
        if (i28 != 0) {
            i30 = i27 | 1572864;
        } else {
            if (b0kVar3.g(bua0Var)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i30 = i27 | i29;
        }
        i31 = i6 & 131072;
        if (i31 != 0) {
            i30 |= 12582912;
        } else if ((i5 & 12582912) == 0) {
            i30 |= b0kVar3.h(z4) ? 8388608 : 4194304;
        }
        int i4113 = i30 | 838860800;
        if (b0kVar3.g(j4e1Var)) {
            c2 = 256;
        } else {
            c2 = 128;
        }
        int i4114 = 22 | c2;
        if ((i10 & 306783379) != 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (b0kVar3.Y(i10 & 1, z5)) {
            b0kVar3.d0();
            if ((i4 & 1) != 0) {
                if (i40 != 0) {
                    z10 = false;
                } else {
                    z10 = z2;
                }
                lee1 lee1Var17 = (lee1) b0kVar3.k(q9e1.a);
                if (i8 != 0) {
                    vu30Var5 = null;
                }
                if (i11 != 0) {
                    vu30Var6 = null;
                }
                if (i13 != 0) {
                    vu30Var7 = null;
                }
                if (i18 != 0) {
                    vu30Var8 = null;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                elk1 elk1Var17 = m9x0.X0;
                if (i25 != 0) {
                    kua0Var3 = kua0.g;
                } else {
                    kua0Var3 = kua0Var;
                }
                if (i28 != 0) {
                    bua0Var3 = bua0.d;
                } else {
                    bua0Var3 = bua0Var;
                }
                if (i31 != 0) {
                    z12 = false;
                } else {
                    z12 = z4;
                }
                if (z12) {
                    i34 = 1;
                } else {
                    i34 = Integer.MAX_VALUE;
                }
                hw61VarB = px61.b(b0kVar3, 5);
                kua0Var4 = kua0Var3;
                vu30Var13 = vu30Var8;
                vu30Var14 = vu30Var6;
                i35 = i34;
                z13 = z10;
                lee1Var3 = lee1Var17;
                elk1Var3 = elk1Var17;
                vu30Var15 = vu30Var5;
                bua0Var4 = bua0Var3;
                z14 = true;
                i36 = 1;
                vu30Var16 = vu30Var7;
                z15 = z12;
            } else {
                if (i40 != 0) {
                    z10 = false;
                } else {
                    z10 = z2;
                }
                lee1 lee1Var18 = (lee1) b0kVar3.k(q9e1.a);
                if (i8 != 0) {
                    vu30Var5 = null;
                }
                if (i11 != 0) {
                    vu30Var6 = null;
                }
                if (i13 != 0) {
                    vu30Var7 = null;
                }
                if (i18 != 0) {
                    vu30Var8 = null;
                }
                if (i21 != 0) {
                    z11 = false;
                } else {
                    z11 = z3;
                }
                elk1 elk1Var18 = m9x0.X0;
                if (i25 != 0) {
                    kua0Var3 = kua0.g;
                } else {
                    kua0Var3 = kua0Var;
                }
                if (i28 != 0) {
                    bua0Var3 = bua0.d;
                } else {
                    bua0Var3 = bua0Var;
                }
                if (i31 != 0) {
                    z12 = false;
                } else {
                    z12 = z4;
                }
                if (z12) {
                    i34 = 1;
                } else {
                    i34 = Integer.MAX_VALUE;
                }
                hw61VarB = px61.b(b0kVar3, 5);
                kua0Var4 = kua0Var3;
                vu30Var13 = vu30Var8;
                vu30Var14 = vu30Var6;
                i35 = i34;
                z13 = z10;
                lee1Var3 = lee1Var18;
                elk1Var3 = elk1Var18;
                vu30Var15 = vu30Var5;
                bua0Var4 = bua0Var3;
                z14 = true;
                i36 = 1;
                vu30Var16 = vu30Var7;
                z15 = z12;
            }
            b0kVar3.s();
            b0kVar3.i0(1310051731);
            objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = ktd.n(b0kVar3);
            }
            idn0Var = (idn0) objT;
            z16 = false;
            b0kVar3.r(false);
            b0kVar3.i0(1981927842);
            jC = lee1Var3.c();
            if (jC != 16) {
                z17 = z11;
            } else {
                zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                if (z14) {
                    z17 = z11;
                    j = j4e1Var.c;
                } else {
                    z17 = z11;
                    if (z17) {
                        j = j4e1Var.d;
                    } else if (zBooleanValue) {
                        j = j4e1Var.a;
                    } else {
                        j = j4e1Var.b;
                    }
                }
                jC = j;
                z16 = false;
            }
            long j9 = jC;
            b0kVar3.r(z16);
            boolean z115 = z17;
            b0kVar2 = b0kVar3;
            mod.b(sce1.a.a(j4e1Var.k), apo.r(1874034984, new rtq0(qim0Var, z115, j4e1Var, str, iu30Var2, z14, z13, lee1Var3.e(new lee1(j9, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var4, bua0Var4, z15, i35, i36, elk1Var3, idn0Var, vu30Var15, vu30Var14, vu30Var16, vu30Var13, hw61VarB), b0kVar2), b0kVar2, 56);
            z6 = z14;
            z7 = z13;
            z8 = z15;
            vu30Var9 = vu30Var15;
            vu30Var12 = vu30Var14;
            lee1Var2 = lee1Var3;
            z9 = z115;
            i32 = i35;
            i33 = i36;
            elk1Var2 = elk1Var3;
            kua0Var2 = kua0Var4;
            bua0Var2 = bua0Var4;
            vu30Var10 = vu30Var16;
            vu30Var11 = vu30Var13;
            hw61Var2 = hw61VarB;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z6 = z;
            z7 = z2;
            lee1Var2 = lee1Var;
            kua0Var2 = kua0Var;
            z8 = z4;
            i32 = i2;
            i33 = i3;
            hw61Var2 = hw61Var;
            vu30Var9 = vu30Var5;
            vu30Var10 = vu30Var7;
            vu30Var11 = vu30Var8;
            vu30Var12 = vu30Var6;
            z9 = z3;
            elk1Var2 = elk1Var;
            bua0Var2 = bua0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.mtq0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i4 | 1);
                    int iP2 = czo1.p(i5);
                    String str2 = str;
                    iu30 iu30Var3 = iu30Var;
                    qim0 qim0Var2 = qim0Var;
                    boolean z116 = z6;
                    boolean z20 = z7;
                    lee1 lee1Var19 = lee1Var2;
                    vu30 vu30Var17 = vu30Var9;
                    vu30 vu30Var18 = vu30Var12;
                    vu30 vu30Var19 = vu30Var10;
                    vu30 vu30Var20 = vu30Var11;
                    boolean z21 = z9;
                    elk1 elk1Var19 = elk1Var2;
                    kua0 kua0Var5 = kua0Var2;
                    bua0 bua0Var5 = bua0Var2;
                    boolean z22 = z8;
                    int i4115 = i32;
                    boolean z23 = i33;
                    hw61 hw61Var3 = hw61Var2;
                    j4e1 j4e1Var2 = j4e1Var;
                    int i4116 = i6;
                    wpb1.g(str2, iu30Var3, qim0Var2, z116, z20, lee1Var19, vu30Var17, vu30Var18, vu30Var19, vu30Var20, z21, elk1Var19, kua0Var5, bua0Var5, z22, i4115, z23 ? 1 : 0, hw61Var3, j4e1Var2, (b0k) obj, iP, iP2, i4116);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x026a  */
    /* JADX WARN: Code duplicated, block: B:167:0x0296  */
    /* JADX WARN: Code duplicated, block: B:168:0x029a  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:177:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:180:0x0300  */
    /* JADX WARN: Code duplicated, block: B:185:0x031b  */
    /* JADX WARN: Code duplicated, block: B:188:0x032d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0342  */
    /* JADX WARN: Code duplicated, block: B:193:0x0348  */
    /* JADX WARN: Code duplicated, block: B:196:0x034d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0353  */
    /* JADX WARN: Code duplicated, block: B:201:0x0359  */
    /* JADX WARN: Code duplicated, block: B:203:0x0397  */
    /* JADX WARN: Code duplicated, block: B:204:0x039b  */
    /* JADX WARN: Code duplicated, block: B:209:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:213:0x03da  */
    /* JADX WARN: Code duplicated, block: B:215:0x0418  */
    /* JADX WARN: Code duplicated, block: B:216:0x041c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0437  */
    /* JADX WARN: Code duplicated, block: B:224:0x044d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0466  */
    /* JADX WARN: Code duplicated, block: B:228:0x0469  */
    /* JADX WARN: Code duplicated, block: B:230:0x046d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0470  */
    /* JADX WARN: Code duplicated, block: B:234:0x047e  */
    /* JADX WARN: Code duplicated, block: B:235:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:238:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:239:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:244:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:247:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:249:0x050a  */
    /* JADX WARN: Code duplicated, block: B:251:0x050e  */
    /* JADX WARN: Code duplicated, block: B:254:0x0517  */
    /* JADX WARN: Code duplicated, block: B:256:0x051b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0524  */
    /* JADX WARN: Code duplicated, block: B:264:0x052b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0568  */
    /* JADX WARN: Code duplicated, block: B:268:0x056c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0579  */
    /* JADX WARN: Code duplicated, block: B:273:0x0587  */
    /* JADX WARN: Code duplicated, block: B:275:0x0599  */
    /* JADX WARN: Code duplicated, block: B:277:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:279:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:285:0x0603  */
    /* JADX WARN: Code duplicated, block: B:287:0x0615  */
    public static final void h(final vu30 vu30Var, xu30 xu30Var, vu30 vu30Var2, final vu30 vu30Var3, final vu30 vu30Var4, final vu30 vu30Var5, vu30 vu30Var6, final boolean z, final w5e1 w5e1Var, final o5e1 o5e1Var, final iu30 iu30Var, final j2i j2iVar, vu30 vu30Var7, final vzq0 vzq0Var, b0k b0kVar, final int i2, final int i3) {
        int i4;
        int i5;
        vu30 vu30Var8;
        xu30 xu30Var2;
        x340 x340Var;
        m4c m4cVar;
        tl3 tl3Var;
        llj lljVar;
        boolean z2;
        float fN;
        float fM;
        float f2;
        tl3 tl3Var2;
        float f3;
        float f4;
        qim0 qim0VarB;
        int iK;
        boolean z3;
        int iK2;
        o5e1 o5e1Var2;
        boolean z4;
        Object objT;
        int iK3;
        int iK4;
        int iK5;
        int iK6;
        int iK7;
        final vu30 vu30Var9 = vu30Var2;
        final vu30 vu30Var10 = vu30Var6;
        gra graVar = een.h;
        m4c m4cVar2 = fkj0.X;
        tl3 tl3Var3 = een.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(753699262);
        j06 j06Var = x340Var2.a;
        int i6 = i2 & 6;
        nim0 nim0Var = nim0.a;
        m4c m4cVar3 = m4cVar2;
        if (i6 == 0) {
            i4 = i2 | (x340Var2.g(nim0Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(vu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.i(xu30Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.i(vu30Var9) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var2.i(vu30Var3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= x340Var2.i(vu30Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= x340Var2.i(vu30Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= x340Var2.i(vu30Var10) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= x340Var2.h(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var2.g(w5e1Var) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | ((i3 & 8) == 0 ? x340Var2.g(o5e1Var) : x340Var2.i(o5e1Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var2.i(j2iVar) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var2.i(vu30Var7) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= x340Var2.g(vzq0Var) ? 16384 : 8192;
        }
        int i7 = i5;
        if (x340Var2.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            float F = i3p1.F(x340Var2);
            int i8 = i7 & 14;
            boolean zD = ((i4 & 234881024) == 67108864) | ((i7 & 112) == 32) | ((i4 & 1879048192) == 536870912) | (i8 == 4 || ((i7 & 8) != 0 && x340Var2.g(o5e1Var))) | ((i7 & 57344) == 16384) | x340Var2.d(F);
            Object objT2 = x340Var2.T();
            if (zD) {
                x340Var = x340Var2;
                m4cVar = m4cVar3;
                ttq0 ttq0Var = new ttq0(iu30Var, z, w5e1Var, o5e1Var, vzq0Var, F);
                x340Var.s0(ttq0Var);
                objT2 = ttq0Var;
            } else if (objT2 == m4cVar3) {
                m4cVar3 = m4cVar3;
                x340Var = x340Var2;
                m4cVar = m4cVar3;
                ttq0 ttq0Var2 = new ttq0(iu30Var, z, w5e1Var, o5e1Var, vzq0Var, F);
                x340Var.s0(ttq0Var2);
                objT2 = ttq0Var2;
            } else {
                m4cVar = m4cVar3;
                x340Var = x340Var2;
            }
            ttq0 ttq0Var3 = (ttq0) objT2;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            int iK8 = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, (qim0) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0213: INVOKE (r7v3 'qim0VarE' p.qim0) = (r1v7 'x340Var' p.x340), (wrap p.qim0:?: CAST (p.qim0) (r9v8 ?? I:??[OBJECT, ARRAY])) STATIC call: p.zr7.E(p.b0k, p.qim0):p.qim0 A[DECLARE_VAR] (LINE:15) in method: p.wpb1.h(p.vu30, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, p.w5e1, p.o5e1, p.iu30, p.j2i, p.vu30, p.vzq0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes12.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v8 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1631
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.wpb1.h(p.vu30, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, p.w5e1, p.o5e1, p.iu30, p.j2i, p.vu30, p.vzq0, p.b0k, int, int):void");
        }

        public static final void i(m4m1 m4m1Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6, Function0 function0, iu30 iu30Var7, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, b0k b0kVar, int i2) {
            b0k b0kVar2;
            qim0 qim0Var2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-20317559);
            int i3 = i2 | (b0kVar3.g(m4m1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(iu30Var2) ? 256 : 128) | (b0kVar3.i(iu30Var3) ? 2048 : 1024) | (b0kVar3.i(iu30Var4) ? 16384 : 8192) | (b0kVar3.i(iu30Var5) ? 131072 : 65536) | (b0kVar3.i(iu30Var6) ? 1048576 : 524288) | (b0kVar3.i(function0) ? 8388608 : 4194304) | (b0kVar3.i(iu30Var7) ? 67108864 : 33554432) | (b0kVar3.i(function1) ? 536870912 : 268435456);
            if (b0kVar3.Y(i3 & 1, ((306783379 & i3) == 306783378 && ((((b0kVar3.i(function2) ? (char) 4 : (char) 2) | (b0kVar3.i(function3) ? ' ' : (char) 16)) | 384) & 147) == 146) ? false : true)) {
                boolean z = m4m1Var != null;
                bby bbyVarE = xay.e(3, (ni20) null);
                j2i j2iVarR = apo.r(953869489, new ssk(m4m1Var, iu30Var, iu30Var2, function2, iu30Var3, function3, iu30Var4, iu30Var5, iu30Var6, function0, iu30Var7, function1), b0kVar3);
                qim0 qim0Var3 = nim0.a;
                b0kVar2 = b0kVar3;
                fq7.g(z, qim0Var3, bbyVarE, (ln00) null, (String) null, j2iVarR, b0kVar2, 196656, 24);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new fdo0(m4m1Var, iu30Var, iu30Var2, iu30Var3, iu30Var4, iu30Var5, iu30Var6, function0, iu30Var7, function1, function2, function3, qim0Var2, i2);
            }
        }

        public static final void j(b0k b0kVar, int i2) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(838340099);
            if (x340Var.Y(i2 & 1, i2 != 0)) {
                uwr uwrVar = cbx.a;
                long jC = cbx.a(x340Var).a.b.c();
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
                qim0 qim0VarH = u291.h(u291.f(nim0Var, 0.5f), 18.0f);
                cua cuaVar = cbx.b(x340Var).f;
                t1c.a(dug.f(qim0VarH, jC, er31.b(4.0f)), x340Var, 0);
                qim0 qim0VarH2 = u291.h(ab80.o(nim0Var, 8.0f, x340Var, nim0Var, 0.3f), 14.0f);
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(dug.f(qim0VarH2, jC, er31.b(4.0f)), x340Var, 0);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new htu(i2, (byte) 11);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public static final void k(loy loyVar, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
            int i3;
            boolean z;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(2114936971);
            if ((i2 & 6) == 0) {
                i3 = (x340Var.i(loyVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
                int i4 = loyVar.b;
                boolean z2 = loyVar.f;
                String strK = loyVar.d;
                int iC = l1d.C(i4);
                if (iC == 0) {
                    strK = x0d.k(x340Var, 934901194, 2131958262, x340Var, false);
                } else if (iC == 1) {
                    x340Var.i0(-1082746078);
                    if (strK != null) {
                        x340Var.i0(-1082672360);
                        String strN0 = cwl1.n0(2131958263, new Object[]{strK}, x340Var);
                        x340Var.r(false);
                        strK = strN0;
                    } else {
                        x340Var.i0(-1082574307);
                        x340Var.r(false);
                        strK = null;
                    }
                    x340Var.r(false);
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var, 934900204, false);
                    }
                    x340Var.i0(934911575);
                    x340Var.r(false);
                }
                String str = strK;
                if (str != null || z2) {
                    x340Var.i0(-1082425972);
                    fra fraVar = een.N0;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
                    if (z2) {
                        x340Var.i0(-1424673347);
                        kqn1.d(2, 6, 2, x340Var, (qim0) null);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-1424585896);
                        x340Var.r(false);
                    }
                    if (str != null) {
                        x340Var.i0(-1424540171);
                        z = false;
                        uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1714);
                        x340Var.r(false);
                    } else {
                        z = false;
                        x340Var.i0(-1424314088);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    x340Var.r(z);
                } else {
                    x340Var.i0(-1081888649);
                    x340Var.r(false);
                }
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new du0(loyVar, i2, (byte) 26);
            }
        }

        public static final void l(loy loyVar, d0r d0rVar, wh1 wh1Var, ycm ycmVar, j6q j6qVar, String str, b0k b0kVar, int i2) {
            int i3;
            x340 x340Var;
            boolean z;
            m4c m4cVar;
            cku0 cku0Var;
            llj lljVar = y580.Y;
            llj lljVar2 = y580.R0;
            llj lljVar3 = y580.N0;
            llj lljVar4 = y580.O0;
            gra graVar = een.d;
            m4c m4cVar2 = fkj0.X;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(226607742);
            j06 j06Var = x340Var2.a;
            if ((i2 & 6) == 0) {
                i3 = (x340Var2.i(loyVar) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 48) == 0) {
                i3 |= x340Var2.i(d0rVar) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i3 |= x340Var2.i(wh1Var) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i3 |= x340Var2.i(ycmVar) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i3 |= x340Var2.i(j6qVar) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i3 |= x340Var2.g(str) ? 131072 : 65536;
            }
            int i4 = i3;
            if (x340Var2.Y(i4 & 1, (i3 & 74899) != 74898)) {
                int i5 = loyVar.b;
                vpb1 vpb1Var = loyVar.l;
                int iC = l1d.C(i5);
                nim0 nim0Var = nim0.a;
                Function0 function0 = hmb0.t1;
                if (iC == 0) {
                    x340Var = x340Var2;
                    x340Var.i0(-816990671);
                    boolean zG = x340Var.g(d0rVar);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar2) {
                        objT = wh1Var.a.m().a(d0rVar);
                        x340Var.s0(objT);
                    }
                    vh1 vh1Var = (vh1) objT;
                    qim0 qim0VarN = anm1.N("entity_preview_action_follow", nim0Var);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC, x340Var, lljVar4);
                    nko1.H(xos0VarM, x340Var, lljVar3);
                    x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE, x340Var, lljVar);
                    i1o1.e(vh1Var, new uho(loyVar.a, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), d0rVar, (qim0) null, (ipb1) null, kmi.a, kmi.b, 0, (xu30) null, x340Var, 1769480 | ((i4 << 3) & 896), 204);
                    x340Var.r(true);
                    x340Var.r(false);
                } else if (iC == 1) {
                    x340Var2.i0(-816514170);
                    String str2 = "entity_preview_action_curate";
                    if (vpb1Var instanceof foy) {
                        x340Var2.i0(-816488471);
                        boolean zG2 = x340Var2.g(d0rVar);
                        Object objT2 = x340Var2.T();
                        if (zG2 || objT2 == m4cVar2) {
                            objT2 = wh1Var.a.m().a(d0rVar);
                            x340Var2.s0(objT2);
                        }
                        vh1 vh1Var2 = (vh1) objT2;
                        qim0 qim0VarN2 = anm1.N("entity_preview_action_curate", nim0Var);
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        int iHashCode2 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM2 = x340Var2.m();
                        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarN2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(function0);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var2, lljVar4);
                        nko1.H(xos0VarM2, x340Var2, lljVar3);
                        x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                        nko1.H(qim0VarE2, x340Var2, lljVar);
                        i1o1.e(vh1Var2, new uho(loyVar.a, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), d0rVar, (qim0) null, (ipb1) null, kmi.c, kmi.d, 0, (xu30) null, x340Var2, 1769480 | ((i4 << 3) & 896), 204);
                        x340Var = x340Var2;
                        x340Var.r(true);
                        z = false;
                        x340Var.r(false);
                    } else {
                        x340Var = x340Var2;
                        String str3 = "entity_preview_action_more";
                        if (vpb1Var instanceof goy) {
                            x340Var.i0(-815988038);
                            String str4 = ((goy) vpb1Var).f;
                            boolean zG3 = x340Var.g(d0rVar);
                            String str5 = str4;
                            Object objT3 = x340Var.T();
                            if (zG3 || objT3 == m4cVar2) {
                                switch (j6qVar.a) {
                                    case 0:
                                        m4cVar = m4cVar2;
                                        daq daqVar = j6qVar.b.b;
                                        cku0Var = new cku0((iyc0) daqVar.g5.get(), (kt91) daqVar.f8.get(), (jr2) daqVar.gq.get(), (q8n) daqVar.V2.get(), d0rVar, str);
                                        break;
                                    default:
                                        thq thqVar = j6qVar.b;
                                        iyc0 iyc0Var = (iyc0) thqVar.c.g1.get();
                                        daq daqVar2 = thqVar.b;
                                        m4cVar = m4cVar2;
                                        cku0Var = new cku0(iyc0Var, (kt91) daqVar2.f8.get(), (jr2) daqVar2.gq.get(), (q8n) daqVar2.V2.get(), d0rVar, str);
                                        break;
                                }
                                objT3 = cku0Var;
                                x340Var.s0(objT3);
                            } else {
                                m4cVar = m4cVar2;
                                str3 = "entity_preview_action_more";
                                str2 = "entity_preview_action_curate";
                                lljVar = lljVar;
                                str5 = str5;
                                function0 = function0;
                            }
                            cku0 cku0Var2 = (cku0) objT3;
                            qim0 qim0VarN3 = anm1.N(str2, nim0Var);
                            gfh0 gfh0VarC3 = t1c.c(graVar, false);
                            int iHashCode3 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM3 = x340Var.m();
                            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarN3);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC3, x340Var, lljVar4);
                            nko1.H(xos0VarM3, x340Var, lljVar3);
                            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                            llj lljVar5 = lljVar;
                            nko1.H(qim0VarE3, x340Var, lljVar5);
                            otw.c(cku0Var2, new wju0(loyVar.a, str5, loyVar.m), (qim0) null, (ipb1) null, x340Var, 0, 12);
                            x340Var.r(true);
                            Object objT4 = x340Var.T();
                            if (objT4 == m4cVar) {
                                objT4 = ycm.a(ycmVar);
                                x340Var.s0(objT4);
                            }
                            idm idmVar = (idm) objT4;
                            qim0 qim0VarN4 = anm1.N(str3, nim0Var);
                            gfh0 gfh0VarC4 = t1c.c(graVar, false);
                            int iHashCode4 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM4 = x340Var.m();
                            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarN4);
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC4, x340Var, lljVar4);
                            nko1.H(xos0VarM4, x340Var, lljVar3);
                            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                            nko1.H(qim0VarE4, x340Var, lljVar5);
                            otw.c(idmVar, new wcm(loyVar.a, (String) null, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1022), (qim0) null, (ipb1) null, x340Var, 0, 12);
                            x340Var.r(true);
                            z = false;
                            x340Var.r(false);
                        } else {
                            if (!(vpb1Var instanceof eoy)) {
                                throw p3d1.k(x340Var, -1273265156, false);
                            }
                            x340Var.i0(-814942222);
                            Object objT5 = x340Var.T();
                            if (objT5 == m4cVar2) {
                                objT5 = ycm.a(ycmVar);
                                x340Var.s0(objT5);
                            }
                            idm idmVar2 = (idm) objT5;
                            qim0 qim0VarN5 = anm1.N("entity_preview_action_more", nim0Var);
                            gfh0 gfh0VarC5 = t1c.c(graVar, false);
                            int iHashCode5 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM5 = x340Var.m();
                            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarN5);
                            hzj.A.getClass();
                            if (j06Var == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0VarC5, x340Var, lljVar4);
                            nko1.H(xos0VarM5, x340Var, lljVar3);
                            x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                            nko1.H(qim0VarE5, x340Var, lljVar);
                            otw.c(idmVar2, new wcm(loyVar.a, (String) null, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1022), (qim0) null, (ipb1) null, x340Var, 0, 12);
                            x340Var.r(true);
                            z = false;
                            x340Var.r(false);
                        }
                    }
                    x340Var.r(z);
                } else {
                    if (iC != 2) {
                        throw p3d1.k(x340Var2, -1273279660, false);
                    }
                    x340Var2.i0(-1273201854);
                    x340Var2.r(false);
                    x340Var = x340Var2;
                }
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bpy(loyVar, d0rVar, wh1Var, ycmVar, j6qVar, str, i2, (byte) 1);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r8v14 */
        /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
        /* JADX WARN: Type inference failed for: r8v20 */
        /* JADX WARN: Type inference failed for: r8v21 */
        /* JADX WARN: Type inference failed for: r8v26 */
        /* JADX WARN: Type inference failed for: r8v27 */
        public static final void m(g2m1 g2m1Var, b2m1 b2m1Var, zxl1 zxl1Var, los losVar, Function0 function0, iu30 iu30Var, int i2, qim0 qim0Var, b0k b0kVar, int i3) {
            los losVar2;
            b0k b0kVar2;
            qim0 qim0Var2;
            Object obj;
            boolean z;
            ?? r1;
            tob1 tob1Var;
            byte b2;
            Object obj2;
            b2m1 b2m1Var2 = b2m1Var;
            zxl1 zxl1Var2 = zxl1Var;
            m4c m4cVar = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-405476500);
            int i4 = i3 | (b0kVar3.i(g2m1Var) ? 4 : 2) | (b0kVar3.i(b2m1Var2) ? 32 : 16) | (b0kVar3.i(zxl1Var2) ? 256 : 128) | (b0kVar3.i(losVar) ? 2048 : 1024) | (b0kVar3.i(function0) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536) | (b0kVar3.e(i2) ? 1048576 : 524288) | 12582912;
            if (b0kVar3.Y(i4 & 1, (4793491 & i4) != 4793490)) {
                boolean zI = b0kVar3.i(g2m1Var);
                Object objT = b0kVar3.T();
                if (zI || objT == m4cVar) {
                    obj = objT;
                    tak1 tak1Var = new tak1(g2m1Var, (byte) 29);
                    b0kVar3.s0(tak1Var);
                    obj = tak1Var;
                }
                qxd0.i(rih1.a, (iu30) obj, b0kVar3);
                ven0 ven0VarH = rwq.h(b2m1Var2.b, b0kVar3, 0);
                m4m1 m4m1Var = (o4m1) ven0VarH.getValue();
                m4m1 m4m1Var2 = m4m1Var instanceof m4m1 ? m4m1Var : null;
                boolean z2 = m4m1Var2 != null ? m4m1Var2.w : false;
                boolean z3 = m4m1Var2 != null ? m4m1Var2.t : false;
                Object objT2 = b0kVar3.T();
                Object obj3 = objT2;
                if (objT2 == m4cVar) {
                    hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                    b0kVar3.s0(hrr0VarQ);
                    obj3 = hrr0VarQ;
                }
                tob1 tob1Var2 = (ven0) obj3;
                boolean z4 = z2 || z3;
                Boolean boolValueOf = Boolean.valueOf(z4);
                boolean z5 = z4;
                boolean zH = ((i4 & 458752) == 131072) | b0kVar3.h(z5);
                Object objT3 = b0kVar3.T();
                Object obj4 = objT3;
                if (zH || objT3 == m4cVar) {
                    w73 w73Var = new w73(iu30Var, z5, null, (byte) 23);
                    b0kVar3.s0(w73Var);
                    obj4 = w73Var;
                }
                qxd0.t(boolValueOf, b0kVar3, (vu30) obj4);
                ven0 ven0VarS = v8r.s(Boolean.valueOf(z3), b0kVar3);
                boolean zI2 = b0kVar3.i(losVar) | b0kVar3.i(ven0VarS) | b0kVar3.i(tob1Var2);
                Object objT4 = b0kVar3.T();
                if (zI2 || objT4 == m4cVar) {
                    z = z5;
                    r1 = 0;
                    jyi1 jyi1Var = new jyi1(losVar, ven0VarS, tob1Var2, false, (byte) 14);
                    losVar2 = losVar;
                    tob1Var = tob1Var2;
                    b0kVar3.s0(jyi1Var);
                    objT4 = jyi1Var;
                } else {
                    z = z5;
                    tob1Var = tob1Var2;
                    r1 = 0;
                    losVar2 = losVar;
                }
                qxd0.i(losVar2, (iu30) objT4, b0kVar3);
                ?? r8 = (!z || ((Boolean) tob1Var.getValue()).booleanValue()) ? r1 : 1;
                boolean zH2 = b0kVar3.h(z3) | b0kVar3.i(tob1Var);
                Object objT5 = b0kVar3.T();
                Object obj5 = objT5;
                if (zH2 || objT5 == m4cVar) {
                    y72 y72Var = new y72(z3, tob1Var, (byte) 5);
                    b0kVar3.s0(y72Var);
                    obj5 = y72Var;
                }
                q3p1.b((int) r1, (int) r1, (Function0) obj5, b0kVar3, (boolean) r8);
                o4m1 o4m1Var = (o4m1) ven0VarH.getValue();
                int i5 = i4 & 57344;
                int i6 = (((b0kVar3.h(z3) ? 1 : 0) | (b0kVar3.h(z2) ? 1 : 0)) | (b0kVar3.i(tob1Var) ? 1 : 0) ? 1 : 0) | (i5 == 16384 ? 1 : r1);
                Object objT6 = b0kVar3.T();
                Object obj6 = objT6;
                if (i6 != 0 || objT6 == m4cVar) {
                    rj6 rj6Var = new rj6(z3, z2, function0, tob1Var);
                    b0kVar3.s0(rj6Var);
                    obj6 = rj6Var;
                }
                tob1 tob1Var3 = tob1Var;
                b0kVar2 = b0kVar3;
                p(o4m1Var, b2m1Var, zxl1Var2, (Function0) obj6, i2, b0kVar2, (i4 & 1008) | ((i4 >> 6) & 57344) | 196608);
                b2m1Var2 = b2m1Var;
                zxl1Var2 = zxl1Var2;
                if (((Boolean) tob1Var3.getValue()).booleanValue()) {
                    b0kVar2.i0(-2099968492);
                    boolean zI3 = b0kVar2.i(tob1Var3) | b0kVar2.i(zxl1Var2) | b0kVar2.i(b2m1Var2);
                    Object objT7 = b0kVar2.T();
                    if (zI3 || objT7 == m4cVar) {
                        b2 = 1;
                        hml1 hml1Var = new hml1(zxl1Var2, b2m1Var2, tob1Var3, b2);
                        b0kVar2.s0(hml1Var);
                        obj2 = hml1Var;
                    } else {
                        b2 = 1;
                        obj2 = objT7;
                    }
                    Function0 function1 = (Function0) obj2;
                    int i7 = (b0kVar2.i(tob1Var3) ? 1 : 0) | (i5 == 16384 ? b2 : r1);
                    Object objT8 = b0kVar2.T();
                    Object obj7 = objT8;
                    if (i7 != 0 || objT8 == m4cVar) {
                        swi0 swi0Var = new swi0(function0, tob1Var3, (byte) 21);
                        b0kVar2.s0(swi0Var);
                        obj7 = swi0Var;
                    }
                    Function0 function2 = (Function0) obj7;
                    boolean zI4 = b0kVar2.i(tob1Var3);
                    Object objT9 = b0kVar2.T();
                    Object obj8 = objT9;
                    if (zI4 || objT9 == m4cVar) {
                        mek1 mek1Var = new mek1(tob1Var3, (byte) 8);
                        b0kVar2.s0(mek1Var);
                        obj8 = mek1Var;
                    }
                    v8r.c(function1, function2, (Function0) obj8, b0kVar2, (int) r1);
                    b0kVar2.r((boolean) r1);
                } else {
                    b0kVar2.i0(-2099659050);
                    b0kVar2.r((boolean) r1);
                }
                qim0Var2 = nim0.a;
            } else {
                losVar2 = losVar;
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new kt3(g2m1Var, b2m1Var2, zxl1Var2, losVar2, function0, iu30Var, i2, qim0Var2, i3);
            }
        }

        public static final void n(ven0 ven0Var, boolean z) {
            ven0Var.setValue(Boolean.valueOf(z));
        }

        public static final void o(b2m1 b2m1Var, zxl1 zxl1Var, qim0 qim0Var, b0k b0kVar, int i2) {
            qim0 qim0Var2;
            ws61 ws61Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1030028736);
            int i3 = i2 | (x340Var.i(b2m1Var) ? 4 : 2) | (x340Var.i(zxl1Var) ? 32 : 16) | 384;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                m4m1 m4m1Var = (o4m1) rwq.h(b2m1Var.b, x340Var, 0).getValue();
                m4m1 m4m1Var2 = m4m1Var instanceof m4m1 ? m4m1Var : null;
                ArrayList arrayList = m4m1Var2 != null ? m4m1Var2.b : ws61.e;
                if (arrayList.size() <= 1) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = z6x.a;
                }
                uwr uwrVar = cbx.a;
                long jA = cbx.a(x340Var).a.a.a();
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = dug.f(qim0Var3, jA, u5j1Var);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                cvx cvxVar = cbx.b(x340Var).b;
                rqo1.g(0, 0, x340Var, d9y0.k(uyn1.z(16.0f, 0.0f, 2, qim0Var3), arrayList.isEmpty() ? 0.0f : 1.0f));
                if (m4m1Var2 == null || (ws61Var = m4m1Var2.a) == null) {
                    ws61Var = ws61.a;
                }
                boolean z = m4m1Var2 != null ? m4m1Var2.u : false;
                boolean zG = x340Var.g(arrayList) | x340Var.i(zxl1Var) | x340Var.i(b2m1Var);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = new jyi1(arrayList, zxl1Var, b2m1Var, (byte) 15);
                    x340Var.s0(objT);
                }
                iro1.i(arrayList, ws61Var, (iu30) objT, null, z, x340Var, 0);
                t1c.a(voo1.y(u291.f(qim0Var3, 1.0f), voo1.g), x340Var, 0);
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pej1(b2m1Var, zxl1Var, qim0Var2, i2, (byte) 18);
            }
        }

        /* JADX WARN: Code duplicated, block: B:103:0x028c  */
        /* JADX WARN: Code duplicated, block: B:107:0x02b5  */
        /* JADX WARN: Code duplicated, block: B:113:0x02d0  */
        /* JADX WARN: Code duplicated, block: B:117:0x02f2  */
        /* JADX WARN: Code duplicated, block: B:121:0x0314  */
        /* JADX WARN: Code duplicated, block: B:125:0x0331  */
        /* JADX WARN: Code duplicated, block: B:129:0x034f  */
        /* JADX WARN: Code duplicated, block: B:133:0x036e  */
        /* JADX WARN: Code duplicated, block: B:137:0x0390  */
        /* JADX WARN: Code duplicated, block: B:141:0x03b3  */
        /* JADX WARN: Code duplicated, block: B:145:0x03d6  */
        /* JADX WARN: Code duplicated, block: B:84:0x021e  */
        /* JADX WARN: Code duplicated, block: B:85:0x0222  */
        /* JADX WARN: Code duplicated, block: B:88:0x0235  */
        /* JADX WARN: Code duplicated, block: B:89:0x0255  */
        /* JADX WARN: Code duplicated, block: B:92:0x0267  */
        /* JADX WARN: Code duplicated, block: B:96:0x0272  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v36 */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v8, types: [int] */
        public static final void p(o4m1 o4m1Var, b2m1 b2m1Var, zxl1 zxl1Var, Function0 function0, int i2, b0k b0kVar, int i3) {
            int i4;
            x340 x340Var;
            int i5;
            float f2;
            boolean z;
            qim0 qim0VarA;
            ?? r0;
            byte b2;
            Object objT;
            hdn0 hdn0Var;
            boolean zI;
            Object objT2;
            m4m1 m4m1Var;
            byte b3;
            boolean zI2;
            Object objT3;
            boolean zI3;
            Object objT4;
            zxl1 zxl1Var2;
            boolean zI4;
            Object objT5;
            boolean zG;
            Object objT6;
            boolean zI5;
            Object objT7;
            boolean zI6;
            Object objT8;
            boolean zI7;
            Object objT9;
            boolean zG2;
            Object objT10;
            boolean zG3;
            Object objT11;
            boolean zG4;
            Object objT12;
            int iIntValue;
            Integer num;
            m4c m4cVar = fkj0.X;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(1100594629);
            j06 j06Var = x340Var2.a;
            if ((i3 & 6) == 0) {
                i4 = (x340Var2.g(o4m1Var) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= x340Var2.i(b2m1Var) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i4 |= x340Var2.i(zxl1Var) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                i4 |= x340Var2.i(function0) ? 2048 : 1024;
            }
            if ((i3 & 24576) == 0) {
                i4 |= x340Var2.e(i2) ? 16384 : 8192;
            }
            int i6 = 196608 & i3;
            nim0 nim0Var = nim0.a;
            if (i6 == 0) {
                i4 |= x340Var2.i(nim0Var) ? 131072 : 65536;
            }
            if (x340Var2.Y(i4 & 1, (74899 & i4) != 74898)) {
                m4m1 m4m1Var2 = o4m1Var instanceof m4m1 ? (m4m1) o4m1Var : null;
                boolean z2 = m4m1Var2 != null ? m4m1Var2.t : false;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, ((wat) x340Var2.k(t4k.h)).M0(i2), 7);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                boolean z3 = z2;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z4 = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z4) {
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
                x7f1 x7f1VarC = kkn.C(u7h.j, 0L, 0L, 0L, 0L, x340Var2, 62);
                mn20 mn20VarR = poo1.r(0, 14);
                uwr uwrVar = cbx.a;
                mta mtaVar = cbx.b(x340Var2).d;
                ti5.a(apo.r(1381704096, new fak1(m4m1Var2, (byte) 16), x340Var2), u291.h(nim0Var, 48.0f), apo.r(-2017032030, new h621(function0, (byte) 27), x340Var2), apo.r(104383435, new n8k0(z3, zxl1Var, b2m1Var, (byte) 21), x340Var2), 0.0f, mn20VarR, x7f1VarC, x340Var2, 3462, 144);
                x340 x340Var3 = x340Var2;
                es41 es41VarC = l6o1.C(0, 0, 1, x340Var3);
                ws61 ws61Var = m4m1Var2 != null ? m4m1Var2.a : null;
                boolean zI8 = x340Var3.i(es41VarC);
                Object objT13 = x340Var3.T();
                if (zI8 || objT13 == m4cVar) {
                    i5 = 2;
                    objT13 = new uqf(es41VarC, (lnm) null, (byte) 2);
                    x340Var3.s0(objT13);
                } else {
                    i5 = 2;
                }
                qxd0.t(ws61Var, x340Var3, (vu30) objT13);
                Configuration configuration = (Configuration) x340Var3.k(AndroidCompositionLocals_androidKt.a);
                int i7 = configuration.orientation;
                pbh pbhVar = pbh.a;
                if (i7 != i5) {
                    if (configuration.screenHeightDp < 600) {
                        z = true;
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                        qim0VarA = u291.h(pbhVar.a(1.0f, nim0Var, false), configuration.screenHeightDp * 0.4f);
                        r0 = 1;
                    }
                    qim0 qim0VarF = u291.f(qim0VarA, f2);
                    cvx cvxVar = cbx.b(x340Var3).b;
                    qim0 qim0VarH = l6o1.H(i1p1.z(qim0VarF, es41VarC, 16.0f), es41VarC, false, 14);
                    cvx cvxVar2 = cbx.b(x340Var3).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, (int) r0, qim0VarH);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var3.T);
                    xos0 xos0VarM2 = x340Var3.m();
                    qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarZ);
                    x340Var3.m0();
                    if (x340Var3.S) {
                        x340Var3.l(n4kVar);
                    } else {
                        x340Var3.v0();
                    }
                    nko1.H(gfh0VarC, x340Var3, lljVar);
                    nko1.H(xos0VarM2, x340Var3, lljVar2);
                    x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
                    nko1.H(qim0VarE2, x340Var3, lljVar4);
                    if (o4m1Var instanceof n4m1) {
                        x340Var3.i0(-1618072551);
                        xto1.e((qim0) null, 0, 0L, 0L, x340Var3, 0, 15);
                        x340Var3 = x340Var3;
                        b2 = 0;
                        x340Var3.r(false);
                    } else {
                        b2 = 0;
                        x340Var3.i0(-1618034111);
                        x340Var3.r(false);
                    }
                    objT = x340Var3.T();
                    if (objT == m4cVar) {
                        if (m4m1Var2 != null || (num = m4m1Var2.m) == null) {
                            iIntValue = b2;
                        } else {
                            iIntValue = num.intValue();
                        }
                        objT = bb00.h(iIntValue, x340Var3);
                    }
                    hdn0Var = (hdn0) objT;
                    zI = x340Var3.i(b2m1Var);
                    objT2 = x340Var3.T();
                    if (!zI || objT2 == m4cVar) {
                        m4m1Var = m4m1Var2;
                        b3 = 16;
                        zgl1 zgl1Var = new zgl1(1, b2m1Var, b2m1.class, "setDuration", "setDuration(I)V", 0, (byte) 3);
                        x340Var3.s0(zgl1Var);
                        objT2 = zgl1Var;
                    } else {
                        m4m1Var = m4m1Var2;
                        b3 = 16;
                    }
                    iu30 iu30Var = (iu30) objT2;
                    zI2 = x340Var3.i(zxl1Var);
                    objT3 = x340Var3.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new e2m1(zxl1Var, b2);
                        x340Var3.s0(objT3);
                    }
                    iu30 iu30Var2 = (iu30) objT3;
                    zI3 = x340Var3.i(b2m1Var);
                    objT4 = x340Var3.T();
                    if (!zI3 || objT4 == m4cVar) {
                        zxl1Var2 = zxl1Var;
                        zgl1 zgl1Var2 = new zgl1(1, b2m1Var, b2m1.class, "setPaceBpm", "setPaceBpm(I)V", 0, (byte) 4);
                        x340Var3.s0(zgl1Var2);
                        objT4 = zgl1Var2;
                    } else {
                        zxl1Var2 = zxl1Var;
                    }
                    iu30 iu30Var3 = (iu30) objT4;
                    zI4 = x340Var3.i(zxl1Var2);
                    objT5 = x340Var3.T();
                    if (zI4 || objT5 == m4cVar) {
                        objT5 = new e2m1(zxl1Var2, r0);
                        x340Var3.s0(objT5);
                    }
                    iu30 iu30Var4 = (iu30) objT5;
                    zG = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                    objT6 = x340Var3.T();
                    if (zG || objT6 == m4cVar) {
                        objT6 = new jyi1(m4m1Var, zxl1Var2, b2m1Var, b3);
                        x340Var3.s0(objT6);
                    }
                    iu30 iu30Var5 = (iu30) objT6;
                    zI5 = x340Var3.i(hdn0Var) | x340Var3.i(b2m1Var);
                    objT7 = x340Var3.T();
                    if (zI5 || objT7 == m4cVar) {
                        objT7 = new f2m1(hdn0Var, b2m1Var, (byte) 0);
                        x340Var3.s0(objT7);
                    }
                    iu30 iu30Var6 = (iu30) objT7;
                    zI6 = x340Var3.i(zxl1Var2) | x340Var3.i(hdn0Var);
                    objT8 = x340Var3.T();
                    if (zI6 || objT8 == m4cVar) {
                        objT8 = new g4k1((Object) zxl1Var2, (Object) hdn0Var, (byte) 11);
                        x340Var3.s0(objT8);
                    }
                    Function0 function1 = (Function0) objT8;
                    zI7 = x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                    objT9 = x340Var3.T();
                    if (zI7 || objT9 == m4cVar) {
                        objT9 = new f2m1(zxl1Var2, b2m1Var, r0);
                        x340Var3.s0(objT9);
                    }
                    iu30 iu30Var7 = (iu30) objT9;
                    zG2 = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                    objT10 = x340Var3.T();
                    if (zG2 || objT10 == m4cVar) {
                        objT10 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, (byte) 2);
                        x340Var3.s0(objT10);
                    }
                    Function0 function2 = (Function0) objT10;
                    zG3 = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                    objT11 = x340Var3.T();
                    if (zG3 || objT11 == m4cVar) {
                        objT11 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, (byte) 0);
                        x340Var3.s0(objT11);
                    }
                    Function0 function3 = (Function0) objT11;
                    zG4 = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                    objT12 = x340Var3.T();
                    if (zG4 || objT12 == m4cVar) {
                        objT12 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, r0);
                        x340Var3.s0(objT12);
                    }
                    x340 x340Var4 = x340Var3;
                    i(m4m1Var, iu30Var, iu30Var2, iu30Var3, iu30Var4, iu30Var5, iu30Var6, function1, iu30Var7, function2, function3, (Function0) objT12, null, x340Var4, 0);
                    x340Var = x340Var4;
                    x340Var.r((boolean) r0);
                    x340Var.r((boolean) r0);
                } else {
                    f2 = 1.0f;
                    z = true;
                }
                qim0VarA = pbhVar.a(f2, nim0Var, z);
                r0 = z;
                qim0 qim0VarF2 = u291.f(qim0VarA, f2);
                cvx cvxVar3 = cbx.b(x340Var3).b;
                qim0 qim0VarH2 = l6o1.H(i1p1.z(qim0VarF2, es41VarC, 16.0f), es41VarC, false, 14);
                cvx cvxVar4 = cbx.b(x340Var3).b;
                qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, (int) r0, qim0VarH2);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode3 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM3 = x340Var3.m();
                qim0 qim0VarE3 = zr7.E(x340Var3, qim0VarZ2);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC2, x340Var3, lljVar);
                nko1.H(xos0VarM3, x340Var3, lljVar2);
                x0d.q(iHashCode3, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE3, x340Var3, lljVar4);
                if (o4m1Var instanceof n4m1) {
                    x340Var3.i0(-1618072551);
                    xto1.e((qim0) null, 0, 0L, 0L, x340Var3, 0, 15);
                    x340Var3 = x340Var3;
                    b2 = 0;
                    x340Var3.r(false);
                } else {
                    b2 = 0;
                    x340Var3.i0(-1618034111);
                    x340Var3.r(false);
                }
                objT = x340Var3.T();
                if (objT == m4cVar) {
                    if (m4m1Var2 != null) {
                        iIntValue = b2;
                    } else {
                        iIntValue = b2;
                    }
                    objT = bb00.h(iIntValue, x340Var3);
                }
                hdn0Var = (hdn0) objT;
                zI = x340Var3.i(b2m1Var);
                objT2 = x340Var3.T();
                if (zI) {
                    m4m1Var = m4m1Var2;
                    b3 = 16;
                    zgl1 zgl1Var3 = new zgl1(1, b2m1Var, b2m1.class, "setDuration", "setDuration(I)V", 0, (byte) 3);
                    x340Var3.s0(zgl1Var3);
                    objT2 = zgl1Var3;
                } else {
                    m4m1Var = m4m1Var2;
                    b3 = 16;
                    zgl1 zgl1Var4 = new zgl1(1, b2m1Var, b2m1.class, "setDuration", "setDuration(I)V", 0, (byte) 3);
                    x340Var3.s0(zgl1Var4);
                    objT2 = zgl1Var4;
                }
                iu30 iu30Var8 = (iu30) objT2;
                zI2 = x340Var3.i(zxl1Var);
                objT3 = x340Var3.T();
                if (zI2) {
                    objT3 = new e2m1(zxl1Var, b2);
                    x340Var3.s0(objT3);
                } else {
                    objT3 = new e2m1(zxl1Var, b2);
                    x340Var3.s0(objT3);
                }
                iu30 iu30Var9 = (iu30) objT3;
                zI3 = x340Var3.i(b2m1Var);
                objT4 = x340Var3.T();
                if (zI3) {
                    zxl1Var2 = zxl1Var;
                    zgl1 zgl1Var5 = new zgl1(1, b2m1Var, b2m1.class, "setPaceBpm", "setPaceBpm(I)V", 0, (byte) 4);
                    x340Var3.s0(zgl1Var5);
                    objT4 = zgl1Var5;
                } else {
                    zxl1Var2 = zxl1Var;
                    zgl1 zgl1Var6 = new zgl1(1, b2m1Var, b2m1.class, "setPaceBpm", "setPaceBpm(I)V", 0, (byte) 4);
                    x340Var3.s0(zgl1Var6);
                    objT4 = zgl1Var6;
                }
                iu30 iu30Var10 = (iu30) objT4;
                zI4 = x340Var3.i(zxl1Var2);
                objT5 = x340Var3.T();
                if (zI4) {
                    objT5 = new e2m1(zxl1Var2, r0);
                    x340Var3.s0(objT5);
                } else {
                    objT5 = new e2m1(zxl1Var2, r0);
                    x340Var3.s0(objT5);
                }
                iu30 iu30Var11 = (iu30) objT5;
                zG = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                objT6 = x340Var3.T();
                if (zG) {
                    objT6 = new jyi1(m4m1Var, zxl1Var2, b2m1Var, b3);
                    x340Var3.s0(objT6);
                } else {
                    objT6 = new jyi1(m4m1Var, zxl1Var2, b2m1Var, b3);
                    x340Var3.s0(objT6);
                }
                iu30 iu30Var12 = (iu30) objT6;
                zI5 = x340Var3.i(hdn0Var) | x340Var3.i(b2m1Var);
                objT7 = x340Var3.T();
                if (zI5) {
                    objT7 = new f2m1(hdn0Var, b2m1Var, (byte) 0);
                    x340Var3.s0(objT7);
                } else {
                    objT7 = new f2m1(hdn0Var, b2m1Var, (byte) 0);
                    x340Var3.s0(objT7);
                }
                iu30 iu30Var13 = (iu30) objT7;
                zI6 = x340Var3.i(zxl1Var2) | x340Var3.i(hdn0Var);
                objT8 = x340Var3.T();
                if (zI6) {
                    objT8 = new g4k1((Object) zxl1Var2, (Object) hdn0Var, (byte) 11);
                    x340Var3.s0(objT8);
                } else {
                    objT8 = new g4k1((Object) zxl1Var2, (Object) hdn0Var, (byte) 11);
                    x340Var3.s0(objT8);
                }
                Function0 function4 = (Function0) objT8;
                zI7 = x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                objT9 = x340Var3.T();
                if (zI7) {
                    objT9 = new f2m1(zxl1Var2, b2m1Var, r0);
                    x340Var3.s0(objT9);
                } else {
                    objT9 = new f2m1(zxl1Var2, b2m1Var, r0);
                    x340Var3.s0(objT9);
                }
                iu30 iu30Var14 = (iu30) objT9;
                zG2 = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                objT10 = x340Var3.T();
                if (zG2) {
                    objT10 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, (byte) 2);
                    x340Var3.s0(objT10);
                } else {
                    objT10 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, (byte) 2);
                    x340Var3.s0(objT10);
                }
                Function0 function5 = (Function0) objT10;
                zG3 = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                objT11 = x340Var3.T();
                if (zG3) {
                    objT11 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, (byte) 0);
                    x340Var3.s0(objT11);
                } else {
                    objT11 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, (byte) 0);
                    x340Var3.s0(objT11);
                }
                Function0 function6 = (Function0) objT11;
                zG4 = x340Var3.g(m4m1Var) | x340Var3.i(zxl1Var2) | x340Var3.i(b2m1Var);
                objT12 = x340Var3.T();
                if (zG4) {
                    objT12 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, r0);
                    x340Var3.s0(objT12);
                } else {
                    objT12 = new d2m1(m4m1Var, zxl1Var2, b2m1Var, r0);
                    x340Var3.s0(objT12);
                }
                x340 x340Var5 = x340Var3;
                i(m4m1Var, iu30Var8, iu30Var9, iu30Var10, iu30Var11, iu30Var12, iu30Var13, function4, iu30Var14, function5, function6, (Function0) objT12, null, x340Var5, 0);
                x340Var = x340Var5;
                x340Var.r((boolean) r0);
                x340Var.r((boolean) r0);
            } else {
                x340Var = x340Var2;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lk0(o4m1Var, b2m1Var, zxl1Var, function0, i2, i3);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.listplatform.contextmenu.ItemUnavailableException */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object q(ay8 ay8Var, onm onmVar) throws ItemUnavailableException {
            lex0 lex0Var;
            if (onmVar instanceof lex0) {
                lex0Var = (lex0) onmVar;
                int i2 = lex0Var.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lex0Var.b = i2 - Integer.MIN_VALUE;
                } else {
                    lex0Var = new lex0(onmVar);
                }
            } else {
                lex0Var = new lex0(onmVar);
            }
            Object objJ = lex0Var.a;
            int i3 = lex0Var.b;
            if (i3 == 0) {
                hm5.M(objJ);
                zio0 zio0Var = new zio0(2, null, (byte) 18);
                lex0Var.b = 1;
                objJ = b5p1.j(ay8Var, zio0Var, lex0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            Object objG = u890.G((k1r) objJ);
            if (objG != null) {
                return objG;
            }
            throw new ItemUnavailableException();
        }

        public static final Bundle r(String str, String str2, Map map) {
            Bundle bundleH = mno1.h(new mmr0[]{new mmr0("share.entity.name", str), new mmr0("format.list.type", str2)});
            for (Map.Entry entry : map.entrySet()) {
                bundleH.putString((String) entry.getKey(), (String) entry.getValue());
            }
            return bundleH;
        }

        public static void s(int i2, Throwable th) throws Throwable {
            if ((i2 & 1) != 0) {
                th = null;
            }
            if (th == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            throw th;
        }

        public static final pj71 t(iu30 iu30Var) {
            nk20 nk20Var = new nk20();
            iu30Var.invoke(nk20Var);
            ArrayList arrayList = nk20Var.a;
            boolean zIsEmpty = arrayList.isEmpty();
            pj71 kj71Var = lj71.a;
            if (!zIsEmpty) {
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (listIterator.hasPrevious()) {
                    mmr0 mmr0Var = (mmr0) listIterator.previous();
                    kj71Var = new kj71((rj71) mmr0Var.a, (pj71) mmr0Var.b, kj71Var);
                }
            }
            return kj71Var;
        }

        public static final int u(int i2, FontWeight fontWeight) {
            boolean z = fontWeight.a(FontWeight.d) >= 0;
            boolean z2 = i2 == 1;
            if (z2 && z) {
                return 3;
            }
            if (z) {
                return 1;
            }
            return z2 ? 2 : 0;
        }

        public static long v() {
            return ofg1.b;
        }

        public static final String w(ov30 ov30Var) {
            ajn0 ajn0Var;
            jyc jycVarX = g6b0.A(ov30Var) ? x(ov30Var) : null;
            if (jycVarX != null) {
                jyc jycVarI = kht.i(jycVarX);
                if (jycVarI instanceof tdy0) {
                    g6b0.A(jycVarI);
                    jyc jycVarB = kht.b(kht.i(jycVarI), ye3.R0);
                    if (jycVarB != null && (ajn0Var = (ajn0) ecc.a.get(kht.g(jycVarB))) != null) {
                        return ajn0Var.b();
                    }
                } else if (jycVarI instanceof xw81) {
                    int i2 = ccc.l;
                    LinkedHashMap linkedHashMap = koa1.i;
                    String strN = h0p1.n((xw81) jycVarI);
                    ajn0 ajn0Var2 = strN == null ? null : (ajn0) linkedHashMap.get(strN);
                    if (ajn0Var2 != null) {
                        return ajn0Var2.b();
                    }
                }
            }
            return null;
        }

        public static final jyc x(jyc jycVar) {
            if (!koa1.j.contains(jycVar.getName()) && !ecc.d.contains(kht.i(jycVar).getName())) {
                return null;
            }
            if ((jycVar instanceof tdy0) || (jycVar instanceof rdy0)) {
                return kht.b(jycVar, j141.h);
            }
            if (jycVar instanceof xw81) {
                return kht.b(jycVar, j141.i);
            }
            return null;
        }

        public static final boolean y(beg begVar, jyc jycVar) {
            qx81 qx81VarM = ((beg) jycVar.k()).m();
            for (beg begVarI = iht.i(begVar); begVarI != null; begVarI = iht.i(begVarI)) {
                if (!(begVarI instanceof hqb0)) {
                    qx81 qx81VarM2 = begVarI.m();
                    if (qx81VarM2 == null) {
                        k220.q("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"subtype", "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure", "findCorrespondingSupertype"});
                        return false;
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    gmh1 gmh1VarG = null;
                    arrayDeque.add(new dsc1(qx81VarM2, null));
                    h0h1 h0h1VarT0 = qx81VarM.t0();
                    while (!arrayDeque.isEmpty()) {
                        dsc1 dsc1Var = (dsc1) arrayDeque.poll();
                        a8b0 a8b0VarF = dsc1Var.a;
                        h0h1 h0h1VarT1 = a8b0VarF.t0();
                        if (h0h1VarT1 == null) {
                            rrn1.a(3);
                            throw null;
                        }
                        if (h0h1VarT0 == null) {
                            rrn1.a(4);
                            throw null;
                        }
                        if (h0h1VarT1.equals(h0h1VarT0)) {
                            boolean zU0 = a8b0VarF.u0();
                            for (dsc1 dsc1Var2 = dsc1Var.b; dsc1Var2 != null; dsc1Var2 = dsc1Var2.b) {
                                a8b0 a8b0Var = dsc1Var2.a;
                                List listR0 = a8b0Var.r0();
                                boolean z = listR0 instanceof Collection;
                                ekb ekbVar = j0h1.b;
                                if (!z || !listR0.isEmpty()) {
                                    Iterator it = listR0.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            a8b0VarF = new l1h1(ekbVar.i(a8b0Var.t0(), a8b0Var.r0())).f(1, a8b0VarF);
                                            break;
                                        }
                                        if (((e1h1) it.next()).a() != 1) {
                                            a8b0VarF = (a8b0) u2o1.h(new l1h1(y2o1.K(ekbVar.i(a8b0Var.t0(), a8b0Var.r0()))).f(1, a8b0VarF)).b;
                                            break;
                                        }
                                    }
                                } else {
                                    a8b0VarF = new l1h1(ekbVar.i(a8b0Var.t0(), a8b0Var.r0())).f(1, a8b0VarF);
                                    break;
                                }
                                zU0 = zU0 || a8b0Var.u0();
                            }
                            h0h1 h0h1VarT2 = a8b0VarF.t0();
                            if (h0h1VarT2 == null) {
                                rrn1.a(3);
                                throw null;
                            }
                            if (h0h1VarT2.equals(h0h1VarT0)) {
                                gmh1VarG = o1h1.g(a8b0VarF, zU0);
                                break;
                            }
                            throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + luo1.o(h0h1VarT2) + ", \n\nsupertype: " + luo1.o(h0h1VarT0) + " \n" + h0h1VarT2.equals(h0h1VarT0));
                        }
                        for (a8b0 a8b0Var2 : h0h1VarT1.d()) {
                            a8b0Var2.getClass();
                            arrayDeque.add(new dsc1(a8b0Var2, dsc1Var));
                        }
                    }
                    if (gmh1VarG != null) {
                        return !g6b0.A(begVarI);
                    }
                }
            }
            return false;
        }

        public static boolean z(PackageManager packageManager) {
            return packageManager.hasSystemFeature("com.google.desktop.gms");
        }
    }
