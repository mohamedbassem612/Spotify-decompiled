package p;

import android.net.Uri;
import com.spotify.messages.BetamaxCDN;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lma implements m270 {
    public final t2j0 a;
    public final ua91 b;
    public final String c;
    public final String d;

    public lma(t2j0 t2j0Var, ua91 ua91Var, String str, String str2) {
        this.a = t2j0Var;
        this.b = ua91Var;
        this.c = str;
        this.d = str2;
    }

    public final void a(jf01 jf01Var, st60 st60Var) {
        int iIntValue;
        String strC;
        String str;
        String strC2;
        String strC3;
        String strC4;
        Integer num;
        ln21 ln21Var = jf01Var.b;
        String str2 = ln21Var.a.i;
        String str3 = this.d.equals(str2) ? "playlist" : "segment";
        v360 v360Var = (v360) st60Var.b;
        ln21 ln21Var2 = (ln21) st60Var.d;
        if (v360Var == null) {
            ln21Var2 = null;
        }
        j4g1 j4g1Var = (j4g1) st60Var.c;
        s7g1 s7g1Var = j4g1Var != null ? (s7g1) o7h.C0(j4g1Var.e) : null;
        Long l = s7g1Var != null ? s7g1Var.i : null;
        Long l2 = s7g1Var != null ? s7g1Var.k : null;
        long jLongValue = (l == null || l2 == null) ? 0L : l2.longValue() - l.longValue();
        ua91 ua91Var = this.b;
        HashMap map = new HashMap((LinkedHashMap) ua91Var.d);
        Iterator it = ((List) ua91Var.e).iterator();
        while (true) {
            iIntValue = 0;
            if (!it.hasNext()) {
                break;
            }
            String strA = v2b1.a(Uri.parse((String) it.next()));
            if (strA != null && !map.containsKey(strA)) {
                map.put(strA, 0);
            }
        }
        String strB = nfa0.d.b(new nlc0(chc1.a, wr80.a), map);
        ima imaVarN = BetamaxCDN.n();
        imaVarN.q(ln21Var.a.d);
        String str4 = "";
        if (ln21Var2 == null || (strC = ln21Var2.c.c("User-Agent")) == null) {
            strC = "";
        }
        imaVarN.y(strC);
        if (s7g1Var != null && (num = s7g1Var.e) != null) {
            iIntValue = num.intValue();
        }
        imaVarN.w(iIntValue);
        imaVarN.z(ln21Var.b);
        imaVarN.x(str2);
        if (s7g1Var == null || (str = s7g1Var.f) == null) {
            str = "";
        }
        imaVarN.A(str);
        if (v360Var == null || (strC2 = v360Var.c("X-Cache")) == null) {
            strC2 = "";
        }
        imaVarN.B(strC2);
        if (v360Var == null || (strC3 = v360Var.c("X-Cache-Hits")) == null) {
            strC3 = "";
        }
        imaVarN.C(strC3);
        imaVarN.r(s7g1Var != null ? s7g1Var.b : 0L);
        imaVarN.s(jLongValue);
        if (ln21Var2 != null && (strC4 = ln21Var2.c.c("X-rid")) != null) {
            str4 = strC4;
        }
        imaVarN.t(str4);
        imaVarN.u(str3);
        imaVarN.n(strB);
        imaVarN.v(this.c);
        BetamaxCDN betamaxCDNBuild = imaVarN.build();
        betamaxCDNBuild.getClass();
        this.a.a(betamaxCDNBuild);
    }
}
