package p;

import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c1p1 {
    public static final pue0 d = new pue0("ApplicationAnalyticsUtils", (String) null);
    public static final String e = "22.2.0";
    public final String a;
    public final Map b;
    public final Map c;

    public c1p1(Bundle bundle, String str) {
        this.a = str;
        this.b = s3o1.z(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.c = s3o1.z(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public final t4p1 a(qzo1 qzo1Var) {
        return (t4p1) f(qzo1Var).b();
    }

    public final t4p1 b(qzo1 qzo1Var) {
        q4p1 q4p1VarF = f(qzo1Var);
        if (qzo1Var.f30p == 1) {
            s3p1 s3p1VarN = v3p1.n(q4p1VarF.d());
            s3p1VarN.a();
            ((v3p1) s3p1VarN.b).s(17);
            q4p1VarF.e((v3p1) s3p1VarN.b());
        }
        return (t4p1) q4p1VarF.b();
    }

    public final t4p1 c(qzo1 qzo1Var) {
        q4p1 q4p1VarF = f(qzo1Var);
        s3p1 s3p1VarN = v3p1.n(q4p1VarF.d());
        s3p1VarN.a();
        ((v3p1) s3p1VarN.b).s(10);
        q4p1VarF.e((v3p1) s3p1VarN.b());
        s3p1 s3p1VarN2 = v3p1.n(q4p1VarF.d());
        s3p1VarN2.a();
        ((v3p1) s3p1VarN2.b).q(true);
        q4p1VarF.a();
        ((t4p1) q4p1VarF.b).w((v3p1) s3p1VarN2.b());
        return (t4p1) q4p1VarF.b();
    }

    public final t4p1 d(qzo1 qzo1Var, boolean z) {
        q4p1 q4p1VarF = f(qzo1Var);
        s3p1 s3p1VarN = v3p1.n(q4p1VarF.d());
        s3p1VarN.a();
        ((v3p1) s3p1VarN.b).q(z);
        q4p1VarF.a();
        ((t4p1) q4p1VarF.b).w((v3p1) s3p1VarN.b());
        return (t4p1) q4p1VarF.b();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    public final t4p1 e(qzo1 qzo1Var, int i) {
        int iIntValue;
        int iIntValue2;
        q4p1 q4p1VarF = f(qzo1Var);
        s3p1 s3p1VarN = v3p1.n(q4p1VarF.d());
        Map map = this.c;
        if (map != null) {
            Integer numValueOf = Integer.valueOf(i);
            if (map.containsKey(numValueOf)) {
                Integer num = (Integer) map.get(numValueOf);
                zod.s(num);
                iIntValue = num.intValue();
            } else {
                iIntValue = i + 10000;
            }
        } else {
            iIntValue = i + 10000;
        }
        s3p1VarN.a();
        ((v3p1) s3p1VarN.b).s(iIntValue);
        Map map2 = this.b;
        if (map2 != null) {
            Integer numValueOf2 = Integer.valueOf(i);
            if (map2.containsKey(numValueOf2)) {
                Integer num2 = (Integer) map2.get(numValueOf2);
                zod.s(num2);
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = i + 10000;
            }
        } else {
            iIntValue2 = i + 10000;
        }
        s3p1VarN.a();
        ((v3p1) s3p1VarN.b).t(iIntValue2);
        q4p1VarF.e((v3p1) s3p1VarN.b());
        return (t4p1) q4p1VarF.b();
    }

    public final q4p1 f(qzo1 qzo1Var) {
        int i;
        long jLongValue;
        q4p1 q4p1VarN = t4p1.n();
        long j = qzo1Var.d;
        q4p1VarN.a();
        ((t4p1) q4p1VarN.b).p(j);
        int i2 = qzo1Var.e;
        qzo1Var.e = i2 + 1;
        q4p1VarN.a();
        ((t4p1) q4p1VarN.b).v(i2);
        String str = qzo1Var.c;
        if (str != null) {
            q4p1VarN.a();
            ((t4p1) q4p1VarN.b).u(str);
        }
        cdp1 cdp1VarM = edp1.m();
        if (!TextUtils.isEmpty(qzo1Var.h)) {
            String str2 = qzo1Var.h;
            q4p1VarN.a();
            ((t4p1) q4p1VarN.b).q(str2);
            String str3 = qzo1Var.h;
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).n(str3);
        }
        if (!TextUtils.isEmpty(qzo1Var.i)) {
            String str4 = qzo1Var.i;
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).o(str4);
        }
        if (!TextUtils.isEmpty(qzo1Var.j)) {
            String str5 = qzo1Var.j;
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).p(str5);
        }
        if (!TextUtils.isEmpty(qzo1Var.k)) {
            String str6 = qzo1Var.k;
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).q(str6);
        }
        if (!TextUtils.isEmpty(qzo1Var.l)) {
            String str7 = qzo1Var.l;
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).r(str7);
        }
        if (!TextUtils.isEmpty(qzo1Var.m)) {
            String str8 = qzo1Var.m;
            cdp1VarM.a();
            ((edp1) cdp1VarM.b).s(str8);
        }
        int i3 = qzo1Var.n;
        if (i3 != 1) {
            i = 3;
            if (i3 != 2) {
                if (i3 != 3) {
                    i = 5;
                    if (i3 != 4) {
                        i = i3 != 5 ? 1 : 6;
                    }
                } else {
                    i = 4;
                }
            }
        } else {
            i = 2;
        }
        cdp1VarM.a();
        ((edp1) cdp1VarM.b).t(i);
        edp1 edp1Var = (edp1) cdp1VarM.b();
        q4p1VarN.a();
        ((t4p1) q4p1VarN.b).A(edp1Var);
        h3p1 h3p1VarM = k3p1.m();
        h3p1VarM.e(e);
        h3p1VarM.d(this.a);
        k3p1 k3p1Var = (k3p1) h3p1VarM.b();
        q4p1VarN.a();
        ((t4p1) q4p1VarN.b).y(k3p1Var);
        s3p1 s3p1VarM = v3p1.m();
        if (qzo1Var.b != null) {
            y6p1 y6p1VarM = b7p1.m();
            String str9 = qzo1Var.b;
            y6p1VarM.a();
            ((b7p1) y6p1VarM.b).n(str9);
            b7p1 b7p1Var = (b7p1) y6p1VarM.b();
            s3p1VarM.a();
            ((v3p1) s3p1VarM.b).p(b7p1Var);
        }
        s3p1VarM.a();
        ((v3p1) s3p1VarM.b).q(false);
        String str10 = qzo1Var.f;
        if (str10 != null) {
            try {
                String strReplace = str10.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException unused) {
                d.c("receiverSessionId %s is not valid for hash", new Object[]{str10});
                jLongValue = 0;
            }
            s3p1VarM.a();
            ((v3p1) s3p1VarM.b).r(jLongValue);
        }
        int i4 = qzo1Var.g;
        s3p1VarM.a();
        ((v3p1) s3p1VarM.b).u(i4);
        boolean z = qzo1Var.a.m == 2;
        s3p1VarM.a();
        ((v3p1) s3p1VarM.b).v(z);
        boolean z2 = qzo1Var.o;
        s3p1VarM.a();
        ((v3p1) s3p1VarM.b).y(z2);
        q4p1VarN.a();
        ((t4p1) q4p1VarN.b).w((v3p1) s3p1VarM.b());
        return q4p1VarN;
    }
}
