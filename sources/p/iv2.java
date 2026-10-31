package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iv2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ fv2 c;
    public final /* synthetic */ ev2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iv2(xu30 xu30Var, fv2 fv2Var, ev2 ev2Var, byte b) {
        super(0);
        this.a = b;
        this.b = xu30Var;
        this.c = fv2Var;
        this.d = ev2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ev2 ev2Var = this.d;
        fv2 fv2Var = this.c;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                xu30Var.invoke(fv2Var.a, Boolean.valueOf(ev2Var.d), ev2Var.a);
                break;
            default:
                xu30Var.invoke(fv2Var.a, Boolean.valueOf(ev2Var.d), ev2Var.a);
                break;
        }
        return rih1Var;
    }
}
