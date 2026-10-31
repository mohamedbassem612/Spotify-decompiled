package com.spotify.widgets.npvwidget;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import p.awz0;
import p.cto1;
import p.eir0;
import p.fkj1;
import p.fn31;
import p.hql1;
import p.j1e1;
import p.lir0;
import p.lnm;
import p.mir0;
import p.o8n;
import p.qir0;
import p.t3b1;
import p.zia;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/widgets/npvwidget/WidgetsProxyActivity;", "Lp/t3b1;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WidgetsProxyActivity extends t3b1 implements lir0 {
    public t f1;
    public final zia g1 = new zia();
    public final hql1 h1 = new hql1(this);

    public final mir0 c() {
        return new mir0(((WidgetsProxyActivity) this.h1.a).g1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m0() {
        Intent intent = getIntent();
        if (intent != null) {
            intent.getStringExtra("com.spotify.widgets.npvwidget.EXTRA_WIDGET_CATEGORY");
        }
        j1e1.q(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("com.spotify.widgets.npvwidget.EXTRA_PAGE_ID")) {
            String stringExtra = getIntent().getStringExtra("com.spotify.widgets.npvwidget.EXTRA_PAGE_ID");
            stringExtra.getClass();
            this.g1.accept(new eir0(new awz0(stringExtra), (qir0) null, 6));
        }
        fn31.T(cto1.q(this), (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 20), 3);
    }
}
