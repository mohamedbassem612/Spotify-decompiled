package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import p.bro;
import p.cro;
import p.dhn;
import p.fpi1;
import p.gn80;
import p.jlb;
import p.kba;
import p.kno1;
import p.l1d;
import p.omn0;
import p.oql;
import p.oxg1;
import p.pze0;
import p.wf10;
import p.wzn;
import p.zce0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabMainActivity extends Activity {
    public static final /* synthetic */ int c = 0;
    public boolean a = true;
    public jlb b;

    public final void a(Intent intent, int i) {
        Bundle bundle;
        jlb jlbVar = this.b;
        if (jlbVar != null) {
            zce0.a(this).d(jlbVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra("CustomTabMainActivity.extra_url");
            if (stringExtra != null) {
                Uri uri = Uri.parse(stringExtra);
                bundle = fpi1.E(uri.getQuery());
                bundle.putAll(fpi1.E(uri.getFragment()));
            } else {
                bundle = new Bundle();
            }
            Intent intentE = omn0.e(getIntent(), bundle, (FacebookException) null);
            if (intentE != null) {
                intent = intentE;
            }
            setResult(i, intent);
        } else {
            setResult(i, omn0.e(getIntent(), (Bundle) null, (FacebookException) null));
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        int i;
        kba kbaVar;
        boolean z;
        Uri uriA;
        super.onCreate(bundle);
        if ("CustomTabActivity.action_customTabRedirect".equals(getIntent().getAction())) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null || (stringExtra = getIntent().getStringExtra("CustomTabMainActivity.extra_action")) == null) {
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("CustomTabMainActivity.extra_params");
        String stringExtra2 = getIntent().getStringExtra("CustomTabMainActivity.extra_chromePackage");
        String stringExtra3 = getIntent().getStringExtra("CustomTabMainActivity.extra_targetApp");
        int[] iArrH = l1d.H(2);
        int length = iArrH.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            }
            i = iArrH[i2];
            if (pze0.b(i).equals(stringExtra3)) {
                break;
            } else {
                i2++;
            }
        }
        if (bro.a[l1d.C(i)] == 1) {
            kbaVar = new gn80(stringExtra, bundleExtra);
            if (bundleExtra == null) {
                bundleExtra = new Bundle();
            }
            if (stringExtra.equals("oauth")) {
                uriA = fpi1.a(kno1.w(), "oauth/authorize", bundleExtra);
            } else {
                uriA = fpi1.a(kno1.w(), wf10.d() + "/dialog/" + stringExtra, bundleExtra);
            }
            if (!dhn.a.contains(kbaVar)) {
                try {
                    kbaVar.b = uriA;
                } catch (Throwable th) {
                    dhn.a(kbaVar, th);
                }
            }
        } else {
            kbaVar = new kba(stringExtra, bundleExtra);
        }
        if (dhn.a.contains(kbaVar)) {
            z = false;
        } else {
            try {
                ReentrantLock reentrantLock = cro.d;
                reentrantLock.lock();
                wzn wznVar = cro.c;
                cro.c = null;
                reentrantLock.unlock();
                oql oqlVarA = new oxg1(wznVar).a();
                ((Intent) oqlVarA.b).setPackage(stringExtra2);
                try {
                    oqlVarA.j(this, (Uri) kbaVar.b);
                    z = true;
                } catch (ActivityNotFoundException unused) {
                    z = false;
                }
            } catch (Throwable th2) {
                dhn.a(kbaVar, th2);
            }
        }
        this.a = false;
        if (!z) {
            setResult(0, getIntent().putExtra("CustomTabMainActivity.no_activity_exception", true));
            finish();
        } else {
            jlb jlbVar = new jlb(this, (byte) 9);
            this.b = jlbVar;
            zce0.a(this).b(jlbVar, new IntentFilter("CustomTabActivity.action_customTabRedirect"));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if ("CustomTabMainActivity.action_refresh".equals(intent.getAction())) {
            zce0.a(this).c(new Intent("CustomTabActivity.action_destroy"));
            a(intent, -1);
        } else if ("CustomTabActivity.action_customTabRedirect".equals(intent.getAction())) {
            a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.a) {
            a(null, 0);
        }
        this.a = true;
    }
}
