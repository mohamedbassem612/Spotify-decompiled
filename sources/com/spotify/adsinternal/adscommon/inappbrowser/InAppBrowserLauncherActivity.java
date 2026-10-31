package com.spotify.adsinternal.adscommon.inappbrowser;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import p.a580;
import p.a6n;
import p.nfb;
import p.qi0;
import p.t3b1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/adsinternal/adscommon/inappbrowser/InAppBrowserLauncherActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_adsinternal_adscommon-adscommon"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InAppBrowserLauncherActivity extends t3b1 {
    public qi0 f1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<a580> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("metadata_list");
        if (parcelableArrayListExtra != null) {
            for (a580 a580Var : parcelableArrayListExtra) {
                if (this.f1 == null) {
                    u890.C("browserIntentFactory");
                    throw null;
                }
                InAppBrowserActivity.s1.getClass();
                startActivity(nfb.g(this, a580Var));
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new a6n(this, (byte) 29), 400L);
    }
}
