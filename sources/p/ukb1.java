package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ukb1 implements nma0 {
    public static final ukb1 a = new ukb1();
    public static final h661 b = tkb1.Companion.serializer().getDescriptor();

    public final Object deserialize(dar darVar) {
        tkb1 tkb1Var = (tkb1) darVar.Y(tkb1.Companion.serializer());
        return new qkb1(tkb1Var.a, tkb1Var.b);
    }

    public final h661 getDescriptor() {
        return b;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qkb1 qkb1Var = (qkb1) obj;
        uaxVar.i(tkb1.Companion.serializer(), new tkb1(qkb1Var.a, qkb1Var.b));
    }
}
