package p;

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
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class hw10 {
    public static final se11 a = new se11("https://[^\\s]+[^\\s.,;:!?)\\]}]");

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        Function0 function1;
        qim0 qim0Var2;
        boolean z;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(983413466);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | 48 | (x340Var2.g(str) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(uyn1.z(16.0f, 0.0f, 2, qim0VarF), 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.a, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            cnx cnxVar = cnx.c;
            long j = cbx.a(x340Var2).b.d;
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(cnxVar, isl.a, u291.r(qim0Var3, 24.0f), j, 0L, true, x340Var2, cnx.d | 196656, 16);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.h(qim0Var3, 8.0f));
            if (str == null || str.length() == 0) {
                x340Var2.i0(685083888);
                z = false;
                uwo1.e(cwl1.o0(x340Var2, 2131963066), (qim0) null, cbx.d(x340Var2).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var2.i0(684804795);
                FontFamily fontFamily = cbx.d(x340Var2).h.a.f;
                boolean z2 = (i2 & 896) == 256;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    StringBuilder sb = new StringBuilder(16);
                    ArrayList arrayListM = xvj1.m();
                    new ArrayList();
                    zma1 zma1Var = new zma1(0L, 0L, FontWeight.Z, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65499);
                    nh40 nh40Var = new nh40(se11.b(a, str));
                    int i3 = 0;
                    while (nh40Var.hasNext()) {
                        mbh0 mbh0Var = (mbh0) nh40Var.next();
                        sb.append(str.substring(i3, ((rr80) mbh0Var.b()).a));
                        String strGroup = mbh0Var.a.group();
                        int length = sb.length();
                        sb.append(strGroup);
                        arrayListM.add(new xe5(length, sb.length(), 8, new ljc0(strGroup, new pae1(zma1Var, (zma1) null, 14), new uhg(iu30Var, strGroup, (byte) 3)), (String) null));
                        i3 = ((rr80) mbh0Var.b()).b + 1;
                        zma1Var = zma1Var;
                    }
                    if (i3 < str.length()) {
                        sb.append(str.substring(i3));
                    }
                    String string = sb.toString();
                    ArrayList arrayList = new ArrayList(arrayListM.size());
                    int size = arrayListM.size();
                    for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                    }
                    objT = new af5(string, arrayList);
                    x340Var2.s0(objT);
                }
                uwr uwrVar2 = cbx.a;
                uwo1.f((af5) objT, (qim0) null, cbx.d(x340Var2).g, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4090);
                x340Var = x340Var2;
                x340Var.r(false);
                z = false;
            }
            cvx cvxVar3 = cbx.b(x340Var).b;
            String strG = ydh.g(16.0f, 2131963065, x340Var, x340Var, qim0Var3);
            boolean z3 = (i2 & 14) == 4 ? true : z;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                function1 = function0;
                objT2 = new in00(function1, (byte) 23);
                x340Var.s0(objT2);
            } else {
                function1 = function0;
            }
            Function0 function2 = (Function0) objT2;
            if (ihc1.y0(strG)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            x340 x340Var3 = x340Var;
            poo1.e(new gbx(new y50(strG), function2), pex.b, yoo1.z(x340Var), (qim0) null, 0, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-1907426645, new ps00(strG, (byte) 5), x340Var), x340Var3, 0, 3072, 8184);
            x340Var2 = x340Var3;
            x0d.s(qim0Var3, cbx.b(x340Var2).b.d, x340Var2, true);
            qim0Var2 = qim0Var3;
        } else {
            function1 = function0;
            x340Var2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new bqy(function1, qim0Var2, str, iu30Var, i);
        }
    }

    public static final void b(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-744846502);
        if ((i & 6) == 0) {
            i2 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (!x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var = x340Var2;
            x340Var.b0();
        } else if (z) {
            x340Var2.i0(-1920930604);
            String strO0 = cwl1.o0(x340Var2, 2131963072);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0Var, cbx.d(x340Var2).m, cbx.a(x340Var2).b.d, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, (i2 >> 3) & 112, 0, 2032);
            x340Var = x340Var2;
            x340Var.r(false);
        } else {
            x340Var = x340Var2;
            x340Var.i0(-1920714255);
            c((i2 >> 3) & 126, function0, x340Var, qim0Var);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj8(z, function0, qim0Var, i, (byte) 8);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1339289066);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131963067);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new in00(function0, (byte) 24);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                poo1.e(new gbx(new y50(strO0), function1), pex.b, yoo1.z(b0kVar3), qim0Var, 0, (String) null, (max) null, foi.a, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(-602561873, new ps00(strO0, (byte) 6), b0kVar3), b0kVar2, 12582912 | ((i2 << 6) & 7168), 3072, 8048);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 13);
        }
    }
}
