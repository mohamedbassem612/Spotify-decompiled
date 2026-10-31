package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kvq0 {
    public final Class a;
    public final Bundle b;

    public kvq0(Bundle bundle, Class cls) {
        this.a = cls;
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvq0)) {
            return false;
        }
        kvq0 kvq0Var = (kvq0) obj;
        return u890.j(this.a, kvq0Var.a) && u890.j(this.b, kvq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
