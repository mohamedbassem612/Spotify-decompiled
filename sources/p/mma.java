package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mma implements nma0 {
    public static final mma a = new mma();
    public static final qnw0 b = omo1.c("BetamaxCoercingFloat", knw0.l);

    public final Object deserialize(dar darVar) {
        ega0 ega0VarM = ((bga0) darVar).m();
        if (!(ega0VarM instanceof rga0)) {
            return Float.valueOf(Float.parseFloat(fga0.m(ega0VarM).b()));
        }
        uh61.j("Expected a float");
        return null;
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.S(((Number) obj).floatValue());
    }
}
