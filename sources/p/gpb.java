package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gpb implements nma0 {
    public static final gpb a = new gpb();
    public static final qnw0 b = new qnw0("kotlin.Boolean", knw0.h);

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        return Boolean.valueOf(darVar.K());
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return b;
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.P(((Boolean) obj).booleanValue());
    }
}
