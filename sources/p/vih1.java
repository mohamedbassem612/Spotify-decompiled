package p;

import android.content.Context;
import android.net.TrafficStats;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vih1 extends p3c {
    public final ne a;

    public vih1(Context context) {
        this.a = ne.z(context);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008c  */
    /* JADX WARN: Not initialized variable reg: 0, insn: 0x006f: MOVE (r7 I:??[OBJECT, ARRAY]) = (r0 I:??[OBJECT, ARRAY]) (LINE:112), block:B:16:0x006f */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        HttpsURLConnection httpsURLConnection;
        Exception e;
        HttpURLConnection httpURLConnection;
        TrafficStats.setThreadStatsTag(0);
        JSONObject jSONObject = new JSONObject();
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL("%sdk/uriskiplist_v#.json".replace("%", !TextUtils.isEmpty(null) ? null : "https://cdn.branch.io/").replace("#", Integer.toString(ptf1.e().optInt("version") + 1))).openConnection();
                try {
                    httpsURLConnection.setConnectTimeout(1500);
                    httpsURLConnection.setReadTimeout(1500);
                    if (httpsURLConnection.getResponseCode() == 200 && httpsURLConnection.getInputStream() != null) {
                        jSONObject = new JSONObject(new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream())).readLine());
                    }
                    httpsURLConnection.disconnect();
                    return jSONObject;
                } catch (Exception e2) {
                    e = e2;
                    i1k0.m(e.getMessage());
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return jSONObject;
                }
            } catch (Throwable th) {
                th = th;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
        } catch (Exception e3) {
            httpsURLConnection = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        super.onPostExecute(jSONObject);
        if (jSONObject.optInt("version") > ptf1.e().optInt("version")) {
            ptf1.f(jSONObject);
            this.a.Z("skip_url_format_key", ptf1.e().toString());
        }
    }
}
