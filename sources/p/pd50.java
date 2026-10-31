package p;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pd50 {
    public static final /* synthetic */ int e = 0;
    public final HttpURLConnection a;
    public final JSONObject b;
    public final lf10 c;
    public final JSONObject d;

    public pd50(HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, lf10 lf10Var) {
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = lf10Var;
        this.d = jSONObject;
    }

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbT = l1d.t("{Response:  responseCode: ", str, ", graphObject: ");
        sbT.append(this.b);
        sbT.append(", error: ");
        sbT.append(this.c);
        sbT.append("}");
        return sbT.toString();
    }
}
