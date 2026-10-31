package com.spotify.checkout.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.gj5;
import p.iu30;
import p.o7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/checkout/deeplink/UcLoggedInDeepLinkActivity;", "Lp/gj5;", "<init>", "()V", "src_main_java_com_spotify_checkout_deeplink-deeplink"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class UcLoggedInDeepLinkActivity extends gj5 {
    @Override // p.dg30, p.g0i, p.f0i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intent intent2 = new Intent(intent);
        Uri uriBuild = null;
        intent2.setComponent(null);
        Uri data = intent.getData();
        if (data != null) {
            uriBuild = data.buildUpon().path(o7h.y0(o7h.l0(1, data.getPathSegments()), "/", (String) null, (String) null, (iu30) null, 62)).build();
        }
        intent2.setData(uriBuild);
        intent2.addFlags(33554432);
        startActivity(intent2);
        finish();
    }
}
