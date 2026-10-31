package p;

import android.content.Context;
import android.os.Bundle;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z580 {
    public static String d;
    public static final z580 a = new z580();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final synchronized Bundle c(List list, long j, boolean z, List list2) {
        Bundle bundle;
        ?? B;
        ?? r6;
        ?? ValueOf;
        boolean z2;
        List list3 = list2;
        synchronized (z580.class) {
            Bundle bundle2 = null;
            if (dhn.a.contains(z580.class)) {
                return null;
            }
            try {
                if (list3.isEmpty()) {
                    return null;
                }
                if (list.size() != list3.size()) {
                    return null;
                }
                ArrayList<mmr0> arrayList = new ArrayList();
                int size = list.size();
                ?? bundle3 = 0;
                int i = 0;
                while (i < size) {
                    k580 k580Var = (k580) list.get(i);
                    mmr0 mmr0Var = (mmr0) list3.get(i);
                    Bundle bundle4 = (Bundle) mmr0Var.a;
                    ylq0 ylq0Var = (ylq0) mmr0Var.b;
                    bundle = bundle2;
                    try {
                        int i2 = i;
                        k580 k580Var2 = new k580(k580Var.c(), new BigDecimal(String.valueOf(k580Var.a())).setScale(2, RoundingMode.HALF_UP).doubleValue(), k580Var.b());
                        List<mmr0> list4 = z ? (List) b.get(k580Var2) : (List) c.get(k580Var2);
                        List list5 = list4;
                        if (list5 == null || list5.isEmpty()) {
                            B = bundle;
                            r6 = B;
                            ValueOf = r6;
                            z2 = false;
                        } else {
                            B = bundle;
                            r6 = B;
                            ValueOf = r6;
                            z2 = false;
                            for (mmr0 mmr0Var2 : list4) {
                                long jLongValue = ((Number) mmr0Var2.a).longValue();
                                mmr0 mmr0Var3 = (mmr0) mmr0Var2.b;
                                Bundle bundle5 = (Bundle) mmr0Var3.a;
                                ylq0 ylq0Var2 = (ylq0) mmr0Var3.b;
                                if (Math.abs(j - jLongValue) <= w580.d() && (ValueOf == 0 || jLongValue < ValueOf.longValue())) {
                                    z580 z580Var = a;
                                    boolean z3 = !z;
                                    if (dhn.a.contains(z580.class)) {
                                        B = bundle;
                                    } else {
                                        try {
                                            B = z580Var.b(bundle4, ylq0Var, bundle5, ylq0Var2, z3, false);
                                        } catch (Throwable th) {
                                            dhn.a(z580.class, th);
                                            B = bundle;
                                        }
                                    }
                                    String strB = a.b(bundle4, ylq0Var, bundle5, ylq0Var2, z3, true);
                                    r6 = r6;
                                    if (strB != null) {
                                        r6 = strB;
                                    }
                                    if (B != 0) {
                                        ValueOf = Long.valueOf(jLongValue);
                                        arrayList.add(new mmr0(k580Var2, Long.valueOf(jLongValue)));
                                        z2 = true;
                                    }
                                }
                            }
                        }
                        if (r6 != 0) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_test_dedup_result", "1");
                            bundle3.putString("fb_iap_test_dedup_key_used", r6);
                        }
                        if (z2) {
                            if (bundle3 == 0) {
                                bundle3 = new Bundle();
                            }
                            bundle3.putString("fb_iap_non_deduped_event_time", String.valueOf(ValueOf != 0 ? ValueOf.longValue() / 1000 : 0L));
                            bundle3.putString("fb_iap_actual_dedup_result", "1");
                            bundle3.putString("fb_iap_actual_dedup_key_used", B);
                        }
                        if (z && !z2) {
                            ConcurrentHashMap concurrentHashMap = c;
                            if (concurrentHashMap.get(k580Var2) == null) {
                                concurrentHashMap.put(k580Var2, new ArrayList());
                            }
                            List list6 = (List) concurrentHashMap.get(k580Var2);
                            if (list6 != null) {
                                list6.add(new mmr0(Long.valueOf(j), new mmr0(bundle4, ylq0Var)));
                            }
                        } else if (!z && !z2) {
                            ConcurrentHashMap concurrentHashMap2 = b;
                            if (concurrentHashMap2.get(k580Var2) == null) {
                                concurrentHashMap2.put(k580Var2, new ArrayList());
                            }
                            List list7 = (List) concurrentHashMap2.get(k580Var2);
                            if (list7 != null) {
                                list7.add(new mmr0(Long.valueOf(j), new mmr0(bundle4, ylq0Var)));
                            }
                        }
                        i = i2 + 1;
                        list3 = list2;
                        bundle2 = bundle;
                        bundle3 = bundle3;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                bundle = bundle2;
                for (mmr0 mmr0Var4 : arrayList) {
                    List list8 = z ? (List) b.get(mmr0Var4.a) : (List) c.get(mmr0Var4.a);
                    if (list8 != null) {
                        Iterator it = list8.iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            int i4 = i3 + 1;
                            if (((Number) ((mmr0) it.next()).a).longValue() == ((Number) mmr0Var4.b).longValue()) {
                                list8.remove(i3);
                                break;
                            }
                            i3 = i4;
                        }
                        if (z) {
                            if (list8.isEmpty()) {
                                b.remove(mmr0Var4.a);
                            } else {
                                b.put(mmr0Var4.a, list8);
                            }
                        } else if (list8.isEmpty()) {
                            c.remove(mmr0Var4.a);
                        } else {
                            c.put(mmr0Var4.a, list8);
                        }
                    }
                }
                return bundle3;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle2;
            }
            dhn.a(z580.class, th);
            return bundle;
        }
    }

    public static final void d() {
        if (dhn.a.contains(z580.class)) {
            return;
        }
        try {
            if (e.get()) {
                int iA = a.a();
                int iC = l1d.C(iA);
                if (iC == 1) {
                    m580.b(2);
                    return;
                }
                if (iC != 2) {
                    if (iC == 3 && mn10.b(kn10.IapLoggingLib5To7)) {
                        o580.b(wf10.a(), iA);
                        return;
                    }
                    return;
                }
                if (mn10.b(kn10.IapLoggingLib2)) {
                    o580.b(wf10.a(), iA);
                } else {
                    m580.b(3);
                }
            }
        } catch (Throwable th) {
            dhn.a(z580.class, th);
        }
    }

    public final int a() {
        Set set = dhn.a;
        if (set.contains(this)) {
            return 0;
        }
        try {
            Context contextA = wf10.a();
            String string = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128).metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return 1;
            }
            List listQ0 = ihc1.Q0(string, new String[]{"."}, 3, 2);
            if (string.length() != 0) {
                String strConcat = "GPBL.".concat(string);
                if (!set.contains(z580.class)) {
                    try {
                        d = strConcat;
                    } catch (Throwable th) {
                        dhn.a(z580.class, th);
                    }
                }
                Integer numC0 = nhc1.c0((String) listQ0.get(0));
                if (numC0 != null) {
                    int iIntValue = numC0.intValue();
                    if (iIntValue == 1) {
                        return 2;
                    }
                    return iIntValue < 5 ? 3 : 4;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            dhn.a(this, th2);
            return 0;
        }
        return 4;
    }

    public final String b(Bundle bundle, ylq0 ylq0Var, Bundle bundle2, ylq0 ylq0Var2, boolean z, boolean z2) {
        if (!dhn.a.contains(this)) {
            try {
                List<mmr0> listE = z2 ? w580.e(z) : w580.c(z);
                if (listE != null) {
                    for (mmr0 mmr0Var : listE) {
                        Map map = ylq0.b;
                        Object objB = cev0.B((String) mmr0Var.a, bundle, ylq0Var);
                        String str = objB instanceof String ? (String) objB : null;
                        if (str != null && str.length() != 0) {
                            for (String str2 : (List) mmr0Var.b) {
                                Map map2 = ylq0.b;
                                Object objB2 = cev0.B(str2, bundle2, ylq0Var2);
                                String str3 = objB2 instanceof String ? (String) objB2 : null;
                                if (str3 != null && str3.length() != 0 && str3.equals(str)) {
                                    return z ? (String) mmr0Var.a : str2;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }
}
