package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uwm0 {
    public final lfb0 a;
    public final b291 b;
    public mmr0 c = new mmr0("", (Object) null);

    public uwm0(lfb0 lfb0Var, b291 b291Var) {
        this.a = lfb0Var;
        this.b = b291Var;
    }

    public final tv80 a(String str, Function0 function0) {
        Object obj;
        if (u890.j(this.c.a, str) && (obj = this.c.b) != null) {
            return (tv80) obj;
        }
        tv80 tv80Var = (tv80) function0.invoke();
        this.c = new mmr0(str, tv80Var);
        return tv80Var;
    }
}
