package p;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fnr0 implements UnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p090 b;

    public /* synthetic */ fnr0(p090 p090Var, byte b) {
        this.a = b;
        this.b = p090Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        p090 p090Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ((l270) obj).b(p090Var);
    }
}
