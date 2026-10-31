package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ene implements nma0 {
    public static final ene a = new ene();
    public static final qnw0 b = new qnw0("kotlin.Char", knw0.j);

    public final Object deserialize(dar darVar) {
        return Character.valueOf(darVar.N());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.U(((Character) obj).charValue());
    }
}
