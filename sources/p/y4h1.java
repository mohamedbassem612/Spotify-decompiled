package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y4h1 implements nma0 {
    public static final y4h1 a = new y4h1();
    public static final mf80 b = p6p1.l("kotlin.UInt", wr80.a);

    public final Object deserialize(dar darVar) {
        return new u4h1(darVar.w(b).n());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.v(b).a0(((u4h1) obj).a);
    }
}
