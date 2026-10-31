package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u9n implements nma0 {
    public static final u9n a = new u9n();
    public static final nma0 b;
    public static final h661 c;

    static {
        nma0 nma0VarSerializer = u661.Companion.serializer();
        b = nma0VarSerializer;
        c = nma0VarSerializer.getDescriptor();
    }

    public final Object deserialize(dar darVar) {
        u661 u661Var = (u661) darVar.Y(b);
        return new t9n(u661Var.a, u661Var.b);
    }

    public final h661 getDescriptor() {
        return c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        t9n t9nVar = (t9n) obj;
        uaxVar.i(b, new u661(t9nVar.a, t9nVar.b));
    }
}
