package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nma implements nma0 {
    public static final nma a = new nma();
    public static final qnw0 b = omo1.c("BetamaxCoercingInt", lnw0.h);

    public final Object deserialize(dar darVar) {
        return Integer.valueOf(fga0.i(fga0.m(((bga0) darVar).m())));
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.a0(((Number) obj).intValue());
    }
}
