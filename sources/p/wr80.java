package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wr80 implements nma0 {
    public static final wr80 a = new wr80();
    public static final qnw0 b = new qnw0("kotlin.Int", lnw0.h);

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        return Integer.valueOf(darVar.n());
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return b;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.a0(((Number) obj).intValue());
    }
}
