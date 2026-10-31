package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hma implements nma0 {
    public static final hma a = new hma();
    public static final qnw0 b = omo1.c("BetamaxBoolean", knw0.h);

    public final Object deserialize(dar darVar) {
        aha0 aha0VarM = fga0.m(((bga0) darVar).m());
        if (!aha0VarM.c() && fga0.f(aha0VarM) != null) {
            return Boolean.valueOf(fga0.e(aha0VarM));
        }
        uh61.j("Expected a boolean");
        return null;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.P(((Boolean) obj).booleanValue());
    }
}
