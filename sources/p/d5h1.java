package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d5h1 implements nma0 {
    public static final d5h1 a = new d5h1();
    public static final mf80 b = p6p1.l("kotlin.ULong", o5f0.a);

    public final Object deserialize(dar darVar) {
        return new z4h1(darVar.w(b).u());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.v(b).z(((z4h1) obj).a);
    }
}
