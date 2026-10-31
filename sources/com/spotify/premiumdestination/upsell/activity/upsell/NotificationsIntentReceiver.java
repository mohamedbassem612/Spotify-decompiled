package com.spotify.premiumdestination.upsell.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.jw9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/premiumdestination/upsell/activity/upsell/NotificationsIntentReceiver;", "Lp/jw9;", "<init>", "()V", "src_main_java_com_spotify_premiumdestination_upsell-upsell"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class NotificationsIntentReceiver extends jw9 {
    public final void a(Context context, Intent intent) {
        if ("com.spotify.premiumdestination.upsell.SHOW_MAIN".equals(intent.getAction())) {
            PackageManager packageManager = context.getPackageManager();
            context.startActivity(packageManager != null ? packageManager.getLaunchIntentForPackage(context.getPackageName()) : null);
        } else {
            String action = intent.getAction();
            if (action == null) {
                action = "";
            }
            Logger.d("Unexpected action: %s", new Object[]{action});
        }
    }
}
