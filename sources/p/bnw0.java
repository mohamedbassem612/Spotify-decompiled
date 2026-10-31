package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bnw0 implements dnw0 {
    public final xzq a;
    public final kpg0 b;

    public bnw0(xzq xzqVar, kpg0 kpg0Var) {
        this.a = xzqVar;
        this.b = kpg0Var;
    }

    @Override // p.dnw0
    public final List a() {
        return p7h.M(new maa[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnw0)) {
            return false;
        }
        bnw0 bnw0Var = (bnw0) obj;
        return this.a == bnw0Var.a && this.b == bnw0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
