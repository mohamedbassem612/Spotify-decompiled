package p;

import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ji3 implements eyf0 {
    public final bn5 a;

    public ji3(bn5 bn5Var, q3c q3cVar) {
        this.a = bn5Var;
    }

    public final void a(Intent intent) {
        boolean zJ;
        String queryParameter;
        Uri data = intent.getData();
        if (data != null) {
            if (u890.j(data.getScheme(), "spotify")) {
                zJ = u890.j(data.getAuthority(), "alexa-auth");
            } else {
                zJ = u890.j(data.getAuthority(), "open.spotify.com") ? u890.j(data.getPath(), "/alexa-auth") : false;
            }
            Object ui3Var = si3.a;
            if (zJ && (queryParameter = data.getQueryParameter("state")) != null) {
                String queryParameter2 = data.getQueryParameter("code");
                if (queryParameter2 != null) {
                    ui3Var = new ti3(queryParameter, queryParameter2);
                } else {
                    String queryParameter3 = data.getQueryParameter("error");
                    ui3Var = u890.j(queryParameter3, "access_denied") ? new ui3(queryParameter) : new ri3(queryParameter, queryParameter3);
                }
            }
            boolean z = ui3Var instanceof si3;
            bn5 bn5Var = this.a;
            if (z) {
                bn5Var.getClass();
            } else {
                bn5Var.c.onNext(ui3Var);
            }
        }
    }
}
