package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bz31 {
    public final az3 a;
    public final xkg0 b;

    public bz31(ze90 ze90Var, af90 af90Var, cf90 cf90Var, cf90 cf90Var2, az3 az3Var, ff90 ff90Var, ff90 ff90Var2, ff90 ff90Var3, af90 af90Var2) {
        this.a = az3Var;
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put(Rule.DISALLOW_IF_AD_PLAYING, x2g0.B(ze90Var));
        xkg0Var.put(Rule.DISALLOW_IF_CONTEXT_SWITCHED, ff90Var2);
        xkg0Var.put(Rule.DISALLOW_IF_APPLICATION_BACKGROUNDED, af90Var);
        xkg0Var.put(Rule.DISALLOW_IF_CAR_CONNECTED, x2g0.B(cf90Var));
        xkg0Var.put(Rule.DISALLOW_IF_CONNECTIVITY_OFFLINE, cf90Var2);
        xkg0Var.put(Rule.DISALLOW_IF_CONFLICTING_MESSAGE_PRESENTING, af90Var2);
        xkg0Var.put(Rule.DISALLOW_IF_NOW_PLAYING_VIEW_DISPLAYING, x2g0.B(ff90Var));
        xkg0Var.put(Rule.ALLOW_ONLY_CUSTOM_CLIENT_TRIGGERS, ff90Var3);
        this.b = xkg0Var.b();
    }
}
