package p;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wrv0 implements UnaryOperator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jsv0 b;

    public /* synthetic */ wrv0(jsv0 jsv0Var, byte b) {
        this.a = b;
        this.b = jsv0Var;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b = this.a;
        jsv0 jsv0Var = this.b;
        switch (b) {
            case 0:
                break;
        }
        return ((yyp0) ((l270) obj)).a(jsv0Var);
    }
}
