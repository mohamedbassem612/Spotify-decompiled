package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tbi1 extends wfa0 {
    public static final tbi1 d = new tbi1(rc11.a.b(obi1.class));

    @Override // p.wfa0
    public final nma0 c(ega0 ega0Var) {
        Set setKeySet = fga0.l(ega0Var).a.keySet();
        if (setKeySet.contains("attendeeId")) {
            return dbi1.Companion.serializer();
        }
        if (setKeySet.contains("hostId")) {
            return hbi1.Companion.serializer();
        }
        if (setKeySet.contains("observerId")) {
            return nbi1.Companion.serializer();
        }
        if (setKeySet.contains("moderatorId")) {
            return kbi1.Companion.serializer();
        }
        uh61.j("Unknown UserIdentifier: none of attendeeId, hostId, observerId, moderatorId found");
        return null;
    }
}
