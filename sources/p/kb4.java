package p;

import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kb4 {
    public final t7o0 a;

    public kb4() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.putExtra("androidx.browser.customtabs.extra.ENABLE_EPHEMERAL_BROWSING", true);
        intent.putExtra("androidx.browser.auth.extra.LAUNCH_AUTH_TAB", true);
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtras(new Bundle());
        this.a = new t7o0(intent, (byte) 28);
    }
}
