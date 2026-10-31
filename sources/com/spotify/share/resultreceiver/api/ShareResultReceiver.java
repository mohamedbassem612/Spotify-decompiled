package com.spotify.share.resultreceiver.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import p.fmv;
import p.l2p;
import p.m771;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/share/resultreceiver/api/ShareResultReceiver;", "Lp/l2p;", "src_main_java_com_spotify_share_resultreceiver_api-api"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public final class ShareResultReceiver extends l2p {
    public m771 b;

    public ShareResultReceiver() {
        super(fmv.Z.b());
    }

    public final void b(Context context, Intent intent) {
        String packageName;
        Logger.g("onReceive: %s", new Object[]{intent});
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString("entity_uri");
        string.getClass();
        String string2 = extras.getString("share_id");
        string2.getClass();
        String string3 = extras.getString("source_page_uri");
        String str = string3 == null ? "" : string3;
        String string4 = extras.getString("source_page_id");
        string4.getClass();
        String string5 = extras.getString("destination_id");
        string5.getClass();
        String string6 = extras.getString("destination_capability");
        string6.getClass();
        String string7 = extras.getString("integration_id");
        string7.getClass();
        String string8 = extras.getString("share_url");
        string8.getClass();
        String string9 = extras.getString("full_url");
        string9.getClass();
        ComponentName componentName = (ComponentName) extras.get("android.intent.extra.CHOSEN_COMPONENT");
        String str2 = (componentName == null || (packageName = componentName.getPackageName()) == null) ? "" : packageName;
        String string10 = extras.getString("share_format_id");
        String string11 = extras.getString("preselected_share_format_id");
        String string12 = extras.getString("interaction_id");
        m771 m771Var = this.b;
        if (m771Var != null) {
            m771.b(m771Var, string, string5, string6, string2, str2, string8, string9, string10, string11, str, string4, string7, string12, 4096);
        } else {
            u890.C("shareEventEmitter");
            throw null;
        }
    }
}
