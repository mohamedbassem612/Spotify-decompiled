package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;
import p.jlb;
import p.zce0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabActivity extends Activity {
    public jlb a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent("CustomTabActivity.action_customTabRedirect");
            intent2.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
            zce0.a(this).c(intent2);
            jlb jlbVar = new jlb(this, (byte) 8);
            zce0.a(this).b(jlbVar, new IntentFilter("CustomTabActivity.action_destroy"));
            this.a = jlbVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) CustomTabMainActivity.class);
        intent.setAction("CustomTabActivity.action_customTabRedirect");
        intent.putExtra("CustomTabMainActivity.extra_url", getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        jlb jlbVar = this.a;
        if (jlbVar != null) {
            zce0.a(this).d(jlbVar);
        }
        super.onDestroy();
    }
}
