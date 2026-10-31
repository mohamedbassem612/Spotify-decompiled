package p;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mdz0 implements BiFunction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ai9 b;

    public /* synthetic */ mdz0(ai9 ai9Var, byte b) {
        this.a = b;
        this.b = ai9Var;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        ai9 ai9Var = this.b;
        switch (b) {
            case 0:
                edz0 edz0Var = (edz0) obj2;
                if (edz0Var != null) {
                    obj3 = edz0Var.a == ai9Var ? edz0Var : null;
                    if (obj3 != null) {
                        return obj3;
                    }
                }
                return new edz0(ai9Var);
            default:
                fdz0 fdz0Var = (fdz0) obj2;
                if (fdz0Var != null) {
                    obj3 = fdz0Var.a == ai9Var ? fdz0Var : null;
                    if (obj3 != null) {
                        return obj3;
                    }
                }
                return new fdz0(ai9Var);
        }
    }
}
