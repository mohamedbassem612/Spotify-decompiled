package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qnw0 implements h661 {
    public final String a;
    public final mnw0 b;

    public qnw0(String str, mnw0 mnw0Var) {
        this.a = str;
        this.b = mnw0Var;
    }

    public final void a() {
        throw new IllegalStateException(l1d.n(this.a, " does not have elements", new StringBuilder("Primitive descriptor ")));
    }

    @Override // p.h661
    public final int c(String str) {
        a();
        throw null;
    }

    @Override // p.h661
    public final int d() {
        return 0;
    }

    @Override // p.h661
    public final String e(int i) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnw0)) {
            return false;
        }
        qnw0 qnw0Var = (qnw0) obj;
        return this.a.equals(qnw0Var.a) && u890.j(this.b, qnw0Var.b);
    }

    @Override // p.h661
    public final List f(int i) {
        a();
        throw null;
    }

    @Override // p.h661
    public final h661 g(int i) {
        a();
        throw null;
    }

    @Override // p.h661
    public final yoi1 getKind() {
        return this.b;
    }

    @Override // p.h661
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // p.h661
    public final boolean i(int i) {
        a();
        throw null;
    }

    public final String toString() {
        return gvg.k(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
