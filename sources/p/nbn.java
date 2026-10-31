package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nbn implements nma0 {
    public static final nbn a = new nbn();
    public static final nma0 b;
    public static final h661 c;

    static {
        nma0 nma0VarSerializer = y661.Companion.serializer();
        b = nma0VarSerializer;
        c = nma0VarSerializer.getDescriptor();
    }

    public final Object deserialize(dar darVar) {
        t9n[] t9nVarArr;
        if (!(darVar instanceof bga0)) {
            hhg1.n("Failed requirement.");
            return null;
        }
        bga0 bga0Var = (bga0) darVar;
        ega0 ega0VarM = bga0Var.m();
        if (ega0VarM instanceof pfa0) {
            nfa0 nfa0VarD = bga0Var.d();
            r36 r36Var = new r36(t9n.Companion.serializer(), (byte) 0);
            nfa0VarD.getClass();
            t9nVarArr = (t9n[]) ((Collection) hon1.z(nfa0VarD, ega0VarM, r36Var)).toArray(new t9n[0]);
        } else {
            nfa0 nfa0VarD2 = bga0Var.d();
            nma0 nma0Var = b;
            nfa0VarD2.getClass();
            t9nVarArr = ((y661) hon1.z(nfa0VarD2, ega0VarM, nma0Var)).a;
        }
        mbn mbnVar = new mbn();
        mbnVar.a = t9nVarArr;
        return mbnVar;
    }

    public final h661 getDescriptor() {
        return c;
    }

    public final void serialize(uax uaxVar, Object obj) {
        uaxVar.i(b, new y661(((mbn) obj).a));
    }
}
