package com.spotify.appauthorization.sso.internalauth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/appauthorization/sso/internalauth/AuthorizationActivityInternalProxy;", "Landroid/app/Activity;", "<init>", "()V", "src_main_java_com_spotify_appauthorization_sso-sso"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AuthorizationActivityInternalProxy extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) AuthorizationActivity.class);
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
        startActivityForResult(intent, 4132);
        finish();
    }
}
