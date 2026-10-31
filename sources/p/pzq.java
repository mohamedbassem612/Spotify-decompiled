package p;

import java.util.UUID;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pzq implements BiFunction {
    public static final pzq b = new pzq(0);
    public static final pzq c = new pzq(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ pzq(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                k3r k3rVar = (k3r) obj;
                k3r k3rVar2 = (k3r) obj2;
                return (!(k3rVar instanceof j3r) || (k3rVar2 instanceof j3r)) ? k3rVar2 : k3rVar;
            default:
                q480 q480Var = (q480) obj2;
                return q480Var != null ? new q480(q480Var.a, q480Var.b + 1) : new q480(UUID.randomUUID(), 0);
        }
    }
}
