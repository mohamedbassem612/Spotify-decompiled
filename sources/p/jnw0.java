package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class jnw0 extends j4h {
    public final inw0 b;

    public jnw0(nma0 nma0Var) {
        super(nma0Var);
        this.b = new inw0(nma0Var.getDescriptor());
    }

    @Override // p.l6
    public final Object a() {
        return (hnw0) g(j());
    }

    @Override // p.l6
    public final int b(Object obj) {
        return ((hnw0) obj).d();
    }

    @Override // p.l6
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p.l6, p.nma0
    public final Object deserialize(dar darVar) {
        return e(darVar, null);
    }

    @Override // p.nma0
    public final h661 getDescriptor() {
        return this.b;
    }

    @Override // p.l6
    public final Object h(Object obj) {
        return ((hnw0) obj).a();
    }

    @Override // p.j4h
    public final void i(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public Object j() {
        return new boolean[0];
    }

    public void k(z1k z1kVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.E(this.b, i2, zArr[i2]);
        }
    }

    @Override // p.j4h, p.nma0
    public final void serialize(uax uaxVar, Object obj) {
        int iD = d(obj);
        inw0 inw0Var = this.b;
        z1k z1kVarG0 = uaxVar.g0(inw0Var, iD);
        k(z1kVarG0, obj, iD);
        z1kVarG0.a(inw0Var);
    }
}
