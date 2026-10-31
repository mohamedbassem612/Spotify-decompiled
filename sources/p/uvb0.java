package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uvb0 implements crl1 {
    public Function0 a;
    public hrr0 b;
    public final hrr0 c = xto.t(Boolean.FALSE);

    public final long a() {
        jdt jdtVar;
        hrr0 hrr0VarT = this.b;
        if (hrr0VarT == null) {
            Function0 function0 = this.a;
            if (function0 == null || (jdtVar = (jdt) function0.invoke()) == null) {
                jdtVar = jdt.c;
            }
            hrr0VarT = xto.t(jdtVar);
            this.b = hrr0VarT;
            this.a = null;
        }
        return ((jdt) hrr0VarT.getValue()).a();
    }

    public final boolean b() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
