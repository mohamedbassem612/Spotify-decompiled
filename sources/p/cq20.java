package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cq20 extends b7 {
    public final b7 b;
    public final b7 c;
    public final boolean d;

    public cq20(b7 b7Var, b7 b7Var2, boolean z, Function0 function0) {
        super(function0);
        this.b = b7Var;
        this.c = b7Var2;
        this.d = z;
    }

    @Override // p.b7
    public final b7 A(boolean z) {
        b7 b7VarA = this.b.A(z);
        b7 b7VarA2 = this.c.A(z);
        return b7VarA.equals(b7VarA2) ? b7VarA : new cq20(b7VarA, b7VarA2, this.d, null);
    }

    @Override // p.b7
    public final b7 B() {
        return this.c;
    }

    @Override // p.b7
    public final oma0 e() {
        return null;
    }

    public final List getAnnotations() {
        return this.b.getAnnotations();
    }

    @Override // p.oma0
    public final boolean i() {
        return this.b.i();
    }

    @Override // p.oma0
    public final jla0 k() {
        return this.b.k();
    }

    @Override // p.b7
    public final tka0 n() {
        return this.b.n();
    }

    @Override // p.b7
    public final boolean s() {
        return false;
    }

    @Override // p.b7
    public final boolean t() {
        return false;
    }

    @Override // p.oma0
    public final List v() {
        return this.b.v();
    }

    @Override // p.b7
    public final boolean w() {
        return this.d;
    }

    @Override // p.b7
    public final boolean x() {
        return false;
    }

    @Override // p.b7
    public final b7 y() {
        return this.b;
    }

    @Override // p.b7
    public final b7 z(boolean z) {
        b7 b7VarZ = this.b.z(z);
        b7 b7VarZ2 = this.c.z(z);
        return b7VarZ.equals(b7VarZ2) ? b7VarZ : new cq20(b7VarZ, b7VarZ2, this.d, null);
    }
}
