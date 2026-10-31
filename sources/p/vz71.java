package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vz71 implements nma0 {
    public static final vz71 a = new vz71();
    public static final qnw0 b = new qnw0("kotlin.Short", knw0.n);

    public final Object deserialize(dar darVar) {
        return Short.valueOf(darVar.C());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.O(((Number) obj).shortValue());
    }
}
