package p;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.mobius.Next;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tm80 {
    public static final rqt a = new rqt();
    public static b180 b;
    public static b180 c;

    public static int A(String str) throws Throwable {
        int iIntValue = -1;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && line.matches("0-[\\d]+$")) {
                    iIntValue = Integer.valueOf(line.substring(2)).intValue() + 1;
                }
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return iIntValue;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return -1;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int B() {
        try {
            int iA = A("/sys/devices/system/cpu/possible");
            if (iA == -1) {
                iA = A("/sys/devices/system/cpu/present");
            }
            return iA == -1 ? new File("/sys/devices/system/cpu/").listFiles((FileFilter) a).length : iA;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    public static long C(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static final laa D(laa laaVar, String str) {
        return laaVar instanceof syq ? new wzq((syq) laaVar, new kak(str, (byte) 5)) : new jpg0((wpw) laaVar, new kak(str, (byte) 6));
    }

    public static o8n E(qmm0 qmm0Var, n8n n8nVar) {
        return ilo1.z(qmm0Var, n8nVar);
    }

    public static o8n F(qmm0 qmm0Var, o8n o8nVar) {
        return flo1.l(qmm0Var, o8nVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long G(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(-612319702);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.b;
            x340Var.r(false);
            return j;
        }
        if (iC != 1) {
            throw p3d1.k((x340) b0kVar, -612321649, false);
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-612317809);
        uwr uwrVar2 = cbx.a;
        long j2 = cbx.a(x340Var2).b.c;
        x340Var2.r(false);
        return j2;
    }

    public static final smc0 H(String str, float f) {
        smc0 smc0VarN = k4p1.n();
        Iterator it = fga0.k(nfa0.d.c(str)).a.iterator();
        while (it.hasNext()) {
            uga0 uga0VarL = fga0.l((ega0) it.next());
            Object obj = uga0VarL.get("mXPos");
            obj.getClass();
            float fH = (float) fga0.h(fga0.m((ega0) obj));
            Object obj2 = uga0VarL.get("mYPos");
            obj2.getClass();
            float fH2 = (float) fga0.h(fga0.m((ega0) obj2));
            Object obj3 = uga0VarL.get("mHeight");
            obj3.getClass();
            float fH3 = (float) fga0.h(fga0.m((ega0) obj3));
            Object obj4 = uga0VarL.get("mWidth");
            obj4.getClass();
            smc0VarN.add(new whf1(fH * f, fH2 * f, fH3 * f, ((float) fga0.h(fga0.m((ega0) obj4))) * f));
        }
        return k4p1.k(smc0VarN);
    }

    public static Next I(kak0 kak0Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lhg1 lhg1Var = kak0Var.S0;
        if (lhg1Var.a.a != b8w0.b) {
            linkedHashSet.add(new r0k0(lhg1Var, (String) null, false, 0L, kak0Var.b(), 8));
        }
        return Next.i(kak0.a(kak0Var, ndm0.a, (Boolean) null, !linkedHashSet.isEmpty() ? rcu0.a : kak0Var.g, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -81, 1048575), linkedHashSet);
    }

    public static final boolean J(Collection collection, MotionEvent motionEvent) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            whf1 whf1Var = (whf1) it.next();
            float f = whf1Var.a;
            float y = motionEvent.getY();
            float f2 = whf1Var.b;
            if (y > f2 && motionEvent.getX() > f && motionEvent.getY() < f2 + whf1Var.c && motionEvent.getX() < f + whf1Var.d) {
                return true;
            }
        }
        return false;
    }

    public static final void a(if3 if3Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1191315686);
        int i2 = (b0kVar3.i(if3Var) ? 4 : 2) | i | 48 | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("album_row_artist", u291.f(qim0Var3, 1.0f));
            uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
            zzq0 zzq0VarP = gto1.p(3, b0kVar3, 5);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            p3v p3vVar = new p3v(16.0f);
            p3v p3vVar2 = new p3v(8.0f);
            uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 5, new axq0(p3vVar, p3vVar2, p3vVar, p3vVar2, zzq0VarP), (vzq0) null, (tvx) null, new p3v(80.0f), 243);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ge3(iu30Var, (byte) 3);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0("Open album")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarN, uvxVarA, null, false, null, null, new gbx(new y50("Open album"), function0), null, null, apo.r(2001204945, new jf3(if3Var, (byte) 0), b0kVar3), null, apo.r(-1754845614, new jf3(if3Var, (byte) 1), b0kVar3), null, null, null, apo.r(-1615549866, new jf3(if3Var, (byte) 2), b0kVar3), b0kVar2, 805306432, 196656, 30140);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(if3Var, qim0Var2, iu30Var, i);
        }
    }

    public static final void b(y7e1 y7e1Var, float f, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1330550107);
        int i2 = i | (x340Var2.g(y7e1Var) ? 4 : 2) | (x340Var2.d(f) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024) | (x340Var2.g(qim0Var) ? 16384 : 8192);
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var2);
            }
            lz20 lz20Var = (lz20) objT;
            az20 az20Var = (az20) x340Var2.k(t4k.i);
            k6a1 k6a1Var = (k6a1) x340Var2.k(t4k.q);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i2 & 896) == 256;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new iwd(z, lz20Var, (lnm) null, (byte) 3);
                x340Var2.s0(objT2);
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT2);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            float f2 = cbx.b(x340Var2).b.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, f2, 16.0f, f);
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var2).b.a, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
            boolean zI = x340Var2.i(az20Var) | x340Var2.g(k6a1Var) | ((i2 & 7168) == 2048);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new dt90(az20Var, k6a1Var, function0, (byte) 14);
                x340Var2.s0(objT3);
            }
            foo1.c(new gbx(z50.c, (Function0) objT3), ldx.c, new tq60(een.R0), null, yla.s(x340Var2), null, null, null, null, null, zxi.a, x340Var2, 48, 48, 2008);
            qim0 qim0VarN = anm1.N("lyrics-all-correction-field", vby0.p(u291.f(nim0.a, 1.0f).then(new wnb0(1.0f, true)), lz20Var));
            String strO0 = cwl1.o0(x340Var2, 2131957863);
            lee1 lee1Var = cbx.d(x340Var2).g;
            c6e1 c6e1Var = new c6e1(0, 0, 3);
            g820 g820VarM = k8p1.m(vy5.e, 20000);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            rwo1.b(y7e1Var, qim0VarN, null, strO0, null, null, false, false, g820VarM, lee1Var, null, null, c6e1Var, null, null, null, null, new zzq0(16.0f, 16.0f, 16.0f, 16.0f), 0.0f, false, u(x340Var2), x340Var2, (i2 & 14) | 100663296, 384, 912628);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kzu(y7e1Var, f, z, function0, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0099  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, boolean z, qim0 qim0Var, xb10 xb10Var, b0k b0kVar, int i, int i2) {
        int i3;
        xb10 xb10Var2;
        boolean z2;
        xb10 xb10Var3;
        h311 h311VarV;
        cr31 cr31VarB;
        long jC;
        qim0 qim0VarL0;
        boolean z3;
        Object obj = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1141565791);
        if ((i & 6) == 0) {
            i3 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar2.i(qim0Var) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                xb10Var2 = xb10Var;
                i3 |= b0kVar2.i(xb10Var2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (b0kVar2.Y(i3 & 1, z2)) {
                if (i4 != 0) {
                    xb10Var2 = null;
                }
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar2).f;
                cr31VarB = er31.b(4.0f);
                jC = cbx.a(b0kVar2).a.b.c();
                if (str != null || ihc1.y0(str)) {
                    b0kVar2.i0(835757966);
                    qim0 qim0VarF = dug.f(qim0Var, jC, cr31VarB);
                    qim0VarL0 = nim0.a;
                    if (z) {
                        qim0VarL0 = cwl1.l0(qim0VarL0, jC, cr31VarB, 12);
                    }
                    t1c.a(qim0VarF.then(qim0VarL0), b0kVar2, 0);
                    b0kVar2.r(false);
                } else {
                    isl islVar = isl.a;
                    if (xb10Var2 != null) {
                        b0kVar2.i0(836113536);
                        z3 = (i3 & 14) == 4;
                        Object objT = b0kVar2.T();
                        if (z3 || objT == obj) {
                            objT = Uri.parse(str);
                            b0kVar2.s0(objT);
                        }
                        Uri uri = (Uri) objT;
                        uri.getClass();
                        as80 as80Var = mif1.P0;
                        b0kVar2 = b0kVar2;
                        eso1.h(oi7.a(uri, (gw70) null, xb10Var2, yqi1.b, (jmr0) null, (jmr0) null, false, false, as80Var, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, i3 & 7168, 0, 128998), islVar, dug.f(i1p1.q(qim0Var, cr31VarB), jC, cr31VarB), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, b0kVar2, 224304, 384);
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(836684742);
                        z3 = (i3 & 14) == 4;
                        Object objT2 = b0kVar2.T();
                        if (z3 || objT2 == obj) {
                            objT2 = Uri.parse(str);
                            b0kVar2.s0(objT2);
                        }
                        Uri uri2 = (Uri) objT2;
                        uri2.getClass();
                        eso1.e(uri2, islVar, dug.f(qim0Var, jC, cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, oux.a, false, false, b0kVar2, 48, 0, 3576);
                        b0kVar2 = b0kVar2;
                        b0kVar2.r(false);
                    }
                }
                xb10Var3 = xb10Var2;
            } else {
                b0kVar2.b0();
                xb10Var3 = xb10Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf(str, z, qim0Var, xb10Var3, i, i2);
            }
        }
        i3 |= 3072;
        xb10Var2 = xb10Var;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b0kVar2.Y(i3 & 1, z2)) {
            if (i4 != 0) {
                xb10Var2 = null;
            }
            uwr uwrVar2 = cbx.a;
            cua cuaVar2 = cbx.b(b0kVar2).f;
            cr31VarB = er31.b(4.0f);
            jC = cbx.a(b0kVar2).a.b.c();
            if (str != null) {
                b0kVar2.i0(835757966);
                qim0 qim0VarF2 = dug.f(qim0Var, jC, cr31VarB);
                qim0VarL0 = nim0.a;
                if (z) {
                    qim0VarL0 = cwl1.l0(qim0VarL0, jC, cr31VarB, 12);
                }
                t1c.a(qim0VarF2.then(qim0VarL0), b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(835757966);
                qim0 qim0VarF3 = dug.f(qim0Var, jC, cr31VarB);
                qim0VarL0 = nim0.a;
                if (z) {
                    qim0VarL0 = cwl1.l0(qim0VarL0, jC, cr31VarB, 12);
                }
                t1c.a(qim0VarF3.then(qim0VarL0), b0kVar2, 0);
                b0kVar2.r(false);
            }
            xb10Var3 = xb10Var2;
        } else {
            b0kVar2.b0();
            xb10Var3 = xb10Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf(str, z, qim0Var, xb10Var3, i, i2);
        }
    }

    public static final void d(float f, int i, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(52473741);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new yy2((byte) 3, f);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = j9k1.x(qim0Var, (xu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            rqo1.g(0, 0, x340Var, u291.f(nim0.a, 1.0f));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ewb(f, i, qim0Var);
        }
    }

    public static final void e(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1989434261);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarH = u291.h(voo1.y(u291.f(nim0.a, 1.0f), voo1.g), 80.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarH, cbx.a(x340Var).a.a.a(), d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new g21(een.Q0, (byte) 29)), een.N0, x340Var, 48);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, function0), ldx.c, null, null, yla.r(x340Var), null, null, null, null, null, zxi.b, x340Var, 48, 48, 2012);
            foo1.c(new gbx(z50Var, function1), new idx(4), null, null, yla.r(x340Var), null, null, null, null, null, zxi.c, x340Var, 0, 48, 2012);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 28);
        }
    }

    public static final void f(List list, List list2, boolean z, ArrayList arrayList, float f, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        xtb0 xtb0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1510602164);
        int i2 = i | (b0kVar3.g(list) ? 4 : 2) | (b0kVar3.g(list2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.g(arrayList) ? 2048 : 1024) | (b0kVar3.d(f) ? 16384 : 8192) | (b0kVar3.g(qim0Var) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                int size = list.size();
                ArrayList arrayList2 = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(new lz20());
                }
                b0kVar3.s0(arrayList2);
                objT = arrayList2;
            }
            List list3 = (List) objT;
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            float f2 = jsl1.a;
            if (Build.VERSION.SDK_INT >= 30) {
                qim0VarF = zr7.i(qim0VarF, new dh((byte) 13));
            }
            qim0 qim0Var2 = qim0VarF;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float f3 = cbx.b(b0kVar3).b.b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, f3, 16.0f, f);
            d36 d36Var = new d36(cbx.b(b0kVar3).b.a, true, new um5(false));
            boolean zG = (i3 == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | b0kVar3.g(list3) | b0kVar3.g(k6a1Var) | b0kVar3.i(c9nVar) | b0kVar3.g(xtb0VarA);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                xtb0Var = xtb0VarA;
                qz9 qz9Var = new qz9(list, list2, arrayList, list3, k6a1Var, c9nVar, xtb0Var, z);
                b0kVar3.s0(qz9Var);
                objT3 = qz9Var;
            } else {
                xtb0Var = xtb0VarA;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0Var2, xtb0Var, zzq0Var, false, d36Var, null, null, false, null, (iu30) objT3, b0kVar2, 0, 488);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o08(list, list2, z, arrayList, f, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2047177083);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            qim0 qim0Var2 = nim0.a;
            hr80.d(qim0Var2, 1.0f, jC, x340Var, 6, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 12);
        }
    }

    public static final void h(c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-875814606);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (c380Var == null) {
            x340Var.i0(533474936);
            x340Var.r(false);
        } else {
            x340Var.i0(533474937);
            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                te10 te10Var = (te10) it.next();
                arrayList.add(te10Var.d ? ly90.a : new my90(te10Var.c, te10Var.a, te10Var.b));
            }
            x2g0.i(mqo1.A(arrayList), (qim0) null, (hcx) null, (hux) null, 4, (gbx) null, (String) null, x340Var, 24576, 110);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i90(c380Var, i, (byte) 8);
        }
    }

    public static final void i(zv31 zv31Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(78287604);
        int i2 = (x340Var.g(zv31Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            hux huxVar = zv31Var.c.a;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarV = u291.v(nim0.a, 24.0f);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, anm1.N("row-device-icon", u291.h(qim0VarV, 24.0f)), cbx.a(x340Var).b.b, 0L, false, x340Var, 56, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mp50(zv31Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(tm21 tm21Var, Function0 function0, iu30 iu30Var, Function0 function1, Function0 function2, Function0 function3, Function0 function4, b0k b0kVar, int i) {
        b0k b0kVar2;
        x7e1 x7e1Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-904385084);
        int i2 = i | (b0kVar3.g(tm21Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | (b0kVar3.i(function2) ? 16384 : 8192) | (b0kVar3.i(function3) ? 131072 : 65536) | (b0kVar3.i(function4) ? 1048576 : 524288);
        int i3 = 0;
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            scx scxVarM = pno1.m(b0kVar3);
            sm21 sm21Var = tm21Var instanceof sm21 ? (sm21) tm21Var : null;
            c9 c9Var = sm21Var != null ? sm21Var.a : null;
            if (c9Var == null) {
                c9Var = z6x.a;
            }
            b0kVar3.i0(-327100176);
            Iterable iterable = (Iterable) c9Var;
            ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
            Iterator it = iterable.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                x7e1Var = x7e1.b;
                if (!zHasNext) {
                    break;
                }
                Object[] objArr = new Object[i3];
                Object objT = b0kVar3.T();
                if (objT == m4cVar) {
                    objT = i0f0.O0;
                    b0kVar3.s0(objT);
                }
                arrayList.add((y7e1) k5p1.u(objArr, x7e1Var, (Function0) objT, b0kVar3, 384));
                i3 = 0;
            }
            int i4 = i3;
            b0kVar3.r(i4);
            Object[] objArr2 = new Object[i4];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = i0f0.Z;
                b0kVar3.s0(objT2);
            }
            y7e1 y7e1Var = (y7e1) k5p1.u(objArr2, x7e1Var, (Function0) objT2, b0kVar3, 384);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q((Object) null);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            Object[] objArr3 = new Object[0];
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = i0f0.N0;
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr3, (Function0) objT4, b0kVar3, 48);
            boolean z = (i2 & 7168) == 2048;
            Object objT5 = b0kVar3.T();
            if (z || objT5 == m4cVar) {
                objT5 = new to1(function1, (lnm) null, (byte) 13);
                b0kVar3.s0(objT5);
            }
            qxd0.t(rih1.a, b0kVar3, (vu30) objT5);
            j2i j2iVarR = apo.r(-1729236393, new r6k(iu30Var, function0, scxVarM, ven0Var2, ven0Var, function2, function3, tm21Var, arrayList, y7e1Var, function4), b0kVar3);
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, j2iVarR, b0kVar2, 3078, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(tm21Var, function0, iu30Var, function1, function2, function3, function4, i, (byte) 28);
        }
    }

    public static final void k(String str, String str2, Function0 function0, b0k b0kVar, int i, int i2) {
        String str3;
        int i3;
        Function0 function1;
        int i4;
        String str4;
        int i5;
        String str5;
        qim0 qim0Var;
        h2c h2cVar;
        boolean z;
        hw61 hw61Var;
        float f;
        float f2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2030082745);
        int i6 = i | (b0kVar2.g(str) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i6 | (b0kVar2.g(str3) ? 32 : 16);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i3 | 384;
            function1 = function0;
        } else {
            function1 = function0;
            i4 = i3 | (b0kVar2.i(function1) ? 256 : 128);
        }
        if (b0kVar2.Y(i4 & 1, (i4 & 147) != 146)) {
            String str6 = i7 != 0 ? null : str3;
            Function0 function2 = i8 != 0 ? null : function1;
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var2, 1.0f), 72.0f);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar2).a.a.a();
            hw61 hw61Var2 = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarH, jA, hw61Var2);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            h2c h2cVar2 = h2c.a;
            if (function2 == null || str6 == null) {
                i5 = i4;
                str5 = str6;
                qim0Var = qim0Var2;
                h2cVar = h2cVar2;
                z = false;
                hw61Var = hw61Var2;
                f = 1.0f;
                b0kVar2.i0(856500853);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(855977108);
                int i9 = i4;
                gbx gbxVar = new gbx(z50.c, function2);
                ldx ldxVar = ldx.c;
                qim0 qim0VarA = h2cVar2.a(qim0Var2, een.g);
                cvx cvxVar = cbx.b(b0kVar2).b;
                qim0 qim0VarB = uyn1.B(qim0VarA, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                str5 = str6;
                i5 = i9;
                qim0Var = qim0Var2;
                hw61Var = hw61Var2;
                h2cVar = h2cVar2;
                f = 1.0f;
                z = false;
                wro1.h(gbxVar, ldxVar, eqr0.D(0.0f, 8.0f, 1, qim0VarB), null, yla.s(b0kVar2), null, false, null, null, apo.r(-1496138817, new y5d0(str6, (byte) 13), b0kVar2), b0kVar2, 48, 6, 984);
                b0kVar2.r(false);
            }
            qim0 qim0Var3 = qim0Var;
            qim0 qim0VarF2 = u291.f(qim0Var3, f);
            if (function2 == 0) {
                b0kVar2.i0(856666548);
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                b0kVar2.r(z);
                f2 = 16.0f;
            } else {
                b0kVar2.i0(856737073);
                f2 = cbx.b(b0kVar2).b.f;
                b0kVar2.r(z);
            }
            qim0 qim0VarZ = uyn1.z(f2, 0.0f, 2, qim0VarF2);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            uwo1.e(str, eqr0.D(0.0f, 8.0f, 1, qim0VarZ), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, i5 & 14, 0, 2016);
            b0kVar2 = b0kVar2;
            qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
            avw0 avw0Var = cbx.b(b0kVar2).c;
            t1c.a(dug.f(h2cVar.a(u291.h(qim0VarF3, 1.0f), een.X), cbx.a(b0kVar2).d.b, hw61Var), b0kVar2, 0);
            b0kVar2.r(true);
            function1 = function2;
            str4 = str5;
        } else {
            b0kVar2.b0();
            str4 = str3;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(str, str4, function1, i, i2, (byte) 12);
        }
    }

    public static final void l(hdh1 hdh1Var, boolean z, int i, boolean z2, boolean z3, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        boolean z4;
        x340 x340Var;
        qim0 qim0Var2;
        Object akw0Var;
        m4c m4cVar;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1621470188);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(hdh1Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 131072 : 65536;
        }
        int i4 = i3 | 1572864;
        if (x340Var2.Y(i4 & 1, (599187 & i4) != 599186)) {
            klz0 klz0Var = (klz0) x340Var2.k(llz0.a);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var3);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            long j = i;
            int i5 = i4 >> 3;
            Object objT = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = new fc5();
                x340Var2.s0(objT);
            }
            fc5 fc5Var = (fc5) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            Long lValueOf = Long.valueOf(j);
            int i6 = (i5 & 14) ^ 6;
            boolean zI = ((i6 > 4 && x340Var2.h(z)) || (i5 & 6) == 4) | x340Var2.i(fc5Var) | x340Var2.f(j);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar2) {
                m4cVar = m4cVar2;
                z4 = z;
                akw0Var = new akw0(z4, fc5Var, j, (lnm) null);
                x340Var2.s0(akw0Var);
            } else {
                akw0Var = objT2;
                z4 = z;
                m4cVar = m4cVar2;
            }
            qxd0.s(boolValueOf, lValueOf, (vu30) akw0Var, x340Var2);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = new o8a();
                x340Var2.s0(objT3);
            }
            o8a o8aVar = (o8a) objT3;
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            boolean zI2 = ((i6 > 4 && x340Var2.h(z4)) || (i5 & 6) == 4) | x340Var2.i(o8aVar) | x340Var2.e(24);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new ckw0(z4, o8aVar, (lnm) null);
                x340Var2.s0(objT4);
            }
            qxd0.t(boolValueOf2, x340Var2, (vu30) objT4);
            uwr uwrVar = cbx.a;
            avw0 avw0Var = cbx.b(x340Var2).c;
            avw0 avw0Var2 = cbx.b(x340Var2).c;
            qim0 qim0VarR = u291.r(qim0Var3, z3 ? 140.0f : 180.0f);
            boolean zI3 = x340Var2.i(fc5Var) | x340Var2.i(o8aVar) | x340Var2.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01c7: ARITH (r5v16 'zI3' boolean) = (wrap boolean:0x01c0: ARITH (wrap boolean:0x01b9: ARITH (wrap boolean:0x01b4: ARITH (wrap boolean:0x01ac: INVOKE (r12v1 'x340Var2' p.x340), (r4v17 'fc5Var' p.fc5) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:429)) | (wrap boolean:0x01b0: INVOKE (r12v1 'x340Var2' p.x340), (r0v7 'o8aVar' p.o8a) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:433)) A[DONT_WRAP, WRAPPED] (LINE:437)) | (wrap boolean:0x01b5: INVOKE (r12v1 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r19v1 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:438)) A[DONT_WRAP, WRAPPED] (LINE:442)) | (wrap boolean:0x01bc: INVOKE (r12v1 'x340Var2' p.x340), (4.0f float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:445)) A[DONT_WRAP, WRAPPED] (LINE:449)) | (wrap boolean:0x01c3: INVOKE (r12v1 'x340Var2' p.x340), (8.0f float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:452)) A[DECLARE_VAR] (LINE:456) in method: p.tm80.l(p.hdh1, boolean, int, boolean, boolean, p.iu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 641
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.tm80.l(p.hdh1, boolean, int, boolean, boolean, p.iu30, p.qim0, p.b0k, int):void");
        }

        public static final void m(zv31 zv31Var, Function0 function0, Function0 function1, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            qim0 qim0Var2;
            hax haxVar;
            gbx gbxVar;
            String str = zv31Var.b.a;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1074540455);
            int i2 = i | (b0kVar3.g(zv31Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.i(function1) ? 256 : 128) | (b0kVar3.i(vu30Var) ? 2048 : 1024) | 24576;
            if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
                if (zv31Var.d) {
                    b0kVar3.i0(1135728742);
                    haxVar = new hax(cwl1.n0(2131951676, new Object[]{str}, b0kVar3));
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(1135732180);
                    b0kVar3.r(false);
                    haxVar = jax.a;
                }
                if (function1 == null) {
                    b0kVar3.i0(-1243148772);
                    b0kVar3.r(false);
                    gbxVar = null;
                } else {
                    b0kVar3.i0(-1243148771);
                    String strN0 = cwl1.n0(2131951707, new Object[]{str}, b0kVar3);
                    if (ihc1.y0(strN0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        gbx gbxVar2 = new gbx(new y50(strN0), function1);
                        b0kVar3.r(false);
                        gbxVar = gbxVar2;
                    }
                }
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0Var3);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                qim0 qim0VarN = anm1.N("device-picker-ui-row", uyn1.y(qim0VarJ, 8.0f, 4.0f));
                zov0 zov0Var = cbx.b(b0kVar3).g;
                cvx cvxVar3 = cbx.b(b0kVar3).b;
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                uvx uvxVar = new uvx(0, zv31Var.f ? ogx.e : ngx.e, 2, new zzq0(12.0f, 6.0f, 12.0f, 6.0f), (zzq0) null, (tvx) null, (hw61) null, 0, new p3v(24.0f), 241);
                String strO0 = cwl1.o0(b0kVar3, 2131951712);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarN, uvxVar, haxVar, false, null, null, new gbx(new y50(strO0), function0), gbxVar, null, apo.r(17672834, new ap50(zv31Var, (byte) 4), b0kVar3), null, apo.r(-935847903, new ap50(zv31Var, (byte) 5), b0kVar3), apo.r(-1918841280, new rt11(zv31Var, vu30Var, (byte) 7), b0kVar3), null, null, apo.r(-572854115, new ap50(zv31Var, (byte) 6), b0kVar3), b0kVar2, 805306432, 197040, 25912);
                    qim0Var2 = qim0Var3;
                }
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new wnx0(zv31Var, function0, function1, vu30Var, qim0Var2, i, (byte) 6);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
        /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v8 */
        public static final void n(c380 c380Var, b0k b0kVar, int i) {
            c380 c380Var2;
            i90 i90Var;
            h311 h311VarV;
            ?? r0;
            c380 c380Var3 = c380Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-38991029);
            int i2 = (x340Var.g(c380Var3) ? 4 : 2) | i;
            int i3 = 1;
            ?? r6 = 0;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                if (c380Var3 == null || c380Var3.isEmpty()) {
                    x340Var.i0(-1940478297);
                    x340Var.r(false);
                    h311VarV = x340Var.v();
                    if (h311VarV == null) {
                        return;
                    } else {
                        i90Var = new i90(c380Var, i, (byte) 9);
                    }
                } else {
                    x340Var.i0(-1940422373);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0Var = nim0.a;
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -984879834, c380Var3);
                    int i4 = 0;
                    while (itN.hasNext()) {
                        Object next = itN.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            p7h.T();
                            throw null;
                        }
                        xqc1 xqc1Var = (drc1) next;
                        if (xqc1Var instanceof xqc1) {
                            x340Var.i0(1770227354);
                            r(xqc1Var, x340Var, r6);
                            x340Var.r((boolean) r6);
                        } else if (xqc1Var instanceof zqc1) {
                            x340Var.i0(-957456037);
                            zqc1 zqc1Var = (zqc1) xqc1Var;
                            r(zqc1Var.a, x340Var, r6);
                            s(zqc1Var.b, x340Var, r6);
                            x340Var.r((boolean) r6);
                        } else {
                            if (!(xqc1Var instanceof brc1)) {
                                throw p3d1.k(x340Var, 1770225899, (boolean) r6);
                            }
                            x340Var.i0(1770234042);
                            s((brc1) xqc1Var, x340Var, r6);
                            x340Var.r((boolean) r6);
                        }
                        if (c380Var3.size() <= i3 || i4 >= p7h.L(c380Var3)) {
                            r0 = r6;
                            x340Var.i0(-956617084);
                            x340Var.r((boolean) r0);
                        } else {
                            x340Var.i0(-957110387);
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            qim0 qim0VarN = anm1.N("row-subtitle-separator", uyn1.B(qim0Var, 2.0f, 0.0f, 2.0f, 0.0f, 10));
                            cjc0 cjc0Var = new cjc0(i3);
                            lee1 lee1Var = cbx.d(x340Var).m;
                            long j = cbx.a(x340Var).b.b;
                            r0 = r6 == true ? 1 : 0;
                            uwo1.e("•", qim0VarN, lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var, 1572870, 0, 1712);
                            x340Var.r((boolean) r0);
                        }
                        i3 = 1;
                        r6 = r0;
                        i4 = i5;
                        qim0Var = qim0Var;
                        c380Var3 = c380Var;
                    }
                    ?? r1 = r6;
                    us71.m(x340Var, (boolean) r1, i3, (boolean) r1);
                    c380Var2 = c380Var;
                }
                h311VarV.d = i90Var;
            }
            c380Var2 = c380Var3;
            x340Var.b0();
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                i90Var = new i90(c380Var2, i, (byte) 10);
                h311VarV.d = i90Var;
            }
        }

        public static final void o(uzd1 uzd1Var, b0k b0kVar, int i) {
            long j;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1072892446);
            int i2 = (x340Var.g(uzd1Var) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                String str = uzd1Var.a;
                qim0 qim0VarN = anm1.N("row-device-name", nim0.a);
                cjc0 cjc0Var = new cjc0(1);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                int iC = l1d.C(uzd1Var.b);
                if (iC == 0) {
                    x340Var.i0(-1951465583);
                    j = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                } else {
                    if (iC != 1) {
                        throw p3d1.k(x340Var, -1951467387, false);
                    }
                    x340Var.i0(-1951464012);
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(false);
                }
                uwo1.e(str, qim0VarN, lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var, 1572912, 0, 1712);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ps11(uzd1Var, i, (byte) 25);
            }
        }

        public static final void p(float f, float f2, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-316227021);
            int i2 = (x340Var.d(f2) ? 32 : 16) | i;
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                uwr uwrVar = cbx.a;
                long jC = cbx.a(x340Var).a.b.c();
                qim0 qim0VarH = u291.h(u291.f(nim0.a, f), f2);
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarF = dug.f(qim0VarH, jC, er31.b(4.0f));
                cua cuaVar2 = cbx.b(x340Var).f;
                t1c.a(cwl1.l0(qim0VarF, jC, er31.b(4.0f), 12), x340Var, 0);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new cru(f, f2, i, (byte) 3);
            }
        }

        public static final void q(g8a1 g8a1Var, iu30 iu30Var, b0k b0kVar, int i) {
            int i2;
            byte b2;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(344809925);
            if ((i & 6) == 0) {
                i2 = ((i & 8) == 0 ? x340Var.g(g8a1Var) : x340Var.i(g8a1Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            byte b3 = 16;
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                b2 = 1;
                x340Var.b0();
            } else {
                if (!g8a1Var.a) {
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new d8a1(g8a1Var, iu30Var, i, (byte) 0);
                        return;
                    }
                    return;
                }
                String strO0 = cwl1.o0(x340Var, 2131957818);
                qim0 qim0VarN = anm1.N("#LyricsFullscreenSongDnaChipTag", nim0.a);
                boolean zG = x340Var.g(strO0);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new pg61(strO0, (byte) 26);
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT);
                if (g8a1Var.b) {
                    x340Var.i0(-1328930524);
                    boolean z = (i2 & 112) == 32;
                    Object objT2 = x340Var.T();
                    if (z || objT2 == m4cVar) {
                        objT2 = new pc81(iu30Var, (byte) 25);
                        x340Var.s0(objT2);
                    }
                    gbx gbxVar = new gbx(new y50(strO0), (Function0) objT2);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = yd81.c1;
                        x340Var.s0(objT3);
                    }
                    b2 = 1;
                    poo1.e(gbxVar, new oex(0, (vu30) null, (vu30) objT3, (vu30) null, 11), yoo1.z(x340Var), qim0VarB, 0, null, null, ljj.a, null, null, null, false, null, apo.r(-639527118, new nl41(strO0, b3), x340Var), x340Var, 12582912, 3072, 8048);
                    x340Var = x340Var;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1328453806);
                    boolean z2 = (i2 & 112) == 32;
                    Object objT4 = x340Var.T();
                    if (z2 || objT4 == m4cVar) {
                        objT4 = new pc81(iu30Var, (byte) 26);
                        x340Var.s0(objT4);
                    }
                    b2 = 1;
                    foo1.c(new gbx(new y50(strO0), (Function0) objT4), ldx.c, u291.B(qim0VarB, een.h, 2), null, null, null, null, null, null, null, ljj.b, x340Var, 0, 48, 2040);
                    x340Var.r(false);
                }
            }
            h311 h311VarV2 = x340Var.v();
            if (h311VarV2 != null) {
                h311VarV2.d = new d8a1(g8a1Var, iu30Var, i, b2);
            }
        }

        public static final void r(xqc1 xqc1Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1901221344);
            int i2 = (x340Var.g(xqc1Var) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                hux huxVar = xqc1Var.a;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 2.0f, 0.0f, 2.0f, 0.0f, 10);
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0 qim0VarV = u291.v(qim0VarB, 12.0f);
                zov0 zov0Var2 = cbx.b(x340Var).g;
                w0h1.a(huxVar, isl.a, anm1.N("row-subtitle-icon", u291.h(qim0VarV, 12.0f)), G(x340Var, xqc1Var.b), 0L, false, x340Var, 56, 48);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ps11(xqc1Var, i, (byte) 26);
            }
        }

        public static final void s(brc1 brc1Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1972212205);
            int i2 = (x340Var.g(brc1Var) ? 4 : 2) | i;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                String str = brc1Var.a;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                uwo1.e(str, anm1.N("row-subtitle-text", uyn1.B(nim0.a, 2.0f, 0.0f, 2.0f, 0.0f, 10)), cbx.d(x340Var).m, G(x340Var, brc1Var.b), null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1712);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ps11(brc1Var, i, (byte) 27);
            }
        }

        public static final void t(c380 c380Var, vu30 vu30Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1062308195);
            int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
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
                h(c380Var, x340Var, i2 & 14);
                if (vu30Var == null) {
                    x340Var.i0(-179229120);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1656786401);
                    us71.j((i2 >> 3) & 14, vu30Var, x340Var, false);
                }
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jt31(c380Var, vu30Var, i, (byte) 0);
            }
        }

        public static final zxx u(b0k b0kVar) {
            uwr uwrVar = cbx.a;
            return new zxx(cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.a, cbx.a(b0kVar).b.b, cbx.a(b0kVar).b.d, cbx.a(b0kVar).a.a.c(), cbx.a(b0kVar).a.a.c(), cbx.a(b0kVar).b.a, 0L, 896);
        }

        public static final String v(oi90 oi90Var) {
            h290 h290Var = oi90Var.b;
            return h290Var.isEmpty() ? oi90Var.a : (String) o7h.q0(h290Var);
        }

        public static int w(byte[] bArr, int i) {
            byte b2;
            while (i < bArr.length && (b2 = bArr[i]) != 10) {
                if (Character.isDigit(b2)) {
                    int i2 = i + 1;
                    while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                        i2++;
                    }
                    return Integer.parseInt(new String(bArr, 0, i, i2 - i));
                }
                i++;
            }
            return -1;
        }

        public static Object x(qmm0 qmm0Var, Object obj, vu30 vu30Var) {
            return vu30Var.invoke(obj, qmm0Var);
        }

        public static m8n y(qmm0 qmm0Var, n8n n8nVar) {
            return ilo1.u(qmm0Var, n8nVar);
        }

        public static int z() {
            int iW;
            int i = 0;
            int i2 = -1;
            for (int i3 = 0; i3 < B(); i3++) {
                try {
                    File file = new File("/sys/devices/system/cpu/cpu" + i3 + "/cpufreq/cpuinfo_max_freq");
                    if (file.exists() && file.canRead()) {
                        byte[] bArr = new byte[128];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            fileInputStream.read(bArr);
                            int i4 = 0;
                            while (Character.isDigit(bArr[i4]) && i4 < 128) {
                                i4++;
                            }
                            int i5 = Integer.parseInt(new String(bArr, 0, i4));
                            if (i5 > i2) {
                                i2 = i5;
                            }
                        } catch (NumberFormatException unused) {
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                        fileInputStream.close();
                    }
                } catch (IOException unused2) {
                    return -1;
                }
            }
            if (i2 == -1) {
                FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
                try {
                    byte[] bArr2 = new byte[1024];
                    try {
                        int i6 = fileInputStream2.read(bArr2);
                        loop2: while (true) {
                            if (i >= i6) {
                                iW = -1;
                                break;
                            }
                            byte b2 = bArr2[i];
                            if (b2 == 10 || i == 0) {
                                if (b2 == 10) {
                                    i++;
                                }
                                for (int i7 = i; i7 < i6; i7++) {
                                    int i8 = i7 - i;
                                    if (bArr2[i7] != "cpu MHz".charAt(i8)) {
                                        break;
                                    }
                                    if (i8 == 6) {
                                        iW = w(bArr2, i7);
                                        break loop2;
                                    }
                                    iW = -1;
                                    break;
                                }
                            }
                            i++;
                        }
                    } catch (IOException | NumberFormatException unused3) {
                    }
                    int i9 = iW * 1000;
                    if (i9 > i2) {
                        i2 = i9;
                    }
                } finally {
                    fileInputStream2.close();
                }
            }
            return i2;
        }
    }
