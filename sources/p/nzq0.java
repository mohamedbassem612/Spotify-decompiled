package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nzq0 extends wiy0 {
    public int X;

    public nzq0(ghy0 ghy0Var, yiy0 yiy0Var, h661 h661Var) {
        super(ghy0Var, yiy0Var, h661Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final x1k b(h661 h661Var) throws SerializationException {
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + h661Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final String b1(long j) throws SerializationException {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    public final long e1(h661 h661Var, int i) {
        return 19500L;
    }

    public final int p(h661 h661Var) {
        if (((wiy0) this).d.d()) {
            return -1;
        }
        int i = this.X;
        this.X = i + 1;
        return i;
    }
}
