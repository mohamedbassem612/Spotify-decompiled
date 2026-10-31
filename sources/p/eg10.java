package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eg10 extends ail1 {
    public static final /* synthetic */ int O0 = 0;
    public boolean N0;

    public static final void g(eg10 eg10Var) {
        super.cancel();
    }

    @Override // p.ail1
    public final Bundle c(String str) {
        Bundle bundleE = fpi1.E(Uri.parse(str).getQuery());
        String string = bundleE.getString("bridge_args");
        bundleE.remove("bridge_args");
        if (!fpi1.y(string)) {
            try {
                bundleE.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", ncc.a(new JSONObject(string)));
            } catch (JSONException unused) {
                wf10 wf10Var = wf10.a;
            }
        }
        String string2 = bundleE.getString("method_results");
        bundleE.remove("method_results");
        if (!fpi1.y(string2)) {
            try {
                bundleE.putBundle("com.facebook.platform.protocol.RESULT_ARGS", ncc.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                wf10 wf10Var2 = wf10.a;
            }
        }
        bundleE.remove("version");
        bundleE.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", omn0.g());
        return bundleE;
    }

    @Override // p.ail1, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        zhl1 zhl1Var = this.d;
        if (!this.X || this.i || zhl1Var == null || !zhl1Var.isShown()) {
            super.cancel();
        } else {
            if (this.N0) {
                return;
            }
            this.N0 = true;
            zhl1Var.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
            new Handler(Looper.getMainLooper()).postDelayed(new fss((Object) this, (byte) 22), 1500L);
        }
    }
}
