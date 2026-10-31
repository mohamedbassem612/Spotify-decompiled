package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q6q0 {
    public final String a;
    public final ou80 b;
    public final Bundle c;

    public q6q0(String str, ou80 ou80Var, Bundle bundle) {
        this.a = str;
        this.b = ou80Var;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6q0)) {
            return false;
        }
        q6q0 q6q0Var = (q6q0) obj;
        return u890.j(this.a, q6q0Var.a) && u890.j(this.b, q6q0Var.b) && this.c.equals(q6q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b.a);
    }
}
