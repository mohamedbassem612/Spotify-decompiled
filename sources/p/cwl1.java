package p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.work.impl.WorkDatabase;
import com.facebook.FacebookException;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.zip.GZIPOutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class cwl1 {
    public static boolean a = false;
    public static Boolean b;

    public static long A(long j, long j2) {
        hm5.l(j, "a");
        hm5.l(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long jNumberOfTrailingZeros = j >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j3 = j2 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j3) {
            long j4 = jNumberOfTrailingZeros - j3;
            long j5 = (j4 >> 63) & j4;
            long j6 = (j4 - j5) - j5;
            j3 += j5;
            jNumberOfTrailingZeros = j6 >> Long.numberOfTrailingZeros(j6);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static final tl7 B(q7r0 q7r0Var) {
        return (tl7) q7r0Var.b(tl7.class);
    }

    public static final d0r C(q7r0 q7r0Var) {
        return (d0r) q7r0Var.e(d0r.class);
    }

    public static final bn70 D(h0r0 h0r0Var) {
        bn70 bn70VarA = h0r0Var.a().b0(bn70.class).a();
        if (bn70VarA != null) {
            return bn70VarA;
        }
        eg.m("Page must provide an Identifier property.");
        return null;
    }

    public static final ttm0 E(q7r0 q7r0Var) {
        return (ttm0) q7r0Var.b(ttm0.class);
    }

    public static final abu0 F(q7r0 q7r0Var) {
        return (abu0) q7r0Var.b(abu0.class);
    }

    public static final n7h1 G(q7r0 q7r0Var) {
        return (n7h1) q7r0Var.b(n7h1.class);
    }

    public static final i8h1 H(q7r0 q7r0Var) {
        return (i8h1) q7r0Var.b(i8h1.class);
    }

    public static final t8h1 I(q7r0 q7r0Var) {
        return (t8h1) q7r0Var.b(t8h1.class);
    }

    public static final h0a J(int i) {
        if (i == 0) {
            return h0a.a;
        }
        if (i == 1) {
            return h0a.b;
        }
        hhg1.n(gvg.e(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final int K(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        hhg1.n(gvg.e(i, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static final int L(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        hhg1.n(gvg.e(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    public static final wvl1 M(int i) {
        if (i == 0) {
            return wvl1.a;
        }
        if (i == 1) {
            return wvl1.b;
        }
        if (i == 2) {
            return wvl1.c;
        }
        if (i == 3) {
            return wvl1.d;
        }
        if (i == 4) {
            return wvl1.e;
        }
        if (i == 5) {
            return wvl1.f;
        }
        hhg1.n(gvg.e(i, "Could not convert ", " to State"));
        return null;
    }

    public static boolean N(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof kd50);
    }

    public static boolean O(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    public static final int P(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 0;
        }
        int i2 = 1;
        if (iC != 1) {
            i2 = 2;
            if (iC != 2) {
                i2 = 3;
                if (iC != 3) {
                    i2 = 4;
                    if (iC != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        mna0.e("Could not convert ", cy30.A(i), " to int");
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static md50 Q(xd xdVar, String str, id50 id50Var) {
        return new md50(xdVar, str, null, null, id50Var, 32);
    }

    public static md50 R(xd xdVar, String str, JSONObject jSONObject, id50 id50Var) {
        md50 md50Var = new md50(xdVar, str, null, a370.b, id50Var, 32);
        md50Var.c = jSONObject;
        return md50Var;
    }

    public static long S(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public static String T(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
        }
        hhg1.n("Unsupported parameter type.");
        return null;
    }

    public static final String U(int i, int i2, Object[] objArr, b0k b0kVar) {
        return ((Resources) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.c)).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    public static void V(JSONObject jSONObject, String str, jd50 jd50Var) {
        boolean z;
        Matcher matcher = md50.k.matcher(str);
        String strGroup = matcher.matches() ? matcher.group(1) : str;
        if (nhc1.Y(strGroup, "me/", false) || nhc1.Y(strGroup, "/me/", false)) {
            int iW0 = ihc1.w0(str, ":", 0, false, 6);
            int iW1 = ihc1.w0(str, "?", 0, false, 6);
            if (iW0 <= 3 || (iW1 != -1 && iW0 >= iW1)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            W(next, jSONObject.opt(next), jd50Var, z && nhc1.S(next, "image", true));
        }
    }

    public static void W(String str, Object obj, jd50 jd50Var, boolean z) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    W(String.format("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2)), jSONObject.opt(next), jd50Var, z);
                }
                return;
            }
            if (jSONObject.has("id")) {
                W(str, jSONObject.optString("id"), jd50Var, z);
                return;
            } else if (jSONObject.has("url")) {
                W(str, jSONObject.optString("url"), jd50Var, z);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    W(str, jSONObject.toString(), jd50Var, z);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                W(String.format(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2)), jSONArray.opt(i), jd50Var, z);
            }
            return;
        }
        if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            jd50Var.a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            jd50Var.a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        } else {
            String str2 = md50.j;
            wf10 wf10Var = wf10.a;
        }
    }

    public static void X(od50 od50Var, oue0 oue0Var, int i, URL url, FilterOutputStream filterOutputStream, boolean z) throws JSONException {
        String strB;
        vhd vhdVar = new vhd(filterOutputStream, oue0Var, z);
        boolean z2 = true;
        if (i == 1) {
            md50 md50Var = (md50) od50Var.b.get(0);
            HashMap map = new HashMap();
            for (String str : md50Var.d.keySet()) {
                Object obj = md50Var.d.get(str);
                if (N(obj)) {
                    map.put(str, new hd50(md50Var, obj));
                }
            }
            synchronized (wf10.b) {
            }
            Bundle bundle = md50Var.d;
            for (String str2 : bundle.keySet()) {
                Object obj2 = bundle.get(str2);
                if (O(obj2)) {
                    vhdVar.j(str2, obj2, md50Var);
                }
            }
            synchronized (wf10.b) {
            }
            h0(map, vhdVar);
            JSONObject jSONObject = md50Var.c;
            if (jSONObject != null) {
                V(jSONObject, url.getPath(), vhdVar);
                return;
            }
            return;
        }
        Iterator<E> it = od50Var.iterator();
        while (true) {
            if (it.hasNext()) {
                xd xdVar = ((md50) it.next()).a;
                if (xdVar != null) {
                    strB = xdVar.h;
                    break;
                }
            } else {
                String str3 = md50.j;
                strB = wf10.b();
                break;
            }
        }
        if (strB.length() == 0) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        vhdVar.a("batch_app_id", strB);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = od50Var.iterator();
        while (it2.hasNext()) {
            md50 md50Var2 = (md50) it2.next();
            md50Var2.getClass();
            String str4 = md50.j;
            JSONObject jSONObject2 = new JSONObject();
            String strG = md50Var2.g(kno1.t());
            md50Var2.a();
            Uri uri = Uri.parse(md50Var2.b(strG, z2));
            String str5 = String.format("%s?%s", Arrays.copyOf(new Object[]{uri.getPath(), uri.getQuery()}, 2));
            jSONObject2.put("relative_url", str5);
            jSONObject2.put("method", md50Var2.h);
            xd xdVar2 = md50Var2.a;
            if (xdVar2 != null) {
                oue0.a.j(xdVar2.e);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = md50Var2.d.keySet().iterator();
            while (it3.hasNext()) {
                Object obj3 = md50Var2.d.get(it3.next());
                if (N(obj3)) {
                    String str6 = String.format(Locale.ROOT, "%s%d", Arrays.copyOf(new Object[]{"file", Integer.valueOf(map2.size())}, 2));
                    arrayList.add(str6);
                    map2.put(str6, new hd50(md50Var2, obj3));
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = md50Var2.c;
            if (jSONObject3 != null) {
                ArrayList arrayList2 = new ArrayList();
                V(jSONObject3, str5, new ld50(arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
            z2 = true;
        }
        vhdVar.l(jSONArray, od50Var);
        synchronized (wf10.b) {
        }
        h0(map2, vhdVar);
    }

    public static String Y(Context context) {
        String strZ;
        i1k0.B("Reading branch key from available sources...");
        i1k0.B("Attempting to read branch key from branch.json configuration...");
        i3b i3bVarC = i3b.c(context);
        String str = null;
        String strB = i3bVarC.g() ? i3bVarC.b() : null;
        if (strB != null) {
            i1k0.B("Found branch key in branch.json: ".concat(strB.length() > 10 ? strB.substring(0, 10).concat("...") : strB));
        } else {
            i1k0.B("branch.json configuration not valid or branch key not present");
        }
        if (strB != null) {
            i1k0.B("Successfully read branch key from branch.json configuration");
            ne neVarZ = ne.z(context);
            neVarZ.R(strB);
            neVarZ.Z("bnc_branch_key_source", "branch_json");
            return strB;
        }
        i1k0.B("Branch key not found in branch.json, falling back to manifest...");
        i1k0.B("Attempting to read branch key from manifest meta-data...");
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                i1k0.B("No meta-data found in manifest");
                strZ = null;
            } else {
                strZ = Z(context, applicationInfo);
            }
        } catch (PackageManager.NameNotFoundException e) {
            i1k0.m("Error reading manifest: " + e.getMessage());
        }
        if (strZ != null) {
            i1k0.B("Successfully read branch key from manifest meta-data");
            return strZ;
        }
        i1k0.B("Branch key not found in manifest, falling back to string resources...");
        i1k0.B("Attempting to read branch key from string resources...");
        String str2 = a ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        StringBuilder sbT = l1d.t("Looking for branch key in string resources with key: ", str2, " (test mode: ");
        sbT.append(a);
        sbT.append(")");
        i1k0.B(sbT.toString());
        try {
            Resources resources = context.getResources();
            String string = resources.getString(resources.getIdentifier(str2, "string", context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                i1k0.B("Branch key string resource is empty");
            } else {
                i1k0.B("Found branch key in string resources: ".concat(string.length() > 10 ? string.substring(0, 10).concat("...") : string));
                ne neVarZ2 = ne.z(context);
                neVarZ2.R(string);
                neVarZ2.Z("bnc_branch_key_source", "strings");
            }
            str = string;
        } catch (Resources.NotFoundException unused) {
            i1k0.B("Branch key string resource not found: ".concat(str2));
        }
        if (str != null) {
            i1k0.B("Successfully read branch key from string resources");
        } else {
            i1k0.C("Branch key not found in any source (branch.json, manifest, or string resources)");
        }
        return str;
    }

    public static String Z(Context context, ApplicationInfo applicationInfo) {
        String str = a ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        StringBuilder sbT = l1d.t("Looking for branch key in manifest with key: ", str, " (test mode: ");
        sbT.append(a);
        sbT.append(")");
        i1k0.B(sbT.toString());
        String string = applicationInfo.metaData.getString(str);
        if (string != null) {
            i1k0.B("Found branch key in manifest meta-data: ".concat(string.length() > 10 ? string.substring(0, 10).concat("...") : string));
            ne neVarZ = ne.z(context);
            neVarZ.R(string);
            neVarZ.Z("bnc_branch_key_source", "manifest");
            return string;
        }
        if (!a) {
            i1k0.B("Branch key not found for live mode in manifest");
            return null;
        }
        i1k0.B("Test mode enabled but test key not found, attempting fallback to live key...");
        String string2 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
        if (string2 == null) {
            i1k0.B("No live key found for test mode fallback");
            return string2;
        }
        i1k0.B("Found live branch key for test mode fallback: ".concat(string2.length() > 10 ? string2.substring(0, 10).concat("...") : string2));
        ne neVarZ2 = ne.z(context);
        neVarZ2.R(string2);
        neVarZ2.Z("bnc_branch_key_source", "manifest_test_fallback");
        return string2;
    }

    public static final void a(e3u e3uVar, b0k b0kVar, int i) {
        bw91 bw91Var;
        e3u e3uVar2 = e3uVar;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(294589392);
        int i2 = i | (x340Var.g(e3uVar2) ? 4 : 2);
        if ((i2 & 3) == 2 && x340Var.H()) {
            x340Var.b0();
        } else {
            ld41 ld41VarG = sgc1.G(x340Var);
            ven0 ven0VarJ = xto.j(e3uVar2.k(), x340Var);
            Object obj2 = (Collection) ((List) ven0VarJ.getValue());
            boolean zBooleanValue = ((Boolean) x340Var.k(cn80.a)).booleanValue();
            boolean zG = x340Var.g(obj2);
            Object objT = x340Var.T();
            Object obj3 = objT;
            if (zG || objT == obj) {
                bw91 bw91VarP = xto.p();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (Iterable) obj2) {
                    if (zBooleanValue ? true : ((hnn0) obj4).h.i.a(w8c0.d)) {
                        arrayList.add(obj4);
                    }
                }
                bw91VarP.addAll(arrayList);
                x340Var.s0(bw91VarP);
                obj3 = bw91VarP;
            }
            bw91 bw91Var2 = (bw91) obj3;
            h(bw91Var2, (List) ven0VarJ.getValue(), x340Var, 0);
            ven0 ven0VarJ2 = xto.j(e3uVar2.l(), x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = xto.p();
                x340Var.s0(objT2);
            }
            bw91 bw91Var3 = (bw91) objT2;
            x340Var.i0(1361037007);
            ek60 ek60VarListIterator = bw91Var2.listIterator();
            while (true) {
                ek60 ek60Var = ek60VarListIterator;
                if (!ek60Var.hasNext()) {
                    break;
                }
                hnn0 hnn0Var = (hnn0) ek60Var.next();
                d3u d3uVar = hnn0Var.b;
                boolean zI = ((i2 & 14) == 4) | x340Var.i(hnn0Var);
                Object objT3 = x340Var.T();
                if (zI || objT3 == obj) {
                    objT3 = new f2t(e3uVar2, hnn0Var, (byte) 10);
                    x340Var.s0(objT3);
                }
                anm1.a((Function0) objT3, d3uVar.n(), apo.r(1129586364, new sxj(hnn0Var, e3uVar2, ld41VarG, bw91Var3, d3uVar, (byte) 20), x340Var), x340Var, 384, 0);
                e3uVar2 = e3uVar;
                ld41VarG = ld41VarG;
                bw91Var3 = bw91Var3;
            }
            bw91 bw91Var4 = bw91Var3;
            x340Var.r(false);
            Set set = (Set) ven0VarJ2.getValue();
            boolean zG2 = x340Var.g(ven0VarJ2) | ((i2 & 14) == 4);
            Object objT4 = x340Var.T();
            if (zG2 || objT4 == obj) {
                e3uVar2 = e3uVar;
                bw91Var = bw91Var4;
                Object gkeVar = new gke(ven0VarJ2, e3uVar2, bw91Var, (lnm) null, (byte) 29);
                x340Var.s0(gkeVar);
                objT4 = gkeVar;
            } else {
                e3uVar2 = e3uVar;
                bw91Var = bw91Var4;
            }
            qxd0.s(set, bw91Var, (vu30) objT4, x340Var);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new utt(e3uVar2, i, (byte) 2);
        }
    }

    public static final float a0(x340 x340Var) {
        if (xoi1.b((Context) x340Var.k(AndroidCompositionLocals_androidKt.b))) {
            x340Var.i0(266998322);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            x340Var.r(false);
            return f;
        }
        x340Var.i0(267046868);
        uwr uwrVar2 = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        x340Var.r(false);
        return 16.0f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0124  */
    /* JADX WARN: Code duplicated, block: B:107:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131  */
    /* JADX WARN: Code duplicated, block: B:112:0x0139  */
    /* JADX WARN: Code duplicated, block: B:113:0x0140  */
    /* JADX WARN: Code duplicated, block: B:115:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x014e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:120:0x0156  */
    /* JADX WARN: Code duplicated, block: B:123:0x0162  */
    /* JADX WARN: Code duplicated, block: B:125:0x0168  */
    /* JADX WARN: Code duplicated, block: B:126:0x016b  */
    /* JADX WARN: Code duplicated, block: B:130:0x017b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0185  */
    /* JADX WARN: Code duplicated, block: B:137:0x018e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0195  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:168:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:172:0x0201  */
    /* JADX WARN: Code duplicated, block: B:173:0x020a  */
    /* JADX WARN: Code duplicated, block: B:176:0x020e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0210  */
    /* JADX WARN: Code duplicated, block: B:179:0x0214  */
    /* JADX WARN: Code duplicated, block: B:181:0x022b  */
    /* JADX WARN: Code duplicated, block: B:183:0x026d  */
    /* JADX WARN: Code duplicated, block: B:186:0x0284  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    public static final void b(qim0 qim0Var, tl3 tl3Var, hw61 hw61Var, pgx pgxVar, vzq0 vzq0Var, max maxVar, boolean z, idn0 idn0Var, ga80 ga80Var, gbx gbxVar, gbx gbxVar2, xu30 xu30Var, b0k b0kVar, int i, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        tl3 tl3Var2;
        hw61 hw61Var2;
        int i5;
        pgx pgxVar2;
        int i6;
        vzq0 vzq0Var2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        idn0 idn0Var2;
        ga80 ga80Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        max maxVar2;
        gbx gbxVar3;
        qim0 qim0Var3;
        tl3 tl3Var3;
        pgx pgxVar3;
        vzq0 vzq0Var3;
        ga80 ga80Var3;
        idn0 idn0Var3;
        boolean z4;
        hw61 hw61Var3;
        gbx gbxVar4;
        h311 h311VarV;
        qim0 qim0Var4;
        tl3 tl3Var4;
        hw61 hw61VarL;
        pgx pgxVar4;
        vzq0 vzq0VarJ;
        max maxVar3;
        idn0 idn0VarY;
        ga80 ga80VarO;
        gbx gbxVar5;
        gbx gbxVar6;
        gbx gbxVar7;
        vzq0 vzq0Var4;
        max maxVar4;
        boolean z5;
        int i16;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1289970761);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i4 = (x340Var.g(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i4 = i;
        }
        int i18 = i3 & 2;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                tl3Var2 = tl3Var;
                i4 |= x340Var.g(tl3Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    hw61Var2 = hw61Var;
                    int i19 = x340Var.g(hw61Var2) ? 256 : 128;
                    i4 |= i19;
                } else {
                    hw61Var2 = hw61Var;
                }
                i4 |= i19;
            } else {
                hw61Var2 = hw61Var;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i & 3072) == 0) {
                    pgxVar2 = pgxVar;
                    if (x340Var.g(pgxVar2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        vzq0Var2 = vzq0Var;
                        int i20 = x340Var.g(vzq0Var2) ? 16384 : 8192;
                        i4 |= i20;
                    } else {
                        vzq0Var2 = vzq0Var;
                    }
                    i4 |= i20;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (x340Var.g(maxVar)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 1572864) == 0) {
                        if (x340Var.h(z2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                if ((i & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        idn0Var2 = idn0Var;
                        int i21 = x340Var.g(idn0Var2) ? 8388608 : 4194304;
                        i4 |= i21;
                    } else {
                        idn0Var2 = idn0Var;
                    }
                    i4 |= i21;
                } else {
                    idn0Var2 = idn0Var;
                }
                if ((i & 100663296) == 0) {
                    if ((i3 & 256) == 0) {
                        ga80Var2 = ga80Var;
                        int i22 = x340Var.g(ga80Var2) ? 67108864 : 33554432;
                        i4 |= i22;
                    } else {
                        ga80Var2 = ga80Var;
                    }
                    i4 |= i22;
                } else {
                    ga80Var2 = ga80Var;
                }
                i11 = i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
                if (i11 != 0) {
                    if ((i & 805306368) == 0) {
                        if (x340Var.g(gbxVar)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.g(gbxVar2)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i2 | i15;
                    } else {
                        i14 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        if (x340Var.i(xu30Var)) {
                            i16 = 32;
                        } else {
                            i16 = 16;
                        }
                        i14 |= i16;
                    }
                    if ((i4 & 306783379) == 306783378 || (i14 & 19) != 18) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (x340Var.Y(i4 & 1, z3)) {
                        x340Var.d0();
                        if ((i & 1) != 0 || x340Var.E()) {
                            if (i17 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i18 != 0) {
                                tl3Var4 = een.d;
                            } else {
                                tl3Var4 = tl3Var2;
                            }
                            if ((i3 & 4) != 0) {
                                hw61VarL = rno1.l(x340Var);
                                i4 &= -897;
                            } else {
                                hw61VarL = hw61Var2;
                            }
                            if (i5 != 0) {
                                pgxVar4 = ngx.e;
                            } else {
                                pgxVar4 = pgxVar2;
                            }
                            if ((i3 & 16) != 0) {
                                vzq0VarJ = rno1.j(x340Var);
                                i4 &= -57345;
                            } else {
                                vzq0VarJ = vzq0Var2;
                            }
                            if (i7 != 0) {
                                maxVar3 = jax.a;
                            } else {
                                maxVar3 = maxVar;
                            }
                            boolean z6 = i9 == 0 ? z2 : false;
                            if ((i3 & 128) != 0) {
                                idn0VarY = zso1.Y(x340Var);
                                i4 &= -29360129;
                            } else {
                                idn0VarY = idn0Var2;
                            }
                            if ((i3 & 256) != 0) {
                                ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                            } else {
                                ga80VarO = ga80Var2;
                            }
                            if (i11 != 0) {
                                gbxVar5 = null;
                            } else {
                                gbxVar5 = gbxVar;
                            }
                            if (i13 != 0) {
                                gbxVar6 = null;
                            } else {
                                gbxVar6 = gbxVar2;
                            }
                            gbxVar7 = gbxVar5;
                            vzq0Var4 = vzq0VarJ;
                            maxVar4 = maxVar3;
                            z5 = z6;
                        } else {
                            x340Var.b0();
                            maxVar4 = maxVar;
                            gbxVar7 = gbxVar;
                            gbxVar6 = gbxVar2;
                            z5 = z2;
                            qim0Var4 = qim0Var2;
                            idn0VarY = idn0Var2;
                            ga80VarO = ga80Var2;
                            tl3Var4 = tl3Var2;
                            hw61VarL = hw61Var2;
                            pgxVar4 = pgxVar2;
                            vzq0Var4 = vzq0Var2;
                        }
                        x340Var.s();
                        gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                        maxVar2 = maxVar4;
                        pgxVar3 = pgxVar4;
                        idn0Var3 = idn0VarY;
                        z4 = z5;
                        qim0Var3 = qim0Var4;
                        gbxVar4 = gbxVar7;
                        gbxVar3 = gbxVar6;
                        hw61Var3 = hw61VarL;
                        vzq0Var3 = vzq0Var4;
                        tl3Var3 = tl3Var4;
                        ga80Var3 = ga80VarO;
                    } else {
                        x340Var.b0();
                        maxVar2 = maxVar;
                        gbxVar3 = gbxVar2;
                        qim0Var3 = qim0Var2;
                        tl3Var3 = tl3Var2;
                        pgxVar3 = pgxVar2;
                        vzq0Var3 = vzq0Var2;
                        ga80Var3 = ga80Var2;
                        idn0Var3 = idn0Var2;
                        z4 = z2;
                        hw61Var3 = hw61Var2;
                        gbxVar4 = gbxVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
                    }
                }
                i4 |= 805306368;
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.g(gbxVar2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (x340Var.i(xu30Var)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i18 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if ((i3 & 4) != 0) {
                            hw61VarL = rno1.l(x340Var);
                            i4 &= -897;
                        } else {
                            hw61VarL = hw61Var2;
                        }
                        if (i5 != 0) {
                            pgxVar4 = ngx.e;
                        } else {
                            pgxVar4 = pgxVar2;
                        }
                        if ((i3 & 16) != 0) {
                            vzq0VarJ = rno1.j(x340Var);
                            i4 &= -57345;
                        } else {
                            vzq0VarJ = vzq0Var2;
                        }
                        if (i7 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -29360129;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if ((i3 & 256) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                        } else {
                            ga80VarO = ga80Var2;
                        }
                        if (i11 != 0) {
                            gbxVar5 = null;
                        } else {
                            gbxVar5 = gbxVar;
                        }
                        if (i13 != 0) {
                            gbxVar6 = null;
                        } else {
                            gbxVar6 = gbxVar2;
                        }
                        gbxVar7 = gbxVar5;
                        vzq0Var4 = vzq0VarJ;
                        maxVar4 = maxVar3;
                        z5 = z6;
                    } else {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i18 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if ((i3 & 4) != 0) {
                            hw61VarL = rno1.l(x340Var);
                            i4 &= -897;
                        } else {
                            hw61VarL = hw61Var2;
                        }
                        if (i5 != 0) {
                            pgxVar4 = ngx.e;
                        } else {
                            pgxVar4 = pgxVar2;
                        }
                        if ((i3 & 16) != 0) {
                            vzq0VarJ = rno1.j(x340Var);
                            i4 &= -57345;
                        } else {
                            vzq0VarJ = vzq0Var2;
                        }
                        if (i7 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -29360129;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if ((i3 & 256) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                        } else {
                            ga80VarO = ga80Var2;
                        }
                        if (i11 != 0) {
                            gbxVar5 = null;
                        } else {
                            gbxVar5 = gbxVar;
                        }
                        if (i13 != 0) {
                            gbxVar6 = null;
                        } else {
                            gbxVar6 = gbxVar2;
                        }
                        gbxVar7 = gbxVar5;
                        vzq0Var4 = vzq0VarJ;
                        maxVar4 = maxVar3;
                        z5 = z6;
                    }
                    x340Var.s();
                    gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                    maxVar2 = maxVar4;
                    pgxVar3 = pgxVar4;
                    idn0Var3 = idn0VarY;
                    z4 = z5;
                    qim0Var3 = qim0Var4;
                    gbxVar4 = gbxVar7;
                    gbxVar3 = gbxVar6;
                    hw61Var3 = hw61VarL;
                    vzq0Var3 = vzq0Var4;
                    tl3Var3 = tl3Var4;
                    ga80Var3 = ga80VarO;
                } else {
                    x340Var.b0();
                    maxVar2 = maxVar;
                    gbxVar3 = gbxVar2;
                    qim0Var3 = qim0Var2;
                    tl3Var3 = tl3Var2;
                    pgxVar3 = pgxVar2;
                    vzq0Var3 = vzq0Var2;
                    ga80Var3 = ga80Var2;
                    idn0Var3 = idn0Var2;
                    z4 = z2;
                    hw61Var3 = hw61Var2;
                    gbxVar4 = gbxVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
                }
            }
            i4 |= 3072;
            pgxVar2 = pgxVar;
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    vzq0Var2 = vzq0Var;
                    if (x340Var.g(vzq0Var2)) {
                    }
                    i4 |= i20;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i4 |= i20;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.g(maxVar)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    if (x340Var.h(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                    }
                    i4 |= i21;
                } else {
                    idn0Var2 = idn0Var;
                }
                i4 |= i21;
            } else {
                idn0Var2 = idn0Var;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    ga80Var2 = ga80Var;
                    if (x340Var.g(ga80Var2)) {
                    }
                    i4 |= i22;
                } else {
                    ga80Var2 = ga80Var;
                }
                i4 |= i22;
            } else {
                ga80Var2 = ga80Var;
            }
            i11 = i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            if (i11 != 0) {
                if ((i & 805306368) == 0) {
                    if (x340Var.g(gbxVar)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.g(gbxVar2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (x340Var.i(xu30Var)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i18 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if ((i3 & 4) != 0) {
                            hw61VarL = rno1.l(x340Var);
                            i4 &= -897;
                        } else {
                            hw61VarL = hw61Var2;
                        }
                        if (i5 != 0) {
                            pgxVar4 = ngx.e;
                        } else {
                            pgxVar4 = pgxVar2;
                        }
                        if ((i3 & 16) != 0) {
                            vzq0VarJ = rno1.j(x340Var);
                            i4 &= -57345;
                        } else {
                            vzq0VarJ = vzq0Var2;
                        }
                        if (i7 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -29360129;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if ((i3 & 256) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                        } else {
                            ga80VarO = ga80Var2;
                        }
                        if (i11 != 0) {
                            gbxVar5 = null;
                        } else {
                            gbxVar5 = gbxVar;
                        }
                        if (i13 != 0) {
                            gbxVar6 = null;
                        } else {
                            gbxVar6 = gbxVar2;
                        }
                        gbxVar7 = gbxVar5;
                        vzq0Var4 = vzq0VarJ;
                        maxVar4 = maxVar3;
                        z5 = z6;
                    } else {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i18 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if ((i3 & 4) != 0) {
                            hw61VarL = rno1.l(x340Var);
                            i4 &= -897;
                        } else {
                            hw61VarL = hw61Var2;
                        }
                        if (i5 != 0) {
                            pgxVar4 = ngx.e;
                        } else {
                            pgxVar4 = pgxVar2;
                        }
                        if ((i3 & 16) != 0) {
                            vzq0VarJ = rno1.j(x340Var);
                            i4 &= -57345;
                        } else {
                            vzq0VarJ = vzq0Var2;
                        }
                        if (i7 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -29360129;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if ((i3 & 256) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                        } else {
                            ga80VarO = ga80Var2;
                        }
                        if (i11 != 0) {
                            gbxVar5 = null;
                        } else {
                            gbxVar5 = gbxVar;
                        }
                        if (i13 != 0) {
                            gbxVar6 = null;
                        } else {
                            gbxVar6 = gbxVar2;
                        }
                        gbxVar7 = gbxVar5;
                        vzq0Var4 = vzq0VarJ;
                        maxVar4 = maxVar3;
                        z5 = z6;
                    }
                    x340Var.s();
                    gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                    maxVar2 = maxVar4;
                    pgxVar3 = pgxVar4;
                    idn0Var3 = idn0VarY;
                    z4 = z5;
                    qim0Var3 = qim0Var4;
                    gbxVar4 = gbxVar7;
                    gbxVar3 = gbxVar6;
                    hw61Var3 = hw61VarL;
                    vzq0Var3 = vzq0Var4;
                    tl3Var3 = tl3Var4;
                    ga80Var3 = ga80VarO;
                } else {
                    x340Var.b0();
                    maxVar2 = maxVar;
                    gbxVar3 = gbxVar2;
                    qim0Var3 = qim0Var2;
                    tl3Var3 = tl3Var2;
                    pgxVar3 = pgxVar2;
                    vzq0Var3 = vzq0Var2;
                    ga80Var3 = ga80Var2;
                    idn0Var3 = idn0Var2;
                    z4 = z2;
                    hw61Var3 = hw61Var2;
                    gbxVar4 = gbxVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
                }
            }
            i4 |= 805306368;
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.g(gbxVar2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            if ((i2 & 48) == 0) {
                if (x340Var.i(xu30Var)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 4) != 0) {
                        hw61VarL = rno1.l(x340Var);
                        i4 &= -897;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        pgxVar4 = ngx.e;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 16) != 0) {
                        vzq0VarJ = rno1.j(x340Var);
                        i4 &= -57345;
                    } else {
                        vzq0VarJ = vzq0Var2;
                    }
                    if (i7 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -29360129;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if ((i3 & 256) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                    } else {
                        ga80VarO = ga80Var2;
                    }
                    if (i11 != 0) {
                        gbxVar5 = null;
                    } else {
                        gbxVar5 = gbxVar;
                    }
                    if (i13 != 0) {
                        gbxVar6 = null;
                    } else {
                        gbxVar6 = gbxVar2;
                    }
                    gbxVar7 = gbxVar5;
                    vzq0Var4 = vzq0VarJ;
                    maxVar4 = maxVar3;
                    z5 = z6;
                } else {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 4) != 0) {
                        hw61VarL = rno1.l(x340Var);
                        i4 &= -897;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        pgxVar4 = ngx.e;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 16) != 0) {
                        vzq0VarJ = rno1.j(x340Var);
                        i4 &= -57345;
                    } else {
                        vzq0VarJ = vzq0Var2;
                    }
                    if (i7 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -29360129;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if ((i3 & 256) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                    } else {
                        ga80VarO = ga80Var2;
                    }
                    if (i11 != 0) {
                        gbxVar5 = null;
                    } else {
                        gbxVar5 = gbxVar;
                    }
                    if (i13 != 0) {
                        gbxVar6 = null;
                    } else {
                        gbxVar6 = gbxVar2;
                    }
                    gbxVar7 = gbxVar5;
                    vzq0Var4 = vzq0VarJ;
                    maxVar4 = maxVar3;
                    z5 = z6;
                }
                x340Var.s();
                gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                maxVar2 = maxVar4;
                pgxVar3 = pgxVar4;
                idn0Var3 = idn0VarY;
                z4 = z5;
                qim0Var3 = qim0Var4;
                gbxVar4 = gbxVar7;
                gbxVar3 = gbxVar6;
                hw61Var3 = hw61VarL;
                vzq0Var3 = vzq0Var4;
                tl3Var3 = tl3Var4;
                ga80Var3 = ga80VarO;
            } else {
                x340Var.b0();
                maxVar2 = maxVar;
                gbxVar3 = gbxVar2;
                qim0Var3 = qim0Var2;
                tl3Var3 = tl3Var2;
                pgxVar3 = pgxVar2;
                vzq0Var3 = vzq0Var2;
                ga80Var3 = ga80Var2;
                idn0Var3 = idn0Var2;
                z4 = z2;
                hw61Var3 = hw61Var2;
                gbxVar4 = gbxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
            }
        }
        i4 |= 48;
        tl3Var2 = tl3Var;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                hw61Var2 = hw61Var;
                if (x340Var.g(hw61Var2)) {
                }
                i4 |= i19;
            } else {
                hw61Var2 = hw61Var;
            }
            i4 |= i19;
        } else {
            hw61Var2 = hw61Var;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i & 3072) == 0) {
                pgxVar2 = pgxVar;
                if (x340Var.g(pgxVar2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    vzq0Var2 = vzq0Var;
                    if (x340Var.g(vzq0Var2)) {
                    }
                    i4 |= i20;
                } else {
                    vzq0Var2 = vzq0Var;
                }
                i4 |= i20;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.g(maxVar)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 1572864) == 0) {
                    if (x340Var.h(z2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
            }
            if ((i & 12582912) == 0) {
                if ((i3 & 128) == 0) {
                    idn0Var2 = idn0Var;
                    if (x340Var.g(idn0Var2)) {
                    }
                    i4 |= i21;
                } else {
                    idn0Var2 = idn0Var;
                }
                i4 |= i21;
            } else {
                idn0Var2 = idn0Var;
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    ga80Var2 = ga80Var;
                    if (x340Var.g(ga80Var2)) {
                    }
                    i4 |= i22;
                } else {
                    ga80Var2 = ga80Var;
                }
                i4 |= i22;
            } else {
                ga80Var2 = ga80Var;
            }
            i11 = i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
            if (i11 != 0) {
                if ((i & 805306368) == 0) {
                    if (x340Var.g(gbxVar)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i14 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.g(gbxVar2)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i14 = i2 | i15;
                } else {
                    i14 = i2;
                }
                if ((i2 & 48) == 0) {
                    if (x340Var.i(xu30Var)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                if ((i4 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (x340Var.Y(i4 & 1, z3)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i18 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if ((i3 & 4) != 0) {
                            hw61VarL = rno1.l(x340Var);
                            i4 &= -897;
                        } else {
                            hw61VarL = hw61Var2;
                        }
                        if (i5 != 0) {
                            pgxVar4 = ngx.e;
                        } else {
                            pgxVar4 = pgxVar2;
                        }
                        if ((i3 & 16) != 0) {
                            vzq0VarJ = rno1.j(x340Var);
                            i4 &= -57345;
                        } else {
                            vzq0VarJ = vzq0Var2;
                        }
                        if (i7 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -29360129;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if ((i3 & 256) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                        } else {
                            ga80VarO = ga80Var2;
                        }
                        if (i11 != 0) {
                            gbxVar5 = null;
                        } else {
                            gbxVar5 = gbxVar;
                        }
                        if (i13 != 0) {
                            gbxVar6 = null;
                        } else {
                            gbxVar6 = gbxVar2;
                        }
                        gbxVar7 = gbxVar5;
                        vzq0Var4 = vzq0VarJ;
                        maxVar4 = maxVar3;
                        z5 = z6;
                    } else {
                        if (i17 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i18 != 0) {
                            tl3Var4 = een.d;
                        } else {
                            tl3Var4 = tl3Var2;
                        }
                        if ((i3 & 4) != 0) {
                            hw61VarL = rno1.l(x340Var);
                            i4 &= -897;
                        } else {
                            hw61VarL = hw61Var2;
                        }
                        if (i5 != 0) {
                            pgxVar4 = ngx.e;
                        } else {
                            pgxVar4 = pgxVar2;
                        }
                        if ((i3 & 16) != 0) {
                            vzq0VarJ = rno1.j(x340Var);
                            i4 &= -57345;
                        } else {
                            vzq0VarJ = vzq0Var2;
                        }
                        if (i7 != 0) {
                            maxVar3 = jax.a;
                        } else {
                            maxVar3 = maxVar;
                        }
                        if (i9 == 0) {
                        }
                        if ((i3 & 128) != 0) {
                            idn0VarY = zso1.Y(x340Var);
                            i4 &= -29360129;
                        } else {
                            idn0VarY = idn0Var2;
                        }
                        if ((i3 & 256) != 0) {
                            ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                        } else {
                            ga80VarO = ga80Var2;
                        }
                        if (i11 != 0) {
                            gbxVar5 = null;
                        } else {
                            gbxVar5 = gbxVar;
                        }
                        if (i13 != 0) {
                            gbxVar6 = null;
                        } else {
                            gbxVar6 = gbxVar2;
                        }
                        gbxVar7 = gbxVar5;
                        vzq0Var4 = vzq0VarJ;
                        maxVar4 = maxVar3;
                        z5 = z6;
                    }
                    x340Var.s();
                    gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                    maxVar2 = maxVar4;
                    pgxVar3 = pgxVar4;
                    idn0Var3 = idn0VarY;
                    z4 = z5;
                    qim0Var3 = qim0Var4;
                    gbxVar4 = gbxVar7;
                    gbxVar3 = gbxVar6;
                    hw61Var3 = hw61VarL;
                    vzq0Var3 = vzq0Var4;
                    tl3Var3 = tl3Var4;
                    ga80Var3 = ga80VarO;
                } else {
                    x340Var.b0();
                    maxVar2 = maxVar;
                    gbxVar3 = gbxVar2;
                    qim0Var3 = qim0Var2;
                    tl3Var3 = tl3Var2;
                    pgxVar3 = pgxVar2;
                    vzq0Var3 = vzq0Var2;
                    ga80Var3 = ga80Var2;
                    idn0Var3 = idn0Var2;
                    z4 = z2;
                    hw61Var3 = hw61Var2;
                    gbxVar4 = gbxVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
                }
            }
            i4 |= 805306368;
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.g(gbxVar2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            if ((i2 & 48) == 0) {
                if (x340Var.i(xu30Var)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 4) != 0) {
                        hw61VarL = rno1.l(x340Var);
                        i4 &= -897;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        pgxVar4 = ngx.e;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 16) != 0) {
                        vzq0VarJ = rno1.j(x340Var);
                        i4 &= -57345;
                    } else {
                        vzq0VarJ = vzq0Var2;
                    }
                    if (i7 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -29360129;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if ((i3 & 256) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                    } else {
                        ga80VarO = ga80Var2;
                    }
                    if (i11 != 0) {
                        gbxVar5 = null;
                    } else {
                        gbxVar5 = gbxVar;
                    }
                    if (i13 != 0) {
                        gbxVar6 = null;
                    } else {
                        gbxVar6 = gbxVar2;
                    }
                    gbxVar7 = gbxVar5;
                    vzq0Var4 = vzq0VarJ;
                    maxVar4 = maxVar3;
                    z5 = z6;
                } else {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 4) != 0) {
                        hw61VarL = rno1.l(x340Var);
                        i4 &= -897;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        pgxVar4 = ngx.e;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 16) != 0) {
                        vzq0VarJ = rno1.j(x340Var);
                        i4 &= -57345;
                    } else {
                        vzq0VarJ = vzq0Var2;
                    }
                    if (i7 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -29360129;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if ((i3 & 256) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                    } else {
                        ga80VarO = ga80Var2;
                    }
                    if (i11 != 0) {
                        gbxVar5 = null;
                    } else {
                        gbxVar5 = gbxVar;
                    }
                    if (i13 != 0) {
                        gbxVar6 = null;
                    } else {
                        gbxVar6 = gbxVar2;
                    }
                    gbxVar7 = gbxVar5;
                    vzq0Var4 = vzq0VarJ;
                    maxVar4 = maxVar3;
                    z5 = z6;
                }
                x340Var.s();
                gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                maxVar2 = maxVar4;
                pgxVar3 = pgxVar4;
                idn0Var3 = idn0VarY;
                z4 = z5;
                qim0Var3 = qim0Var4;
                gbxVar4 = gbxVar7;
                gbxVar3 = gbxVar6;
                hw61Var3 = hw61VarL;
                vzq0Var3 = vzq0Var4;
                tl3Var3 = tl3Var4;
                ga80Var3 = ga80VarO;
            } else {
                x340Var.b0();
                maxVar2 = maxVar;
                gbxVar3 = gbxVar2;
                qim0Var3 = qim0Var2;
                tl3Var3 = tl3Var2;
                pgxVar3 = pgxVar2;
                vzq0Var3 = vzq0Var2;
                ga80Var3 = ga80Var2;
                idn0Var3 = idn0Var2;
                z4 = z2;
                hw61Var3 = hw61Var2;
                gbxVar4 = gbxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
            }
        }
        i4 |= 3072;
        pgxVar2 = pgxVar;
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                vzq0Var2 = vzq0Var;
                if (x340Var.g(vzq0Var2)) {
                }
                i4 |= i20;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i4 |= i20;
        } else {
            vzq0Var2 = vzq0Var;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (x340Var.g(maxVar)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i4 |= i8;
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 1572864) == 0) {
                if (x340Var.h(z2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i4 |= i10;
            }
        }
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                idn0Var2 = idn0Var;
                if (x340Var.g(idn0Var2)) {
                }
                i4 |= i21;
            } else {
                idn0Var2 = idn0Var;
            }
            i4 |= i21;
        } else {
            idn0Var2 = idn0Var;
        }
        if ((i & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                ga80Var2 = ga80Var;
                if (x340Var.g(ga80Var2)) {
                }
                i4 |= i22;
            } else {
                ga80Var2 = ga80Var;
            }
            i4 |= i22;
        } else {
            ga80Var2 = ga80Var;
        }
        i11 = i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS;
        if (i11 != 0) {
            if ((i & 805306368) == 0) {
                if (x340Var.g(gbxVar)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
                i14 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (x340Var.g(gbxVar2)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i14 = i2 | i15;
            } else {
                i14 = i2;
            }
            if ((i2 & 48) == 0) {
                if (x340Var.i(xu30Var)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            if ((i4 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 4) != 0) {
                        hw61VarL = rno1.l(x340Var);
                        i4 &= -897;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        pgxVar4 = ngx.e;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 16) != 0) {
                        vzq0VarJ = rno1.j(x340Var);
                        i4 &= -57345;
                    } else {
                        vzq0VarJ = vzq0Var2;
                    }
                    if (i7 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -29360129;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if ((i3 & 256) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                    } else {
                        ga80VarO = ga80Var2;
                    }
                    if (i11 != 0) {
                        gbxVar5 = null;
                    } else {
                        gbxVar5 = gbxVar;
                    }
                    if (i13 != 0) {
                        gbxVar6 = null;
                    } else {
                        gbxVar6 = gbxVar2;
                    }
                    gbxVar7 = gbxVar5;
                    vzq0Var4 = vzq0VarJ;
                    maxVar4 = maxVar3;
                    z5 = z6;
                } else {
                    if (i17 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i18 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 4) != 0) {
                        hw61VarL = rno1.l(x340Var);
                        i4 &= -897;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        pgxVar4 = ngx.e;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 16) != 0) {
                        vzq0VarJ = rno1.j(x340Var);
                        i4 &= -57345;
                    } else {
                        vzq0VarJ = vzq0Var2;
                    }
                    if (i7 != 0) {
                        maxVar3 = jax.a;
                    } else {
                        maxVar3 = maxVar;
                    }
                    if (i9 == 0) {
                    }
                    if ((i3 & 128) != 0) {
                        idn0VarY = zso1.Y(x340Var);
                        i4 &= -29360129;
                    } else {
                        idn0VarY = idn0Var2;
                    }
                    if ((i3 & 256) != 0) {
                        ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                    } else {
                        ga80VarO = ga80Var2;
                    }
                    if (i11 != 0) {
                        gbxVar5 = null;
                    } else {
                        gbxVar5 = gbxVar;
                    }
                    if (i13 != 0) {
                        gbxVar6 = null;
                    } else {
                        gbxVar6 = gbxVar2;
                    }
                    gbxVar7 = gbxVar5;
                    vzq0Var4 = vzq0VarJ;
                    maxVar4 = maxVar3;
                    z5 = z6;
                }
                x340Var.s();
                gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
                maxVar2 = maxVar4;
                pgxVar3 = pgxVar4;
                idn0Var3 = idn0VarY;
                z4 = z5;
                qim0Var3 = qim0Var4;
                gbxVar4 = gbxVar7;
                gbxVar3 = gbxVar6;
                hw61Var3 = hw61VarL;
                vzq0Var3 = vzq0Var4;
                tl3Var3 = tl3Var4;
                ga80Var3 = ga80VarO;
            } else {
                x340Var.b0();
                maxVar2 = maxVar;
                gbxVar3 = gbxVar2;
                qim0Var3 = qim0Var2;
                tl3Var3 = tl3Var2;
                pgxVar3 = pgxVar2;
                vzq0Var3 = vzq0Var2;
                ga80Var3 = ga80Var2;
                idn0Var3 = idn0Var2;
                z4 = z2;
                hw61Var3 = hw61Var2;
                gbxVar4 = gbxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
            }
        }
        i4 |= 805306368;
        i13 = i3 & 1024;
        if (i13 != 0) {
            i14 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (x340Var.g(gbxVar2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i2 | i15;
        } else {
            i14 = i2;
        }
        if ((i2 & 48) == 0) {
            if (x340Var.i(xu30Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i4 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i18 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if ((i3 & 4) != 0) {
                    hw61VarL = rno1.l(x340Var);
                    i4 &= -897;
                } else {
                    hw61VarL = hw61Var2;
                }
                if (i5 != 0) {
                    pgxVar4 = ngx.e;
                } else {
                    pgxVar4 = pgxVar2;
                }
                if ((i3 & 16) != 0) {
                    vzq0VarJ = rno1.j(x340Var);
                    i4 &= -57345;
                } else {
                    vzq0VarJ = vzq0Var2;
                }
                if (i7 != 0) {
                    maxVar3 = jax.a;
                } else {
                    maxVar3 = maxVar;
                }
                if (i9 == 0) {
                }
                if ((i3 & 128) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i4 &= -29360129;
                } else {
                    idn0VarY = idn0Var2;
                }
                if ((i3 & 256) != 0) {
                    ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                } else {
                    ga80VarO = ga80Var2;
                }
                if (i11 != 0) {
                    gbxVar5 = null;
                } else {
                    gbxVar5 = gbxVar;
                }
                if (i13 != 0) {
                    gbxVar6 = null;
                } else {
                    gbxVar6 = gbxVar2;
                }
                gbxVar7 = gbxVar5;
                vzq0Var4 = vzq0VarJ;
                maxVar4 = maxVar3;
                z5 = z6;
            } else {
                if (i17 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i18 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if ((i3 & 4) != 0) {
                    hw61VarL = rno1.l(x340Var);
                    i4 &= -897;
                } else {
                    hw61VarL = hw61Var2;
                }
                if (i5 != 0) {
                    pgxVar4 = ngx.e;
                } else {
                    pgxVar4 = pgxVar2;
                }
                if ((i3 & 16) != 0) {
                    vzq0VarJ = rno1.j(x340Var);
                    i4 &= -57345;
                } else {
                    vzq0VarJ = vzq0Var2;
                }
                if (i7 != 0) {
                    maxVar3 = jax.a;
                } else {
                    maxVar3 = maxVar;
                }
                if (i9 == 0) {
                }
                if ((i3 & 128) != 0) {
                    idn0VarY = zso1.Y(x340Var);
                    i4 &= -29360129;
                } else {
                    idn0VarY = idn0Var2;
                }
                if ((i3 & 256) != 0) {
                    ga80VarO = vno1.o(hw61VarL, x340Var, (i4 >> 6) & 14);
                } else {
                    ga80VarO = ga80Var2;
                }
                if (i11 != 0) {
                    gbxVar5 = null;
                } else {
                    gbxVar5 = gbxVar;
                }
                if (i13 != 0) {
                    gbxVar6 = null;
                } else {
                    gbxVar6 = gbxVar2;
                }
                gbxVar7 = gbxVar5;
                vzq0Var4 = vzq0VarJ;
                maxVar4 = maxVar3;
                z5 = z6;
            }
            x340Var.s();
            gfx.b(pgxVar4.a(), apo.r(40339874, new wcx(maxVar4, pgxVar4, idn0VarY, z5, qim0Var4, gbxVar7, gbxVar6, hw61VarL, vzq0Var4, tl3Var4, xu30Var, ga80VarO), x340Var), x340Var, 48);
            maxVar2 = maxVar4;
            pgxVar3 = pgxVar4;
            idn0Var3 = idn0VarY;
            z4 = z5;
            qim0Var3 = qim0Var4;
            gbxVar4 = gbxVar7;
            gbxVar3 = gbxVar6;
            hw61Var3 = hw61VarL;
            vzq0Var3 = vzq0Var4;
            tl3Var3 = tl3Var4;
            ga80Var3 = ga80VarO;
        } else {
            x340Var.b0();
            maxVar2 = maxVar;
            gbxVar3 = gbxVar2;
            qim0Var3 = qim0Var2;
            tl3Var3 = tl3Var2;
            pgxVar3 = pgxVar2;
            vzq0Var3 = vzq0Var2;
            ga80Var3 = ga80Var2;
            idn0Var3 = idn0Var2;
            z4 = z2;
            hw61Var3 = hw61Var2;
            gbxVar4 = gbxVar;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xcx(qim0Var3, tl3Var3, hw61Var3, pgxVar3, vzq0Var3, maxVar2, z4, idn0Var3, ga80Var3, gbxVar4, gbxVar3, xu30Var, i, i2, i3);
        }
    }

    public static final void b0(TextView textView, boolean z, TextView textView2, int i) {
        textView.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        qhl qhlVar = (qhl) layoutParams;
        if (z) {
            i = 0;
        }
        qhlVar.B = i;
        textView2.setLayoutParams(qhlVar);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0120  */
    /* JADX WARN: Code duplicated, block: B:108:0x012a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:111:0x0133  */
    /* JADX WARN: Code duplicated, block: B:119:0x014a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0153  */
    /* JADX WARN: Code duplicated, block: B:140:0x0197 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0199  */
    /* JADX WARN: Code duplicated, block: B:142:0x019c  */
    /* JADX WARN: Code duplicated, block: B:145:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:155:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x023d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0250  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    public static final void c(boolean z, iu30 iu30Var, qim0 qim0Var, tl3 tl3Var, hw61 hw61Var, pgx pgxVar, vzq0 vzq0Var, max maxVar, boolean z2, idn0 idn0Var, ga80 ga80Var, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        tl3 tl3Var2;
        hw61 hw61Var2;
        pgx pgxVar2;
        vzq0 vzq0Var2;
        int i5;
        max maxVar2;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        x340 x340Var;
        idn0 idn0Var2;
        max maxVar3;
        tl3 tl3Var3;
        hw61 hw61Var3;
        ga80 ga80Var2;
        boolean z5;
        h311 h311VarV;
        int i9;
        jax jaxVar;
        tl3 tl3Var4;
        hw61 hw61VarL;
        idn0 idn0VarY;
        ga80 ga80VarO;
        idn0 idn0Var3;
        int i10;
        hw61 hw61Var4;
        int i11;
        int i12;
        int i13;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1640766510);
        if ((i & 6) == 0) {
            i4 = (x340Var2.h(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i4 |= x340Var2.g(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        int i14 = i3 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                tl3Var2 = tl3Var;
                i4 |= x340Var2.g(tl3Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    hw61Var2 = hw61Var;
                    int i15 = x340Var2.g(hw61Var2) ? 16384 : 8192;
                    i4 |= i15;
                } else {
                    hw61Var2 = hw61Var;
                }
                i4 |= i15;
            } else {
                hw61Var2 = hw61Var;
            }
            if ((196608 & i) == 0) {
                pgxVar2 = pgxVar;
                if (x340Var2.g(pgxVar2)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i4 |= i13;
            } else {
                pgxVar2 = pgxVar;
            }
            if ((1572864 & i) == 0) {
                vzq0Var2 = vzq0Var;
                if (x340Var2.g(vzq0Var2)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            } else {
                vzq0Var2 = vzq0Var;
            }
            i5 = i3 & 128;
            if (i5 != 0) {
                i4 |= 12582912;
                maxVar2 = maxVar;
            } else {
                maxVar2 = maxVar;
                if ((i & 12582912) == 0) {
                    if (x340Var2.g(maxVar2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i4 |= i6;
                }
            }
            if ((i & 100663296) == 0) {
                if ((i3 & 256) == 0) {
                    z3 = z2;
                    int i16 = x340Var2.h(z3) ? 67108864 : 33554432;
                    i4 |= i16;
                } else {
                    z3 = z2;
                }
                i4 |= i16;
            } else {
                z3 = z2;
            }
            i7 = 805306368;
            if ((i & 805306368) != 0) {
                i4 |= ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.g(idn0Var)) ? 268435456 : 536870912;
            }
            if ((i2 & 6) == 0) {
                i8 = i2 | (((i3 & 1024) == 0 || !x340Var2.g(ga80Var)) ? 2 : 4);
            } else {
                i8 = i2;
            }
            if ((i2 & 48) == 0) {
                if (x340Var2.i(j2iVar)) {
                    i11 = 32;
                } else {
                    i11 = 16;
                }
                i8 |= i11;
            }
            if ((i4 & 306783379) == 306783378 || (i8 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i4 & 1, z4)) {
                x340Var2.d0();
                i9 = i & 1;
                jaxVar = jax.a;
                if (i9 != 0 || x340Var2.E()) {
                    if (i14 != 0) {
                        tl3Var4 = een.d;
                    } else {
                        tl3Var4 = tl3Var2;
                    }
                    if ((i3 & 16) != 0) {
                        hw61VarL = rno1.l(x340Var2);
                        i4 &= -57345;
                    } else {
                        hw61VarL = hw61Var2;
                    }
                    if (i5 != 0) {
                        maxVar2 = jaxVar;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                        z3 = z;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        idn0VarY = zso1.Y(x340Var2);
                        i4 &= -1879048193;
                    } else {
                        idn0VarY = idn0Var;
                    }
                    if ((i3 & 1024) != 0) {
                        i8 &= -15;
                        ga80VarO = vno1.o(hw61VarL, x340Var2, (i4 >> 12) & 14);
                    } else {
                        ga80VarO = ga80Var;
                    }
                    idn0Var3 = idn0VarY;
                    i10 = i4;
                    hw61Var4 = hw61VarL;
                } else {
                    x340Var2.b0();
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i3 & 256) != 0) {
                        i4 &= -234881025;
                    }
                    if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                        i4 &= -1879048193;
                    }
                    if ((i3 & 1024) != 0) {
                        i8 &= -15;
                    }
                    hw61Var4 = hw61Var2;
                    i7 = 805306368;
                    i10 = i4;
                    maxVar2 = maxVar2;
                    z3 = z3;
                    tl3Var4 = tl3Var2;
                    idn0Var3 = idn0Var;
                    ga80VarO = ga80Var;
                }
                x340Var2.s();
                qim0 qim0VarC = qmo1.C(qim0Var2, z, idn0Var3, ga80VarO, u890.j(maxVar2, jaxVar), new pm31(2), iu30Var);
                int i17 = i10 >> 6;
                x340Var = x340Var2;
                max maxVar4 = maxVar2;
                b(qim0VarC, tl3Var4, hw61Var4, pgxVar2, vzq0Var2, maxVar4, z3, idn0Var3, null, null, null, j2iVar, x340Var, (i17 & 112) | i7 | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), (i8 & 112) | 6, 256);
                idn0Var2 = idn0Var3;
                ga80Var2 = ga80VarO;
                tl3Var3 = tl3Var4;
                hw61Var3 = hw61Var4;
                maxVar3 = maxVar4;
                z5 = z3;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                idn0Var2 = idn0Var;
                maxVar3 = maxVar2;
                tl3Var3 = tl3Var2;
                hw61Var3 = hw61Var2;
                ga80Var2 = ga80Var;
                z5 = z3;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ycx(z, iu30Var, qim0Var, tl3Var3, hw61Var3, pgxVar, vzq0Var, maxVar3, z5, idn0Var2, ga80Var2, j2iVar, i, i2, i3);
            }
        }
        i4 |= 3072;
        tl3Var2 = tl3Var;
        if ((i & 24576) == 0) {
            if ((i3 & 16) == 0) {
                hw61Var2 = hw61Var;
                if (x340Var2.g(hw61Var2)) {
                }
                i4 |= i15;
            } else {
                hw61Var2 = hw61Var;
            }
            i4 |= i15;
        } else {
            hw61Var2 = hw61Var;
        }
        if ((196608 & i) == 0) {
            pgxVar2 = pgxVar;
            if (x340Var2.g(pgxVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i4 |= i13;
        } else {
            pgxVar2 = pgxVar;
        }
        if ((1572864 & i) == 0) {
            vzq0Var2 = vzq0Var;
            if (x340Var2.g(vzq0Var2)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        } else {
            vzq0Var2 = vzq0Var;
        }
        i5 = i3 & 128;
        if (i5 != 0) {
            i4 |= 12582912;
            maxVar2 = maxVar;
        } else {
            maxVar2 = maxVar;
            if ((i & 12582912) == 0) {
                if (x340Var2.g(maxVar2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i4 |= i6;
            }
        }
        if ((i & 100663296) == 0) {
            if ((i3 & 256) == 0) {
                z3 = z2;
                if (x340Var2.h(z3)) {
                }
                i4 |= i16;
            } else {
                z3 = z2;
            }
            i4 |= i16;
        } else {
            z3 = z2;
        }
        i7 = 805306368;
        if ((i & 805306368) != 0) {
            i4 |= ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) == 0 || !x340Var2.g(idn0Var)) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i8 = i2 | (((i3 & 1024) == 0 || !x340Var2.g(ga80Var)) ? 2 : 4);
        } else {
            i8 = i2;
        }
        if ((i2 & 48) == 0) {
            if (x340Var2.i(j2iVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i8 |= i11;
        }
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (x340Var2.Y(i4 & 1, z4)) {
            x340Var2.d0();
            i9 = i & 1;
            jaxVar = jax.a;
            if (i9 != 0) {
                if (i14 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if ((i3 & 16) != 0) {
                    hw61VarL = rno1.l(x340Var2);
                    i4 &= -57345;
                } else {
                    hw61VarL = hw61Var2;
                }
                if (i5 != 0) {
                    maxVar2 = jaxVar;
                }
                if ((i3 & 256) != 0) {
                    i4 &= -234881025;
                    z3 = z;
                }
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    idn0VarY = zso1.Y(x340Var2);
                    i4 &= -1879048193;
                } else {
                    idn0VarY = idn0Var;
                }
                if ((i3 & 1024) != 0) {
                    i8 &= -15;
                    ga80VarO = vno1.o(hw61VarL, x340Var2, (i4 >> 12) & 14);
                } else {
                    ga80VarO = ga80Var;
                }
                idn0Var3 = idn0VarY;
                i10 = i4;
                hw61Var4 = hw61VarL;
            } else {
                if (i14 != 0) {
                    tl3Var4 = een.d;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if ((i3 & 16) != 0) {
                    hw61VarL = rno1.l(x340Var2);
                    i4 &= -57345;
                } else {
                    hw61VarL = hw61Var2;
                }
                if (i5 != 0) {
                    maxVar2 = jaxVar;
                }
                if ((i3 & 256) != 0) {
                    i4 &= -234881025;
                    z3 = z;
                }
                if ((i3 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
                    idn0VarY = zso1.Y(x340Var2);
                    i4 &= -1879048193;
                } else {
                    idn0VarY = idn0Var;
                }
                if ((i3 & 1024) != 0) {
                    i8 &= -15;
                    ga80VarO = vno1.o(hw61VarL, x340Var2, (i4 >> 12) & 14);
                } else {
                    ga80VarO = ga80Var;
                }
                idn0Var3 = idn0VarY;
                i10 = i4;
                hw61Var4 = hw61VarL;
            }
            x340Var2.s();
            qim0 qim0VarC2 = qmo1.C(qim0Var2, z, idn0Var3, ga80VarO, u890.j(maxVar2, jaxVar), new pm31(2), iu30Var);
            int i18 = i10 >> 6;
            x340Var = x340Var2;
            max maxVar5 = maxVar2;
            b(qim0VarC2, tl3Var4, hw61Var4, pgxVar2, vzq0Var2, maxVar5, z3, idn0Var3, null, null, null, j2iVar, x340Var, (i18 & 112) | i7 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128), (i8 & 112) | 6, 256);
            idn0Var2 = idn0Var3;
            ga80Var2 = ga80VarO;
            tl3Var3 = tl3Var4;
            hw61Var3 = hw61Var4;
            maxVar3 = maxVar5;
            z5 = z3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            idn0Var2 = idn0Var;
            maxVar3 = maxVar2;
            tl3Var3 = tl3Var2;
            hw61Var3 = hw61Var2;
            ga80Var2 = ga80Var;
            z5 = z3;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ycx(z, iu30Var, qim0Var, tl3Var3, hw61Var3, pgxVar, vzq0Var, maxVar3, z5, idn0Var2, ga80Var2, j2iVar, i, i2, i3);
        }
    }

    public static final void c0(ImageView imageView, boolean z, boolean z2) {
        imageView.setVisibility((z && z2) ? 0 : 8);
        if (imageView.getVisibility() == 0) {
            imageView.setImageResource(2131232855);
            imageView.setColorFilter(x74.D(imageView.getContext(), 2131102822));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:95:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x0142  */
    public static final void d(int i, int i2, long j, tl3 tl3Var, b0k b0kVar, xu30 xu30Var, qim0 qim0Var, lee1 lee1Var) {
        int i3;
        qim0 qim0Var2;
        tl3 tl3Var2;
        int i4;
        lee1 lee1Var2;
        long j2;
        boolean z;
        h311 h311VarV;
        qim0 qim0Var3;
        tl3 tl3Var3;
        lee1 lee1Var3;
        qim0 qim0Var4;
        tl3 tl3Var4;
        lee1 lee1Var4;
        long j3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1005619908);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(xu30Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    tl3Var2 = tl3Var;
                    int i6 = x340Var.i(tl3Var2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    tl3Var2 = tl3Var;
                }
                i3 |= i6;
            } else {
                tl3Var2 = tl3Var;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    lee1Var2 = lee1Var;
                    int i7 = x340Var.i(lee1Var2) ? 16384 : 8192;
                    i4 |= i7;
                } else {
                    lee1Var2 = lee1Var;
                }
                i4 |= i7;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j2 = j;
                    int i8 = x340Var.f(j2) ? 131072 : 65536;
                    i4 |= i8;
                } else {
                    j2 = j;
                }
                i4 |= i8;
            } else {
                j2 = j;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i5 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if ((i2 & 4) != 0) {
                        tl3Var3 = een.d;
                        i4 &= -897;
                    } else {
                        tl3Var3 = tl3Var2;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        lee1Var3 = cbx.d(x340Var).g;
                        i4 &= -57345;
                    } else {
                        lee1Var3 = lee1Var2;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar2 = cbx.a;
                        i4 &= -458753;
                        qim0Var4 = qim0Var3;
                        tl3Var4 = tl3Var3;
                        lee1Var4 = lee1Var3;
                        j2 = cbx.a(x340Var).b.a;
                    } else {
                        qim0Var4 = qim0Var3;
                        tl3Var4 = tl3Var3;
                        lee1Var4 = lee1Var3;
                    }
                } else {
                    x340Var.b0();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    qim0Var4 = qim0Var2;
                    tl3Var4 = tl3Var2;
                    lee1Var4 = lee1Var2;
                }
                x340Var.s();
                if (xu30Var != null) {
                    x340Var.i0(-1025447479);
                    j3 = j2;
                    e(((i4 >> 3) & 65534) | ((i4 << 15) & 458752), 0, j3, tl3Var4, x340Var, xu30Var, qim0Var4, lee1Var4);
                    x340Var.r(false);
                } else {
                    j3 = j2;
                    x340Var.i0(-1025296602);
                    x340Var.r(false);
                }
                j2 = j3;
                tl3Var2 = tl3Var4;
                qim0Var2 = qim0Var4;
                lee1Var2 = lee1Var4;
            } else {
                x340Var.b0();
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hxx(xu30Var, qim0Var2, tl3Var2, lee1Var2, j2, i, i2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                tl3Var2 = tl3Var;
                if (x340Var.i(tl3Var2)) {
                }
                i3 |= i6;
            } else {
                tl3Var2 = tl3Var;
            }
            i3 |= i6;
        } else {
            tl3Var2 = tl3Var;
        }
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                lee1Var2 = lee1Var;
                if (x340Var.i(lee1Var2)) {
                }
                i4 |= i7;
            } else {
                lee1Var2 = lee1Var;
            }
            i4 |= i7;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j2 = j;
                if (x340Var.f(j2)) {
                }
                i4 |= i8;
            } else {
                j2 = j;
            }
            i4 |= i8;
        } else {
            j2 = j;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i2 & 4) != 0) {
                    tl3Var3 = een.d;
                    i4 &= -897;
                } else {
                    tl3Var3 = tl3Var2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar3 = cbx.a;
                    lee1Var3 = cbx.d(x340Var).g;
                    i4 &= -57345;
                } else {
                    lee1Var3 = lee1Var2;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar4 = cbx.a;
                    i4 &= -458753;
                    qim0Var4 = qim0Var3;
                    tl3Var4 = tl3Var3;
                    lee1Var4 = lee1Var3;
                    j2 = cbx.a(x340Var).b.a;
                } else {
                    qim0Var4 = qim0Var3;
                    tl3Var4 = tl3Var3;
                    lee1Var4 = lee1Var3;
                }
            } else {
                if (i5 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i2 & 4) != 0) {
                    tl3Var3 = een.d;
                    i4 &= -897;
                } else {
                    tl3Var3 = tl3Var2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar5 = cbx.a;
                    lee1Var3 = cbx.d(x340Var).g;
                    i4 &= -57345;
                } else {
                    lee1Var3 = lee1Var2;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar6 = cbx.a;
                    i4 &= -458753;
                    qim0Var4 = qim0Var3;
                    tl3Var4 = tl3Var3;
                    lee1Var4 = lee1Var3;
                    j2 = cbx.a(x340Var).b.a;
                } else {
                    qim0Var4 = qim0Var3;
                    tl3Var4 = tl3Var3;
                    lee1Var4 = lee1Var3;
                }
            }
            x340Var.s();
            if (xu30Var != null) {
                x340Var.i0(-1025447479);
                j3 = j2;
                e(((i4 >> 3) & 65534) | ((i4 << 15) & 458752), 0, j3, tl3Var4, x340Var, xu30Var, qim0Var4, lee1Var4);
                x340Var.r(false);
            } else {
                j3 = j2;
                x340Var.i0(-1025296602);
                x340Var.r(false);
            }
            j2 = j3;
            tl3Var2 = tl3Var4;
            qim0Var2 = qim0Var4;
            lee1Var2 = lee1Var4;
        } else {
            x340Var.b0();
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hxx(xu30Var, qim0Var2, tl3Var2, lee1Var2, j2, i, i2);
        }
    }

    public static void d0(od50 od50Var, ArrayList arrayList) {
        ArrayList arrayList2 = od50Var.b;
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            md50 md50Var = (md50) arrayList2.get(i);
            if (md50Var.g != null) {
                arrayList3.add(new Pair(md50Var.g, arrayList.get(i)));
            }
        }
        if (arrayList3.size() > 0) {
            Runnable ag20Var = new ag20(arrayList3, od50Var, (byte) 3);
            Handler handler = od50Var.a;
            if (handler != null) {
                handler.post(ag20Var);
            } else {
                ag20Var.run();
            }
        }
    }

    public static final void e(int i, int i2, long j, tl3 tl3Var, b0k b0kVar, xu30 xu30Var, qim0 qim0Var, lee1 lee1Var) {
        qim0 qim0Var2;
        int i3;
        tl3 tl3Var2;
        lee1 lee1Var2;
        long j2;
        tl3 tl3Var3;
        lee1 lee1Var3;
        long j3;
        qim0 qim0Var3;
        tl3 tl3Var4;
        lee1 lee1Var4;
        long j4;
        lee1 lee1Var5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1763625924);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i3 = (x340Var.i(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                tl3Var2 = tl3Var;
                int i5 = x340Var.i(tl3Var2) ? 32 : 16;
                i3 |= i5;
            } else {
                tl3Var2 = tl3Var;
            }
            i3 |= i5;
        } else {
            tl3Var2 = tl3Var;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= x340Var.h(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                lee1Var2 = lee1Var;
                int i6 = x340Var.i(lee1Var2) ? 2048 : 1024;
                i3 |= i6;
            } else {
                lee1Var2 = lee1Var;
            }
            i3 |= i6;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j2 = j;
                int i7 = x340Var.f(j2) ? 16384 : 8192;
                i3 |= i7;
            } else {
                j2 = j;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.i(xu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = i4 != 0 ? nim0.a : qim0Var2;
                if ((i2 & 2) != 0) {
                    tl3Var4 = een.d;
                    i3 &= -113;
                } else {
                    tl3Var4 = tl3Var2;
                }
                if ((i2 & 8) != 0) {
                    uwr uwrVar = cbx.a;
                    lee1Var4 = cbx.d(x340Var).g;
                    i3 &= -7169;
                } else {
                    lee1Var4 = lee1Var2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar2 = cbx.a;
                    i3 &= -57345;
                    lee1Var5 = lee1Var4;
                    j4 = cbx.a(x340Var).b.a;
                } else {
                    j4 = j2;
                    lee1Var5 = lee1Var4;
                }
            } else {
                x340Var.b0();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                qim0Var3 = qim0Var2;
                tl3Var4 = tl3Var2;
                j4 = j2;
                lee1Var5 = lee1Var2;
            }
            x340Var.s();
            int i8 = i3 >> 9;
            b3o1.j(lee1Var5, j4, apo.r(-962608056, new g6w(qim0Var3, tl3Var4, xu30Var, (byte) 13), x340Var), x340Var, (i8 & 14) | 384 | (i8 & 112), 0);
            tl3Var3 = tl3Var4;
            lee1Var3 = lee1Var5;
            j3 = j4;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            tl3Var3 = tl3Var2;
            lee1Var3 = lee1Var2;
            j3 = j2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hxx(qim0Var2, tl3Var3, lee1Var3, j3, xu30Var, i, i2);
        }
    }

    public static final MaybeCreate e0(o8n o8nVar, vu30 vu30Var) {
        if (o8nVar.A(fkj0.W0) == null) {
            return new MaybeCreate(new x141(o8nVar, vu30Var));
        }
        bhn0.s(o8nVar, "Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010d  */
    /* JADX WARN: Code duplicated, block: B:101:0x010f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0118  */
    /* JADX WARN: Code duplicated, block: B:107:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x016c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0173  */
    /* JADX WARN: Code duplicated, block: B:116:0x0179  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:96:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0101  */
    public static final void f(jmr0 jmr0Var, String str, qim0 qim0Var, tl3 tl3Var, j6m j6mVar, float f, ColorFilter colorFilter, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        int i5;
        int i6;
        j6m j6mVar2;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        ColorFilter colorFilter2;
        qim0 qim0Var3;
        j6m j6mVar3;
        float f3;
        tl3 tl3Var2;
        h311 h311VarV;
        qim0 qim0VarB;
        qim0 qim0Var4;
        tl3 tl3Var3;
        j6m j6mVar4;
        float f4;
        ColorFilter colorFilter3;
        qim0 qim0Var5;
        Object objT;
        gfh0 gfh0Var;
        int iHashCode;
        qim0 qim0VarE;
        xos0 xos0VarM;
        boolean z2;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(jmr0Var) : x340Var.i(jmr0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (x340Var.g(tl3Var)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        j6mVar2 = j6mVar;
                        if (x340Var.g(j6mVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (x340Var.d(f2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            if (x340Var.g(colorFilter)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i12 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i12 & 1, z)) {
                            qim0VarB = nim0.a;
                            if (i13 != 0) {
                                qim0Var4 = qim0VarB;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i4 != 0) {
                                tl3Var3 = een.h;
                            } else {
                                tl3Var3 = tl3Var;
                            }
                            if (i6 != 0) {
                                j6mVar4 = mif1.Q0;
                            } else {
                                j6mVar4 = j6mVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                colorFilter3 = null;
                            } else {
                                colorFilter3 = colorFilter;
                            }
                            if (str != null) {
                                x340Var.i0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objT2 = x340Var.T();
                                if (z2 || objT2 == m4cVar) {
                                    objT2 = new jfa(str, (byte) 8);
                                    x340Var.s0(objT2);
                                }
                                qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(1899381698);
                                x340Var.r(false);
                            }
                            qim0Var5 = qim0Var4;
                            qim0 qim0VarS = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                            objT = x340Var.T();
                            if (objT == m4cVar) {
                                objT = d7x.d;
                                x340Var.s0(objT);
                            }
                            gfh0Var = (gfh0) objT;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarS);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0Var, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            f3 = f4;
                            colorFilter2 = colorFilter3;
                            tl3Var2 = tl3Var3;
                            j6mVar3 = j6mVar4;
                            qim0Var3 = qim0Var5;
                        } else {
                            x340Var.b0();
                            colorFilter2 = colorFilter;
                            qim0Var3 = qim0Var2;
                            j6mVar3 = j6mVar2;
                            f3 = f2;
                            tl3Var2 = tl3Var;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (x340Var.g(colorFilter)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i12 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i12 & 1, z)) {
                        qim0VarB = nim0.a;
                        if (i13 != 0) {
                            qim0Var4 = qim0VarB;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            tl3Var3 = een.h;
                        } else {
                            tl3Var3 = tl3Var;
                        }
                        if (i6 != 0) {
                            j6mVar4 = mif1.Q0;
                        } else {
                            j6mVar4 = j6mVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            colorFilter3 = null;
                        } else {
                            colorFilter3 = colorFilter;
                        }
                        if (str != null) {
                            x340Var.i0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT2 = x340Var.T();
                            if (z2) {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            }
                            qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1899381698);
                            x340Var.r(false);
                        }
                        qim0Var5 = qim0Var4;
                        qim0 qim0VarS2 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = d7x.d;
                            x340Var.s0(objT);
                        }
                        gfh0Var = (gfh0) objT;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarS2);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0Var, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        f3 = f4;
                        colorFilter2 = colorFilter3;
                        tl3Var2 = tl3Var3;
                        j6mVar3 = j6mVar4;
                        qim0Var3 = qim0Var5;
                    } else {
                        x340Var.b0();
                        colorFilter2 = colorFilter;
                        qim0Var3 = qim0Var2;
                        j6mVar3 = j6mVar2;
                        f3 = f2;
                        tl3Var2 = tl3Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                    }
                }
                i3 |= 24576;
                j6mVar2 = j6mVar;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (x340Var.d(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (x340Var.g(colorFilter)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i12 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i12 & 1, z)) {
                        qim0VarB = nim0.a;
                        if (i13 != 0) {
                            qim0Var4 = qim0VarB;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            tl3Var3 = een.h;
                        } else {
                            tl3Var3 = tl3Var;
                        }
                        if (i6 != 0) {
                            j6mVar4 = mif1.Q0;
                        } else {
                            j6mVar4 = j6mVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            colorFilter3 = null;
                        } else {
                            colorFilter3 = colorFilter;
                        }
                        if (str != null) {
                            x340Var.i0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT2 = x340Var.T();
                            if (z2) {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            }
                            qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1899381698);
                            x340Var.r(false);
                        }
                        qim0Var5 = qim0Var4;
                        qim0 qim0VarS3 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = d7x.d;
                            x340Var.s0(objT);
                        }
                        gfh0Var = (gfh0) objT;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarS3);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0Var, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        f3 = f4;
                        colorFilter2 = colorFilter3;
                        tl3Var2 = tl3Var3;
                        j6mVar3 = j6mVar4;
                        qim0Var3 = qim0Var5;
                    } else {
                        x340Var.b0();
                        colorFilter2 = colorFilter;
                        qim0Var3 = qim0Var2;
                        j6mVar3 = j6mVar2;
                        f3 = f2;
                        tl3Var2 = tl3Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (x340Var.g(colorFilter)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i12 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    qim0VarB = nim0.a;
                    if (i13 != 0) {
                        qim0Var4 = qim0VarB;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        tl3Var3 = een.h;
                    } else {
                        tl3Var3 = tl3Var;
                    }
                    if (i6 != 0) {
                        j6mVar4 = mif1.Q0;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        colorFilter3 = null;
                    } else {
                        colorFilter3 = colorFilter;
                    }
                    if (str != null) {
                        x340Var.i0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1899381698);
                        x340Var.r(false);
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarS4 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = d7x.d;
                        x340Var.s0(objT);
                    }
                    gfh0Var = (gfh0) objT;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarS4);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    f3 = f4;
                    colorFilter2 = colorFilter3;
                    tl3Var2 = tl3Var3;
                    j6mVar3 = j6mVar4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    colorFilter2 = colorFilter;
                    qim0Var3 = qim0Var2;
                    j6mVar3 = j6mVar2;
                    f3 = f2;
                    tl3Var2 = tl3Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                }
            }
            i3 |= 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j6mVar2 = j6mVar;
                    if (x340Var.g(j6mVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (x340Var.d(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (x340Var.g(colorFilter)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i12 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i12 & 1, z)) {
                        qim0VarB = nim0.a;
                        if (i13 != 0) {
                            qim0Var4 = qim0VarB;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            tl3Var3 = een.h;
                        } else {
                            tl3Var3 = tl3Var;
                        }
                        if (i6 != 0) {
                            j6mVar4 = mif1.Q0;
                        } else {
                            j6mVar4 = j6mVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            colorFilter3 = null;
                        } else {
                            colorFilter3 = colorFilter;
                        }
                        if (str != null) {
                            x340Var.i0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT2 = x340Var.T();
                            if (z2) {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            }
                            qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1899381698);
                            x340Var.r(false);
                        }
                        qim0Var5 = qim0Var4;
                        qim0 qim0VarS5 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = d7x.d;
                            x340Var.s0(objT);
                        }
                        gfh0Var = (gfh0) objT;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarS5);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0Var, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        f3 = f4;
                        colorFilter2 = colorFilter3;
                        tl3Var2 = tl3Var3;
                        j6mVar3 = j6mVar4;
                        qim0Var3 = qim0Var5;
                    } else {
                        x340Var.b0();
                        colorFilter2 = colorFilter;
                        qim0Var3 = qim0Var2;
                        j6mVar3 = j6mVar2;
                        f3 = f2;
                        tl3Var2 = tl3Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (x340Var.g(colorFilter)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i12 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    qim0VarB = nim0.a;
                    if (i13 != 0) {
                        qim0Var4 = qim0VarB;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        tl3Var3 = een.h;
                    } else {
                        tl3Var3 = tl3Var;
                    }
                    if (i6 != 0) {
                        j6mVar4 = mif1.Q0;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        colorFilter3 = null;
                    } else {
                        colorFilter3 = colorFilter;
                    }
                    if (str != null) {
                        x340Var.i0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1899381698);
                        x340Var.r(false);
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarS6 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = d7x.d;
                        x340Var.s0(objT);
                    }
                    gfh0Var = (gfh0) objT;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarS6);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    f3 = f4;
                    colorFilter2 = colorFilter3;
                    tl3Var2 = tl3Var3;
                    j6mVar3 = j6mVar4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    colorFilter2 = colorFilter;
                    qim0Var3 = qim0Var2;
                    j6mVar3 = j6mVar2;
                    f3 = f2;
                    tl3Var2 = tl3Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                }
            }
            i3 |= 24576;
            j6mVar2 = j6mVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (x340Var.g(colorFilter)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i12 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    qim0VarB = nim0.a;
                    if (i13 != 0) {
                        qim0Var4 = qim0VarB;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        tl3Var3 = een.h;
                    } else {
                        tl3Var3 = tl3Var;
                    }
                    if (i6 != 0) {
                        j6mVar4 = mif1.Q0;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        colorFilter3 = null;
                    } else {
                        colorFilter3 = colorFilter;
                    }
                    if (str != null) {
                        x340Var.i0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1899381698);
                        x340Var.r(false);
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarS7 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = d7x.d;
                        x340Var.s0(objT);
                    }
                    gfh0Var = (gfh0) objT;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarS7);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    f3 = f4;
                    colorFilter2 = colorFilter3;
                    tl3Var2 = tl3Var3;
                    j6mVar3 = j6mVar4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    colorFilter2 = colorFilter;
                    qim0Var3 = qim0Var2;
                    j6mVar3 = j6mVar2;
                    f3 = f2;
                    tl3Var2 = tl3Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (x340Var.g(colorFilter)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i12 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i12 & 1, z)) {
                qim0VarB = nim0.a;
                if (i13 != 0) {
                    qim0Var4 = qim0VarB;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    tl3Var3 = een.h;
                } else {
                    tl3Var3 = tl3Var;
                }
                if (i6 != 0) {
                    j6mVar4 = mif1.Q0;
                } else {
                    j6mVar4 = j6mVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    colorFilter3 = null;
                } else {
                    colorFilter3 = colorFilter;
                }
                if (str != null) {
                    x340Var.i0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = x340Var.T();
                    if (z2) {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1899381698);
                    x340Var.r(false);
                }
                qim0Var5 = qim0Var4;
                qim0 qim0VarS8 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = d7x.d;
                    x340Var.s0(objT);
                }
                gfh0Var = (gfh0) objT;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarS8);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                f3 = f4;
                colorFilter2 = colorFilter3;
                tl3Var2 = tl3Var3;
                j6mVar3 = j6mVar4;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                colorFilter2 = colorFilter;
                qim0Var3 = qim0Var2;
                j6mVar3 = j6mVar2;
                f3 = f2;
                tl3Var2 = tl3Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (x340Var.g(tl3Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    j6mVar2 = j6mVar;
                    if (x340Var.g(j6mVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (x340Var.d(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (x340Var.g(colorFilter)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i12 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i12 & 1, z)) {
                        qim0VarB = nim0.a;
                        if (i13 != 0) {
                            qim0Var4 = qim0VarB;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i4 != 0) {
                            tl3Var3 = een.h;
                        } else {
                            tl3Var3 = tl3Var;
                        }
                        if (i6 != 0) {
                            j6mVar4 = mif1.Q0;
                        } else {
                            j6mVar4 = j6mVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            colorFilter3 = null;
                        } else {
                            colorFilter3 = colorFilter;
                        }
                        if (str != null) {
                            x340Var.i0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objT2 = x340Var.T();
                            if (z2) {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            } else {
                                objT2 = new jfa(str, (byte) 8);
                                x340Var.s0(objT2);
                            }
                            qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1899381698);
                            x340Var.r(false);
                        }
                        qim0Var5 = qim0Var4;
                        qim0 qim0VarS9 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = d7x.d;
                            x340Var.s0(objT);
                        }
                        gfh0Var = (gfh0) objT;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarS9);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(gfh0Var, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        f3 = f4;
                        colorFilter2 = colorFilter3;
                        tl3Var2 = tl3Var3;
                        j6mVar3 = j6mVar4;
                        qim0Var3 = qim0Var5;
                    } else {
                        x340Var.b0();
                        colorFilter2 = colorFilter;
                        qim0Var3 = qim0Var2;
                        j6mVar3 = j6mVar2;
                        f3 = f2;
                        tl3Var2 = tl3Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (x340Var.g(colorFilter)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i12 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    qim0VarB = nim0.a;
                    if (i13 != 0) {
                        qim0Var4 = qim0VarB;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        tl3Var3 = een.h;
                    } else {
                        tl3Var3 = tl3Var;
                    }
                    if (i6 != 0) {
                        j6mVar4 = mif1.Q0;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        colorFilter3 = null;
                    } else {
                        colorFilter3 = colorFilter;
                    }
                    if (str != null) {
                        x340Var.i0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1899381698);
                        x340Var.r(false);
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarS10 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = d7x.d;
                        x340Var.s0(objT);
                    }
                    gfh0Var = (gfh0) objT;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarS10);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    f3 = f4;
                    colorFilter2 = colorFilter3;
                    tl3Var2 = tl3Var3;
                    j6mVar3 = j6mVar4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    colorFilter2 = colorFilter;
                    qim0Var3 = qim0Var2;
                    j6mVar3 = j6mVar2;
                    f3 = f2;
                    tl3Var2 = tl3Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                }
            }
            i3 |= 24576;
            j6mVar2 = j6mVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (x340Var.g(colorFilter)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i12 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    qim0VarB = nim0.a;
                    if (i13 != 0) {
                        qim0Var4 = qim0VarB;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        tl3Var3 = een.h;
                    } else {
                        tl3Var3 = tl3Var;
                    }
                    if (i6 != 0) {
                        j6mVar4 = mif1.Q0;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        colorFilter3 = null;
                    } else {
                        colorFilter3 = colorFilter;
                    }
                    if (str != null) {
                        x340Var.i0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1899381698);
                        x340Var.r(false);
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarS11 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = d7x.d;
                        x340Var.s0(objT);
                    }
                    gfh0Var = (gfh0) objT;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarS11);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    f3 = f4;
                    colorFilter2 = colorFilter3;
                    tl3Var2 = tl3Var3;
                    j6mVar3 = j6mVar4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    colorFilter2 = colorFilter;
                    qim0Var3 = qim0Var2;
                    j6mVar3 = j6mVar2;
                    f3 = f2;
                    tl3Var2 = tl3Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (x340Var.g(colorFilter)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i12 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i12 & 1, z)) {
                qim0VarB = nim0.a;
                if (i13 != 0) {
                    qim0Var4 = qim0VarB;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    tl3Var3 = een.h;
                } else {
                    tl3Var3 = tl3Var;
                }
                if (i6 != 0) {
                    j6mVar4 = mif1.Q0;
                } else {
                    j6mVar4 = j6mVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    colorFilter3 = null;
                } else {
                    colorFilter3 = colorFilter;
                }
                if (str != null) {
                    x340Var.i0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = x340Var.T();
                    if (z2) {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1899381698);
                    x340Var.r(false);
                }
                qim0Var5 = qim0Var4;
                qim0 qim0VarS12 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = d7x.d;
                    x340Var.s0(objT);
                }
                gfh0Var = (gfh0) objT;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarS12);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                f3 = f4;
                colorFilter2 = colorFilter3;
                tl3Var2 = tl3Var3;
                j6mVar3 = j6mVar4;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                colorFilter2 = colorFilter;
                qim0Var3 = qim0Var2;
                j6mVar3 = j6mVar2;
                f3 = f2;
                tl3Var2 = tl3Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
            }
        }
        i3 |= 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                j6mVar2 = j6mVar;
                if (x340Var.g(j6mVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (x340Var.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (x340Var.g(colorFilter)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i12 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i12 & 1, z)) {
                    qim0VarB = nim0.a;
                    if (i13 != 0) {
                        qim0Var4 = qim0VarB;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i4 != 0) {
                        tl3Var3 = een.h;
                    } else {
                        tl3Var3 = tl3Var;
                    }
                    if (i6 != 0) {
                        j6mVar4 = mif1.Q0;
                    } else {
                        j6mVar4 = j6mVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        colorFilter3 = null;
                    } else {
                        colorFilter3 = colorFilter;
                    }
                    if (str != null) {
                        x340Var.i0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT2 = x340Var.T();
                        if (z2) {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        } else {
                            objT2 = new jfa(str, (byte) 8);
                            x340Var.s0(objT2);
                        }
                        qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1899381698);
                        x340Var.r(false);
                    }
                    qim0Var5 = qim0Var4;
                    qim0 qim0VarS13 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                    objT = x340Var.T();
                    if (objT == m4cVar) {
                        objT = d7x.d;
                        x340Var.s0(objT);
                    }
                    gfh0Var = (gfh0) objT;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarS13);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    f3 = f4;
                    colorFilter2 = colorFilter3;
                    tl3Var2 = tl3Var3;
                    j6mVar3 = j6mVar4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    colorFilter2 = colorFilter;
                    qim0Var3 = qim0Var2;
                    j6mVar3 = j6mVar2;
                    f3 = f2;
                    tl3Var2 = tl3Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (x340Var.g(colorFilter)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i12 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i12 & 1, z)) {
                qim0VarB = nim0.a;
                if (i13 != 0) {
                    qim0Var4 = qim0VarB;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    tl3Var3 = een.h;
                } else {
                    tl3Var3 = tl3Var;
                }
                if (i6 != 0) {
                    j6mVar4 = mif1.Q0;
                } else {
                    j6mVar4 = j6mVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    colorFilter3 = null;
                } else {
                    colorFilter3 = colorFilter;
                }
                if (str != null) {
                    x340Var.i0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = x340Var.T();
                    if (z2) {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1899381698);
                    x340Var.r(false);
                }
                qim0Var5 = qim0Var4;
                qim0 qim0VarS14 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = d7x.d;
                    x340Var.s0(objT);
                }
                gfh0Var = (gfh0) objT;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarS14);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                f3 = f4;
                colorFilter2 = colorFilter3;
                tl3Var2 = tl3Var3;
                j6mVar3 = j6mVar4;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                colorFilter2 = colorFilter;
                qim0Var3 = qim0Var2;
                j6mVar3 = j6mVar2;
                f3 = f2;
                tl3Var2 = tl3Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
            }
        }
        i3 |= 24576;
        j6mVar2 = j6mVar;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (x340Var.g(colorFilter)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i12 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i12 & 1, z)) {
                qim0VarB = nim0.a;
                if (i13 != 0) {
                    qim0Var4 = qim0VarB;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i4 != 0) {
                    tl3Var3 = een.h;
                } else {
                    tl3Var3 = tl3Var;
                }
                if (i6 != 0) {
                    j6mVar4 = mif1.Q0;
                } else {
                    j6mVar4 = j6mVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    colorFilter3 = null;
                } else {
                    colorFilter3 = colorFilter;
                }
                if (str != null) {
                    x340Var.i0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT2 = x340Var.T();
                    if (z2) {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new jfa(str, (byte) 8);
                        x340Var.s0(objT2);
                    }
                    qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1899381698);
                    x340Var.r(false);
                }
                qim0Var5 = qim0Var4;
                qim0 qim0VarS15 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = d7x.d;
                    x340Var.s0(objT);
                }
                gfh0Var = (gfh0) objT;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarS15);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0Var, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                f3 = f4;
                colorFilter2 = colorFilter3;
                tl3Var2 = tl3Var3;
                j6mVar3 = j6mVar4;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                colorFilter2 = colorFilter;
                qim0Var3 = qim0Var2;
                j6mVar3 = j6mVar2;
                f3 = f2;
                tl3Var2 = tl3Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
            }
        }
        i3 |= 196608;
        f2 = f;
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (x340Var.g(colorFilter)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i12 = i3;
        if ((i12 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i12 & 1, z)) {
            qim0VarB = nim0.a;
            if (i13 != 0) {
                qim0Var4 = qim0VarB;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i4 != 0) {
                tl3Var3 = een.h;
            } else {
                tl3Var3 = tl3Var;
            }
            if (i6 != 0) {
                j6mVar4 = mif1.Q0;
            } else {
                j6mVar4 = j6mVar2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (i10 != 0) {
                colorFilter3 = null;
            } else {
                colorFilter3 = colorFilter;
            }
            if (str != null) {
                x340Var.i0(1899222916);
                if ((i12 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT2 = x340Var.T();
                if (z2) {
                    objT2 = new jfa(str, (byte) 8);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new jfa(str, (byte) 8);
                    x340Var.s0(objT2);
                }
                qim0VarB = s161.b(qim0VarB, false, (iu30) objT2);
                x340Var.r(false);
            } else {
                x340Var.i0(1899381698);
                x340Var.r(false);
            }
            qim0Var5 = qim0Var4;
            qim0 qim0VarS16 = xyn1.s(i1p1.r(qim0Var4.then(qim0VarB)), jmr0Var, tl3Var3, j6mVar4, f4, colorFilter3, 2);
            objT = x340Var.T();
            if (objT == m4cVar) {
                objT = d7x.d;
                x340Var.s0(objT);
            }
            gfh0Var = (gfh0) objT;
            iHashCode = Long.hashCode(tgp1.l(x340Var));
            qim0VarE = zr7.E(x340Var, qim0VarS16);
            xos0VarM = x340Var.m();
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            x340Var.r(true);
            f3 = f4;
            colorFilter2 = colorFilter3;
            tl3Var2 = tl3Var3;
            j6mVar3 = j6mVar4;
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            colorFilter2 = colorFilter;
            qim0Var3 = qim0Var2;
            j6mVar3 = j6mVar2;
            f3 = f2;
            tl3Var2 = tl3Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tt70(jmr0Var, str, qim0Var3, tl3Var2, j6mVar3, f3, colorFilter2, i, i2);
        }
    }

    public static long f0(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static final void g(yk4 yk4Var, String str, qim0 qim0Var, j6m j6mVar, int i, b0k b0kVar, int i2, int i3) {
        gra graVar = een.h;
        if ((i3 & 16) != 0) {
            j6mVar = mif1.Q0;
        }
        j6m j6mVar2 = j6mVar;
        if ((i3 & 128) != 0) {
            i = 1;
        }
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(yk4Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = sj1.b(yk4Var, i);
            x340Var.s0(objT);
        }
        f((pxa) objT, str, qim0Var, graVar, j6mVar2, 1.0f, null, x340Var, (i2 & 112) | 8 | (i2 & 896) | (57344 & i2), 0);
    }

    public static long g0(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final void h(List list, Collection collection, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1537894851);
        if ((((x340Var.i(list) ? 4 : 2) | i | (x340Var.i(collection) ? 32 : 16)) & 19) == 18 && x340Var.H()) {
            x340Var.b0();
        } else {
            boolean zBooleanValue = ((Boolean) x340Var.k(cn80.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                hnn0 hnn0Var = (hnn0) it.next();
                tac0 tac0Var = hnn0Var.h;
                boolean zH = x340Var.h(zBooleanValue) | x340Var.i(list) | x340Var.i(hnn0Var);
                Object objT = x340Var.T();
                if (zH || objT == fkj0.X) {
                    objT = new c30(hnn0Var, zBooleanValue, list, (byte) 11);
                    x340Var.s0(objT);
                }
                qxd0.i(tac0Var, (iu30) objT, x340Var);
            }
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o1t(list, collection, i, (byte) 7);
        }
    }

    public static void h0(HashMap map, vhd vhdVar) {
        for (Map.Entry entry : map.entrySet()) {
            String str = md50.j;
            if (N(((hd50) entry.getValue()).b())) {
                vhdVar.j((String) entry.getKey(), ((hd50) entry.getValue()).b(), ((hd50) entry.getValue()).a());
            }
        }
    }

    public static final void i(int i, StringBuilder sb) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(o7h.y0(arrayList, ",", (String) null, (String) null, (iu30) null, 62));
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    public static void i0(HttpURLConnection httpURLConnection, od50 od50Var) throws Throwable {
        boolean z;
        Throwable th;
        FilterOutputStream filterOutputStream;
        FilterOutputStream gZIPOutputStream;
        a370 a370Var = a370.b;
        oue0 oue0Var = new oue0();
        w0h1.D("Request", "tag");
        int size = od50Var.b.size();
        Iterator<E> it = od50Var.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                z = true;
                break;
            }
            md50 md50Var = (md50) it.next();
            Iterator<String> it2 = md50Var.d.keySet().iterator();
            while (it2.hasNext()) {
                if (N(md50Var.d.get(it2.next()))) {
                    break loop0;
                }
            }
        }
        a370 a370Var2 = size == 1 ? ((md50) od50Var.b.get(0)).h : null;
        if (a370Var2 == null) {
            a370Var2 = a370Var;
        }
        httpURLConnection.setRequestMethod(a370Var2.name());
        if (z) {
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        } else {
            httpURLConnection.setRequestProperty("Content-Type", String.format("multipart/form-data; boundary=%s", Arrays.copyOf(new Object[]{md50.j}, 1)));
        }
        URL url = httpURLConnection.getURL();
        HashSet hashSet = wf10.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        httpURLConnection.getRequestMethod();
        synchronized (hashSet) {
        }
        httpURLConnection.getRequestProperty("User-Agent");
        oue0Var.a();
        httpURLConnection.getRequestProperty("Content-Type");
        oue0Var.a();
        httpURLConnection.setConnectTimeout(z);
        httpURLConnection.setReadTimeout(z);
        if (a370Var2 != a370Var) {
            fza.g(zue0.a);
            return;
        }
        httpURLConnection.setDoOutput(true);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    filterOutputStream = bufferedOutputStream;
                    if (filterOutputStream != null) {
                        throw th;
                    }
                    filterOutputStream.close();
                    throw th;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
            try {
                for (ke keVar : od50Var.c) {
                }
                Iterator<E> it3 = od50Var.iterator();
                while (it3.hasNext()) {
                    id50 id50Var = ((md50) it3.next()).g;
                }
                X(od50Var, oue0Var, size, url, gZIPOutputStream, z);
                gZIPOutputStream.close();
                fza.g(zue0.a);
            } catch (Throwable th3) {
                th = th3;
                filterOutputStream = gZIPOutputStream;
                if (filterOutputStream != null) {
                    throw th;
                }
                filterOutputStream.close();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            filterOutputStream = null;
        }
    }

    public static xj61 j(Set set) {
        xj61 xj61Var = (xj61) set;
        xkg0 xkg0Var = xj61Var.a;
        xkg0Var.b();
        return xkg0Var.i > 0 ? xj61Var : xj61.b;
    }

    public static Set j0(Object obj) {
        return Collections.singleton(obj);
    }

    public static final LinkedHashSet k(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new ejl(uri, z));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    u890.p(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        byteArrayInputStream.close();
        return linkedHashSet;
    }

    public static final byte[] k0(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ejl ejlVar = (ejl) it.next();
                    objectOutputStream.writeUTF(ejlVar.a().toString());
                    objectOutputStream.writeBoolean(ejlVar.b());
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final void l(tka0 tka0Var, Object obj) {
        if (tka0Var.m(obj)) {
            return;
        }
        throw new ClassCastException("Value cannot be cast to " + tka0Var.o());
    }

    public static qim0 l0(qim0 qim0Var, long j, hw61 hw61Var, int i) {
        if ((i & 1) != 0) {
            int i2 = u7h.l;
            j = nfb.l();
        }
        long j2 = j;
        if ((i & 2) != 0) {
            hw61Var = d4o1.a;
        }
        return qim0Var.then(new hz71(j2, hw61Var, (i & 4) != 0 ? 2 : 1, (i & 8) != 0 ? 9 : 3));
    }

    public static final boolean m(vu30 vu30Var, afx afxVar) {
        long j = ((u7h) vu30Var.invoke(afxVar, vux.a)).a;
        return (z4h1.b(((u7h) vu30Var.invoke(afxVar, vux.b)).a, j) && z4h1.b(((u7h) vu30Var.invoke(afxVar, vux.c)).a, j)) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final int m0(wvl1 wvl1Var) throws NoWhenBranchMatchedException {
        int iOrdinal = wvl1Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        eg.o();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static long n(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(pze0.h(j2, ")", cy30.s(j, "overflow: checkedAdd(", ", ")));
    }

    public static final String n0(int i, Object[] objArr, b0k b0kVar) {
        return ((Resources) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0045, B:53:0x00f0, B:54:0x00f5, B:56:0x00f9, B:59:0x010c, B:25:0x0052, B:40:0x00c8, B:43:0x00cd, B:44:0x00d2), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f9 A[Catch: all -> 0x0034, TryCatch #1 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0045, B:53:0x00f0, B:54:0x00f5, B:56:0x00f9, B:59:0x010c, B:25:0x0052, B:40:0x00c8, B:43:0x00cd, B:44:0x00d2), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:15:0x002f, B:22:0x0045, B:53:0x00f0, B:54:0x00f5, B:56:0x00f9, B:59:0x010c, B:25:0x0052, B:40:0x00c8, B:43:0x00cd, B:44:0x00d2), top: B:67:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r14 == r7) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0109, code lost:
    
        if (r14 == r7) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [p.y610] */
    /* JADX WARN: Type inference failed for: r10v1, types: [p.rl1] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [p.rl1] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [p.rl1] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3, types: [p.rl1] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object o(p.y610 r10, kotlin.jvm.functions.Function0 r11, java.lang.Long r12, p.xu30 r13, p.lnm r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cwl1.o(p.y610, kotlin.jvm.functions.Function0, java.lang.Long, p.xu30, p.lnm):java.lang.Object");
    }

    public static final String o0(b0k b0kVar, int i) {
        return ((Resources) ((x340) b0kVar).k(AndroidCompositionLocals_androidKt.c)).getString(i);
    }

    public static float[] p(int i, float[] fArr) {
        if (i < 0) {
            bhn0.q();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static HttpURLConnection p0(od50 od50Var) throws Throwable {
        URL url;
        ArrayList arrayList = od50Var.b;
        Iterator<E> it = od50Var.iterator();
        while (it.hasNext()) {
            md50 md50Var = (md50) it.next();
            if (a370.a == md50Var.h && fpi1.y(md50Var.d.getString("fields"))) {
                fza fzaVar = oue0.a;
                fza.g(zue0.d);
            }
        }
        try {
            if (arrayList.size() == 1) {
                md50 md50Var2 = (md50) arrayList.get(0);
                String str = md50Var2.b;
                String strG = md50Var2.g((md50Var2.h == a370.b && str != null && nhc1.R(str, "/videos", false)) ? kno1.v() : kno1.u(wf10.e()));
                md50Var2.a();
                url = new URL(md50Var2.b(strG, false));
            } else {
                url = new URL(kno1.t());
            }
            HttpURLConnection httpURLConnectionQ = null;
            try {
                httpURLConnectionQ = q(url);
                i0(httpURLConnectionQ, od50Var);
                return httpURLConnectionQ;
            } catch (IOException e) {
                fpi1.j(httpURLConnectionQ);
                throw new FacebookException("could not construct request body", e);
            } catch (JSONException e2) {
                fpi1.j(httpURLConnectionQ);
                throw new FacebookException("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            throw new FacebookException("could not construct URL for request", e3);
        }
    }

    public static HttpURLConnection q(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (md50.l == null) {
            md50.l = String.format("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "18.2.3"}, 2));
        }
        httpURLConnection.setRequestProperty("User-Agent", md50.l);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    public static final e8o0 q0(byte[] bArr) throws IOException {
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new e8o0(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                e8o0 e8o0VarI = ph5.i(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return e8o0VarI;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static u9s0[] r(String str) {
        int i;
        String strTrim;
        float[] fArrP;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrP = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrP = p(i5, fArr);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    bhn0.o(f4i1.f("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            arrayList.add(new u9s0(strTrim.charAt(i2), fArrP));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrP = new float[i2];
                } else {
                    fArrP = new float[i2];
                }
                arrayList.add(new u9s0(strTrim.charAt(i2), fArrP));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new u9s0(str.charAt(i3), new float[0]));
        }
        return (u9s0[]) arrayList.toArray(new u9s0[i]);
    }

    public static rl1 r0(Object obj) {
        return new rl1(obj.getClass().getSimpleName());
    }

    public static final awl1 s(Context context, btk btkVar) {
        dwl1 dwl1Var = new dwl1(btkVar.c);
        WorkDatabase workDatabaseL = j541.l(context.getApplicationContext(), dwl1Var.a, btkVar.d, context.getResources().getBoolean(2131034140));
        z2g1 z2g1Var = new z2g1(context.getApplicationContext(), dwl1Var);
        lsw0 lsw0Var = new lsw0(context.getApplicationContext(), btkVar, dwl1Var, workDatabaseL);
        return new awl1(context.getApplicationContext(), btkVar, dwl1Var, workDatabaseL, (List) bwl1.a.Y(context, btkVar, dwl1Var, workDatabaseL, z2g1Var, lsw0Var), lsw0Var, z2g1Var);
    }

    public static void s0(long[] jArr, long[] jArr2, int i) {
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = (int) jArr[i2];
            jArr[i2] = ((-i) & (((int) jArr2[i2]) ^ i3)) ^ i3;
        }
    }

    public static byte[] t(byte[] bArr) {
        if (bArr.length != 16) {
            hhg1.n("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < 16; i++) {
            byte b2 = (byte) ((bArr[i] << 1) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b2);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long u(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (y4f0.a[roundingMode.ordinal()]) {
            case 1:
                hm5.n(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 4:
                return j3 + ((long) i);
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j4);
                long jAbs2 = jAbs - (Math.abs(j2) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (jAbs2 <= 0) {
                    return j3;
                }
                return j3 + ((long) i);
            default:
                hhg1.c();
                return 0L;
        }
    }

    public static final qim0 v(qim0 qim0Var, hw61 hw61Var, pgx pgxVar, afx afxVar, idn0 idn0Var, boolean z) {
        return i1p1.q(qim0Var.then(new lw80(hw61Var, pgxVar, afxVar, idn0Var, z)), hw61Var);
    }

    public static ArrayList w(od50 od50Var) {
        Exception exc;
        HttpURLConnection httpURLConnectionP0;
        ArrayList arrayListX;
        w0h1.C(od50Var);
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionP0 = p0(od50Var);
            exc = null;
        } catch (Exception e) {
            exc = e;
            httpURLConnectionP0 = null;
        } catch (Throwable th) {
            th = th;
            fpi1.j(httpURLConnection);
            throw th;
        }
        try {
            if (httpURLConnectionP0 != null) {
                arrayListX = x(httpURLConnectionP0, od50Var);
            } else {
                ArrayList arrayListQ = anm1.q(od50Var.b, null, new FacebookException(exc));
                d0(od50Var, arrayListQ);
                arrayListX = arrayListQ;
            }
            fpi1.j(httpURLConnectionP0);
            return arrayListX;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = httpURLConnectionP0;
            fpi1.j(httpURLConnection);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0027 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0027: PHI (r0v4 java.util.ArrayList) = (r0v1 java.util.ArrayList), (r0v3 java.util.ArrayList), (r0v10 java.util.ArrayList) binds: [B:25:0x004d, B:23:0x0043, B:16:0x0025] A[DONT_GENERATE, DONT_INLINE]
      0x0027: PHI (r1v1 java.io.InputStream) = (r1v0 java.io.InputStream), (r1v0 java.io.InputStream), (r1v11 java.io.InputStream) binds: [B:25:0x004d, B:23:0x0043, B:16:0x0025] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static ArrayList x(HttpURLConnection httpURLConnection, od50 od50Var) {
        ArrayList arrayListQ;
        zue0 zue0Var = zue0.a;
        InputStream errorStream = null;
        try {
            try {
                try {
                    if (!wf10.f()) {
                        throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    }
                    errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                    arrayListQ = anm1.t(errorStream, httpURLConnection, od50Var);
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    fpi1.j(httpURLConnection);
                    int size = od50Var.b.size();
                    if (size != arrayListQ.size()) {
                        throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Arrays.copyOf(new Object[]{Integer.valueOf(arrayListQ.size()), Integer.valueOf(size)}, 2)));
                    }
                    d0(od50Var, arrayListQ);
                    ne neVarU0 = ne.f.u0();
                    xd xdVar = (xd) neVarU0.c;
                    if (xdVar != null) {
                        long time = new Date().getTime();
                        if (xdVar.f.a && time - ((Date) neVarU0.e).getTime() > 3600000 && time - xdVar.g.getTime() > 86400000) {
                            if (u890.j(Looper.getMainLooper(), Looper.myLooper())) {
                                neVarU0.N();
                            } else {
                                new Handler(Looper.getMainLooper()).post(new fe(neVarU0, (byte) 0));
                            }
                        }
                    }
                    return arrayListQ;
                } catch (Exception e) {
                    fza fzaVar = oue0.a;
                    fza.f(zue0Var);
                    arrayListQ = anm1.q(od50Var, httpURLConnection, new FacebookException(e));
                    if (0 != 0) {
                        errorStream.close();
                    }
                }
            } catch (FacebookException e2) {
                fza fzaVar2 = oue0.a;
                fza.f(zue0Var);
                arrayListQ = anm1.q(od50Var, httpURLConnection, e2);
                if (0 != 0) {
                    errorStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    errorStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static Object y(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        bhn0.i("Both parameters are null");
        return null;
    }

    public static final byte[] z(e8o0 e8o0Var) throws IOException {
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = (NetworkRequest) e8o0Var.a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrS = qqn1.S(networkRequest);
                int[] iArrN = qqn1.n(networkRequest);
                objectOutputStream.writeInt(iArrS.length);
                for (int i : iArrS) {
                    objectOutputStream.writeInt(i);
                }
                objectOutputStream.writeInt(iArrN.length);
                for (int i2 : iArrN) {
                    objectOutputStream.writeInt(i2);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }
}
