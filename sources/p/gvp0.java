package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gvp0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ivp0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvp0(ivp0 ivp0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ivp0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        jum1 jum1Var = jum1.b;
        ivp0 ivp0Var = this.b;
        switch (b) {
            case 0:
                return ivp0Var.a(f46.S0(new jum1[]{jum1.a, jum1.c, jum1.d, jum1Var}));
            case 1:
                return ivp0Var.a(Collections.singleton(jum1Var));
            default:
                xrc0 xrc0Var = (xrc0) ((p410) ((g1i) ((xwp) ivp0Var.b.get()).a.c).b).d;
                c8o.l(xrc0Var);
                return new tdz(xrc0Var);
        }
    }
}
