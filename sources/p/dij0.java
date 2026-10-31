package p;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dij0 {
    public static final Charset b = Charset.forName("UTF-8");
    public final d520 a;

    public dij0(d520 d520Var) {
        this.a = d520Var;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(xm31.a(jSONArray.getString(i)));
            } catch (Exception unused) {
                ws10.Z.h();
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(xm31.a.e(list.get(i))));
            } catch (JSONException unused) {
                ws10.Z.h();
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            ws10 ws10Var = ws10.Z;
            file.getAbsolutePath();
            ws10Var.f();
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            ws10 ws10Var = ws10.Z;
            file.getAbsolutePath();
            ws10Var.f();
        }
    }

    public final Map c(String str, boolean z) throws Throwable {
        d520 d520Var = this.a;
        File fileK = z ? d520Var.K(str, "internal-keys") : d520Var.K(str, "keys");
        if (!fileK.exists() || fileK.length() == 0) {
            g(fileK, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileK);
                try {
                    HashMap mapA = a(eth.T(fileInputStream2));
                    eth.k(fileInputStream2);
                    return mapA;
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    ws10.Z.h();
                    f(fileK);
                    eth.k(fileInputStream);
                    return Collections.EMPTY_MAP;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    eth.k(fileInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        ws10 ws10Var = ws10.Z;
        File fileK = this.a.K(str, "user-data");
        FileInputStream fileInputStream2 = null;
        if (!fileK.exists() || fileK.length() == 0) {
            ws10Var.c();
            f(fileK);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileK);
            try {
                try {
                    JSONObject jSONObject = new JSONObject(eth.T(fileInputStream));
                    String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                    ws10Var.c();
                    eth.k(fileInputStream);
                    return strOptString;
                } catch (Exception unused) {
                    ws10Var.h();
                    f(fileK);
                    eth.k(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                eth.k(fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            eth.k(fileInputStream2);
            throw th;
        }
    }

    public final void h(String str, Map map, boolean z) throws Throwable {
        d520 d520Var = this.a;
        File fileK = z ? d520Var.K(str, "internal-keys") : d520Var.K(str, "keys");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileK), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    eth.k(bufferedWriter2);
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    ws10.Z.h();
                    f(fileK);
                    eth.k(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    eth.k(bufferedWriter);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void i(String str, String str2) throws Throwable {
        File fileK = this.a.K(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new cij0(str2).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileK), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    eth.k(bufferedWriter2);
                } catch (Exception unused) {
                    bufferedWriter = bufferedWriter2;
                    ws10.Z.h();
                    eth.k(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    eth.k(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused2) {
        }
    }
}
