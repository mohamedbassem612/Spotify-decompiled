package p;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oz3 implements nz3 {
    public static volatile oz3 c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public oz3(AppMeasurementSdk appMeasurementSdk) {
        zod.s(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (dtn1.c.contains(str) || dtn1.b.contains(str2)) {
            return;
        }
        bg11 bg11Var = dtn1.d;
        int i = bg11Var.d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zContainsKey = bundle.containsKey((String) bg11Var.get(i3));
            i3++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (dtn1.c.contains(str)) {
                return;
            }
            bg11 bg11Var2 = dtn1.d;
            int i4 = bg11Var2.d;
            while (i2 < i4) {
                boolean zContainsKey2 = bundle.containsKey((String) bg11Var2.get(i2));
                i2++;
                if (zContainsKey2) {
                    return;
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.a.logEvent(str, str2, bundle);
    }

    public final i5x0 b(String str, oql oqlVar) {
        zxl1 owf1Var;
        if (!dtn1.c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (zEquals) {
                    owf1Var = new zxl1(appMeasurementSdk, oqlVar);
                } else {
                    owf1Var = "clx".equals(str) ? new owf1(appMeasurementSdk, oqlVar) : null;
                }
                if (owf1Var != null) {
                    concurrentHashMap.put(str, owf1Var);
                    return new i5x0(this);
                }
            }
        }
        return null;
    }
}
