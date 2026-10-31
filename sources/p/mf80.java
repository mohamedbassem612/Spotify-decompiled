package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mf80 extends m0v0 {
    public final boolean m;

    public mf80(String str, pf40 pf40Var) {
        super(str, pf40Var, 1);
        this.m = true;
    }

    @Override // p.m0v0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mf80) {
            h661 h661Var = (h661) obj;
            if (this.a.equals(h661Var.h())) {
                mf80 mf80Var = (mf80) obj;
                if (mf80Var.m && Arrays.equals((h661[]) this.k.getValue(), (h661[]) mf80Var.k.getValue())) {
                    int iD = h661Var.d();
                    int i = this.c;
                    if (i == iD) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (u890.j(g(i2).h(), h661Var.g(i2).h()) && u890.j(g(i2).getKind(), h661Var.g(i2).getKind())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p.m0v0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p.h661
    public final boolean isInline() {
        return this.m;
    }
}
