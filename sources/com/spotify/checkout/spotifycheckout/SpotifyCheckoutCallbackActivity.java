package com.spotify.checkout.spotifycheckout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.UUID;
import kotlin.Metadata;
import p.c3b1;
import p.d3b1;
import p.f3b1;
import p.gj5;
import p.i1o1;
import p.l1d;
import p.nne;
import p.qxf;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/checkout/spotifycheckout/SpotifyCheckoutCallbackActivity;", "Lp/gj5;", "<init>", "()V", "src_main_java_com_spotify_checkout_spotifycheckout-spotifycheckout"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpotifyCheckoutCallbackActivity extends gj5 {
    public static final /* synthetic */ int a1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*p.dg30*/.onCreate(bundle);
        Uri data = getIntent().getData();
        if (data != null) {
            String path = data.getPath();
            String str = null;
            if (!(path != null && path.length() > 0)) {
                path = null;
            }
            String strSubstring = path != null ? path.substring(1) : null;
            if (strSubstring != null) {
                try {
                    UUID.fromString(strSubstring);
                    str = strSubstring;
                } catch (IllegalArgumentException unused) {
                }
            }
            if (str == null) {
                Logger.d(l1d.m("Wrong checkout-session-id format ", data.getPath()), new Object[0]);
                finish();
                return;
            }
            boolean zJ = u890.j(data.getQueryParameter("status"), "success");
            String queryParameter = data.getQueryParameter("success_url");
            qxf qxfVar = qxf.b;
            if (!zJ) {
                f3b1 c3b1Var = new c3b1(qxfVar, str);
                Intent intent = new Intent((Context) this, (Class<?>) SpotifyCheckoutActivity.class);
                intent.putExtra("EXTRA_ARGS", (Parcelable) c3b1Var);
                intent.addFlags(67108864);
                startActivity(intent);
            } else {
                if (queryParameter == null) {
                    Logger.d("Missing success_url query parameter", new Object[0]);
                    finish();
                    return;
                }
                String strK = i1o1.k(queryParameter, nne.a);
                strK.getClass();
                f3b1 d3b1Var = new d3b1(qxfVar, str, strK);
                Intent intent2 = new Intent((Context) this, (Class<?>) SpotifyCheckoutActivity.class);
                intent2.putExtra("EXTRA_ARGS", (Parcelable) d3b1Var);
                intent2.addFlags(67108864);
                startActivity(intent2);
            }
        }
        finish();
    }
}
