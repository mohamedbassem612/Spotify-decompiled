package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u1s extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x1s b;
    public final /* synthetic */ si70 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1s(x1s x1sVar, si70 si70Var, byte b) {
        super(0);
        this.a = b;
        this.b = x1sVar;
        this.c = si70Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        si70 si70Var = this.c;
        x1s x1sVar = this.b;
        switch (b) {
            case 0:
                x1sVar.e.a(new ymo0(si70Var.d, 4));
                x1sVar.a.finish();
                break;
            default:
                x1sVar.e.a(new zmo0(si70Var.d, 4));
                x1sVar.a.finish();
                break;
        }
        return rih1Var;
    }
}
