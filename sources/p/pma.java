package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pma implements nma0 {
    public static final pma a = new pma();
    public static final qnw0 b = omo1.c("BetamaxCoercingString", knw0.o);

    public final Object deserialize(dar darVar) {
        ega0 ega0VarM = ((bga0) darVar).m();
        if (ega0VarM instanceof rga0) {
            uh61.j("Expected a string");
            return null;
        }
        aha0 aha0VarM = fga0.m(ega0VarM);
        if (aha0VarM.c() || nhc1.a0(aha0VarM.b()) != null) {
            return aha0VarM.b();
        }
        uh61.j("Expected a string");
        return null;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0((String) obj);
    }
}
