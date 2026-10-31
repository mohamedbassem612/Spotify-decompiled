package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ax81 extends b7 {
    public final jla0 b;
    public final List c;
    public final boolean d;
    public final List e;
    public final oma0 f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final tka0 t;

    public ax81(jla0 jla0Var, List list, boolean z, List list2, oma0 oma0Var, boolean z2, boolean z3, boolean z4, tka0 tka0Var, Function0 function0) {
        super(function0);
        this.b = jla0Var;
        this.c = list;
        this.d = z;
        this.e = list2;
        this.f = oma0Var;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.t = tka0Var;
    }

    @Override // p.b7
    public final b7 A(boolean z) {
        tka0 tka0VarB = this.b;
        if (tka0VarB instanceof tka0) {
            tka0VarB = tka0VarB;
            if (z) {
                tka0VarB = rc11.a.b(j2h1.t(tka0VarB));
            } else {
                Class clsU = j2h1.u(tka0VarB);
                if (clsU != null) {
                    tka0VarB = rc11.a.b(clsU);
                }
            }
        }
        return new ax81(tka0VarB, this.c, z, this.e, this.f, false, this.h, this.i, this.t, null);
    }

    @Override // p.b7
    public final b7 B() {
        return null;
    }

    @Override // p.b7
    public final oma0 e() {
        return this.f;
    }

    public final List getAnnotations() {
        return this.e;
    }

    @Override // p.oma0
    public final boolean i() {
        return this.d;
    }

    @Override // p.oma0
    public final jla0 k() {
        return this.b;
    }

    @Override // p.b7
    public final tka0 n() {
        return this.t;
    }

    @Override // p.b7
    public final boolean s() {
        return this.g;
    }

    @Override // p.b7
    public final boolean t() {
        return this.h;
    }

    @Override // p.oma0
    public final List v() {
        return this.c;
    }

    @Override // p.b7
    public final boolean w() {
        return false;
    }

    @Override // p.b7
    public final boolean x() {
        return this.i;
    }

    @Override // p.b7
    public final b7 y() {
        return null;
    }

    @Override // p.b7
    public final b7 z(boolean z) {
        return new ax81(this.b, this.c, this.d && !z, this.e, this.f, z, this.h, this.i, this.t, null);
    }

    public /* synthetic */ ax81(jla0 jla0Var, List list, boolean z, List list2, oma0 oma0Var, boolean z2, boolean z3, boolean z4, tka0 tka0Var) {
        this(jla0Var, list, z, list2, oma0Var, z2, z3, z4, tka0Var, null);
    }
}
