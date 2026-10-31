package com.spotify.ageverification.ageassurancewebview;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.af0;
import p.bb2;
import p.bwn0;
import p.cb2;
import p.cto1;
import p.db2;
import p.eb2;
import p.eg;
import p.f8h1;
import p.fdg1;
import p.fn31;
import p.fqk0;
import p.g341;
import p.g7h1;
import p.g8h1;
import p.i8h1;
import p.ila0;
import p.jfv;
import p.lnm;
import p.n57;
import p.ngv;
import p.nhc1;
import p.o8n;
import p.ou80;
import p.p6r0;
import p.p811;
import p.q8n;
import p.t3b1;
import p.te2;
import p.tv80;
import p.u890;
import p.ve2;
import p.we2;
import p.yon1;
import p.yqg;
import p.ytw0;
import p.z710;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/ageverification/ageassurancewebview/AgeAssuranceWebViewActivity;", "Lp/t3b1;", "<init>", "()V", "p/sj1", "src_main_java_com_spotify_ageverification_ageassurancewebview-ageassurancewebview"}, k = 1, mv = {2, 3, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public final class AgeAssuranceWebViewActivity extends t3b1 {
    public static final /* synthetic */ int n1 = 0;
    public z710 f1;
    public g7h1 g1;
    public g341 h1;
    public yqg i1;
    public g8h1 j1;
    public i8h1 k1;
    public q8n l1;
    public boolean m1;

    public static boolean p0(Intent intent) {
        String path;
        String scheme;
        Uri data = intent.getData();
        boolean zY = (data == null || (scheme = data.getScheme()) == null) ? false : nhc1.Y(scheme, "spotify-aa", false);
        Uri data2 = intent.getData();
        return zY && ((data2 == null || (path = data2.getPath()) == null) ? false : nhc1.Y(path, "/webview/callback", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o0(Uri uri) {
        if (isFinishing()) {
            return;
        }
        Intent intent = null;
        if (uri != null) {
            if (uri.getQueryParameter("ubi") == null) {
                uri = null;
            }
            if (uri != null) {
                g8h1 g8h1Var = this.j1;
                if (g8h1Var == null) {
                    u890.C("ubiJourneyManager");
                    throw null;
                }
                g8h1Var.a(uri);
            }
        }
        Intent intent2 = (Intent) ila0.s(getIntent(), "on_complete_intent", Intent.class);
        if (intent2 != null) {
            Uri data = intent2.getData();
            boolean zJ = u890.j(data != null ? data.getScheme() : null, "spotify");
            ComponentName componentNameResolveActivity = intent2.resolveActivity(getPackageManager());
            boolean zJ2 = u890.j(componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : null, getPackageName());
            boolean z = true;
            if ((intent2.getFlags() & 1) == 0 && (intent2.getFlags() & 2) == 0) {
                z = false;
            }
            if (zJ && zJ2 && !z) {
                intent = intent2;
            }
        }
        if (intent != null) {
            startActivity(intent);
        } else if (isTaskRoot()) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("spotify://")));
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131623989);
        g7h1 g7h1Var = this.g1;
        if (g7h1Var == null) {
            u890.C("externalActivityFlowTracker");
            throw null;
        }
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        g7h1.b(g7h1Var, yon1.G1("AGE_ASSURANCE_WEBVIEW", "age-assurance/webview", 128, "age-assurance"), ila0.t(getIntent(), "interaction_logging_result", tv80.class), 2);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (p0(intent)) {
            o0(intent.getData());
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super/*p.dac0*/.onRestoreInstanceState(bundle);
        this.m1 = bundle.getBoolean("started_webflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        ou80 ou80Var;
        super/*p.dac0*/.onResume();
        Uri uri = null;
        if (this.m1 || p0(getIntent())) {
            Uri data = getIntent().getData();
            if (data != null && p0(getIntent())) {
                uri = data;
            }
            o0(uri);
            return;
        }
        we2 we2Var = (we2) ila0.s(getIntent(), "age_assurance_type", we2.class);
        if (we2Var == null) {
            n57.s("AgeAssuranceType is missing from intent in openCustomTabs");
            return;
        }
        tv80 tv80VarT = ila0.t(getIntent(), "interaction_logging_result", tv80.class);
        String str = (tv80VarT == null || (ou80Var = tv80VarT.a) == null) ? null : ou80Var.a;
        p811 p811Var = new p811();
        g8h1 g8h1Var = this.j1;
        if (g8h1Var == null) {
            u890.C("ubiJourneyManager");
            throw null;
        }
        ytw0 ytw0Var = jfv.b;
        yqg yqgVar = this.i1;
        if (yqgVar == null) {
            u890.C("clock");
            throw null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(we2Var.a).buildUpon().appendQueryParameter("client_callback_url", "spotify-aa:///webview/callback").appendQueryParameter("flow_ctx", str + ":" + jfv.u(jfv.q(fdg1.l0(yqgVar.b(), ngv.d), fdg1.k0(6, ngv.g)), ngv.e));
        if (we2Var instanceof te2) {
            eb2 eb2Var = ((te2) we2Var).b;
            if (eb2Var instanceof bb2) {
                builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("resource", "spotify:parentalconsent");
            } else if (eb2Var instanceof db2) {
                builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("min_age", String.valueOf(((db2) eb2Var).a));
            } else {
                if (!(eb2Var instanceof cb2)) {
                    eg.o();
                    return;
                }
                builderAppendQueryParameter = builderAppendQueryParameter.appendQueryParameter("min_age", String.valueOf(((cb2) eb2Var).a));
            }
        } else if (!(we2Var instanceof ve2)) {
            eg.o();
            return;
        }
        p811Var.a = new f8h1(g8h1Var.b(builderAppendQueryParameter.build(), tv80VarT != null ? new bwn0(tv80VarT) : null), g8h1Var);
        fn31.T(cto1.q(this), (o8n) null, 0, new af0(this, new fqk0(), p811Var, tv80VarT, str, (lnm) null), 3);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.dac0*/.onSaveInstanceState(bundle);
        bundle.putBoolean("started_webflow", this.m1);
    }
}
