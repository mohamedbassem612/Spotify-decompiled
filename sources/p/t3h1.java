package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t3h1 implements nma0 {
    public static final t3h1 a = new t3h1();
    public static final mf80 b = p6p1.l("kotlin.UByte", sgc.a);

    public final Object deserialize(dar darVar) {
        return new p3h1(darVar.w(b).c0());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.v(b).j(((p3h1) obj).a);
    }
}
