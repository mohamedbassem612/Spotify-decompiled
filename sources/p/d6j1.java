package p;

import com.spotify.base.java.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class d6j1 {
    public static final o6j1 a = new o6j1("", null, "", "", "", "", "", "", "#00000000", null, null, new lsm0("", new ksm0(fec1.c, (String) null, (String) null, "vertical-video-card", (String) null, (String) null, 502), true, false, new jsm0(0L, 0L), 0, (ism0) null, (String) null, false, 0, 2024), false, "", null, "");

    public static final o6j1 a(n6j1 n6j1Var, u810 u810Var) {
        int i;
        String str = n6j1Var.h;
        String str2 = n6j1Var.c;
        String str3 = n6j1Var.e;
        String str4 = n6j1Var.a;
        if (u810Var == null) {
            o6j1 o6j1Var = a;
            return new o6j1(str4, o6j1Var.b, str2, o6j1Var.d, o6j1Var.e, o6j1Var.f, o6j1Var.g, o6j1Var.h, o6j1Var.i, o6j1Var.j, o6j1Var.k, o6j1Var.l, o6j1Var.m, str3, null, str);
        }
        hwt hwtVar = u810Var.a;
        boolean z = hwtVar.d && hwtVar.b && !hwtVar.e && !hwtVar.c;
        oox0 oox0Var = u810Var.b;
        yo60 yo60Var = u810Var.c;
        x360 x360Var = n6j1Var.f;
        String str5 = oox0Var.a;
        String strC = c(oox0Var.g);
        String str6 = oox0Var.f;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = n6j1Var.b;
        String str8 = oox0Var.b;
        String str9 = oox0Var.k;
        if (str9 == null || ihc1.y0(str9)) {
            str9 = null;
        }
        nox0 nox0Var = oox0Var.i;
        String str10 = str6;
        k6j1 k6j1Var = new k6j1(c(nox0Var.a), c(nox0Var.b));
        nox0 nox0Var2 = oox0Var.j;
        k6j1 k6j1Var2 = new k6j1(c(nox0Var2.a), c(nox0Var2.b));
        String str11 = yo60Var.e;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = yo60Var.b;
        String str13 = str12 == null ? "" : str12;
        String str14 = str11;
        jsm0 jsm0Var = new jsm0(0L, 8000L);
        ksm0 ksm0Var = new ksm0(fec1.c, yo60Var.h, (String) null, "vertical-video-single-entry-card", (String) null, (String) null, 496);
        prl prlVar = u810Var.d;
        nrl nrlVar = prlVar != null ? prlVar.c : null;
        if (nrlVar instanceof irl) {
            i = 1;
        } else {
            i = nrlVar instanceof jrl ? 2 : 3;
        }
        return new o6j1(str4, x360Var, str2, str7, str14, str8, str10, str5, strC, k6j1Var, k6j1Var2, new lsm0(str13, ksm0Var, true, false, jsm0Var, 0L, (ism0) null, (String) null, false, i, 1512), z, str3, str9, str);
    }

    public static final String c(String str) {
        boolean z;
        if (str != null) {
            try {
                z = ihc1.y0(str);
            } catch (Throwable th) {
                Logger.d(l1d.m("Failed to parse color: ", str), new Object[]{th});
                return null;
            }
        }
        String strConcat = !z ? str : null;
        if (strConcat == null) {
            strConcat = null;
        } else if (iro1.s(strConcat)) {
            strConcat = "#".concat(iro1.y(strConcat.substring(1)));
        }
        return strConcat == null ? "" : strConcat;
    }

    public static final wcm d(o6j1 o6j1Var) {
        tcm tcmVar;
        String strL0 = o6j1Var.i;
        if (strL0 != null && iro1.s(strL0)) {
            strL0 = ihc1.l0(3, strL0);
        }
        String str = o6j1Var.n;
        if (u890.j(strL0, "FFFFFF")) {
            tcmVar = tcm.a;
        } else {
            tcmVar = u890.j(strL0, "000000") ? qcm.a : rcm.a;
        }
        return new wcm(str, (String) null, (String) null, tcmVar, (Function0) null, new dch1(o6j1Var, (byte) 16), false, o6j1Var.h, (String) null, 854);
    }
}
