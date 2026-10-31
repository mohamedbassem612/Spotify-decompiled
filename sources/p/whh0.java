package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class whh0 {
    public final vsr0 a;
    public final Bundle b;

    public whh0(vsr0 vsr0Var, Bundle bundle) {
        this.a = vsr0Var;
        this.b = bundle;
    }

    public final Bundle a() {
        return this.b;
    }

    public final vsr0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whh0)) {
            return false;
        }
        whh0 whh0Var = (whh0) obj;
        return this.a.equals(whh0Var.a) && this.b.equals(whh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
