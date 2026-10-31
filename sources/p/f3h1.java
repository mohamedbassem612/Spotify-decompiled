package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f3h1 implements ztw {
    public final l6h1 a;
    public final i8h1 b;
    public final n7h1 c;
    public boolean d;
    public j6h1 e;
    public t480 f;
    public l7h1 g;
    public r6h1 h;
    public final o4t i = new o4t();

    public f3h1(l6h1 l6h1Var, n7h1 n7h1Var, i8h1 i8h1Var) {
        this.a = l6h1Var;
        this.b = i8h1Var;
        this.c = n7h1Var;
    }

    @Override // p.ztw
    public final boolean a() {
        return (this.e == null && this.f == null) ? false : true;
    }

    @Override // p.ztw
    public final tqw b(Object obj) {
        if (!(obj instanceof w7h1)) {
            hhg1.n("The interaction model should be UbiInteractionEvent or UbiOpaqueInteractionResult");
            return null;
        }
        xj61 xj61VarA = this.i.a();
        return i3o1.k(rc11.a.b(tv80.class), this.b.m((w7h1) obj, xj61VarA));
    }

    @Override // p.ztw
    public final void c(int i, op80 op80Var, Function0 function0) {
        l7h1 l7h1Var;
        t480 t480Var;
        uar0 uar0VarK;
        var0 var0Var;
        o4t o4tVar = this.i;
        o4tVar.g(i);
        uba ubaVar = this.c;
        if (ubaVar == null) {
            boolean z = this.d;
            l6h1 l6h1Var = this.a;
            if (z || i < 50) {
                if (!z || i >= 50) {
                    return;
                }
                j6h1 j6h1Var = this.e;
                if (j6h1Var != null) {
                    l6h1Var.k(j6h1Var);
                    this.e = null;
                }
                this.e = null;
                this.d = false;
                o4tVar.d();
                return;
            }
            Object objInvoke = function0.invoke();
            if (objInvoke != null) {
                if (objInvoke instanceof l7h1) {
                    this.b.f((l7h1) objInvoke, Collections.singleton(w2h1.b));
                } else {
                    if (!(objInvoke instanceof k6h1)) {
                        eg.m("Unknown impression type! UBI impressions are required!");
                        return;
                    }
                    this.e = l6h1Var.d((k6h1) objInvoke);
                }
            }
            this.d = true;
            o4tVar.c();
            return;
        }
        if (i >= 50 || this.f != null || this.d) {
            Object objInvoke2 = function0.invoke();
            if (objInvoke2 == null) {
                t480 t480Var2 = this.f;
                if (t480Var2 != null) {
                    ubaVar.o(t480Var2, o4t.b(i));
                }
                this.f = null;
                this.g = null;
                this.h = null;
                if (this.d) {
                    this.d = false;
                    o4tVar.d();
                    return;
                }
                return;
            }
            if (objInvoke2 instanceof l7h1) {
                l7h1Var = (l7h1) objInvoke2;
            } else {
                if (!(objInvoke2 instanceof k6h1)) {
                    eg.m("Unknown impression type! UBI impressions are required!");
                    return;
                }
                l7h1Var = ((k6h1) objInvoke2).a;
            }
            r6h1 r6h1Var = (op80Var == null || (uar0VarK = oqn1.k(op80Var)) == null || (var0Var = uar0VarK.b) == null) ? null : var0Var.b;
            r6h1 r6h1Var2 = this.h;
            boolean z2 = (r6h1Var2 == null || u890.j(r6h1Var, r6h1Var2)) ? false : true;
            this.h = r6h1Var;
            if (z2 && (t480Var = this.f) != null) {
                uba ubaVar2 = ubaVar;
                ubaVar2.o(t480Var, o4t.b(i));
                this.f = ubaVar2.p(l7h1Var, o4t.b(i));
                return;
            }
            l7h1 l7h1Var2 = this.g;
            if (l7h1Var2 != null && !u890.j(l7h1Var, l7h1Var2) && this.d && i >= 50) {
                t480 t480Var3 = this.f;
                if (t480Var3 != null) {
                    ubaVar.o(t480Var3, o4t.b(i));
                }
                this.f = ubaVar.p(l7h1Var, o4t.b(i));
                this.g = l7h1Var;
                this.d = true;
                o4tVar.c();
                return;
            }
            boolean z3 = this.d;
            if (!z3 && i >= 50 && this.f == null) {
                this.f = ubaVar.p(l7h1Var, o4t.b(i));
                this.g = l7h1Var;
                this.d = true;
                o4tVar.c();
                return;
            }
            if (!z3 || i >= 50) {
                return;
            }
            t480 t480Var4 = this.f;
            if (t480Var4 != null) {
                ubaVar.o(t480Var4, o4t.b(i));
            }
            this.f = null;
            this.d = false;
            o4tVar.d();
        }
    }
}
