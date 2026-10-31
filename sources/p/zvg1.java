package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zvg1 implements nma0 {
    public final nma0 a;
    public final nma0 b;
    public final nma0 c;
    public final j661 d = omo1.i("kotlin.Triple", new h661[0], new w7d1(this, (byte) 14));

    public zvg1(nma0 nma0Var, nma0 nma0Var2, nma0 nma0Var3) {
        this.a = nma0Var;
        this.b = nma0Var2;
        this.c = nma0Var3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final Object deserialize(dar darVar) throws SerializationException {
        j661 j661Var = this.d;
        x1k x1kVarB = darVar.b(j661Var);
        x1kVarB.getClass();
        Object obj = hno1.a;
        Object objA = obj;
        Object objA2 = objA;
        Object objA3 = objA2;
        while (true) {
            int iP = x1kVarB.p(j661Var);
            if (iP == -1) {
                x1kVarB.a(j661Var);
                if (objA == obj) {
                    uh61.j("Element 'first' is missing");
                    return null;
                }
                if (objA2 == obj) {
                    uh61.j("Element 'second' is missing");
                    return null;
                }
                if (objA3 != obj) {
                    return new yvg1(objA, objA2, objA3);
                }
                uh61.j("Element 'third' is missing");
                return null;
            }
            if (iP == 0) {
                objA = x1kVarB.A(j661Var, 0, this.a, (Object) null);
            } else if (iP == 1) {
                objA2 = x1kVarB.A(j661Var, 1, this.b, (Object) null);
            } else {
                if (iP != 2) {
                    uh61.j(f4i1.c(iP, "Unexpected index "));
                    return null;
                }
                objA3 = x1kVarB.A(j661Var, 2, this.c, (Object) null);
            }
        }
    }

    public final h661 getDescriptor() {
        return this.d;
    }

    public final void serialize(uax uaxVar, Object obj) {
        yvg1 yvg1Var = (yvg1) obj;
        j661 j661Var = this.d;
        z1k z1kVarB = uaxVar.b(j661Var);
        z1kVarB.k(j661Var, 0, this.a, yvg1Var.a);
        z1kVarB.k(j661Var, 1, this.b, yvg1Var.b);
        z1kVarB.k(j661Var, 2, this.c, yvg1Var.c);
        z1kVarB.a(j661Var);
    }
}
