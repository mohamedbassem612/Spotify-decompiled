package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xga0 implements nma0 {
    public static final xga0 a = new xga0();
    public static final wga0 b = wga0.b;

    public final Object deserialize(dar darVar) {
        dem1.t(darVar);
        return new uga0((Map) new nlc0(chc1.a, hga0.a).e(darVar, (Object) null));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        dem1.u(uaxVar);
        new nlc0(chc1.a, hga0.a).serialize(uaxVar, (uga0) obj);
    }
}
