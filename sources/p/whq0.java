package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class whq0 extends xiy0 {
    public final vyq0 g;

    public whq0(ghy0 ghy0Var, vyq0 vyq0Var, h661 h661Var) {
        super(ghy0Var, vyq0Var, h661Var);
        this.g = vyq0Var;
        if (h661Var.getKind() instanceof scv0) {
            return;
        }
        k220.l("The serializer of one of type ", h661Var.h(), " should be using generic polymorphic serializer, but got ", h661Var.getKind(), 46);
        throw null;
    }

    @Override // p.xiy0
    public final void W0(long j, String str) {
        if (j != 19501) {
            super.W0(j, str);
        }
    }

    @Override // p.xiy0
    public final long Y0(h661 h661Var, int i) {
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return sio1.s(h661Var, i);
        }
        StringBuilder sbR = cy30.r(i, "Unsupported index: ", " in a oneOf type ");
        sbR.append(h661Var.h());
        sbR.append(", which should be using generic polymorphic serializer");
        throw new SerializationException(sbR.toString());
    }

    @Override // p.xiy0, p.uax
    public final z1k b(h661 h661Var) {
        return h661Var.equals(this.f) ? this : new uhq0(this.d, this.g, h661Var);
    }

    @Override // p.xiy0, p.uax
    public final uax v(h661 h661Var) {
        z0(sio1.A((int) (sio1.s(h661Var, 0) & 2147483647L), w0()));
        return this;
    }
}
