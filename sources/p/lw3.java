package p;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lw3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw3(AtomicBoolean atomicBoolean, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = atomicBoolean;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
            case 0:
                atomicBoolean.set(true);
                ((iu30) ven0Var.getValue()).invoke(bx3.a);
                break;
            default:
                atomicBoolean.set(true);
                ((iu30) ven0Var.getValue()).invoke(dx3.a);
                break;
        }
        return rih1Var;
    }
}
