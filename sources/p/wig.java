package p;

import com.google.protobuf.h;
import com.spotify.eventsender.musicintegration.contexts.proto.ClientId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wig implements r900 {
    @Override // p.r900
    public final String a() {
        return "context_client_id";
    }

    @Override // p.r900
    public final h getData() {
        vig vigVarN = ClientId.n();
        byte[] bArrA = raa.b.g().a("9a8d2f0ce77a4e248bb71fefcb557637");
        vigVarN.n(phc.e(0, bArrA, bArrA.length));
        return vigVarN.build();
    }
}
