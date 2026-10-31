package com.spotify.marquee.marquee;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p.dg30;
import p.eg;
import p.ila0;
import p.iug0;
import p.kp00;
import p.lmw;
import p.lx10;
import p.mir0;
import p.mwg0;
import p.nu9;
import p.rug0;
import p.t3b1;
import p.tg30;
import p.yh5;
import p.z6x;
import p.zf30;
import p.zia;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/marquee/marquee/MarqueeActivity;", "Lp/t3b1;", "Lp/rug0;", "<init>", "()V", "src_main_java_com_spotify_marquee_marquee-marquee"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public class MarqueeActivity extends t3b1 implements rug0 {
    public static final /* synthetic */ int g1 = 0;
    public final kp00 f1 = new kp00(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.rug0
    public final void B(ArrayList arrayList) {
        Intent intent = getIntent();
        if (intent != null) {
            intent.putParcelableArrayListExtra("extra_marquee_randomized_feedback_list", new ArrayList<>(arrayList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.rug0
    public final List I() {
        Intent intent = getIntent();
        if (intent != null) {
            if (!intent.hasExtra("extra_marquee_randomized_feedback_list")) {
                intent = null;
            }
            if (intent != null) {
                ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? yh5.c(intent, "extra_marquee_randomized_feedback_list", lx10.class) : intent.getParcelableArrayListExtra("extra_marquee_randomized_feedback_list");
                if (arrayListC != null) {
                    return arrayListC;
                }
            }
        }
        return z6x.a;
    }

    public final mir0 c() {
        return new mir0((zia) this.f1.b);
    }

    public final void g0(zf30 zf30Var) {
        this.f1.j(zf30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624005);
        lmw lmwVar = ((dg30) this).U0;
        if (((tg30) lmwVar.b).g.F(2131429893) == null) {
            iug0 iug0Var = (iug0) ila0.s(getIntent(), "extra_marquee", iug0.class);
            if (iug0Var == null) {
                eg.m("Intent doesn't contain Marquee data");
                return;
            }
            mwg0 mwg0Var = new mwg0();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key_marquee", iug0Var);
            mwg0Var.T0(bundle2);
            nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
            nu9Var.n(2131429893, mwg0Var, (String) null);
            nu9Var.f();
        }
    }
}
