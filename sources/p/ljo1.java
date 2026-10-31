package p;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ljo1 {
    public static final float a = 4.0f;
    public static final zu91 b = new zu91(0);
    public static b180 c;

    public static final void a(yxa0 yxa0Var, boolean z, vzq0 vzq0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1978446693);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(yxa0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= x340Var.i(vzq0Var2) ? 256 : 128;
        } else {
            vzq0Var2 = vzq0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            fra fraVar = een.N0;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(uyn1.z(0.0f, cbx.b(x340Var).b.a, 1, dug.f(qim0VarF, cbx.a(x340Var).a.c, d4o1.a)), 0.0f, 0.0f, 0.0f, vzq0Var2.a(), 7);
            jw31 jw31VarA = ew31.a(h36.e, fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            s110.d(yxa0Var, apo.r(1381369859, new ie1(function0, z, (byte) 3), x340Var), x340Var, (i2 & 14) | 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(yxa0Var, z, vzq0Var, function0, i, (byte) 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(float f, int i, j2i j2iVar, j2i j2iVar2, j2i j2iVar3, b0k b0kVar, qim0 qim0Var) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1866457372);
        int i2 = (x340Var.i(qim0Var) ? 2048 : 1024) | i | (x340Var.d(f) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            List listM = p7h.M(new vu30[]{j2iVar, j2iVar2, j2iVar3});
            boolean z = (((57344 & i2) ^ 24576) > 16384 && x340Var.d(f)) || (i2 & 24576) == 16384;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = new ebe(f);
                x340Var.s0(objT);
            }
            lqm0 lqm0Var = (lqm0) objT;
            j2i j2iVarQ = who1.q(listM);
            boolean zG = x340Var.g(lqm0Var);
            Object objT2 = x340Var.T();
            if (zG || objT2 == obj) {
                objT2 = new mqm0(lqm0Var);
                x340Var.s0(objT2);
            }
            gfh0 gfh0Var = (gfh0) objT2;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(0, j2iVarQ, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fbe(j2iVar, j2iVar2, j2iVar3, qim0Var, f, i);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1691045222);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131954600);
            String strO1 = cwl1.o0(x340Var, 2131954597);
            i3u i3uVar = new i3u(5, false, false, false);
            String strO2 = cwl1.o0(x340Var, 2131954598);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new j3n(function0, (byte) 1);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            zgx zgxVar = new zgx(strO2, new gbx(z50Var, (Function0) objT));
            String strO3 = cwl1.o0(x340Var, 2131954599);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new j3n(function1, (byte) 2);
                x340Var.s0(objT2);
            }
            zgx zgxVar2 = new zgx(strO3, new gbx(z50Var, (Function0) objT2));
            boolean z3 = i3 == 32;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new j3n(function1, (byte) 3);
                x340Var.s0(objT3);
            }
            mqo1.d((Function0) objT3, i3uVar, null, strO0, strO1, zgxVar, zgxVar2, x340Var, 2359296, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 10);
        }
    }

    public static final void d(d4n d4nVar, a4n a4nVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(6439545);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(d4nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(a4nVar) : x340Var.i(a4nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(nim0.a, cbx.a(x340Var).a.c, d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            irn1.u(qim0VarF, rgi.a, null, lhc.g(x340Var).g, apo.r(-2088199054, new nzd(d4nVar, a4nVar, iu30Var, (byte) 10), x340Var), x340Var, 24624, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok(d4nVar, a4nVar, iu30Var, i, (byte) 21);
        }
    }

    public static final void e(Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(939361571);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | (x340Var.i(function2) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new m3n(function2, function1, function0, (byte) 0);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = zxm.Z0;
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = zxm.a1;
                x340Var.s0(objT3);
            }
            iu30 iu30Var3 = (iu30) objT3;
            qim0 qim0Var3 = nim0.a;
            dm5.b(iu30Var, qim0Var3, (iu30) null, iu30Var2, iu30Var3, x340Var, 27696, 4);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n3n(function0, function1, function2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void f(gt40 gt40Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(597899950);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) x340Var.k(p4k.b);
            gt40 gt40Var2 = et40.a;
            gt40 gt40VarI = dm5.I(gt40Var2);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = vrw.e1;
                x340Var.s0(objT);
            }
            j2h1.b(iko1.x(gt40VarI, (iu30) objT), ql3.f, apo.r(1322584844, new yd2(context, (byte) 4), x340Var), x340Var, 384, 0);
            gt40Var = gt40Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m7x(gt40Var, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:120:0x022b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0231 A[PHI: r22
      0x0231: PHI (r22v6 p.vvr) = (r22v4 p.vvr), (r22v8 p.vvr) binds: [B:121:0x022f, B:119:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0234  */
    /* JADX WARN: Code duplicated, block: B:126:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x023e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0259  */
    /* JADX WARN: Code duplicated, block: B:132:0x025f  */
    /* JADX WARN: Code duplicated, block: B:138:0x026e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x0270  */
    /* JADX WARN: Code duplicated, block: B:142:0x028e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0294  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:152:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x0342  */
    public static final void g(lbh lbhVar, qim0 qim0Var, pob0 pob0Var, cr41 cr41Var, boolean z, boolean z2, boolean z3, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object w0cVar;
        pob0 pob0Var2;
        cob0 cob0Var;
        int i2;
        int i3;
        pob0 pob0Var3;
        boolean z4;
        m4c m4cVar;
        cob0 cob0Var2;
        boolean zG;
        Object objT;
        int i4;
        boolean z5;
        boolean zI;
        Object uh0Var;
        ven0 ven0VarS;
        Object objT2;
        char c2;
        vvr vvrVar;
        int i5;
        vvr vvrVar2;
        boolean z6;
        boolean z7;
        Object objT3;
        qim0 qim0VarB;
        boolean zI2;
        Object objT4;
        boolean zI3;
        Object objT5;
        qim0 qim0Var2;
        lbh lbhVar2 = lbhVar;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(258789418);
        int i6 = i | (b0kVar3.g(lbhVar2) ? 4 : 2) | (b0kVar3.g(qim0Var) ? 32 : 16) | (b0kVar3.g(pob0Var) ? 256 : 128) | (b0kVar3.h(z2) ? 131072 : 65536) | (b0kVar3.h(z3) ? 1048576 : 524288) | (b0kVar3.i(iu30Var) ? 8388608 : 4194304);
        boolean z8 = true;
        if (b0kVar3.Y(i6 & 1, (4793491 & i6) != 4793490)) {
            b0kVar3.d0();
            if ((i & 1) != 0 && !b0kVar3.E()) {
                b0kVar3.b0();
            }
            b0kVar3.s();
            int i7 = ((i6 >> 21) & 14) | ((i6 << 3) & 112);
            boolean z9 = (((i7 & 14) ^ 6) > 4 && b0kVar3.g(iu30Var)) || (i7 & 6) == 4;
            Object objT6 = b0kVar3.T();
            if (z9 || objT6 == m4cVar2) {
                fob0 fob0Var = new fob0(lbhVar2);
                iu30Var.invoke(fob0Var);
                objT6 = new cob0(fob0Var.b);
                b0kVar3.s0(objT6);
            }
            cob0 cob0Var3 = (cob0) objT6;
            Size size = new Size(pob0Var.c().d);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i8 = (i6 & 896) ^ 384;
            int i9 = i6 & 14;
            boolean z10 = ((3670016 & i6) == 1048576) | ((i8 > 256 && b0kVar3.g(pob0Var)) || (i6 & 384) == 256) | (i9 == 4);
            Object objT7 = b0kVar3.T();
            if (z10 || objT7 == m4cVar2) {
                pob0Var2 = pob0Var;
                cob0Var = cob0Var3;
                i2 = i9;
                w0cVar = new w0c(z3, pob0Var2, lbhVar2, (lnm) null, (byte) 1);
                i3 = i6;
                lbhVar2 = lbhVar2;
                b0kVar3.s0(w0cVar);
            } else {
                i3 = i6;
                i2 = i9;
                w0cVar = objT7;
                pob0Var2 = pob0Var;
                cob0Var = cob0Var3;
            }
            qxd0.r(size, lbhVar2, boolValueOf, (vu30) w0cVar, b0kVar3);
            qim0 qim0VarR = i1p1.r(qim0Var);
            qim0 qim0VarThen = nim0.a;
            if (z2) {
                b0kVar3.i0(130280552);
                int i10 = ((i3 >> 6) & 1022) | ((i3 << 9) & 7168);
                Object objT8 = b0kVar3.T();
                if (objT8 == m4cVar2) {
                    objT8 = qxd0.M(o6x.a, b0kVar3);
                    b0kVar3.s0(objT8);
                }
                c9n c9nVar = (c9n) objT8;
                Object objT9 = b0kVar3.T();
                if (objT9 == m4cVar2) {
                    objT9 = new g6o0();
                    b0kVar3.s0(objT9);
                }
                g6o0 g6o0Var = (g6o0) objT9;
                Object objT10 = b0kVar3.T();
                if (objT10 == m4cVar2) {
                    objT10 = new ak40();
                    b0kVar3.s0(objT10);
                }
                ak40 ak40Var = (ak40) objT10;
                Object objT11 = b0kVar3.T();
                if (objT11 == m4cVar2) {
                    objT11 = new u5u();
                    b0kVar3.s0(objT11);
                }
                u5u u5uVar = (u5u) objT11;
                boolean zI4 = b0kVar3.i(c9nVar) | b0kVar3.i(u5uVar);
                int i11 = (i10 & 14) ^ 6;
                if (i11 <= 4 || !b0kVar3.g(pob0Var2)) {
                    i4 = i10;
                    if ((i4 & 6) != 4) {
                        z5 = false;
                    }
                    zI = zI4 | z5 | b0kVar3.i(g6o0Var);
                    Object objT12 = b0kVar3.T();
                    if (!zI || objT12 == m4cVar2) {
                        pob0 pob0Var4 = pob0Var2;
                        uh0Var = new uh0(c9nVar, cr41Var, u5uVar, pob0Var4, g6o0Var, (byte) 26);
                        u5uVar = u5uVar;
                        g6o0Var = g6o0Var;
                        pob0Var3 = pob0Var4;
                        b0kVar3.s0(uh0Var);
                    } else {
                        uh0Var = objT12;
                        pob0Var3 = pob0Var2;
                    }
                    ven0VarS = v8r.s((iu30) uh0Var, b0kVar3);
                    objT2 = b0kVar3.T();
                    if (objT2 == m4cVar2) {
                        c2 = 4;
                        vvr vvrVar3 = new vvr(new g45(ven0VarS, (byte) 4));
                        b0kVar3.s0(vvrVar3);
                        objT2 = vvrVar3;
                    } else {
                        c2 = 4;
                    }
                    vvrVar = (vvr) objT2;
                    qim0 qim0VarL = bmq0.L(qim0VarThen, ak40Var, g6o0Var);
                    boolean zI5 = ((i11 <= c2 && b0kVar3.g(pob0Var3)) || (i4 & 6) == c2) | b0kVar3.i(c9nVar);
                    i5 = (i4 & 7168) ^ 3072;
                    if (i5 > 2048 || !b0kVar3.i(lbhVar2)) {
                        vvrVar2 = vvrVar;
                        if ((i4 & 3072) != 2048) {
                            z6 = false;
                        }
                        z7 = z6 | zI5;
                        objT3 = b0kVar3.T();
                        if (z7 || objT3 == m4cVar2) {
                            objT3 = new mhg(c9nVar, pob0Var3, lbhVar2, (byte) 2);
                            b0kVar3.s0(objT3);
                        }
                        qim0VarB = f8d1.b(qim0VarL, pob0Var3, (PointerInputEventHandler) objT3);
                        zI2 = b0kVar3.i(u5uVar) | b0kVar3.i(c9nVar) | ((i11 <= 4 && b0kVar3.g(pob0Var3)) || (i4 & 6) == 4);
                        objT4 = b0kVar3.T();
                        if (zI2 || objT4 == m4cVar2) {
                            objT4 = new djx(u5uVar, c9nVar, pob0Var3, (byte) 28);
                            b0kVar3.s0(objT4);
                        }
                        iu30 iu30Var2 = (iu30) objT4;
                        zI3 = b0kVar3.i(c9nVar) | b0kVar3.i(g6o0Var) | b0kVar3.i(u5uVar) | ((i11 <= 4 && b0kVar3.g(pob0Var3)) || (i4 & 6) == 4) | ((i5 <= 2048 && b0kVar3.i(lbhVar2)) || (i4 & 3072) == 2048);
                        objT5 = b0kVar3.T();
                        if (!zI3 || objT5 == m4cVar2) {
                            qim0Var2 = qim0VarB;
                            jqy jqyVar = new jqy((byte) 1, c9nVar, g6o0Var, cr41Var, u5uVar, pob0Var3, lbhVar2, z);
                            b0kVar3.s0(jqyVar);
                            objT5 = jqyVar;
                        } else {
                            qim0Var2 = qim0VarB;
                        }
                        qim0VarThen = qim0Var2.then(new w5v(vvrVar2, iu30Var2, (iu30) objT5));
                        z4 = false;
                        b0kVar3.r(false);
                    } else {
                        vvrVar2 = vvrVar;
                    }
                    z6 = true;
                    z7 = z6 | zI5;
                    objT3 = b0kVar3.T();
                    if (z7) {
                        objT3 = new mhg(c9nVar, pob0Var3, lbhVar2, (byte) 2);
                        b0kVar3.s0(objT3);
                    } else {
                        objT3 = new mhg(c9nVar, pob0Var3, lbhVar2, (byte) 2);
                        b0kVar3.s0(objT3);
                    }
                    qim0VarB = f8d1.b(qim0VarL, pob0Var3, (PointerInputEventHandler) objT3);
                    zI2 = b0kVar3.i(u5uVar) | b0kVar3.i(c9nVar) | ((i11 <= 4 && b0kVar3.g(pob0Var3)) || (i4 & 6) == 4);
                    objT4 = b0kVar3.T();
                    if (zI2) {
                        objT4 = new djx(u5uVar, c9nVar, pob0Var3, (byte) 28);
                        b0kVar3.s0(objT4);
                    } else {
                        objT4 = new djx(u5uVar, c9nVar, pob0Var3, (byte) 28);
                        b0kVar3.s0(objT4);
                    }
                    iu30 iu30Var3 = (iu30) objT4;
                    zI3 = b0kVar3.i(c9nVar) | b0kVar3.i(g6o0Var) | b0kVar3.i(u5uVar) | ((i11 <= 4 && b0kVar3.g(pob0Var3)) || (i4 & 6) == 4) | ((i5 <= 2048 && b0kVar3.i(lbhVar2)) || (i4 & 3072) == 2048);
                    objT5 = b0kVar3.T();
                    if (zI3) {
                        qim0Var2 = qim0VarB;
                        jqy jqyVar2 = new jqy((byte) 1, c9nVar, g6o0Var, cr41Var, u5uVar, pob0Var3, lbhVar2, z);
                        b0kVar3.s0(jqyVar2);
                        objT5 = jqyVar2;
                    } else {
                        qim0Var2 = qim0VarB;
                        jqy jqyVar3 = new jqy((byte) 1, c9nVar, g6o0Var, cr41Var, u5uVar, pob0Var3, lbhVar2, z);
                        b0kVar3.s0(jqyVar3);
                        objT5 = jqyVar3;
                    }
                    qim0VarThen = qim0Var2.then(new w5v(vvrVar2, iu30Var3, (iu30) objT5));
                    z4 = false;
                    b0kVar3.r(false);
                } else {
                    i4 = i10;
                }
                z5 = true;
                zI = zI4 | z5 | b0kVar3.i(g6o0Var);
                Object objT13 = b0kVar3.T();
                if (zI) {
                    pob0 pob0Var5 = pob0Var2;
                    uh0Var = new uh0(c9nVar, cr41Var, u5uVar, pob0Var5, g6o0Var, (byte) 26);
                    u5uVar = u5uVar;
                    g6o0Var = g6o0Var;
                    pob0Var3 = pob0Var5;
                    b0kVar3.s0(uh0Var);
                } else {
                    pob0 pob0Var6 = pob0Var2;
                    uh0Var = new uh0(c9nVar, cr41Var, u5uVar, pob0Var6, g6o0Var, (byte) 26);
                    u5uVar = u5uVar;
                    g6o0Var = g6o0Var;
                    pob0Var3 = pob0Var6;
                    b0kVar3.s0(uh0Var);
                }
                ven0VarS = v8r.s((iu30) uh0Var, b0kVar3);
                objT2 = b0kVar3.T();
                if (objT2 == m4cVar2) {
                    c2 = 4;
                    vvr vvrVar4 = new vvr(new g45(ven0VarS, (byte) 4));
                    b0kVar3.s0(vvrVar4);
                    objT2 = vvrVar4;
                } else {
                    c2 = 4;
                }
                vvrVar = (vvr) objT2;
                qim0 qim0VarL2 = bmq0.L(qim0VarThen, ak40Var, g6o0Var);
                boolean zI6 = ((i11 <= c2 && b0kVar3.g(pob0Var3)) || (i4 & 6) == c2) | b0kVar3.i(c9nVar);
                i5 = (i4 & 7168) ^ 3072;
                if (i5 > 2048) {
                    vvrVar2 = vvrVar;
                    if ((i4 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    vvrVar2 = vvrVar;
                    if ((i4 & 3072) != 2048) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                z7 = z6 | zI6;
                objT3 = b0kVar3.T();
                if (z7) {
                    objT3 = new mhg(c9nVar, pob0Var3, lbhVar2, (byte) 2);
                    b0kVar3.s0(objT3);
                } else {
                    objT3 = new mhg(c9nVar, pob0Var3, lbhVar2, (byte) 2);
                    b0kVar3.s0(objT3);
                }
                qim0VarB = f8d1.b(qim0VarL2, pob0Var3, (PointerInputEventHandler) objT3);
                zI2 = b0kVar3.i(u5uVar) | b0kVar3.i(c9nVar) | ((i11 <= 4 && b0kVar3.g(pob0Var3)) || (i4 & 6) == 4);
                objT4 = b0kVar3.T();
                if (zI2) {
                    objT4 = new djx(u5uVar, c9nVar, pob0Var3, (byte) 28);
                    b0kVar3.s0(objT4);
                } else {
                    objT4 = new djx(u5uVar, c9nVar, pob0Var3, (byte) 28);
                    b0kVar3.s0(objT4);
                }
                iu30 iu30Var4 = (iu30) objT4;
                zI3 = b0kVar3.i(c9nVar) | b0kVar3.i(g6o0Var) | b0kVar3.i(u5uVar) | ((i11 <= 4 && b0kVar3.g(pob0Var3)) || (i4 & 6) == 4) | ((i5 <= 2048 && b0kVar3.i(lbhVar2)) || (i4 & 3072) == 2048);
                objT5 = b0kVar3.T();
                if (zI3) {
                    qim0Var2 = qim0VarB;
                    jqy jqyVar4 = new jqy((byte) 1, c9nVar, g6o0Var, cr41Var, u5uVar, pob0Var3, lbhVar2, z);
                    b0kVar3.s0(jqyVar4);
                    objT5 = jqyVar4;
                } else {
                    qim0Var2 = qim0VarB;
                    jqy jqyVar5 = new jqy((byte) 1, c9nVar, g6o0Var, cr41Var, u5uVar, pob0Var3, lbhVar2, z);
                    b0kVar3.s0(jqyVar5);
                    objT5 = jqyVar5;
                }
                qim0VarThen = qim0Var2.then(new w5v(vvrVar2, iu30Var4, (iu30) objT5));
                z4 = false;
                b0kVar3.r(false);
            } else {
                pob0Var3 = pob0Var2;
                i3 = i3;
                z4 = false;
                m4cVar2 = m4cVar2;
                b0kVar3.i0(130395190);
                b0kVar3.r(false);
            }
            qim0 qim0VarThen2 = qim0VarR.then(qim0VarThen);
            boolean z11 = i2 != 4 ? z4 : true;
            if ((i8 <= 256 || !b0kVar3.g(pob0Var3)) && (i3 & 384) != 256) {
                z8 = z4;
            }
            boolean z12 = z11 | z8;
            Object objT14 = b0kVar3.T();
            if (z12) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT14 == m4cVar) {
                }
                hsb0 hsb0Var = (hsb0) objT14;
                cob0Var2 = cob0Var;
                zG = b0kVar3.g(cob0Var2);
                objT = b0kVar3.T();
                if (zG || objT == m4cVar) {
                    objT = new pr90(cob0Var2, (byte) 26);
                    b0kVar3.s0(objT);
                }
                b0kVar2 = b0kVar3;
                hm5.f((Function0) objT, qim0VarThen2, (tsb0) null, hsb0Var, b0kVar2, 0, 4);
            }
            objT14 = new dob0(lbhVar2, pob0Var3);
            b0kVar3.s0(objT14);
            hsb0 hsb0Var2 = (hsb0) objT14;
            cob0Var2 = cob0Var;
            zG = b0kVar3.g(cob0Var2);
            objT = b0kVar3.T();
            if (zG) {
                objT = new pr90(cob0Var2, (byte) 26);
                b0kVar3.s0(objT);
            } else {
                objT = new pr90(cob0Var2, (byte) 26);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            hm5.f((Function0) objT, qim0VarThen2, (tsb0) null, hsb0Var2, b0kVar2, 0, 4);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new eob0(lbhVar2, qim0Var, pob0Var, cr41Var, z, z2, z3, iu30Var, i);
        }
    }

    public static final void h(vzq0 vzq0Var, jkr0 jkr0Var, c380 c380Var, boolean z, qim0 qim0Var, Function0 function0, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        jkr0 jkr0Var2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1431469895);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(vzq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            jkr0Var2 = jkr0Var;
            i2 |= b0kVar3.g(jkr0Var2) ? 32 : 16;
        } else {
            jkr0Var2 = jkr0Var;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(c380Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
        }
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0VarL = bmq0.L(qim0Var, t5p1.s(iu30Var, b0kVar3), (g6o0) null);
            boolean z2 = (458752 & i2) == 131072;
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new tze0(function0, (byte) 20);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            w0h1.c(jkr0Var2, bin.x(qim0VarL, false, null, null, null, (Function0) objT, 15), (vzq0) null, (gdr0) null, 2, 0.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-1977649592, new q340(c380Var, z, vzq0Var), b0kVar3), b0kVar2, ((i2 >> 3) & 14) | 24576, 16364);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1((Object) vzq0Var, (ct41) jkr0Var, (Object) c380Var, z, (Object) qim0Var, (cv30) function0, (cv30) iu30Var, i, (byte) 4);
        }
    }

    public static final void i(String str, String str2, qmc1 qmc1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1121158745);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(qmc1Var) : b0kVar3.i(qmc1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 896) == 256 || ((i3 & 512) != 0 && b0kVar3.i(qmc1Var))) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new xur0(qmc1Var, str2, iu30Var, (byte) 1);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            b0kVar2 = b0kVar3;
            cgj1.n((qim0) null, apo.r(974951787, new tse0(function0, (byte) 22), b0kVar3), (vu30) null, (vu30) null, (vu30) null, 0, 0L, 0L, (erl1) null, apo.r(2068089718, new jb1(function0, qmc1Var, str2, iu30Var, str), b0kVar3), b0kVar2, 805306416, 509);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 13, i, str, str2, qmc1Var, iu30Var, qim0Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0153  */
    /* JADX WARN: Code duplicated, block: B:92:0x015f  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void j(boolean z, iu30 iu30Var, qim0 qim0Var, boolean z2, tad1 tad1Var, idn0 idn0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        idn0 idn0Var2;
        int i8;
        int i9;
        boolean z4;
        qim0 qim0Var3;
        idn0 idn0Var3;
        boolean z5;
        h311 h311VarV;
        int i10;
        qim0 qim0VarC;
        boolean z6;
        idn0 idn0Var4;
        boolean z7;
        qim0 qim0Var4;
        idn0 idn0Var5;
        idn0 idn0Var6;
        Object objT;
        int i11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-263339167);
        if ((i & 6) == 0) {
            i3 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
            }
            i4 = i3 | 3072;
            i5 = i2 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (x340Var.h(z3)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                if ((196608 & i) == 0) {
                    if (x340Var.g(tad1Var)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i4 |= i11;
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                    if ((1572864 & i) == 0) {
                        idn0Var2 = idn0Var;
                        if (x340Var.g(idn0Var2)) {
                            i8 = 1048576;
                        } else {
                            i8 = 524288;
                        }
                        i4 |= i8;
                    }
                    i9 = i4;
                    if ((599187 & i9) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var.Y(i9 & 1, z4)) {
                        x340Var.d0();
                        i10 = i & 1;
                        qim0VarC = nim0.a;
                        if (i10 != 0 || x340Var.E()) {
                            if (i12 != 0) {
                                qim0Var2 = qim0VarC;
                            }
                            z6 = i5 == 0 ? z3 : true;
                            if (i7 != 0) {
                                qim0Var4 = qim0Var2;
                                z7 = z6;
                                idn0Var4 = null;
                            } else {
                                boolean z8 = z6;
                                idn0Var4 = idn0Var2;
                                z7 = z8;
                                qim0Var4 = qim0Var2;
                            }
                        } else {
                            x340Var.b0();
                            qim0Var4 = qim0Var2;
                            idn0Var4 = idn0Var2;
                            z7 = z3;
                        }
                        x340Var.s();
                        if (idn0Var4 == null) {
                            x340Var.i0(1768604058);
                            objT = x340Var.T();
                            if (objT == fkj0.X) {
                                objT = ktd.n(x340Var);
                            }
                            idn0Var5 = (idn0) objT;
                            x340Var.r(false);
                        } else {
                            x340Var.i0(334145757);
                            x340Var.r(false);
                            idn0Var5 = idn0Var4;
                        }
                        if (iu30Var != null) {
                            vq60 vq60Var = jw80.a;
                            idn0Var6 = idn0Var5;
                            qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                        } else {
                            idn0Var6 = idn0Var5;
                        }
                        int i13 = i9 << 3;
                        int i14 = i9 >> 6;
                        k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i13 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 57344));
                        qim0Var3 = qim0Var4;
                        z5 = z7;
                        idn0Var3 = idn0Var4;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        idn0Var3 = idn0Var2;
                        z5 = z3;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
                    }
                }
                i4 |= 1572864;
                idn0Var2 = idn0Var;
                i9 = i4;
                if ((599187 & i9) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i9 & 1, z4)) {
                    x340Var.d0();
                    i10 = i & 1;
                    qim0VarC = nim0.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            qim0Var2 = qim0VarC;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            qim0Var4 = qim0Var2;
                            z7 = z6;
                            idn0Var4 = null;
                        } else {
                            boolean z9 = z6;
                            idn0Var4 = idn0Var2;
                            z7 = z9;
                            qim0Var4 = qim0Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = qim0VarC;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            qim0Var4 = qim0Var2;
                            z7 = z6;
                            idn0Var4 = null;
                        } else {
                            boolean z10 = z6;
                            idn0Var4 = idn0Var2;
                            z7 = z10;
                            qim0Var4 = qim0Var2;
                        }
                    }
                    x340Var.s();
                    if (idn0Var4 == null) {
                        x340Var.i0(1768604058);
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = ktd.n(x340Var);
                        }
                        idn0Var5 = (idn0) objT;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(334145757);
                        x340Var.r(false);
                        idn0Var5 = idn0Var4;
                    }
                    if (iu30Var != null) {
                        vq60 vq60Var2 = jw80.a;
                        idn0Var6 = idn0Var5;
                        qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                    } else {
                        idn0Var6 = idn0Var5;
                    }
                    int i15 = i9 << 3;
                    int i16 = i9 >> 6;
                    k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i15 & 112) | (i16 & 896) | (i16 & 7168) | (i15 & 57344));
                    qim0Var3 = qim0Var4;
                    z5 = z7;
                    idn0Var3 = idn0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    idn0Var3 = idn0Var2;
                    z5 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
                }
            }
            i4 = i3 | 27648;
            z3 = z2;
            if ((196608 & i) == 0) {
                if (x340Var.g(tad1Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i4;
                if ((599187 & i9) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i9 & 1, z4)) {
                    x340Var.d0();
                    i10 = i & 1;
                    qim0VarC = nim0.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            qim0Var2 = qim0VarC;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            qim0Var4 = qim0Var2;
                            z7 = z6;
                            idn0Var4 = null;
                        } else {
                            boolean z11 = z6;
                            idn0Var4 = idn0Var2;
                            z7 = z11;
                            qim0Var4 = qim0Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = qim0VarC;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            qim0Var4 = qim0Var2;
                            z7 = z6;
                            idn0Var4 = null;
                        } else {
                            boolean z12 = z6;
                            idn0Var4 = idn0Var2;
                            z7 = z12;
                            qim0Var4 = qim0Var2;
                        }
                    }
                    x340Var.s();
                    if (idn0Var4 == null) {
                        x340Var.i0(1768604058);
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = ktd.n(x340Var);
                        }
                        idn0Var5 = (idn0) objT;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(334145757);
                        x340Var.r(false);
                        idn0Var5 = idn0Var4;
                    }
                    if (iu30Var != null) {
                        vq60 vq60Var3 = jw80.a;
                        idn0Var6 = idn0Var5;
                        qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                    } else {
                        idn0Var6 = idn0Var5;
                    }
                    int i17 = i9 << 3;
                    int i18 = i9 >> 6;
                    k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i17 & 112) | (i18 & 896) | (i18 & 7168) | (i17 & 57344));
                    qim0Var3 = qim0Var4;
                    z5 = z7;
                    idn0Var3 = idn0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    idn0Var3 = idn0Var2;
                    z5 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
                }
            }
            i4 |= 1572864;
            idn0Var2 = idn0Var;
            i9 = i4;
            if ((599187 & i9) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i9 & 1, z4)) {
                x340Var.d0();
                i10 = i & 1;
                qim0VarC = nim0.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        qim0Var2 = qim0VarC;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var2;
                        z7 = z6;
                        idn0Var4 = null;
                    } else {
                        boolean z13 = z6;
                        idn0Var4 = idn0Var2;
                        z7 = z13;
                        qim0Var4 = qim0Var2;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var2 = qim0VarC;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var2;
                        z7 = z6;
                        idn0Var4 = null;
                    } else {
                        boolean z14 = z6;
                        idn0Var4 = idn0Var2;
                        z7 = z14;
                        qim0Var4 = qim0Var2;
                    }
                }
                x340Var.s();
                if (idn0Var4 == null) {
                    x340Var.i0(1768604058);
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var5 = (idn0) objT;
                    x340Var.r(false);
                } else {
                    x340Var.i0(334145757);
                    x340Var.r(false);
                    idn0Var5 = idn0Var4;
                }
                if (iu30Var != null) {
                    vq60 vq60Var4 = jw80.a;
                    idn0Var6 = idn0Var5;
                    qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                } else {
                    idn0Var6 = idn0Var5;
                }
                int i19 = i9 << 3;
                int i110 = i9 >> 6;
                k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i19 & 112) | (i110 & 896) | (i110 & 7168) | (i19 & 57344));
                qim0Var3 = qim0Var4;
                z5 = z7;
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                idn0Var3 = idn0Var2;
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        i4 = i3 | 3072;
        i5 = i2 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (x340Var.h(z3)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((196608 & i) == 0) {
                if (x340Var.g(tad1Var)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i4 |= i11;
            }
            i7 = i2 & 64;
            if (i7 != 0) {
                if ((1572864 & i) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i4 |= i8;
                }
                i9 = i4;
                if ((599187 & i9) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i9 & 1, z4)) {
                    x340Var.d0();
                    i10 = i & 1;
                    qim0VarC = nim0.a;
                    if (i10 != 0) {
                        if (i12 != 0) {
                            qim0Var2 = qim0VarC;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            qim0Var4 = qim0Var2;
                            z7 = z6;
                            idn0Var4 = null;
                        } else {
                            boolean z15 = z6;
                            idn0Var4 = idn0Var2;
                            z7 = z15;
                            qim0Var4 = qim0Var2;
                        }
                    } else {
                        if (i12 != 0) {
                            qim0Var2 = qim0VarC;
                        }
                        if (i5 == 0) {
                        }
                        if (i7 != 0) {
                            qim0Var4 = qim0Var2;
                            z7 = z6;
                            idn0Var4 = null;
                        } else {
                            boolean z16 = z6;
                            idn0Var4 = idn0Var2;
                            z7 = z16;
                            qim0Var4 = qim0Var2;
                        }
                    }
                    x340Var.s();
                    if (idn0Var4 == null) {
                        x340Var.i0(1768604058);
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = ktd.n(x340Var);
                        }
                        idn0Var5 = (idn0) objT;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(334145757);
                        x340Var.r(false);
                        idn0Var5 = idn0Var4;
                    }
                    if (iu30Var != null) {
                        vq60 vq60Var5 = jw80.a;
                        idn0Var6 = idn0Var5;
                        qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                    } else {
                        idn0Var6 = idn0Var5;
                    }
                    int i111 = i9 << 3;
                    int i112 = i9 >> 6;
                    k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i111 & 112) | (i112 & 896) | (i112 & 7168) | (i111 & 57344));
                    qim0Var3 = qim0Var4;
                    z5 = z7;
                    idn0Var3 = idn0Var4;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    idn0Var3 = idn0Var2;
                    z5 = z3;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
                }
            }
            i4 |= 1572864;
            idn0Var2 = idn0Var;
            i9 = i4;
            if ((599187 & i9) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i9 & 1, z4)) {
                x340Var.d0();
                i10 = i & 1;
                qim0VarC = nim0.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        qim0Var2 = qim0VarC;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var2;
                        z7 = z6;
                        idn0Var4 = null;
                    } else {
                        boolean z17 = z6;
                        idn0Var4 = idn0Var2;
                        z7 = z17;
                        qim0Var4 = qim0Var2;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var2 = qim0VarC;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var2;
                        z7 = z6;
                        idn0Var4 = null;
                    } else {
                        boolean z18 = z6;
                        idn0Var4 = idn0Var2;
                        z7 = z18;
                        qim0Var4 = qim0Var2;
                    }
                }
                x340Var.s();
                if (idn0Var4 == null) {
                    x340Var.i0(1768604058);
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var5 = (idn0) objT;
                    x340Var.r(false);
                } else {
                    x340Var.i0(334145757);
                    x340Var.r(false);
                    idn0Var5 = idn0Var4;
                }
                if (iu30Var != null) {
                    vq60 vq60Var6 = jw80.a;
                    idn0Var6 = idn0Var5;
                    qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                } else {
                    idn0Var6 = idn0Var5;
                }
                int i113 = i9 << 3;
                int i114 = i9 >> 6;
                k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i113 & 112) | (i114 & 896) | (i114 & 7168) | (i113 & 57344));
                qim0Var3 = qim0Var4;
                z5 = z7;
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                idn0Var3 = idn0Var2;
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
            }
        }
        i4 = i3 | 27648;
        z3 = z2;
        if ((196608 & i) == 0) {
            if (x340Var.g(tad1Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i4 |= i11;
        }
        i7 = i2 & 64;
        if (i7 != 0) {
            if ((1572864 & i) == 0) {
                idn0Var2 = idn0Var;
                if (x340Var.g(idn0Var2)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i4;
            if ((599187 & i9) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i9 & 1, z4)) {
                x340Var.d0();
                i10 = i & 1;
                qim0VarC = nim0.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        qim0Var2 = qim0VarC;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var2;
                        z7 = z6;
                        idn0Var4 = null;
                    } else {
                        boolean z19 = z6;
                        idn0Var4 = idn0Var2;
                        z7 = z19;
                        qim0Var4 = qim0Var2;
                    }
                } else {
                    if (i12 != 0) {
                        qim0Var2 = qim0VarC;
                    }
                    if (i5 == 0) {
                    }
                    if (i7 != 0) {
                        qim0Var4 = qim0Var2;
                        z7 = z6;
                        idn0Var4 = null;
                    } else {
                        boolean z110 = z6;
                        idn0Var4 = idn0Var2;
                        z7 = z110;
                        qim0Var4 = qim0Var2;
                    }
                }
                x340Var.s();
                if (idn0Var4 == null) {
                    x340Var.i0(1768604058);
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = ktd.n(x340Var);
                    }
                    idn0Var5 = (idn0) objT;
                    x340Var.r(false);
                } else {
                    x340Var.i0(334145757);
                    x340Var.r(false);
                    idn0Var5 = idn0Var4;
                }
                if (iu30Var != null) {
                    vq60 vq60Var7 = jw80.a;
                    idn0Var6 = idn0Var5;
                    qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
                } else {
                    idn0Var6 = idn0Var5;
                }
                int i115 = i9 << 3;
                int i116 = i9 >> 6;
                k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i115 & 112) | (i116 & 896) | (i116 & 7168) | (i115 & 57344));
                qim0Var3 = qim0Var4;
                z5 = z7;
                idn0Var3 = idn0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                idn0Var3 = idn0Var2;
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
            }
        }
        i4 |= 1572864;
        idn0Var2 = idn0Var;
        i9 = i4;
        if ((599187 & i9) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i9 & 1, z4)) {
            x340Var.d0();
            i10 = i & 1;
            qim0VarC = nim0.a;
            if (i10 != 0) {
                if (i12 != 0) {
                    qim0Var2 = qim0VarC;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    qim0Var4 = qim0Var2;
                    z7 = z6;
                    idn0Var4 = null;
                } else {
                    boolean z111 = z6;
                    idn0Var4 = idn0Var2;
                    z7 = z111;
                    qim0Var4 = qim0Var2;
                }
            } else {
                if (i12 != 0) {
                    qim0Var2 = qim0VarC;
                }
                if (i5 == 0) {
                }
                if (i7 != 0) {
                    qim0Var4 = qim0Var2;
                    z7 = z6;
                    idn0Var4 = null;
                } else {
                    boolean z112 = z6;
                    idn0Var4 = idn0Var2;
                    z7 = z112;
                    qim0Var4 = qim0Var2;
                }
            }
            x340Var.s();
            if (idn0Var4 == null) {
                x340Var.i0(1768604058);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = ktd.n(x340Var);
                }
                idn0Var5 = (idn0) objT;
                x340Var.r(false);
            } else {
                x340Var.i0(334145757);
                x340Var.r(false);
                idn0Var5 = idn0Var4;
            }
            if (iu30Var != null) {
                vq60 vq60Var8 = jw80.a;
                idn0Var6 = idn0Var5;
                qim0VarC = qmo1.C(tsj0.a, z, idn0Var6, null, z7, new pm31(2), iu30Var);
            } else {
                idn0Var6 = idn0Var5;
            }
            int i117 = i9 << 3;
            int i118 = i9 >> 6;
            k(u291.n(u291.B(qim0Var4.then(qim0VarC), een.h, 2), 52.0f, 32.0f), z, z7, tad1Var, idn0Var6, px61.b(x340Var, 7), x340Var, (i117 & 112) | (i118 & 896) | (i118 & 7168) | (i117 & 57344));
            qim0Var3 = qim0Var4;
            z5 = z7;
            idn0Var3 = idn0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            idn0Var3 = idn0Var2;
            z5 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new toz0(z, iu30Var, qim0Var3, z5, tad1Var, idn0Var3, i, i2, (byte) 1);
        }
    }

    public static final void k(final qim0 qim0Var, final boolean z, final boolean z2, final tad1 tad1Var, final idn0 idn0Var, final hw61 hw61Var, b0k b0kVar, final int i) {
        int i2;
        long j;
        long j2;
        hw61 hw61Var2;
        long j3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-670917213);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(tad1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i((Object) null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(idn0Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(hw61Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? tad1Var.b : tad1Var.f;
            } else {
                j = z ? tad1Var.j : tad1Var.n;
            }
            if (z2) {
                j2 = z ? tad1Var.a : tad1Var.e;
            } else {
                j2 = z ? tad1Var.i : tad1Var.m;
            }
            hw61 hw61VarB = px61.b(x340Var, 7);
            if (z2) {
                hw61Var2 = hw61VarB;
                j3 = z ? tad1Var.c : tad1Var.g;
            } else {
                hw61Var2 = hw61VarB;
                j3 = z ? tad1Var.k : tad1Var.o;
            }
            hw61 hw61Var3 = hw61Var2;
            qim0 qim0VarF = dug.f(d1u.E(2.0f, j3, qim0Var, hw61Var3), j, hw61Var3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            llj lljVar3 = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar3);
            }
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = dug.f(da80.a(h2c.a.a(nim0.a, een.g).then(new ohe1(idn0Var, z, t890.w(x340Var, 2))), idn0Var, ai31.a(20.0f, 4, false)), j2, hw61Var);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iK2 = tgp1.k(x340Var);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK2))) {
                z5c.f(iK2, x340Var, iK2, lljVar3);
            }
            nko1.H(qim0VarE2, x340Var, lljVar4);
            x340Var.i0(1236071411);
            x340Var.r(false);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.uad1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ljo1.k(qim0Var, z, z2, tad1Var, idn0Var, hw61Var, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void l(boolean z, c9 c9Var, gj90 gj90Var, vu30 vu30Var, b0k b0kVar, int i) {
        c9 c9Var2 = c9Var;
        gj90 gj90Var2 = gj90Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(715136633);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(c9Var2) ? 32 : 16) | (x340Var.g(gj90Var2) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(w7x.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                g1y g1yVar = new g1y(z, gj90Var2, c9Var2, ven0Var, vu30Var, (lnm) null);
                gj90Var2 = gj90Var2;
                c9Var2 = c9Var2;
                x340Var.s0(g1yVar);
                objT2 = g1yVar;
            }
            qxd0.r(boolValueOf, c9Var2, gj90Var2, (vu30) objT2, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(z, c9Var2, gj90Var2, vu30Var, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[LOOP:0: B:33:0x009e->B:35:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable m(Set set, vu30 vu30Var, onm onmVar) {
        yt00 yt00Var;
        Map map;
        List list;
        LinkedHashMap linkedHashMap;
        int iS;
        if (onmVar instanceof yt00) {
            yt00Var = (yt00) onmVar;
            int i = yt00Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yt00Var.c = i - Integer.MIN_VALUE;
            } else {
                yt00Var = new yt00(onmVar);
            }
        } else {
            yt00Var = new yt00(onmVar);
        }
        Object obj = yt00Var.b;
        int i2 = yt00Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set) {
                if (((poa0) obj2).a().length() == 0) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                map = b7x.a;
                list = arrayList;
            } else {
                Set setP1 = o7h.p1(arrayList2);
                yt00Var.a = arrayList;
                yt00Var.c = 1;
                Object objInvoke = vu30Var.invoke(setP1, yt00Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
                obj = objInvoke;
                list = arrayList;
            }
            List list2 = list;
            iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap = new LinkedHashMap(iS);
            for (Object obj3 : list2) {
                linkedHashMap.put(obj3, null);
            }
            return sqg0.O(map, linkedHashMap);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        list = yt00Var.a;
        hm5.M(obj);
        map = (Map) obj;
        List list3 = list;
        iS = zno1.s(q7h.U(list3, 10));
        if (iS < 16) {
            iS = 16;
        }
        linkedHashMap = new LinkedHashMap(iS);
        while (r7.hasNext()) {
            linkedHashMap.put(obj3, null);
        }
        return sqg0.O(map, linkedHashMap);
    }

    public static final yhf1 n(hjf1 hjf1Var) {
        ezf1 ezf1Var = hjf1Var.i;
        return new yhf1((ezf1Var == ezf1.c || ezf1Var == ezf1.d) ? 3 : 0, (hjf1Var.j ? 16 : 0) | (hjf1Var.k ? 32 : 0), hjf1Var.l);
    }

    public static final boolean o(long j, n511 n511Var) {
        float f = n511Var.a;
        float f2 = n511Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = n511Var.b;
        float f4 = n511Var.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }

    public static int p(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }

    public static List q(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
    }

    public static final lvl0 r(urk0 urk0Var, ol6 ol6Var) {
        d8r0 d8r0Var = ol6Var.j;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), ol6Var.i, (byte) 3);
    }

    public static final mr20 s(poa0 poa0Var, iu30 iu30Var) {
        return poa0Var.a().length() == 0 ? new huz(new ly21(new by21("Empty list URI")), (byte) 10) : (mr20) iu30Var.invoke(poa0Var);
    }

    public static final k3r t(rla1 rla1Var, poa0 poa0Var, iu30 iu30Var) {
        if (!(rla1Var instanceof pla1)) {
            if (rla1Var instanceof qla1) {
                return (k3r) ((py21) ((qla1) rla1Var).a).b(new gi00(poa0Var, (byte) 2), new v2y(iu30Var, (byte) 20));
            }
            eg.o();
            return null;
        }
        return new h3r(new d3r("Failed to get list for key " + poa0Var + ": " + ((pla1) rla1Var).a));
    }

    public static final n511 u(elb0 elb0Var) {
        n511 n511VarN = nho1.n(elb0Var, true);
        return anm1.e(elb0Var.f(n511VarN.h()), elb0Var.f(n511VarN.e()));
    }

    public static final String v(String str) {
        int i = n7p1.a;
        Charset charset = StandardCharsets.UTF_8;
        return x6p1.c.z(str).toString();
    }
}
