package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class hab0 implements jv30, Serializable {
    private final int arity;

    public hab0(int i) {
        this.arity = i;
    }

    @Override // p.jv30
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        return rc11.a.l(this);
    }
}
