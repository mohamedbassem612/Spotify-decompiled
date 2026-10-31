package com.spotify.premiumdestination.upsell.activity.dynamicupsell;

import android.content.Intent;
import android.net.Uri;
import java.io.IOException;
import kotlin.Metadata;
import p.cxc;
import p.ln21;
import p.ne;
import p.u890;
import p.vjp;
import p.w5b1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/premiumdestination/upsell/activity/dynamicupsell/DynamicUpsellLoggerService;", "Lp/vjp;", "<init>", "()V", "src_main_java_com_spotify_premiumdestination_upsell-upsell"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DynamicUpsellLoggerService extends vjp {
    public w5b1 a;

    public DynamicUpsellLoggerService() {
        super("DynamicUpsellLoggerService");
    }

    public final void onHandleIntent(Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        w5b1 w5b1Var = this.a;
        if (w5b1Var == null) {
            u890.C("spotifyOkHttp");
            throw null;
        }
        cxc cxcVarC = w5b1Var.d.c();
        String string = data.toString();
        ne neVar = new ne((byte) 9);
        neVar.e0(string);
        neVar.t();
        try {
            cxcVarC.a(new ln21(neVar)).e().g.close();
        } catch (IOException unused) {
        }
    }
}
