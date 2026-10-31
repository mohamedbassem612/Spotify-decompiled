package com.spotify.appauthorization.sso.externalproxyauth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.base.java.logging.Logger;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import p.l1d;
import p.pp8;
import p.t3b1;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/appauthorization/sso/externalproxyauth/AuthorizationCommandProxyActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_appauthorization_sso-sso"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthorizationCommandProxyActivity extends t3b1 {
    public pp8 f1;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("CLIENT_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        pp8 pp8Var = this.f1;
        if (pp8Var == null) {
            u890.C("allowList");
            throw null;
        }
        if (pp8Var.a.remove(stringExtra)) {
            Intent intent = new Intent((Context) this, (Class<?>) AuthorizationActivity.class);
            intent.setAction(getIntent().getAction());
            intent.setPackage(getIntent().getPackage());
            Set<String> categories = getIntent().getCategories();
            if (categories != null) {
                Iterator<T> it = categories.iterator();
                while (it.hasNext()) {
                    intent.addCategory((String) it.next());
                }
            }
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            String stringExtra2 = getIntent().getStringExtra("RESPONSE_TYPE");
            if (!u890.j(stringExtra2, "none")) {
                Logger.d(l1d.m("Invalid response type: ", stringExtra2), new Object[0]);
                intent.putExtra("RESPONSE_TYPE", "none");
            }
            startActivityForResult(intent, 1432);
        }
        finish();
    }
}
