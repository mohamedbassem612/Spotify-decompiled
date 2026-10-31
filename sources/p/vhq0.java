package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vhq0 extends wiy0 {
    public boolean X;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final x1k b(h661 h661Var) throws SerializationException {
        yoi1 kind = h661Var.getKind();
        if (!u890.j(kind, uic1.h) && !u890.j(kind, uic1.j) && !(kind instanceof scv0)) {
            throw new SerializationException("Type " + h661Var.getKind() + " cannot be directly child of oneof element");
        }
        long jL0 = l0();
        if (jL0 == 19500 && u890.j(((wiy0) this).e, h661Var)) {
            return this;
        }
        if (sio1.w(jL0)) {
            uh61.j("An oneof element cannot be directly child of another oneof element");
            return null;
        }
        yiy0 yiy0Var = ((wiy0) this).d;
        return new wiy0(((wiy0) this).c, new yiy0(jL0 == 19500 ? yiy0Var.f() : yiy0Var.e()), h661Var);
    }

    public final int p(h661 h661Var) {
        if (this.X) {
            return -1;
        }
        this.X = true;
        return 0;
    }
}
