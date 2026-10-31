package com.spotify.reporting.reportaction;

import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.dg30;
import p.lm21;
import p.lmw;
import p.mmr0;
import p.mno1;
import p.nu9;
import p.t3b1;
import p.tg30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/spotify/reporting/reportaction/ReportWebViewActivity;", "Lp/t3b1;", "<init>", "()V", "p/v9p1", "src_main_java_com_spotify_reporting_reportaction-reportaction"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class ReportWebViewActivity extends t3b1 {
    public static final /* synthetic */ int f1 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        setTheme(2132018249);
        super.onCreate(bundle);
        setContentView(2131625588);
        String stringExtra = getIntent().getStringExtra("report_webview_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.F(2131430660) != null) {
            return;
        }
        nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
        int i = lm21.Y1;
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("report_web_view_url", stringExtra)});
        lm21 lm21Var = new lm21();
        lm21Var.T0(bundleH);
        nu9Var.k(2131430660, lm21Var, (String) null, 1);
        nu9Var.f();
    }
}
