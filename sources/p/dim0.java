package p;

import android.os.Bundle;
import android.text.TextUtils;
import com.comscore.android.id.IdHelperAndroid;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dim0 {
    public static final dim0 a = new dim0();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final List c = p7h.M(new String[]{"other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
    public static final List d = p7h.M(new String[]{IdHelperAndroid.NO_ID_AVAILABLE, "address", "health"});

    public static final File d() {
        if (!dhn.a.contains(dim0.class)) {
            try {
                cim0 cim0Var = (cim0) b.get(cfm0.b(2));
                if (cim0Var != null) {
                    return cim0Var.c();
                }
            } catch (Throwable th) {
                dhn.a(dim0.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String[] f(int i, float[][] fArr, String[] strArr) {
        vhm0 vhm0VarB;
        if (!dhn.a.contains(dim0.class)) {
            try {
                cim0 cim0Var = (cim0) b.get(cfm0.b(i));
                if (cim0Var != null && (vhm0VarB = cim0Var.b()) != null) {
                    float[] fArrD = cim0Var.d();
                    int length = strArr.length;
                    int length2 = fArr[0].length;
                    guf0 guf0Var = new guf0(new int[]{length, length2});
                    for (int i2 = 0; i2 < length; i2++) {
                        System.arraycopy(fArr[i2], 0, guf0Var.a(), i2 * length2, length2);
                    }
                    guf0 guf0VarA = vhm0VarB.a(guf0Var, strArr, cfm0.a(i));
                    if (guf0VarA != null && fArrD != null && guf0VarA.a().length != 0 && fArrD.length != 0) {
                        int iC = l1d.C(i);
                        dim0 dim0Var = a;
                        if (iC == 0) {
                            return dim0Var.g(guf0VarA, fArrD);
                        }
                        if (iC == 1) {
                            return dim0Var.h(guf0VarA, fArrD);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } catch (Throwable th) {
                dhn.a(dim0.class, th);
                return null;
            }
        }
        return null;
    }

    public final void a(JSONObject jSONObject) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    cim0 cim0VarG = xto.g(jSONObject.getJSONObject(itKeys.next()));
                    if (cim0VarG != null) {
                        b.put(cim0VarG.e(), cim0VarG);
                    }
                } catch (JSONException unused) {
                    return;
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public final void b() {
        Locale locale;
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int iMax = 0;
            String strA = null;
            for (Map.Entry entry : b.entrySet()) {
                String str = (String) entry.getKey();
                cim0 cim0Var = (cim0) entry.getValue();
                if (u890.j(str, cfm0.b(2))) {
                    strA = cim0Var.a();
                    iMax = Math.max(iMax, cim0Var.f());
                    if (mn10.b(kn10.SuggestedEvents) && !dhn.a.contains(this)) {
                        try {
                            try {
                                locale = wf10.a().getResources().getConfiguration().locale;
                            } catch (Exception unused) {
                                locale = null;
                            }
                            if (locale == null || ihc1.j0(locale.getLanguage(), "en")) {
                                cim0Var.g(new em5((byte) 1));
                                arrayList.add(cim0Var);
                            }
                        } catch (Throwable th) {
                            dhn.a(this, th);
                        }
                    }
                }
                if (u890.j(str, cfm0.b(1))) {
                    strA = cim0Var.a();
                    iMax = Math.max(iMax, cim0Var.f());
                    if (mn10.b(kn10.IntelligentIntegrity)) {
                        cim0Var.g(new em5((byte) 2));
                        arrayList.add(cim0Var);
                    }
                }
            }
            if (strA == null || iMax <= 0 || arrayList.isEmpty()) {
                return;
            }
            xto.n(new cim0("MTML", strA, (String) null, iMax, (float[]) null), arrayList);
        } catch (Throwable th2) {
            dhn.a(this, th2);
        }
    }

    public final JSONObject c() {
        if (!dhn.a.contains(this)) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
                String str = md50.j;
                md50 md50VarQ = cwl1.Q(null, "app/model_asset", null);
                md50VarQ.d = bundle;
                JSONObject jSONObject = md50VarQ.c().b;
                if (jSONObject != null) {
                    return e(jSONObject);
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final JSONObject e(JSONObject jSONObject) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public final String[] g(guf0 guf0Var, float[] fArr) {
        if (!dhn.a.contains(this)) {
            try {
                int iB = guf0Var.b(0);
                int iB2 = guf0Var.b(1);
                float[] fArrA = guf0Var.a();
                if (iB2 == fArr.length) {
                    tr80 tr80VarQ = yoi1.Q(0, iB);
                    ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
                    lr80 it = tr80VarQ.iterator();
                    while (((sr80) it).c) {
                        int iNextInt = it.nextInt();
                        Object obj = IdHelperAndroid.NO_ID_AVAILABLE;
                        int length = fArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            if (fArrA[(iNextInt * iB2) + i2] >= fArr[i]) {
                                obj = d.get(i2);
                            }
                            i++;
                            i2 = i3;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }

    public final String[] h(guf0 guf0Var, float[] fArr) {
        if (!dhn.a.contains(this)) {
            try {
                int iB = guf0Var.b(0);
                int iB2 = guf0Var.b(1);
                float[] fArrA = guf0Var.a();
                if (iB2 == fArr.length) {
                    tr80 tr80VarQ = yoi1.Q(0, iB);
                    ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
                    lr80 it = tr80VarQ.iterator();
                    while (((sr80) it).c) {
                        int iNextInt = it.nextInt();
                        Object obj = "other";
                        int length = fArr.length;
                        int i = 0;
                        int i2 = 0;
                        while (i < length) {
                            int i3 = i2 + 1;
                            if (fArrA[(iNextInt * iB2) + i2] >= fArr[i]) {
                                obj = c.get(i2);
                            }
                            i++;
                            i2 = i3;
                        }
                        arrayList.add((String) obj);
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return null;
            }
        }
        return null;
    }
}
