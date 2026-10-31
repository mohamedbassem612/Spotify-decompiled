package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class f9 implements nma0 {
    public nma0 a(x1k x1kVar, String str) {
        return x1kVar.c().r(str, c());
    }

    public nma0 b(uax uaxVar, Object obj) {
        return uaxVar.c().s(c(), obj);
    }

    public abstract tka0 c();

    @Override // p.nma0
    public final Object deserialize(dar darVar) {
        h661 descriptor = getDescriptor();
        x1k x1kVarB = darVar.b(descriptor);
        x1kVarB.getClass();
        Object objA = null;
        String strF = null;
        while (true) {
            int iP = x1kVarB.p(getDescriptor());
            if (iP == -1) {
                if (objA != null) {
                    x1kVarB.a(descriptor);
                    return objA;
                }
                hhg1.f(l1d.m("Polymorphic value has not been read for class ", strF));
                return null;
            }
            if (iP == 0) {
                strF = x1kVarB.f(getDescriptor(), iP);
            } else {
                if (iP != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    if (strF == null) {
                        strF = "unknown class";
                    }
                    sb.append(strF);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iP);
                    throw new SerializationException(sb.toString());
                }
                if (strF == null) {
                    hhg1.n("Cannot read polymorphic value before its type token");
                    return null;
                }
                objA = x1kVarB.A(getDescriptor(), iP, n9p1.n(this, x1kVarB, strF), null);
            }
        }
    }

    @Override // p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        nma0 nma0VarO = n9p1.o(this, uaxVar, obj);
        h661 descriptor = getDescriptor();
        z1k z1kVarB = uaxVar.b(descriptor);
        z1kVarB.G(getDescriptor(), 0, nma0VarO.getDescriptor().h());
        z1kVarB.k(getDescriptor(), 1, nma0VarO, obj);
        z1kVarB.a(descriptor);
    }
}
