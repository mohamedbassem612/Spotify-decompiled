package p;

import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qs31 implements js31 {
    public final Intent a;
    public final th61 b;

    public qs31(Intent intent, th61 th61Var) {
        this.a = intent;
        this.b = th61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs31)) {
            return false;
        }
        qs31 qs31Var = (qs31) obj;
        return u890.j(this.a, qs31Var.a) && u890.j(this.b, qs31Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
