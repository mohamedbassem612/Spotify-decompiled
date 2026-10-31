package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hkk1 implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jkk1 b;

    public /* synthetic */ hkk1(jkk1 jkk1Var, byte b) {
        this.a = b;
        this.b = jkk1Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        jkk1 jkk1Var = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                num.getClass();
                jkk1Var.l.c(jkk1.t[0], jkk1Var, num);
                break;
            default:
                Function0 function0 = (Function0) obj;
                function0.getClass();
                jkk1Var.p.c(jkk1.t[3], jkk1Var, function0);
                break;
        }
    }
}
