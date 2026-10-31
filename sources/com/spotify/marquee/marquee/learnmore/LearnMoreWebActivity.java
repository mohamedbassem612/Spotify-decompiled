package com.spotify.marquee.marquee.learnmore;

import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.b8k1;
import p.dg30;
import p.kp00;
import p.lmw;
import p.mir0;
import p.nu9;
import p.r7k1;
import p.t3b1;
import p.tg30;
import p.xwb0;
import p.zf30;
import p.zi20;
import p.zia;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/marquee/marquee/learnmore/LearnMoreWebActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class LearnMoreWebActivity extends t3b1 {
    public static final /* synthetic */ int g1 = 0;
    public final kp00 f1 = new kp00(this);

    public final mir0 c() {
        return new mir0((zia) this.f1.b);
    }

    public final void g0(zf30 zf30Var) {
        this.f1.j(zf30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 34) {
            overridePendingTransition(2130772029, 0);
        }
        setContentView(2131624001);
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.F(2131429738) == null) {
            nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
            nu9Var.k(2131429738, new xwb0(), (String) null, 1);
            nu9Var.f();
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(2131429738);
        if (frameLayout != null) {
            zi20 zi20Var = zi20.g;
            WeakHashMap weakHashMap = b8k1.a;
            r7k1.c(frameLayout, zi20Var);
        }
    }
}
