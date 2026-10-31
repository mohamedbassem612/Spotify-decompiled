package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ssm0 implements b8r0 {
    public final pbq a;
    public boolean b;

    public ssm0(u1r0 u1r0Var, iac0 iac0Var, bbr0 bbr0Var, Function0 function0, b7r0 b7r0Var) {
        this.a = u1r0Var.a(iac0Var, bbr0Var, function0, b7r0Var);
    }

    @Override // p.b8r0
    public final Object f(Class cls) {
        boolean zEquals = cls.equals(ttm0.class);
        pbq pbqVar = this.a;
        if (zEquals) {
            return pbqVar.L();
        }
        if (cls.equals(abu0.class)) {
            return pbqVar.L();
        }
        hhg1.o(cls, "Unsupported logger class: ");
        return null;
    }
}
