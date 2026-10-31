package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oma implements nma0 {
    public static final oma a = new oma();
    public static final qnw0 b = omo1.c("BetamaxCoercingLong", knw0.m);

    public final Object deserialize(dar darVar) {
        return Long.valueOf(fga0.n(fga0.m(((bga0) darVar).m())));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.z(((Number) obj).longValue());
    }
}
