package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r5h1 implements nma0 {
    public static final r5h1 a = new r5h1();
    public static final mf80 b = p6p1.l("kotlin.UShort", vz71.a);

    public final Object deserialize(dar darVar) {
        return new n5h1(darVar.w(b).C());
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.v(b).O(((n5h1) obj).a);
    }
}
