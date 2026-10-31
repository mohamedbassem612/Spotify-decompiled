package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.ActionMode;
import androidx.car.app.navigation.model.Maneuver;
import com.comscore.streaming.ContentDeliveryMode;
import com.spotify.encoremobile.widgets.CancellableSeekBar;
import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.UninitializedPropertyAccessException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class fe implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        qj7 qj7Var = (qj7) this.b;
        synchronized (qj7Var.a) {
            try {
                if (qj7Var.m) {
                    return;
                }
                long j = qj7Var.l - 1;
                qj7Var.l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    qj7Var.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (qj7Var.a) {
                    qj7Var.n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        iod iodVar = (iod) this.b;
        synchronized (iodVar.a) {
            if (iodVar.b.isEmpty()) {
                return;
            }
            try {
                iodVar.h(iodVar.b);
                iodVar.b.clear();
            } catch (Throwable th) {
                iodVar.b.clear();
                throw th;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.interapp.interappprotocol.NotAuthorizedException */
    /* JADX WARN: Code duplicated, block: B:302:0x05da  */
    /* JADX WARN: Code duplicated, block: B:304:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:307:0x064c  */
    /* JADX WARN: Code duplicated, block: B:310:0x067e A[Catch: UnknownHostException -> 0x069a, IOException -> 0x0731, TryCatch #16 {UnknownHostException -> 0x069a, IOException -> 0x0731, blocks: (B:308:0x066a, B:310:0x067e, B:311:0x0684, B:313:0x068a, B:316:0x069d, B:318:0x06a7, B:323:0x06b7, B:325:0x06f4, B:332:0x070f, B:336:0x0715, B:337:0x0718, B:338:0x0719), top: B:453:0x066a }] */
    /* JADX WARN: Code duplicated, block: B:313:0x068a A[Catch: UnknownHostException -> 0x069a, IOException -> 0x0731, LOOP:3: B:311:0x0684->B:313:0x068a, LOOP_END, TryCatch #16 {UnknownHostException -> 0x069a, IOException -> 0x0731, blocks: (B:308:0x066a, B:310:0x067e, B:311:0x0684, B:313:0x068a, B:316:0x069d, B:318:0x06a7, B:323:0x06b7, B:325:0x06f4, B:332:0x070f, B:336:0x0715, B:337:0x0718, B:338:0x0719), top: B:453:0x066a }] */
    /* JADX WARN: Code duplicated, block: B:322:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:325:0x06f4 A[Catch: UnknownHostException -> 0x069a, IOException -> 0x0731, TRY_LEAVE, TryCatch #16 {UnknownHostException -> 0x069a, IOException -> 0x0731, blocks: (B:308:0x066a, B:310:0x067e, B:311:0x0684, B:313:0x068a, B:316:0x069d, B:318:0x06a7, B:323:0x06b7, B:325:0x06f4, B:332:0x070f, B:336:0x0715, B:337:0x0718, B:338:0x0719), top: B:453:0x066a }] */
    /* JADX WARN: Code duplicated, block: B:328:0x0708 A[Catch: all -> 0x070c, TRY_LEAVE, TryCatch #7 {all -> 0x070c, blocks: (B:326:0x0702, B:328:0x0708), top: B:442:0x0702 }] */
    /* JADX WARN: Code duplicated, block: B:343:0x074f  */
    /* JADX WARN: Code duplicated, block: B:374:0x07fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:375:0x07fc A[Catch: all -> 0x082a, LOOP:12: B:363:0x07a4->B:375:0x07fc, LOOP_END, TryCatch #6 {all -> 0x082a, blocks: (B:360:0x0793, B:363:0x07a4, B:365:0x07b3, B:367:0x07bf, B:369:0x07c8, B:371:0x07d7, B:372:0x07f4, B:375:0x07fc, B:376:0x07ff, B:378:0x0811, B:382:0x0826, B:383:0x0829, B:377:0x0804), top: B:441:0x0793, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:460:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x07ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [p.im5] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v20, types: [p.bqo[]] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [p.bqo] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v13, types: [p.im5[]] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object obj;
        ?? r4;
        ?? r2;
        Throwable th;
        ?? SingletonList;
        int iMax;
        List listY0;
        LinkedHashMap linkedHashMap;
        pm5 pm5Var;
        Map mapSingletonMap;
        qm0 qm0Var;
        HttpURLConnection httpURLConnection;
        Set<String> setKeySet;
        boolean z;
        StringBuilder sb;
        BufferedReader bufferedReader;
        String line;
        int i;
        ?? r10;
        int i2;
        String str;
        Object obj2;
        ?? r3;
        Iterator it;
        int i3;
        int i4;
        nm5 nm5Var;
        int i5;
        Application application = 27;
        char c = 27;
        int i6 = 3;
        Throwable th2 = null;
        switch (this.a) {
            case 0:
                ((ne) this.b).N();
                return;
            case 1:
                Activity activity = (Activity) this.b;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = yg0.g;
                Method method = yg0.f;
                xg0 xg0Var = Build.VERSION.SDK_INT;
                if (xg0Var >= 28) {
                    activity.recreate();
                    return;
                }
                if (((xg0Var != 26 && xg0Var != 27) || method != null) && (yg0.e != null || yg0.d != null)) {
                    try {
                        Object obj3 = yg0.c.get(activity);
                        if (obj3 != null && (obj = yg0.b.get(activity)) != null) {
                            application = activity.getApplication();
                            xg0Var = new xg0(activity);
                            application.registerActivityLifecycleCallbacks(xg0Var);
                            handler.post(new xwn1(xg0Var, obj3, (byte) 1));
                            try {
                                if (xg0Var == 26 || xg0Var == 27) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r2 = application;
                                        r4 = xg0Var;
                                        handler.post(new nx30((Object) r2, (Object) r4, (byte) 2));
                                        throw th;
                                    }
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new nx30((Object) application, (Object) xg0Var, (byte) 2));
                                return;
                            } catch (Throwable th4) {
                                th = th4;
                                r2 = application;
                                r4 = xg0Var;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 2:
                ob4 ob4Var = (ob4) this.b;
                boolean zD = ob4Var.d();
                ha4 ha4Var = ob4Var.a;
                if (zD) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        ha4Var.t(true);
                        fdn0 fdn0Var = ob4Var.t;
                        int[] iArr = ((or80) fdn0Var).b;
                        long[] jArr = ((or80) fdn0Var).a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i7 = 0;
                            while (true) {
                                long j = jArr[i7];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                    for (int i9 = 0; i9 < i8; i9++) {
                                        if ((255 & j) < 128) {
                                            int i10 = iArr[(i7 << 3) + i9];
                                            if (!ob4Var.c().a(i10)) {
                                                ob4Var.d.add(new srl(i10, ob4Var.i, 2, null));
                                                ob4Var.g.l(rih1.a);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i8 == 8) {
                                        if (i7 != length) {
                                            i7++;
                                        }
                                    }
                                } else if (i7 != length) {
                                    i7++;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            ob4Var.f(ha4Var.getSemanticsOwner().a(), ob4Var.X);
                            Trace.endSection();
                            ob4Var.b(ob4Var.c());
                            ob4Var.j();
                            ob4Var.Y = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 3:
                ActionMode actionMode = ((d45) this.b).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                md50 md50Var = (md50) this.b;
                HashSet hashSet = qm5.a;
                String str2 = md50Var.b;
                List listQ0 = str2 != null ? ihc1.Q0(str2, new String[]{"/"}, 0, 6) : null;
                if (listQ0 == null || listQ0.size() != 2) {
                    fza fzaVar = oue0.a;
                    wf10.g();
                    return;
                }
                try {
                    pm5 pm5Var2 = qm5.c;
                    if (pm5Var2 == null) {
                        u890.C("credentials");
                        throw null;
                    }
                    String str3 = pm5Var2.b;
                    if (pm5Var2 == null) {
                        u890.C("credentials");
                        throw null;
                    }
                    String str4 = str3 + "/capi/" + pm5Var2.a + "/events";
                    String str5 = "custom_events";
                    JSONObject jSONObject = md50Var.c;
                    if (jSONObject != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fpi1.g(jSONObject));
                        linkedHashMap2.put("custom_events", md50Var.e);
                        Iterator it2 = linkedHashMap2.keySet().iterator();
                        while (it2.hasNext()) {
                            Objects.toString(linkedHashMap2.get((String) it2.next()));
                            System.getProperty("line.separator");
                        }
                        fza fzaVar2 = oue0.a;
                        synchronized (wf10.b) {
                        }
                        Map map = om5.a;
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                        ArrayList<Map> arrayList = new ArrayList();
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        String str6 = (String) linkedHashMap2.get("event");
                        int i11 = str6.equals("MOBILE_APP_INSTALL") ? 1 : str6.equals("CUSTOM_APP_EVENTS") ? 2 : 3;
                        if (i11 == 3) {
                            i = 3;
                            th = null;
                        } else {
                            Iterator it3 = linkedHashMap2.entrySet().iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                Throwable th6 = th2;
                                String str7 = (String) entry.getKey();
                                Object value = entry.getValue();
                                ?? Values = im5.values();
                                int length2 = Values.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 < length2) {
                                        r10 = Values[i12];
                                        int i13 = length2;
                                        if (!r10.a.equals(str7)) {
                                            i12++;
                                            length2 = i13;
                                        }
                                    } else {
                                        r10 = th6;
                                    }
                                }
                                if (r10 != 0) {
                                    ?? r6 = om5.a;
                                    nm5 nm5Var2 = (nm5) r6.get(r10);
                                    if (nm5Var2 != null && (i3 = nm5Var2.a) != 0) {
                                        int iC = l1d.C(i3);
                                        if (iC != 0) {
                                            if (iC == 1 && (nm5Var = (nm5) r6.get(r10)) != null && (i5 = nm5Var.b) != 0) {
                                                linkedHashMap4.put(pzm.e(i5), value);
                                            }
                                        } else if (r10 == im5.USER_DATA) {
                                            try {
                                                linkedHashMap3.putAll(fpi1.g(new JSONObject((String) value)));
                                                break;
                                            } catch (JSONException unused2) {
                                                fza fzaVar3 = oue0.a;
                                                synchronized (wf10.b) {
                                                }
                                            }
                                        } else {
                                            nm5 nm5Var3 = (nm5) r6.get(r10);
                                            if (nm5Var3 != null && (i4 = nm5Var3.b) != 0) {
                                                linkedHashMap3.put(pzm.e(i4), value);
                                            }
                                        }
                                    }
                                    str5 = str5;
                                    it3 = it3;
                                } else {
                                    boolean zEquals = str7.equals(str5);
                                    boolean z2 = value instanceof String;
                                    if (i11 == 2 && zEquals && z2) {
                                        String str8 = (String) value;
                                        ArrayList arrayList2 = new ArrayList();
                                        try {
                                            Iterator it4 = fpi1.f(new JSONArray(str8)).iterator();
                                            while (it4.hasNext()) {
                                                arrayList2.add(fpi1.g(new JSONObject((String) it4.next())));
                                            }
                                            if (arrayList2.isEmpty()) {
                                                obj2 = th6;
                                            } else {
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it5 = arrayList2.iterator();
                                                while (it5.hasNext()) {
                                                    Map map2 = (Map) it5.next();
                                                    LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                                                    for (String str9 : map2.keySet()) {
                                                        String str10 = str5;
                                                        ?? Values2 = bqo.values();
                                                        Iterator it6 = it5;
                                                        int length3 = Values2.length;
                                                        int i14 = 0;
                                                        while (true) {
                                                            if (i14 < length3) {
                                                                int i15 = i14;
                                                                r3 = Values2[i15];
                                                                int i16 = length3;
                                                                if (!r3.a.equals(str9)) {
                                                                    i14 = i15 + 1;
                                                                    length3 = i16;
                                                                }
                                                            } else {
                                                                r3 = th6;
                                                            }
                                                        }
                                                        mm5 mm5Var = (mm5) om5.b.get(r3);
                                                        if (r3 == 0 || mm5Var == null) {
                                                            it = it3;
                                                        } else {
                                                            it = it3;
                                                            int i17 = mm5Var.b;
                                                            int i18 = mm5Var.a;
                                                            if (i18 == 0) {
                                                                try {
                                                                    String strD = pzm.d(i17);
                                                                    if (r3 == bqo.EVENT_NAME && ((String) map2.get(str9)) != null) {
                                                                        String str11 = (String) map2.get(str9);
                                                                        Map map3 = om5.c;
                                                                        if (map3.containsKey(str11)) {
                                                                            o2n o2nVar = (o2n) map3.get(str11);
                                                                            str11 = o2nVar != null ? o2nVar.a : "";
                                                                        }
                                                                        linkedHashMap7.put(strD, str11);
                                                                    } else if (r3 == bqo.EVENT_TIME && ((Integer) map2.get(str9)) != null) {
                                                                        linkedHashMap7.put(strD, om5.a(map2.get(str9), str9));
                                                                    }
                                                                } catch (ClassCastException e) {
                                                                    fza fzaVar4 = oue0.a;
                                                                    j2h1.I(e);
                                                                    synchronized (wf10.b) {
                                                                    }
                                                                }
                                                            } else if (i18 == 3) {
                                                                linkedHashMap6.put(pzm.d(i17), om5.a(map2.get(str9), str9));
                                                            }
                                                        }
                                                        str5 = str10;
                                                        it5 = it6;
                                                        it3 = it;
                                                    }
                                                    String str12 = str5;
                                                    Iterator it7 = it5;
                                                    Iterator it8 = it3;
                                                    if (!linkedHashMap6.isEmpty()) {
                                                        linkedHashMap7.put("custom_data", linkedHashMap6);
                                                    }
                                                    arrayList3.add(linkedHashMap7);
                                                    str5 = str12;
                                                    it5 = it7;
                                                    it3 = it8;
                                                }
                                                str5 = str5;
                                                it3 = it3;
                                                obj2 = arrayList3;
                                            }
                                        } catch (JSONException unused3) {
                                            fza fzaVar5 = oue0.a;
                                            synchronized (wf10.b) {
                                            }
                                        }
                                        if (obj2 != null) {
                                            arrayList.addAll(obj2);
                                        }
                                    } else {
                                        str5 = str5;
                                        it3 = it3;
                                        int i19 = 3;
                                        int[] iArrH = l1d.H(3);
                                        int length4 = iArrH.length;
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 >= length4) {
                                                i2 = 0;
                                            } else {
                                                i2 = iArrH[i20];
                                                if (i2 == 1) {
                                                    str = "data_processing_options";
                                                } else if (i2 == 2) {
                                                    str = "data_processing_options_country";
                                                } else {
                                                    if (i2 != i19) {
                                                        throw th6;
                                                    }
                                                    str = "data_processing_options_state";
                                                }
                                                if (!str.equals(str7)) {
                                                    i20++;
                                                    i19 = 3;
                                                }
                                            }
                                        }
                                        if (i2 != 0) {
                                            linkedHashMap5.put(str7, value);
                                        }
                                    }
                                }
                                str5 = str5;
                                th2 = th6;
                                it3 = it3;
                                i6 = 3;
                            }
                            th = th2;
                            i = i6;
                        }
                        if (i11 != i) {
                            Object obj4 = linkedHashMap2.get("install_timestamp");
                            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                            linkedHashMap8.put("action_source", "app");
                            linkedHashMap8.put("user_data", linkedHashMap3);
                            linkedHashMap8.put("app_data", linkedHashMap4);
                            linkedHashMap8.putAll(linkedHashMap5);
                            int iC2 = l1d.C(i11);
                            if (iC2 != 0) {
                                if (iC2 == 1 && !arrayList.isEmpty()) {
                                    SingletonList = new ArrayList();
                                    for (Map map4 : arrayList) {
                                        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                                        linkedHashMap9.putAll(linkedHashMap8);
                                        linkedHashMap9.putAll(map4);
                                        SingletonList.add(linkedHashMap9);
                                    }
                                }
                            } else if (obj4 != null) {
                                LinkedHashMap linkedHashMap10 = new LinkedHashMap();
                                linkedHashMap10.putAll(linkedHashMap8);
                                linkedHashMap10.put("event_name", "MobileAppInstall");
                                linkedHashMap10.put("event_time", obj4);
                                SingletonList = Collections.singletonList(linkedHashMap10);
                            }
                        }
                        if (SingletonList == 0) {
                            return;
                        }
                        qm5.a().addAll((Collection) SingletonList);
                        iMax = Math.max(0, qm5.a().size() - 1000);
                        if (iMax > 0) {
                            qm5.d = w0h1.j(o7h.k0(qm5.a(), iMax));
                        }
                        int iMin = Math.min(qm5.a().size(), 10);
                        listY0 = o7h.Y0(qm5.a(), new tr80(0, iMin - 1, 1));
                        qm5.a().subList(0, iMin).clear();
                        JSONArray jSONArray = new JSONArray((Collection) listY0);
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("data", jSONArray);
                        pm5Var = qm5.c;
                        if (pm5Var != null) {
                            Throwable th7 = th;
                            u890.C("credentials");
                            throw th7;
                        }
                        linkedHashMap.put("accessKey", pm5Var.c);
                        String string = new JSONObject(linkedHashMap).toString();
                        mapSingletonMap = Collections.singletonMap("Content-Type", "application/json");
                        qm0Var = new qm0(listY0, (byte) 1);
                        try {
                            httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                            httpURLConnection.setRequestMethod("POST");
                            setKeySet = mapSingletonMap.keySet();
                            if (setKeySet != null) {
                                for (String str13 : setKeySet) {
                                    httpURLConnection.setRequestProperty(str13, (String) mapSingletonMap.get(str13));
                                }
                            }
                            if (!httpURLConnection.getRequestMethod().equals("POST") || httpURLConnection.getRequestMethod().equals("PUT")) {
                                z = true;
                            } else {
                                z = false;
                            }
                            httpURLConnection.setDoOutput(z);
                            httpURLConnection.setConnectTimeout(60000);
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                            bufferedWriter.write(string);
                            bufferedWriter.flush();
                            bufferedWriter.close();
                            bufferedOutputStream.close();
                            sb = new StringBuilder();
                            if (qm5.a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                                bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                                while (true) {
                                    try {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            sb.append(line);
                                        } else {
                                            bufferedReader.close();
                                        }
                                    } catch (Throwable th8) {
                                        try {
                                            throw th8;
                                        } catch (Throwable th9) {
                                            u890.p(bufferedReader, th8);
                                            throw th9;
                                        }
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            fza fzaVar6 = oue0.a;
                            httpURLConnection.getResponseCode();
                            wf10.g();
                            qm0Var.invoke(string2, Integer.valueOf(httpURLConnection.getResponseCode()));
                            return;
                        } catch (UnknownHostException e2) {
                            fza fzaVar7 = oue0.a;
                            e2.toString();
                            wf10.g();
                            qm0Var.invoke(th, Integer.valueOf(ContentDeliveryMode.DVR));
                            return;
                        } catch (IOException e3) {
                            fza fzaVar8 = oue0.a;
                            e3.toString();
                            wf10.g();
                            return;
                        }
                    }
                    th = null;
                    SingletonList = th;
                    if (SingletonList == 0) {
                        return;
                    }
                    qm5.a().addAll((Collection) SingletonList);
                    iMax = Math.max(0, qm5.a().size() - 1000);
                    if (iMax > 0) {
                        qm5.d = w0h1.j(o7h.k0(qm5.a(), iMax));
                    }
                    int iMin2 = Math.min(qm5.a().size(), 10);
                    listY0 = o7h.Y0(qm5.a(), new tr80(0, iMin2 - 1, 1));
                    qm5.a().subList(0, iMin2).clear();
                    JSONArray jSONArray2 = new JSONArray((Collection) listY0);
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("data", jSONArray2);
                    pm5Var = qm5.c;
                    if (pm5Var != null) {
                        Throwable th10 = th;
                        u890.C("credentials");
                        throw th10;
                    }
                    linkedHashMap.put("accessKey", pm5Var.c);
                    String string3 = new JSONObject(linkedHashMap).toString();
                    mapSingletonMap = Collections.singletonMap("Content-Type", "application/json");
                    qm0Var = new qm0(listY0, (byte) 1);
                    httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    setKeySet = mapSingletonMap.keySet();
                    if (setKeySet != null) {
                        while (r6.hasNext()) {
                            httpURLConnection.setRequestProperty(str13, (String) mapSingletonMap.get(str13));
                        }
                    }
                    if (httpURLConnection.getRequestMethod().equals("POST")) {
                        z = true;
                    } else {
                        z = true;
                    }
                    httpURLConnection.setDoOutput(z);
                    httpURLConnection.setConnectTimeout(60000);
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
                    bufferedWriter2.write(string3);
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                    bufferedOutputStream2.close();
                    sb = new StringBuilder();
                    if (qm5.a.contains(Integer.valueOf(httpURLConnection.getResponseCode()))) {
                        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        while (true) {
                            line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                            } else {
                                bufferedReader.close();
                            }
                        }
                    }
                    String string4 = sb.toString();
                    fza fzaVar9 = oue0.a;
                    httpURLConnection.getResponseCode();
                    wf10.g();
                    qm0Var.invoke(string4, Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                } catch (UninitializedPropertyAccessException unused4) {
                    fza fzaVar10 = oue0.a;
                    wf10.g();
                    return;
                }
            case 5:
                if (((aos) this.b).l != 1) {
                    throw new NotAuthorizedException();
                }
                return;
            case 6:
                a();
                return;
            case 7:
                rl1 rl1Var = (rl1) this.b;
                ((Context) rl1Var.c).unregisterReceiver((to7) rl1Var.d);
                return;
            case 8:
                to7 to7Var = (to7) this.b;
                if (to7Var.c.b) {
                    to7Var.a.a.G1(3, false);
                    return;
                }
                return;
            case 9:
                tp7 tp7Var = (tp7) this.b;
                List listG = tp7Var.g();
                Context context = (Context) tp7Var.b;
                po7 po7Var = (po7) tp7Var.k;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) tp7Var.j;
                bg11 bg11Var = qp7.e;
                tp7Var.h(qp7.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), po7Var, audioDeviceInfo, listG));
                return;
            case 10:
                h9d0 h9d0Var = (h9d0) this.b;
                h9d0Var.getClass();
                if (Thread.currentThread() == ((Thread) h9d0Var.c)) {
                    h9d0Var.h(-1, new um5((byte) c));
                    return;
                }
                return;
            case 11:
                w0d w0dVar = (w0d) this.b;
                mzc mzcVar = (mzc) w0dVar.g;
                if (mzcVar != null) {
                    mzcVar.b((Object) null);
                    w0dVar.g = null;
                    return;
                }
                return;
            case 12:
                p1d p1dVar = (p1d) this.b;
                p1dVar.U0 = false;
                p1dVar.T0 = false;
                p1dVar.t("OpenCameraConfigAndClose is done, state: ".concat(z5c.u(p1dVar.h1)));
                int iC3 = l1d.C(p1dVar.h1);
                if (iC3 == 1 || iC3 == 4) {
                    o0c.q((String) null, p1dVar.Z.isEmpty());
                    p1dVar.u();
                    return;
                } else {
                    if (iC3 != 6) {
                        p1dVar.t("OpenCameraConfigAndClose finished while in state: ".concat(z5c.u(p1dVar.h1)));
                        return;
                    }
                    int i21 = p1dVar.X;
                    if (i21 == 0) {
                        p1dVar.J(false);
                        return;
                    } else {
                        p1dVar.t("OpenCameraConfigAndClose in error: ".concat(p1d.v(i21)));
                        p1dVar.h.b();
                        return;
                    }
                }
            case 13:
                ((CameraDevice) this.b).close();
                return;
            case 14:
                n1d n1dVar = (n1d) this.b;
                if (n1dVar.b) {
                    return;
                }
                o0c.q((String) null, ((o1d) n1dVar.d).f.h1 == 7 || ((o1d) n1dVar.d).f.h1 == 6);
                boolean zC = ((o1d) n1dVar.d).c();
                p1d p1dVar2 = ((o1d) n1dVar.d).f;
                if (zC) {
                    p1dVar2.I(true);
                    return;
                } else {
                    p1dVar2.J(true);
                    return;
                }
            case 15:
                x74.d0(((c4d) this.b).b);
                return;
            case 16:
                j1d j1dVar = (j1d) this.b;
                if (j1dVar.c.h1 == 4) {
                    j1dVar.c.J(false);
                    return;
                }
                return;
            case 17:
                lo9 lo9Var = (lo9) this.b;
                if (((p1d) lo9Var.b).h1 == 9) {
                    ((p1d) lo9Var.b).B();
                    return;
                }
                return;
            case 18:
                CancellableSeekBar cancellableSeekBar = (CancellableSeekBar) this.b;
                int i22 = CancellableSeekBar.i;
                bg11 bg11VarT = b380.t(new Rect(0, 0, cancellableSeekBar.getWidth(), cancellableSeekBar.getHeight()));
                WeakHashMap weakHashMap = b8k1.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    w7k1.c(cancellableSeekBar, bg11VarT);
                    return;
                }
                return;
            case 19:
                b();
                return;
            case 20:
                for (hdd1 hdd1Var : (LinkedHashSet) this.b) {
                    hdd1Var.getClass();
                    hdd1Var.c(hdd1Var);
                }
                return;
            case 21:
                ((hp41) ((androidx.car.app.k) this.b).e(hp41.class)).b();
                return;
            case 22:
                zwg zwgVar = (zwg) this.b;
                if (dhn.a.contains(zwg.class)) {
                    return;
                }
                try {
                    zwgVar.v();
                    return;
                } catch (Throwable th11) {
                    dhn.a(zwg.class, th11);
                    return;
                }
            case 23:
                b0i b0iVar = (b0i) this.b;
                Runnable runnable = b0iVar.b;
                if (runnable != null) {
                    runnable.run();
                    b0iVar.b = null;
                    return;
                }
                return;
            case 24:
                try {
                    g0i.c0((g0i) this.b);
                    return;
                } catch (IllegalStateException e4) {
                    if (!u890.j(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!u890.j(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
            case 25:
                p0i.c((p0i) this.b);
                return;
            case 26:
                pfr pfrVar = (pfr) this.b;
                pfrVar.a0(pfrVar.I(), 1028, new lfr((byte) 18));
                pfrVar.f.d();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ygr ygrVar = (ygr) this.b;
                if (ygrVar.c0 >= 300000) {
                    ((zjh0) ygrVar.o.b).s2 = true;
                    ygrVar.c0 = 0L;
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                bwr bwrVar = (bwr) this.b;
                if (bwrVar.c) {
                    return;
                }
                y8v y8vVar = bwrVar.b;
                if (y8vVar != null) {
                    y8vVar.c(bwrVar.a);
                }
                bwrVar.d.n.remove(bwrVar);
                bwrVar.c = true;
                return;
            default:
                ((awr) this.b).c(null);
                return;
        }
    }
}
