package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hga0 implements nma0 {
    public static final hga0 a = new hga0();
    public static final j661 b = omo1.k("kotlinx.serialization.json.JsonElement", rcv0.h, new h661[0], new ia4((byte) 9));

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        return dem1.t(darVar).m();
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return b;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        ega0 ega0Var = (ega0) obj;
        dem1.s(uaxVar);
        if (ega0Var instanceof aha0) {
            uaxVar.i(dha0.a, ega0Var);
            return;
        }
        if (ega0Var instanceof uga0) {
            uaxVar.i(xga0.a, ega0Var);
        } else if (ega0Var instanceof pfa0) {
            uaxVar.i(sfa0.a, ega0Var);
        } else {
            eg.o();
        }
    }
}
