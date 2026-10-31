package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class chc1 implements nma0 {
    public static final chc1 a = new chc1();
    public static final qnw0 b = new qnw0("kotlin.String", knw0.o);

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        return darVar.V();
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return b;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h0((String) obj);
    }
}
