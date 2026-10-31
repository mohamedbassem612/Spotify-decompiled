package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ze60 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af60 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze60(af60 af60Var, byte b) {
        super(0);
        this.a = b;
        this.b = af60Var;
    }

    public final Object invoke() {
        byte b = this.a;
        af60 af60Var = this.b;
        switch (b) {
            case 0:
                return new pe60(af60Var.e(), af60Var.b, af60Var.a, af60Var.c);
            default:
                return (pe60) af60Var.f.getValue();
        }
    }
}
