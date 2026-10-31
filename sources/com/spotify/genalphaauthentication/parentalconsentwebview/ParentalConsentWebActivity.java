package com.spotify.genalphaauthentication.parentalconsentwebview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.g7h1;
import p.ihc1;
import p.ila0;
import p.n57;
import p.nhc1;
import p.p6r0;
import p.t3b1;
import p.tv80;
import p.u890;
import p.yon1;
import p.z710;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/genalphaauthentication/parentalconsentwebview/ParentalConsentWebActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_genalphaauthentication_parentalconsentwebview-parentalconsentwebview"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class ParentalConsentWebActivity extends t3b1 {
    public static final /* synthetic */ int i1 = 0;
    public z710 f1;
    public g7h1 g1;
    public boolean h1;

    public static boolean p0(Intent intent) {
        Uri data = intent.getData();
        if (!u890.j(data != null ? data.getScheme() : null, "spotify-parental-consent")) {
            return false;
        }
        Uri data2 = intent.getData();
        return u890.j(data2 != null ? data2.getPath() : null, "/callback");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0() {
        if (isFinishing()) {
            return;
        }
        if (isTaskRoot()) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("spotify://")));
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g7h1 g7h1Var = this.g1;
        if (g7h1Var == null) {
            u890.C("externalActivityFlowTracker");
            throw null;
        }
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        g7h1.b(g7h1Var, yon1.G1("PARENTAL_CONSENT_WEBVIEW", "parental-consent/webview", 1398, "parental-consent"), ila0.t(getIntent(), "interaction_logging_result", tv80.class), 2);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (p0(intent)) {
            o0();
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super/*p.dac0*/.onRestoreInstanceState(bundle);
        this.h1 = bundle.getBoolean("started_webflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        String path;
        super/*p.dac0*/.onResume();
        if (this.h1 || p0(getIntent())) {
            o0();
            return;
        }
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null) {
            n57.s("ParentalConsentWebActivity launched without a URL");
            finish();
            return;
        }
        Uri uri = Uri.parse(stringExtra);
        uri.getClass();
        if (!nhc1.S(uri.getScheme(), "https", true) || !nhc1.S(uri.getHost(), "www.spotify.com", true) || (path = uri.getPath()) == null || !ihc1.h0(path, "/account/in-app-parental-consent", false)) {
            n57.s("ParentalConsentWebActivity launched with untrusted URL: ".concat(stringExtra));
            finish();
            return;
        }
        Uri uriBuild = uri.buildUpon().appendQueryParameter("redirect_uri", "spotify-parental-consent:///callback").build();
        z710 z710Var = this.f1;
        if (z710Var == null) {
            u890.C("externalNavigator");
            throw null;
        }
        boolean zA = z710Var.a();
        z710 z710Var2 = this.f1;
        if (z710Var2 == null) {
            u890.C("externalNavigator");
            throw null;
        }
        uriBuild.getClass();
        boolean zC = z710.c(z710Var2, uriBuild, zA, 2);
        this.h1 = zC;
        if (zC) {
            return;
        }
        n57.s("Failed to launch parental consent web flow, no suitable browser installed.");
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.dac0*/.onSaveInstanceState(bundle);
        bundle.putBoolean("started_webflow", this.h1);
    }
}
