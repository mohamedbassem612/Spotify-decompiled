package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p380 implements Serializable {
    public final q380 a;

    public p380(q380 q380Var) {
        this.a = q380Var;
    }

    public Object readResolve() {
        return this.a.m();
    }
}
