package p;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class j1e1 {
    public static final jm a = new jm("COMPLETING_ALREADY", (byte) 5);
    public static final jm b = new jm("COMPLETING_WAITING_CHILDREN", (byte) 5);
    public static final jm c = new jm("COMPLETING_RETRY", (byte) 5);
    public static final jm d = new jm("TOO_LATE_TO_CANCEL", (byte) 5);
    public static final jm e = new jm("SEALED", (byte) 5);
    public static final z5x f = new z5x(false);
    public static final z5x g = new z5x(true);
    public static b180 h;

    public static hoa1 A(String str, String str2, String str3, String str4) {
        return new hoa1(str, ajn0.e(str2), str3, str4);
    }

    public static final n511 B(ken0 ken0Var) {
        return new n511(ken0Var.a, ken0Var.b, ken0Var.c, ken0Var.d);
    }

    public static final o4m1 C(d4m1 d4m1Var) {
        if (d4m1Var.c) {
            return l4m1.a;
        }
        if (!d4m1Var.b) {
            return n4m1.a;
        }
        ws61 ws61Var = d4m1Var.d;
        ArrayList arrayListK = w6d1.k(d4m1Var);
        int i = d4m1Var.g;
        int i2 = d4m1Var.h;
        int i3 = d4m1Var.i;
        int i4 = d4m1Var.j;
        int i5 = d4m1Var.k;
        int i6 = d4m1Var.n;
        int i7 = d4m1Var.o;
        int i8 = d4m1Var.p;
        List list = d4m1Var.s;
        Set set = d4m1Var.t;
        Integer num = d4m1Var.u;
        boolean z = d4m1Var.v;
        gzl1 gzl1Var = d4m1Var.w;
        boolean z2 = d4m1Var.z;
        boolean z3 = d4m1Var.A;
        boolean z4 = d4m1Var.B;
        boolean z5 = d4m1Var.y;
        boolean z6 = d4m1Var.C;
        boolean z7 = d4m1Var.D;
        gj4 gj4Var = d4m1Var.E;
        qu61 qu61Var = d4m1Var.F;
        return new m4m1(ws61Var, arrayListK, i, i2, i3, i4, i5, i6, i7, i8, list, set, num, z, gzl1Var, z2, z3, z4, z5, z6, z7, gj4Var, (qu61Var == null || qu61Var.equals(new qu61(i, i5, set, num, gzl1Var, z3, z4, z2))) ? false : true);
    }

    public static final Object D(Object obj) {
        j980 j980Var = obj instanceof j980 ? (j980) obj : null;
        return j980Var != null ? j980Var.a : obj;
    }

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-749709792);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gdx gdxVarS = yla.s(x340Var);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(x340Var, 2131955139);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z9t(function0, (byte) 15);
                x340Var.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function1), ldxVar, qim0Var, (max) null, gdxVarS, (vzq0) null, false, (idn0) null, (ga80) null, jki.a, x340Var, (i2 << 3) & 896, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var, i, (byte) 23);
        }
    }

    public static final void b(iu30 iu30Var, eyh0 eyh0Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        eyh0 eyh0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1651673431);
        byte b2 = 2;
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.g(eyh0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new dc2(eyh0Var, iu30Var, b2);
                x340Var.s0(objT);
            }
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, (Function0) objT), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fai.a, x340Var, 0, 48, 2044);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                eyh0Var2 = eyh0Var;
                objT2 = new dc2(eyh0Var2, iu30Var2, (byte) 3);
                x340Var.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
                eyh0Var2 = eyh0Var;
            }
            foo1.c(new gbx(z50Var, (Function0) objT2), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fai.b, x340Var, 0, 48, 2044);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            eyh0Var2 = eyh0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(iu30Var2, eyh0Var2, i, (byte) 22);
        }
    }

    public static final void c(vex0 vex0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        char c2;
        bix0 bix0Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        String str = vex0Var.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1916657928);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.g(vex0Var) ? 4 : 2) | 48;
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar2).b.a;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(d36Var, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar4);
            nko1.H(xos0VarM, b0kVar2, lljVar3);
            x0d.q(iHashCode, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE, b0kVar2, lljVar);
            ye5 ye5Var = new ye5();
            try {
                c2 = 0;
                try {
                    int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                    try {
                        ye5Var.g(str);
                        ye5Var.k(iO);
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                } catch (NoSuchMethodError unused) {
                    ye5Var.g(str);
                }
            } catch (NoSuchMethodError unused2) {
                c2 = 0;
            }
            ye5Var.g(" / ");
            ye5Var.g(vex0Var.b);
            af5 af5VarP = ye5Var.p();
            uwr uwrVar2 = cbx.a;
            uwo1.d(af5VarP, cbx.a(b0kVar2).b.b, (qim0) null, cbx.d(b0kVar2).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4084);
            b0kVar2 = b0kVar2;
            d36 d36Var2 = new d36(4.0f, true, new um5(false));
            qim0Var2 = qim0Var3;
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            jw31 jw31VarA = ew31.a(d36Var2, een.Z, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarF2);
            hzj.A.getClass();
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA, b0kVar2, lljVar4);
            nko1.H(xos0VarM2, b0kVar2, lljVar3);
            x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar);
            b0kVar2.i0(1380512122);
            int i3 = 0;
            for (Object obj : vex0Var.c) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                bix0 bix0Var2 = (bix0) obj;
                if (i3 == 0) {
                    float f2 = bix0Var2.b;
                    if (f2 < 0.01f) {
                        f2 = 0.01f;
                    }
                    bix0Var = new bix0(bix0Var2.a, f2, bix0Var2.c, bix0Var2.d);
                } else {
                    bix0Var = bix0Var2;
                }
                float f3 = bix0Var2.d;
                if (f3 <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                if (f3 > Float.MAX_VALUE) {
                    f3 = Float.MAX_VALUE;
                }
                mue1.b(bix0Var, new wnb0(f3, true), b0kVar2, 0);
                i3 = i4;
            }
            us71.m(b0kVar2, false, true, true);
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(vex0Var, qim0Var2, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0315  */
    /* JADX WARN: Code duplicated, block: B:146:0x038c  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ce  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, byte] */
    public static final void d(dqy dqyVar, yzu yzuVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        dqy dqyVar2;
        yzu yzuVar2;
        x340 x340Var;
        Object og5Var;
        int i2;
        ?? r10;
        tob1 tob1Var;
        tob1 tob1Var2;
        int i3;
        lnm lnmVar;
        ArrayList arrayList;
        String str;
        int i4;
        Object gcyVar;
        x340 x340Var2;
        int i5;
        m4c m4cVar = fkj0.X;
        bw91 bw91Var = dqyVar.e;
        bw91 bw91Var2 = dqyVar.d;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-1430251211);
        int i6 = (i & 6) == 0 ? (x340Var3.i(dqyVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= x340Var3.i(yzuVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= x340Var3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i6 |= x340Var3.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var3.Y(i6 & 1, (i6 & 1171) != 1170)) {
            Object objT = x340Var3.T();
            if (objT == m4cVar) {
                objT = v8r.q(z6x.a);
                x340Var3.s0(objT);
            }
            tob1 tob1Var3 = (ven0) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(null);
                x340Var3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(null);
                x340Var3.s0(objT3);
            }
            tob1 tob1Var4 = (ven0) objT3;
            String strD = dqyVar.d();
            boolean zI = x340Var3.i(dqyVar) | x340Var3.i(tob1Var3) | x340Var3.i(ven0Var) | x340Var3.i(tob1Var4) | x340Var3.i(yzuVar);
            Object objT4 = x340Var3.T();
            if (zI || objT4 == m4cVar) {
                i2 = i6;
                r10 = 0;
                og5Var = new og5((byte) 14, dqyVar, yzuVar, tob1Var3, ven0Var, tob1Var4, (lnm) null);
                tob1Var = tob1Var3;
                tob1Var2 = tob1Var4;
                x340Var3.s0(og5Var);
            } else {
                i2 = i6;
                tob1Var = tob1Var3;
                tob1Var2 = tob1Var4;
                og5Var = objT4;
                r10 = 0;
            }
            qxd0.t(strD, x340Var3, (vu30) og5Var);
            ArrayList arrayList2 = new ArrayList(q7h.U(bw91Var2, 10));
            ek60 ek60VarListIterator = bw91Var2.listIterator();
            while (true) {
                ek60 ek60Var = ek60VarListIterator;
                if (!ek60Var.hasNext()) {
                    break;
                } else {
                    arrayList2.add(((ll51) ek60Var.next()).a);
                }
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(bw91Var, 10));
            ek60 ek60VarListIterator2 = bw91Var.listIterator();
            while (true) {
                ek60 ek60Var2 = ek60VarListIterator2;
                if (!ek60Var2.hasNext()) {
                    break;
                } else {
                    arrayList3.add(((fl51) ek60Var2.next()).a);
                }
            }
            List list = (List) tob1Var.getValue();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                if (!arrayList2.contains(((fl51) obj).a)) {
                    arrayList4.add(obj);
                }
            }
            List listJ0 = arrayList2;
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 p.dqy
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1182
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.j1e1.d(p.dqy, p.yzu, p.iu30, p.qim0, p.b0k, int):void");
        }

        public static final void e(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1287096120);
            int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                nyx.a(1, (wux) null, apo.r(154232603, new tse0(function0), x340Var), x340Var, 3078, 6);
                qim0Var = nim0.a;
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bb50(qim0Var, function0, i, (byte) 22);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0026  */
        /* JADX WARN: Code duplicated, block: B:12:0x0028  */
        /* JADX WARN: Code duplicated, block: B:15:0x0030  */
        /* JADX WARN: Code duplicated, block: B:21:0x0042  */
        /* JADX WARN: Code duplicated, block: B:23:0x0048  */
        /* JADX WARN: Code duplicated, block: B:27:0x0097  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
        public static final void f(qim0 qim0Var, long j, b0k b0kVar, int i, int i2) {
            long j2;
            int i3;
            boolean z;
            qim0 qim0Var2;
            long j3;
            h311 h311VarV;
            int i4;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1779137140);
            int i5 = i | 6;
            if ((i2 & 2) == 0) {
                j2 = j;
                int i6 = x340Var.f(j2) ? 32 : 16;
                i3 = i5 | i6;
                if ((i3 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    x340Var.d0();
                    if ((i & 1) != 0 || x340Var.E()) {
                        i4 = i2 & 2;
                        qim0 qim0Var3 = nim0.a;
                        if (i4 != 0) {
                            uwr uwrVar = cbx.a;
                            j2 = ((wex) ((gmt) zex.a.c).c).d;
                        }
                        qim0Var = qim0Var3;
                    } else {
                        x340Var.b0();
                    }
                    x340Var.s();
                    qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), 340.0f);
                    u7h u7hVar = new u7h(j2);
                    uwr uwrVar2 = cbx.a;
                    t1c.a(dug.e(qim0VarH, v9c.s(p7h.M(new u7h[]{u7hVar, new u7h(cbx.a(x340Var).a.c)}), 0.0f, Float.POSITIVE_INFINITY, 8), (hw61) null, 0.0f, 6), x340Var, 0);
                } else {
                    x340Var.b0();
                }
                qim0Var2 = qim0Var;
                j3 = j2;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hv11(qim0Var2, j3, i, i2, (byte) 2);
                }
            }
            j2 = j;
            i3 = i5 | i6;
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    i4 = i2 & 2;
                    qim0 qim0Var4 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar3 = cbx.a;
                        j2 = ((wex) ((gmt) zex.a.c).c).d;
                    }
                    qim0Var = qim0Var4;
                } else {
                    i4 = i2 & 2;
                    qim0 qim0Var5 = nim0.a;
                    if (i4 != 0) {
                        uwr uwrVar4 = cbx.a;
                        j2 = ((wex) ((gmt) zex.a.c).c).d;
                    }
                    qim0Var = qim0Var5;
                }
                x340Var.s();
                qim0 qim0VarH2 = u291.h(u291.f(qim0Var, 1.0f), 340.0f);
                u7h u7hVar2 = new u7h(j2);
                uwr uwrVar5 = cbx.a;
                t1c.a(dug.e(qim0VarH2, v9c.s(p7h.M(new u7h[]{u7hVar2, new u7h(cbx.a(x340Var).a.c)}), 0.0f, Float.POSITIVE_INFINITY, 8), (hw61) null, 0.0f, 6), x340Var, 0);
            } else {
                x340Var.b0();
            }
            qim0Var2 = qim0Var;
            j3 = j2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hv11(qim0Var2, j3, i, i2, (byte) 2);
            }
        }

        public static final void g(n960 n960Var, n960 n960Var2, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-990207985);
            int i2 = (x340Var.g(n960Var) ? 4 : 2) | i | (x340Var.g(n960Var2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                w2g0.c(u291.f(qim0Var, 1.0f), null, apo.r(-922129179, new n8k0((Object) n960Var2, n960Var.b == 1, (Object) n960Var, (byte) 3), x340Var), x340Var, 3072, 6);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new suq0(n960Var, n960Var2, qim0Var, i, (byte) 0);
            }
        }

        public static final void h(n960 n960Var, n960 n960Var2, qim0 qim0Var, b0k b0kVar, int i) {
            zvx zvxVar;
            int i2 = n960Var.b;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-966184513);
            int i3 = i | (x340Var.g(n960Var) ? 4 : 2) | (x340Var.g(n960Var2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                boolean z = i2 == 1;
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                zvx zvxVar2 = null;
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
                Uri uri = Uri.parse(n960Var2.a);
                if (z) {
                    x340Var.i0(-1154222696);
                    x340Var.r(false);
                    zvxVar = null;
                } else {
                    x340Var.i0(-868516116);
                    uwr uwrVar = cbx.a;
                    cua cuaVar = cbx.b(x340Var).f;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    zvxVar = new zvx();
                    x340Var.r(false);
                }
                cbx.a.getClass();
                ecx ecxVarA = uwr.a();
                pux puxVarU = flo1.u(x340Var, n960Var2.b);
                qim0 qim0Var2 = nim0.a;
                qim0 qim0VarF2 = u291.f(qim0Var2, 0.55f);
                gra graVar = een.i;
                h2c h2cVar = h2c.a;
                qim0 qim0VarThen = h2cVar.a(qim0VarF2, graVar).then(z ? i1p1.q(qim0Var2, er31.a) : qim0Var2);
                isl islVar = isl.a;
                eso1.e(uri, islVar, qim0VarThen, (p3v) null, zvxVar, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, puxVarU, false, false, x340Var, 1073744944, 0, 3520);
                Uri uri2 = Uri.parse(n960Var.a);
                if (z) {
                    x340Var.i0(-1153728680);
                } else {
                    x340Var.i0(-868500180);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var).f;
                    cua cuaVar4 = cbx.b(x340Var).f;
                    zvxVar2 = new zvx();
                }
                x340Var.r(false);
                zvx zvxVar3 = zvxVar2;
                ecx ecxVarA2 = uwr.a();
                pux puxVarU2 = flo1.u(x340Var, i2);
                qim0 qim0VarA = h2cVar.a(u291.f(qim0Var2, 0.55f), een.g);
                if (z) {
                    qim0VarA = qim0VarA.then(i1p1.q(qim0Var2, er31.a));
                }
                eso1.e(uri2, islVar, qim0VarA, (p3v) null, zvxVar3, ecxVarA2, (j6m) null, (tl3) null, (ColorFilter) null, puxVarU2, false, false, x340Var, 1073744944, 0, 3520);
                x340Var = x340Var;
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new suq0(n960Var, n960Var2, qim0Var, i, (byte) 1);
            }
        }

        public static final void i(qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1481395819);
            int i2 = i | 6;
            if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                nyx.a(1, (wux) null, apo.r(-1900549470, new xgr0((byte) 19, 2, false), x340Var), x340Var, 3078, 6);
                qim0Var = nim0.a;
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new nws0(qim0Var, i, (byte) 6);
            }
        }

        public static final String j(String str) {
            return f4i1.f("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '", str, "', but not both.");
        }

        public static final hux k(qo90 qo90Var) {
            f0u f0uVarB = kr90.b(qo90Var.e.c);
            lp90 lp90Var = qo90Var.e;
            return sqe.t(f0uVarB, lp90Var.e, kr90.a(lp90Var.c));
        }

        public static final boolean l(qo90 qo90Var) {
            no90 no90Var = (no90) o7h.s0(qo90Var.f);
            if (no90Var != null) {
                return no90Var.b.a;
            }
            return false;
        }

        public static final Object m(Object obj) {
            return obj instanceof i980 ? new j980((i980) obj) : obj;
        }

        public static egg1 n(i4e1 i4e1Var, uwg uwgVar, y061 y061Var) {
            h4u h4uVar = new h4u();
            h4e1 h4e1Var = new h4e1(i4e1Var, (xid) null, (i4e1) null, h4uVar, 6);
            uwgVar.getClass();
            int length = h4e1Var.c.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                h4e1Var.k(i, i2, "•");
                i = i2;
            }
            if (((bfn0) h4e1Var.c().b).c == 0) {
                return null;
            }
            long jZ = z(i4e1Var.e, h4uVar, y061Var);
            nbe1 nbe1Var = i4e1Var.f;
            return new egg1(h4e1.q(h4e1Var, jZ, nbe1Var != null ? new nbe1(z(nbe1Var.a, h4uVar, y061Var)) : null, 4), h4uVar);
        }

        public static wzf0 o(View view) {
            Object tag = view.getTag(2131429884);
            rzf0 rzf0Var = tag instanceof rzf0 ? (rzf0) tag : null;
            if (rzf0Var != null) {
                return new wzf0(view, rzf0Var.a());
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    childAt.getClass();
                    wzf0 wzf0VarO = o(childAt);
                    if (wzf0VarO != null) {
                        return wzf0VarO;
                    }
                }
            }
            return null;
        }

        public static final b180 p() {
            b180 b180Var = h;
            if (b180Var != null) {
                return b180Var;
            }
            a180 a180Var = new a180("Encore.Vector.GroupActive24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = bui1.a;
            n6a1 n6a1Var = new n6a1(u7h.b);
            cwh0 cwh0VarQ = rjx.q(16.004f, 19.153f, -2.0f, -1.153f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.268f, -1.506f);
            cwh0VarQ.k(0.347f, -0.417f);
            cwh0VarQ.g(0.624f, -0.697f, 1.0f, -1.581f, 1.071f, -2.515f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, -0.159f, -1.406f);
            cwh0VarQ.c(3.1f, 3.1f, false, false, -0.651f, -1.125f);
            cwh0VarQ.c(3.177f, 3.177f, false, false, -4.687f, 0.0f);
            cwh0VarQ.c(3.15f, 3.15f, false, false, -0.652f, 1.125f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, -0.159f, 1.406f);
            cwh0VarQ.g(0.07f, 0.934f, 0.447f, 1.818f, 1.071f, 2.515f);
            cwh0VarQ.k(0.348f, 0.417f);
            cwh0VarQ.b(1.0f, 1.0f, false, true, 9.996f, 18.0f);
            cwh0VarQ.k(-2.0f, 1.153f);
            cwh0VarQ.c(4.0f, 4.0f, false, false, -2.0f, 3.464f);
            cwh0VarQ.v(0.051f);
            cwh0VarQ.i(12.0f);
            cwh0VarQ.v(-0.05f);
            cwh0VarQ.c(4.0f, 4.0f, false, false, -1.992f, -3.465f);
            cwh0VarQ.m(-9.151f, -5.472f);
            cwh0VarQ.c(6.2f, 6.2f, false, true, 0.262f, -2.168f);
            cwh0VarQ.c(5.2f, 5.2f, false, true, 0.845f, -1.557f);
            cwh0VarQ.c(0.992f, 0.992f, false, true, -0.22f, -1.462f);
            cwh0VarQ.k(0.347f, -0.417f);
            cwh0VarQ.g(0.624f, -0.697f, 1.0f, -1.581f, 1.071f, -2.515f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, -0.159f, -1.406f);
            cwh0VarQ.c(3.1f, 3.1f, false, false, -0.651f, -1.125f);
            cwh0VarQ.c(3.18f, 3.18f, false, false, -4.687f, 0.0f);
            cwh0VarQ.c(3.15f, 3.15f, false, false, -0.652f, 1.125f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, -0.159f, 1.406f);
            cwh0VarQ.g(0.07f, 0.934f, 0.447f, 1.818f, 1.071f, 2.515f);
            cwh0VarQ.k(0.348f, 0.417f);
            cwh0VarQ.b(1.0f, 1.0f, false, true, 4.0f, 10.0f);
            cwh0VarQ.k(-2.0f, 1.153f);
            cwh0VarQ.c(4.0f, 4.0f, false, false, -2.0f, 3.464f);
            cwh0VarQ.v(0.051f);
            cwh0VarQ.i(6.993f);
            cwh0VarQ.c(6.0f, 6.0f, false, true, -0.14f, -0.987f);
            cwh0VarQ.m(15.151f, -2.528f);
            cwh0VarQ.k(-2.0f, -1.153f);
            cwh0VarQ.c(1.0f, 1.0f, false, true, -0.268f, -1.506f);
            cwh0VarQ.k(0.347f, -0.417f);
            cwh0VarQ.g(0.624f, -0.697f, 1.0f, -1.581f, 1.071f, -2.515f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, -0.159f, -1.406f);
            cwh0VarQ.c(3.1f, 3.1f, false, false, -0.651f, -1.125f);
            cwh0VarQ.c(3.18f, 3.18f, false, false, -4.687f, 0.0f);
            cwh0VarQ.c(3.15f, 3.15f, false, false, -0.652f, 1.125f);
            cwh0VarQ.c(4.2f, 4.2f, false, false, -0.159f, 1.406f);
            cwh0VarQ.g(0.07f, 0.934f, 0.447f, 1.818f, 1.071f, 2.515f);
            cwh0VarQ.k(0.348f, 0.417f);
            cwh0VarQ.c(0.993f, 0.993f, false, true, -0.221f, 1.462f);
            cwh0VarQ.g(0.368f, 0.468f, 0.654f, 0.994f, 0.845f, 1.557f);
            cwh0VarQ.g(0.217f, 0.701f, 0.305f, 1.435f, 0.262f, 2.168f);
            cwh0VarQ.o(-0.03f, 0.5f, -0.143f, 0.987f);
            cwh0VarQ.h(24.0f);
            cwh0VarQ.v(-0.05f);
            cwh0VarQ.c(4.0f, 4.0f, false, false, -1.996f, -3.465f);
            a180.a(a180Var, cwh0VarQ.a, n6a1Var, 1.0f, 2, 1.0f);
            b180 b180VarB = a180Var.b();
            h = b180VarB;
            return b180VarB;
        }

        public static void q(Activity activity) {
            c8o.j(activity, "activity");
            lt50 application = activity.getApplication();
            if (application instanceof lt50) {
                u(activity, application);
            } else {
                jah.g(xcg1.i(application.getClass().getCanonicalName(), " does not implement ", lt50.class.getCanonicalName()));
            }
        }

        public static void r(Service service) {
            lt50 application = service.getApplication();
            if (application instanceof lt50) {
                u(service, application);
            } else {
                jah.g(xcg1.i(application.getClass().getCanonicalName(), " does not implement ", lt50.class.getCanonicalName()));
            }
        }

        public static void s(BroadcastReceiver broadcastReceiver, Context context) {
            c8o.j(broadcastReceiver, "broadcastReceiver");
            c8o.j(context, "context");
            lt50 lt50Var = (Application) context.getApplicationContext();
            if (lt50Var instanceof lt50) {
                u(broadcastReceiver, lt50Var);
            } else {
                jah.g(xcg1.i(lt50Var.getClass().getCanonicalName(), " does not implement ", lt50.class.getCanonicalName()));
            }
        }

        public static void t(ContentProvider contentProvider) {
            lt50 lt50Var = (Application) contentProvider.getContext().getApplicationContext();
            if (lt50Var instanceof lt50) {
                u(contentProvider, lt50Var);
            } else {
                jah.g(xcg1.i(lt50Var.getClass().getCanonicalName(), " does not implement ", lt50.class.getCanonicalName()));
            }
        }

        public static void u(Object obj, lt50 lt50Var) {
            jgu jguVarF = lt50Var.f();
            c8o.k(jguVarF, "%s.androidInjector() returned null", lt50Var.getClass());
            jguVarF.w(obj);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object v(d0r d0rVar, o3r o3rVar, a1e1 a1e1Var, onm onmVar) {
            i1e1 i1e1Var;
            if (onmVar instanceof i1e1) {
                i1e1Var = (i1e1) onmVar;
                int i = i1e1Var.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    i1e1Var.b = i - Integer.MIN_VALUE;
                } else {
                    i1e1Var = new i1e1(onmVar);
                }
            } else {
                i1e1Var = new i1e1(onmVar);
            }
            Object objJ = i1e1Var.a;
            int i2 = i1e1Var.b;
            if (i2 == 0) {
                hm5.M(objJ);
                ay8 ay8VarF = d3p1.F(d0rVar, o3rVar, a1e1Var);
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 5);
                i1e1Var.b = 1;
                objJ = b5p1.j(ay8VarF, q1c1Var, i1e1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            i1r i1rVar = (k1r) objJ;
            if (u890.j(i1rVar, j1r.a) || (i1rVar instanceof h1r)) {
                return null;
            }
            if (i1rVar instanceof i1r) {
                return (t1e1) i1rVar.a;
            }
            eg.o();
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object w(d0r d0rVar, dc31 dc31Var, k1e1 k1e1Var, onm onmVar) throws Throwable {
            h1e1 h1e1Var;
            d0r d0rVar2;
            t1e1 t1e1Var;
            Throwable th;
            k1e1 k1e1Var2;
            llg m231Var;
            Throwable thA;
            llg llgVar;
            io70 io70Var;
            Object objV;
            llg llgVar2;
            t1e1 t1e1Var2;
            if (onmVar instanceof h1e1) {
                h1e1Var = (h1e1) onmVar;
                int i = h1e1Var.g;
                if ((i & Integer.MIN_VALUE) != 0) {
                    h1e1Var.g = i - Integer.MIN_VALUE;
                } else {
                    h1e1Var = new h1e1(onmVar);
                }
            } else {
                h1e1Var = new h1e1(onmVar);
            }
            Object objV2 = h1e1Var.f;
            int i2 = h1e1Var.g;
            d9n d9nVar = d9n.a;
            if (i2 == 0) {
                hm5.M(objV2);
                o3r o3rVar = v1e1.g;
                a1e1 a1e1Var = k1e1Var.a;
                h1e1Var.a = d0rVar;
                h1e1Var.b = dc31Var;
                h1e1Var.c = k1e1Var;
                h1e1Var.g = 1;
                objV2 = v(d0rVar, o3rVar, a1e1Var, h1e1Var);
                if (objV2 != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                k1e1Var = h1e1Var.c;
                dc31Var = h1e1Var.b;
                d0rVar = h1e1Var.a;
                hm5.M(objV2);
            } else {
                if (i2 == 2) {
                    t1e1Var = h1e1Var.d;
                    k1e1Var2 = h1e1Var.c;
                    d0rVar2 = h1e1Var.a;
                    try {
                        hm5.M(objV2);
                        m231Var = (llg) objV2;
                    } catch (Throwable th2) {
                        th = th2;
                        m231Var = new m231(th);
                    }
                    thA = e331.a(m231Var);
                    if (thA == null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                        throw thA;
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    llgVar = m231Var;
                    if (llgVar != null && (io70Var = t1e1Var.a.e) != null) {
                        String str = io70Var.b;
                        o3r o3rVar2 = v1e1.g;
                        a1e1 a1e1Var2 = k1e1Var2.a;
                        a1e1 a1e1Var3 = new a1e1(str, a1e1Var2.b, a1e1Var2.c);
                        h1e1Var.a = null;
                        h1e1Var.b = null;
                        h1e1Var.c = null;
                        h1e1Var.d = null;
                        h1e1Var.e = llgVar;
                        h1e1Var.g = 3;
                        objV = v(d0rVar2, o3rVar2, a1e1Var3, h1e1Var);
                        if (objV != d9nVar) {
                            objV2 = objV;
                            llgVar2 = llgVar;
                        }
                        return d9nVar;
                    }
                    return l1e1.a;
                }
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                llgVar2 = h1e1Var.e;
                hm5.M(objV2);
            }
            t1e1Var2 = (t1e1) objV2;
            if (t1e1Var2 != null) {
                return new m1e1(t1e1Var2, llgVar2);
            }
            return l1e1.a;
            t1e1 t1e1Var3 = (t1e1) objV2;
            if (t1e1Var3 != null) {
                String str2 = k1e1Var.a.a;
                Set set = s4b1.f;
                if (!uic.g(str2, blc0.M3)) {
                    return new m1e1(t1e1Var3, null);
                }
                try {
                    String str3 = k1e1Var.a.a;
                    h1e1Var.a = d0rVar;
                    h1e1Var.b = null;
                    h1e1Var.c = k1e1Var;
                    h1e1Var.d = t1e1Var3;
                    h1e1Var.g = 2;
                    Object objN = dc31Var.n(str3, h1e1Var);
                    if (objN != d9nVar) {
                        k1e1 k1e1Var3 = k1e1Var;
                        d0rVar2 = d0rVar;
                        t1e1Var = t1e1Var3;
                        objV2 = objN;
                        k1e1Var2 = k1e1Var3;
                        m231Var = (llg) objV2;
                        thA = e331.a(m231Var);
                        if (thA == null) {
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        llgVar = m231Var;
                        if (llgVar != null) {
                            String str4 = io70Var.b;
                            o3r o3rVar3 = v1e1.g;
                            a1e1 a1e1Var4 = k1e1Var2.a;
                            a1e1 a1e1Var5 = new a1e1(str4, a1e1Var4.b, a1e1Var4.c);
                            h1e1Var.a = null;
                            h1e1Var.b = null;
                            h1e1Var.c = null;
                            h1e1Var.d = null;
                            h1e1Var.e = llgVar;
                            h1e1Var.g = 3;
                            objV = v(d0rVar2, o3rVar3, a1e1Var5, h1e1Var);
                            if (objV != d9nVar) {
                                objV2 = objV;
                                llgVar2 = llgVar;
                                t1e1Var2 = (t1e1) objV2;
                                if (t1e1Var2 != null) {
                                    return new m1e1(t1e1Var2, llgVar2);
                                }
                            }
                        }
                    }
                } catch (Throwable th3) {
                    k1e1 k1e1Var4 = k1e1Var;
                    d0rVar2 = d0rVar;
                    t1e1Var = t1e1Var3;
                    th = th3;
                    k1e1Var2 = k1e1Var4;
                    m231Var = new m231(th);
                }
                return d9nVar;
            }
            return l1e1.a;
        }

        public static final long x(zzy zzyVar) {
            if (zzyVar.equals(yzy.b) || zzyVar.equals(xzy.b)) {
                uwr uwrVar = cbx.a;
                return ((xex) ((gmt) zex.a.c).b).z;
            }
            if (zzyVar.equals(uzy.b) || zzyVar.equals(vzy.b)) {
                uwr uwrVar2 = cbx.a;
                return ((wex) ((gmt) zex.a.c).c).d;
            }
            eg.o();
            return 0L;
        }

        public static long y(long j, h4u h4uVar) {
            int i = nbe1.c;
            long jC = h4uVar.c((int) (j >> 32), false);
            long jC2 = nbe1.d(j) ? jC : h4uVar.c((int) (4294967295L & j), false);
            int iMin = Math.min(nbe1.g(jC), nbe1.g(jC2));
            int iMax = Math.max(nbe1.f(jC), nbe1.f(jC2));
            return nbe1.h(j) ? e6p1.e(iMax, iMin) : e6p1.e(iMin, iMax);
        }

        public static long z(long j, h4u h4uVar, y061 y061Var) {
            long jE;
            int i = nbe1.c;
            long jC = h4uVar.c((int) (j >> 32), true);
            long jC2 = nbe1.d(j) ? jC : h4uVar.c((int) (j & 4294967295L), true);
            int i2 = 0;
            int i3 = y061Var != null ? y061Var.a : 0;
            if (nbe1.d(j)) {
                i2 = i3;
            } else if (y061Var != null) {
                i2 = y061Var.b;
            }
            if (i3 != 0 && !nbe1.d(jC)) {
                int iC = l1d.C(i3);
                if (iC == 0) {
                    int i4 = (int) (jC >> 32);
                    jC = e6p1.e(i4, i4);
                } else {
                    if (iC != 1) {
                        eg.o();
                        return 0L;
                    }
                    int i5 = (int) (jC & 4294967295L);
                    jC = e6p1.e(i5, i5);
                }
            }
            if (i2 != 0 && !nbe1.d(jC2)) {
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    int i6 = (int) (jC2 >> 32);
                    jE = e6p1.e(i6, i6);
                } else {
                    if (iC2 != 1) {
                        eg.o();
                        return 0L;
                    }
                    int i7 = (int) (jC2 & 4294967295L);
                    jE = e6p1.e(i7, i7);
                }
                jC2 = jE;
            }
            int iMin = Math.min(nbe1.g(jC), nbe1.g(jC2));
            int iMax = Math.max(nbe1.f(jC), nbe1.f(jC2));
            return nbe1.h(j) ? e6p1.e(iMax, iMin) : e6p1.e(iMin, iMax);
        }
    }
