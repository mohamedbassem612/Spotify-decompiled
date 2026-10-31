package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sgc implements nma0 {
    public static final sgc a = new sgc();
    public static final qnw0 b = new qnw0("kotlin.Byte", knw0.i);

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        return Byte.valueOf(darVar.c0());
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return b;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.j(((Number) obj).byteValue());
    }
}
