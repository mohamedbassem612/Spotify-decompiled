package p;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class adg {
    public static final se11 a = new se11("\\(?\\[([^\\]]+)\\]\\(([^)]+)\\)\\)?");

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        String str2;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-953771011);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (x340Var.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = bin.x(dug.f(qim0Var, cbx.a(x340Var).a.b.a(), er31.b(3.0f)), false, (String) null, (pm31) null, (idn0) null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 4.0f, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 4);
        }
    }

    public static final ArrayList b(String str) {
        List<String> listX;
        List<String> listX2;
        ArrayList arrayList = new ArrayList();
        nh40 nh40Var = new nh40(se11.b(a, str));
        int iEnd = 0;
        int i = 0;
        int i2 = 0;
        while (nh40Var.hasNext()) {
            mbh0 mbh0Var = (mbh0) nh40Var.next();
            String string = ihc1.e1(str.substring(i, ((rr80) mbh0Var.b()).a)).toString();
            if (!ihc1.y0(string)) {
                Pattern patternCompile = Pattern.compile("\\s+");
                ihc1.N0(0);
                Matcher matcher = patternCompile.matcher(string);
                if (matcher.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iEnd2 = 0;
                    do {
                        arrayList2.add(string.subSequence(iEnd2, matcher.start()).toString());
                        iEnd2 = matcher.end();
                    } while (matcher.find());
                    arrayList2.add(string.subSequence(iEnd2, string.length()).toString());
                    listX2 = arrayList2;
                } else {
                    listX2 = k4p1.x(string.toString());
                }
                for (String str2 : listX2) {
                    if (!ihc1.y0(str2)) {
                        arrayList.add(new qju(str2));
                    }
                }
            }
            arrayList.add(new pju(i2, (String) mbh0Var.a().get(1), (String) mbh0Var.a().get(2)));
            i2++;
            i = ((rr80) mbh0Var.b()).b + 1;
        }
        if (i < str.length()) {
            String string2 = ihc1.e1(str.substring(i)).toString();
            if (!ihc1.y0(string2)) {
                Pattern patternCompile2 = Pattern.compile("\\s+");
                ihc1.N0(0);
                Matcher matcher2 = patternCompile2.matcher(string2);
                if (matcher2.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    do {
                        arrayList3.add(string2.subSequence(iEnd, matcher2.start()).toString());
                        iEnd = matcher2.end();
                    } while (matcher2.find());
                    arrayList3.add(string2.subSequence(iEnd, string2.length()).toString());
                    listX = arrayList3;
                } else {
                    listX = k4p1.x(string2.toString());
                }
                for (String str3 : listX) {
                    if (!ihc1.y0(str3)) {
                        arrayList.add(new qju(str3));
                    }
                }
            }
        }
        return arrayList;
    }
}
