package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class w580 {
    public static final List a = Collections.singletonList("fb_currency");
    public static final List b = Collections.singletonList("_valueToSum");
    public static final char c = 60000;
    public static final List d = p7h.M(new mmr0[]{new mmr0("fb_iap_product_id", Collections.singletonList("fb_iap_product_id")), new mmr0("fb_iap_product_description", Collections.singletonList("fb_iap_product_description")), new mmr0("fb_iap_product_title", Collections.singletonList("fb_iap_product_title")), new mmr0("fb_iap_purchase_token", Collections.singletonList("fb_iap_purchase_token"))});

    public static mmr0 a(Bundle bundle, Bundle bundle2, ylq0 ylq0Var) {
        if (bundle == null) {
            return new mmr0(bundle2, ylq0Var);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    Map map = ylq0.b;
                    mmr0 mmr0VarS = cev0.s(str, string, bundle2, ylq0Var);
                    Bundle bundle3 = (Bundle) mmr0VarS.a;
                    ylq0Var = (ylq0) mmr0VarS.b;
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new mmr0(bundle2, ylq0Var);
    }

    public static Currency b(Bundle bundle) {
        String string;
        c120 c120VarB = g120.b(wf10.b());
        for (String str : ((c120VarB != null ? c120VarB.t : null) == null || c120VarB.t.isEmpty()) ? a : c120VarB.t) {
            if (bundle != null) {
                try {
                    string = bundle.getString(str);
                } catch (Exception unused) {
                    continue;
                }
            } else {
                string = null;
            }
            if (string != null && string.length() != 0) {
                return Currency.getInstance(string);
            }
        }
        return null;
    }

    public static List c(boolean z) {
        c120 c120VarB = g120.b(wf10.b());
        if ((c120VarB != null ? c120VarB.v : null) != null) {
            List<mmr0> list = c120VarB.v;
            if (!list.isEmpty()) {
                if (!z) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (mmr0 mmr0Var : list) {
                    Iterator it = ((List) mmr0Var.b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new mmr0((String) it.next(), Collections.singletonList(mmr0Var.a)));
                    }
                }
                return arrayList;
            }
        }
        return d;
    }

    public static long d() {
        Long l;
        c120 c120VarB = g120.b(wf10.b());
        return ((c120VarB != null ? c120VarB.x : null) == null || ((l = c120VarB.x) != null && l.longValue() == 0)) ? c : c120VarB.x.longValue();
    }

    public static List e(boolean z) {
        c120 c120VarB = g120.b(wf10.b());
        if (c120VarB == null) {
            return null;
        }
        List<mmr0> list = c120VarB.w;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        if (!z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (mmr0 mmr0Var : list) {
            Iterator it = ((List) mmr0Var.b).iterator();
            while (it.hasNext()) {
                arrayList.add(new mmr0((String) it.next(), Collections.singletonList(mmr0Var.a)));
            }
        }
        return arrayList;
    }

    public static Double f(Double d2, Bundle bundle) {
        if (d2 != null) {
            return d2;
        }
        c120 c120VarB = g120.b(wf10.b());
        Iterator it = (((c120VarB != null ? c120VarB.u : null) == null || c120VarB.u.isEmpty()) ? b : c120VarB.u).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (bundle != null) {
                try {
                    return Double.valueOf(bundle.getDouble(str));
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }
}
