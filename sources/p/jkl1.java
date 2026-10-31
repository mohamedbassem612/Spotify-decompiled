package p;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jkl1 implements p090 {
    public final gkl1 a;
    public final yqg b;
    public final HashMap c = new HashMap(16);

    public jkl1(gkl1 gkl1Var, yqg yqgVar) {
        this.a = gkl1Var;
        this.b = yqgVar;
    }

    public final ry21 a(uf01 uf01Var) {
        ln21 ln21Var = uf01Var.e;
        this.a.getClass();
        if (!gkl1.a(ln21Var)) {
            return uf01Var.b(ln21Var);
        }
        l370 l370Var = ln21Var.a;
        l370Var.getClass();
        try {
            String strQ = t890.q(new URL(l370Var.i));
            HashMap map = this.c;
            Object obj = map.get(strQ);
            long jE = 0;
            WeakHashMap weakHashMap = xoi1.a;
            if (obj == null) {
                obj = 0L;
            }
            long jLongValue = ((Number) obj).longValue();
            yqg yqgVar = this.b;
            if (jLongValue - yqgVar.e() > 0) {
                tz21 tz21Var = uz21.a;
                ArrayList arrayList = new ArrayList(20);
                nac nacVar = new nac();
                nacVar.write(new byte[0], 0, 0);
                return new ry21(ln21Var, bjy0.c, "", 429, (ms50) null, new v360((String[]) arrayList.toArray(new String[0])), new tz21((r8i0) null, 0L, nacVar), (a6a1) null, (ry21) null, (ry21) null, (ry21) null, 0L, 0L, (i25) null, a6g1.u0);
            }
            ry21 ry21VarB = uf01Var.b(ln21Var);
            v360 v360Var = ry21VarB.f;
            String strC = v360Var.c("Retry-After");
            if (strC == null) {
                strC = null;
            }
            if (strC != null) {
                String strC2 = v360Var.c("Retry-After");
                Date dateA = strC2 != null ? q5r.a(strC2) : null;
                if (dateA != null) {
                    Calendar calendarD = yqgVar.d();
                    calendarD.setTime(dateA);
                    jE = (calendarD.getTimeInMillis() + yqgVar.e()) - yqgVar.b();
                } else {
                    try {
                        jE = yqgVar.e() + TimeUnit.MILLISECONDS.convert(Long.parseLong(strC), TimeUnit.SECONDS);
                    } catch (NumberFormatException unused) {
                        n57.e("Could not parse Retry-After header as long: ".concat(strC));
                    }
                }
                map.put(strQ, Long.valueOf(jE));
            }
            return ry21VarB;
        } catch (MalformedURLException e) {
            eg.j(e);
            return null;
        }
    }
}
