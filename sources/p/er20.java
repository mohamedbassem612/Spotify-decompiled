package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class er20 implements nma0 {
    public static final er20 a = new er20();
    public static final qnw0 b = new qnw0("kotlin.Float", knw0.l);

    public final Object deserialize(dar darVar) {
        return Float.valueOf(darVar.F());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.S(((Number) obj).floatValue());
    }
}
