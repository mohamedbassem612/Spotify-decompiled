package com.spotify.liveevents.ontourdisclosure;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a8o;
import p.fc11;
import p.g4b1;
import p.gj5;
import p.j4b1;
import p.jik1;
import p.kx40;
import p.lik1;
import p.lir0;
import p.mir0;
import p.p6r0;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/liveevents/ontourdisclosure/OnTourDisclosureActivity;", "Lp/gj5;", "Lp/lir0;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_liveevents_ontourdisclosure-ontourdisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnTourDisclosureActivity extends gj5 implements lir0, jik1 {
    public static final /* synthetic */ int b1 = 0;
    public final lik1 a1;

    public OnTourDisclosureActivity() {
        Parcelable.Creator creator = lik1.CREATOR;
        this.a1 = new lik1("spotify:live-legal-disclosure");
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("LIVE_LEGALDISCLOSURE", "live/legaldisclosure", 933, "live"), this.a1.a(), 4));
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getA1() {
        return this.a1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j0() {
        finish();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super/*p.dg30*/.onCreate(bundle);
        setContentView(2131625342);
        fc11 fc11VarI0 = i0();
        if (fc11VarI0 != null) {
            fc11VarI0.c0();
            fc11VarI0.b0(true);
            fc11VarI0.d0(new g4b1(this, j4b1.Q7, a8o.y(24.0f, getResources())));
        }
    }
}
