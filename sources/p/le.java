package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.TrafficStats;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.branch.referral.network.BranchRemoteInterface;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.OutputStreamWriter;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class le {
    public final /* synthetic */ byte a;
    public int b;
    public Object c;
    public Object d;
    public int e;
    public Object f;

    public le(Context context, ConstraintLayout constraintLayout, int i) {
        String str;
        this.a = (byte) 2;
        this.b = -1;
        this.e = -1;
        this.d = new SparseArray();
        this.f = new SparseArray();
        this.c = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            yhl yhlVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                g(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                yhl yhlVar2 = new yhl(context, xml);
                                ((SparseArray) this.d).put(yhlVar2.a, yhlVar2);
                                yhlVar = yhlVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                zhl zhlVar = new zhl(context, xml);
                                if (yhlVar != null) {
                                    yhlVar.b.add(zhlVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public static String d(InputStream inputStream) {
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return sb.toString();
                    }
                    sb.append(line);
                }
            } catch (IOException e) {
                i1k0.m(e.getMessage());
            }
        }
        return null;
    }

    public static b961 h(mgc mgcVar, String str, String str2) {
        StringBuilder sb;
        String str3 = (String) mgcVar.c;
        int i = mgcVar.b;
        b961 b961Var = new b961(i, "");
        if (TextUtils.isEmpty(str2)) {
            i1k0.B("returned " + str3);
        } else {
            i1k0.B(String.format(Locale.getDefault(), "Server returned: [%s] Status: [%d]; Data: %s", str2, Integer.valueOf(i), str3));
        }
        if (str3 != null) {
            try {
                try {
                    b961Var.b = new JSONObject(str3);
                    return b961Var;
                } catch (JSONException unused) {
                    b961Var.b = new JSONArray(str3);
                    return b961Var;
                }
            } catch (JSONException e) {
                e = e;
                f4t f4tVar = f4t.b;
                if (str.contains("qr-code")) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("QRCodeString", str3);
                        b961Var.b = jSONObject;
                    } catch (JSONException e2) {
                        e = e2;
                        sb = new StringBuilder("Caught JSONException ");
                        l1d.A(e, sb);
                    }
                } else {
                    sb = new StringBuilder("Caught JSONException ");
                }
                l1d.A(e, sb);
            }
        }
        return b961Var;
    }

    public int a(long j) {
        int i = this.b + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            f46.Y(jArr, jArr2, 0);
            f46.V(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        int[] iArr2 = (int[]) this.f;
        int length2 = iArr2.length;
        if (this.e >= length2) {
            int i4 = length2 * 2;
            iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            f46.V(0, 0, 14, (int[]) this.f, iArr2);
            this.f = iArr2;
        }
        int[] iArr3 = iArr2;
        int i7 = this.e;
        this.e = iArr2[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (u890.r(jArr3[i8], j) <= 0) {
                break;
            }
            k(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02cd A[Catch: all -> 0x00b7, TryCatch #16 {all -> 0x00b7, blocks: (B:128:0x02c2, B:130:0x02cd, B:131:0x02dd, B:132:0x02de, B:133:0x02e9, B:134:0x02ea, B:136:0x02f3, B:140:0x0304, B:144:0x0313, B:145:0x031e, B:139:0x02fd, B:146:0x031f, B:148:0x0328, B:152:0x0339, B:156:0x0348, B:157:0x0353, B:151:0x0332, B:158:0x0354, B:160:0x035d, B:164:0x036e, B:168:0x037d, B:169:0x0388, B:163:0x0367, B:28:0x00ac, B:47:0x0120, B:51:0x0131, B:50:0x012a, B:57:0x014e, B:59:0x0154), top: B:173:0x005c, inners: #23, #34, #38 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02de A[Catch: all -> 0x00b7, TryCatch #16 {all -> 0x00b7, blocks: (B:128:0x02c2, B:130:0x02cd, B:131:0x02dd, B:132:0x02de, B:133:0x02e9, B:134:0x02ea, B:136:0x02f3, B:140:0x0304, B:144:0x0313, B:145:0x031e, B:139:0x02fd, B:146:0x031f, B:148:0x0328, B:152:0x0339, B:156:0x0348, B:157:0x0353, B:151:0x0332, B:158:0x0354, B:160:0x035d, B:164:0x036e, B:168:0x037d, B:169:0x0388, B:163:0x0367, B:28:0x00ac, B:47:0x0120, B:51:0x0131, B:50:0x012a, B:57:0x014e, B:59:0x0154), top: B:173:0x005c, inners: #23, #34, #38 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x030c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0313 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #16 {all -> 0x00b7, blocks: (B:128:0x02c2, B:130:0x02cd, B:131:0x02dd, B:132:0x02de, B:133:0x02e9, B:134:0x02ea, B:136:0x02f3, B:140:0x0304, B:144:0x0313, B:145:0x031e, B:139:0x02fd, B:146:0x031f, B:148:0x0328, B:152:0x0339, B:156:0x0348, B:157:0x0353, B:151:0x0332, B:158:0x0354, B:160:0x035d, B:164:0x036e, B:168:0x037d, B:169:0x0388, B:163:0x0367, B:28:0x00ac, B:47:0x0120, B:51:0x0131, B:50:0x012a, B:57:0x014e, B:59:0x0154), top: B:173:0x005c, inners: #23, #34, #38 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0341  */
    /* JADX WARN: Code duplicated, block: B:156:0x0348 A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #16 {all -> 0x00b7, blocks: (B:128:0x02c2, B:130:0x02cd, B:131:0x02dd, B:132:0x02de, B:133:0x02e9, B:134:0x02ea, B:136:0x02f3, B:140:0x0304, B:144:0x0313, B:145:0x031e, B:139:0x02fd, B:146:0x031f, B:148:0x0328, B:152:0x0339, B:156:0x0348, B:157:0x0353, B:151:0x0332, B:158:0x0354, B:160:0x035d, B:164:0x036e, B:168:0x037d, B:169:0x0388, B:163:0x0367, B:28:0x00ac, B:47:0x0120, B:51:0x0131, B:50:0x012a, B:57:0x014e, B:59:0x0154), top: B:173:0x005c, inners: #23, #34, #38 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x0376  */
    /* JADX WARN: Code duplicated, block: B:168:0x037d A[Catch: all -> 0x00b7, TRY_ENTER, TryCatch #16 {all -> 0x00b7, blocks: (B:128:0x02c2, B:130:0x02cd, B:131:0x02dd, B:132:0x02de, B:133:0x02e9, B:134:0x02ea, B:136:0x02f3, B:140:0x0304, B:144:0x0313, B:145:0x031e, B:139:0x02fd, B:146:0x031f, B:148:0x0328, B:152:0x0339, B:156:0x0348, B:157:0x0353, B:151:0x0332, B:158:0x0354, B:160:0x035d, B:164:0x036e, B:168:0x037d, B:169:0x0388, B:163:0x0367, B:28:0x00ac, B:47:0x0120, B:51:0x0131, B:50:0x012a, B:57:0x014e, B:59:0x0154), top: B:173:0x005c, inners: #23, #34, #38 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x038b  */
    /* JADX WARN: Code duplicated, block: B:176:0x035d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0328 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x02f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b2 A[Catch: FileNotFoundException -> 0x01a7, all -> 0x01f3, Exception -> 0x01f8, IOException -> 0x01fd, InterruptedIOException -> 0x0202, SocketTimeoutException -> 0x0207, TRY_LEAVE, TryCatch #39 {FileNotFoundException -> 0x01a7, blocks: (B:57:0x014e, B:59:0x0154, B:69:0x01ac, B:71:0x01b2), top: B:187:0x014e }] */
    /* JADX WARN: Code duplicated, block: B:96:0x020c A[Catch: all -> 0x01d8, Exception -> 0x01dd, IOException -> 0x01e2, InterruptedIOException -> 0x01e7, SocketTimeoutException -> 0x01ec, FileNotFoundException -> 0x01f1, TryCatch #32 {FileNotFoundException -> 0x01f1, blocks: (B:73:0x01c5, B:97:0x021b, B:96:0x020c), top: B:180:0x01b0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v21, types: [java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r18v22 */
    /* JADX WARN: Type inference failed for: r18v23 */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    public mgc b(String str, JSONObject jSONObject, int i) throws Throwable {
        ?? r15;
        ne neVar;
        ?? r18;
        mgc mgcVar;
        ?? r19;
        ?? r110;
        int i2 = i;
        int i3 = this.e;
        ne neVarZ = ne.z(((n3c) this.f).d);
        SharedPreferences sharedPreferences = (SharedPreferences) neVarZ.a;
        int i4 = sharedPreferences.getInt("bnc_timeout", 5500);
        int i5 = sharedPreferences.getInt("bnc_connect_timeout", 10000);
        try {
            jSONObject.put("retryNumber", i2);
        } catch (JSONException e) {
            StringBuilder sbR = cy30.r(i2, "Caught JSONException, retry number: ", " ");
            sbR.append(e.getMessage());
            r15 = " stacktrace: ";
            sbR.append(" stacktrace: ");
            sbR.append(i1k0.x(e));
            i1k0.n(sbR.toString());
        }
        try {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        TrafficStats.setThreadStatsTag(102);
                    } catch (SocketTimeoutException e2) {
                        e = e2;
                        neVar = neVarZ;
                        r15 = 0;
                        i1k0.n(c(i2, e, str));
                        if (i2 >= i3) {
                            throw new BranchRemoteInterface.BranchRemoteException(-111, e.getMessage());
                        }
                        try {
                            Thread.sleep(neVar.E());
                        } catch (InterruptedException e3) {
                            i1k0.n(c(i2, e3, str));
                        }
                        mgc mgcVarB = b(str, jSONObject, i2 + 1);
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        return mgcVarB;
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        throw th;
                    } catch (InterruptedIOException e4) {
                        e = e4;
                        neVar = neVarZ;
                        r15 = 0;
                        i1k0.n(c(i2, e, str));
                        if (i2 >= i3) {
                            throw new BranchRemoteInterface.BranchRemoteException(-120, e.getMessage());
                        }
                        try {
                            Thread.sleep(neVar.E());
                        } catch (InterruptedException e5) {
                            i1k0.n(c(i2, e5, str));
                        }
                        mgc mgcVarB2 = b(str, jSONObject, i2 + 1);
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        return mgcVarB2;
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        throw th;
                    } catch (IOException e6) {
                        e = e6;
                        neVar = neVarZ;
                        r15 = 0;
                        i1k0.n(c(i2, e, str));
                        if (i2 >= i3) {
                            throw new BranchRemoteInterface.BranchRemoteException(-113, e.getMessage());
                        }
                        try {
                            Thread.sleep(neVar.E());
                        } catch (InterruptedException e7) {
                            i1k0.n(c(i2, e7, str));
                        }
                        mgc mgcVarB3 = b(str, jSONObject, i2 + 1);
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        return mgcVarB3;
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        throw th;
                    } catch (Exception e8) {
                        e = e8;
                        i1k0.n(c(i2, e, str));
                        if (!(e instanceof NetworkOnMainThreadException)) {
                            throw new BranchRemoteInterface.BranchRemoteException(-122, e.getMessage());
                        }
                        i1k0.n("Cannot make network request on main thread.");
                        throw new BranchRemoteInterface.BranchRemoteException(-121, e.getMessage());
                    } catch (Throwable th) {
                        th = th;
                        r15 = 0;
                        if (r15 != 0) {
                            r15.disconnect();
                            j();
                        }
                        throw th;
                    }
                }
                r15 = (HttpsURLConnection) new URL(str).openConnection();
                try {
                    try {
                        r15.setConnectTimeout(i5);
                        r15.setReadTimeout(i4);
                        r15.setDoInput(true);
                        r15.setDoOutput(true);
                        f4t f4tVar = f4t.b;
                        if (str.contains("qr-code")) {
                            try {
                                try {
                                    r15.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                    r15.setRequestProperty("Accept", "image/*");
                                } catch (Exception e9) {
                                    e = e9;
                                    i1k0.n(c(i2, e, str));
                                    if (!(e instanceof NetworkOnMainThreadException)) {
                                        throw new BranchRemoteInterface.BranchRemoteException(-122, e.getMessage());
                                    }
                                    i1k0.n("Cannot make network request on main thread.");
                                    throw new BranchRemoteInterface.BranchRemoteException(-121, e.getMessage());
                                }
                            } catch (SocketTimeoutException e10) {
                                e = e10;
                                neVar = neVarZ;
                                i1k0.n(c(i2, e, str));
                                if (i2 >= i3) {
                                    throw new BranchRemoteInterface.BranchRemoteException(-111, e.getMessage());
                                }
                                Thread.sleep(neVar.E());
                                mgc mgcVarB4 = b(str, jSONObject, i2 + 1);
                                if (r15 != 0) {
                                    r15.disconnect();
                                    j();
                                }
                                return mgcVarB4;
                                if (r15 != 0) {
                                    r15.disconnect();
                                    j();
                                }
                                throw th;
                            } catch (InterruptedIOException e11) {
                                e = e11;
                                neVar = neVarZ;
                                i1k0.n(c(i2, e, str));
                                if (i2 >= i3) {
                                    throw new BranchRemoteInterface.BranchRemoteException(-120, e.getMessage());
                                }
                                Thread.sleep(neVar.E());
                                mgc mgcVarB5 = b(str, jSONObject, i2 + 1);
                                if (r15 != 0) {
                                    r15.disconnect();
                                    j();
                                }
                                return mgcVarB5;
                                if (r15 != 0) {
                                    r15.disconnect();
                                    j();
                                }
                                throw th;
                            } catch (IOException e12) {
                                e = e12;
                                neVar = neVarZ;
                                i1k0.n(c(i2, e, str));
                                if (i2 >= i3) {
                                    throw new BranchRemoteInterface.BranchRemoteException(-113, e.getMessage());
                                }
                                Thread.sleep(neVar.E());
                                mgc mgcVarB6 = b(str, jSONObject, i2 + 1);
                                if (r15 != 0) {
                                    r15.disconnect();
                                    j();
                                }
                                return mgcVarB6;
                                if (r15 != 0) {
                                    r15.disconnect();
                                    j();
                                }
                                throw th;
                            }
                        } else {
                            r15.setRequestProperty("Content-Type", "application/json");
                            r15.setRequestProperty("Accept", "application/json");
                        }
                        r15.setRequestMethod("POST");
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(r15.getOutputStream());
                        outputStreamWriter.write(jSONObject.toString());
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                        String headerField = r15.getHeaderField("X-Branch-Request-Id");
                        this.d = headerField;
                        int responseCode = r15.getResponseCode();
                        this.b = responseCode;
                        this.c = r15.getResponseMessage();
                        StringBuilder sb = new StringBuilder("lastResponseMessage ");
                        try {
                            sb.append((String) this.c);
                            i1k0.m(sb.toString());
                            if (responseCode < 500 || i2 >= i3) {
                                neVar = neVarZ;
                                try {
                                    if (responseCode != 200) {
                                        try {
                                            try {
                                                if (r15.getErrorStream() != null) {
                                                    i1k0.n("Branch Networking Error: \nURL: " + str + "\nResponse Code: " + this.b + "\nResponse Message: " + ((String) this.c) + "\nRetry number: " + i2 + "\nFinal attempt: true\nrequestId: " + ((String) this.d) + "\nObject: " + this);
                                                    mgcVar = new mgc(d(r15.getErrorStream()), responseCode);
                                                    r18 = r15;
                                                } else {
                                                    try {
                                                        try {
                                                            if (str.contains("qr-code")) {
                                                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(r15.getInputStream());
                                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                                r19 = r15;
                                                                bitmapDecodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                                                                mgcVar = new mgc(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0), responseCode);
                                                            } else {
                                                                ?? r111 = r15;
                                                                mgcVar = new mgc(d(r111.getInputStream()), responseCode);
                                                                r19 = r111;
                                                            }
                                                            i1k0.B("Branch Networking Success\nURL: " + str + "\nResponse Code: " + this.b + "\nResponse Message: " + ((String) this.c) + "\nRetry number: " + i2 + "\nrequestId: " + ((String) this.d) + "\nObject: " + this);
                                                            r18 = r19;
                                                        } catch (FileNotFoundException e13) {
                                                            e = e13;
                                                            r110 = r19;
                                                            i1k0.n(c(i2, e, str));
                                                            mgcVar = new mgc((String) null, responseCode);
                                                            r18 = r110;
                                                        }
                                                    } catch (SocketTimeoutException e14) {
                                                        e = e14;
                                                        i1k0.n(c(i2, e, str));
                                                        if (i2 >= i3) {
                                                            throw new BranchRemoteInterface.BranchRemoteException(-111, e.getMessage());
                                                        }
                                                        Thread.sleep(neVar.E());
                                                        mgc mgcVarB7 = b(str, jSONObject, i2 + 1);
                                                        if (r15 != 0) {
                                                            r15.disconnect();
                                                            j();
                                                        }
                                                        return mgcVarB7;
                                                        if (r15 != 0) {
                                                            r15.disconnect();
                                                            j();
                                                        }
                                                        throw th;
                                                    } catch (InterruptedIOException e15) {
                                                        e = e15;
                                                        i1k0.n(c(i2, e, str));
                                                        if (i2 >= i3) {
                                                            throw new BranchRemoteInterface.BranchRemoteException(-120, e.getMessage());
                                                        }
                                                        Thread.sleep(neVar.E());
                                                        mgc mgcVarB8 = b(str, jSONObject, i2 + 1);
                                                        if (r15 != 0) {
                                                            r15.disconnect();
                                                            j();
                                                        }
                                                        return mgcVarB8;
                                                        if (r15 != 0) {
                                                            r15.disconnect();
                                                            j();
                                                        }
                                                        throw th;
                                                    } catch (IOException e16) {
                                                        e = e16;
                                                        i1k0.n(c(i2, e, str));
                                                        if (i2 >= i3) {
                                                            throw new BranchRemoteInterface.BranchRemoteException(-113, e.getMessage());
                                                        }
                                                        Thread.sleep(neVar.E());
                                                        mgc mgcVarB9 = b(str, jSONObject, i2 + 1);
                                                        if (r15 != 0) {
                                                            r15.disconnect();
                                                            j();
                                                        }
                                                        return mgcVarB9;
                                                        if (r15 != 0) {
                                                            r15.disconnect();
                                                            j();
                                                        }
                                                        throw th;
                                                    }
                                                }
                                            } catch (FileNotFoundException e17) {
                                                e = e17;
                                                r110 = r15;
                                                i1k0.n(c(i2, e, str));
                                                mgcVar = new mgc((String) null, responseCode);
                                                r18 = r110;
                                                mgcVar.d = headerField;
                                                r18.disconnect();
                                                j();
                                                return mgcVar;
                                            }
                                        } catch (SocketTimeoutException e18) {
                                            e = e18;
                                            i1k0.n(c(i2, e, str));
                                            if (i2 >= i3) {
                                                throw new BranchRemoteInterface.BranchRemoteException(-111, e.getMessage());
                                            }
                                            Thread.sleep(neVar.E());
                                            mgc mgcVarB10 = b(str, jSONObject, i2 + 1);
                                            if (r15 != 0) {
                                                r15.disconnect();
                                                j();
                                            }
                                            return mgcVarB10;
                                            if (r15 != 0) {
                                                r15.disconnect();
                                                j();
                                            }
                                            throw th;
                                        } catch (InterruptedIOException e19) {
                                            e = e19;
                                            i1k0.n(c(i2, e, str));
                                            if (i2 >= i3) {
                                                throw new BranchRemoteInterface.BranchRemoteException(-120, e.getMessage());
                                            }
                                            Thread.sleep(neVar.E());
                                            mgc mgcVarB11 = b(str, jSONObject, i2 + 1);
                                            if (r15 != 0) {
                                                r15.disconnect();
                                                j();
                                            }
                                            return mgcVarB11;
                                            if (r15 != 0) {
                                                r15.disconnect();
                                                j();
                                            }
                                            throw th;
                                        } catch (IOException e20) {
                                            e = e20;
                                            i1k0.n(c(i2, e, str));
                                            if (i2 >= i3) {
                                                throw new BranchRemoteInterface.BranchRemoteException(-113, e.getMessage());
                                            }
                                            Thread.sleep(neVar.E());
                                            mgc mgcVarB12 = b(str, jSONObject, i2 + 1);
                                            if (r15 != 0) {
                                                r15.disconnect();
                                                j();
                                            }
                                            return mgcVarB12;
                                            if (r15 != 0) {
                                                r15.disconnect();
                                                j();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        if (str.contains("qr-code")) {
                                            Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(r15.getInputStream());
                                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                                            r19 = r15;
                                            bitmapDecodeStream2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
                                            mgcVar = new mgc(Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0), responseCode);
                                        } else {
                                            ?? r112 = r15;
                                            mgcVar = new mgc(d(r112.getInputStream()), responseCode);
                                            r19 = r112;
                                        }
                                        i1k0.B("Branch Networking Success\nURL: " + str + "\nResponse Code: " + this.b + "\nResponse Message: " + ((String) this.c) + "\nRetry number: " + i2 + "\nrequestId: " + ((String) this.d) + "\nObject: " + this);
                                        r18 = r19;
                                    }
                                    mgcVar.d = headerField;
                                    r18.disconnect();
                                } catch (SocketTimeoutException e21) {
                                    e = e21;
                                    r15 = r18;
                                    i1k0.n(c(i2, e, str));
                                    if (i2 >= i3) {
                                        throw new BranchRemoteInterface.BranchRemoteException(-111, e.getMessage());
                                    }
                                    Thread.sleep(neVar.E());
                                    mgc mgcVarB13 = b(str, jSONObject, i2 + 1);
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    return mgcVarB13;
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    throw th;
                                } catch (InterruptedIOException e22) {
                                    e = e22;
                                    r15 = r18;
                                    i1k0.n(c(i2, e, str));
                                    if (i2 >= i3) {
                                        throw new BranchRemoteInterface.BranchRemoteException(-120, e.getMessage());
                                    }
                                    Thread.sleep(neVar.E());
                                    mgc mgcVarB14 = b(str, jSONObject, i2 + 1);
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    return mgcVarB14;
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    throw th;
                                } catch (IOException e23) {
                                    e = e23;
                                    r15 = r18;
                                    i1k0.n(c(i2, e, str));
                                    if (i2 >= i3) {
                                        throw new BranchRemoteInterface.BranchRemoteException(-113, e.getMessage());
                                    }
                                    Thread.sleep(neVar.E());
                                    mgc mgcVarB15 = b(str, jSONObject, i2 + 1);
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    return mgcVarB15;
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    throw th;
                                } catch (Exception e24) {
                                    e = e24;
                                    i1k0.n(c(i2, e, str));
                                    if (!(e instanceof NetworkOnMainThreadException)) {
                                        throw new BranchRemoteInterface.BranchRemoteException(-122, e.getMessage());
                                    }
                                    i1k0.n("Cannot make network request on main thread.");
                                    throw new BranchRemoteInterface.BranchRemoteException(-121, e.getMessage());
                                } catch (Throwable th2) {
                                    th = th2;
                                    r15 = r18;
                                    if (r15 != 0) {
                                        r15.disconnect();
                                        j();
                                    }
                                    throw th;
                                }
                            } else {
                                try {
                                    Thread.sleep(neVarZ.E());
                                } catch (InterruptedException e25) {
                                    i1k0.n(c(i2, e25, str));
                                }
                                i2++;
                                mgcVar = b(str, jSONObject, i2);
                                r15.disconnect();
                            }
                            j();
                            return mgcVar;
                        } catch (SocketTimeoutException e26) {
                            e = e26;
                            neVar = neVarZ;
                            r18 = r15;
                        } catch (InterruptedIOException e27) {
                            e = e27;
                            neVar = neVarZ;
                            r18 = r15;
                        } catch (IOException e28) {
                            e = e28;
                            neVar = neVarZ;
                            r18 = r15;
                        } catch (Exception e29) {
                            e = e29;
                            r18 = r15;
                        } catch (Throwable th3) {
                            th = th3;
                            r18 = r15;
                        }
                    } catch (Exception e30) {
                        e = e30;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (SocketTimeoutException e31) {
                    e = e31;
                    neVar = neVarZ;
                } catch (InterruptedIOException e32) {
                    e = e32;
                    neVar = neVarZ;
                } catch (IOException e33) {
                    e = e33;
                    neVar = neVarZ;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (SocketTimeoutException e34) {
            e = e34;
            neVar = neVarZ;
            r15 = 0;
        } catch (InterruptedIOException e35) {
            e = e35;
            neVar = neVarZ;
            r15 = 0;
        } catch (IOException e36) {
            e = e36;
            neVar = neVarZ;
            r15 = 0;
        } catch (Exception e37) {
            e = e37;
        } catch (Throwable th6) {
            th = th6;
            r15 = 0;
        }
    }

    public String c(int i, Exception exc, String str) {
        StringBuilder sbT = l1d.t("Branch Networking Error: \nURL: ", str, "\nResponse Code: ");
        sbT.append(this.b);
        sbT.append("\nResponse Message: ");
        sbT.append((String) this.c);
        sbT.append("\nCaught exception type: ");
        sbT.append(exc.getClass().getCanonicalName());
        sbT.append("\nRetry number: ");
        sbT.append(i);
        sbT.append("\nrequestId: ");
        sbT.append((String) this.d);
        sbT.append("\nFinal attempt: ");
        sbT.append(i >= this.e);
        sbT.append("\nObject: ");
        sbT.append(this);
        sbT.append("\nException Message: ");
        sbT.append(exc.getMessage());
        sbT.append("\nStacktrace: ");
        sbT.append(i1k0.x(exc));
        return sbT.toString();
    }

    public long e(long j) {
        return this.b > 0 ? ((long[]) this.c)[0] : j;
    }

    public b961 f(JSONObject jSONObject, String str, String str2, String str3) {
        boolean z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        i1k0.B("addCommonParams post: " + jSONObject + " key: " + str3);
        try {
            f4t f4tVar = f4t.b;
            if (!jSONObject.has("user_data")) {
                jSONObject.put("sdk", "android5.21.2");
            }
            if (str3.equals("bnc_no_value")) {
                z = false;
            } else {
                jSONObject.put("branch_key", str3);
                z = true;
            }
        } catch (JSONException e) {
            l1d.A(e, new StringBuilder("Caught JSONException "));
        }
        if (!z) {
            return new b961(-114, "Failed to set common parameters, body: " + jSONObject + " key: " + str3);
        }
        i1k0.B("posting to ".concat(str));
        i1k0.B("Post value = " + jSONObject.toString());
        try {
            mgc mgcVarB = b(str, jSONObject, 0);
            return h(mgcVarB, str2, (String) mgcVarB.d);
        } catch (BranchRemoteInterface.BranchRemoteException e2) {
            return new b961(e2.a, "Failed network request. " + e2.b);
        } finally {
            if (n3c.h() != null) {
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                y861 y861Var = n3c.h().f;
                f4t f4tVar2 = f4t.b;
                y861Var.b(str2 + "-brtt", String.valueOf(iCurrentTimeMillis));
            }
        }
    }

    public void g(Context context, XmlResourceParser xmlResourceParser) {
        kil kilVar = new kil();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                kilVar.o(context, xmlResourceParser);
                ((SparseArray) this.f).put(identifier, kilVar);
                return;
            }
        }
    }

    public void i(int i) {
        int i2 = ((int[]) this.f)[i];
        k(i2, this.b - 1);
        this.b--;
        long[] jArr = (long[]) this.c;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (u890.r(jArr[i4], j) <= 0) {
                break;
            }
            k(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) this.c;
        int i5 = this.b >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < this.b && u890.r(jArr2[i6], jArr2[i7]) < 0) {
                if (u890.r(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                k(i6, i2);
                i2 = i6;
            } else {
                if (u890.r(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                k(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) this.f)[i] = this.e;
        this.e = i;
    }

    public void j() {
        this.d = "";
        this.b = -1;
        this.c = "";
    }

    public void k(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.f;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("KmVersionRequirement(kind=");
                int i = this.b;
                if (i == 0) {
                    u890.C("kind");
                    throw null;
                }
                String str2 = "null";
                if (i == 1) {
                    str = "LANGUAGE_VERSION";
                } else if (i == 2) {
                    str = "COMPILER_VERSION";
                } else if (i != 3) {
                    str = i != 4 ? "null" : "UNKNOWN";
                } else {
                    str = "API_VERSION";
                }
                sb.append(str);
                sb.append(", level=");
                int i2 = this.e;
                if (i2 == 0) {
                    u890.C("level");
                    throw null;
                }
                if (i2 == 1) {
                    str2 = "WARNING";
                } else if (i2 == 2) {
                    str2 = "ERROR";
                } else if (i2 == 3) {
                    str2 = "HIDDEN";
                }
                sb.append(str2);
                sb.append(", version=");
                d4b0 d4b0Var = (d4b0) this.f;
                if (d4b0Var == null) {
                    u890.C("version");
                    throw null;
                }
                sb.append(d4b0Var);
                sb.append(", errorCode=");
                sb.append((Integer) this.d);
                sb.append(", message=");
                return gvg.k(sb, (String) this.c, ')');
            default:
                return super.toString();
        }
    }

    public le(n3c n3cVar) {
        this.a = (byte) 1;
        this.b = -1;
        this.c = "";
        this.d = "";
        this.f = n3cVar;
        this.e = ((SharedPreferences) ne.z(n3cVar.d).a).getInt("bnc_retry_count", 3);
    }

    public le() {
        this.a = (byte) 4;
        this.c = new long[16];
        this.d = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.f = iArr;
    }
}
