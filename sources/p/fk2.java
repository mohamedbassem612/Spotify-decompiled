package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fk2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cn2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk2(cn2 cn2Var, byte b) {
        super(0);
        this.a = b;
        this.b = cn2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        cn2 cn2Var = this.b;
        switch (b) {
            case 0:
                cn2Var.a().m(cn2Var.c.e(), (xj61) null);
                return rih1.a;
            default:
                return (i8h1) cn2Var.a.get();
        }
    }
}
