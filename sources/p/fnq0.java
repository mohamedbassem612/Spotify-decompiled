package p;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fnq0 implements BiFunction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fnq0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                enq0 enq0Var = (enq0) obj2;
                if (enq0Var.b == this.b) {
                    return null;
                }
                return enq0Var;
            case 1:
                r811 r811Var = (r811) obj2;
                if (r811Var == null) {
                    return null;
                }
                if (!(r811Var.b instanceof j3r) || (((k3r) this.b) instanceof j3r)) {
                    r811Var.b = (k3r) this.b;
                }
                return r811Var;
            default:
                gxc gxcVar = (gxc) obj2;
                ((iu30) this.b).invoke(gxcVar.b);
                return gxcVar;
        }
    }
}
