package com.spotify.liveevents.ontourdisclosure;

import android.os.Bundle;
import kotlin.Metadata;
import p.fn10;
import p.gn10;
import p.ijl1;
import p.ydb;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/liveevents/ontourdisclosure/OnTourDisclosureWebFragment;", "Lp/ijl1;", "Lp/fn10;", "<init>", "()V", "src_main_java_com_spotify_liveevents_ontourdisclosure-ontourdisclosure"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnTourDisclosureWebFragment extends ijl1 implements fn10 {
    public static final /* synthetic */ int W1 = 0;
    public final gn10 V1 = new gn10("live-legal-disclosure");

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getV1() {
        return this.V1;
    }

    public final void c1() {
        if (((ijl1) this).H1 != null) {
            l1("https://www.spotify.com/legal/ticket-sale-terms/");
        }
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        N0().J().a(this, new ydb(this, (byte) 19));
    }
}
