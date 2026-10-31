package p;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class can1 implements Runnable {
    public static final que0 c = new que0("RevokeAccessOperation", new String[0]);
    public final String a;
    public final jub1 b;

    public can1(String str) {
        zod.o(str);
        this.a = str;
        this.b = new jub1(null, (byte) 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        que0 que0Var = c;
        Status status = Status.g;
        try {
            String str = this.a;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(str) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                que0Var.d("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            que0Var.b(sb.toString(), new Object[0]);
        } catch (IOException e) {
            String strValueOf = String.valueOf(e.toString());
            que0Var.d(strValueOf.length() != 0 ? "IOException when revoking access: ".concat(strValueOf) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            String strValueOf2 = String.valueOf(e2.toString());
            que0Var.d(strValueOf2.length() != 0 ? "Exception when revoking access: ".concat(strValueOf2) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.b.g(status);
    }
}
