package p;

import android.content.Intent;
import android.content.res.Configuration;
import android.icu.text.DateFormat;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.model.command.options.LoggingParams;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tgp1 {
    public static owo1 a;
    public static b180 b;
    public static b180 c;
    public static volatile dk30 d;

    public static final void a(String str, j2i j2iVar, Function0 function0, Function0 function1, iu30 iu30Var, Integer num, b0k b0kVar, int i, int i2) {
        int i3;
        Integer num2;
        x340 x340Var;
        Integer num3;
        String strK;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1637689346);
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.g("https://support.spotify.com/article/age-restricted-content-age-check/") ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 131072 : 65536;
        }
        int i4 = 1572864 & i;
        nim0 nim0Var = nim0.a;
        if (i4 == 0) {
            i3 |= x340Var2.i(nim0Var) ? 1048576 : 524288;
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
            num2 = num;
        } else {
            num2 = num;
            if ((i & 12582912) == 0) {
                i3 |= x340Var2.g(num2) ? 8388608 : 4194304;
            }
        }
        if (x340Var2.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            if (i5 != 0) {
                num2 = null;
            }
            qim0 qim0VarL = bmq0.L(u291.f(nim0Var, 1.0f), k1o1.q(x340Var2), (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarL);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarP, cbx.b(x340Var2).b.a, 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                p();
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
            j2iVar.invoke(pbh.a, x340Var2, Integer.valueOf((i3 & 112) | 6));
            long j = cbx.a(x340Var2).b.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            int i6 = i3;
            Integer num4 = num2;
            uwo1.e(str, qim0VarB, lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i6 & 14, 0, 2016);
            if (num4 != null) {
                x340Var2.i0(192719126);
                strK = cwl1.n0(2131952032, new Object[]{num4}, x340Var2);
                x340Var2.r(false);
            } else {
                strK = x0d.k(x340Var2, 192823255, 2131952031, x340Var2, false);
            }
            uwo1.e(strK, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.b, 7), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2016);
            idx idxVar = new idx(4);
            boolean z = (i6 & 896) == 256;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new y1(function0, (byte) 22);
                x340Var2.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            foo1.c(gbxVar, idxVar, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, null, null, null, null, f5i.a, null, apo.r(1966834025, new mb2(num4, (byte) 0), x340Var2), x340Var2, 805306368, 48, 1528);
            ldx ldxVar = ldx.c;
            boolean z2 = (i6 & 7168) == 2048;
            Object objT2 = x340Var2.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new y1(function1, (byte) 23);
                x340Var2.s0(objT2);
            }
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            foo1.c(gbxVar2, ldxVar, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), null, null, null, null, null, null, null, f5i.b, x340Var2, 0, 48, 2040);
            String strO0 = cwl1.o0(x340Var2, 2131952037);
            String strN0 = cwl1.n0(2131952036, new Object[]{strO0}, x340Var2);
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            int length = strO0.length() + iW0;
            ye5 ye5Var = new ye5();
            ye5Var.f(strN0.subSequence(0, iW0));
            vhg.c(ye5Var, strO0, "https://support.spotify.com/article/age-restricted-content-age-check/", vhg.a, iu30Var);
            ye5Var.f(strN0.subSequence(length, strN0.length()));
            uwo1.d(ye5Var.p(), cbx.a(x340Var2).b.b, null, cbx.d(x340Var2).j, new a0e1(3), null, 0, false, null, 0, null, null, x340Var2, 0, 0, 4068);
            x340Var = x340Var2;
            x340Var.r(true);
            num3 = num4;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            num3 = num2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nb2(str, j2iVar, function0, function1, iu30Var, num3, i, i2);
        }
    }

    public static final void b(String str, long j, String str2, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1346629100);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarX = bin.x(uyn1.w(qim0Var, gto1.p(1, x340Var, 3)), false, null, null, null, function0, 15);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                p();
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
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            wsx wsxVar = wsx.c;
            qim0 qim0VarR = u291.r(nim0Var, 56.0f);
            uwr uwrVar = cbx.a;
            w0h1.a(wsxVar, isl.a, uyn1.x(dug.f(qim0VarR, cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 13.0f), j, 0L, false, x340Var, wsx.d | 48 | ((i2 << 6) & 7168), 48);
            uwo1.e(str, uyn1.B(nim0Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
            x340Var = x340Var;
            x340Var.r(true);
            if (ihc1.y0(str2)) {
                x340Var.i0(-508970312);
                x340Var.r(false);
            } else {
                x340Var.i0(-509153088);
                uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, (i2 >> 6) & 14, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rb9(str, j, str2, qim0Var, function0, i);
        }
    }

    public static final void c(lzn0 lzn0Var, kat katVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1720390137);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(lzn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(katVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            irn1.u(null, aji.a, null, null, apo.r(-1150849664, new e6j(katVar, lzn0Var), x340Var), x340Var, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(lzn0Var, katVar, qim0Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    public static final void d(int i, long j, b0k b0kVar, vu30 vu30Var, x291 x291Var) {
        ?? r6;
        List listSingletonList;
        ?? SingletonList;
        x291 x291Var2 = x291Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1526030150);
        vu30 vu30Var2 = vu30Var;
        int i2 = i | (x340Var.g(x291Var2) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(vu30Var2) ? 256 : 128);
        if ((i2 & 147) == 146 && x340Var.H()) {
            x340Var.b0();
        } else {
            if (x291Var2 instanceof w291) {
                x340Var.j0(-1173540356);
                x340Var.r(false);
                listSingletonList = Collections.singletonList(new s3v(j));
            } else {
                if (!(x291Var2 instanceof v291)) {
                    x340Var.j0(-1173645715);
                    x340Var.r(false);
                    eg.o();
                    return;
                }
                x340Var.j0(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    x340Var.j0(-2019914396);
                    Bundle bundle = (Bundle) x340Var.k(q4k.a);
                    x340Var.j0(-1173535336);
                    boolean zF = x340Var.f(j);
                    Object objT = x340Var.T();
                    if (zF || objT == fkj0.X) {
                        objT = new mvc((byte) 2, j);
                        x340Var.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    x340Var.r(false);
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i3 = bundle.getInt("appWidgetMinHeight", 0);
                        int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i5 = bundle.getInt("appWidgetMinWidth", 0);
                        int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                        SingletonList = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? Collections.singletonList(function0.invoke()) : p7h.M(new s3v[]{new s3v(jhc1.c(i5, i4)), new s3v(jhc1.c(i6, i3))});
                    } else {
                        SingletonList = new ArrayList(q7h.U(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            SingletonList.add(new s3v(jhc1.c(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    x340Var.r(false);
                    r6 = SingletonList;
                } else {
                    x340Var.j0(-2019826759);
                    Bundle bundle2 = (Bundle) x340Var.k(q4k.a);
                    int i7 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i8 = bundle2.getInt("appWidgetMaxWidth", 0);
                    s3v s3vVar = null;
                    s3v s3vVar2 = (i7 == 0 || i8 == 0) ? null : new s3v(jhc1.c(i8, i7));
                    int i9 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i10 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i9 != 0 && i10 != 0) {
                        s3vVar = new s3v(jhc1.c(i10, i9));
                    }
                    List listI0 = f46.i0(new s3v[]{s3vVar2, s3vVar});
                    if (listI0.isEmpty()) {
                        listI0 = Collections.singletonList(new s3v(j));
                    }
                    x340Var.r(false);
                    r6 = listI0;
                }
                x340Var.r(false);
                listSingletonList = (Collection) r6;
            }
            List listJ0 = o7h.j0(listSingletonList);
            ArrayList arrayList = new ArrayList(q7h.U(listJ0, 10));
            Iterator it = listJ0.iterator();
            while (it.hasNext()) {
                e(((i2 << 3) & 112) | (i2 & 896), ((s3v) it.next()).a, x340Var, vu30Var2, x291Var2);
                arrayList.add(rih1.a);
                vu30Var2 = vu30Var;
                x291Var2 = x291Var;
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q291(i, j, vu30Var, x291Var);
        }
    }

    public static final void e(int i, long j, b0k b0kVar, vu30 vu30Var, x291 x291Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-53921383);
        int i2 = (x340Var.f(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            int i3 = i & 64;
            i2 |= x340Var.g(x291Var) ? 32 : 16;
        }
        if (((i2 | (x340Var.g(vu30Var) ? 256 : 128)) & 147) == 146 && x340Var.H()) {
            x340Var.b0();
        } else {
            mod.c(new ely0[]{p4k.a.a(new s3v(j))}, apo.i(x340Var, -1209815847, new q291(vu30Var, j, x291Var)), x340Var, 48);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new md60(i, j, vu30Var, x291Var);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1509043197);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("timeline-end", qim0Var3), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, 0.0f, 10);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                p();
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
            b2 = 3;
            uwo1.e(cwl1.o0(x340Var, 2131963216), null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            String strO0 = cwl1.o0(x340Var, 2131963208);
            lee1 lee1Var = cbx.d(x340Var).g;
            long j = cbx.a(x340Var).b.b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(qim0Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var2, i, b2);
        }
    }

    public static final void g(px2 px2Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(599477990);
        int i2 = (x340Var.i(px2Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarG = rwq.g(px2Var.d, px2Var.a((String) px2Var.b.getValue(), (Locale) px2Var.c.getValue()), null, x340Var, 0, 2);
            Locale locale = ((ox2) ven0VarG.getValue()).b;
            qim0 qim0Var3 = nim0.a;
            if (locale == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xok1(px2Var, qim0Var3, i, (byte) 2);
                    return;
                }
                return;
            }
            if (((ox2) ven0VarG.getValue()).a.size() < 2) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new xok1(px2Var, qim0Var3, i, (byte) 0);
                    return;
                }
                return;
            }
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Locale locale2 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
            locale2.getClass();
            String strN0 = cwl1.n0(2131962204, new Object[]{i(locale, locale2)}, x340Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (x340Var.a == null) {
                p();
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
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new mek1(ven0Var, (byte) 1);
                x340Var.s0(objT2);
            }
            poo1.f(new gbx(new y50(strN0), (Function0) objT2), mex.b, yoo1.z(x340Var), anm1.N("voice_language_chip", qim0Var3), strN0, null, jrj.a, null, null, null, apo.r(1938102534, new fak1(locale, (byte) 2), x340Var), x340Var, 12585984, 384, 3904);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new mek1(ven0Var, (byte) 2);
                x340Var.s0(objT3);
            }
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            b2 = 1;
            gt4.a(zBooleanValue, (Function0) objT3, (qim0) null, 0L, (es41) null, (nfv0) null, er31.b(6.0f), cbx.a(x340Var).a.a.a(), 0.0f, apo.r(-1982616111, new kj21(ven0VarG, ven0Var, px2Var, locale2, (byte) 21), x340Var), x340Var, 0, 1852);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new xok1(px2Var, qim0Var2, i, b2);
        }
    }

    public static final int h(long j, long j2) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return (int) ChronoUnit.DAYS.between(Instant.ofEpochMilli(Math.min(j, j2)).atZone(zoneIdSystemDefault).toLocalDate(), Instant.ofEpochMilli(Math.max(j, j2)).atZone(zoneIdSystemDefault).toLocalDate());
    }

    public static final String i(Locale locale, Locale locale2) {
        String displayLanguage = locale.getDisplayLanguage(locale2);
        if (displayLanguage.length() <= 0) {
            return displayLanguage;
        }
        return ((Object) eth.U(displayLanguage.charAt(0), locale2)) + displayLanguage.substring(1);
    }

    public static String j(String... strArr) {
        String str;
        String string;
        int length = strArr.length;
        int i = 0;
        while (true) {
            str = null;
            if (i < length) {
                String str2 = strArr[i];
                if (str2 != null && (string = ihc1.e1(str2).toString()) != null && string.length() > 0) {
                    str = string;
                }
                if (str != null) {
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return str;
    }

    public static final int k(b0k b0kVar) {
        b0kVar.getClass();
        return Long.hashCode(((x340) b0kVar).T);
    }

    public static final long l(b0k b0kVar) {
        return ((x340) b0kVar).T;
    }

    public static final h311 m(b0k b0kVar) {
        h311 h311VarD = ((x340) b0kVar).D();
        if (h311VarD != null) {
            h311VarD.b |= 1;
            return h311VarD;
        }
        eg.m("no recompose scope found");
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0273  */
    public static final c9 n(jmb1 jmb1Var, yqg yqgVar, b0k b0kVar) throws NoWhenBranchMatchedException {
        x9w0 x9w0Var;
        x9w0 x9w0Var2;
        x9w0 x9w0Var3;
        x9w0 x9w0Var4;
        x9w0 x9w0Var5;
        c9 c9Var;
        x9w0 x9w0Var6;
        x9w0 x9w0Var7;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1747167995);
        bv11 bv11Var = jmb1Var.b;
        c380 c380Var = bv11Var.w;
        if (c380Var.isEmpty()) {
            x340Var.i0(827294173);
            x340Var.r(false);
            bul bulVar = bv11Var.s;
            if (bulVar != null) {
                String str = bulVar.a;
                if (ihc1.y0(str)) {
                    x9w0Var = null;
                } else {
                    x9w0Var = new x9w0(6, str, null, false);
                }
            } else {
                x9w0Var = null;
            }
            ati1 ati1Var = bv11Var.v;
            if (ati1Var != null) {
                String str2 = ati1Var.a;
                if (ihc1.y0(str2)) {
                    x9w0Var2 = null;
                } else {
                    x9w0Var2 = new x9w0(2, str2, null, true);
                }
            } else {
                x9w0Var2 = null;
            }
            msv0 msv0Var = bv11Var.u;
            if (msv0Var == null) {
                x340Var.i0(827508196);
                x340Var.r(false);
                x9w0Var3 = null;
            } else {
                x340Var.i0(303788477);
                long j = msv0Var.a;
                int iV = w3p1.v(j, yqgVar);
                int i = iV == 0 ? -1 : xlv0.a[l1d.C(iV)];
                if (i == 3) {
                    x340Var.i0(-620040828);
                    x9w0Var3 = new x9w0(xrx.c, cwl1.o0(x340Var, 2131961051), true);
                    x340Var.r(false);
                } else if (i == 4) {
                    x340Var.i0(-2041153969);
                    int iH = h(yqgVar.b(), j);
                    x9w0 x9w0Var8 = new x9w0(xrx.c, cwl1.U(2131820878, iH, new Object[]{Integer.valueOf(iH)}, x340Var), true);
                    x340Var.r(false);
                    x9w0Var3 = x9w0Var8;
                } else if (i != 5) {
                    x340Var.i0(-2040435886);
                    x340Var.r(false);
                    x9w0Var3 = null;
                } else {
                    x340Var.i0(-2040712250);
                    x9w0Var3 = new x9w0(xrx.c, cwl1.n0(2131961050, new Object[]{DateFormat.getPatternInstance("MMMd", new Locale(upn1.m())).format(new Date(j))}, x340Var), true);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            if (x9w0Var3 == null) {
                x340Var.i0(827617317);
                po11 po11Var = bv11Var.t;
                if (po11Var == null) {
                    x340Var.i0(827617316);
                    x340Var.r(false);
                    x9w0Var4 = null;
                } else {
                    x340Var.i0(303791997);
                    long j2 = po11Var.a;
                    int iV2 = w3p1.v(j2, yqgVar);
                    int i2 = iV2 == 0 ? -1 : xlv0.a[l1d.C(iV2)];
                    if (i2 != -1) {
                        if (i2 == 1) {
                            x340Var.i0(1589935152);
                            x9w0Var7 = new x9w0(6, cwl1.o0(x340Var, 2131961048), null, false);
                            x340Var.r(false);
                        } else if (i2 == 2) {
                            x340Var.i0(1589939309);
                            x9w0Var7 = new x9w0(6, cwl1.o0(x340Var, 2131961049), null, false);
                            x340Var.r(false);
                        } else if (i2 == 3) {
                            x340Var.i0(1589943500);
                            x9w0 x9w0Var9 = new x9w0(4, cwl1.o0(x340Var, 2131961053), xrx.c, false);
                            x340Var.r(false);
                            x9w0Var6 = x9w0Var9;
                        } else if (i2 == 4) {
                            x340Var.i0(2043803577);
                            int iH2 = h(yqgVar.b(), j2);
                            x9w0Var6 = new x9w0(4, cwl1.U(2131820879, iH2, new Object[]{Integer.valueOf(iH2)}, x340Var), xrx.c, false);
                            x340Var.r(false);
                        } else {
                            if (i2 != 5) {
                                throw p3d1.k(x340Var, 1589933800, false);
                            }
                            x340Var.i0(2044181374);
                            x9w0Var6 = new x9w0(4, cwl1.n0(2131961052, new Object[]{DateFormat.getPatternInstance("MMMd", new Locale(upn1.m())).format(new Date(j2))}, x340Var), xrx.c, false);
                            x340Var.r(false);
                        }
                        x9w0Var6 = x9w0Var7;
                    } else {
                        x340Var.i0(2044412571);
                        x340Var.r(false);
                        x9w0Var6 = null;
                    }
                    x340Var.r(false);
                    x9w0Var4 = x9w0Var6;
                }
                x340Var.r(false);
            } else {
                x340Var.i0(827646456);
                x340Var.r(false);
                x9w0Var4 = null;
            }
            wqo wqoVar = bv11Var.r;
            if (wqoVar != null) {
                String str3 = wqoVar.a;
                if (ihc1.y0(str3)) {
                    x9w0Var5 = null;
                } else {
                    x9w0Var5 = new x9w0(6, str3, null, false);
                }
            } else {
                x9w0Var5 = null;
            }
            boolean zG = x340Var.g(x9w0Var) | x340Var.g(x9w0Var2) | x340Var.g(x9w0Var3) | x340Var.g(x9w0Var4) | x340Var.g(x9w0Var5);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = mqo1.F(f46.i0(new x9w0[]{x9w0Var, x9w0Var2, x9w0Var3, x9w0Var4, x9w0Var5}));
                x340Var.s0(objT);
            }
            c9Var = (c9) objT;
        } else {
            x340Var.i0(827091402);
            boolean zW = hon1.w(jmb1Var.e);
            boolean zG2 = x340Var.g(c380Var) | x340Var.h(zW);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new x9w0(2, (String) it.next(), null, zW));
                }
                objT2 = mqo1.F(arrayList);
                x340Var.s0(objT2);
            }
            c9Var = (c9) objT2;
            x340Var.r(false);
        }
        x340Var.r(false);
        return c9Var;
    }

    public static String o() {
        return exp0.l;
    }

    public static final void p() {
        throw new IllegalStateException("Invalid applier");
    }

    public static boolean q(String str) {
        Boolean m231Var;
        try {
            Set set = s4b1.f;
            m231Var = Boolean.valueOf(uic.x(str).c == blc0.X4);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Boolean bool = Boolean.FALSE;
        if (m231Var instanceof m231) {
            m231Var = bool;
        }
        return m231Var.booleanValue();
    }

    public static String r(mq70 mq70Var) {
        String str;
        up70 up70VarA = mq70Var.a(vp70.e);
        if (up70VarA == null && (up70VarA = mq70Var.a(vp70.c)) == null) {
            up70VarA = (up70) o7h.s0(mq70Var.a);
        }
        if (up70VarA == null || (str = up70VarA.a.a) == null || ihc1.y0(str)) {
            return null;
        }
        return str;
    }

    public static final EsLoggingParams.LoggingParams s(LoggingParams loggingParams) {
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        if (loggingParams.commandInitiatedTime().c()) {
            qpz qpzVarP = EsOptional.OptionalInt64.p();
            qpzVarP.n(((Number) loggingParams.commandInitiatedTime().b()).longValue());
            cozVarR.s(qpzVarP.build());
        }
        if (loggingParams.pageInstanceId().c()) {
            cozVarR.q((String) loggingParams.pageInstanceId().b());
        }
        if (loggingParams.interactionId().c()) {
            cozVarR.n((String) loggingParams.interactionId().b());
        }
        if (loggingParams.commandId().c()) {
            cozVarR.r((String) loggingParams.commandId().b());
        }
        return cozVarR.build();
    }

    public static tpl0 t() {
        return new tpl0();
    }

    public static final v340 u(b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.e0(206, g0k.e);
        if (x340Var.S) {
            hf91.y(x340Var.I);
        }
        Object objL = x340Var.L();
        b440 jd31Var = objL instanceof b440 ? (b440) objL : null;
        if (jd31Var == null) {
            jd31Var = new jd31(new u340(new v340(x340Var, x340Var.T, x340Var.q, x340Var.C, x340Var.h.T0)), -1);
            x340Var.t0(jd31Var);
        }
        v340 v340Var = jd31Var.a.a;
        v340Var.g.setValue(x340Var.m());
        x340Var.r(false);
        return v340Var;
    }

    public static final String v(Intent intent) {
        String strZ;
        Set set = s4b1.f;
        String strO = uic.x(intent.getDataString()).o(2);
        if (strO != null && (strZ = uic.b(strO).z()) != null) {
            return strZ;
        }
        hhg1.n("Album ID is not defined.");
        return null;
    }

    public static final String w(Intent intent) {
        String strZ;
        Set set = s4b1.f;
        String strO = uic.x(intent.getDataString()).o(2);
        if (strO != null && (strZ = uic.c(strO).z()) != null) {
            return strZ;
        }
        hhg1.n("Artist ID is not defined.");
        return null;
    }

    public static final String x(Intent intent) {
        String strZ;
        Set set = s4b1.f;
        String strO = uic.x(intent.getDataString()).o(2);
        if (strO != null && (strZ = uic.y(strO).z()) != null) {
            return strZ;
        }
        hhg1.n("Playlist ID is not defined.");
        return null;
    }
}
