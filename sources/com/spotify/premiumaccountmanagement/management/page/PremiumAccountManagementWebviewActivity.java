package com.spotify.premiumaccountmanagement.management.page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.b8k1;
import p.d6d1;
import p.dg30;
import p.ila0;
import p.kc20;
import p.kx40;
import p.lmw;
import p.mir0;
import p.nu9;
import p.oxf;
import p.p6r0;
import p.qdd1;
import p.qir0;
import p.r7k1;
import p.t3b1;
import p.tg30;
import p.yon1;
import p.ypv0;
import p.zlv;
import p.zxf;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/premiumaccountmanagement/management/page/PremiumAccountManagementWebviewActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_premiumaccountmanagement_management-management"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class PremiumAccountManagementWebviewActivity extends t3b1 {
    public static final /* synthetic */ int f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarH2 = yon1.h2();
        String stringExtra = getIntent().getStringExtra("inapp_internalwebview_uri");
        return new mir0(kx40.g(p6r0VarH2, stringExtra != null ? new qir0(stringExtra) : null, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        zxf zxfVar;
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        super.onCreate(bundle);
        setContentView(2131624010);
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.G("inapp_internal_webview") == null) {
            nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
            Intent intent = getIntent();
            if (intent == null || (stringExtra = intent.getStringExtra("inapp_internalwebview_uri")) == null) {
                stringExtra = "https://spotify.com";
            }
            try {
                zxfVar = (zxf) ila0.s(getIntent(), "inapp_internalwebview_checkout_source", zxf.class);
            } catch (ClassCastException unused) {
                zxfVar = null;
            }
            if (zxfVar == null) {
                zxfVar = oxf.b;
            }
            int i = ypv0.Z1;
            Bundle bundle2 = new Bundle();
            bundle2.putString("KEY_IN_APP_INTERNAL_WEBVIEW_URI", stringExtra);
            bundle2.putParcelable("KEY_IN_APP_INTERNAL_WEBVIEW_CHECKOUT_SOURCE", zxfVar);
            ypv0 ypv0Var = new ypv0();
            ypv0Var.T0(bundle2);
            nu9Var.k(2131428961, ypv0Var, "inapp_internal_webview", 1);
            nu9Var.f();
        }
        View viewFindViewById = findViewById(2131428961);
        kc20 kc20Var = kc20.d1;
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(viewFindViewById, kc20Var);
    }
}
