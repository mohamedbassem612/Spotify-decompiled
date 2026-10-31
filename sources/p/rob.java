package p;

import android.content.Intent;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.BookUriRedirectException;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rob {
    public final f1n0 a;
    public final Intent b;
    public final iac0 c;

    public rob(f1n0 f1n0Var, Intent intent, iac0 iac0Var) {
        this.a = f1n0Var;
        this.b = intent;
        this.c = iac0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    public final boolean a(Throwable th) {
        String strW;
        if (!(th instanceof BookUriRedirectException)) {
            return false;
        }
        Intent intent = this.b;
        String dataString = intent.getDataString();
        if (dataString == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            strW = ((BookUriRedirectException) th).b;
        } else {
            Set set = s4b1.f;
            if (uic.x(dataString).t()) {
                BookUriRedirectException bookUriRedirectException = (BookUriRedirectException) th;
                strW = nhc1.W(dataString, uic.x(bookUriRedirectException.a).h(), uic.x(bookUriRedirectException.b).h());
            } else {
                strW = ((BookUriRedirectException) th).b;
            }
        }
        fn31.T(cto1.q(this.c), (o8n) null, 0, new w7a(this, new dwn0(strW, "", false, false, 0, 0, true, null, null, null), (lnm) null, (byte) 19), 3);
        return true;
    }
}
