package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ddi1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ edi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddi1(edi1 edi1Var, byte b) {
        super(0);
        this.a = b;
        this.b = edi1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        edi1 edi1Var = this.b;
        switch (b) {
            case 0:
                return new b7l0(edi1Var.b.b());
            default:
                return (i8h1) edi1Var.a.get();
        }
    }
}
