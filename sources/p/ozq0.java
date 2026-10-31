package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ozq0 extends c6o0 {
    public ozq0(long j, vyq0 vyq0Var, ghy0 ghy0Var, h661 h661Var) {
        super(ghy0Var, vyq0Var, j, h661Var, new jgc());
    }

    public final void W0(long j, String str) {
        throw new SerializationException("Packing only supports primitive number types");
    }

    public final void X0(h661 h661Var) {
        if (((c6o0) this).i.b > 0) {
            super.X0(h661Var);
        }
    }

    public final long Y0(h661 h661Var, int i) {
        return 19500L;
    }

    public final z1k b(h661 h661Var) {
        throw new SerializationException("Packing only supports primitive number types");
    }

    public final z1k g0(h661 h661Var, int i) {
        throw new SerializationException("Packing only supports primitive number types");
    }
}
