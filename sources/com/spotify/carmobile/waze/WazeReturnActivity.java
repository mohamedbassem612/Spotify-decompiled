package com.spotify.carmobile.waze;

import android.content.Intent;
import android.net.Uri;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.kx40;
import p.l7a;
import p.mir0;
import p.nik1;
import p.p6r0;
import p.t3b1;
import p.u890;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spotify/carmobile/waze/WazeReturnActivity;", "Lp/t3b1;", "<init>", "()V", "src_main_java_com_spotify_carmobile_waze-waze"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class WazeReturnActivity extends t3b1 {
    public l7a f1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("CARS_WAZE", "cars/waze", 286, "cars"), nik1.F0.a(), 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        super/*p.dac0*/.onResume();
        l7a l7aVar = this.f1;
        if (l7aVar == null) {
            u890.C("bannerSessionNavigationDelegate");
            throw null;
        }
        l7aVar.a(nik1.F0.a);
        if (isTaskRoot()) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(nik1.z0.a));
            intent.setFlags(268435456);
            startActivity(intent);
        }
        finish();
    }
}
