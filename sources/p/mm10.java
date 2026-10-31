package p;

import android.content.ClipData;
import android.util.Patterns;
import androidx.car.app.navigation.model.Maneuver;
import com.google.protobuf.Empty;
import com.spotify.base.java.logging.Logger;
import com.spotify.metadata.esperanto.proto.GetEntityResponse;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.pending_events.esperanto.proto.AddPendingEventResponse;
import com.spotify.voiceassistants.playermodels.CommandPlayResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mm10 implements Function3, BiFunction, Function, pmv0, Predicate, n8n, av30, g4u, Init {
    public static Map c;
    public static Map d;
    public static Map e;
    public static JSONObject f;
    public static boolean g;
    public final /* synthetic */ byte a;
    public static final mm10 b = new mm10(0);
    public static final mm10 h = new mm10(1);
    public static final mm10 i = new mm10(2);
    public static final mm10 t = new mm10(3);
    public static final mm10 X = new mm10(4);
    public static final mm10 Y = new mm10(5);
    public static final mm10 Z = new mm10(6);
    public static final mm10 N0 = new mm10(7);
    public static final mm10 O0 = new mm10(8);
    public static final mm10 P0 = new mm10(9);
    public static final mm10 Q0 = new mm10(10);
    public static final mm10 R0 = new mm10(11);
    public static final mm10 S0 = new mm10(12);
    public static final mm10 T0 = new mm10(13);
    public static final mm10 U0 = new mm10(14);
    public static final mm10 V0 = new mm10(15);
    public static final mm10 W0 = new mm10(16);
    public static final mm10 X0 = new mm10(17);
    public static final /* synthetic */ mm10 Y0 = new mm10(18);
    public static final mm10 Z0 = new mm10(19);
    public static final mm10 a1 = new mm10(20);
    public static final mm10 b1 = new mm10(21);
    public static final mm10 c1 = new mm10(22);
    public static final mm10 d1 = new mm10(23);
    public static final mm10 e1 = new mm10(24);
    public static final mm10 f1 = new mm10(25);
    public static final mm10 g1 = new mm10(26);
    public static final mm10 h1 = new mm10(27);
    public static final mm10 i1 = new mm10(28);
    public static final mm10 j1 = new mm10(29);

    public /* synthetic */ mm10(byte b2) {
        this.a = b2;
    }

    public static final float[] c(String str, JSONObject jSONObject) {
        if (!dhn.a.contains(mm10.class)) {
            try {
                if (g) {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    try {
                        String lowerCase = str.toLowerCase();
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        String strOptString = jSONObject.optString("screenname");
                        JSONArray jSONArray = new JSONArray();
                        mm10 mm10Var = b;
                        mm10Var.j(jSONObject2, jSONArray);
                        mm10Var.m(fArr, mm10Var.i(jSONObject2));
                        JSONObject jSONObjectD = mm10Var.d(jSONObject2);
                        if (jSONObjectD != null) {
                            mm10Var.m(fArr, mm10Var.h(jSONObjectD, jSONArray, strOptString, jSONObject2.toString(), lowerCase));
                            return fArr;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th) {
                dhn.a(mm10.class, th);
                return null;
            }
        }
        return null;
    }

    public static final String e(String str, String str2, String str3) {
        if (dhn.a.contains(mm10.class)) {
            return null;
        }
        try {
            return (str3 + " | " + str2 + ", " + str).toLowerCase();
        } catch (Throwable th) {
            dhn.a(mm10.class, th);
            return null;
        }
    }

    public static final void f(File file) {
        if (dhn.a.contains(mm10.class)) {
            return;
        }
        try {
            try {
                f = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f = new JSONObject(new String(bArr, nne.a));
                c = sqg0.J(new mmr0[]{new mmr0("ENGLISH", "1"), new mmr0("GERMAN", "2"), new mmr0("SPANISH", "3"), new mmr0("JAPANESE", "4")});
                d = sqg0.J(new mmr0[]{new mmr0("VIEW_CONTENT", "0"), new mmr0("SEARCH", "1"), new mmr0("ADD_TO_CART", "2"), new mmr0("ADD_TO_WISHLIST", "3"), new mmr0("INITIATE_CHECKOUT", "4"), new mmr0("ADD_PAYMENT_INFO", "5"), new mmr0("PURCHASE", "6"), new mmr0("LEAD", "7"), new mmr0("COMPLETE_REGISTRATION", "8")});
                e = sqg0.J(new mmr0[]{new mmr0("BUTTON_TEXT", "1"), new mmr0("PAGE_TITLE", "2"), new mmr0("RESOLVED_DOCUMENT_LINK", "3"), new mmr0("BUTTON_ID", "4")});
                g = true;
            } catch (Throwable th) {
                dhn.a(mm10.class, th);
            }
        } catch (Exception unused) {
        }
    }

    public void a(wax waxVar) {
        es8 es8Var = es8.a;
        aga0 aga0Var = (aga0) waxVar;
        aga0Var.c(vin.class, es8Var);
        aga0Var.c(uy8.class, es8Var);
        ks8 ks8Var = ks8.a;
        aga0Var.c(uin.class, ks8Var);
        aga0Var.c(gz8.class, ks8Var);
        hs8 hs8Var = hs8.a;
        aga0Var.c(cin.class, hs8Var);
        aga0Var.c(hz8.class, hs8Var);
        is8 is8Var = is8.a;
        aga0Var.c(bin.class, is8Var);
        aga0Var.c(iz8.class, is8Var);
        at8 at8Var = at8.a;
        aga0Var.c(tin.class, at8Var);
        aga0Var.c(m09.class, at8Var);
        zs8 zs8Var = zs8.a;
        aga0Var.c(sin.class, zs8Var);
        aga0Var.c(l09.class, zs8Var);
        js8 js8Var = js8.a;
        aga0Var.c(din.class, js8Var);
        aga0Var.c(kz8.class, js8Var);
        us8 us8Var = us8.a;
        aga0Var.c(rin.class, us8Var);
        aga0Var.c(mz8.class, us8Var);
        ls8 ls8Var = ls8.a;
        aga0Var.c(lin.class, ls8Var);
        aga0Var.c(oz8.class, ls8Var);
        ns8 ns8Var = ns8.a;
        aga0Var.c(jin.class, ns8Var);
        aga0Var.c(pz8.class, ns8Var);
        qs8 qs8Var = qs8.a;
        aga0Var.c(iin.class, qs8Var);
        aga0Var.c(xz8.class, qs8Var);
        rs8 rs8Var = rs8.a;
        aga0Var.c(hin.class, rs8Var);
        aga0Var.c(zz8.class, rs8Var);
        os8 os8Var = os8.a;
        aga0Var.c(fin.class, os8Var);
        aga0Var.c(tz8.class, os8Var);
        cs8 cs8Var = cs8.a;
        aga0Var.c(xhn.class, cs8Var);
        aga0Var.c(xy8.class, cs8Var);
        bs8 bs8Var = bs8.a;
        aga0Var.c(whn.class, bs8Var);
        aga0Var.c(zy8.class, bs8Var);
        ps8 ps8Var = ps8.a;
        aga0Var.c(gin.class, ps8Var);
        aga0Var.c(vz8.class, ps8Var);
        ms8 ms8Var = ms8.a;
        aga0Var.c(ein.class, ms8Var);
        aga0Var.c(rz8.class, ms8Var);
        ds8 ds8Var = ds8.a;
        aga0Var.c(yhn.class, ds8Var);
        aga0Var.c(bz8.class, ds8Var);
        ss8 ss8Var = ss8.a;
        aga0Var.c(kin.class, ss8Var);
        aga0Var.c(b09.class, ss8Var);
        ts8 ts8Var = ts8.a;
        aga0Var.c(min.class, ts8Var);
        aga0Var.c(d09.class, ts8Var);
        vs8 vs8Var = vs8.a;
        aga0Var.c(nin.class, vs8Var);
        aga0Var.c(e09.class, vs8Var);
        ys8 ys8Var = ys8.a;
        aga0Var.c(qin.class, ys8Var);
        aga0Var.c(j09.class, ys8Var);
        ws8 ws8Var = ws8.a;
        aga0Var.c(pin.class, ws8Var);
        aga0Var.c(g09.class, ws8Var);
        xs8 xs8Var = xs8.a;
        aga0Var.c(oin.class, xs8Var);
        aga0Var.c(h09.class, xs8Var);
        fs8 fs8Var = fs8.a;
        aga0Var.c(ain.class, fs8Var);
        aga0Var.c(dz8.class, fs8Var);
        gs8 gs8Var = gs8.a;
        aga0Var.c(zhn.class, gs8Var);
        aga0Var.c(ez8.class, gs8Var);
    }

    public Object apply(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 3:
                return z6x.a;
            case 4:
                CommandPlayResponse commandPlayResponse = (CommandPlayResponse) obj;
                if (commandPlayResponse.getError() == null && commandPlayResponse.getContext() != null) {
                    return commandPlayResponse;
                }
                String error = commandPlayResponse.getError();
                if (error == null) {
                    error = "Speakeasy didn't return a context";
                }
                Logger.k(gvg.h("Error resolving NL-URI: ", error, ". Request: ", commandPlayResponse.getRequestId()), new Object[0]);
                eg.m(error);
                return null;
            case 5:
                return Observable.never();
            case 6:
                return Boolean.valueOf(((yw4) obj).c);
            case 7:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof g) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return Empty.q(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
            case 10:
            case 12:
            case 13:
            case 15:
            case 17:
            case 18:
            case 23:
            case 24:
            case 26:
            default:
                return rih1.a;
            case 11:
                AddPendingEventResponse addPendingEventResponse = (AddPendingEventResponse) obj;
                return addPendingEventResponse.o() ? Single.just(new doa(addPendingEventResponse.p(), addPendingEventResponse.q())) : Single.error(new m9("Can't add pending event", addPendingEventResponse.n()));
            case 14:
                gbl gblVar = (gbl) obj;
                return Boolean.valueOf(gblVar.b && gblVar != gbl.Z);
            case 16:
                return Boolean.valueOf(y7y0.t("offline", (Map) obj));
            case 19:
                return (eww0) ((spq0) obj).b();
            case 20:
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getValue();
                    if (str == null) {
                        str = (String) entry.getKey();
                    }
                    arrayList2.add(str);
                }
                return arrayList2;
            case 21:
                xik xikVar = (xik) obj;
                return new dbb1(xikVar.t == null, xikVar.g);
            case 22:
                spq0 spq0Var = (spq0) obj;
                if (spq0Var.c() && !((l0l) spq0Var.b()).l()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                return Boolean.valueOf(((vge0) obj) == vge0.a);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((GetEntityResponse) obj).n().q().getName();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                xdz xdzVar = (xdz) obj;
                if (xdzVar instanceof wdz) {
                    return Observable.just(((wdz) xdzVar).a);
                }
                if (xdzVar instanceof vdz) {
                    return Observable.error(new Throwable(((vdz) xdzVar).a));
                }
                eg.o();
                return null;
        }
    }

    @Override // p.pmv0
    public boolean b(ClipData.Item item) {
        return item.getText() != null;
    }

    public JSONObject d(JSONObject jSONObject) {
        if (!dhn.a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return jSONObject;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject jSONObjectD = d(jSONArrayOptJSONArray.getJSONObject(i2));
                        if (jSONObjectD != null) {
                            return jSONObjectD;
                        }
                    }
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        }
        return null;
    }

    public First e0(Object obj) {
        return First.b((m3w) obj);
    }

    public boolean g(String[] strArr, String[] strArr2) {
        if (!dhn.a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (ihc1.h0(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0148  */
    /* JADX WARN: Code duplicated, block: B:79:0x014a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0155  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    public float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        String str4;
        String string;
        String string2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float[] fArr2 = null;
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i2 = 0;
            while (true) {
                if (i2 >= 30) {
                    break;
                }
                fArr3[i2] = 0.0f;
                i2++;
                dhn.a(this, th);
                return fArr;
            }
            int length = jSONArray.length();
            boolean z = true;
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i3 = 0;
                while (i3 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            boolean z2 = z;
                            if (!dhn.a.contains(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    dhn.a(this, th);
                                }
                            }
                            i3++;
                            fArr2 = fArr;
                            z = z2;
                        } catch (JSONException unused) {
                            fArr3[13] = -1.0f;
                            fArr3[14] = -1.0f;
                            str4 = str + '|' + str3;
                            StringBuilder sb = new StringBuilder();
                            StringBuilder sb2 = new StringBuilder();
                            o(jSONObject, sb2, sb);
                            string = sb.toString();
                            string2 = sb2.toString();
                            if (l("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                                f2 = 1.0f;
                            } else {
                                f2 = 0.0f;
                            }
                            fArr3[15] = f2;
                            if (l("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            fArr3[16] = f3;
                            if (l("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                                f4 = 1.0f;
                            } else {
                                f4 = 0.0f;
                            }
                            fArr3[17] = f4;
                            if (ihc1.h0(str2, "password", false)) {
                                f5 = 1.0f;
                            } else {
                                f5 = 0.0f;
                            }
                            fArr3[18] = f5;
                            if (k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                                f6 = 1.0f;
                            } else {
                                f6 = 0.0f;
                            }
                            fArr3[19] = f6;
                            if (k("(?i)(sign in)|login|signIn", str2)) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fArr3[20] = f7;
                            if (k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                                f8 = 1.0f;
                            } else {
                                f8 = 0.0f;
                            }
                            fArr3[21] = f8;
                            if (l("PURCHASE", "BUTTON_TEXT", string2)) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            fArr3[22] = f9;
                            if (l("PURCHASE", "PAGE_TITLE", str4)) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fArr3[24] = f10;
                            if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            fArr3[25] = f11;
                            if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            fArr3[27] = f12;
                            if (l("LEAD", "BUTTON_TEXT", string2)) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            fArr3[28] = f13;
                            fArr3[29] = l("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
                            return fArr3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            str4 = str + '|' + str3;
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            o(jSONObject, sb4, sb3);
            string = sb3.toString();
            string2 = sb4.toString();
            if (l("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr3[15] = f2;
            if (l("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            fArr3[16] = f3;
            if (l("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            fArr3[17] = f4;
            if (ihc1.h0(str2, "password", false)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            fArr3[18] = f5;
            if (k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f6 = 1.0f;
            } else {
                f6 = 0.0f;
            }
            fArr3[19] = f6;
            if (k("(?i)(sign in)|login|signIn", str2)) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            fArr3[20] = f7;
            if (k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f8 = 1.0f;
            } else {
                f8 = 0.0f;
            }
            fArr3[21] = f8;
            if (l("PURCHASE", "BUTTON_TEXT", string2)) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            fArr3[22] = f9;
            if (l("PURCHASE", "PAGE_TITLE", str4)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr3[24] = f10;
            if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr3[25] = f11;
            if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr3[27] = f12;
            if (l("LEAD", "BUTTON_TEXT", string2)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr3[28] = f13;
            fArr3[29] = l("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = null;
        }
    }

    public float[] i(JSONObject jSONObject) {
        if (dhn.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String lowerCase = jSONObject.optString("text").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint").toLowerCase();
            String lowerCase3 = jSONObject.optString("classname").toLowerCase();
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (ihc1.h0(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (ihc1.h0(lowerCase3, "radio", false) && ihc1.h0(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    m(fArr, i(jSONArrayOptJSONArray.getJSONObject(i3)));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            dhn.a(this, th);
            return null;
        }
    }

    public boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (!dhn.a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (jSONArrayOptJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i3));
                    }
                    return z2;
                }
                int length3 = jSONArrayOptJSONArray.length();
                for (int i4 = 0; i4 < length3; i4++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i4);
                    if (j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                dhn.a(this, th);
            }
        }
        return false;
    }

    public boolean k(String str, String str2) {
        if (dhn.a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            dhn.a(this, th);
            return false;
        }
    }

    public boolean l(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!dhn.a.contains(this)) {
            try {
                JSONObject jSONObject = f;
                String strOptString = null;
                if (jSONObject == null) {
                    u890.C("rules");
                    throw null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (jSONObjectOptJSONObject3 != null) {
                    Map map = c;
                    if (map == null) {
                        u890.C("languageInfo");
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map.get("ENGLISH"));
                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        Map map2 = d;
                        if (map2 == null) {
                            u890.C("eventInfo");
                            throw null;
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map2.get(str));
                        if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                            Map map3 = e;
                            if (map3 == null) {
                                u890.C("textTypeInfo");
                                throw null;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString((String) map3.get(str2));
                        }
                    }
                }
                if (strOptString != null) {
                    return k(strOptString, str3);
                }
            } catch (Throwable th) {
                dhn.a(this, th);
                return false;
            }
        }
        return false;
    }

    public void m(float[] fArr, float[] fArr2) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr[i2] + fArr2[i2];
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        spq0 spq0Var = (spq0) obj2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        spq0Var.getClass();
        return new mm(zBooleanValue, spq0Var, (spq0) obj3);
    }

    public void o(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            String lowerCase = jSONObject.optString("text", "").toLowerCase();
            String lowerCase2 = jSONObject.optString("hint", "").toLowerCase();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    o(jSONArrayOptJSONArray.getJSONObject(i2), sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 15:
                return ((th61) obj).b;
            case 16:
            default:
                return ((z7l) obj).c != null;
            case 17:
                List list = (List) obj;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return false;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((l0l) it.next()).l()) {
                        return true;
                    }
                }
                return false;
        }
    }

    public boolean test(Object obj, Object obj2) {
        h8l1 h8l1Var = (h8l1) obj;
        h8l1 h8l1Var2 = (h8l1) obj2;
        return (u890.j(h8l1Var.e, h8l1Var2.e) && h8l1Var.h == h8l1Var2.h) ? false : true;
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                return new mmr0((Boolean) obj, (i280) obj2);
            case 12:
                return new mmr0((Set) obj, (zib) obj2);
            default:
                return new mmr0((gmc) obj, (String) obj2);
        }
    }
}
