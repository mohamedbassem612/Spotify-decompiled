package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lna1 {
    public final <T> nma0 serializer(final nma0 nma0Var) {
        return new pf40() { // from class: p.kna1
            private final h661 descriptor;

            {
                m0v0 m0v0Var = new m0v0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", this, 2);
                m0v0Var.j("keys", false);
                m0v0Var.j("values", false);
                this.descriptor = m0v0Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final nma0[] childSerializers() {
                return new nma0[]{mna1.c[0].getValue(), new r36(nma0Var, (byte) 0)};
            }

            public final Object deserialize(dar darVar) {
                h661 h661Var = this.descriptor;
                x1k x1kVarB = darVar.b(h661Var);
                znb0[] znb0VarArr = mna1.c;
                x1kVarB.getClass();
                boolean z = true;
                int i = 0;
                List list = null;
                List list2 = null;
                while (z) {
                    int iP = x1kVarB.p(h661Var);
                    if (iP == -1) {
                        z = false;
                    } else if (iP == 0) {
                        list = (List) x1kVarB.A(h661Var, 0, (nma0) znb0VarArr[0].getValue(), list);
                        i |= 1;
                    } else {
                        if (iP != 1) {
                            n9v.a(iP);
                            return null;
                        }
                        list2 = (List) x1kVarB.A(h661Var, 1, new r36(nma0Var, (byte) 0), list2);
                        i |= 2;
                    }
                }
                x1kVarB.a(h661Var);
                return new mna1(i, list, list2);
            }

            public final h661 getDescriptor() {
                return this.descriptor;
            }

            public final void serialize(uax uaxVar, Object obj) {
                mna1 mna1Var = (mna1) obj;
                h661 h661Var = this.descriptor;
                z1k z1kVarB = uaxVar.b(h661Var);
                z1kVarB.k(h661Var, 0, (nma0) mna1.c[0].getValue(), mna1Var.a);
                z1kVarB.k(h661Var, 1, new r36(nma0Var, (byte) 0), mna1Var.b);
                z1kVarB.a(h661Var);
            }

            public final nma0[] typeParametersSerializers() {
                return new nma0[]{nma0Var};
            }
        };
    }
}
