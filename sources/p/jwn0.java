package p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jwn0 extends g5 {
    public final idd1 a;
    public final idd1 b;

    public jwn0(kwn0 kwn0Var) {
        this.a = new idd1(new iwn0(kwn0Var, (byte) 0));
        this.b = new idd1(new iwn0(kwn0Var, (byte) 1));
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = ((Set) this.b.getValue()).iterator();
        while (it.hasNext()) {
            ((zxn0) it.next()).c(bundle);
        }
        Intent intent = activity.getIntent();
        intent.getClass();
        idd1 idd1Var = this.a;
        if (bundle == null && u890.j(intent.getAction(), "android.intent.action.MAIN") && (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory("android.intent.category.LEANBACK_LAUNCHER"))) {
            ((mwn0) idd1Var.getValue()).e(fsn0.a);
            return;
        }
        if (bundle == null && u890.j(intent.getAction(), "android.intent.action.VIEW") && intent.getData() != null) {
            ComponentName component = intent.getComponent();
            if (!"com.spotify.music.SpotifyMainActivity".equals(component != null ? component.getClassName() : null) || intent.getScheme() == null) {
                return;
            }
            if (u890.j(intent.getScheme(), "https") || u890.j(intent.getScheme(), "http") || u890.j(intent.getScheme(), "spotify")) {
                String stringExtra = intent.getStringExtra("extra_deeplink_navigation_reference");
                if (stringExtra == null || stringExtra.length() == 0) {
                    String string = UUID.randomUUID().toString();
                    intent.putExtra("extra_deeplink_navigation_reference", string);
                    ((mwn0) idd1Var.getValue()).e(new esn0(string));
                    intent.putExtra("extra_deeplink_navigation_logged", true);
                }
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = ((Set) this.b.getValue()).iterator();
        while (it.hasNext()) {
            ((zxn0) it.next()).d(bundle);
        }
    }
}
