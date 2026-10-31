package p;

import android.content.Intent;
import android.net.Uri;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uph {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ uph(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final hyf0 a(Intent intent) {
        String stringExtra;
        String stringExtra2;
        boolean zEquals = false;
        switch (this.a) {
            case 0:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    return null;
                }
                if (!nik1.e.a(dataString)) {
                    dataString = null;
                }
                if (dataString == null) {
                    return null;
                }
                lik1 lik1Var = new lik1(dataString);
                String stringExtra3 = intent.getStringExtra("com.spotify.podcast.EXTRA_COMMENT_ID_ORIGINATED_FROM_COMMENT_THREAD");
                if (stringExtra3 != null) {
                    if (stringExtra3.length() == 0) {
                        stringExtra3 = null;
                    }
                    if (stringExtra3 != null) {
                        return new sph(this, dataString, "spotify:comment:".concat(stringExtra3), lik1Var);
                    }
                }
                if (intent.getBooleanExtra("com.spotify.podcast.EXTRA_ORIGINATED_FROM_COMMENTS", false)) {
                    return new tph(this, dataString, lik1Var);
                }
                return null;
            case 1:
                String stringExtra4 = intent.getStringExtra("contribution_notes_detail_contribution_id");
                if (stringExtra4 == null || (stringExtra = intent.getStringExtra("contribution_notes_detail_context_uri")) == null || (stringExtra2 = intent.getStringExtra("contribution_notes_detail_item_uri")) == null) {
                    return null;
                }
                return new qsm(this, new Uri.Builder().encodedPath("spotify:internal:contribution-notes-detail:".concat(stringExtra4)).appendQueryParameter("context_uri", stringExtra).appendQueryParameter("item_uri", stringExtra2).build().toString());
            default:
                String dataString2 = intent.getDataString();
                if (dataString2 == null) {
                    return null;
                }
                mn1 mn1Var = (mn1) this.b;
                Uri uri = Uri.parse(dataString2);
                mn1Var.getClass();
                if (!mn1.b(uri)) {
                    String string = uri.toString();
                    Uri uri2 = mn1Var.g;
                    if (uri2 != null) {
                        String string2 = uri2.toString();
                        Set set = s4b1.f;
                        if (uic.h(string2, new blc0[]{blc0.ti, blc0.ui})) {
                            zEquals = ihc1.Z0(ihc1.X0(uri2.toString(), "/"), "?").equals(ihc1.X0(string, ":"));
                        }
                    }
                    if (!zEquals) {
                        dataString2 = null;
                    }
                }
                if (dataString2 != null) {
                    return new ga41(this);
                }
                return null;
        }
    }
}
