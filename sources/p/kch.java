package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kch implements o8n, Serializable {
    public final o8n a;
    public final m8n b;

    public kch(m8n m8nVar, o8n o8nVar) {
        this.a = o8nVar;
        this.b = m8nVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iB = b();
        o8n[] o8nVarArr = new o8n[iB];
        n811 n811Var = new n811();
        o(rih1.a, new f14(o8nVarArr, n811Var, (byte) 6));
        if (n811Var.a == iB) {
            return new jch(o8nVarArr);
        }
        eg.m("Check failed.");
        return null;
    }

    @Override // p.o8n
    public final m8n A(n8n n8nVar) {
        while (true) {
            m8n m8nVarA = this.b.A(n8nVar);
            if (m8nVarA != null) {
                return m8nVarA;
            }
            o8n o8nVar = this.a;
            if (!(o8nVar instanceof kch)) {
                return o8nVar.A(n8nVar);
            }
            this = (kch) o8nVar;
        }
    }

    @Override // p.o8n
    public final o8n C(n8n n8nVar) {
        m8n m8nVar = this.b;
        m8n m8nVarA = m8nVar.A(n8nVar);
        o8n o8nVar = this.a;
        if (m8nVarA != null) {
            return o8nVar;
        }
        o8n o8nVarC = o8nVar.C(n8nVar);
        if (o8nVarC == o8nVar) {
            return this;
        }
        return o8nVarC == o6x.a ? m8nVar : new kch(m8nVar, o8nVarC);
    }

    public final int b() {
        int i = 2;
        while (true) {
            o8n o8nVar = this.a;
            this = o8nVar instanceof kch ? (kch) o8nVar : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zJ;
        if (this == obj) {
            return true;
        }
        if (obj instanceof kch) {
            kch kchVar = (kch) obj;
            if (kchVar.b() == b()) {
                while (true) {
                    m8n m8nVar = this.b;
                    if (!u890.j(kchVar.A(m8nVar.getKey()), m8nVar)) {
                        zJ = false;
                        break;
                    }
                    o8n o8nVar = this.a;
                    if (!(o8nVar instanceof kch)) {
                        m8n m8nVar2 = (m8n) o8nVar;
                        zJ = u890.j(kchVar.A(m8nVar2.getKey()), m8nVar2);
                        break;
                    }
                    this = (kch) o8nVar;
                }
                if (zJ) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // p.o8n
    public final Object o(Object obj, vu30 vu30Var) {
        return vu30Var.invoke(this.a.o(obj, vu30Var), this.b);
    }

    public final String toString() {
        return gvg.k(new StringBuilder("["), (String) o("", new n75((byte) 10)), ']');
    }

    @Override // p.o8n
    public final /* bridge */ o8n y(o8n o8nVar) {
        return flo1.l(this, o8nVar);
    }
}
