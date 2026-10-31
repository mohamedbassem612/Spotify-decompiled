package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ho80 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ io80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho80(io80 io80Var, byte b) {
        super(0);
        this.a = b;
        this.b = io80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.a;
        io80 io80Var = this.b;
        switch (b) {
            case 0:
                return (f961) io80Var.a.invoke();
            default:
                return (a8n) io80Var.a();
        }
    }
}
