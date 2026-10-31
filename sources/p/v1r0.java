package p;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v1r0 implements ttm0, abu0 {
    public final iu30 a;
    public final iu30 b;
    public final Function0 c;

    public v1r0(iu30 iu30Var, iu30 iu30Var2, Function0 function0) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = function0;
    }

    @Override // p.ttm0
    public final void a(zau0 zau0Var) {
        ttm0 ttm0Var = (ttm0) this.c.invoke();
        if (ttm0Var != null) {
            ttm0Var.a(zau0Var);
        }
    }

    @Override // p.ttm0
    public final boolean b(zau0 zau0Var) {
        ttm0 ttm0Var = (ttm0) this.c.invoke();
        if (ttm0Var != null) {
            return ttm0Var.b(zau0Var);
        }
        return false;
    }

    @Override // p.ttm0
    public final zau0 c(boolean z) {
        return (zau0) this.b.invoke(Boolean.valueOf(z));
    }

    @Override // p.ttm0
    public final void d() {
        throw new IllegalStateException("This multiplayer session is bound to the page and cannot be ended manually.");
    }

    @Override // p.abu0
    public final zau0 e(String str, boolean z) {
        return c(z);
    }

    @Override // p.abu0
    public final vm70 f(Context context) {
        return (vm70) this.a.invoke(context);
    }
}
