package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rl80 implements tl80 {
    public final View a;
    public final zl80 b;

    public rl80(View view, zl80 zl80Var) {
        this.a = view;
        this.b = zl80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl80)) {
            return false;
        }
        rl80 rl80Var = (rl80) obj;
        return this.a.equals(rl80Var.a) && this.b == rl80Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
