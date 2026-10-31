package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o5f0 implements nma0 {
    public static final o5f0 a = new o5f0();
    public static final qnw0 b = new qnw0("kotlin.Long", knw0.m);

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        return Long.valueOf(darVar.u());
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return b;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.z(((Number) obj).longValue());
    }
}
