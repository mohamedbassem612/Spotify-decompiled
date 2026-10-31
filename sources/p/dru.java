package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dru implements nma0 {
    public static final dru a = new dru();
    public static final qnw0 b = new qnw0("kotlin.Double", knw0.k);

    public final Object deserialize(dar darVar) {
        return Double.valueOf(darVar.H());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.h(((Number) obj).doubleValue());
    }
}
