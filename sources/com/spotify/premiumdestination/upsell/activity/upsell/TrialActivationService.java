package com.spotify.premiumdestination.upsell.activity.upsell;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.hpq;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/premiumdestination/upsell/activity/upsell/TrialActivationService;", "Lp/hpq;", "src_main_java_com_spotify_premiumdestination_upsell-upsell"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class TrialActivationService extends hpq {
    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
